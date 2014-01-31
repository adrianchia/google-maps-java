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

import org.adrianchia.google.maps.Distance;
import org.adrianchia.google.maps.Duration;
import org.adrianchia.google.maps.LatLng;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Adrian Chia
 *
 */
public class Leg implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 770028273729065126L;

    @JsonProperty("steps")
    private List<Step> steps;

    @JsonProperty("distance")
    private Distance distance;

    @JsonProperty("duration")
    private Duration duration;

    @JsonProperty("duration_in_traffic")
    private DurationInTraffic durationInTraffic;

    @JsonProperty("arrival_time")
    private Time arrivalTime;

    @JsonProperty("departure_time")
    private Time departureTime;

    @JsonProperty("start_location")
    private LatLng startLocation;

    @JsonProperty("end_location")
    private LatLng endLocation;

    @JsonProperty("start_address")
    private String startAddress;

    @JsonProperty("end_address")
    private String endAddress;
    
    @JsonProperty("via_waypoint")
    private List<String> viaWayPoint;

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
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

    public DurationInTraffic getDurationInTraffic() {
        return durationInTraffic;
    }

    public void setDurationInTraffic(DurationInTraffic durationInTraffic) {
        this.durationInTraffic = durationInTraffic;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public LatLng getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(LatLng startLocation) {
        this.startLocation = startLocation;
    }

    public LatLng getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(LatLng endLocation) {
        this.endLocation = endLocation;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    public List<String> getViaWayPoint() {
        return viaWayPoint;
    }

    public void setViaWayPoint(List<String> viaWayPoint) {
        this.viaWayPoint = viaWayPoint;
    }

}
