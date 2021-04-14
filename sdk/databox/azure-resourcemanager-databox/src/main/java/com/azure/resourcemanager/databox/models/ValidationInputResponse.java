// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Minimum properties that should be present in each individual validation response. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "validationType",
    defaultImpl = ValidationInputResponse.class)
@JsonTypeName("ValidationInputResponse")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ValidateAddress", value = AddressValidationProperties.class),
    @JsonSubTypes.Type(
        name = "ValidateCreateOrderLimit",
        value = CreateOrderLimitForSubscriptionValidationResponseProperties.class),
    @JsonSubTypes.Type(
        name = "ValidateDataTransferDetails",
        value = DataTransferDetailsValidationResponseProperties.class),
    @JsonSubTypes.Type(name = "ValidatePreferences", value = PreferencesValidationResponseProperties.class),
    @JsonSubTypes.Type(name = "ValidateSkuAvailability", value = SkuAvailabilityValidationResponseProperties.class),
    @JsonSubTypes.Type(
        name = "ValidateSubscriptionIsAllowedToCreateJob",
        value = SubscriptionIsAllowedToCreateJobValidationResponseProperties.class)
})
@Immutable
public class ValidationInputResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidationInputResponse.class);

    /*
     * Error code and message of validation response.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private CloudError error;

    /**
     * Get the error property: Error code and message of validation response.
     *
     * @return the error value.
     */
    public CloudError error() {
        return this.error;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
    }
}