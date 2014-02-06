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

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.adrianchia.google.maps.geocoding.GeocodeResponse;
import org.adrianchia.google.maps.timezone.TimeZoneResponse;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Adrian Chia
 *
 */
public class UrlFetchTest {

    private static final String HOST_NAME = "maps.googleapis.com";
    private static final String API_PATH = "/maps/api";
    private static final String TIMEZONE_SERVICE_PATH = "/timezone";
    private static final String GEOCODE_SERVICE_PATH = "/geocode";
    private static final String HTTP = "http";
    private static final String HTTPS = "https";

    @Test
    public void testTimeZone() {
        try {

            URL url = new URL(HTTPS, HOST_NAME, API_PATH + TIMEZONE_SERVICE_PATH + "/json?location=29.85240200,-95.504595500&timestamp=1391106797&sensor=false");
            InputStream in = url.openStream();
            ObjectMapper mapper = new ObjectMapper();
            TimeZoneResponse tzResponse = mapper.readValue(in, TimeZoneResponse.class);
            System.out.println(mapper.writeValueAsString(tzResponse));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            fail("TestTimeZone (MalformedURLException)");
        } catch (IOException e) {
            e.printStackTrace();
            fail("TestTimeZone (IOException)");
        }
    }
    
    @Test
    public void testGeocodeHttp() {
        try {

            URL url = new URL(HTTP, HOST_NAME, API_PATH + GEOCODE_SERVICE_PATH + "/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&sensor=false");
            InputStream in = url.openStream();
            ObjectMapper mapper = new ObjectMapper();
            GeocodeResponse gcResponse = mapper.readValue(in, GeocodeResponse.class);
            System.out.println(mapper.writeValueAsString(gcResponse));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            fail("testGeocodeHttp (MalformedURLException)");
        } catch (IOException e) {
            e.printStackTrace();
            fail("testGeocodeHttp (IOException)");
        }
    }
    
    @Test
    public void testGeocodeHttps() {
        try {

            URL url = new URL(HTTPS, HOST_NAME, API_PATH + GEOCODE_SERVICE_PATH + "/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&sensor=false");
            InputStream in = url.openStream();
            ObjectMapper mapper = new ObjectMapper();
            GeocodeResponse gcResponse = mapper.readValue(in, GeocodeResponse.class);
            System.out.println(mapper.writeValueAsString(gcResponse));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            fail("testGeocodeHttps (MalformedURLException)");
        } catch (IOException e) {
            e.printStackTrace();
            fail("testGeocodeHttps (IOException)");
        }
    }
}
