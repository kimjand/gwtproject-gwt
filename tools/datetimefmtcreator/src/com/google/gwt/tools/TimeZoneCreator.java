package com.google.gwt.tools;

import com.google.gson.Gson;
import com.google.gwt.i18n.client.constants.TimeZoneConstants;
import com.ibm.icu.util.BasicTimeZone;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.TimeZoneRule;
import com.ibm.icu.util.TimeZoneTransition;
import org.unicode.cldr.util.CLDRFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class TimeZoneCreator {
  static public class TZGenerator {
    private final File dst;
    private final Gson gson = new Gson();
    static private final Map<String, String> specialCases = new HashMap<>();

    static {
      specialCases.put("africaDaresSalaam", "Africa/Dar_es_Salaam");
      specialCases.put("africaPortoNovo", "Africa/Porto-Novo");
      specialCases.put("americaArgentinaLaRioja", "America/Argentina/La_Rioja");
      specialCases.put("americaArgentinaRioGallegos", "America/Argentina/Rio_Gallegos");
      specialCases.put("americaArgentinaSalta", "America/Argentina/Salta");
      specialCases.put("americaArgentinaSanJuan", "America/Argentina/San_Juan");
      specialCases.put("americaArgentinaSanLuis", "America/Argentina/San_Luis");
      specialCases.put("americaArgentinaTucuman", "America/Argentina/Tucuman");
      specialCases.put("americaArgentinaUshuaia", "America/Argentina/Ushuaia");
      specialCases.put("americaBlancSablon", "America/Blanc-Sablon");
      specialCases.put("americaIndianaKnox", "America/Indiana/Knox");
      specialCases.put("americaIndianaMarengo", "America/Indiana/Marengo");
      specialCases.put("americaIndianaPetersburg", "America/Indiana/Petersburg");
      specialCases.put("americaIndianaTellCity", "America/Indiana/Tell_City");
      specialCases.put("americaIndianaVevay", "America/Indiana/Vevay");
      specialCases.put("americaIndianaVincennes", "America/Indiana/Vincennes");
      specialCases.put("americaIndianaWinamac", "America/Indiana/Winamac");
      specialCases.put("americaKentuckyMonticello", "America/Kentucky/Monticello");
      specialCases.put("americaNorthDakotaBeulah", "America/North_Dakota/Beulah");
      specialCases.put("americaNorthDakotaCenter", "America/North_Dakota/Center");
      specialCases.put("americaNorthDakotaNewSalem", "America/North_Dakota/New_Salem");
      specialCases.put("americaPortauPrince", "America/Port-au-Prince");
      specialCases.put("americaRankinInlet", "America/Rankin_Inlet");
      specialCases.put("europeIsleofMan", "Europe/Isle_of_Man");
    }

    private PrintWriter createProperties(String packageName, String fileName)
        throws FileNotFoundException {
      String path = packageName.replace('.', '/') + "/" + fileName + ".properties";
      File f = new File(dst, path);
      FileOutputStream ostr = new FileOutputStream(f);

      return new PrintWriter(ostr);
    }

    static private Long findNextTransition(BasicTimeZone tz, long epochMs) {
      final TimeZoneTransition nextTransition = tz.getNextTransition(epochMs, false);
      if (nextTransition != null) {
        return nextTransition.getTime();
      }

      return null;
    }

    private String toJson(BasicTimeZone tz) {

      System.out.printf("%s:\n", tz.getID());

      // Preserve ordering by using a LinkedHashMap
      Map<String, Object> record = new LinkedHashMap<>();

      record.put("id", tz.getID());

      final ArrayList<Integer> transitions = new ArrayList<>();

      final LocalDateTime stopYear =
          LocalDate.of(LocalDate.now().getYear() + 30, 12, 31).atTime(LocalTime.MIDNIGHT);
      final long stopYearMs = stopYear.toEpochSecond(ZoneOffset.UTC) * 1000L;

      boolean hasTransitionRule = false;
      for (Long epochMs = findNextTransition(tz, 0); epochMs != null && epochMs <= stopYearMs;
           epochMs = findNextTransition(tz, epochMs)) {

        final int epochInHours = Math.toIntExact(epochMs / (1000L * 3600L));
        final TimeZoneTransition transition = tz.getPreviousTransition(epochMs, true);

        final TimeZoneRule to = transition.getTo();
        System.out.printf("\t(%s) %s %s\n",
            epochInHours,
            LocalDateTime.ofEpochSecond(epochMs / 1000L, 0, ZoneOffset.UTC),
            to.getName()
        );

        hasTransitionRule |= to.isTransitionRule();

        final int offsetMinutes = to.getDSTSavings() / 60000;

        // Some sanity checking
        final String name = to.getName();
        if (offsetMinutes == 0 && !name.endsWith("(STD)")) {
          System.err.printf("Warning: %s, %s, offsetMinutes = 0, expected (STD) in name!\n",
              tz.getID(), name);
        } else if (offsetMinutes != 0 && !name.endsWith("(DST)")) {
          System.err.printf("Warning: %s, %s, offsetMinutes = %s, expected (DST) in name!n",
              tz.getID(), name,
              offsetMinutes);
        }

        transitions.add(epochInHours);
        transitions.add(offsetMinutes);
      }

      record.put("transitions", transitions);

      final List<String> displayNames = new ArrayList<>();
      // java.util.TimeZone seems to contain the displaynames we are after.
      final java.util.TimeZone jutTz = java.util.TimeZone.getTimeZone(ZoneId.of(tz.getID()));

      displayNames.add(
          jutTz.getDisplayName(false, java.util.TimeZone.SHORT));
      displayNames.add(
          jutTz.getDisplayName(false, java.util.TimeZone.LONG));

      // Include the DST version of the name, even if there is no transition. By only if it differs from STD.
      final String displayNameDayLight = jutTz.getDisplayName(true, java.util.TimeZone.SHORT);
      if (hasTransitionRule || !Objects.equals(displayNames.get(0), displayNameDayLight)) {
        displayNames.add(displayNameDayLight);
        displayNames.add(jutTz.getDisplayName(true, java.util.TimeZone.LONG));
      }

      record.put("names", displayNames);
      record.put("std_offset", tz.getRawOffset() / 60000);

      return gson.toJson(record);
    }

    public TZGenerator(File dst) {
      this.dst = dst;
    }

    public void generate() throws IOException {

      try (
          final PrintWriter printWriter = createProperties("com.google.gwt.i18n.client.constants.",
              "TimeZoneConstants")) {

        printWriter.printf("# File generated from CLDR ver. %s / JRE ver. %s\n",
            CLDRFile.GEN_VERSION, Runtime.version());

        final List<String> declaredMethodsInTimeZoneConstants =
            Arrays.stream(TimeZoneConstants.class.getDeclaredMethods())
                .map(Method::getName)
                .sorted()
                .collect(Collectors.toList());

        names:
        for (String name : declaredMethodsInTimeZoneConstants) {
          TimeZone timeZone = null;

          // Some names require special handling:
          {
            final String id = specialCases.get(name);
            if (id != null) {
              timeZone = BasicTimeZone.getTimeZone(id);
              if (!Objects.equals(timeZone.getID(), TimeZone.UNKNOWN_ZONE.getID())) {
                printWriter.println(name + "=" + toJson((BasicTimeZone) timeZone));
                continue;
              }
            }
          }

          // Is it a posix-like name?
          if (name.length() == 7) {
            timeZone = BasicTimeZone.getTimeZone(name.toUpperCase(Locale.ENGLISH));
            if (!Objects.equals(timeZone.getID(), TimeZone.UNKNOWN_ZONE.getID())) {
              printWriter.println(name + "=" + toJson((BasicTimeZone) timeZone));
              continue;
            }
          }

          // No, so first upper-case letter is to be interpreted as the start of the name of the city:
          for (int i = 0; i < name.length(); i++) {
            final char c = name.charAt(i);
            if (Character.isUpperCase(c)) {
              final String baseTimeZoneId =
                  Character.toUpperCase(name.charAt(0)) + name.substring(1, i) + "/";
              final String inputCityName = name.substring(i);

              timeZone = BasicTimeZone.getTimeZone(baseTimeZoneId + inputCityName);
              if (!Objects.equals(timeZone.getID(), TimeZone.UNKNOWN_ZONE.getID())) {
                printWriter.println(name + "=" + toJson((BasicTimeZone) timeZone));
                continue names;
              }

              /*
               If there is another upper-case letter, then it translates to a space.
               A space is in turn translated into an underscore
               */
              StringBuilder cityName = new StringBuilder();
              cityName.append(inputCityName.charAt(0));
              for (int j = 1; j < inputCityName.length(); j++) {
                final char inputChar = inputCityName.charAt(j);
                if (Character.isUpperCase(inputChar)) {
                  cityName.append("_");
                }
                cityName.append(inputChar);
              }

              timeZone = BasicTimeZone.getTimeZone(baseTimeZoneId + cityName);
              if (!Objects.equals(timeZone.getID(), TimeZone.UNKNOWN_ZONE.getID())) {
                printWriter.println(name + "=" + toJson((BasicTimeZone) timeZone));
                continue names;
              }

              break;
            }
          }

          System.err.println(name + " doesn't appear to be a valid TimeZoneId!");
        }
      }
    }
  }

  public static void main(String[] args) throws IOException {
    if (args.length != 1) {
      System.err.println("Usage: " + TimeZoneCreator.class.getSimpleName() + " gwt-root-dir");
      return;
    }
    File gwt = new File(args[0]);
    File src = new File(gwt, "user/src");
    if (!gwt.exists() || !src.exists()) {
      System.err.println(args[0] + " doesn't appear to be a GWT root directory");
      return;
    }
    new TZGenerator(src).generate();
  }
}
