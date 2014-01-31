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

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.adrianchia.google.maps.elevation.ElevationResponse;
import org.adrianchia.google.maps.geocoding.GeocodeResponse;

/**
 * JAX-RS Wrapper for the Google Elevation API
 * @see <a href="https://developers.google.com/maps/documentation/elevation/">
 * https://developers.google.com/maps/documentation/elevation/</a>
 * 
 * @author Adrian Chia
 *
 */
public class ElevationService implements MapsService {

    public static final String SERVICE_PATH = "/elevation";

    /**
     * Get Geocode Response as {@link GeocodeResponse} Object
     * @param locations one or more lat,lng, separated by | 
     * @param sensor specifies whether the application requesting data is using a sensor 
     *               (such as a GPS device) to determine the user's location. 
     *               Accepts true or false.
     */
    public ElevationResponse getAsEntity(String locations, boolean sensor) {
        if(locations == null) {
            throw new IllegalArgumentException("locations parameter is missing");
        }
        WebTarget target = client.target(BASE_URL + SERVICE_PATH + "/json");
        Response resp = target
                .queryParam("locations", locations)
                .queryParam("sensor", sensor)
                .request()
                .get();
        return resp.readEntity(ElevationResponse.class);
    }

}
