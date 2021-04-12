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

/** Azure data lake store read settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataLakeStoreReadSettings")
@Fluent
public final class AzureDataLakeStoreReadSettings extends StoreReadSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureDataLakeStoreReadSettings.class);

    /*
     * If true, files under the folder path will be read recursively. Default
     * is true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "recursive")
    private Object recursive;

    /*
     * ADLS wildcardFolderPath. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "wildcardFolderPath")
    private Object wildcardFolderPath;

    /*
     * ADLS wildcardFileName. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "wildcardFileName")
    private Object wildcardFileName;

    /*
     * Point to a text file that lists each file (relative path to the path
     * configured in the dataset) that you want to copy. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "fileListPath")
    private Object fileListPath;

    /*
     * Lists files after the value (exclusive) based on file/folder names’
     * lexicographical order. Applies under the folderPath in data set, and
     * filter files/sub-folders under the folderPath. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "listAfter")
    private Object listAfter;

    /*
     * Lists files before the value (inclusive) based on file/folder names’
     * lexicographical order. Applies under the folderPath in data set, and
     * filter files/sub-folders under the folderPath. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "listBefore")
    private Object listBefore;

    /*
     * Indicates whether to enable partition discovery.
     */
    @JsonProperty(value = "enablePartitionDiscovery")
    private Boolean enablePartitionDiscovery;

    /*
     * Specify the root path where partition discovery starts from. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "partitionRootPath")
    private Object partitionRootPath;

    /*
     * Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "deleteFilesAfterCompletion")
    private Object deleteFilesAfterCompletion;

    /*
     * The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeStart")
    private Object modifiedDatetimeStart;

    /*
     * The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeEnd")
    private Object modifiedDatetimeEnd;

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the recursive value.
     */
    public Object recursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param recursive the recursive value to set.
     * @return the AzureDataLakeStoreReadSettings object itself.
     */
    public AzureDataLakeStoreReadSettings withRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the wildcardFolderPath property: ADLS wildcardFolderPath. Type: string (or Expression with resultType
     * string).
     *
     * @return the wildcardFolderPath value.
     */
    public Object wildcardFolderPath() {
        return this.wildcardFolderPath;
    }

    /**
     * Set the wildcardFolderPath property: ADLS wildcardFolderPath. Type: string (or Expression with resultType
     * string).
     *
     * @param wildcardFolderPath the wildcardFolderPath value to set.
     * @return the AzureDataLakeStoreReadSettings object itself.
     */
    public AzureDataLakeStoreReadSettings withWildcardFolderPath(Object wildcardFolderPath) {
        this.wildcardFolderPath = wildcardFolderPath;
        return this;
    }

    /**
     * Get the wildcardFileName property: ADLS wildcardFileName. Type: string (or Expression with resultType string).
     *
     * @return the wildcardFileName value.
     */
    public Object wildcardFileName() {
        return this.wildcardFileName;
    }

    /**
     * Set the wildcardFileName property: ADLS wildcardFileName. Type: string (or Expression with resultType string).
     *
     * @param wildcardFileName the wildcardFileName value to set.
     * @return the AzureDataLakeStoreReadSettings object itself.
     */
    public AzureDataLakeStoreReadSettings withWildcardFileName(Object wildcardFileName) {
        this.wildcardFileName = wildcardFileName;
        return this;
    }

    /**
     * Get the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     *
     * @return the fileListPath value.
     */
    public Object fileListPath() {
        return this.fileListPath;
    }

    /**
     * Set the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     *
     * @param fileListPath the fileListPath value to set.
     * @return the AzureDataLakeStoreReadSettings object itself.
     */
    public AzureDataLakeStoreReadSettings withFileListPath(Object fileListPath) {
        this.fileListPath = fileListPath;
        return this;
    }

    /**
     * Get the listAfter property: Lists files after the value (exclusive) based on file/folder names’ lexicographical
     * order. Applies under the folderPath in data set, and filter files/sub-folders under the folderPath. Type: string
     * (or Expression with resultType string).
     *
     * @return the listAfter value.
     */
    public Object listAfter() {
        return this.listAfter;
    }

    /**
     * Set the listAfter property: Lists files after the value (exclusive) based on file/folder names’ lexicographical
     * order. Applies under the folderPath in data set, and filter files/sub-folders under the folderPath. Type: string
     * (or Expression with resultType string).
     *
     * @param listAfter the listAfter value to set.
     * @return the AzureDataLakeStoreReadSettings object itself.
     */
    public AzureDataLakeStoreReadSettings withListAfter(Object listAfter) {
        this.listAfter = listAfter;
        return this;
    }

    /**
     * Get the listBefore property: Lists files before the value (inclusive) based on file/folder names’ lexicographical
     * order. Applies under the folderPath in data set, and filter files/sub-folders under the folderPath. Type: string
     * (or Expression with resultType string).
     *
     * @return the listBefore value.
     */
    public Object listBefore() {
        return this.listBefore;
    }

    /**
     * Set the listBefore property: Lists files before the value (inclusive) based on file/folder names’ lexicographical
     * order. Applies under the folderPath in data set, and filter files/sub-folders under the folderPath. Type: string
     * (or Expression with resultType string).
     *
     * @param listBefore the listBefore value to set.
     * @return the AzureDataLakeStoreReadSettings object itself.
     */
    public AzureDataLakeStoreReadSettings withListBefore(Object listBefore) {
        this.listBefore = listBefore;
        return this;
    }

    /**
     * Get the enablePartitionDiscovery property: Indicates whether to enable partition discovery.
     *
     * @return the enablePartitionDiscovery value.
     */
    public Boolean enablePartitionDiscovery() {
        return this.enablePartitionDiscovery;
    }

    /**
     * Set the enablePartitionDiscovery property: Indicates whether to enable partition discovery.
     *
     * @param enablePartitionDiscovery the enablePartitionDiscovery value to set.
     * @return the AzureDataLakeStoreReadSettings object itself.
     */
    public AzureDataLakeStoreReadSettings withEnablePartitionDiscovery(Boolean enablePartitionDiscovery) {
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        return this;
    }

    /**
     * Get the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     *
     * @return the partitionRootPath value.
     */
    public Object partitionRootPath() {
        return this.partitionRootPath;
    }

    /**
     * Set the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     *
     * @param partitionRootPath the partitionRootPath value to set.
     * @return the AzureDataLakeStoreReadSettings object itself.
     */
    public AzureDataLakeStoreReadSettings withPartitionRootPath(Object partitionRootPath) {
        this.partitionRootPath = partitionRootPath;
        return this;
    }

    /**
     * Get the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the deleteFilesAfterCompletion value.
     */
    public Object deleteFilesAfterCompletion() {
        return this.deleteFilesAfterCompletion;
    }

    /**
     * Set the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param deleteFilesAfterCompletion the deleteFilesAfterCompletion value to set.
     * @return the AzureDataLakeStoreReadSettings object itself.
     */
    public AzureDataLakeStoreReadSettings withDeleteFilesAfterCompletion(Object deleteFilesAfterCompletion) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @return the modifiedDatetimeStart value.
     */
    public Object modifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the AzureDataLakeStoreReadSettings object itself.
     */
    public AzureDataLakeStoreReadSettings withModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @return the modifiedDatetimeEnd value.
     */
    public Object modifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the AzureDataLakeStoreReadSettings object itself.
     */
    public AzureDataLakeStoreReadSettings withModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreReadSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
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
    }
}