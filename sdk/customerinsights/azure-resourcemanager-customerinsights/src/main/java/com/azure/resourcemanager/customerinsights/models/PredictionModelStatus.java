// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.resourcemanager.customerinsights.fluent.models.PredictionModelStatusInner;
import java.math.BigDecimal;

/** An immutable client-side representation of PredictionModelStatus. */
public interface PredictionModelStatus {
    /**
     * Gets the tenantId property: The hub name.
     *
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the predictionName property: The prediction name.
     *
     * @return the predictionName value.
     */
    String predictionName();

    /**
     * Gets the predictionGuidId property: The prediction GUID ID.
     *
     * @return the predictionGuidId value.
     */
    String predictionGuidId();

    /**
     * Gets the status property: Prediction model life cycle. When prediction is in PendingModelConfirmation status, it
     * is allowed to update the status to PendingFeaturing or Active through API.
     *
     * @return the status value.
     */
    PredictionModelLifeCycle status();

    /**
     * Gets the message property: The model status message.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the trainingSetCount property: Count of the training set.
     *
     * @return the trainingSetCount value.
     */
    Integer trainingSetCount();

    /**
     * Gets the testSetCount property: Count of the test set.
     *
     * @return the testSetCount value.
     */
    Integer testSetCount();

    /**
     * Gets the validationSetCount property: Count of the validation set.
     *
     * @return the validationSetCount value.
     */
    Integer validationSetCount();

    /**
     * Gets the trainingAccuracy property: The training accuracy.
     *
     * @return the trainingAccuracy value.
     */
    BigDecimal trainingAccuracy();

    /**
     * Gets the signalsUsed property: The signals used.
     *
     * @return the signalsUsed value.
     */
    Integer signalsUsed();

    /**
     * Gets the modelVersion property: Version of the model.
     *
     * @return the modelVersion value.
     */
    String modelVersion();

    /**
     * Gets the inner com.azure.resourcemanager.customerinsights.fluent.models.PredictionModelStatusInner object.
     *
     * @return the inner object.
     */
    PredictionModelStatusInner innerModel();
}