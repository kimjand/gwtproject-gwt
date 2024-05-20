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
 * Implementation of DateTimeFormatInfo for the "ha_Arab" locale.
 */
public class DateTimeFormatInfoImpl_ha_Arab extends DateTimeFormatInfoImpl_ha {

  @Override
  public String[] ampms() {
    return new String[] {
        "A.M.",
        "P.M."
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
        "غَبَنِنْ مِلَدِ",
        "مِلَدِ"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "غَبَنِنْ مِلَدِ",
        "مِلَدِ"
    };
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
        "جَنَيْرُ",
        "ڢَبْرَيْرُ",
        "مَرِسْ",
        "أَڢْرِلُ",
        "مَيُ",
        "يُونِ",
        "يُولِ",
        "أَغُسْتَ",
        "سَتُمْبَ",
        "أُكْتوُبَ",
        "نُوَمْبَ",
        "دِسَمْبَ"
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
        "جَن",
        "ڢَب",
        "مَر",
        "أَڢْر",
        "مَي",
        "يُون",
        "يُول",
        "أَغُ",
        "سَت",
        "أُكْت",
        "نُو",
        "دِس"
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
  public String[] quartersShort() {
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
        "لَحَدِ",
        "لِتِنِنْ",
        "تَلَتَ",
        "لَرَبَ",
        "أَلْحَمِسْ",
        "جُمَعَ",
        "أَسَبَرْ"
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
        "لَح",
        "لِت",
        "تَل",
        "لَر",
        "أَلْح",
        "جُم",
        "أَسَ"
    };
  }
}
