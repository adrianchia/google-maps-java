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
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.adrianchia.google.maps.AbstractResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Elevation Response from Elevation API
 * 
 * @author Adrian Chia
 * 
 */
@XmlRootElement
public class ElevationResponse extends AbstractResponse implements Serializable {

    private static final long serialVersionUID = -20698817716478080L;

    @JsonProperty("results")
    private List<Result> results;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}
