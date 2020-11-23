// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.sample.aad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureActiveDirectoryOAuth2Application {

    public static void main(String[] args) {
        SpringApplication.run(AzureActiveDirectoryOAuth2Application.class, args);
    }
}
