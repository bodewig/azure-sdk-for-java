// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of WorkflowRunActionRepetitionsRequestHistories. */
public interface WorkflowRunActionRepetitionsRequestHistories {
    /**
     * List a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workflow request histories.
     */
    PagedIterable<RequestHistory> list(
        String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName);

    /**
     * List a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workflow request histories.
     */
    PagedIterable<RequestHistory> list(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        Context context);

    /**
     * Gets a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param requestHistoryName The request history name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run repetition request history.
     */
    RequestHistory get(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        String requestHistoryName);

    /**
     * Gets a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param requestHistoryName The request history name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run repetition request history.
     */
    Response<RequestHistory> getWithResponse(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        String requestHistoryName,
        Context context);
}