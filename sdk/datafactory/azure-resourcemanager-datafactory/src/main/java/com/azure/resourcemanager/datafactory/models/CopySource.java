// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

/** A copy activity source. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = CopySource.class)
@JsonTypeName("CopySource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AvroSource", value = AvroSource.class),
    @JsonSubTypes.Type(name = "ExcelSource", value = ExcelSource.class),
    @JsonSubTypes.Type(name = "ParquetSource", value = ParquetSource.class),
    @JsonSubTypes.Type(name = "DelimitedTextSource", value = DelimitedTextSource.class),
    @JsonSubTypes.Type(name = "JsonSource", value = JsonSource.class),
    @JsonSubTypes.Type(name = "XmlSource", value = XmlSource.class),
    @JsonSubTypes.Type(name = "OrcSource", value = OrcSource.class),
    @JsonSubTypes.Type(name = "BinarySource", value = BinarySource.class),
    @JsonSubTypes.Type(name = "TabularSource", value = TabularSource.class),
    @JsonSubTypes.Type(name = "BlobSource", value = BlobSource.class),
    @JsonSubTypes.Type(name = "DocumentDbCollectionSource", value = DocumentDbCollectionSource.class),
    @JsonSubTypes.Type(name = "CosmosDbSqlApiSource", value = CosmosDbSqlApiSource.class),
    @JsonSubTypes.Type(name = "DynamicsSource", value = DynamicsSource.class),
    @JsonSubTypes.Type(name = "DynamicsCrmSource", value = DynamicsCrmSource.class),
    @JsonSubTypes.Type(name = "CommonDataServiceForAppsSource", value = CommonDataServiceForAppsSource.class),
    @JsonSubTypes.Type(name = "RelationalSource", value = RelationalSource.class),
    @JsonSubTypes.Type(name = "MicrosoftAccessSource", value = MicrosoftAccessSource.class),
    @JsonSubTypes.Type(name = "ODataSource", value = ODataSource.class),
    @JsonSubTypes.Type(name = "SalesforceServiceCloudSource", value = SalesforceServiceCloudSource.class),
    @JsonSubTypes.Type(name = "RestSource", value = RestSource.class),
    @JsonSubTypes.Type(name = "FileSystemSource", value = FileSystemSource.class),
    @JsonSubTypes.Type(name = "HdfsSource", value = HdfsSource.class),
    @JsonSubTypes.Type(name = "AzureDataExplorerSource", value = AzureDataExplorerSource.class),
    @JsonSubTypes.Type(name = "OracleSource", value = OracleSource.class),
    @JsonSubTypes.Type(name = "WebSource", value = WebSource.class),
    @JsonSubTypes.Type(name = "MongoDbSource", value = MongoDbSource.class),
    @JsonSubTypes.Type(name = "MongoDbAtlasSource", value = MongoDbAtlasSource.class),
    @JsonSubTypes.Type(name = "MongoDbV2Source", value = MongoDbV2Source.class),
    @JsonSubTypes.Type(name = "CosmosDbMongoDbApiSource", value = CosmosDbMongoDbApiSource.class),
    @JsonSubTypes.Type(name = "Office365Source", value = Office365Source.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStoreSource", value = AzureDataLakeStoreSource.class),
    @JsonSubTypes.Type(name = "AzureBlobFSSource", value = AzureBlobFSSource.class),
    @JsonSubTypes.Type(name = "HttpSource", value = HttpSource.class),
    @JsonSubTypes.Type(name = "SnowflakeSource", value = SnowflakeSource.class),
    @JsonSubTypes.Type(name = "AzureDatabricksDeltaLakeSource", value = AzureDatabricksDeltaLakeSource.class),
    @JsonSubTypes.Type(name = "SharePointOnlineListSource", value = SharePointOnlineListSource.class)
})
@Fluent
public class CopySource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CopySource.class);

    /*
     * Source retry count. Type: integer (or Expression with resultType
     * integer).
     */
    @JsonProperty(value = "sourceRetryCount")
    private Object sourceRetryCount;

    /*
     * Source retry wait. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "sourceRetryWait")
    private Object sourceRetryWait;

    /*
     * The maximum concurrent connection count for the source data store. Type:
     * integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "maxConcurrentConnections")
    private Object maxConcurrentConnections;

    /*
     * A copy activity source.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the sourceRetryCount property: Source retry count. Type: integer (or Expression with resultType integer).
     *
     * @return the sourceRetryCount value.
     */
    public Object sourceRetryCount() {
        return this.sourceRetryCount;
    }

    /**
     * Set the sourceRetryCount property: Source retry count. Type: integer (or Expression with resultType integer).
     *
     * @param sourceRetryCount the sourceRetryCount value to set.
     * @return the CopySource object itself.
     */
    public CopySource withSourceRetryCount(Object sourceRetryCount) {
        this.sourceRetryCount = sourceRetryCount;
        return this;
    }

    /**
     * Get the sourceRetryWait property: Source retry wait. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the sourceRetryWait value.
     */
    public Object sourceRetryWait() {
        return this.sourceRetryWait;
    }

    /**
     * Set the sourceRetryWait property: Source retry wait. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param sourceRetryWait the sourceRetryWait value to set.
     * @return the CopySource object itself.
     */
    public CopySource withSourceRetryWait(Object sourceRetryWait) {
        this.sourceRetryWait = sourceRetryWait;
        return this;
    }

    /**
     * Get the maxConcurrentConnections property: The maximum concurrent connection count for the source data store.
     * Type: integer (or Expression with resultType integer).
     *
     * @return the maxConcurrentConnections value.
     */
    public Object maxConcurrentConnections() {
        return this.maxConcurrentConnections;
    }

    /**
     * Set the maxConcurrentConnections property: The maximum concurrent connection count for the source data store.
     * Type: integer (or Expression with resultType integer).
     *
     * @param maxConcurrentConnections the maxConcurrentConnections value to set.
     * @return the CopySource object itself.
     */
    public CopySource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        this.maxConcurrentConnections = maxConcurrentConnections;
        return this;
    }

    /**
     * Get the additionalProperties property: A copy activity source.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: A copy activity source.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the CopySource object itself.
     */
    public CopySource withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}