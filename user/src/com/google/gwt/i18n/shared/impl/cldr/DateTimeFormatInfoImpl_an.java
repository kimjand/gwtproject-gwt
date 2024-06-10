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
 * Implementation of DateTimeFormatInfo for the "an" locale.
 */
public class DateTimeFormatInfoImpl_an extends DateTimeFormatInfoImpl {

  @Override
  public String[] ampms() {
    return new String[] {
        "a.m.",
        "p.m."
    };
  }

  @Override
  public String dateFormatFull() {
    return "EEEE, d MMMM 'de' y";
  }

  @Override
  public String dateFormatLong() {
    return "d MMMM 'de' y";
  }

  @Override
  public String dateFormatMedium() {
    return "d MMM y";
  }

  @Override
  public String dateFormatShort() {
    return "d/M/yy";
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + " 'a' 'las' " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " 'a' 'las' " + timePattern;
  }

  @Override
  public String dateTimeMedium(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "a.C.",
        "d.C."
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "a.C.",
        "d.C."
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
        "de chinero",
        "de febrero",
        "de marzo",
        "d’abril",
        "de mayo",
        "de chunyo",
        "de chuliol",
        "d’agosto",
        "de setiembre",
        "d’octubre",
        "de noviembre",
        "d’aviento"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return new String[] {
        "chinero",
        "febrero",
        "marzo",
        "abril",
        "mayo",
        "chunyo",
        "chuliol",
        "agosto",
        "setiembre",
        "octubre",
        "noviembre",
        "aviento"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
        "11",
        "12"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "chi.",
        "feb.",
        "mar.",
        "abr.",
        "may.",
        "chn.",
        "chl.",
        "ago.",
        "set.",
        "oct.",
        "nov.",
        "avi."
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1r trimestre",
        "2o trimestre",
        "3r trimestre",
        "4o trimestre"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "1T",
        "2T",
        "3T",
        "4T"
    };
  }

  @Override
  public String timeFormatFull() {
    return "H:mm:ss zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "H:mm:ss z";
  }

  @Override
  public String timeFormatMedium() {
    return "H:mm:ss";
  }

  @Override
  public String timeFormatShort() {
    return "H:mm";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "dominche",
        "luns",
        "martz",
        "miercres",
        "chueves",
        "viernes",
        "sabado"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "D",
        "L",
        "Ma",
        "Mi",
        "Ch",
        "V",
        "S"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "dom",
        "lun",
        "mar",
        "mie",
        "chu",
        "vie",
        "sab"
    };
  }
}
