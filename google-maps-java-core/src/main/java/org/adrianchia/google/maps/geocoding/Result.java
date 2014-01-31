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
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result returned from GeocodeResponse.
 * 
 * @author Adrian Chia
 *
 */
public class Result implements Serializable {

    private static final long serialVersionUID = 1441258739101534144L;

    @JsonProperty("address_components")
    private List<AddressComponent> addressComponents;

    @JsonProperty("formatted_address")
    private String formattedAddress;
    
    @JsonProperty("postcode_localities")
    private List<String> postcodeLocalities;
    
    @JsonProperty("geometry")
    private Geometry geometry;
    
    @JsonProperty("types")
    private List<String> types;
    
    @JsonProperty("partial_match")
    private boolean partialMatch;

    public List<AddressComponent> getAddressComponents() {
        return addressComponents;
    }

    public void setAddressComponents(List<AddressComponent> addressComponents) {
        this.addressComponents = addressComponents;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public List<String> getPostcodeLocalities() {
        return postcodeLocalities;
    }

    public void setPostcodeLocalities(List<String> postcodeLocalities) {
        this.postcodeLocalities = postcodeLocalities;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public boolean isPartialMatch() {
        return partialMatch;
    }

    public void setPartialMatch(boolean partialMatch) {
        this.partialMatch = partialMatch;
    }

}
