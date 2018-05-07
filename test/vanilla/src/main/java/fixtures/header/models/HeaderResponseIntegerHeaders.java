/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for responseInteger operation.
 */
public class HeaderResponseIntegerHeaders {
    /**
     * response with header value "value": 1 or -2.
     */
    @JsonProperty(value = "value")
    private Integer value;

    /**
     * Get response with header value "value": 1 or -2.
     *
     * @return the value value
     */
    public Integer value() {
        return this.value;
    }

    /**
     * Set response with header value "value": 1 or -2.
     *
     * @param value the value value to set
     * @return the HeaderResponseIntegerHeaders object itself.
     */
    public HeaderResponseIntegerHeaders withValue(Integer value) {
        this.value = value;
        return this;
    }

}
