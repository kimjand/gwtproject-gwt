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
 * Implementation of DateTimeFormatInfo for the "su" locale.
 */
public class DateTimeFormatInfoImpl_su extends DateTimeFormatInfoImpl {

  @Override
  public String dateFormatFull() {
    return "EEEE, d MMMM y";
  }

  @Override
  public String dateFormatLong() {
    return "d MMMM y";
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
        "SM",
        "M"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "SM",
        "M"
    };
  }

  @Override
  public int firstDayOfTheWeek() {
    return 0;
  }

  @Override
  public String formatHour12Minute() {
    return "h.mm a";
  }

  @Override
  public String formatHour12MinuteSecond() {
    return "h.mm.ss a";
  }

  @Override
  public String formatHour24Minute() {
    return "H.mm";
  }

  @Override
  public String formatHour24MinuteSecond() {
    return "H.mm.ss";
  }

  @Override
  public String formatMinuteSecond() {
    return "mm.ss";
  }

  @Override
  public String formatMonthAbbrevDay() {
    return "d MMM";
  }

  @Override
  public String formatMonthFullDay() {
    return "d MMMM";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "EEEE, d MMMM";
  }

  @Override
  public String formatMonthNumDay() {
    return "d/M";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "MMM y";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d MMM, y";
  }

  @Override
  public String formatYearMonthFull() {
    return "MMMM y";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d MMMM y";
  }

  @Override
  public String formatYearMonthNum() {
    return "M/y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "d/M/y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE, d MMM y";
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
        "Januari",
        "Pébruari",
        "Maret",
        "April",
        "Méi",
        "Juni",
        "Juli",
        "Agustus",
        "Séptémber",
        "Oktober",
        "Nopémber",
        "Désémber"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "J",
        "P",
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
        "Jan",
        "Péb",
        "Mar",
        "Apr",
        "Méi",
        "Jun",
        "Jul",
        "Ags",
        "Sép",
        "Okt",
        "Nop",
        "Dés"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "kuartal ka-1",
        "kuartal ka-2",
        "kuartal ka-3",
        "kuartal ka-4"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "K1",
        "K2",
        "K3",
        "K4"
    };
  }

  @Override
  public String timeFormatFull() {
    return "H.mm.ss zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "H.mm.ss z";
  }

  @Override
  public String timeFormatMedium() {
    return "H.mm.ss";
  }

  @Override
  public String timeFormatShort() {
    return "H.mm";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "Minggu",
        "Senén",
        "Salasa",
        "Rebo",
        "Kemis",
        "Jumaah",
        "Saptu"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "M",
        "S",
        "S",
        "R",
        "K",
        "J",
        "S"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "Mng",
        "Sen",
        "Sal",
        "Reb",
        "Kem",
        "Jum",
        "Sap"
    };
  }
}
