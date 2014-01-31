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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Adrian Chia
 *
 */
public abstract class AbstractResponse {

    /**
     * a string indicating the status of the response. 
     * @see {@link Status}
     */
    @JsonProperty("status")
    private String status;

    /**
     * more detailed information about the reasons behind the given status code, if other than OK.
     */
    @JsonProperty("error_message")
    private String errorMessage;

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
