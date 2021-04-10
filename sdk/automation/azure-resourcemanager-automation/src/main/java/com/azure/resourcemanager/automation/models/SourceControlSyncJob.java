// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of SourceControlSyncJob. */
public interface SourceControlSyncJob {
    /**
     * Gets the name property: Resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the id property: Resource id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the sourceControlSyncJobId property: The source control sync job id.
     *
     * @return the sourceControlSyncJobId value.
     */
    String sourceControlSyncJobId();

    /**
     * Gets the creationTime property: The creation time of the job.
     *
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the provisioningState property: The provisioning state of the job.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the startTime property: The start time of the job.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: The end time of the job.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the syncType property: The sync type.
     *
     * @return the syncType value.
     */
    SyncType syncType();

    /**
     * Gets the inner com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobInner object.
     *
     * @return the inner object.
     */
    SourceControlSyncJobInner innerModel();

    /** The entirety of the SourceControlSyncJob definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCommitId,
            DefinitionStages.WithCreate {
    }
    /** The SourceControlSyncJob definition stages. */
    interface DefinitionStages {
        /** The first stage of the SourceControlSyncJob definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the SourceControlSyncJob definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, automationAccountName, sourceControlName.
             *
             * @param resourceGroupName Name of an Azure Resource group.
             * @param automationAccountName The name of the automation account.
             * @param sourceControlName The source control name.
             * @return the next definition stage.
             */
            WithCommitId withExistingSourceControl(
                String resourceGroupName, String automationAccountName, String sourceControlName);
        }
        /** The stage of the SourceControlSyncJob definition allowing to specify commitId. */
        interface WithCommitId {
            /**
             * Specifies the commitId property: The commit id of the source control sync job. If not syncing to a
             * commitId, enter an empty string..
             *
             * @param commitId The commit id of the source control sync job. If not syncing to a commitId, enter an
             *     empty string.
             * @return the next definition stage.
             */
            WithCreate withCommitId(String commitId);
        }
        /**
         * The stage of the SourceControlSyncJob definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SourceControlSyncJob create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SourceControlSyncJob create(Context context);
        }
    }
}