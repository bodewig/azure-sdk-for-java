// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.resourcemanager.billing.fluent.models.BillingPermissionsPropertiesInner;
import com.azure.resourcemanager.billing.fluent.models.BillingRoleDefinitionInner;
import com.azure.resourcemanager.billing.models.BillingPermissionsProperties;
import com.azure.resourcemanager.billing.models.BillingRoleDefinition;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class BillingRoleDefinitionImpl implements BillingRoleDefinition {
    private BillingRoleDefinitionInner innerObject;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    BillingRoleDefinitionImpl(
        BillingRoleDefinitionInner innerObject, com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String description() {
        return this.innerModel().description();
    }

    public List<BillingPermissionsProperties> permissions() {
        List<BillingPermissionsPropertiesInner> inner = this.innerModel().permissions();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new BillingPermissionsPropertiesImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String roleName() {
        return this.innerModel().roleName();
    }

    public BillingRoleDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}