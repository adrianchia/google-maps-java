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

import org.adrianchia.google.maps.geocoding.GeocodeResponse;

/**
 * JAX-RS Client Wrapper for the Google Geocoding API.
 * @see <a href="https://developers.google.com/maps/documentation/geocoding/">
 * https://developers.google.com/maps/documentation/geocoding/</a>
 * 
 * @author Adrian Chia
 *
 */
public class GeocodingService implements MapsService {

    public static final String SERVICE_PATH = "/geocode";

    /**
     * Get Geocode Response as {@link GeocodeResponse} Object
     * @param address
     * @param sensor specifies whether the application requesting data is using a sensor 
     *               (such as a GPS device) to determine the user's location. 
     *               Accepts true or false.
     */
    public GeocodeResponse getAsEntity(String address, boolean sensor) {
        if(address == null) {
            throw new IllegalArgumentException("address is missing");
        }
        WebTarget target = client.target(BASE_URL + SERVICE_PATH + "/json");
        Response resp = target
                .queryParam("address", address.replace(' ', '+'))
                .queryParam("sensor", sensor)
                .request()
                .get();
        return resp.readEntity(GeocodeResponse.class);
    }

    /**
     * Get Geocode Response as {@link GeocodeResponse} Object
     * @param latitude
     * @param longitude
     * @param sensor specifies whether the application requesting data is using a sensor 
     *               (such as a GPS device) to determine the user's location. 
     *               Accepts true or false.
     */
    public GeocodeResponse getAsEntity(String latitude, String longitude, boolean sensor) {
        if(latitude == null || longitude == null) {
            throw new IllegalArgumentException("address is missing");
        }
        WebTarget target = client.target(BASE_URL + SERVICE_PATH + "/json");
        Response resp = target
                .queryParam("latlng", latitude + "," + longitude)
                .queryParam("sensor", sensor)
                .request()
                .get();
        return resp.readEntity(GeocodeResponse.class);
    }

}
