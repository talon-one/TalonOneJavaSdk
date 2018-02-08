# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        String integrationId = "integrationId_example"; // String | The custom identifier for this profile, must be unique within the account.
        NewCustomerProfile body = new NewCustomerProfile(); // NewCustomerProfile | 
        try {
            IntegrationState result = apiInstance.updateCustomerProfile(integrationId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateCustomerProfile");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**updateCustomerProfile**](docs/DefaultApi.md#updateCustomerProfile) | **PUT** /v1/customer_profiles/{integrationId} | Update a Customer Profile
*DefaultApi* | [**updateCustomerSession**](docs/DefaultApi.md#updateCustomerSession) | **PUT** /v1/customer_sessions/{customerSessionId} | Update a Customer Session


## Documentation for Models

 - [CartItem](docs/CartItem.md)
 - [CartItemAdjustment](docs/CartItemAdjustment.md)
 - [CustomerProfile](docs/CustomerProfile.md)
 - [CustomerSession](docs/CustomerSession.md)
 - [Event](docs/Event.md)
 - [IntegrationState](docs/IntegrationState.md)
 - [LedgerEntry](docs/LedgerEntry.md)
 - [LoyaltyMembership](docs/LoyaltyMembership.md)
 - [NewCustomerProfile](docs/NewCustomerProfile.md)
 - [NewCustomerSession](docs/NewCustomerSession.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



