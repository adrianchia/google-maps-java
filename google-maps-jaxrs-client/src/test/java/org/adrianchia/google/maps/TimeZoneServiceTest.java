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

import java.util.logging.Logger;

import org.adrianchia.google.maps.timezone.TimeZoneResponse;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Adrian Chia
 *
 */
public class TimeZoneServiceTest extends TestBase {

    private static Logger log = Logger.getLogger(TimeZoneServiceTest.class.getName());
    private static TimeZoneService tzService = new TimeZoneService();

    @Test
    @Ignore
    public void testGetTimeZoneAsEntity() {        
        TimeZoneResponse tzResponse = tzService.getAsEntity(
                "29.85240200", "-95.504595500", 1391106797, false);
        assertEquals(Status.OK, tzResponse.getStatus());
    }

    @Test
    @Ignore
    public void testGetTimeZoneAsString() {
        String tzResponse = tzService.getAsString(
                "29.85240200", "-95.504595500", 1391106797, false, "json");
        assertNotNull(tzResponse);
        log.info(tzResponse);
    }
    
    @Test
    public void testToUnixTimeStamp() {
        long millis = 1391108198948L;
        long result = TimeZoneService.toUnixTimestamp(millis);
        assertEquals(1391108198L, result);
    }
}
