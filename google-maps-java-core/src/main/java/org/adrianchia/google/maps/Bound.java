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
package org.adrianchia.google.maps;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Adrian Chia
 *
 */
public class Bound implements Serializable {

    private static final long serialVersionUID = 4475408440445897547L;

    @JsonProperty("northeast")
    private LatLng northeast;
    
    @JsonProperty("southwest")
    private LatLng southwest;

    public LatLng getNortheast() {
        return northeast;
    }

    public void setNortheast(LatLng northeast) {
        this.northeast = northeast;
    }

    public LatLng getSouthwest() {
        return southwest;
    }

    public void setSouthwest(LatLng southwest) {
        this.southwest = southwest;
    }

}
