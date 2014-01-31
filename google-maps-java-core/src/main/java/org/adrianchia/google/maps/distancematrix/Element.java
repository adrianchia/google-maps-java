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
package org.adrianchia.google.maps.distancematrix;

import java.io.Serializable;

import org.adrianchia.google.maps.Distance;
import org.adrianchia.google.maps.Duration;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Adrian Chia
 *
 */
public class Element implements Serializable {

    private static final long serialVersionUID = 9176441078738059085L;

    @JsonProperty("status")
    private String status;
    
    @JsonProperty("duration")
    private Duration duration;

    @JsonProperty("distance")
    private Distance distance;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

}
