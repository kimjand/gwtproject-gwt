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
 * Implementation of DateTimeFormatInfo for the "oc_ES" locale.
 */
public class DateTimeFormatInfoImpl_oc_ES extends DateTimeFormatInfoImpl_oc {

  @Override
  public String[] ampms() {
    return new String[] {
        "a. m.",
        "p. m."
    };
  }

  @Override
  public String dateFormatFull() {
    return "EEEE, d 'de' MMMM 'de' y";
  }

  @Override
  public String dateFormatLong() {
    return "d 'de' MMMM 'de' y";
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
  public String[] erasFull() {
    return new String[] {
        "abans Jesucrist",
        "dempús de Crist"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "a. C.",
        "d. C."
    };
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "gèr",
        "hereuèr",
        "març",
        "abriu",
        "mai",
        "junh",
        "juriòl",
        "agost",
        "seteme",
        "octobre",
        "noveme",
        "deseme"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "G",
        "H",
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
        "gèr",
        "her",
        "mar",
        "abr",
        "mai",
        "jun",
        "jur",
        "ago",
        "set",
        "oct",
        "nov",
        "dec"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1èr trimèstre",
        "2au trimèstre",
        "3au trimèstre",
        "4au trimèstre"
    };
  }

  @Override
  public String timeFormatFull() {
    return "H:mm:ss (zzzz)";
  }

  @Override
  public String timeFormatLong() {
    return "H:mm:ss z";
  }

  @Override
  public String timeFormatMedium() {
    return "H:mm:ss";
  }

  @Override
  public String timeFormatShort() {
    return "H:mm";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "dimenge",
        "deluns",
        "dimars",
        "dimèrcles",
        "dijaus",
        "diuendres",
        "dissabte"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "D",
        "L",
        "M",
        "X",
        "J",
        "U",
        "S"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "dim",
        "del",
        "dma",
        "dmè",
        "dij",
        "diu",
        "dis"
    };
  }
}
