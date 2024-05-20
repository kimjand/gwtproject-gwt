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
 * Implementation of DateTimeFormatInfo for the "cv" locale.
 */
public class DateTimeFormatInfoImpl_cv extends DateTimeFormatInfoImpl {

  @Override
  public String dateFormatFull() {
    return "EEEE, d MMMM y 'ҫ'.";
  }

  @Override
  public String dateFormatLong() {
    return "d MMMM y 'ҫ'.";
  }

  @Override
  public String dateFormatMedium() {
    return "d MMM y 'ҫ'.";
  }

  @Override
  public String dateFormatShort() {
    return "dd.MM.y";
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
        "Христос ҫуралнӑ кунччен",
        "Христос ҫуралнӑ кунран"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "п. э.",
        "х. э."
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
  public String formatMonthAbbrevDay() {
    return "d MMM";
  }

  @Override
  public String formatMonthFullDay() {
    return "d MMMM";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "cccc, d MMMM";
  }

  @Override
  public String formatMonthNumDay() {
    return "dd.MM";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "LLL y 'ҫ'.";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d MMM y 'ҫ'.";
  }

  @Override
  public String formatYearMonthFull() {
    return "LLLL y 'ҫ'.";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d MMMM y 'ҫ'.";
  }

  @Override
  public String formatYearMonthNum() {
    return "MM.y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "dd.MM.y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE, d MMM y 'ҫ'.";
  }

  @Override
  public String formatYearQuarterFull() {
    return "QQQQ y 'ҫ'.";
  }

  @Override
  public String formatYearQuarterShort() {
    return "Q y 'ҫ'.";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "кӑрлач",
        "нарӑс",
        "пуш",
        "ака",
        "ҫу",
        "ҫӗртме",
        "утӑ",
        "ҫурла",
        "авӑн",
        "юпа",
        "чӳк",
        "раштав"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "К",
        "Н",
        "П",
        "А",
        "Ҫ",
        "Ҫ",
        "У",
        "Ҫ",
        "А",
        "Ю",
        "Ч",
        "Р"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "кӑр.",
        "нар.",
        "пуш",
        "ака",
        "ҫу",
        "ҫӗр.",
        "утӑ",
        "ҫур.",
        "авӑн",
        "юпа",
        "чӳк",
        "раш."
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1-мӗш квартал",
        "2-мӗш квартал",
        "3-мӗш квартал",
        "4-мӗш квартал"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "1-мӗш кв.",
        "2-мӗш кв.",
        "3-мӗш кв.",
        "4-мӗш кв."
    };
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "вырсарникун",
        "тунтикун",
        "ытларикун",
        "юнкун",
        "кӗҫнерникун",
        "эрнекун",
        "шӑматкун"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "В",
        "Т",
        "Ы",
        "Ю",
        "К",
        "Э",
        "Ш"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "выр.",
        "тун.",
        "ытл.",
        "юн.",
        "кӗҫ.",
        "эр.",
        "шӑм."
    };
  }
}
