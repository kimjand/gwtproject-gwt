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
 * Implementation of DateTimeFormatInfo for the "szl" locale.
 */
public class DateTimeFormatInfoImpl_szl extends DateTimeFormatInfoImpl {

  @Override
  public String[] ampms() {
    return new String[] {
        "do połedniŏ",
        "po połedniu"
    };
  }

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
    return "dd.MM.y";
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + " 'ô' " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " 'ô' " + timePattern;
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
        "przed naszōm erōm",
        "naszyj ery"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "p.n.e.",
        "n.e."
    };
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d MMM y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "dd.MM.y";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "stycznia",
        "lutego",
        "marca",
        "kwietnia",
        "moja",
        "czyrwca",
        "lipca",
        "siyrpnia",
        "września",
        "października",
        "listopada",
        "grudnia"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return new String[] {
        "styczyń",
        "luty",
        "marzec",
        "kwieciyń",
        "moj",
        "czyrwiec",
        "lipiec",
        "siyrpiyń",
        "wrzesiyń",
        "październik",
        "listopad",
        "grudziyń"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "S",
        "L",
        "M",
        "K",
        "M",
        "C",
        "L",
        "S",
        "W",
        "P",
        "L",
        "G"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "sty",
        "lut",
        "mar",
        "kwi",
        "moj",
        "czy",
        "lip",
        "siy",
        "wrz",
        "paź",
        "lis",
        "gru"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "I sztwierć roku",
        "II sztwierć roku",
        "III sztwierć roku",
        "IV sztwierć roku"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "I szr.",
        "II szr.",
        "III szr.",
        "IV szr."
    };
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "niydziela",
        "pyńdziałek",
        "wtorek",
        "strzoda",
        "sztwortek",
        "piōntek",
        "sobota"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "n",
        "p",
        "w",
        "s",
        "s",
        "p",
        "s"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "niy",
        "pyń",
        "wto",
        "str",
        "szt",
        "piō",
        "sob"
    };
  }
}
