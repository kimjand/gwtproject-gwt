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
 * Implementation of DateTimeFormatInfo for the "sa" locale.
 */
public class DateTimeFormatInfoImpl_sa extends DateTimeFormatInfoImpl {

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
    return "d MMM y";
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
        "जनवरीमासः",
        "फरवरीमासः",
        "मार्चमासः",
        "अप्रैलमासः",
        "मईमासः",
        "जूनमासः",
        "जुलाईमासः",
        "अगस्तमासः",
        "सितंबरमासः",
        "अक्तूबरमासः",
        "नवंबरमासः",
        "दिसंबरमासः"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "ज",
        "फ",
        "मा",
        "अ",
        "म",
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
  public String[] monthsNarrowStandalone() {
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
        "जनवरी:",
        "फरवरी:",
        "मार्च:",
        "अप्रैल:",
        "मई",
        "जून:",
        "जुलाई:",
        "अगस्त:",
        "सितंबर:",
        "अक्तूबर:",
        "नवंबर:",
        "दिसंबर:"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "प्रथम त्रैमासिक",
        "द्वितीय त्रैमासिक",
        "तृतीय त्रैमासिक",
        "चतुर्थ त्रैमासिक"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "त्रैमासिक1",
        "त्रैमासिक2",
        "त्रैमासिक3",
        "त्रैमासिक4"
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
        "रविवासरः",
        "सोमवासरः",
        "मंगलवासरः",
        "बुधवासरः",
        "गुरुवासर:",
        "शुक्रवासरः",
        "शनिवासरः"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "र",
        "सो",
        "मं",
        "बु",
        "गु",
        "शु",
        "श"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "रवि",
        "सोम",
        "मंगल",
        "बुध",
        "गुरु",
        "शुक्र",
        "शनि"
    };
  }

  @Override
  public int weekendStart() {
    return 0;
  }
}
