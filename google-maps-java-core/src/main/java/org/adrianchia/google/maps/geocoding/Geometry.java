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

import java.io.Serializable;

import org.adrianchia.google.maps.Bound;
import org.adrianchia.google.maps.LatLng;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Adrian Chia
 *
 */
public class Geometry implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 4157066072305461521L;

    @JsonProperty("location")
    private LatLng location;

    @JsonProperty("location_type")
    private String locationType;

    @JsonProperty("viewport")
    private Viewport viewport;

    @JsonProperty("bounds")
    private Bound bounds;

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public Viewport getViewport() {
        return viewport;
    }

    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }

    public Bound getBounds() {
        return bounds;
    }

    public void setBounds(Bound bounds) {
        this.bounds = bounds;
    }

}
