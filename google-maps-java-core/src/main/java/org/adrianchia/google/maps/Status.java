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

/**
 * @author Adrian Chia
 *
 */
public final class Status {

    /**
     * indicates that the request was successful. 
     */
    public static final String OK = "OK";
    
    /**
     * indicates that the request was malformed. 
     */
    public static final String INVALID_REQUEST = "INVALID_REQUEST";
    
    /**
     * indicates the requestor has exceeded quota. 
     */
    public static final String OVER_QUERY_LIMIT = "OVER_QUERY_LIMIT";
    
    /**
     * indicates that the the API did not complete the request. Confirm that the request was sent over http instead of https.
     */
    public static final String REQUEST_DENIED = "REQUEST_DENIED";
    
    /**
     * indicates an unknown error.
     */
    public static final String UNKNOWN_ERROR = "UNKNOWN_ERROR";
    
    /**
     * indicates that no time zone data could be found for the specified position or time. Confirm that the request is for a location on land, and not over water. 
     */
    public static final String ZERO_RESULTS = "ZERO_RESULTS";
    
    /**
     * Private Constructor to prevent being initialized. 
     */
	private Status() {
		
	}
	
}
