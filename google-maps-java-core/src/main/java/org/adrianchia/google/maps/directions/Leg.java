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
}
