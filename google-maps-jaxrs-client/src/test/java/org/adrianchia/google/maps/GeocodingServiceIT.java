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

import org.adrianchia.google.maps.geocoding.GeocodeResponse;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author Adrian Chia
 *
 */
public class GeocodingServiceIT extends TestBase {

    private static GeocodingService gcService= new GeocodingService();
    
    @Test
    public void testGetAddrEntity() throws JsonProcessingException {
        GeocodeResponse gcResponse = gcService.getAsEntity("1600+Amphitheatre+Parkway,+Mountain+View,+CA", false);
        assertEquals(Status.OK, gcResponse.getStatus());
        System.out.println(mapper.writeValueAsString(gcResponse));
    }
    
    @Test
    public void testGetLatlngEntity() throws JsonProcessingException {
        GeocodeResponse gcResponse = gcService.getAsEntity("40.714224", "-73.961452", false);
        assertEquals(Status.OK, gcResponse.getStatus());
        System.out.println(mapper.writeValueAsString(gcResponse));
    }

}
