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

import org.adrianchia.google.maps.timezone.TimeZoneResponse;

/**
 * JAX-RS Client wrapper for the Google Time Zone API
 * @see <a href="https://developers.google.com/maps/documentation/timezone/">
 * https://developers.google.com/maps/documentation/timezone/</a>
 * 
 * @author Adrian Chia
 *
 */
public class TimeZoneService implements MapsService {

    public static final String SERVICE_PATH = "/timezone";
    public static final String ENDPOINT_URL = SECURE_BASE_URL + SERVICE_PATH;

    /**
     * Get Time Zone Response as {@link TimeZoneResponse} Object
     * @param latitude
     * @param longitude
     * @param timestamp specifies the desired time as seconds since midnight, January 1, 1970 UTC.
     *                  The Time Zone API uses the timestamp to determine whether or not 
     *                  Daylight Savings should be applied. 
     *                  Times before 1970 can be expressed as negative values.
     * @param sensor specifies whether the application requesting data is using a sensor 
     *               (such as a GPS device) to determine the user's location. 
     *               Accepts true or false.
     */
    public TimeZoneResponse getAsEntity(String latitude, String longitude, 
            long timestamp, boolean sensor) {
        if(latitude == null || longitude == null) {
            throw new IllegalArgumentException("Latitude and longitude is missing");
        }
        WebTarget target = client.target(ENDPOINT_URL + "/json");
        Response response = target
                .queryParam("location", latitude + "," +longitude)
                .queryParam("timestamp", timestamp)
                .queryParam("sensor", sensor)
                .request()
                .get();
        return response.readEntity(TimeZoneResponse.class);
    }

    /**
     * Convert miliseconds to unix timestamp.
     */
    public static long toUnixTimestamp(long millis) {
        return millis / 1000L;
    }

}
