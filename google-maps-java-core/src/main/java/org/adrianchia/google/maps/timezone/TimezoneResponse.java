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
package org.adrianchia.google.maps.timezone;

import java.io.Serializable;

/**
 * Time Zone Response from TimeZone API
 * 
 * @author Adrian Chia
 */
public class TimezoneResponse implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -1124356138520506831L;

    /**
     * The offset for daylight-savings time in seconds. This will be zero if the time zone is not in Daylight Savings Time during the specified timestamp.
     */
    private float dstOffset;

    /**
     * The offset from UTC (in seconds) for the given location. This does not take into effect daylight savings. 
     */
    private float rawOffset;

    private String timeZoneId;

    private String timeZoneName;

    private String status;

    private String errorMessage;

    public TimezoneResponse() {

    }

    public float getDstOffset() {
        return dstOffset;
    }

    public void setDstOffset(float dstOffset) {
        this.dstOffset = dstOffset;
    }

    public float getRawOffset() {
        return rawOffset;
    }

    public void setRawOffset(float rawOffset) {
        this.rawOffset = rawOffset;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public String getTimeZoneName() {
        return timeZoneName;
    }

    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
