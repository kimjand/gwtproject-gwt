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
 * Implementation of DateTimeFormatInfo for the "sc" locale.
 */
public class DateTimeFormatInfoImpl_sc extends DateTimeFormatInfoImpl {

  @Override
  public String dateFormatFull() {
    return "EEEE d 'de' MMMM 'de' 'su' y";
  }

  @Override
  public String dateFormatLong() {
    return "d 'de' MMMM 'de' 'su' y";
  }

  @Override
  public String dateFormatMedium() {
    return "d 'de' MMM y";
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
        "in antis de Cristu",
        "a pustis de Cristu"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "a.C.",
        "p.C."
    };
  }

  @Override
  public String formatMonthAbbrevDay() {
    return "d 'de' MMM";
  }

  @Override
  public String formatMonthFullDay() {
    return "d 'de' MMMM";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "EEEE d 'de' MMMM";
  }

  @Override
  public String formatMonthNumDay() {
    return "dd/MM";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "MMM y";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d 'de' MMM y";
  }

  @Override
  public String formatYearMonthFull() {
    return "MMMM 'de' 'su' y";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d 'de' MMMM 'de' 'su' y";
  }

  @Override
  public String formatYearMonthNum() {
    return "MM/Y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "dd/MM/y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE d 'de' MMM y";
  }

  @Override
  public String formatYearQuarterFull() {
    return "QQQQ 'de' 'su' y";
  }

  @Override
  public String formatYearQuarterShort() {
    return "Q y";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "ghennàrgiu",
        "freàrgiu",
        "martzu",
        "abrile",
        "maju",
        "làmpadas",
        "trìulas",
        "austu",
        "cabudanni",
        "santugaine",
        "santandria",
        "nadale"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "G",
        "F",
        "M",
        "A",
        "M",
        "L",
        "T",
        "A",
        "C",
        "S",
        "S",
        "N"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "ghe",
        "fre",
        "mar",
        "abr",
        "maj",
        "làm",
        "trì",
        "aus",
        "cab",
        "stG",
        "stA",
        "nad"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1u trimestre",
        "2u trimestre",
        "3u trimestre",
        "4u trimestre"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "T1",
        "T2",
        "T3",
        "T4"
    };
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "domìniga",
        "lunis",
        "martis",
        "mèrcuris",
        "giòbia",
        "chenàbura",
        "sàbadu"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "D",
        "L",
        "M",
        "M",
        "G",
        "C",
        "S"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "dom",
        "lun",
        "mar",
        "mèr",
        "giò",
        "che",
        "sàb"
    };
  }
}
