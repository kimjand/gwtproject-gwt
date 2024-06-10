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

import com.google.gwt.core.client.JavaScriptObject;

// DO NOT EDIT - GENERATED FROM CLDR DATA

/**
 * Localized names for the "ps_PK" locale.
 */
public class LocalizedNamesImpl_ps_PK extends LocalizedNamesImpl_ps {

  @Override
  protected void loadNameMapJava() {
    super.loadNameMapJava();
    namesMap.put("019", "امريکے");
    namesMap.put("PS", "فلسطين سيمے");
    namesMap.put("TC", "د ترکیے او کیکاسو ټاپو");
    namesMap.put("TF", "د فرانسے جنوبي سیمے");
  }

  @Override
  protected JavaScriptObject loadNameMapNative() {
    return overrideMap(super.loadNameMapNative(), loadMyNameMap());
  }

  private native JavaScriptObject loadMyNameMap() /*-{
    return {
        "019": "امريکے",
        "PS": "فلسطين سيمے",
        "TC": "د ترکیے او کیکاسو ټاپو",
        "TF": "د فرانسے جنوبي سیمے"
    };
  }-*/;
}
