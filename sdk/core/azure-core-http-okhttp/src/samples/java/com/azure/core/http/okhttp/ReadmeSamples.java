// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.okhttp;

import com.azure.core.http.HttpClient;
import com.azure.core.http.ProxyOptions;
import java.net.InetSocketAddress;

/**
 * WARNING: MODIFYING THIS FILE WILL REQUIRE CORRESPONDING UPDATES TO README.md FILE. LINE NUMBERS
 * ARE USED TO EXTRACT APPROPRIATE CODE SEGMENTS FROM THIS FILE. ADD NEW CODE AT THE BOTTOM TO AVOID CHANGING
 * LINE NUMBERS OF EXISTING CODE SAMPLES.
 *
 * Class containing code snippets that will be injected to README.md.
 */
public class ReadmeSamples {

    /**
     * Sample code for creating async Netty HTTP client.
     */
    public void createBasicClient() {
        // BEGIN: readme-sample-createBasicClient
        HttpClient client = new OkHttpAsyncHttpClientBuilder().build();
        // END: readme-sample-createBasicClient
    }

    /**
     * Sample code for creating async Netty HTTP client with proxy.
     */
    public void createProxyClient() {
        // BEGIN: readme-sample-createProxyClient
        HttpClient client = new OkHttpAsyncHttpClientBuilder()
            .proxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress("<proxy-host>", 8888)))
            .build();
        // END: readme-sample-createProxyClient
    }

}
