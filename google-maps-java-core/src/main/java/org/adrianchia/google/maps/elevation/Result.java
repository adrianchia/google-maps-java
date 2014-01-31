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
package org.adrianchia.google.maps.elevation;

import java.io.Serializable;

import org.adrianchia.google.maps.Point;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Adrian Chia
 *
 */
public class Result implements Serializable {

    private static final long serialVersionUID = -7165543721280111388L;

    @JsonProperty("elevation")
    private double elevation;

    @JsonProperty("location")
    private Point location;

    @JsonProperty("resolution")
    private double resolution;

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

}
