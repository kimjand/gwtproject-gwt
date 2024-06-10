/*
 * Copyright 2012 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.i18n.shared.impl.cldr;
// DO NOT EDIT - GENERATED FROM CLDR AND ICU DATA

/**
 * Implementation of DateTimeFormatInfo for the "gaa" locale.
 */
public class DateTimeFormatInfoImpl_gaa extends DateTimeFormatInfoImpl {

  @Override
  public String[] ampms() {
    return new String[] {
        "LB",
        "SN"
    };
  }

  @Override
  public String dateFormatFull() {
    return "EEEE, MMMM d, y";
  }

  @Override
  public String dateFormatLong() {
    return "MMMM d, y";
  }

  @Override
  public String dateFormatMedium() {
    return "MMM d, y";
  }

  @Override
  public String dateFormatShort() {
    return "M/d/yy";
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + " 'be' 'ni' 'atswa' " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " 'be' 'ni' 'atswa' " + timePattern;
  }

  @Override
  public String dateTimeMedium(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String dateTimeShort(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "Dani Yesu",
        "Yesu Gbele Sɛɛ"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "DY",
        "YGS"
    };
  }

  @Override
  public String formatHour12Minute() {
    return "h:mm a";
  }

  @Override
  public String formatHour12MinuteSecond() {
    return "h:mm:ss a";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "EEEE, MMMM d";
  }

  @Override
  public String formatMonthNumDay() {
    return "M/d";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "MMM y";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "MMM d, y";
  }

  @Override
  public String formatYearMonthFull() {
    return "MMMM y";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "MMMM d, y";
  }

  @Override
  public String formatYearMonthNum() {
    return "M/y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "M/d/y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE, MMM d, y";
  }

  @Override
  public String formatYearQuarterFull() {
    return "QQQQ y";
  }

  @Override
  public String formatYearQuarterShort() {
    return "Q y";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "Aharabata",
        "Oflɔ",
        "Otsokrikri",
        "Abeibe",
        "Agbiɛnaa",
        "Otukwajaŋ",
        "Maawɛ",
        "Manyawale",
        "Gbo",
        "Antɔŋ",
        "Alemle",
        "Afuabe"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return new String[] {
        "Aharabata",
        "Oflɔ",
        "Otsokrikri",
        "Abeibe",
        "Agbiɛnaa",
        "Otukwajan",
        "Maawɛ",
        "Manyawale",
        "Gbo",
        "Antɔŋ",
        "Alemle",
        "Afuabe"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "A",
        "O",
        "O",
        "A",
        "A",
        "O",
        "M",
        "M",
        "G",
        "A",
        "A",
        "A"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "Aha",
        "Ofl",
        "Ots",
        "Abe",
        "Agb",
        "Otu",
        "Maa",
        "Man",
        "Gbo",
        "Ant",
        "Ale",
        "Afu"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "nyɔji etɛ 1",
        "nyɔji etɛ 2",
        "nyɔji etɛ 3",
        "nyɔji etɛ 4"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "N1",
        "N2",
        "N3",
        "N4"
    };
  }

  @Override
  public String timeFormatFull() {
    return "h:mm:ss a zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "h:mm:ss a z";
  }

  @Override
  public String timeFormatMedium() {
    return "h:mm:ss a";
  }

  @Override
  public String timeFormatShort() {
    return "h:mm a";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "Hɔgbaa",
        "Ju",
        "Jufɔ",
        "Shɔ",
        "Soo",
        "Sohaa",
        "Hɔɔ"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "H",
        "J",
        "J",
        "S",
        "S",
        "S",
        "H"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "Hɔg",
        "Ju",
        "Juf",
        "Shɔ",
        "Soo",
        "Soh",
        "Hɔɔ"
    };
  }
}
