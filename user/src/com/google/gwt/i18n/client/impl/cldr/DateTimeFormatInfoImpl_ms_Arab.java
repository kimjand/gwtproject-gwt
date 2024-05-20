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
 * Implementation of DateTimeFormatInfo for the "ms_Arab" locale.
 */
public class DateTimeFormatInfoImpl_ms_Arab extends DateTimeFormatInfoImpl_ms {

  @Override
  public String[] ampms() {
    return new String[] {
        "AM",
        "PM"
    };
  }

  @Override
  public String dateFormatFull() {
    return "EEEE، d MMMM y";
  }

  @Override
  public String dateFormatMedium() {
    return "dd/MM/y";
  }

  @Override
  public String dateTimeMedium(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeShort(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "BCE",
        "CE"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "BCE",
        "CE"
    };
  }

  @Override
  public int firstDayOfTheWeek() {
    return 0;
  }

  @Override
  public String formatMonthAbbrevDay() {
    return "MMM d";
  }

  @Override
  public String formatMonthFullDay() {
    return "MMMM d";
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
  public String formatYearMonthAbbrevDay() {
    return "MMM d, y";
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
  public String[] monthsFull() {
    return new String[] {
        "جانواري",
        "فيبواري",
        "مچ",
        "اڤريل",
        "مي",
        "جون",
        "جولاي",
        "ݢوس",
        "سيڤتيمبر",
        "اوکتوبر",
        "نوۏيمبر",
        "ديسيمبر"
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
        "جانواري",
        "فيبواري",
        "مچ",
        "اڤريل",
        "مي",
        "جون",
        "جولاي",
        "ݢوس",
        "سيڤتيمبر",
        "اوکتوبر",
        "نوۏيمبر",
        "ديسيمبر"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "سوکو ڤرتام",
        "سوکو ک-2",
        "سوکو ک-3",
        "سوکو ک-4"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "سوکو 1",
        "سوکو ک-2",
        "سوکو ک-3",
        "سوکو ک-4"
    };
  }

  @Override
  public String timeFormatFull() {
    return "h:mm:ss a zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "h:mm:ss a z";
  }

  @Override
  public String timeFormatMedium() {
    return "h:mm:ss a";
  }

  @Override
  public String timeFormatShort() {
    return "h:mm a";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "احد",
        "اثنين",
        "ثلاث",
        "رابو",
        "خميس",
        "جمعة",
        "سبتو"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "S",
        "M",
        "T",
        "W",
        "T",
        "F",
        "S"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "احد",
        "اثنين",
        "ثلاث",
        "رابو",
        "خميس",
        "جمعة",
        "سبتو"
    };
  }
}
