/**
 * Copyright 2014 Adrian Chia
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.adrianchia.google.maps.geocoding;

import org.adrianchia.google.maps.Point;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A viewport contains the recommended viewport for displaying the returned result, 
 * specified as two latitude,longitude values defining the southwest and northeast corner of 
 * the viewport bounding box. 
 * Generally the viewport is used to frame a result when displaying it to a user.
 * 
 * @author Adrian Chia
 *
 */
public class Viewport {
    
    @JsonProperty("southwest")
    private Point southwest;

    @JsonProperty("northeast")
    private Point northeast;

    public Point getSouthwest() {
        return southwest;
    }

    public void setSouthwest(Point southwest) {
        this.southwest = southwest;
    }

    public Point getNortheast() {
        return northeast;
    }

    public void setNortheast(Point northeast) {
        this.northeast = northeast;
    }

}
