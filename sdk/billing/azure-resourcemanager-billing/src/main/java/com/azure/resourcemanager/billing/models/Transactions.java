// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Transactions. */
public interface Transactions {
    /**
     * Lists the transactions for an invoice. Transactions include purchases, refunds and Azure usage charges.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of transactions.
     */
    PagedIterable<Transaction> listByInvoice(String billingAccountName, String invoiceName);

    /**
     * Lists the transactions for an invoice. Transactions include purchases, refunds and Azure usage charges.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of transactions.
     */
    PagedIterable<Transaction> listByInvoice(String billingAccountName, String invoiceName, Context context);
}