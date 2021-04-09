// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeConnectionInfoInner;

/**
 * An instance of this class provides access to all the operations defined in IntegrationRuntimeConnectionInfosClient.
 */
public interface IntegrationRuntimeConnectionInfosClient {
    /**
     * Get connection info for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connection info for an integration runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationRuntimeConnectionInfoInner get(
        String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Get connection info for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connection info for an integration runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IntegrationRuntimeConnectionInfoInner> getWithResponse(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);
}