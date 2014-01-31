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

import org.adrianchia.google.maps.Distance;
import org.adrianchia.google.maps.Duration;
import org.adrianchia.google.maps.Point;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Adrian Chia
 *
 */
public class Step implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4644637763453084581L;

    @JsonProperty("html_instructions")
    private String htmlInstructions;

    @JsonProperty("distance")
    private Distance distance;

    @JsonProperty("duration")
    private Duration duration;

    @JsonProperty("start_location")
    private Point startLocation;

    @JsonProperty("end_location")
    private Point endLocation;

    @JsonProperty("travel_mode")
    private String travelMode;

    @JsonProperty("polyline")
    private Polyline polyline;

    @JsonProperty("maneuver")
    private String maneuver;

    @JsonProperty("sub_steps")
    private Step[] subSteps;

    @JsonProperty("transit_details")
    private TransitDetail transitDetails;

    public String getHtmlInstructions() {
        return htmlInstructions;
    }

    public void setHtmlInstructions(String htmlInstructions) {
        this.htmlInstructions = htmlInstructions;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Point getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Point startLocation) {
        this.startLocation = startLocation;
    }

    public Point getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Point endLocation) {
        this.endLocation = endLocation;
    }

    public String getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(String travelMode) {
        this.travelMode = travelMode;
    }

    public Polyline getPolyline() {
        return polyline;
    }

    public void setPolyline(Polyline polyline) {
        this.polyline = polyline;
    }

    public String getManeuver() {
        return maneuver;
    }

    public void setManeuver(String maneuver) {
        this.maneuver = maneuver;
    }

    public Step[] getSubSteps() {
        return subSteps;
    }

    public void setSubSteps(Step[] subSteps) {
        this.subSteps = subSteps;
    }

    public TransitDetail getTransitDetails() {
        return transitDetails;
    }

    public void setTransitDetails(TransitDetail transitDetails) {
        this.transitDetails = transitDetails;
    }

}
