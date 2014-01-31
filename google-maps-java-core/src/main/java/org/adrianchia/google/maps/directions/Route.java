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
package org.adrianchia.google.maps.directions;

import java.io.Serializable;
import java.util.List;

import org.adrianchia.google.maps.Bound;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Adrian Chia
 *
 */
public class Route implements Serializable {

    private static final long serialVersionUID = 3054316974161034227L;

    @JsonProperty("summary")
    private String summary;
    
    @JsonProperty("copyrights")
    private String copyrights;
    
    @JsonProperty("bounds")
    private Bound bounds;
    
    @JsonProperty("legs")
    private List<Leg> legs;
    
    @JsonProperty("overview_polyline")
    private OverviewPolyline overviewPolyline;
    
    @JsonProperty("warnings")
    private List<String> warnings;
    
    @JsonProperty("waypoint_order")
    private List<Integer> waypointOrder;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCopyrights() {
        return copyrights;
    }

    public void setCopyrights(String copyrights) {
        this.copyrights = copyrights;
    }

    public Bound getBounds() {
        return bounds;
    }

    public void setBounds(Bound bounds) {
        this.bounds = bounds;
    }

    public List<Leg> getLegs() {
        return legs;
    }

    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    public OverviewPolyline getOverviewPolyline() {
        return overviewPolyline;
    }

    public void setOverviewPolyline(OverviewPolyline overviewPolyline) {
        this.overviewPolyline = overviewPolyline;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }

    public List<Integer> getWaypointOrder() {
        return waypointOrder;
    }

    public void setWaypointOrder(List<Integer> waypointOrder) {
        this.waypointOrder = waypointOrder;
    }

}
