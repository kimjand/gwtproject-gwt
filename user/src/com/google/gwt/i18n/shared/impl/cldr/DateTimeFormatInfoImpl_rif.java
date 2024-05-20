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
 * Implementation of DateTimeFormatInfo for the "rif" locale.
 */
public class DateTimeFormatInfoImpl_rif extends DateTimeFormatInfoImpl {

  @Override
  public String dateFormatFull() {
    return "EEEE dd MMMM y";
  }

  @Override
  public String dateFormatLong() {
    return "dd MMMM y";
  }

  @Override
  public String dateFormatMedium() {
    return "dd MMM y";
  }

  @Override
  public String dateFormatShort() {
    return "dd/MM/y";
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
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
        "zzat i yeccu",
        "awarni yeccu"
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
        "yennayer",
        "febrayer",
        "mars",
        "yebril",
        "mayyu",
        "yunyu",
        "yulyuz",
        "ɣucct",
        "cutenber",
        "kṭuber",
        "nuwember",
        "dujember"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "y",
        "f",
        "m",
        "y",
        "m",
        "y",
        "y",
        "ɣ",
        "c",
        "k",
        "n",
        "d"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "yen",
        "feb",
        "mar",
        "yeb",
        "may",
        "yun",
        "yul",
        "ɣuc",
        "cut",
        "kṭu",
        "nuw",
        "duj"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "rrbeɛ wis 1",
        "rrbeɛ wis 2",
        "rrbeɛ wis 3",
        "rrbeɛ wis 4"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "r1",
        "r2",
        "r3",
        "r4"
    };
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "lḥed",
        "letnayen",
        "ttlat",
        "larbeɛ",
        "lexmis",
        "jjemɛa",
        "ssebt"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "l",
        "l",
        "t",
        "l",
        "l",
        "j",
        "s"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "lḥe",
        "let",
        "ttl",
        "lar",
        "lex",
        "jje",
        "sse"
    };
  }
}
