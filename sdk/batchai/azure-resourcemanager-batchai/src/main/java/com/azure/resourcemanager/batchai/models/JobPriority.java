// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for JobPriority. */
public final class JobPriority extends ExpandableStringEnum<JobPriority> {
    /** Static value low for JobPriority. */
    public static final JobPriority LOW = fromString("low");

    /** Static value normal for JobPriority. */
    public static final JobPriority NORMAL = fromString("normal");

    /** Static value high for JobPriority. */
    public static final JobPriority HIGH = fromString("high");

    /**
     * Creates or finds a JobPriority from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobPriority.
     */
    @JsonCreator
    public static JobPriority fromString(String name) {
        return fromString(name, JobPriority.class);
    }

    /** @return known JobPriority values. */
    public static Collection<JobPriority> values() {
        return values(JobPriority.class);
    }
}