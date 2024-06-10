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
 * Implementation of DateTimeFormatInfo for the "kxv_Deva" locale.
 */
public class DateTimeFormatInfoImpl_kxv_Deva extends DateTimeFormatInfoImpl_kxv {

  @Override
  public String[] ampms() {
    return new String[] {
        "AM",
        "PM"
    };
  }

  @Override
  public String dateFormatFull() {
    return "y MMMM d, EEEE";
  }

  @Override
  public String dateFormatLong() {
    return "y MMMM d";
  }

  @Override
  public String dateFormatMedium() {
    return "y MMM d";
  }

  @Override
  public String dateFormatShort() {
    return "y-MM-dd";
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
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
    return 1;
  }

  @Override
  public String formatHour12Minute() {
    return "h:mm a";
  }

  @Override
  public String formatHour12MinuteSecond() {
    return "h:mm:ss a";
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
    return "MMMM d, EEEE";
  }

  @Override
  public String formatMonthNumDay() {
    return "MM-dd";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "y MMM";
  }

  @Override
  public String formatYearMonthFull() {
    return "y MMMM";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "y MMMM d";
  }

  @Override
  public String formatYearMonthNum() {
    return "y-MM";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "y MMM d, EEE";
  }

  @Override
  public String formatYearQuarterFull() {
    return "y QQQQ";
  }

  @Override
  public String formatYearQuarterShort() {
    return "y Q";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "पुसु लेञ्जु",
        "माहाका लेञ्जु",
        "पागुणी लेञ्जु",
        "हिरे लेञ्जु",
        "बेसे लेञ्जु",
        "जाटा लेञ्जु",
        "आसाड़ी लेञ्जु",
        "स्राबाँ लेञ्जु",
        "बोदो लेञ्जु",
        "दसारा लेञ्जु",
        "दिवी लेञ्जु",
        "पान्डे लेञ्जु"
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
        "पुसु लेञ्जु",
        "माहाका लेञ्जु",
        "पागुणी लेञ्जु",
        "हिरे लेञ्जु",
        "बेसे लेञ्जु",
        "जाटा लेञ्जु",
        "आसाड़ी लेञ्जु",
        "स्राबाँ लेञ्जु",
        "बोदो लेञ्जु",
        "दसारा लेञ्जु",
        "दिवी लेञ्जु",
        "पान्डे लेञ्जु"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "Q1",
        "Q2",
        "Q3",
        "Q4"
    };
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "आदि वारा",
        "साॅम्वारा",
        "मंगाड़ा",
        "पुद्दारा",
        "लाक्कि वारा",
        "सुकुरु वारा",
        "सान्नि वारा"
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
        "आदि वारा",
        "साॅम्वारा",
        "मंगाड़ा",
        "पुद्दारा",
        "लाक्कि वारा",
        "सुकुरु वारा",
        "सान्नि वारा"
    };
  }

  @Override
  public int weekendStart() {
    return 6;
  }
}
