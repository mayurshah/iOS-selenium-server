/*
Copyright 2011 Selenium committers

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.openqa.selenium.android.library;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.internal.Coordinates;

class AndroidCoordinates implements Coordinates {  
  
  private final String elementId;
  private final Point point;
  
  /* package */ AndroidCoordinates(String elementId, Point pointOfLocationOfElement) {
    this.elementId = elementId;
    this.point = pointOfLocationOfElement;
  }

  /**
   * @deprecated To be removed in 2.31. Use {@link #onScreen()} instead
   */
  @Deprecated
  public Point getLocationOnScreen() {
    return point;
  }

  /**
   * @deprecated To be removed in 2.31. Use {@link #inViewPort()} instead
   */
  @Deprecated
  public Point getLocationInViewPort() {
    return point;
  }

  /**
   * @deprecated To be removed in 2.31. Use {@link #onPage()} instead
   */
  @Deprecated
  public Point getLocationInDOM() {
    return point;
  }

  public Point onScreen() {
    return point;
  }

  public Point inViewPort() {
    return point;
  }

  public Point onPage() {
    return point;
  }

  public Object getAuxiliary() {
    return elementId; 
  }

}
