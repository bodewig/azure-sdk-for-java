// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the role profile for the cloud service. */
@Fluent
public final class CloudServiceRoleProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudServiceRoleProfile.class);

    /*
     * List of roles for the cloud service.
     */
    @JsonProperty(value = "roles")
    private List<CloudServiceRoleProfileProperties> roles;

    /**
     * Get the roles property: List of roles for the cloud service.
     *
     * @return the roles value.
     */
    public List<CloudServiceRoleProfileProperties> roles() {
        return this.roles;
    }

    /**
     * Set the roles property: List of roles for the cloud service.
     *
     * @param roles the roles value to set.
     * @return the CloudServiceRoleProfile object itself.
     */
    public CloudServiceRoleProfile withRoles(List<CloudServiceRoleProfileProperties> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roles() != null) {
            roles().forEach(e -> e.validate());
        }
    }
}