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
import io.swagger.client.api.IntegrationApiApi;

import java.io.File;
import java.util.*;

public class IntegrationApiApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: integration_auth
        ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
        integration_auth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //integration_auth.setApiKeyPrefix("Token");

        IntegrationApiApi apiInstance = new IntegrationApiApi();
        NewReferral body = new NewReferral(); // NewReferral | 
        try {
            Referral result = apiInstance.createReferral(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApiApi#createReferral");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*IntegrationApiApi* | [**createReferral**](docs/IntegrationApiApi.md#createReferral) | **POST** /v1/referrals | Create a referral code for an advocate
*IntegrationApiApi* | [**getCustomerProfilesByAttributes**](docs/IntegrationApiApi.md#getCustomerProfilesByAttributes) | **POST** /v1/customer_profiles_search | Get a list of the customer profiles that match the given attributes
*IntegrationApiApi* | [**trackEvent**](docs/IntegrationApiApi.md#trackEvent) | **POST** /v1/events | Track an Event
*IntegrationApiApi* | [**updateCustomerProfile**](docs/IntegrationApiApi.md#updateCustomerProfile) | **PUT** /v1/customer_profiles/{integrationId} | Update a Customer Profile
*IntegrationApiApi* | [**updateCustomerSession**](docs/IntegrationApiApi.md#updateCustomerSession) | **PUT** /v1/customer_sessions/{customerSessionId} | Update a Customer Session


## Documentation for Models

 - [APIError](docs/APIError.md)
 - [AccessControlList](docs/AccessControlList.md)
 - [AccessLogEntry](docs/AccessLogEntry.md)
 - [AccountEntity](docs/AccountEntity.md)
 - [ApplicationApiHealth](docs/ApplicationApiHealth.md)
 - [ApplicationEntity](docs/ApplicationEntity.md)
 - [ApplicationProfileEntity](docs/ApplicationProfileEntity.md)
 - [ApplicationSessionEntity](docs/ApplicationSessionEntity.md)
 - [ApplicationStorageData](docs/ApplicationStorageData.md)
 - [Binding](docs/Binding.md)
 - [CampaignEntity](docs/CampaignEntity.md)
 - [CampaignSetBranchNode](docs/CampaignSetBranchNode.md)
 - [CampaignSetLeafNode](docs/CampaignSetLeafNode.md)
 - [CampaignSetNode](docs/CampaignSetNode.md)
 - [CartItem](docs/CartItem.md)
 - [CartItemAdjustment](docs/CartItemAdjustment.md)
 - [CodeGeneratorSettings](docs/CodeGeneratorSettings.md)
 - [CouponConstraints](docs/CouponConstraints.md)
 - [CouponSearch](docs/CouponSearch.md)
 - [CouponValue](docs/CouponValue.md)
 - [CustomerProfileSearch](docs/CustomerProfileSearch.md)
 - [EmailEntity](docs/EmailEntity.md)
 - [Entity](docs/Entity.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ErrorSource](docs/ErrorSource.md)
 - [FeatureFlags](docs/FeatureFlags.md)
 - [FeatureFlagsBody](docs/FeatureFlagsBody.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [IntegrationEntity](docs/IntegrationEntity.md)
 - [IntegrationProfileEntity](docs/IntegrationProfileEntity.md)
 - [IntegrationState](docs/IntegrationState.md)
 - [LedgerBalance](docs/LedgerBalance.md)
 - [LibraryAttribute](docs/LibraryAttribute.md)
 - [LimitConfig](docs/LimitConfig.md)
 - [LimitEntityEnum](docs/LimitEntityEnum.md)
 - [LoyaltyMembership](docs/LoyaltyMembership.md)
 - [LoyaltyProgramActivation](docs/LoyaltyProgramActivation.md)
 - [MultiApplicationEntity](docs/MultiApplicationEntity.md)
 - [MutableEntity](docs/MutableEntity.md)
 - [NewAccount](docs/NewAccount.md)
 - [NewApiKey](docs/NewApiKey.md)
 - [NewApplication](docs/NewApplication.md)
 - [NewApplicationStorage](docs/NewApplicationStorage.md)
 - [NewApplicationStorageData](docs/NewApplicationStorageData.md)
 - [NewApplicationStorageTuple](docs/NewApplicationStorageTuple.md)
 - [NewCampaign](docs/NewCampaign.md)
 - [NewCustomerProfile](docs/NewCustomerProfile.md)
 - [NewInvitation](docs/NewInvitation.md)
 - [NewInviteEmail](docs/NewInviteEmail.md)
 - [NewLoyaltyProgram](docs/NewLoyaltyProgram.md)
 - [NewPassword](docs/NewPassword.md)
 - [NewPasswordEmail](docs/NewPasswordEmail.md)
 - [NewProductLoyaltyPoints](docs/NewProductLoyaltyPoints.md)
 - [NewReferral](docs/NewReferral.md)
 - [NewRole](docs/NewRole.md)
 - [NewRuleset](docs/NewRuleset.md)
 - [Policy](docs/Policy.md)
 - [ProductLoyaltyPoints](docs/ProductLoyaltyPoints.md)
 - [Rule](docs/Rule.md)
 - [Session](docs/Session.md)
 - [Tier](docs/Tier.md)
 - [Tiers](docs/Tiers.md)
 - [UpdateAccount](docs/UpdateAccount.md)
 - [UserEntity](docs/UserEntity.md)
 - [WebhookLogEntry](docs/WebhookLogEntry.md)
 - [Account](docs/Account.md)
 - [ApiKey](docs/ApiKey.md)
 - [Application](docs/Application.md)
 - [ApplicationEvent](docs/ApplicationEvent.md)
 - [ApplicationProfile](docs/ApplicationProfile.md)
 - [ApplicationSession](docs/ApplicationSession.md)
 - [ApplicationStorage](docs/ApplicationStorage.md)
 - [ApplicationStorageTuple](docs/ApplicationStorageTuple.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignAnalytics](docs/CampaignAnalytics.md)
 - [CampaignSet](docs/CampaignSet.md)
 - [Change](docs/Change.md)
 - [Coupon](docs/Coupon.md)
 - [CustomerActivityReport](docs/CustomerActivityReport.md)
 - [CustomerProfile](docs/CustomerProfile.md)
 - [CustomerSession](docs/CustomerSession.md)
 - [Event](docs/Event.md)
 - [LedgerEntry](docs/LedgerEntry.md)
 - [LoginParams](docs/LoginParams.md)
 - [LoyaltyProgram](docs/LoyaltyProgram.md)
 - [NewCampaignSet](docs/NewCampaignSet.md)
 - [NewCoupons](docs/NewCoupons.md)
 - [NewCustomerSession](docs/NewCustomerSession.md)
 - [NewEvent](docs/NewEvent.md)
 - [Referral](docs/Referral.md)
 - [Role](docs/Role.md)
 - [Ruleset](docs/Ruleset.md)
 - [UpdateCoupon](docs/UpdateCoupon.md)
 - [UpdateUser](docs/UpdateUser.md)
 - [User](docs/User.md)
 - [ApiKeyWithUsage](docs/ApiKeyWithUsage.md)
 - [NewAccountSignUp](docs/NewAccountSignUp.md)
 - [NewUser](docs/NewUser.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### integration_auth

- **Type**: API key
- **API key parameter name**: Content-Signature
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



