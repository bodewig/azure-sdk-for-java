// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.MetadataSyncConfigInner;

/** An instance of this class provides access to all the operations defined in SqlPoolMetadataSyncConfigsClient. */
public interface SqlPoolMetadataSyncConfigsClient {
    /**
     * Get the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata sync configuration for a SQL pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MetadataSyncConfigInner get(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Get the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata sync configuration for a SQL pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MetadataSyncConfigInner> getWithResponse(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context);

    /**
     * Set the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param metadataSyncConfiguration Metadata sync configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration for metadata sync.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MetadataSyncConfigInner create(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        MetadataSyncConfigInner metadataSyncConfiguration);

    /**
     * Set the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param metadataSyncConfiguration Metadata sync configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration for metadata sync.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MetadataSyncConfigInner> createWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        MetadataSyncConfigInner metadataSyncConfiguration,
        Context context);
}