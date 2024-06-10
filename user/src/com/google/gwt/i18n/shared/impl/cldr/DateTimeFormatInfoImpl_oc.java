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
 * Implementation of DateTimeFormatInfo for the "oc" locale.
 */
public class DateTimeFormatInfoImpl_oc extends DateTimeFormatInfoImpl {

  @Override
  public String dateFormatFull() {
    return "EEEE d MMMM 'de' y";
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
    return "d/MM/yy";
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + " 'a' " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " 'a' " + timePattern;
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
        "Abans Jèsus-Crist",
        "despús Jèsus-Crist"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "Ab. J.C.",
        "de. J.-C."
    };
  }

  @Override
  public String formatHour12Minute() {
    return "h'h'mm a";
  }

  @Override
  public String formatHour12MinuteSecond() {
    return "h'h'mm:ss a";
  }

  @Override
  public String formatHour24Minute() {
    return "HH'h'mm";
  }

  @Override
  public String formatHour24MinuteSecond() {
    return "HH'h'mm ss 'seg'.";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d MMM y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "dd/MM/y";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "de genièr",
        "de febrièr",
        "de març",
        "d’abril",
        "de mai",
        "de junh",
        "de julhet",
        "d’agost",
        "de setembre",
        "d’octòbre",
        "de novembre",
        "de decembre"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return new String[] {
        "genièr",
        "febrièr",
        "març",
        "abril",
        "mai",
        "junh",
        "julhet",
        "agost",
        "setembre",
        "octòbre",
        "novembre",
        "decembre"
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
        "J",
        "J",
        "A",
        "S",
        "O",
        "N",
        "D"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "gen.",
        "feb.",
        "març",
        "abr.",
        "mai",
        "junh",
        "jul.",
        "ago.",
        "set.",
        "oct.",
        "nov.",
        "dec."
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1èr trimèstre",
        "2nd trimèstre",
        "3en trimèstre",
        "4en trimèstre"
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
  public String timeFormatLong() {
    return "H'h'mm:ss z";
  }

  @Override
  public String timeFormatMedium() {
    return "H'h'mm:ss";
  }

  @Override
  public String timeFormatShort() {
    return "H'h'mm";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "dimenge",
        "diluns",
        "dimars",
        "dimècres",
        "dijòus",
        "divendres",
        "dissabte"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "Dg",
        "Dl",
        "Dm",
        "Dc",
        "Dj",
        "Dv",
        "Ds"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "dimenge",
        "diluns",
        "dimars",
        "dimècres",
        "dijòus",
        "divendres",
        "dissabte"
    };
  }
}
