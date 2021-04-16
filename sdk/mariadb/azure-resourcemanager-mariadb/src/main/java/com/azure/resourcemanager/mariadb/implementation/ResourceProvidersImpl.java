// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mariadb.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.mariadb.fluent.models.QueryPerformanceInsightResetDataResultInner;
import com.azure.resourcemanager.mariadb.models.QueryPerformanceInsightResetDataResult;
import com.azure.resourcemanager.mariadb.models.ResourceProviders;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResourceProvidersImpl implements ResourceProviders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final com.azure.resourcemanager.mariadb.MariaDBManager serviceManager;

    public ResourceProvidersImpl(
        ResourceProvidersClient innerClient, com.azure.resourcemanager.mariadb.MariaDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public QueryPerformanceInsightResetDataResult resetQueryPerformanceInsightData(
        String resourceGroupName, String serverName) {
        QueryPerformanceInsightResetDataResultInner inner =
            this.serviceClient().resetQueryPerformanceInsightData(resourceGroupName, serverName);
        if (inner != null) {
            return new QueryPerformanceInsightResetDataResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<QueryPerformanceInsightResetDataResult> resetQueryPerformanceInsightDataWithResponse(
        String resourceGroupName, String serverName, Context context) {
        Response<QueryPerformanceInsightResetDataResultInner> inner =
            this.serviceClient().resetQueryPerformanceInsightDataWithResponse(resourceGroupName, serverName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QueryPerformanceInsightResetDataResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void createRecommendedActionSession(
        String resourceGroupName, String serverName, String advisorName, String databaseName) {
        this.serviceClient().createRecommendedActionSession(resourceGroupName, serverName, advisorName, databaseName);
    }

    public void createRecommendedActionSession(
        String resourceGroupName, String serverName, String advisorName, String databaseName, Context context) {
        this
            .serviceClient()
            .createRecommendedActionSession(resourceGroupName, serverName, advisorName, databaseName, context);
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mariadb.MariaDBManager manager() {
        return this.serviceManager;
    }
}