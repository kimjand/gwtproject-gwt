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
package com.google.gwt.i18n.client.impl.cldr;
// DO NOT EDIT - GENERATED FROM CLDR AND ICU DATA

/**
 * Implementation of DateTimeFormatInfo for the "la" locale.
 */
public class DateTimeFormatInfoImpl_la extends DateTimeFormatInfoImpl {

  @Override
  public String[] ampms() {
    return new String[] {
        "a.m.",
        "p.m."
    };
  }

  @Override
  public String dateFormatFull() {
    return "EEEE, 'die' d MMMM y G";
  }

  @Override
  public String dateFormatLong() {
    return "'die' d MMMM y G";
  }

  @Override
  public String dateFormatMedium() {
    return "'die' d MMM y G";
  }

  @Override
  public String dateFormatShort() {
    return "d M y G";
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + " 'de' " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " 'de' " + timePattern;
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
        "ante Christum natum",
        "post Christum natum"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "a.C.n.",
        "p.C.n."
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
        "Ianuarii",
        "Februarii",
        "Martii",
        "Aprilis",
        "Maii",
        "Iunii",
        "Iulii",
        "Augusti",
        "Septembris",
        "Octobris",
        "Novembris",
        "Decembris"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return new String[] {
        "Ianuarius",
        "Februarius",
        "Martius",
        "Aprilis",
        "Maius",
        "Iunius",
        "Iulius",
        "Augustus",
        "September",
        "October",
        "November",
        "December"
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
        "Ian",
        "Feb",
        "Mar",
        "Apr",
        "Mai",
        "Iun",
        "Iul",
        "Aug",
        "Sep",
        "Oct",
        "Nov",
        "Dec"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "prima quarta",
        "secunda quarta",
        "tertia quarta",
        "quarta quarta"
    };
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "dies Solis",
        "dies Lunae",
        "dies Martis",
        "dies Mercurii",
        "dies Iovis",
        "dies Veneris",
        "dies Saturni"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "Sol",
        "Lun",
        "Mar",
        "Mer",
        "Iov",
        "Ven",
        "Sat"
    };
  }
}
