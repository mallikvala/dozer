/**
 * Copyright 2005-2017 Dozer Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dozer.vo.index;

import org.dozer.vo.BaseTestObject;

/**
 * @author tierney.matt
 */
public class Mccoy extends BaseTestObject {
  private String stringProperty;
  private String field2;

  public String getStringProperty() {
    return stringProperty;
  }

  public void setStringProperty(String stringProperty) {
    this.stringProperty = stringProperty;
  }

  public String getField2() {
    return field2;
  }

  public void setField2(String field2) {
    this.field2 = field2;
  }

}
