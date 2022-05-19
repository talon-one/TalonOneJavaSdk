# ManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLoyaltyPoints**](ManagementApi.md#addLoyaltyPoints) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/add_points | Add points in loyalty program for given customer
[**copyCampaignToApplications**](ManagementApi.md#copyCampaignToApplications) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/copy | Copy the campaign into the specified application
[**createAccountCollection**](ManagementApi.md#createAccountCollection) | **POST** /v1/collections | Create account-level collection
[**createAdditionalCost**](ManagementApi.md#createAdditionalCost) | **POST** /v1/additional_costs | Create additional cost
[**createAttribute**](ManagementApi.md#createAttribute) | **POST** /v1/attributes | Create custom attribute
[**createCampaignFromTemplate**](ManagementApi.md#createCampaignFromTemplate) | **POST** /v1/applications/{applicationId}/create_campaign_from_template | Create campaign from campaign template
[**createCollection**](ManagementApi.md#createCollection) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/collections | Create collection
[**createCoupons**](ManagementApi.md#createCoupons) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Create coupons
[**createCouponsAsync**](ManagementApi.md#createCouponsAsync) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_async | Create coupons asynchronously
[**createCouponsForMultipleRecipients**](ManagementApi.md#createCouponsForMultipleRecipients) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_with_recipients | Create coupons for multiple recipients
[**createPasswordRecoveryEmail**](ManagementApi.md#createPasswordRecoveryEmail) | **POST** /v1/password_recovery_emails | Request a password reset
[**createSession**](ManagementApi.md#createSession) | **POST** /v1/sessions | Create session
[**deleteAccountCollection**](ManagementApi.md#deleteAccountCollection) | **DELETE** /v1/collections/{collectionId} | Delete account-level collection
[**deleteCampaign**](ManagementApi.md#deleteCampaign) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId} | Delete campaign
[**deleteCollection**](ManagementApi.md#deleteCollection) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId} | Delete collection
[**deleteCoupon**](ManagementApi.md#deleteCoupon) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/{couponId} | Delete coupon
[**deleteCoupons**](ManagementApi.md#deleteCoupons) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Delete coupons
[**deleteLoyaltyCard**](ManagementApi.md#deleteLoyaltyCard) | **DELETE** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardIdentifier} | Delete loyalty card
[**deleteReferral**](ManagementApi.md#deleteReferral) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals/{referralId} | Delete referral
[**destroySession**](ManagementApi.md#destroySession) | **DELETE** /v1/sessions | Destroy session
[**exportAccountCollectionItems**](ManagementApi.md#exportAccountCollectionItems) | **GET** /v1/collections/{collectionId}/export | Export account-level collection items to CSV file
[**exportCollectionItems**](ManagementApi.md#exportCollectionItems) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId}/export | Export a collection&#39;s items to CSV file
[**exportCoupons**](ManagementApi.md#exportCoupons) | **GET** /v1/applications/{applicationId}/export_coupons | Export coupons to CSV file
[**exportCustomerSessions**](ManagementApi.md#exportCustomerSessions) | **GET** /v1/applications/{applicationId}/export_customer_sessions | Export customer sessions to CSV file
[**exportEffects**](ManagementApi.md#exportEffects) | **GET** /v1/applications/{applicationId}/export_effects | Export triggered effects to CSV file
[**exportLoyaltyBalance**](ManagementApi.md#exportLoyaltyBalance) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/export_customer_balance | Export customer loyalty balance to a CSV file
[**exportLoyaltyLedger**](ManagementApi.md#exportLoyaltyLedger) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/export_log | Export a customer&#39;s loyalty ledger log to CSV file
[**exportReferrals**](ManagementApi.md#exportReferrals) | **GET** /v1/applications/{applicationId}/export_referrals | Export referrals to CSV file
[**getAccessLogsWithoutTotalCount**](ManagementApi.md#getAccessLogsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/access_logs/no_total | Get access logs for Application
[**getAccount**](ManagementApi.md#getAccount) | **GET** /v1/accounts/{accountId} | Get account details
[**getAccountAnalytics**](ManagementApi.md#getAccountAnalytics) | **GET** /v1/accounts/{accountId}/analytics | Get account analytics
[**getAccountCollection**](ManagementApi.md#getAccountCollection) | **GET** /v1/collections/{collectionId} | Get account-level collection
[**getAdditionalCost**](ManagementApi.md#getAdditionalCost) | **GET** /v1/additional_costs/{additionalCostId} | Get additional cost
[**getAdditionalCosts**](ManagementApi.md#getAdditionalCosts) | **GET** /v1/additional_costs | List additional costs
[**getAllAccessLogs**](ManagementApi.md#getAllAccessLogs) | **GET** /v1/access_logs | List access logs
[**getAllRoles**](ManagementApi.md#getAllRoles) | **GET** /v1/roles | List roles
[**getApplication**](ManagementApi.md#getApplication) | **GET** /v1/applications/{applicationId} | Get application
[**getApplicationApiHealth**](ManagementApi.md#getApplicationApiHealth) | **GET** /v1/applications/{applicationId}/health_report | Get report of health of application API
[**getApplicationCustomer**](ManagementApi.md#getApplicationCustomer) | **GET** /v1/applications/{applicationId}/customers/{customerId} | Get application&#39;s customer
[**getApplicationCustomerFriends**](ManagementApi.md#getApplicationCustomerFriends) | **GET** /v1/applications/{applicationId}/profile/{integrationId}/friends | List friends referred by customer profile
[**getApplicationCustomers**](ManagementApi.md#getApplicationCustomers) | **GET** /v1/applications/{applicationId}/customers | List application&#39;s customers
[**getApplicationCustomersByAttributes**](ManagementApi.md#getApplicationCustomersByAttributes) | **POST** /v1/applications/{applicationId}/customer_search | List application customers matching the given attributes
[**getApplicationEventTypes**](ManagementApi.md#getApplicationEventTypes) | **GET** /v1/applications/{applicationId}/event_types | List Applications event types
[**getApplicationEventsWithoutTotalCount**](ManagementApi.md#getApplicationEventsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/events/no_total | List Applications events
[**getApplicationSession**](ManagementApi.md#getApplicationSession) | **GET** /v1/applications/{applicationId}/sessions/{sessionId} | Get Application session
[**getApplicationSessions**](ManagementApi.md#getApplicationSessions) | **GET** /v1/applications/{applicationId}/sessions | List Application sessions
[**getApplications**](ManagementApi.md#getApplications) | **GET** /v1/applications | List applications
[**getAttribute**](ManagementApi.md#getAttribute) | **GET** /v1/attributes/{attributeId} | Get custom attribute
[**getAttributes**](ManagementApi.md#getAttributes) | **GET** /v1/attributes | List custom attributes
[**getAudiences**](ManagementApi.md#getAudiences) | **GET** /v1/audiences | List audiences
[**getCampaign**](ManagementApi.md#getCampaign) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId} | Get campaign
[**getCampaignAnalytics**](ManagementApi.md#getCampaignAnalytics) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/analytics | Get analytics of campaigns
[**getCampaignByAttributes**](ManagementApi.md#getCampaignByAttributes) | **POST** /v1/applications/{applicationId}/campaigns_search | List campaigns that match the given attributes
[**getCampaigns**](ManagementApi.md#getCampaigns) | **GET** /v1/applications/{applicationId}/campaigns | List campaigns
[**getChanges**](ManagementApi.md#getChanges) | **GET** /v1/changes | Get audit log for an account
[**getCollection**](ManagementApi.md#getCollection) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId} | Get collection
[**getCouponsWithoutTotalCount**](ManagementApi.md#getCouponsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/no_total | List coupons
[**getCustomerActivityReport**](ManagementApi.md#getCustomerActivityReport) | **GET** /v1/applications/{applicationId}/customer_activity_reports/{customerId} | Get customer&#39;s activity report
[**getCustomerActivityReportsWithoutTotalCount**](ManagementApi.md#getCustomerActivityReportsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/customer_activity_reports/no_total | Get Activity Reports for Application Customers
[**getCustomerAnalytics**](ManagementApi.md#getCustomerAnalytics) | **GET** /v1/applications/{applicationId}/customers/{customerId}/analytics | Get customer&#39;s analytics report
[**getCustomerProfile**](ManagementApi.md#getCustomerProfile) | **GET** /v1/customers/{customerId} | Get customer profile
[**getCustomerProfiles**](ManagementApi.md#getCustomerProfiles) | **GET** /v1/customers/no_total | List customer profiles
[**getCustomersByAttributes**](ManagementApi.md#getCustomersByAttributes) | **POST** /v1/customer_search/no_total | List customer profiles matching the given attributes
[**getEventTypes**](ManagementApi.md#getEventTypes) | **GET** /v1/event_types | List event types
[**getExports**](ManagementApi.md#getExports) | **GET** /v1/exports | Get exports
[**getLoyaltyPoints**](ManagementApi.md#getLoyaltyPoints) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId} | Get the Loyalty Ledger for this integrationID
[**getLoyaltyProgram**](ManagementApi.md#getLoyaltyProgram) | **GET** /v1/loyalty_programs/{loyaltyProgramId} | Get loyalty program
[**getLoyaltyPrograms**](ManagementApi.md#getLoyaltyPrograms) | **GET** /v1/loyalty_programs | List loyalty programs
[**getLoyaltyStatistics**](ManagementApi.md#getLoyaltyStatistics) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/statistics | Get loyalty program statistics by loyalty program ID
[**getReferralsWithoutTotalCount**](ManagementApi.md#getReferralsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals/no_total | List referrals
[**getRole**](ManagementApi.md#getRole) | **GET** /v1/roles/{roleId} | Get role
[**getRuleset**](ManagementApi.md#getRuleset) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets/{rulesetId} | Get ruleset
[**getRulesets**](ManagementApi.md#getRulesets) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets | List campaign rulesets
[**getUser**](ManagementApi.md#getUser) | **GET** /v1/users/{userId} | Get user
[**getUsers**](ManagementApi.md#getUsers) | **GET** /v1/users | List users in account
[**getWebhook**](ManagementApi.md#getWebhook) | **GET** /v1/webhooks/{webhookId} | Get webhook
[**getWebhookActivationLogs**](ManagementApi.md#getWebhookActivationLogs) | **GET** /v1/webhook_activation_logs | List webhook activation log entries
[**getWebhookLogs**](ManagementApi.md#getWebhookLogs) | **GET** /v1/webhook_logs | List webhook log entries
[**getWebhooks**](ManagementApi.md#getWebhooks) | **GET** /v1/webhooks | List webhooks
[**importAccountCollection**](ManagementApi.md#importAccountCollection) | **POST** /v1/collections/{collectionId}/import | Import data in existing account-level collection via CSV file
[**importAllowedList**](ManagementApi.md#importAllowedList) | **POST** /v1/attributes/{attributeId}/allowed_list/import | Import allowed values for attribute
[**importCollection**](ManagementApi.md#importCollection) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId}/import | Import data in existing collection via CSV file
[**importCoupons**](ManagementApi.md#importCoupons) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/import_coupons | Import coupons via CSV file
[**importLoyaltyPoints**](ManagementApi.md#importLoyaltyPoints) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/import_points | Import loyalty points via CSV file
[**importPoolGiveaways**](ManagementApi.md#importPoolGiveaways) | **POST** /v1/giveaways/pools/{poolId}/import | Import giveaway codes into a giveaway pool
[**importReferrals**](ManagementApi.md#importReferrals) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/import_referrals | Import referrals via CSV file
[**listAccountCollections**](ManagementApi.md#listAccountCollections) | **GET** /v1/collections | List collections in account
[**listCollections**](ManagementApi.md#listCollections) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/collections | List collections
[**listCollectionsInApplication**](ManagementApi.md#listCollectionsInApplication) | **GET** /v1/applications/{applicationId}/collections | List collections in application
[**removeLoyaltyPoints**](ManagementApi.md#removeLoyaltyPoints) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/deduct_points | Deduct points in loyalty program for given customer
[**resetPassword**](ManagementApi.md#resetPassword) | **POST** /v1/reset_password | Reset password
[**searchCouponsAdvancedApplicationWideWithoutTotalCount**](ManagementApi.md#searchCouponsAdvancedApplicationWideWithoutTotalCount) | **POST** /v1/applications/{applicationId}/coupons_search_advanced/no_total | List coupons that match the given attributes (without total count)
[**searchCouponsAdvancedWithoutTotalCount**](ManagementApi.md#searchCouponsAdvancedWithoutTotalCount) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_search_advanced/no_total | List coupons that match the given attributes in campaign (without total count)
[**updateAccountCollection**](ManagementApi.md#updateAccountCollection) | **PUT** /v1/collections/{collectionId} | Update account-level collection description and connected Applications
[**updateAdditionalCost**](ManagementApi.md#updateAdditionalCost) | **PUT** /v1/additional_costs/{additionalCostId} | Update additional cost
[**updateAttribute**](ManagementApi.md#updateAttribute) | **PUT** /v1/attributes/{attributeId} | Update custom attribute
[**updateCampaign**](ManagementApi.md#updateCampaign) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId} | Update campaign
[**updateCollection**](ManagementApi.md#updateCollection) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId} | Update collection description
[**updateCoupon**](ManagementApi.md#updateCoupon) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/{couponId} | Update coupon
[**updateCouponBatch**](ManagementApi.md#updateCouponBatch) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Update coupons
[**updateReferral**](ManagementApi.md#updateReferral) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals/{referralId} | Update referral


<a name="addLoyaltyPoints"></a>
# **addLoyaltyPoints**
> addLoyaltyPoints(loyaltyProgramId, integrationId, body)

Add points in loyalty program for given customer

Add points in the specified loyalty program for the given customer.  To get the &#x60;integrationId&#x60; of the profile from a &#x60;sessionId&#x60;, use the [Update customer session](/integration-api/#operation/updateCustomerSessionV2). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String loyaltyProgramId = "loyaltyProgramId_example"; // String | The identifier for the loyalty program.
    String integrationId = "integrationId_example"; // String | The identifier of the profile.
    LoyaltyPoints body = new LoyaltyPoints(); // LoyaltyPoints | 
    try {
      apiInstance.addLoyaltyPoints(loyaltyProgramId, integrationId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#addLoyaltyPoints");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyProgramId** | **String**| The identifier for the loyalty program. |
 **integrationId** | **String**| The identifier of the profile. |
 **body** | [**LoyaltyPoints**](LoyaltyPoints.md)|  |

### Return type

null (empty response body)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="copyCampaignToApplications"></a>
# **copyCampaignToApplications**
> InlineResponse2002 copyCampaignToApplications(applicationId, campaignId, body)

Copy the campaign into the specified application

Copy the campaign into all specified application.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    CampaignCopy body = new CampaignCopy(); // CampaignCopy | 
    try {
      InlineResponse2002 result = apiInstance.copyCampaignToApplications(applicationId, campaignId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#copyCampaignToApplications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **body** | [**CampaignCopy**](CampaignCopy.md)|  |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="createAccountCollection"></a>
# **createAccountCollection**
> Collection createAccountCollection(body)

Create account-level collection

Create account-level collection.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    NewCollection body = new NewCollection(); // NewCollection | 
    try {
      Collection result = apiInstance.createAccountCollection(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createAccountCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewCollection**](NewCollection.md)|  |

### Return type

[**Collection**](Collection.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**409** | Conflict. A Collection with this name already exists. |  -  |

<a name="createAdditionalCost"></a>
# **createAdditionalCost**
> AccountAdditionalCost createAdditionalCost(body)

Create additional cost

Create an [additional cost](/docs/product/account/dev-tools/managing-additional-costs/).  These additional costs are shared across all applications in your account, and are never required. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    NewAdditionalCost body = new NewAdditionalCost(); // NewAdditionalCost | 
    try {
      AccountAdditionalCost result = apiInstance.createAdditionalCost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createAdditionalCost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewAdditionalCost**](NewAdditionalCost.md)|  |

### Return type

[**AccountAdditionalCost**](AccountAdditionalCost.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="createAttribute"></a>
# **createAttribute**
> Attribute createAttribute(body)

Create custom attribute

Create a _custom attribute_ in this account. Custom attributes allow you to attach new fields to Talon.One domain objects like campaigns, coupons, customers and so on.  These attributes can then be given values when creating/updating these objects, and these values can be used in your campaign rules. For example, you could define a &#x60;zipCode&#x60; field for customer sessions, and add a rule to your campaign that only allows certain ZIP codes.  These attributes are shared across all applications in your account, and are never required. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    NewAttribute body = new NewAttribute(); // NewAttribute | 
    try {
      Attribute result = apiInstance.createAttribute(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewAttribute**](NewAttribute.md)|  |

### Return type

[**Attribute**](Attribute.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="createCampaignFromTemplate"></a>
# **createCampaignFromTemplate**
> CreateTemplateCampaignResponse createCampaignFromTemplate(applicationId, body)

Create campaign from campaign template

Use the campaign template referenced in the request body to create a new campaign in one of the connected Applications.  If the template was created from a campaign with rules referencing [campaign collections](https://docs.talon.one/docs/product/campaigns/managing-collections), the corresponding collections for the new campaign are created automatically. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    CreateTemplateCampaign body = new CreateTemplateCampaign(); // CreateTemplateCampaign | 
    try {
      CreateTemplateCampaignResponse result = apiInstance.createCampaignFromTemplate(applicationId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCampaignFromTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **body** | [**CreateTemplateCampaign**](CreateTemplateCampaign.md)|  |

### Return type

[**CreateTemplateCampaignResponse**](CreateTemplateCampaignResponse.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="createCollection"></a>
# **createCollection**
> Collection createCollection(applicationId, campaignId, body)

Create collection

Create a collection.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    NewCampaignCollection body = new NewCampaignCollection(); // NewCampaignCollection | 
    try {
      Collection result = apiInstance.createCollection(applicationId, campaignId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **body** | [**NewCampaignCollection**](NewCampaignCollection.md)|  |

### Return type

[**Collection**](Collection.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="createCoupons"></a>
# **createCoupons**
> InlineResponse2004 createCoupons(applicationId, campaignId, body, silent)

Create coupons

Create coupons according to some pattern. Up to 20.000 coupons can be created without a unique prefix. When a unique prefix is provided, up to 200.000 coupons can be created.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    NewCoupons body = new NewCoupons(); // NewCoupons | 
    String silent = "\"yes\""; // String | Possible values: `yes` or `no`. - `yes`: Increases the perfomance of the API call by returning a 204 response. - `no`: Returns a 200 response that contains essential data such as the updated customer profiles and session-related information. 
    try {
      InlineResponse2004 result = apiInstance.createCoupons(applicationId, campaignId, body, silent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCoupons");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **body** | [**NewCoupons**](NewCoupons.md)|  |
 **silent** | **String**| Possible values: &#x60;yes&#x60; or &#x60;no&#x60;. - &#x60;yes&#x60;: Increases the perfomance of the API call by returning a 204 response. - &#x60;no&#x60;: Returns a 200 response that contains essential data such as the updated customer profiles and session-related information.  | [optional] [default to &quot;yes&quot;]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |

<a name="createCouponsAsync"></a>
# **createCouponsAsync**
> AsyncCouponCreationResponse createCouponsAsync(applicationId, campaignId, body)

Create coupons asynchronously

Create any number of coupons from 20,001 to 5,000,000.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    NewCouponCreationJob body = new NewCouponCreationJob(); // NewCouponCreationJob | 
    try {
      AsyncCouponCreationResponse result = apiInstance.createCouponsAsync(applicationId, campaignId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCouponsAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **body** | [**NewCouponCreationJob**](NewCouponCreationJob.md)|  |

### Return type

[**AsyncCouponCreationResponse**](AsyncCouponCreationResponse.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="createCouponsForMultipleRecipients"></a>
# **createCouponsForMultipleRecipients**
> InlineResponse2004 createCouponsForMultipleRecipients(applicationId, campaignId, body, silent)

Create coupons for multiple recipients

Create coupons according to some pattern for up to 1000 recipients.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    NewCouponsForMultipleRecipients body = new NewCouponsForMultipleRecipients(); // NewCouponsForMultipleRecipients | 
    String silent = "\"yes\""; // String | Possible values: `yes` or `no`. - `yes`: Increases the perfomance of the API call by returning a 204 response. - `no`: Returns a 200 response that contains essential data such as the updated customer profiles and session-related information. 
    try {
      InlineResponse2004 result = apiInstance.createCouponsForMultipleRecipients(applicationId, campaignId, body, silent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCouponsForMultipleRecipients");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **body** | [**NewCouponsForMultipleRecipients**](NewCouponsForMultipleRecipients.md)|  |
 **silent** | **String**| Possible values: &#x60;yes&#x60; or &#x60;no&#x60;. - &#x60;yes&#x60;: Increases the perfomance of the API call by returning a 204 response. - &#x60;no&#x60;: Returns a 200 response that contains essential data such as the updated customer profiles and session-related information.  | [optional] [default to &quot;yes&quot;]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |

<a name="createPasswordRecoveryEmail"></a>
# **createPasswordRecoveryEmail**
> NewPasswordEmail createPasswordRecoveryEmail(body)

Request a password reset

Send an email with a password recovery link to the email address of an existing account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    NewPasswordEmail body = new NewPasswordEmail(); // NewPasswordEmail | 
    try {
      NewPasswordEmail result = apiInstance.createPasswordRecoveryEmail(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createPasswordRecoveryEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewPasswordEmail**](NewPasswordEmail.md)|  |

### Return type

[**NewPasswordEmail**](NewPasswordEmail.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Created |  -  |

<a name="createSession"></a>
# **createSession**
> Session createSession(body)

Create session

Create a session to use the Management API endpoints. Use the value of the &#x60;token&#x60; property provided in the response as bearer token in other API calls.  A token is valid for 3 months. In accordance with best pratices, use your generated token for all your API requests. Do **not** regenerate a token for each request.  This endpoint has a rate limit of 3 to 6 requests per second per account, depending on your setup.  **Note:** You can also use your browser&#39;s developer&#39;s console to [display your token](https://docs.talon.one/docs/dev/tutorials/receiving-loyalty-ledger-braze/#extracting-the-session-token) when you log into the Campaign Manager.  In this case, keep in mind that logging out destroys the token. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    LoginParams body = new LoginParams(); // LoginParams | 
    try {
      Session result = apiInstance.createSession(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginParams**](LoginParams.md)|  |

### Return type

[**Session**](Session.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="deleteAccountCollection"></a>
# **deleteAccountCollection**
> deleteAccountCollection(collectionId)

Delete account-level collection

Delete the given account-level collection

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer collectionId = 56; // Integer | The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication).
    try {
      apiInstance.deleteAccountCollection(collectionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteAccountCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Integer**| The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication). |

### Return type

null (empty response body)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not found |  -  |

<a name="deleteCampaign"></a>
# **deleteCampaign**
> deleteCampaign(applicationId, campaignId)

Delete campaign

Delete the given campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    try {
      apiInstance.deleteCampaign(applicationId, campaignId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |

### Return type

null (empty response body)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="deleteCollection"></a>
# **deleteCollection**
> deleteCollection(applicationId, campaignId, collectionId)

Delete collection

Delete the given collection.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Integer collectionId = 56; // Integer | The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication).
    try {
      apiInstance.deleteCollection(applicationId, campaignId, collectionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **collectionId** | **Integer**| The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication). |

### Return type

null (empty response body)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**401** | Unauthorized |  -  |

<a name="deleteCoupon"></a>
# **deleteCoupon**
> deleteCoupon(applicationId, campaignId, couponId)

Delete coupon

Delete the specified coupon.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String couponId = "couponId_example"; // String | The ID of the coupon code to update
    try {
      apiInstance.deleteCoupon(applicationId, campaignId, couponId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteCoupon");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **couponId** | **String**| The ID of the coupon code to update |

### Return type

null (empty response body)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="deleteCoupons"></a>
# **deleteCoupons**
> deleteCoupons(applicationId, campaignId, value, createdBefore, createdAfter, startsAfter, startsBefore, expiresAfter, expiresBefore, valid, batchId, usable, referralId, recipientIntegrationId, exactMatch)

Delete coupons

Deletes all the coupons matching the specified criteria.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime startsAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime startsBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime expiresAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime expiresBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    String valid = "valid_example"; // String | - `expired`: Matches coupons in which the expiry date is set and in the past. - `validNow`: Matches coupons in which start date is null or in the past and expiry date is null or in the future. - `validFuture`: Matches coupons in which start date is set and in the future. 
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    String usable = "usable_example"; // String | - `true`: only coupons where `usageCounter < usageLimit` will be returned. - `false`: only coupons where `usageCounter >= usageLimit` will be returned. 
    Integer referralId = 56; // Integer | Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile id specified in the coupon's `RecipientIntegrationId` field. 
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code
    try {
      apiInstance.deleteCoupons(applicationId, campaignId, value, createdBefore, createdAfter, startsAfter, startsBefore, expiresAfter, expiresBefore, valid, batchId, usable, referralId, recipientIntegrationId, exactMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteCoupons");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **startsAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **startsBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **expiresAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **expiresBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **valid** | **String**| - &#x60;expired&#x60;: Matches coupons in which the expiry date is set and in the past. - &#x60;validNow&#x60;: Matches coupons in which start date is null or in the past and expiry date is null or in the future. - &#x60;validFuture&#x60;: Matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **batchId** | **String**| Filter results by batches of coupons | [optional]
 **usable** | **String**| - &#x60;true&#x60;: only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned. - &#x60;false&#x60;: only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60; will be returned.  | [optional] [enum: true, false]
 **referralId** | **Integer**| Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code. | [optional]
 **recipientIntegrationId** | **String**| Filter results by match with a profile id specified in the coupon&#39;s &#x60;RecipientIntegrationId&#x60; field.  | [optional]
 **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="deleteLoyaltyCard"></a>
# **deleteLoyaltyCard**
> deleteLoyaltyCard(loyaltyProgramId, loyaltyCardIdentifier)

Delete loyalty card

Delete the specified loyalty card.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer loyaltyProgramId = 56; // Integer | Identifier of the loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs endpoint](https://docs.talon.one/management-api/#operation/getLoyaltyPrograms). 
    String loyaltyCardIdentifier = "loyaltyCardIdentifier_example"; // String | Identifier of the loyalty card.
    try {
      apiInstance.deleteLoyaltyCard(loyaltyProgramId, loyaltyCardIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteLoyaltyCard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyProgramId** | **Integer**| Identifier of the loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs endpoint](https://docs.talon.one/management-api/#operation/getLoyaltyPrograms).  |
 **loyaltyCardIdentifier** | **String**| Identifier of the loyalty card. |

### Return type

null (empty response body)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**404** | Not found |  -  |

<a name="deleteReferral"></a>
# **deleteReferral**
> deleteReferral(applicationId, campaignId, referralId)

Delete referral

Delete the specified referral.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String referralId = "referralId_example"; // String | The ID of the referral code to delete
    try {
      apiInstance.deleteReferral(applicationId, campaignId, referralId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteReferral");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **referralId** | **String**| The ID of the referral code to delete |

### Return type

null (empty response body)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="destroySession"></a>
# **destroySession**
> destroySession()

Destroy session

Destroys the session.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      apiInstance.destroySession();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#destroySession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="exportAccountCollectionItems"></a>
# **exportAccountCollectionItems**
> String exportAccountCollectionItems(collectionId)

Export account-level collection items to CSV file

Download a file containing an account-level collection&#39;s items.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer collectionId = 56; // Integer | The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication).
    try {
      String result = apiInstance.exportAccountCollectionItems(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportAccountCollectionItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Integer**| The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication). |

### Return type

**String**

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized - Invalid API key |  -  |
**404** | Not found |  -  |

<a name="exportCollectionItems"></a>
# **exportCollectionItems**
> String exportCollectionItems(applicationId, campaignId, collectionId)

Export a collection&#39;s items to CSV file

Download a file containing a collection&#39;s items.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Integer collectionId = 56; // Integer | The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication).
    try {
      String result = apiInstance.exportCollectionItems(applicationId, campaignId, collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportCollectionItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **collectionId** | **Integer**| The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication). |

### Return type

**String**

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**404** | Not found |  -  |

<a name="exportCoupons"></a>
# **exportCoupons**
> String exportCoupons(applicationId, campaignId, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch, dateFormat, campaignState)

Export coupons to CSV file

Download a file containing the coupons that match the given properties.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    BigDecimal campaignId = new BigDecimal(); // BigDecimal | Filter results by campaign.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Integer referralId = 56; // Integer | Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile id specified in the coupon's RecipientIntegrationId field
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code
    String dateFormat = "dateFormat_example"; // String | Determines the format of dates in the export document.
    String campaignState = "campaignState_example"; // String | Filter results by the state of the campaign.  - `enabled`: Campaigns that are scheduled, running (activated), or expired. - `running`: Campaigns that are running (activated). - `disabled`: Campaigns that are disabled. - `expired`: Campaigns that are expired. - `archived`: Campaigns that are archived. - `draft`: Campaigns that are drafts. 
    try {
      String result = apiInstance.exportCoupons(applicationId, campaignId, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch, dateFormat, campaignState);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportCoupons");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **BigDecimal**| Filter results by campaign. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false]
 **referralId** | **Integer**| Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code. | [optional]
 **recipientIntegrationId** | **String**| Filter results by match with a profile id specified in the coupon&#39;s RecipientIntegrationId field | [optional]
 **batchId** | **String**| Filter results by batches of coupons | [optional]
 **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code | [optional] [default to false]
 **dateFormat** | **String**| Determines the format of dates in the export document. | [optional] [enum: excel, ISO8601]
 **campaignState** | **String**| Filter results by the state of the campaign.  - &#x60;enabled&#x60;: Campaigns that are scheduled, running (activated), or expired. - &#x60;running&#x60;: Campaigns that are running (activated). - &#x60;disabled&#x60;: Campaigns that are disabled. - &#x60;expired&#x60;: Campaigns that are expired. - &#x60;archived&#x60;: Campaigns that are archived. - &#x60;draft&#x60;: Campaigns that are drafts.  | [optional] [enum: enabled, disabled, archived, draft, scheduled, running, expired]

### Return type

**String**

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="exportCustomerSessions"></a>
# **exportCustomerSessions**
> String exportCustomerSessions(applicationId, createdBefore, createdAfter, profileIntegrationId, dateFormat, customerSessionState)

Export customer sessions to CSV file

Download a file containing the customer sessions that match the request.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string.
    String profileIntegrationId = "profileIntegrationId_example"; // String | Only return sessions for the customer that matches this customer integration ID.
    String dateFormat = "dateFormat_example"; // String | Determines the format of dates in the export document.
    String customerSessionState = "customerSessionState_example"; // String | Filter results by state.
    try {
      String result = apiInstance.exportCustomerSessions(applicationId, createdBefore, createdAfter, profileIntegrationId, dateFormat, customerSessionState);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportCustomerSessions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string. | [optional]
 **profileIntegrationId** | **String**| Only return sessions for the customer that matches this customer integration ID. | [optional]
 **dateFormat** | **String**| Determines the format of dates in the export document. | [optional] [enum: excel, ISO8601]
 **customerSessionState** | **String**| Filter results by state. | [optional] [enum: open, closed, partially_returned, cancelled]

### Return type

**String**

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="exportEffects"></a>
# **exportEffects**
> String exportEffects(applicationId, campaignId, createdBefore, createdAfter, dateFormat)

Export triggered effects to CSV file

Download a file containing the triggered effects that match the given attributes.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    BigDecimal campaignId = new BigDecimal(); // BigDecimal | Filter results by campaign.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    String dateFormat = "dateFormat_example"; // String | Determines the format of dates in the export document.
    try {
      String result = apiInstance.exportEffects(applicationId, campaignId, createdBefore, createdAfter, dateFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportEffects");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **BigDecimal**| Filter results by campaign. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **dateFormat** | **String**| Determines the format of dates in the export document. | [optional] [enum: excel, ISO8601]

### Return type

**String**

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="exportLoyaltyBalance"></a>
# **exportLoyaltyBalance**
> String exportLoyaltyBalance(loyaltyProgramId)

Export customer loyalty balance to a CSV file

Download a file with the balance of each customer in the loyalty program.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String loyaltyProgramId = "loyaltyProgramId_example"; // String | The identifier for the loyalty program.
    try {
      String result = apiInstance.exportLoyaltyBalance(loyaltyProgramId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportLoyaltyBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyProgramId** | **String**| The identifier for the loyalty program. |

### Return type

**String**

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="exportLoyaltyLedger"></a>
# **exportLoyaltyLedger**
> String exportLoyaltyLedger(rangeStart, rangeEnd, loyaltyProgramId, integrationId, dateFormat)

Export a customer&#39;s loyalty ledger log to CSV file

Download a file with a customer&#39;s ledger log in the loyalty program

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    OffsetDateTime rangeStart = new OffsetDateTime(); // OffsetDateTime | Only return results from after this timestamp, must be an RFC3339 timestamp string
    OffsetDateTime rangeEnd = new OffsetDateTime(); // OffsetDateTime | Only return results from before this timestamp, must be an RFC3339 timestamp string
    String loyaltyProgramId = "loyaltyProgramId_example"; // String | The identifier for the loyalty program.
    String integrationId = "integrationId_example"; // String | The identifier of the profile.
    String dateFormat = "dateFormat_example"; // String | Determines the format of dates in the export document.
    try {
      String result = apiInstance.exportLoyaltyLedger(rangeStart, rangeEnd, loyaltyProgramId, integrationId, dateFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportLoyaltyLedger");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp, must be an RFC3339 timestamp string |
 **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp, must be an RFC3339 timestamp string |
 **loyaltyProgramId** | **String**| The identifier for the loyalty program. |
 **integrationId** | **String**| The identifier of the profile. |
 **dateFormat** | **String**| Determines the format of dates in the export document. | [optional] [enum: excel, ISO8601]

### Return type

**String**

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="exportReferrals"></a>
# **exportReferrals**
> String exportReferrals(applicationId, campaignId, createdBefore, createdAfter, valid, usable, batchId, dateFormat)

Export referrals to CSV file

Download a file containing the referrals that match the given parameters.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    BigDecimal campaignId = new BigDecimal(); // BigDecimal | Filter results by campaign.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    String valid = "valid_example"; // String | - `expired`: Matches referrals in which the expiry date is set and in the past. - `validNow`: Matches referrals in which start date is null or in the past and expiry date is null or in the future. - `validFuture`: Matches referrals in which start date is set and in the future. 
    String usable = "usable_example"; // String | - `true`, only referrals where `usageCounter < usageLimit` will be returned. - `false`, only referrals where `usageCounter >= usageLimit` will be returned. 
    String batchId = "batchId_example"; // String | Filter results by batches of referrals
    String dateFormat = "dateFormat_example"; // String | Determines the format of dates in the export document.
    try {
      String result = apiInstance.exportReferrals(applicationId, campaignId, createdBefore, createdAfter, valid, usable, batchId, dateFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#exportReferrals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **BigDecimal**| Filter results by campaign. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **valid** | **String**| - &#x60;expired&#x60;: Matches referrals in which the expiry date is set and in the past. - &#x60;validNow&#x60;: Matches referrals in which start date is null or in the past and expiry date is null or in the future. - &#x60;validFuture&#x60;: Matches referrals in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **usable** | **String**| - &#x60;true&#x60;, only referrals where &#x60;usageCounter &lt; usageLimit&#x60; will be returned. - &#x60;false&#x60;, only referrals where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60; will be returned.  | [optional] [enum: true, false]
 **batchId** | **String**| Filter results by batches of referrals | [optional]
 **dateFormat** | **String**| Determines the format of dates in the export document. | [optional] [enum: excel, ISO8601]

### Return type

**String**

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAccessLogsWithoutTotalCount"></a>
# **getAccessLogsWithoutTotalCount**
> InlineResponse20010 getAccessLogsWithoutTotalCount(applicationId, rangeStart, rangeEnd, path, method, status, pageSize, skip, sort)

Get access logs for Application

Retrieve the list of API calls to this Application matching the specified criteria. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    OffsetDateTime rangeStart = new OffsetDateTime(); // OffsetDateTime | Only return results from after this timestamp, must be an RFC3339 timestamp string
    OffsetDateTime rangeEnd = new OffsetDateTime(); // OffsetDateTime | Only return results from before this timestamp, must be an RFC3339 timestamp string
    String path = "path_example"; // String | Only return results where the request path matches the given regular expression.
    String method = "method_example"; // String | Only return results where the request method matches the given regular expression.
    String status = "status_example"; // String | Filter results by HTTP status codes.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    try {
      InlineResponse20010 result = apiInstance.getAccessLogsWithoutTotalCount(applicationId, rangeStart, rangeEnd, path, method, status, pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAccessLogsWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp, must be an RFC3339 timestamp string |
 **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp, must be an RFC3339 timestamp string |
 **path** | **String**| Only return results where the request path matches the given regular expression. | [optional]
 **method** | **String**| Only return results where the request method matches the given regular expression. | [optional] [enum: get, put, post, delete, patch]
 **status** | **String**| Filter results by HTTP status codes. | [optional] [enum: success, error]
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAccount"></a>
# **getAccount**
> Account getAccount(accountId)

Get account details

Return the details of your companies Talon.One account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer accountId = 56; // Integer | The identifier of the account. Retrieve it via the [List users in account endpoint](https://docs.talon.one/management-api#operation/getUsers), in the `accountId` property. 
    try {
      Account result = apiInstance.getAccount(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| The identifier of the account. Retrieve it via the [List users in account endpoint](https://docs.talon.one/management-api#operation/getUsers), in the &#x60;accountId&#x60; property.  |

### Return type

[**Account**](Account.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAccountAnalytics"></a>
# **getAccountAnalytics**
> AccountAnalytics getAccountAnalytics(accountId)

Get account analytics

Return the analytics of your Talon.One account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer accountId = 56; // Integer | The identifier of the account. Retrieve it via the [List users in account endpoint](https://docs.talon.one/management-api#operation/getUsers), in the `accountId` property. 
    try {
      AccountAnalytics result = apiInstance.getAccountAnalytics(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAccountAnalytics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| The identifier of the account. Retrieve it via the [List users in account endpoint](https://docs.talon.one/management-api#operation/getUsers), in the &#x60;accountId&#x60; property.  |

### Return type

[**AccountAnalytics**](AccountAnalytics.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAccountCollection"></a>
# **getAccountCollection**
> Collection getAccountCollection(collectionId)

Get account-level collection

Retrieve the given account-level collection

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer collectionId = 56; // Integer | The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication).
    try {
      Collection result = apiInstance.getAccountCollection(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAccountCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Integer**| The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication). |

### Return type

[**Collection**](Collection.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not found |  -  |

<a name="getAdditionalCost"></a>
# **getAdditionalCost**
> AccountAdditionalCost getAdditionalCost(additionalCostId)

Get additional cost

Returns the additional cost. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer additionalCostId = 56; // Integer | 
    try {
      AccountAdditionalCost result = apiInstance.getAdditionalCost(additionalCostId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAdditionalCost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **additionalCostId** | **Integer**|  |

### Return type

[**AccountAdditionalCost**](AccountAdditionalCost.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAdditionalCosts"></a>
# **getAdditionalCosts**
> InlineResponse20023 getAdditionalCosts(pageSize, skip, sort)

List additional costs

Returns all the defined additional costs for the account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    try {
      InlineResponse20023 result = apiInstance.getAdditionalCosts(pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAdditionalCosts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAllAccessLogs"></a>
# **getAllAccessLogs**
> InlineResponse20011 getAllAccessLogs(rangeStart, rangeEnd, path, method, status, pageSize, skip, sort)

List access logs

Fetches the access logs for the entire account. Sensitive requests (logins) are _always_ filtered from the logs. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    OffsetDateTime rangeStart = new OffsetDateTime(); // OffsetDateTime | Only return results from after this timestamp, must be an RFC3339 timestamp string
    OffsetDateTime rangeEnd = new OffsetDateTime(); // OffsetDateTime | Only return results from before this timestamp, must be an RFC3339 timestamp string
    String path = "path_example"; // String | Only return results where the request path matches the given regular expression.
    String method = "method_example"; // String | Only return results where the request method matches the given regular expression.
    String status = "status_example"; // String | Filter results by HTTP status codes.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    try {
      InlineResponse20011 result = apiInstance.getAllAccessLogs(rangeStart, rangeEnd, path, method, status, pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAllAccessLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp, must be an RFC3339 timestamp string |
 **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp, must be an RFC3339 timestamp string |
 **path** | **String**| Only return results where the request path matches the given regular expression. | [optional]
 **method** | **String**| Only return results where the request method matches the given regular expression. | [optional] [enum: get, put, post, delete, patch]
 **status** | **String**| Filter results by HTTP status codes. | [optional] [enum: success, error]
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAllRoles"></a>
# **getAllRoles**
> InlineResponse20031 getAllRoles()

List roles

List all roles.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      InlineResponse20031 result = apiInstance.getAllRoles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAllRoles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getApplication"></a>
# **getApplication**
> Application getApplication(applicationId)

Get application

Get the application specified by the ID.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    try {
      Application result = apiInstance.getApplication(applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |

### Return type

[**Application**](Application.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getApplicationApiHealth"></a>
# **getApplicationApiHealth**
> ApplicationApiHealth getApplicationApiHealth(applicationId)

Get report of health of application API

Display the health of the application and show the last time the Application was used. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    try {
      ApplicationApiHealth result = apiInstance.getApplicationApiHealth(applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationApiHealth");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |

### Return type

[**ApplicationApiHealth**](ApplicationApiHealth.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getApplicationCustomer"></a>
# **getApplicationCustomer**
> ApplicationCustomer getApplicationCustomer(applicationId, customerId)

Get application&#39;s customer

Retrieve the customers of the specified application. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer customerId = 56; // Integer | The value of the `id` property of a customer profile. Get it with the [List application's customers](#operation/getApplicationCustomers) endpoint. 
    try {
      ApplicationCustomer result = apiInstance.getApplicationCustomer(applicationId, customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationCustomer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **customerId** | **Integer**| The value of the &#x60;id&#x60; property of a customer profile. Get it with the [List application&#39;s customers](#operation/getApplicationCustomers) endpoint.  |

### Return type

[**ApplicationCustomer**](ApplicationCustomer.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getApplicationCustomerFriends"></a>
# **getApplicationCustomerFriends**
> InlineResponse20021 getApplicationCustomerFriends(applicationId, integrationId, pageSize, skip, sort, withTotalResultSize)

List friends referred by customer profile

List the friends referred by the specified customer profile in this Application. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    String integrationId = "integrationId_example"; // String | The Integration ID of the Advocate's Profile.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    try {
      InlineResponse20021 result = apiInstance.getApplicationCustomerFriends(applicationId, integrationId, pageSize, skip, sort, withTotalResultSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationCustomerFriends");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **integrationId** | **String**| The Integration ID of the Advocate&#39;s Profile. |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional]

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getApplicationCustomers"></a>
# **getApplicationCustomers**
> InlineResponse20013 getApplicationCustomers(applicationId, integrationId, pageSize, skip, withTotalResultSize)

List application&#39;s customers

List all the customers of the specified application.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    String integrationId = "integrationId_example"; // String | Filter results performing an exact matching against the profile integration identifier.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    try {
      InlineResponse20013 result = apiInstance.getApplicationCustomers(applicationId, integrationId, pageSize, skip, withTotalResultSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationCustomers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **integrationId** | **String**| Filter results performing an exact matching against the profile integration identifier. | [optional]
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getApplicationCustomersByAttributes"></a>
# **getApplicationCustomersByAttributes**
> InlineResponse20014 getApplicationCustomersByAttributes(applicationId, body, pageSize, skip, withTotalResultSize)

List application customers matching the given attributes

Get a list of the application customers matching the provided criteria.  The match is successful if all the attributes of the request are found in a profile, even if the profile has more attributes that are not present on the request. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    CustomerProfileSearchQuery body = new CustomerProfileSearchQuery(); // CustomerProfileSearchQuery | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    try {
      InlineResponse20014 result = apiInstance.getApplicationCustomersByAttributes(applicationId, body, pageSize, skip, withTotalResultSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationCustomersByAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **body** | [**CustomerProfileSearchQuery**](CustomerProfileSearchQuery.md)|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getApplicationEventTypes"></a>
# **getApplicationEventTypes**
> InlineResponse20019 getApplicationEventTypes(applicationId, pageSize, skip, sort)

List Applications event types

Get all of the distinct values of the Event &#x60;type&#x60; property for events recorded in the application.  See also: [Track an event](/integration-api/#operation/trackEvent) 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    try {
      InlineResponse20019 result = apiInstance.getApplicationEventTypes(applicationId, pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationEventTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getApplicationEventsWithoutTotalCount"></a>
# **getApplicationEventsWithoutTotalCount**
> InlineResponse20018 getApplicationEventsWithoutTotalCount(applicationId, pageSize, skip, sort, type, createdBefore, createdAfter, session, profile, customerName, customerEmail, couponCode, referralCode, ruleQuery, campaignQuery)

List Applications events

Lists all events recorded for an application. Instead of having the total number of results in the response, this endpoint only if there are more results. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String type = "type_example"; // String | Comma-separated list of types by which to filter events. Must be exact match(es).
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Only return events created before this date. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Only return events created after this date. You can use any timezone. Talon.One will convert to UTC internally.
    String session = "session_example"; // String | Session integration ID filter for events. Must be exact match.
    String profile = "profile_example"; // String | Profile integration ID filter for events. Must be exact match.
    String customerName = "customerName_example"; // String | Customer name filter for events. Will match substrings case-insensitively.
    String customerEmail = "customerEmail_example"; // String | Customer e-mail address filter for events. Will match substrings case-insensitively.
    String couponCode = "couponCode_example"; // String | Coupon code
    String referralCode = "referralCode_example"; // String | Referral code
    String ruleQuery = "ruleQuery_example"; // String | Rule name filter for events
    String campaignQuery = "campaignQuery_example"; // String | Campaign name filter for events
    try {
      InlineResponse20018 result = apiInstance.getApplicationEventsWithoutTotalCount(applicationId, pageSize, skip, sort, type, createdBefore, createdAfter, session, profile, customerName, customerEmail, couponCode, referralCode, ruleQuery, campaignQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationEventsWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **type** | **String**| Comma-separated list of types by which to filter events. Must be exact match(es). | [optional]
 **createdBefore** | **OffsetDateTime**| Only return events created before this date. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Only return events created after this date. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **session** | **String**| Session integration ID filter for events. Must be exact match. | [optional]
 **profile** | **String**| Profile integration ID filter for events. Must be exact match. | [optional]
 **customerName** | **String**| Customer name filter for events. Will match substrings case-insensitively. | [optional]
 **customerEmail** | **String**| Customer e-mail address filter for events. Will match substrings case-insensitively. | [optional]
 **couponCode** | **String**| Coupon code | [optional]
 **referralCode** | **String**| Referral code | [optional]
 **ruleQuery** | **String**| Rule name filter for events | [optional]
 **campaignQuery** | **String**| Campaign name filter for events | [optional]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getApplicationSession"></a>
# **getApplicationSession**
> ApplicationSession getApplicationSession(applicationId, sessionId)

Get Application session

Get the details of the given session. You can list the sessions with the [List Application sessions](#operation/getApplicationSessions) endpoint. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer sessionId = 56; // Integer | The **internal** ID of the session. You can get the ID with the [List Application sessions endpoint](#operation/getApplicationSessions). 
    try {
      ApplicationSession result = apiInstance.getApplicationSession(applicationId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **sessionId** | **Integer**| The **internal** ID of the session. You can get the ID with the [List Application sessions endpoint](#operation/getApplicationSessions).  |

### Return type

[**ApplicationSession**](ApplicationSession.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getApplicationSessions"></a>
# **getApplicationSessions**
> InlineResponse20017 getApplicationSessions(applicationId, pageSize, skip, sort, profile, state, createdBefore, createdAfter, coupon, referral, integrationId)

List Application sessions

List all the sessions of the specified Application. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String profile = "profile_example"; // String | Profile integration ID filter for sessions. Must be exact match.
    String state = "state_example"; // String | Filter by sessions with this state. Must be exact match.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Only return events created before this date. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Only return events created after this date. You can use any timezone. Talon.One will convert to UTC internally.
    String coupon = "coupon_example"; // String | Filter by sessions with this coupon. Must be exact match.
    String referral = "referral_example"; // String | Filter by sessions with this referral. Must be exact match.
    String integrationId = "integrationId_example"; // String | Filter by sessions with this integrationId. Must be exact match.
    try {
      InlineResponse20017 result = apiInstance.getApplicationSessions(applicationId, pageSize, skip, sort, profile, state, createdBefore, createdAfter, coupon, referral, integrationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationSessions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **profile** | **String**| Profile integration ID filter for sessions. Must be exact match. | [optional]
 **state** | **String**| Filter by sessions with this state. Must be exact match. | [optional] [enum: open, closed, partially_returned, cancelled]
 **createdBefore** | **OffsetDateTime**| Only return events created before this date. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Only return events created after this date. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **coupon** | **String**| Filter by sessions with this coupon. Must be exact match. | [optional]
 **referral** | **String**| Filter by sessions with this referral. Must be exact match. | [optional]
 **integrationId** | **String**| Filter by sessions with this integrationId. Must be exact match. | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getApplications"></a>
# **getApplications**
> InlineResponse2001 getApplications(pageSize, skip, sort)

List applications

List all applications in the current account.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    try {
      InlineResponse2001 result = apiInstance.getApplications(pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAttribute"></a>
# **getAttribute**
> Attribute getAttribute(attributeId)

Get custom attribute

Returns custom attribute for the account by its id. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer attributeId = 56; // Integer | 
    try {
      Attribute result = apiInstance.getAttribute(attributeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeId** | **Integer**|  |

### Return type

[**Attribute**](Attribute.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAttributes"></a>
# **getAttributes**
> InlineResponse20022 getAttributes(pageSize, skip, sort, entity)

List custom attributes

Returns all the defined custom attributes for the account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String entity = "entity_example"; // String | Returned attributes will be filtered by supplied entity
    try {
      InlineResponse20022 result = apiInstance.getAttributes(pageSize, skip, sort, entity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **entity** | **String**| Returned attributes will be filtered by supplied entity | [optional]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAudiences"></a>
# **getAudiences**
> InlineResponse20020 getAudiences(pageSize, skip, sort, withTotalResultSize)

List audiences

Get All audiences created in the account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    try {
      InlineResponse20020 result = apiInstance.getAudiences(pageSize, skip, sort, withTotalResultSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAudiences");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional]

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCampaign"></a>
# **getCampaign**
> Campaign getCampaign(applicationId, campaignId)

Get campaign

Retrieve the given campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    try {
      Campaign result = apiInstance.getCampaign(applicationId, campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCampaignAnalytics"></a>
# **getCampaignAnalytics**
> InlineResponse20012 getCampaignAnalytics(applicationId, campaignId, rangeStart, rangeEnd, granularity)

Get analytics of campaigns

Retrieve statistical data about the performance of the given campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    OffsetDateTime rangeStart = new OffsetDateTime(); // OffsetDateTime | Only return results from after this timestamp, must be an RFC3339 timestamp string
    OffsetDateTime rangeEnd = new OffsetDateTime(); // OffsetDateTime | Only return results from before this timestamp, must be an RFC3339 timestamp string
    String granularity = "granularity_example"; // String | The time interval between the results in the returned time-series.
    try {
      InlineResponse20012 result = apiInstance.getCampaignAnalytics(applicationId, campaignId, rangeStart, rangeEnd, granularity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCampaignAnalytics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp, must be an RFC3339 timestamp string |
 **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp, must be an RFC3339 timestamp string |
 **granularity** | **String**| The time interval between the results in the returned time-series. | [optional] [enum: 1 hour, 1 day, 1 week, 1 month, 1 year]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCampaignByAttributes"></a>
# **getCampaignByAttributes**
> InlineResponse2002 getCampaignByAttributes(applicationId, body, pageSize, skip, sort, campaignState)

List campaigns that match the given attributes

Get a list of all the campaigns that match a set of attributes. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    CampaignSearch body = new CampaignSearch(); // CampaignSearch | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String campaignState = "campaignState_example"; // String | Filter results by the state of the campaign.  - `enabled`: Campaigns that are scheduled, running (activated), or expired. - `running`: Campaigns that are running (activated). - `disabled`: Campaigns that are disabled. - `expired`: Campaigns that are expired. - `archived`: Campaigns that are archived. - `draft`: Campaigns that are drafts. 
    try {
      InlineResponse2002 result = apiInstance.getCampaignByAttributes(applicationId, body, pageSize, skip, sort, campaignState);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCampaignByAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **body** | [**CampaignSearch**](CampaignSearch.md)|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **campaignState** | **String**| Filter results by the state of the campaign.  - &#x60;enabled&#x60;: Campaigns that are scheduled, running (activated), or expired. - &#x60;running&#x60;: Campaigns that are running (activated). - &#x60;disabled&#x60;: Campaigns that are disabled. - &#x60;expired&#x60;: Campaigns that are expired. - &#x60;archived&#x60;: Campaigns that are archived. - &#x60;draft&#x60;: Campaigns that are drafts.  | [optional] [enum: enabled, disabled, archived, draft, scheduled, running, expired]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCampaigns"></a>
# **getCampaigns**
> InlineResponse2002 getCampaigns(applicationId, pageSize, skip, sort, campaignState, name, tags, createdBefore, createdAfter, campaignGroupId, templateId)

List campaigns

List the campaigns of the specified application that match your filter criteria. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String campaignState = "campaignState_example"; // String | Filter results by the state of the campaign.  - `enabled`: Campaigns that are scheduled, running (activated), or expired. - `running`: Campaigns that are running (activated). - `disabled`: Campaigns that are disabled. - `expired`: Campaigns that are expired. - `archived`: Campaigns that are archived. - `draft`: Campaigns that are drafts. 
    String name = "name_example"; // String | Filter results performing case-insensitive matching against the name of the campaign.
    String tags = "tags_example"; // String | Filter results performing case-insensitive matching against the tags of the campaign. When used in conjunction with the \"name\" query parameter, a logical OR will be performed to search both tags and name for the provided values 
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the campaign creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the campaign creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    Integer campaignGroupId = 56; // Integer | Filter results to campaigns owned by the specified campaign group ID.
    Integer templateId = 56; // Integer | The ID of the Campaign Template this Campaign was created from.
    try {
      InlineResponse2002 result = apiInstance.getCampaigns(applicationId, pageSize, skip, sort, campaignState, name, tags, createdBefore, createdAfter, campaignGroupId, templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCampaigns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **campaignState** | **String**| Filter results by the state of the campaign.  - &#x60;enabled&#x60;: Campaigns that are scheduled, running (activated), or expired. - &#x60;running&#x60;: Campaigns that are running (activated). - &#x60;disabled&#x60;: Campaigns that are disabled. - &#x60;expired&#x60;: Campaigns that are expired. - &#x60;archived&#x60;: Campaigns that are archived. - &#x60;draft&#x60;: Campaigns that are drafts.  | [optional] [enum: enabled, disabled, archived, draft, scheduled, running, expired]
 **name** | **String**| Filter results performing case-insensitive matching against the name of the campaign. | [optional]
 **tags** | **String**| Filter results performing case-insensitive matching against the tags of the campaign. When used in conjunction with the \&quot;name\&quot; query parameter, a logical OR will be performed to search both tags and name for the provided values  | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the campaign creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the campaign creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **campaignGroupId** | **Integer**| Filter results to campaigns owned by the specified campaign group ID. | [optional]
 **templateId** | **Integer**| The ID of the Campaign Template this Campaign was created from. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getChanges"></a>
# **getChanges**
> InlineResponse20029 getChanges(pageSize, skip, sort, applicationId, entityPath, userId, createdBefore, createdAfter, withTotalResultSize, includeOld)

Get audit log for an account

Get list of changes caused by API calls for an account. Only accessible for admins.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    BigDecimal applicationId = new BigDecimal(); // BigDecimal | Filter results by Application ID.
    String entityPath = "entityPath_example"; // String | Filter results on a case insensitive matching of the url path of the entity
    Integer userId = 56; // Integer | Filter results that match the given user ID.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the change creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the change creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    Boolean includeOld = true; // Boolean | When this flag is set to false, the state without the change will not be returned. The default value is true.
    try {
      InlineResponse20029 result = apiInstance.getChanges(pageSize, skip, sort, applicationId, entityPath, userId, createdBefore, createdAfter, withTotalResultSize, includeOld);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getChanges");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **applicationId** | **BigDecimal**| Filter results by Application ID. | [optional]
 **entityPath** | **String**| Filter results on a case insensitive matching of the url path of the entity | [optional]
 **userId** | **Integer**| Filter results that match the given user ID. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the change creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the change creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional]
 **includeOld** | **Boolean**| When this flag is set to false, the state without the change will not be returned. The default value is true. | [optional]

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCollection"></a>
# **getCollection**
> Collection getCollection(applicationId, campaignId, collectionId)

Get collection

Retrieve the given collection.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Integer collectionId = 56; // Integer | The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication).
    try {
      Collection result = apiInstance.getCollection(applicationId, campaignId, collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **collectionId** | **Integer**| The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication). |

### Return type

[**Collection**](Collection.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not found |  -  |

<a name="getCouponsWithoutTotalCount"></a>
# **getCouponsWithoutTotalCount**
> InlineResponse2005 getCouponsWithoutTotalCount(applicationId, campaignId, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch)

List coupons

List all the coupons matching the specified criteria. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Integer referralId = 56; // Integer | Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile id specified in the coupon's RecipientIntegrationId field
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code
    try {
      InlineResponse2005 result = apiInstance.getCouponsWithoutTotalCount(applicationId, campaignId, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCouponsWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false]
 **referralId** | **Integer**| Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code. | [optional]
 **recipientIntegrationId** | **String**| Filter results by match with a profile id specified in the coupon&#39;s RecipientIntegrationId field | [optional]
 **batchId** | **String**| Filter results by batches of coupons | [optional]
 **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code | [optional] [default to false]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCustomerActivityReport"></a>
# **getCustomerActivityReport**
> CustomerActivityReport getCustomerActivityReport(rangeStart, rangeEnd, applicationId, customerId, pageSize, skip)

Get customer&#39;s activity report

Fetch the summary report of a given customer in the given application, in a time range.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    OffsetDateTime rangeStart = new OffsetDateTime(); // OffsetDateTime | Only return results from after this timestamp, must be an RFC3339 timestamp string
    OffsetDateTime rangeEnd = new OffsetDateTime(); // OffsetDateTime | Only return results from before this timestamp, must be an RFC3339 timestamp string
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer customerId = 56; // Integer | The value of the `id` property of a customer profile. Get it with the [List application's customers](#operation/getApplicationCustomers) endpoint. 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    try {
      CustomerActivityReport result = apiInstance.getCustomerActivityReport(rangeStart, rangeEnd, applicationId, customerId, pageSize, skip);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomerActivityReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp, must be an RFC3339 timestamp string |
 **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp, must be an RFC3339 timestamp string |
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **customerId** | **Integer**| The value of the &#x60;id&#x60; property of a customer profile. Get it with the [List application&#39;s customers](#operation/getApplicationCustomers) endpoint.  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]

### Return type

[**CustomerActivityReport**](CustomerActivityReport.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCustomerActivityReportsWithoutTotalCount"></a>
# **getCustomerActivityReportsWithoutTotalCount**
> InlineResponse20016 getCustomerActivityReportsWithoutTotalCount(rangeStart, rangeEnd, applicationId, pageSize, skip, sort, name, integrationId, campaignName, advocateName)

Get Activity Reports for Application Customers

Fetch summary reports for all application customers based on a time range. Instead of having the total number of results in the response, this endpoint only if there are more results.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    OffsetDateTime rangeStart = new OffsetDateTime(); // OffsetDateTime | Only return results from after this timestamp, must be an RFC3339 timestamp string
    OffsetDateTime rangeEnd = new OffsetDateTime(); // OffsetDateTime | Only return results from before this timestamp, must be an RFC3339 timestamp string
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String name = "name_example"; // String | Only return reports matching the customer name
    String integrationId = "integrationId_example"; // String | Filter results performing an exact matching against the profile integration identifier.
    String campaignName = "campaignName_example"; // String | Only return reports matching the campaignName
    String advocateName = "advocateName_example"; // String | Only return reports matching the current customer referrer name
    try {
      InlineResponse20016 result = apiInstance.getCustomerActivityReportsWithoutTotalCount(rangeStart, rangeEnd, applicationId, pageSize, skip, sort, name, integrationId, campaignName, advocateName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomerActivityReportsWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp, must be an RFC3339 timestamp string |
 **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp, must be an RFC3339 timestamp string |
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **name** | **String**| Only return reports matching the customer name | [optional]
 **integrationId** | **String**| Filter results performing an exact matching against the profile integration identifier. | [optional]
 **campaignName** | **String**| Only return reports matching the campaignName | [optional]
 **advocateName** | **String**| Only return reports matching the current customer referrer name | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCustomerAnalytics"></a>
# **getCustomerAnalytics**
> CustomerAnalytics getCustomerAnalytics(applicationId, customerId, pageSize, skip, sort)

Get customer&#39;s analytics report

Fetch analytics for a given customer in the given application.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer customerId = 56; // Integer | The value of the `id` property of a customer profile. Get it with the [List application's customers](#operation/getApplicationCustomers) endpoint. 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    try {
      CustomerAnalytics result = apiInstance.getCustomerAnalytics(applicationId, customerId, pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomerAnalytics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **customerId** | **Integer**| The value of the &#x60;id&#x60; property of a customer profile. Get it with the [List application&#39;s customers](#operation/getApplicationCustomers) endpoint.  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]

### Return type

[**CustomerAnalytics**](CustomerAnalytics.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCustomerProfile"></a>
# **getCustomerProfile**
> CustomerProfile getCustomerProfile(customerId)

Get customer profile

Return the details of the specified customer profile.  **Performance tip:** You can retrieve the same information via the Integration API, which can save you extra API requests. Consider these options: - Request the customer profile to be part of the response content using   [Update Customer Session](/integration-api/operation#updateCustomerSessionV2). - Send an empty update with the [Update Customer Profile](/integration-api/#operation/updateCustomerProfileV2) endpoint with &#x60;runRuleEngine&#x3D;false&#x60;. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer customerId = 56; // Integer | The value of the `id` property of a customer profile. Get it with the [List application's customers](#operation/getApplicationCustomers) endpoint. 
    try {
      CustomerProfile result = apiInstance.getCustomerProfile(customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomerProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| The value of the &#x60;id&#x60; property of a customer profile. Get it with the [List application&#39;s customers](#operation/getApplicationCustomers) endpoint.  |

### Return type

[**CustomerProfile**](CustomerProfile.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCustomerProfiles"></a>
# **getCustomerProfiles**
> InlineResponse20015 getCustomerProfiles(pageSize, skip)

List customer profiles

List all customer profiles.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    try {
      InlineResponse20015 result = apiInstance.getCustomerProfiles(pageSize, skip);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomerProfiles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCustomersByAttributes"></a>
# **getCustomersByAttributes**
> InlineResponse20015 getCustomersByAttributes(body, pageSize, skip)

List customer profiles matching the given attributes

Get a list of the customer profiles matching the provided criteria.  The match is successful if all the attributes of the request are found in a profile, even if the profile has more attributes that are not present on the request. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    CustomerProfileSearchQuery body = new CustomerProfileSearchQuery(); // CustomerProfileSearchQuery | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    try {
      InlineResponse20015 result = apiInstance.getCustomersByAttributes(body, pageSize, skip);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomersByAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerProfileSearchQuery**](CustomerProfileSearchQuery.md)|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getEventTypes"></a>
# **getEventTypes**
> InlineResponse20027 getEventTypes(name, includeOldVersions, pageSize, skip, sort)

List event types

Fetch all event type definitions for your account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String name = "name_example"; // String | Filter results to event types with the given name. This parameter implies `includeOldVersions`.
    Boolean includeOldVersions = false; // Boolean | Include all versions of every event type.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    try {
      InlineResponse20027 result = apiInstance.getEventTypes(name, includeOldVersions, pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getEventTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filter results to event types with the given name. This parameter implies &#x60;includeOldVersions&#x60;. | [optional]
 **includeOldVersions** | **Boolean**| Include all versions of every event type. | [optional] [default to false]
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getExports"></a>
# **getExports**
> InlineResponse20030 getExports(pageSize, skip, applicationId, campaignId, entity)

Get exports

List all past exports 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    BigDecimal applicationId = new BigDecimal(); // BigDecimal | Filter results by Application ID.
    Integer campaignId = 56; // Integer | Filter by the campaign ID on which the limit counters are used.
    String entity = "entity_example"; // String | The name of the entity type that was exported.
    try {
      InlineResponse20030 result = apiInstance.getExports(pageSize, skip, applicationId, campaignId, entity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getExports");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **applicationId** | **BigDecimal**| Filter results by Application ID. | [optional]
 **campaignId** | **Integer**| Filter by the campaign ID on which the limit counters are used. | [optional]
 **entity** | **String**| The name of the entity type that was exported. | [optional] [enum: Coupon, Referral, Effect, CustomerSession, LoyaltyLedger, LoyaltyLedgerLog, Collection]

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getLoyaltyPoints"></a>
# **getLoyaltyPoints**
> LoyaltyLedger getLoyaltyPoints(loyaltyProgramId, integrationId)

Get the Loyalty Ledger for this integrationID

Get the loyalty ledger for this profile integration ID.  To get the &#x60;integrationId&#x60; of the profile from a &#x60;sessionId&#x60;, use the [Update customer session](/integration-api/#operation/updateCustomerSessionV2). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String loyaltyProgramId = "loyaltyProgramId_example"; // String | The identifier for the loyalty program.
    String integrationId = "integrationId_example"; // String | The identifier of the profile.
    try {
      LoyaltyLedger result = apiInstance.getLoyaltyPoints(loyaltyProgramId, integrationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getLoyaltyPoints");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyProgramId** | **String**| The identifier for the loyalty program. |
 **integrationId** | **String**| The identifier of the profile. |

### Return type

[**LoyaltyLedger**](LoyaltyLedger.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getLoyaltyProgram"></a>
# **getLoyaltyProgram**
> LoyaltyProgram getLoyaltyProgram(loyaltyProgramId)

Get loyalty program

Get the specified [loyalty program](https://www.talon.one/glossary/loyalty). To list all loyalty programs in your Application, use [List loyalty programs](#operation/getLoyaltyPrograms).  To list the loyalty programs that a customer profile is part of, use the [List customer profile data](/integration-api/#operation/getCustomerInventory) 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer loyaltyProgramId = 56; // Integer | Identifier of the loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs endpoint](https://docs.talon.one/management-api/#operation/getLoyaltyPrograms). 
    try {
      LoyaltyProgram result = apiInstance.getLoyaltyProgram(loyaltyProgramId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getLoyaltyProgram");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyProgramId** | **Integer**| Identifier of the loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs endpoint](https://docs.talon.one/management-api/#operation/getLoyaltyPrograms).  |

### Return type

[**LoyaltyProgram**](LoyaltyProgram.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getLoyaltyPrograms"></a>
# **getLoyaltyPrograms**
> InlineResponse2007 getLoyaltyPrograms()

List loyalty programs

List the loyalty programs of the account.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      InlineResponse2007 result = apiInstance.getLoyaltyPrograms();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getLoyaltyPrograms");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getLoyaltyStatistics"></a>
# **getLoyaltyStatistics**
> LoyaltyStatistics getLoyaltyStatistics(loyaltyProgramId)

Get loyalty program statistics by loyalty program ID

Retrieve the statistics of the specified loyalty program such as the total active points, pending points, spent points and expired points. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer loyaltyProgramId = 56; // Integer | Identifier of the loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs endpoint](https://docs.talon.one/management-api/#operation/getLoyaltyPrograms). 
    try {
      LoyaltyStatistics result = apiInstance.getLoyaltyStatistics(loyaltyProgramId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getLoyaltyStatistics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyProgramId** | **Integer**| Identifier of the loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs endpoint](https://docs.talon.one/management-api/#operation/getLoyaltyPrograms).  |

### Return type

[**LoyaltyStatistics**](LoyaltyStatistics.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getReferralsWithoutTotalCount"></a>
# **getReferralsWithoutTotalCount**
> InlineResponse2006 getReferralsWithoutTotalCount(applicationId, campaignId, pageSize, skip, sort, code, createdBefore, createdAfter, valid, usable, advocate)

List referrals

List all referrals of the specified campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String code = "code_example"; // String | Filter results performing case-insensitive matching against the referral code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches referrals in which the expiry date is set and in the past. The second matches referrals in which start date is null or in the past and expiry date is null or in the future, the third matches referrals in which start date is set and in the future. 
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only referrals where `usageCounter < usageLimit` will be returned, \"false\" will return only referrals where `usageCounter >= usageLimit`. 
    String advocate = "advocate_example"; // String | Filter results by match with a profile id specified in the referral's AdvocateProfileIntegrationId field
    try {
      InlineResponse2006 result = apiInstance.getReferralsWithoutTotalCount(applicationId, campaignId, pageSize, skip, sort, code, createdBefore, createdAfter, valid, usable, advocate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getReferralsWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **code** | **String**| Filter results performing case-insensitive matching against the referral code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches referrals in which the expiry date is set and in the past. The second matches referrals in which start date is null or in the past and expiry date is null or in the future, the third matches referrals in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only referrals where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only referrals where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false]
 **advocate** | **String**| Filter results by match with a profile id specified in the referral&#39;s AdvocateProfileIntegrationId field | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getRole"></a>
# **getRole**
> Role getRole(roleId)

Get role

Get the details of the specified role. To see all the roles, use [List roles](#operation/getAllRoles). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer roleId = 56; // Integer | The Id of role. 
    try {
      Role result = apiInstance.getRole(roleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Integer**| The Id of role.  |

### Return type

[**Role**](Role.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getRuleset"></a>
# **getRuleset**
> Ruleset getRuleset(applicationId, campaignId, rulesetId)

Get ruleset

Retrieve the specified ruleset.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Integer rulesetId = 56; // Integer | 
    try {
      Ruleset result = apiInstance.getRuleset(applicationId, campaignId, rulesetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **rulesetId** | **Integer**|  |

### Return type

[**Ruleset**](Ruleset.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getRulesets"></a>
# **getRulesets**
> InlineResponse2003 getRulesets(applicationId, campaignId, pageSize, skip, sort)

List campaign rulesets

List all rulesets of this campaign. A ruleset is a revision of the rules of a campaign. **Important:** The response also includes deleted rules. You should only consider the latest revision of the returned rulesets. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    try {
      InlineResponse2003 result = apiInstance.getRulesets(applicationId, campaignId, pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getRulesets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getUser"></a>
# **getUser**
> User getUser(userId)

Get user

Retrieve the data (including an invitation code) for a user. Non-admin users can only get their own profile. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer userId = 56; // Integer | The ID of the user.
    try {
      User result = apiInstance.getUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The ID of the user. |

### Return type

[**User**](User.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getUsers"></a>
# **getUsers**
> InlineResponse20028 getUsers(pageSize, skip, sort)

List users in account

Retrieve all users in your account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    try {
      InlineResponse20028 result = apiInstance.getUsers(pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getWebhook"></a>
# **getWebhook**
> Webhook getWebhook(webhookId)

Get webhook

Returns a webhook by its id.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer webhookId = 56; // Integer | 
    try {
      Webhook result = apiInstance.getWebhook(webhookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **Integer**|  |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getWebhookActivationLogs"></a>
# **getWebhookActivationLogs**
> InlineResponse20025 getWebhookActivationLogs(pageSize, skip, sort, integrationRequestUuid, webhookId, applicationId, campaignId, createdBefore, createdAfter)

List webhook activation log entries

Webhook activation log entries would be created as soon as an integration request triggered an effect with a webhook

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String integrationRequestUuid = "integrationRequestUuid_example"; // String | Filter results by integration request UUID.
    BigDecimal webhookId = new BigDecimal(); // BigDecimal | Filter results by Webhook.
    BigDecimal applicationId = new BigDecimal(); // BigDecimal | Filter results by Application ID.
    BigDecimal campaignId = new BigDecimal(); // BigDecimal | Filter results by campaign.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Only return events created before this date. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Only return events created after this date. You can use any timezone. Talon.One will convert to UTC internally.
    try {
      InlineResponse20025 result = apiInstance.getWebhookActivationLogs(pageSize, skip, sort, integrationRequestUuid, webhookId, applicationId, campaignId, createdBefore, createdAfter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getWebhookActivationLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **integrationRequestUuid** | **String**| Filter results by integration request UUID. | [optional]
 **webhookId** | **BigDecimal**| Filter results by Webhook. | [optional]
 **applicationId** | **BigDecimal**| Filter results by Application ID. | [optional]
 **campaignId** | **BigDecimal**| Filter results by campaign. | [optional]
 **createdBefore** | **OffsetDateTime**| Only return events created before this date. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Only return events created after this date. You can use any timezone. Talon.One will convert to UTC internally. | [optional]

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getWebhookLogs"></a>
# **getWebhookLogs**
> InlineResponse20026 getWebhookLogs(pageSize, skip, sort, status, webhookId, applicationId, campaignId, requestUuid, createdBefore, createdAfter)

List webhook log entries

Retrieve all webhook log entries.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String status = "status_example"; // String | Filter results by HTTP status codes.
    BigDecimal webhookId = new BigDecimal(); // BigDecimal | Filter results by Webhook.
    BigDecimal applicationId = new BigDecimal(); // BigDecimal | Filter results by Application ID.
    BigDecimal campaignId = new BigDecimal(); // BigDecimal | Filter results by campaign.
    String requestUuid = "requestUuid_example"; // String | Filter results by request UUID.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results where request and response times to return entries before parameter value, expected to be an RFC3339 timestamp string. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results where request and response times to return entries after parameter value, expected to be an RFC3339 timestamp string. You can use any timezone. Talon.One will convert to UTC internally.
    try {
      InlineResponse20026 result = apiInstance.getWebhookLogs(pageSize, skip, sort, status, webhookId, applicationId, campaignId, requestUuid, createdBefore, createdAfter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getWebhookLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **status** | **String**| Filter results by HTTP status codes. | [optional] [enum: success, error]
 **webhookId** | **BigDecimal**| Filter results by Webhook. | [optional]
 **applicationId** | **BigDecimal**| Filter results by Application ID. | [optional]
 **campaignId** | **BigDecimal**| Filter results by campaign. | [optional]
 **requestUuid** | **String**| Filter results by request UUID. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results where request and response times to return entries before parameter value, expected to be an RFC3339 timestamp string. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results where request and response times to return entries after parameter value, expected to be an RFC3339 timestamp string. You can use any timezone. Talon.One will convert to UTC internally. | [optional]

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getWebhooks"></a>
# **getWebhooks**
> InlineResponse20024 getWebhooks(applicationIds, sort, pageSize, skip)

List webhooks

List all webhooks.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String applicationIds = "applicationIds_example"; // String | Filter by one or more application ids separated by comma
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    try {
      InlineResponse20024 result = apiInstance.getWebhooks(applicationIds, sort, pageSize, skip);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getWebhooks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationIds** | **String**| Filter by one or more application ids separated by comma | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="importAccountCollection"></a>
# **importAccountCollection**
> ModelImport importAccountCollection(collectionId, upFile)

Import data in existing account-level collection via CSV file

Upload a CSV file containing the collection of string values that should be attached as payload for collection. The file should be sent as multipart data.  The import **replaces** the initial content of the collection.  The CSV file **must** only contain the following column:  - &#x60;item&#x60;: the values in your collection.  A collection is limited to 500,000 items.  Example:  &#x60;&#x60;&#x60; item Addidas Nike Asics &#x60;&#x60;&#x60;  **Note:** Before sending a request to this endpoint, ensure the data in the CSV to import is different from the data currently stored in the collection. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer collectionId = 56; // Integer | The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication).
    String upFile = "upFile_example"; // String | The file with the information about the data that should be imported.
    try {
      ModelImport result = apiInstance.importAccountCollection(collectionId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importAccountCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Integer**| The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication). |
 **upFile** | **String**| The file with the information about the data that should be imported. | [optional]

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |

<a name="importAllowedList"></a>
# **importAllowedList**
> ModelImport importAllowedList(attributeId, upFile)

Import allowed values for attribute

Upload a CSV file containing a list of allowed values for the specified attribute. These values are also called [picklist values](/docs/product/account/dev-tools/managing-attributes/#picklist-values).  The file should be sent as multipart data.  The import **replaces** the previous list of allowed values for this attribute, if any.  The CSV file **must** only contain the following column: - &#x60;item&#x60; (required): the values in your allowed list, for example a list of SKU&#39;s.  An allowed list is limited to 500,000 items.  Example:  &#x60;&#x60;&#x60;text item CS-VG-04032021-UP-50D-10 CS-DV-04042021-UP-49D-12 CS-DG-02082021-UP-50G-07 &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer attributeId = 56; // Integer | 
    String upFile = "upFile_example"; // String | The file with the information about the data that should be imported.
    try {
      ModelImport result = apiInstance.importAllowedList(attributeId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importAllowedList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeId** | **Integer**|  |
 **upFile** | **String**| The file with the information about the data that should be imported. | [optional]

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized - Invalid API key |  -  |
**404** | Not found |  -  |

<a name="importCollection"></a>
# **importCollection**
> ModelImport importCollection(applicationId, campaignId, collectionId, upFile)

Import data in existing collection via CSV file

Upload a CSV file containing the collection of string values that should be attached as payload for collection. The file should be sent as multipart data.  The import **replaces** the initial content of the collection.  The CSV file **must** only contain the following column:  - &#x60;item&#x60;: the values in your collection.  A collection is limited to 500,000 items.  Example:  &#x60;&#x60;&#x60; item Addidas Nike Asics &#x60;&#x60;&#x60;  **Note:** Before sending a request to this endpoint, ensure the data in the CSV to import is different from the data currently stored in the collection. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Integer collectionId = 56; // Integer | The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication).
    String upFile = "upFile_example"; // String | The file with the information about the data that should be imported.
    try {
      ModelImport result = apiInstance.importCollection(applicationId, campaignId, collectionId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **collectionId** | **Integer**| The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication). |
 **upFile** | **String**| The file with the information about the data that should be imported. | [optional]

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |

<a name="importCoupons"></a>
# **importCoupons**
> ModelImport importCoupons(applicationId, campaignId, upFile)

Import coupons via CSV file

Upload a CSV file containing the coupons that should be created. The file should be sent as multipart data.  The CSV file can contain the following columns:  - &#x60;value&#x60; (required): The coupon code. - &#x60;expirydate&#x60;: The end date in RFC3339 of the code redemption period. - &#x60;startdate&#x60;: The start date in RFC3339 of the code redemption period. - &#x60;limitval&#x60;: The maximum amount of redemptions of this code. For unlimited redemptions, use &#x60;0&#x60;. Defaults to &#x60;1&#x60; when not provided. - &#x60;attributes&#x60;: A json object describing _custom_ referral attribute names and their values. Double the double-quotes in the object. - &#x60;discountlimit&#x60;: The amount of discounts that can be given with this coupon code.   For example, if you created a [custom attribute](https://docs.talon.one/docs/dev/concepts/attributes#custom-attributes)   called &#x60;category&#x60; associated to the coupon entity, set it with &#x60;\&quot;{\&quot;\&quot;category\&quot;\&quot;: \&quot;\&quot;10_off\&quot;\&quot;}\&quot;&#x60;.  **Important:** Do not leave empty columns in the file.  You can use the timezone of your choice. It is converted to UTC internally by Talon.One.  **Example:**  &#x60;&#x60;&#x60;text \&quot;value\&quot;,\&quot;expirydate\&quot;,\&quot;startdate\&quot;,\&quot;recipientintegrationid\&quot;,\&quot;limitval\&quot;,\&quot;attributes\&quot;,\&quot;discountlimit\&quot; COUP1,2018-07-01T04:00:00Z,2018-05-01T04:00:00Z,cust123,1,\&quot;{\&quot;\&quot;Category\&quot;\&quot;: \&quot;\&quot;10_off\&quot;\&quot;}\&quot;,2.4 &#x60;&#x60;&#x60;  Once imported, you can find the &#x60;batchId&#x60; in the Campaign Manager or by using [List coupons](#operation/getReservedCustomers). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String upFile = "upFile_example"; // String | The file with the information about the data that should be imported.
    try {
      ModelImport result = apiInstance.importCoupons(applicationId, campaignId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importCoupons");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **upFile** | **String**| The file with the information about the data that should be imported. | [optional]

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="importLoyaltyPoints"></a>
# **importLoyaltyPoints**
> ModelImport importLoyaltyPoints(loyaltyProgramId, upFile)

Import loyalty points via CSV file

Upload a CSV file containing the [loyalty](https://www.talon.one/pillar-pages/loyalty) points that should be created. The file should be sent as multipart data.  **Important**: For existing customer profiles, the imported points are _added_ to their active points. Learn more about [Loyalty programs](https://docs.talon.one/docs/product/loyalty-programs/overview).  The CSV file can contain the following columns:  - &#x60;customerprofileid&#x60;: The integration ID of the customer profile that should receive the loyalty points. - &#x60;amount&#x60;: The amount of points to award to the customer profile. - &#x60;startdate&#x60;: The earliest date when the points can be redeemed. On this date and until the expiry date, the points are &#x60;active&#x60;. - &#x60;expirydate&#x60;: The latest date when the points can be redeemed. After this date, the points are &#x60;expired&#x60;. - &#x60;subledgerid&#x60; (optional): The ID of the subledger that should received the points. - &#x60;reason&#x60; (optional): A reason why these points were awarded.  **Important:** Do not leave empty columns in the file.  You can use the timezone of your choice. It is converted to UTC internally by Talon.One.  **Example:**  &#x60;&#x60;&#x60;text customerprofileid,amount,startdate,expirydate,subledgerid,reason URNGV8294NV,100,2009-11-10T23:00:00Z,2009-11-11T23:00:00Z,subledger1,appeasement &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer loyaltyProgramId = 56; // Integer | Identifier of the loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs endpoint](https://docs.talon.one/management-api/#operation/getLoyaltyPrograms). 
    String upFile = "upFile_example"; // String | The file with the information about the data that should be imported.
    try {
      ModelImport result = apiInstance.importLoyaltyPoints(loyaltyProgramId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importLoyaltyPoints");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyProgramId** | **Integer**| Identifier of the loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs endpoint](https://docs.talon.one/management-api/#operation/getLoyaltyPrograms).  |
 **upFile** | **String**| The file with the information about the data that should be imported. | [optional]

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="importPoolGiveaways"></a>
# **importPoolGiveaways**
> ModelImport importPoolGiveaways(poolId, upFile)

Import giveaway codes into a giveaway pool

Upload a CSV file containing the giveaway codes that should be created. Send the file as multipart data.  The CSV file can contain the following columns: - &#x60;code&#x60; (required): the code of your giveaway, for instance, a gift card redemption code. - &#x60;startdate&#x60;:  the start date in RFC3339 of the code redemption period. - &#x60;enddate&#x60;: the last date in RFC3339 of the code redemption period. - &#x60;attributes&#x60;: A json object describing _custom_ giveaway attribute names and their values. Double the double-quotes in the object.   For example, if you [created a custom attribute](https://docs.talon.one/docs/dev/concepts/attributes#custom-attributes)   called &#x60;provider&#x60; associated to the giveaway entity, set it with &#x60;\&quot;{\&quot;\&quot;provider\&quot;\&quot;: \&quot;\&quot;myPartnerCompany\&quot;\&quot;}\&quot;&#x60;.  **Important:** Do not leave empty columns in the file.  The &#x60;startdate&#x60; and &#x60;enddate&#x60; have nothing to do with the _validity_ of the codes. They are only used by the Rule Engine to award the codes or not. You can use the timezone of your choice. It is converted to UTC internally by Talon.One.  **Example:**  &#x60;&#x60;&#x60;text code,startdate,enddate,attributes GIVEAWAY1,2020-11-10T23:00:00Z,2022-11-11T23:00:00Z,\&quot;{\&quot;\&quot;provider\&quot;\&quot;: \&quot;\&quot;Amazon\&quot;\&quot;}\&quot; GIVEAWAY2,2020-11-10T23:00:00Z,2022-11-11T23:00:00Z,\&quot;{\&quot;\&quot;provider\&quot;\&quot;: \&quot;\&quot;Amazon\&quot;\&quot;}\&quot; GIVEAWAY3,2021-01-10T23:00:00Z,2022-11-11T23:00:00Z,\&quot;{\&quot;\&quot;provider\&quot;\&quot;: \&quot;\&quot;Aliexpress\&quot;\&quot;}\&quot; &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer poolId = 56; // Integer | 
    String upFile = "upFile_example"; // String | The file with the information about the data that should be imported.
    try {
      ModelImport result = apiInstance.importPoolGiveaways(poolId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importPoolGiveaways");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **Integer**|  |
 **upFile** | **String**| The file with the information about the data that should be imported. | [optional]

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="importReferrals"></a>
# **importReferrals**
> ModelImport importReferrals(applicationId, campaignId, upFile)

Import referrals via CSV file

Upload a CSV file containing the referrals that should be created. The file should be sent as multipart data.  The CSV file can contain the following columns:  - &#x60;code&#x60; (required): The referral code. - &#x60;advocateprofileintegrationid&#x60; (required): The profile ID of the advocate. - &#x60;startdate&#x60;: The start date in RFC3339 of the code redemption period. - &#x60;expirydate&#x60;: The end date in RFC3339 of the code redemption period. - &#x60;limitval&#x60;: The maximum amount of redemptions of this code. Defaults to &#x60;1&#x60; when left blank. - &#x60;attributes&#x60;: A json object describing _custom_ referral attribute names and their values. Double the double-quotes in the object.    For example, if you [created a custom attribute](https://docs.talon.one/docs/dev/concepts/attributes#custom-attributes)   called &#x60;category&#x60; associated to the referral entity, set it with &#x60;\&quot;{\&quot;\&quot;category\&quot;\&quot;: \&quot;\&quot;10_off\&quot;\&quot;}\&quot;&#x60;.  You can use the timezone of your choice. It is converted to UTC internally by Talon.One.  **Example:**  &#x60;&#x60;&#x60;text code,startdate,expirydate,advocateprofileintegrationid,limitval,attributes REFERRAL_CODE1,2020-11-10T23:00:00Z,2021-11-11T23:00:00Z,integid_4,1,\&quot;{\&quot;\&quot;my_attribute\&quot;\&quot;: \&quot;\&quot;10_off\&quot;\&quot;}\&quot; REFERRAL_CODE2,2020-11-10T23:00:00Z,2021-11-11T23:00:00Z,integid1,1,\&quot;{\&quot;\&quot;my_attribute\&quot;\&quot;: \&quot;\&quot;20_off\&quot;\&quot;}\&quot; &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String upFile = "upFile_example"; // String | The file with the information about the data that should be imported.
    try {
      ModelImport result = apiInstance.importReferrals(applicationId, campaignId, upFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#importReferrals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **upFile** | **String**| The file with the information about the data that should be imported. | [optional]

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listAccountCollections"></a>
# **listAccountCollections**
> InlineResponse2008 listAccountCollections(pageSize, skip, sort, withTotalResultSize, name)

List collections in account

List collections in account.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    String name = "name_example"; // String | Filter by the name of the Collection.
    try {
      InlineResponse2008 result = apiInstance.listAccountCollections(pageSize, skip, sort, withTotalResultSize, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listAccountCollections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional]
 **name** | **String**| Filter by the name of the Collection. | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**404** | Not found |  -  |

<a name="listCollections"></a>
# **listCollections**
> InlineResponse2009 listCollections(applicationId, campaignId, pageSize, skip, sort, withTotalResultSize, name)

List collections

List collections in the campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    String name = "name_example"; // String | Filter by the name of the Collection.
    try {
      InlineResponse2009 result = apiInstance.listCollections(applicationId, campaignId, pageSize, skip, sort, withTotalResultSize, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listCollections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional]
 **name** | **String**| Filter by the name of the Collection. | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not found |  -  |

<a name="listCollectionsInApplication"></a>
# **listCollectionsInApplication**
> InlineResponse2009 listCollectionsInApplication(applicationId, pageSize, skip, sort, withTotalResultSize, name)

List collections in application

List collections from all campaigns in the Application.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When `true`: `hasMore` is true when there is a next page. `totalResultSize` is always zero. - When `false`: `hasMore` is always false. `totalResultSize` contains the total number of results for this query. 
    String name = "name_example"; // String | Filter by the name of the Collection.
    try {
      InlineResponse2009 result = apiInstance.listCollectionsInApplication(applicationId, pageSize, skip, sort, withTotalResultSize, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listCollectionsInApplication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **withTotalResultSize** | **Boolean**| When this flag is set, the result includes the total size of the result, across all pages. This might decrease performance on large data sets.  - When &#x60;true&#x60;: &#x60;hasMore&#x60; is true when there is a next page. &#x60;totalResultSize&#x60; is always zero. - When &#x60;false&#x60;: &#x60;hasMore&#x60; is always false. &#x60;totalResultSize&#x60; contains the total number of results for this query.  | [optional]
 **name** | **String**| Filter by the name of the Collection. | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not found |  -  |

<a name="removeLoyaltyPoints"></a>
# **removeLoyaltyPoints**
> removeLoyaltyPoints(loyaltyProgramId, integrationId, body)

Deduct points in loyalty program for given customer

Remove points from the specified loyalty program and specified customer profile.  To get the &#x60;integrationId&#x60; of the profile from a &#x60;sessionId&#x60;, use the [Update customer session](/integration-api/#operation/updateCustomerSessionV2). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String loyaltyProgramId = "loyaltyProgramId_example"; // String | The identifier for the loyalty program.
    String integrationId = "integrationId_example"; // String | The identifier of the profile.
    LoyaltyPoints body = new LoyaltyPoints(); // LoyaltyPoints | 
    try {
      apiInstance.removeLoyaltyPoints(loyaltyProgramId, integrationId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#removeLoyaltyPoints");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyProgramId** | **String**| The identifier for the loyalty program. |
 **integrationId** | **String**| The identifier of the profile. |
 **body** | [**LoyaltyPoints**](LoyaltyPoints.md)|  |

### Return type

null (empty response body)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="resetPassword"></a>
# **resetPassword**
> NewPassword resetPassword(body)

Reset password

Consumes the supplied password reset token and updates the password for the associated account. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    NewPassword body = new NewPassword(); // NewPassword | 
    try {
      NewPassword result = apiInstance.resetPassword(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#resetPassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewPassword**](NewPassword.md)|  |

### Return type

[**NewPassword**](NewPassword.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Created |  -  |

<a name="searchCouponsAdvancedApplicationWideWithoutTotalCount"></a>
# **searchCouponsAdvancedApplicationWideWithoutTotalCount**
> InlineResponse2005 searchCouponsAdvancedApplicationWideWithoutTotalCount(applicationId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch, campaignState)

List coupons that match the given attributes (without total count)

List the coupons whose attributes match the query criteria in all **active** campaigns of the given Application.  The match is successful if all the attributes of the request are found in a coupon, even if the coupon has more attributes that are not present on the request.  **Note:** The total count is not included in the response. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Object body = null; // Object | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Integer referralId = 56; // Integer | Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile id specified in the coupon's RecipientIntegrationId field
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code
    String campaignState = "campaignState_example"; // String | Filter results by the state of the campaign.  - `enabled`: Campaigns that are scheduled, running (activated), or expired. - `running`: Campaigns that are running (activated). - `disabled`: Campaigns that are disabled. - `expired`: Campaigns that are expired. - `archived`: Campaigns that are archived. - `draft`: Campaigns that are drafts. 
    try {
      InlineResponse2005 result = apiInstance.searchCouponsAdvancedApplicationWideWithoutTotalCount(applicationId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch, campaignState);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#searchCouponsAdvancedApplicationWideWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **body** | **Object**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false]
 **referralId** | **Integer**| Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code. | [optional]
 **recipientIntegrationId** | **String**| Filter results by match with a profile id specified in the coupon&#39;s RecipientIntegrationId field | [optional]
 **batchId** | **String**| Filter results by batches of coupons | [optional]
 **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code | [optional] [default to false]
 **campaignState** | **String**| Filter results by the state of the campaign.  - &#x60;enabled&#x60;: Campaigns that are scheduled, running (activated), or expired. - &#x60;running&#x60;: Campaigns that are running (activated). - &#x60;disabled&#x60;: Campaigns that are disabled. - &#x60;expired&#x60;: Campaigns that are expired. - &#x60;archived&#x60;: Campaigns that are archived. - &#x60;draft&#x60;: Campaigns that are drafts.  | [optional] [enum: enabled, disabled, archived, draft, scheduled, running, expired]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchCouponsAdvancedWithoutTotalCount"></a>
# **searchCouponsAdvancedWithoutTotalCount**
> InlineResponse2005 searchCouponsAdvancedWithoutTotalCount(applicationId, campaignId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, exactMatch, batchId)

List coupons that match the given attributes in campaign (without total count)

List the coupons whose attributes match the query criteria in the given campaign.  The match is successful if all the attributes of the request are found in a coupon, even if the coupon has more attributes that are not present on the request.  **Note:** The total count is not included in the response. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Object body = null; // Object | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Integer referralId = 56; // Integer | Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile id specified in the coupon's RecipientIntegrationId field
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    try {
      InlineResponse2005 result = apiInstance.searchCouponsAdvancedWithoutTotalCount(applicationId, campaignId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, exactMatch, batchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#searchCouponsAdvancedWithoutTotalCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **body** | **Object**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. You can use any timezone. Talon.One will convert to UTC internally. | [optional]
 **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false]
 **referralId** | **Integer**| Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code. | [optional]
 **recipientIntegrationId** | **String**| Filter results by match with a profile id specified in the coupon&#39;s RecipientIntegrationId field | [optional]
 **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code | [optional] [default to false]
 **batchId** | **String**| Filter results by batches of coupons | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateAccountCollection"></a>
# **updateAccountCollection**
> Collection updateAccountCollection(collectionId, body)

Update account-level collection description and connected Applications

Edit the description of the account-level collection and enable or disable the collection in different Applications.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer collectionId = 56; // Integer | The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication).
    UpdateCollection body = new UpdateCollection(); // UpdateCollection | 
    try {
      Collection result = apiInstance.updateAccountCollection(collectionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateAccountCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Integer**| The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication). |
 **body** | [**UpdateCollection**](UpdateCollection.md)|  |

### Return type

[**Collection**](Collection.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**409** | Conflict. A Collection with this name already exists. |  -  |

<a name="updateAdditionalCost"></a>
# **updateAdditionalCost**
> AccountAdditionalCost updateAdditionalCost(additionalCostId, body)

Update additional cost

Updates an existing additional cost. Once created, the only property of an additional cost that can be changed is the title (human readable description). This restriction is in place to prevent accidentally breaking live integrations. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer additionalCostId = 56; // Integer | 
    NewAdditionalCost body = new NewAdditionalCost(); // NewAdditionalCost | 
    try {
      AccountAdditionalCost result = apiInstance.updateAdditionalCost(additionalCostId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateAdditionalCost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **additionalCostId** | **Integer**|  |
 **body** | [**NewAdditionalCost**](NewAdditionalCost.md)|  |

### Return type

[**AccountAdditionalCost**](AccountAdditionalCost.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateAttribute"></a>
# **updateAttribute**
> Attribute updateAttribute(attributeId, body)

Update custom attribute

Updates an existing custom attribute. Once created, the only property of a custom attribute that can be changed is the title (human readable description). This restriction is in place to prevent accidentally breaking live integrations. E.g. if you have a customer profile attribute with the name &#x60;region&#x60;, and your integration is sending &#x60;attributes.region&#x60; with customer profile updates, changing the name to &#x60;locale&#x60; would cause the integration requests to begin failing.  If you **really** need to change the &#x60;type&#x60; or &#x60;name&#x60; property of a custom attribute, create a new attribute and update any relevant integrations and rules to use the new attribute. Then delete the old attribute when you are confident you have migrated any needed data from the old attribute to the new one. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer attributeId = 56; // Integer | 
    NewAttribute body = new NewAttribute(); // NewAttribute | 
    try {
      Attribute result = apiInstance.updateAttribute(attributeId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeId** | **Integer**|  |
 **body** | [**NewAttribute**](NewAttribute.md)|  |

### Return type

[**Attribute**](Attribute.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateCampaign"></a>
# **updateCampaign**
> Campaign updateCampaign(applicationId, campaignId, body)

Update campaign

Update the given campaign.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    UpdateCampaign body = new UpdateCampaign(); // UpdateCampaign | 
    try {
      Campaign result = apiInstance.updateCampaign(applicationId, campaignId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **body** | [**UpdateCampaign**](UpdateCampaign.md)|  |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateCollection"></a>
# **updateCollection**
> Collection updateCollection(applicationId, campaignId, collectionId, body)

Update collection description

Edit the description of the collection.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    Integer collectionId = 56; // Integer | The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication).
    UpdateCampaignCollection body = new UpdateCampaignCollection(); // UpdateCampaignCollection | 
    try {
      Collection result = apiInstance.updateCollection(applicationId, campaignId, collectionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **collectionId** | **Integer**| The ID of the collection. You can get it with the [List collection in account endpoint](#operation/listCollectionsInApplication). |
 **body** | [**UpdateCampaignCollection**](UpdateCampaignCollection.md)|  |

### Return type

[**Collection**](Collection.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |

<a name="updateCoupon"></a>
# **updateCoupon**
> Coupon updateCoupon(applicationId, campaignId, couponId, body)

Update coupon

Update the specified coupon.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String couponId = "couponId_example"; // String | The ID of the coupon code to update
    UpdateCoupon body = new UpdateCoupon(); // UpdateCoupon | 
    try {
      Coupon result = apiInstance.updateCoupon(applicationId, campaignId, couponId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateCoupon");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **couponId** | **String**| The ID of the coupon code to update |
 **body** | [**UpdateCoupon**](UpdateCoupon.md)|  |

### Return type

[**Coupon**](Coupon.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateCouponBatch"></a>
# **updateCouponBatch**
> updateCouponBatch(applicationId, campaignId, body)

Update coupons

Update all coupons of an campaign, or a specific batch of coupons. You can find the &#x60;batchId&#x60; in the **Coupons** view of your Application in the Campaign Manager or by using [List coupons](#operation/getCouponsWithoutTotalCount).  **Important**: - Only send sequential requests to this endpoint. - Requests to this endpoint timeout after 30 minutes. If you hit a timeout, reach out to our support team.  To update a specific coupon, use [Update coupon](#operation/updateCoupon). 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    UpdateCouponBatch body = new UpdateCouponBatch(); // UpdateCouponBatch | 
    try {
      apiInstance.updateCouponBatch(applicationId, campaignId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateCouponBatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **body** | [**UpdateCouponBatch**](UpdateCouponBatch.md)|  |

### Return type

null (empty response body)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="updateReferral"></a>
# **updateReferral**
> Referral updateReferral(applicationId, campaignId, referralId, body)

Update referral

Update the specified referral.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: manager_auth
    ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
    manager_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //manager_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    Integer applicationId = 56; // Integer | The ID of the Application. It is displayed in your Talon.One deployment URL.
    Integer campaignId = 56; // Integer | The ID of the campaign. It is displayed in your Talon.One deployment URL.
    String referralId = "referralId_example"; // String | The ID of the referral code to delete
    UpdateReferral body = new UpdateReferral(); // UpdateReferral | 
    try {
      Referral result = apiInstance.updateReferral(applicationId, campaignId, referralId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateReferral");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| The ID of the Application. It is displayed in your Talon.One deployment URL. |
 **campaignId** | **Integer**| The ID of the campaign. It is displayed in your Talon.One deployment URL. |
 **referralId** | **String**| The ID of the referral code to delete |
 **body** | [**UpdateReferral**](UpdateReferral.md)|  |

### Return type

[**Referral**](Referral.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

