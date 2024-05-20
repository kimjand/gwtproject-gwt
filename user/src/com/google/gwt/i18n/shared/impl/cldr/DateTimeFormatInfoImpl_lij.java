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
 * Implementation of DateTimeFormatInfo for the "lij" locale.
 */
public class DateTimeFormatInfoImpl_lij extends DateTimeFormatInfoImpl {

  @Override
  public String dateFormatFull() {
    return "EEEE d MMMM 'do' y";
  }

  @Override
  public String dateFormatLong() {
    return "d MMMM 'do' y";
  }

  @Override
  public String dateFormatMedium() {
    return "d MMM 'do' y";
  }

  @Override
  public String dateFormatShort() {
    return "dd/MM/yy";
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
  public String[] erasFull() {
    return new String[] {
        "avanti de Cristo",
        "dòppo de Cristo"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "aC",
        "dC"
    };
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d MMM 'do' y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "d/M/y";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "de zenâ",
        "de frevâ",
        "de marso",
        "d’arvî",
        "de mazzo",
        "de zugno",
        "de luggio",
        "d’agosto",
        "de settembre",
        "d’ottobre",
        "de novembre",
        "de dexembre"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return new String[] {
        "zenâ",
        "frevâ",
        "marso",
        "arvî",
        "mazzo",
        "zugno",
        "luggio",
        "agosto",
        "settembre",
        "ottobre",
        "novembre",
        "dexembre"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "ZN",
        "FR",
        "MR",
        "AR",
        "MZ",
        "ZG",
        "LG",
        "AG",
        "ST",
        "OT",
        "NV",
        "DX"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "de zen.",
        "de fre.",
        "de mar.",
        "d’arv.",
        "de maz.",
        "de zug.",
        "de lug.",
        "d’ago.",
        "de set.",
        "d’ott.",
        "de nov.",
        "de dex."
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return new String[] {
        "zen.",
        "fre.",
        "mar.",
        "arv.",
        "maz.",
        "zug.",
        "lug.",
        "ago.",
        "set.",
        "ott.",
        "nov.",
        "dex."
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1º trimestre",
        "2º trimestre",
        "3º trimestre",
        "4º trimestre"
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
        "domenega",
        "lunesdì",
        "mätesdì",
        "mäcordì",
        "zeuggia",
        "venardì",
        "sabbo"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "D",
        "L",
        "M",
        "M",
        "Z",
        "V",
        "S"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "dom.",
        "lun.",
        "mät.",
        "mäc.",
        "zeu.",
        "ven.",
        "sab."
    };
  }
}
