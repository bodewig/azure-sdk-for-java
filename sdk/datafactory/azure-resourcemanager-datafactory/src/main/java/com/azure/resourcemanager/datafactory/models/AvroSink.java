// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Avro sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AvroSink")
@Fluent
public final class AvroSink extends CopySink {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvroSink.class);

    /*
     * Avro store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreWriteSettings storeSettings;

    /*
     * Avro format settings.
     */
    @JsonProperty(value = "formatSettings")
    private AvroWriteSettings formatSettings;

    /**
     * Get the storeSettings property: Avro store settings.
     *
     * @return the storeSettings value.
     */
    public StoreWriteSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: Avro store settings.
     *
     * @param storeSettings the storeSettings value to set.
     * @return the AvroSink object itself.
     */
    public AvroSink withStoreSettings(StoreWriteSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: Avro format settings.
     *
     * @return the formatSettings value.
     */
    public AvroWriteSettings formatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: Avro format settings.
     *
     * @param formatSettings the formatSettings value to set.
     * @return the AvroSink object itself.
     */
    public AvroSink withFormatSettings(AvroWriteSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AvroSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AvroSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AvroSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AvroSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AvroSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (storeSettings() != null) {
            storeSettings().validate();
        }
        if (formatSettings() != null) {
            formatSettings().validate();
        }
    }
}