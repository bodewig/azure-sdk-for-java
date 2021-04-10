// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.CredentialInner;
import com.azure.resourcemanager.automation.models.Credential;
import com.azure.resourcemanager.automation.models.CredentialCreateOrUpdateParameters;
import com.azure.resourcemanager.automation.models.CredentialUpdateParameters;
import java.time.OffsetDateTime;

public final class CredentialImpl implements Credential, Credential.Definition, Credential.Update {
    private CredentialInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String username() {
        return this.innerModel().username();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public String description() {
        return this.innerModel().description();
    }

    public CredentialInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String automationAccountName;

    private String credentialName;

    private CredentialCreateOrUpdateParameters createParameters;

    private CredentialUpdateParameters updateParameters;

    public CredentialImpl withExistingAutomationAccount(String resourceGroupName, String automationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.automationAccountName = automationAccountName;
        return this;
    }

    public Credential create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCredentials()
                .createOrUpdateWithResponse(
                    resourceGroupName, automationAccountName, credentialName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Credential create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCredentials()
                .createOrUpdateWithResponse(
                    resourceGroupName, automationAccountName, credentialName, createParameters, context)
                .getValue();
        return this;
    }

    CredentialImpl(String name, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = new CredentialInner();
        this.serviceManager = serviceManager;
        this.credentialName = name;
        this.createParameters = new CredentialCreateOrUpdateParameters();
    }

    public CredentialImpl update() {
        this.updateParameters = new CredentialUpdateParameters();
        return this;
    }

    public Credential apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCredentials()
                .updateWithResponse(
                    resourceGroupName, automationAccountName, credentialName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Credential apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCredentials()
                .updateWithResponse(resourceGroupName, automationAccountName, credentialName, updateParameters, context)
                .getValue();
        return this;
    }

    CredentialImpl(CredentialInner innerObject, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.automationAccountName = Utils.getValueFromIdByName(innerObject.id(), "automationAccounts");
        this.credentialName = Utils.getValueFromIdByName(innerObject.id(), "credentials");
    }

    public Credential refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCredentials()
                .getWithResponse(resourceGroupName, automationAccountName, credentialName, Context.NONE)
                .getValue();
        return this;
    }

    public Credential refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCredentials()
                .getWithResponse(resourceGroupName, automationAccountName, credentialName, context)
                .getValue();
        return this;
    }

    public CredentialImpl withName(String name) {
        if (isInCreateMode()) {
            this.createParameters.withName(name);
            return this;
        } else {
            this.updateParameters.withName(name);
            return this;
        }
    }

    public CredentialImpl withUsername(String username) {
        if (isInCreateMode()) {
            this.createParameters.withUsername(username);
            return this;
        } else {
            this.updateParameters.withUsername(username);
            return this;
        }
    }

    public CredentialImpl withPassword(String password) {
        if (isInCreateMode()) {
            this.createParameters.withPassword(password);
            return this;
        } else {
            this.updateParameters.withPassword(password);
            return this;
        }
    }

    public CredentialImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.createParameters.withDescription(description);
            return this;
        } else {
            this.updateParameters.withDescription(description);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}