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

import org.adrianchia.google.maps.elevation.ElevationResponse;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author Adrian Chia
 *
 */
public class ElevationServiceIT extends TestBase {

    private static ElevationService elService = new ElevationService();

    @Test
    public void testGetAsEntity() throws JsonProcessingException {
        ElevationResponse elResponse = 
                elService.getAsEntity("39.7391536,-104.9847034", false);
        assertEquals(Status.OK, elResponse.getStatus());
        System.out.println(mapper.writeValueAsString(elResponse));
    }

}
