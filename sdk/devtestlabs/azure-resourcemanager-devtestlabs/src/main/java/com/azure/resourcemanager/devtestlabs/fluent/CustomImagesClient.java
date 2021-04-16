// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.devtestlabs.fluent.models.CustomImageInner;
import com.azure.resourcemanager.devtestlabs.models.CustomImageFragment;

/** An instance of this class provides access to all the operations defined in CustomImagesClient. */
public interface CustomImagesClient {
    /**
     * List custom images in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomImageInner> list(String resourceGroupName, String labName);

    /**
     * List custom images in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param expand Specify the $expand query. Example: 'properties($select=vm)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomImageInner> list(
        String resourceGroupName,
        String labName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get custom image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the custom image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomImageInner get(String resourceGroupName, String labName, String name);

    /**
     * Get custom image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the custom image.
     * @param expand Specify the $expand query. Example: 'properties($select=vm)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomImageInner> getWithResponse(
        String resourceGroupName, String labName, String name, String expand, Context context);

    /**
     * Create or replace an existing custom image. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the custom image.
     * @param customImage A custom image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a custom image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CustomImageInner>, CustomImageInner> beginCreateOrUpdate(
        String resourceGroupName, String labName, String name, CustomImageInner customImage);

    /**
     * Create or replace an existing custom image. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the custom image.
     * @param customImage A custom image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a custom image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CustomImageInner>, CustomImageInner> beginCreateOrUpdate(
        String resourceGroupName, String labName, String name, CustomImageInner customImage, Context context);

    /**
     * Create or replace an existing custom image. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the custom image.
     * @param customImage A custom image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a custom image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomImageInner createOrUpdate(
        String resourceGroupName, String labName, String name, CustomImageInner customImage);

    /**
     * Create or replace an existing custom image. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the custom image.
     * @param customImage A custom image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a custom image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomImageInner createOrUpdate(
        String resourceGroupName, String labName, String name, CustomImageInner customImage, Context context);

    /**
     * Delete custom image. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the custom image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String labName, String name);

    /**
     * Delete custom image. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the custom image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String labName, String name, Context context);

    /**
     * Delete custom image. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the custom image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String labName, String name);

    /**
     * Delete custom image. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the custom image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String labName, String name, Context context);

    /**
     * Allows modifying tags of custom images. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the custom image.
     * @param customImage A custom image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a custom image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomImageInner update(String resourceGroupName, String labName, String name, CustomImageFragment customImage);

    /**
     * Allows modifying tags of custom images. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the custom image.
     * @param customImage A custom image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a custom image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomImageInner> updateWithResponse(
        String resourceGroupName, String labName, String name, CustomImageFragment customImage, Context context);
}