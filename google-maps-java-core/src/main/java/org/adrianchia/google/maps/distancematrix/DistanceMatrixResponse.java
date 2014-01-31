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
import java.util.List;

import org.adrianchia.google.maps.AbstractResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Distance Matrix Response from Distance Matrix API
 * @see <a href="https://developers.google.com/maps/documentation/distancematrix/">
 * https://developers.google.com/maps/documentation/distancematrix/</a>
 * 
 * @author Adrian Chia
 * 
 */
public class DistanceMatrixResponse extends AbstractResponse implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -5198623702558521162L;

    @JsonProperty("origin_addresses")
    private List<String> originAddresses;
    
    @JsonProperty("destination_addresses")
    private List<String> destinationAddresses;

    @JsonProperty("rows")
    private List<Row> rows;

    public List<String> getOriginAddresses() {
        return originAddresses;
    }

    public void setOriginAddresses(List<String> originAddresses) {
        this.originAddresses = originAddresses;
    }

    public List<String> getDestinationAddresses() {
        return destinationAddresses;
    }

    public void setDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

}
