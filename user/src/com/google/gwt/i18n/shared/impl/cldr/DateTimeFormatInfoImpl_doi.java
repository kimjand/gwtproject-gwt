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
 * Implementation of DateTimeFormatInfo for the "doi" locale.
 */
public class DateTimeFormatInfoImpl_doi extends DateTimeFormatInfoImpl {

  @Override
  public String[] ampms() {
    return new String[] {
        "सवेर",
        "स’ञ"
    };
  }

  @Override
  public String dateFormatFull() {
    return "EEEE, d, MMMM y";
  }

  @Override
  public String dateFormatLong() {
    return "d, MMMM y";
  }

  @Override
  public String dateFormatMedium() {
    return "d, MMM y";
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
        "ई.पू.",
        "ई. सन्"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "ई.पू.",
        "ईसवी"
    };
  }

  @Override
  public int firstDayOfTheWeek() {
    return 0;
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
    return "d, MMM y";
  }

  @Override
  public String formatYearMonthFull() {
    return "MMMM y";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d, MMMM y";
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
    return "EEE, d, MMM y";
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
        "जनवरी",
        "फरवरी",
        "मार्च",
        "अप्रैल",
        "मेई",
        "जून",
        "जुलाई",
        "अगस्त",
        "सितंबर",
        "अक्तूबर",
        "नवंबर",
        "दिसंबर"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "ज",
        "फ",
        "मा",
        "अ",
        "मे",
        "जू",
        "जु",
        "अ",
        "सि",
        "अ",
        "न",
        "दि"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "जन.",
        "फर.",
        "मार्च",
        "अप्रैल",
        "मेई",
        "जून",
        "जुलाई",
        "अग.",
        "सित.",
        "अक्तू.",
        "नव.",
        "दिस."
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "पैहली त्रमाही",
        "दूई त्रमाही",
        "त्री त्रमाही",
        "चौथी त्रमाही"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "त्र.1",
        "त्र.2",
        "त्र.3",
        "त्र.4"
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
        "ऐतबार",
        "सोमबार",
        "मंगलबार",
        "बुधबार",
        "बीरबार",
        "शुक्रबार",
        "शनिबार"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "ऐ.",
        "सो.",
        "म.",
        "बु.",
        "बी.",
        "शु.",
        "श."
    };
  }

  @Override
  public String[] weekdaysNarrowStandalone() {
    return new String[] {
        "ऐ",
        "सो",
        "म.",
        "बु.",
        "बी.",
        "शु.",
        "श."
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "ऐत",
        "सोम",
        "मंगल",
        "बुध",
        "बीर",
        "शुक्र",
        "शनि"
    };
  }

  @Override
  public int weekendStart() {
    return 0;
  }
}
