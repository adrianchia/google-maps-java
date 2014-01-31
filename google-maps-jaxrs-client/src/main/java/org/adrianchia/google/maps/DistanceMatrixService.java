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

import org.adrianchia.google.maps.distancematrix.DistanceMatrixResponse;

/**
 * JAX-RS Client Wrapper for the Google Distance Matrix API.
 * @see <a href="https://developers.google.com/maps/documentation/distancematrix/">
 * https://developers.google.com/maps/documentation/distancematrix/</a>
 * 
 * @author Adrian Chia
 *
 */
public class DistanceMatrixService implements MapsService {

    public static final String SERVICE_PATH = "/distancematrix";
    
    public DistanceMatrixResponse getAsEntity(String origins, 
            String destinations, boolean sensor) {
        if(origins == null || destinations == null) {
            throw new IllegalArgumentException("origins/destinations is missing");
        }
        WebTarget target = client.target(BASE_URL + SERVICE_PATH + "/json");
        Response resp = target
                .queryParam("origins", origins.replace(' ', '+'))
                .queryParam("destinations", destinations.replace(' ', '+'))
                .queryParam("sensor", sensor)
                .request()
                .get();
        return resp.readEntity(DistanceMatrixResponse.class);
    }

}
