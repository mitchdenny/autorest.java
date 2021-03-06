/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureresource.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The FlattenedProductInner model.
 */
@JsonFlatten
@SkipParentValidation
public class FlattenedProductInner extends Resource {
    /**
     * The pname property.
     */
    @JsonProperty(value = "properties.pname")
    private String pname;

    /**
     * The lsize property.
     */
    @JsonProperty(value = "properties.lsize")
    private Integer lsize;

    /**
     * The provisioningState property.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the pname value.
     *
     * @return the pname value
     */
    public String pname() {
        return this.pname;
    }

    /**
     * Set the pname value.
     *
     * @param pname the pname value to set
     * @return the FlattenedProductInner object itself.
     */
    public FlattenedProductInner withPname(String pname) {
        this.pname = pname;
        return this;
    }

    /**
     * Get the lsize value.
     *
     * @return the lsize value
     */
    public Integer lsize() {
        return this.lsize;
    }

    /**
     * Set the lsize value.
     *
     * @param lsize the lsize value to set
     * @return the FlattenedProductInner object itself.
     */
    public FlattenedProductInner withLsize(Integer lsize) {
        this.lsize = lsize;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the FlattenedProductInner object itself.
     */
    public FlattenedProductInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
