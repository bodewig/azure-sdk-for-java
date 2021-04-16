// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AS2 agreement security settings. */
@Fluent
public final class AS2SecuritySettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AS2SecuritySettings.class);

    /*
     * The value indicating whether to send or request a MDN.
     */
    @JsonProperty(value = "overrideGroupSigningCertificate", required = true)
    private boolean overrideGroupSigningCertificate;

    /*
     * The name of the signing certificate.
     */
    @JsonProperty(value = "signingCertificateName")
    private String signingCertificateName;

    /*
     * The name of the encryption certificate.
     */
    @JsonProperty(value = "encryptionCertificateName")
    private String encryptionCertificateName;

    /*
     * The value indicating whether to enable NRR for inbound encoded messages.
     */
    @JsonProperty(value = "enableNRRForInboundEncodedMessages", required = true)
    private boolean enableNrrForInboundEncodedMessages;

    /*
     * The value indicating whether to enable NRR for inbound decoded messages.
     */
    @JsonProperty(value = "enableNRRForInboundDecodedMessages", required = true)
    private boolean enableNrrForInboundDecodedMessages;

    /*
     * The value indicating whether to enable NRR for outbound MDN.
     */
    @JsonProperty(value = "enableNRRForOutboundMDN", required = true)
    private boolean enableNrrForOutboundMdn;

    /*
     * The value indicating whether to enable NRR for outbound encoded
     * messages.
     */
    @JsonProperty(value = "enableNRRForOutboundEncodedMessages", required = true)
    private boolean enableNrrForOutboundEncodedMessages;

    /*
     * The value indicating whether to enable NRR for outbound decoded
     * messages.
     */
    @JsonProperty(value = "enableNRRForOutboundDecodedMessages", required = true)
    private boolean enableNrrForOutboundDecodedMessages;

    /*
     * The value indicating whether to enable NRR for inbound MDN.
     */
    @JsonProperty(value = "enableNRRForInboundMDN", required = true)
    private boolean enableNrrForInboundMdn;

    /*
     * The Sha2 algorithm format. Valid values are Sha2, ShaHashSize,
     * ShaHyphenHashSize, Sha2UnderscoreHashSize.
     */
    @JsonProperty(value = "sha2AlgorithmFormat")
    private String sha2AlgorithmFormat;

    /**
     * Get the overrideGroupSigningCertificate property: The value indicating whether to send or request a MDN.
     *
     * @return the overrideGroupSigningCertificate value.
     */
    public boolean overrideGroupSigningCertificate() {
        return this.overrideGroupSigningCertificate;
    }

    /**
     * Set the overrideGroupSigningCertificate property: The value indicating whether to send or request a MDN.
     *
     * @param overrideGroupSigningCertificate the overrideGroupSigningCertificate value to set.
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withOverrideGroupSigningCertificate(boolean overrideGroupSigningCertificate) {
        this.overrideGroupSigningCertificate = overrideGroupSigningCertificate;
        return this;
    }

    /**
     * Get the signingCertificateName property: The name of the signing certificate.
     *
     * @return the signingCertificateName value.
     */
    public String signingCertificateName() {
        return this.signingCertificateName;
    }

    /**
     * Set the signingCertificateName property: The name of the signing certificate.
     *
     * @param signingCertificateName the signingCertificateName value to set.
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withSigningCertificateName(String signingCertificateName) {
        this.signingCertificateName = signingCertificateName;
        return this;
    }

    /**
     * Get the encryptionCertificateName property: The name of the encryption certificate.
     *
     * @return the encryptionCertificateName value.
     */
    public String encryptionCertificateName() {
        return this.encryptionCertificateName;
    }

    /**
     * Set the encryptionCertificateName property: The name of the encryption certificate.
     *
     * @param encryptionCertificateName the encryptionCertificateName value to set.
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEncryptionCertificateName(String encryptionCertificateName) {
        this.encryptionCertificateName = encryptionCertificateName;
        return this;
    }

    /**
     * Get the enableNrrForInboundEncodedMessages property: The value indicating whether to enable NRR for inbound
     * encoded messages.
     *
     * @return the enableNrrForInboundEncodedMessages value.
     */
    public boolean enableNrrForInboundEncodedMessages() {
        return this.enableNrrForInboundEncodedMessages;
    }

    /**
     * Set the enableNrrForInboundEncodedMessages property: The value indicating whether to enable NRR for inbound
     * encoded messages.
     *
     * @param enableNrrForInboundEncodedMessages the enableNrrForInboundEncodedMessages value to set.
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNrrForInboundEncodedMessages(boolean enableNrrForInboundEncodedMessages) {
        this.enableNrrForInboundEncodedMessages = enableNrrForInboundEncodedMessages;
        return this;
    }

    /**
     * Get the enableNrrForInboundDecodedMessages property: The value indicating whether to enable NRR for inbound
     * decoded messages.
     *
     * @return the enableNrrForInboundDecodedMessages value.
     */
    public boolean enableNrrForInboundDecodedMessages() {
        return this.enableNrrForInboundDecodedMessages;
    }

    /**
     * Set the enableNrrForInboundDecodedMessages property: The value indicating whether to enable NRR for inbound
     * decoded messages.
     *
     * @param enableNrrForInboundDecodedMessages the enableNrrForInboundDecodedMessages value to set.
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNrrForInboundDecodedMessages(boolean enableNrrForInboundDecodedMessages) {
        this.enableNrrForInboundDecodedMessages = enableNrrForInboundDecodedMessages;
        return this;
    }

    /**
     * Get the enableNrrForOutboundMdn property: The value indicating whether to enable NRR for outbound MDN.
     *
     * @return the enableNrrForOutboundMdn value.
     */
    public boolean enableNrrForOutboundMdn() {
        return this.enableNrrForOutboundMdn;
    }

    /**
     * Set the enableNrrForOutboundMdn property: The value indicating whether to enable NRR for outbound MDN.
     *
     * @param enableNrrForOutboundMdn the enableNrrForOutboundMdn value to set.
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNrrForOutboundMdn(boolean enableNrrForOutboundMdn) {
        this.enableNrrForOutboundMdn = enableNrrForOutboundMdn;
        return this;
    }

    /**
     * Get the enableNrrForOutboundEncodedMessages property: The value indicating whether to enable NRR for outbound
     * encoded messages.
     *
     * @return the enableNrrForOutboundEncodedMessages value.
     */
    public boolean enableNrrForOutboundEncodedMessages() {
        return this.enableNrrForOutboundEncodedMessages;
    }

    /**
     * Set the enableNrrForOutboundEncodedMessages property: The value indicating whether to enable NRR for outbound
     * encoded messages.
     *
     * @param enableNrrForOutboundEncodedMessages the enableNrrForOutboundEncodedMessages value to set.
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNrrForOutboundEncodedMessages(boolean enableNrrForOutboundEncodedMessages) {
        this.enableNrrForOutboundEncodedMessages = enableNrrForOutboundEncodedMessages;
        return this;
    }

    /**
     * Get the enableNrrForOutboundDecodedMessages property: The value indicating whether to enable NRR for outbound
     * decoded messages.
     *
     * @return the enableNrrForOutboundDecodedMessages value.
     */
    public boolean enableNrrForOutboundDecodedMessages() {
        return this.enableNrrForOutboundDecodedMessages;
    }

    /**
     * Set the enableNrrForOutboundDecodedMessages property: The value indicating whether to enable NRR for outbound
     * decoded messages.
     *
     * @param enableNrrForOutboundDecodedMessages the enableNrrForOutboundDecodedMessages value to set.
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNrrForOutboundDecodedMessages(boolean enableNrrForOutboundDecodedMessages) {
        this.enableNrrForOutboundDecodedMessages = enableNrrForOutboundDecodedMessages;
        return this;
    }

    /**
     * Get the enableNrrForInboundMdn property: The value indicating whether to enable NRR for inbound MDN.
     *
     * @return the enableNrrForInboundMdn value.
     */
    public boolean enableNrrForInboundMdn() {
        return this.enableNrrForInboundMdn;
    }

    /**
     * Set the enableNrrForInboundMdn property: The value indicating whether to enable NRR for inbound MDN.
     *
     * @param enableNrrForInboundMdn the enableNrrForInboundMdn value to set.
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNrrForInboundMdn(boolean enableNrrForInboundMdn) {
        this.enableNrrForInboundMdn = enableNrrForInboundMdn;
        return this;
    }

    /**
     * Get the sha2AlgorithmFormat property: The Sha2 algorithm format. Valid values are Sha2, ShaHashSize,
     * ShaHyphenHashSize, Sha2UnderscoreHashSize.
     *
     * @return the sha2AlgorithmFormat value.
     */
    public String sha2AlgorithmFormat() {
        return this.sha2AlgorithmFormat;
    }

    /**
     * Set the sha2AlgorithmFormat property: The Sha2 algorithm format. Valid values are Sha2, ShaHashSize,
     * ShaHyphenHashSize, Sha2UnderscoreHashSize.
     *
     * @param sha2AlgorithmFormat the sha2AlgorithmFormat value to set.
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withSha2AlgorithmFormat(String sha2AlgorithmFormat) {
        this.sha2AlgorithmFormat = sha2AlgorithmFormat;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}