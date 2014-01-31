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

import org.adrianchia.google.maps.directions.DirectionsResponse;

/**
 * @author Adrian Chia
 *
 */
public class DirectionsService implements MapsService {
    
    public static final String SERVICE_PATH = "/directions";

    /**
     * Get Directions Response as {@link DirectionsResponse} Object
     * @param origins one or more lat,lng, separated by |
     * @param destinations one or more lat,lng, separated by |
     * @param sensor specifies whether the application requesting data is using a sensor 
     *               (such as a GPS device) to determine the user's location. 
     *               Accepts true or false.
     */
    public DirectionsResponse getAsEntity(
            final String origin, 
            final String destination, 
            final boolean sensor) {
        if(origin == null || destination == null) {
            throw new IllegalArgumentException("origins/destinations is missing");
        }
        WebTarget target = client.target(BASE_URL + SERVICE_PATH + "/json");
        Response resp = target
                .queryParam("origin", origin.replace(' ', '+'))
                .queryParam("destination", destination.replace(' ', '+'))
                .queryParam("sensor", sensor)
                .request()
                .get();
        return resp.readEntity(DirectionsResponse.class);
    }
}
