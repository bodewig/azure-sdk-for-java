// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for Kind. */
public enum Kind {
    /** Enum value fhir. */
    FHIR("fhir"),

    /** Enum value fhir-Stu3. */
    FHIR_STU3("fhir-Stu3"),

    /** Enum value fhir-R4. */
    FHIR_R4("fhir-R4");

    /** The actual serialized value for a Kind instance. */
    private final String value;

    Kind(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Kind instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Kind object, or null if unable to parse.
     */
    @JsonCreator
    public static Kind fromString(String value) {
        Kind[] items = Kind.values();
        for (Kind item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}