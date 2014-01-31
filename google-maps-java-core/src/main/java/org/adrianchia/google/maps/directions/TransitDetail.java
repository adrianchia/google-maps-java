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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Adrian Chia
 *
 */
public class TransitDetail implements Serializable {

    private static final long serialVersionUID = -3717984047015500081L;

    @JsonProperty("arrival_stop")
    private Stop arrivalStop;

    @JsonProperty("departure_stop")
    private Stop departureStop;

    @JsonProperty("arrival_time")
    private Time arrivalTime;

    @JsonProperty("departure_time")
    private Time departureTime;

    @JsonProperty("headsign")
    private String headsign;

    @JsonProperty("headway")
    private int headway;

    @JsonProperty("num_stops")
    private int numStops;

    @JsonProperty("line")
    private Line line;

    public Stop getArrivalStop() {
        return arrivalStop;
    }

    public void setArrivalStop(Stop arrivalStop) {
        this.arrivalStop = arrivalStop;
    }

    public Stop getDepartureStop() {
        return departureStop;
    }

    public void setDepartureStop(Stop departureStop) {
        this.departureStop = departureStop;
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

    public String getHeadsign() {
        return headsign;
    }

    public void setHeadsign(String headsign) {
        this.headsign = headsign;
    }

    public int getHeadway() {
        return headway;
    }

    public void setHeadway(int headway) {
        this.headway = headway;
    }

    public int getNumStops() {
        return numStops;
    }

    public void setNumStops(int numStops) {
        this.numStops = numStops;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

}
