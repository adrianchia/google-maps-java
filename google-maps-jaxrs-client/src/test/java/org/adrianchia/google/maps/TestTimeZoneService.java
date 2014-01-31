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

import org.junit.Test;

/**
 * @author Adrian Chia
 *
 */
public class TestTimeZoneService {

    @Test
    public void testToUnixTimeStamp() {
        long millis = 1391108198948L;
        long result = TimeZoneService.toUnixTimestamp(millis);
        assertEquals(1391108198L, result);
    }
}
