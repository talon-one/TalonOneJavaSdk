# ManagementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLoyaltyPoints**](ManagementApi.md#addLoyaltyPoints) | **PUT** /v1/loyalty_programs/{programID}/profile/{integrationID}/add_points | Add points in a certain loyalty program for the specified customer
[**copyCampaignToApplications**](ManagementApi.md#copyCampaignToApplications) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/copy | Copy the campaign into every specified application
[**createAttribute**](ManagementApi.md#createAttribute) | **POST** /v1/attributes | Define a new custom attribute
[**createCampaign**](ManagementApi.md#createCampaign) | **POST** /v1/applications/{applicationId}/campaigns | Create a Campaign
[**createCoupons**](ManagementApi.md#createCoupons) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Create Coupons
[**createPasswordRecoveryEmail**](ManagementApi.md#createPasswordRecoveryEmail) | **POST** /v1/password_recovery_emails | Request a password reset
[**createRuleset**](ManagementApi.md#createRuleset) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets | Create a Ruleset
[**createSession**](ManagementApi.md#createSession) | **POST** /v1/sessions | Create a Session
[**deleteCampaign**](ManagementApi.md#deleteCampaign) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId} | Delete a Campaign
[**deleteCoupon**](ManagementApi.md#deleteCoupon) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/{couponId} | Delete one Coupon
[**deleteCoupons**](ManagementApi.md#deleteCoupons) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Delete Coupons
[**deleteReferral**](ManagementApi.md#deleteReferral) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals/{referralId} | Delete one Referral
[**deleteRuleset**](ManagementApi.md#deleteRuleset) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets/{rulesetId} | Delete a Ruleset
[**getAccessLogs**](ManagementApi.md#getAccessLogs) | **GET** /v1/applications/{applicationId}/access_logs | Get access logs for application
[**getAccessLogsWithoutTotalCount**](ManagementApi.md#getAccessLogsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/access_logs/no_total | Get access logs for application
[**getAccount**](ManagementApi.md#getAccount) | **GET** /v1/accounts/{accountId} | Get Account Details
[**getAccountAnalytics**](ManagementApi.md#getAccountAnalytics) | **GET** /v1/accounts/{accountId}/analytics | Get Account Analytics
[**getAllAccessLogs**](ManagementApi.md#getAllAccessLogs) | **GET** /v1/access_logs | Get all access logs
[**getAllRoles**](ManagementApi.md#getAllRoles) | **GET** /v1/roles | Get all roles.
[**getApplication**](ManagementApi.md#getApplication) | **GET** /v1/applications/{applicationId} | Get Application
[**getApplicationApiHealth**](ManagementApi.md#getApplicationApiHealth) | **GET** /v1/applications/{applicationId}/health_report | Get report of health of application API
[**getApplicationCustomer**](ManagementApi.md#getApplicationCustomer) | **GET** /v1/applications/{applicationId}/customers/{customerId} | Get Application Customer
[**getApplicationCustomers**](ManagementApi.md#getApplicationCustomers) | **GET** /v1/applications/{applicationId}/customers | List Application Customers
[**getApplicationCustomersByAttributes**](ManagementApi.md#getApplicationCustomersByAttributes) | **POST** /v1/application_customer_search | Get a list of the customer profiles that match the given attributes
[**getApplicationEventTypes**](ManagementApi.md#getApplicationEventTypes) | **GET** /v1/applications/{applicationId}/event_types | List Applications Event Types
[**getApplicationEvents**](ManagementApi.md#getApplicationEvents) | **GET** /v1/applications/{applicationId}/events | List Applications Events
[**getApplicationEventsWithoutTotalCount**](ManagementApi.md#getApplicationEventsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/events/no_total | List Applications Events
[**getApplicationSession**](ManagementApi.md#getApplicationSession) | **GET** /v1/applications/{applicationId}/sessions/{sessionId} | Get Application Session
[**getApplicationSessions**](ManagementApi.md#getApplicationSessions) | **GET** /v1/applications/{applicationId}/sessions | List Application Sessions
[**getApplications**](ManagementApi.md#getApplications) | **GET** /v1/applications | List Applications
[**getAttribute**](ManagementApi.md#getAttribute) | **GET** /v1/attributes/{attributeId} | Get a custom attribute
[**getAttributes**](ManagementApi.md#getAttributes) | **GET** /v1/attributes | List custom attributes
[**getCampaign**](ManagementApi.md#getCampaign) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId} | Get a Campaign
[**getCampaignAnalytics**](ManagementApi.md#getCampaignAnalytics) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/analytics | Get analytics of campaigns
[**getCampaignByAttributes**](ManagementApi.md#getCampaignByAttributes) | **POST** /v1/applications/{applicationId}/campaigns_search | Get a list of all campaigns that match the given attributes
[**getCampaignSet**](ManagementApi.md#getCampaignSet) | **GET** /v1/applications/{applicationId}/campaign_set | List CampaignSet
[**getCampaigns**](ManagementApi.md#getCampaigns) | **GET** /v1/applications/{applicationId}/campaigns | List your Campaigns
[**getChanges**](ManagementApi.md#getChanges) | **GET** /v1/changes | Get audit log for an account
[**getCoupons**](ManagementApi.md#getCoupons) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | List Coupons
[**getCouponsByAttributes**](ManagementApi.md#getCouponsByAttributes) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_search | Get a list of the coupons that match the given attributes
[**getCouponsByAttributesApplicationWide**](ManagementApi.md#getCouponsByAttributesApplicationWide) | **POST** /v1/applications/{applicationId}/coupons_search | Get a list of the coupons that match the given attributes in all active campaigns of an application
[**getCouponsWithoutTotalCount**](ManagementApi.md#getCouponsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/no_total | List Coupons
[**getCustomerActivityReport**](ManagementApi.md#getCustomerActivityReport) | **GET** /v1/applications/{applicationId}/customer_activity_reports/{customerId} | Get Activity Report for Single Customer
[**getCustomerActivityReports**](ManagementApi.md#getCustomerActivityReports) | **GET** /v1/applications/{applicationId}/customer_activity_reports | Get Activity Reports for Application Customers
[**getCustomerActivityReportsWithoutTotalCount**](ManagementApi.md#getCustomerActivityReportsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/customer_activity_reports/no_total | Get Activity Reports for Application Customers
[**getCustomerAnalytics**](ManagementApi.md#getCustomerAnalytics) | **GET** /v1/applications/{applicationId}/customers/{customerId}/analytics | Get Analytics Report for a Customer
[**getCustomerProfile**](ManagementApi.md#getCustomerProfile) | **GET** /v1/customers/{customerId} | Get Customer Profile
[**getCustomerProfiles**](ManagementApi.md#getCustomerProfiles) | **GET** /v1/customers/no_total | List Customer Profiles
[**getCustomersByAttributes**](ManagementApi.md#getCustomersByAttributes) | **POST** /v1/customer_search/no_total | Get a list of the customer profiles that match the given attributes
[**getEventTypes**](ManagementApi.md#getEventTypes) | **GET** /v1/event_types | List Event Types
[**getExports**](ManagementApi.md#getExports) | **GET** /v1/exports | Get Exports
[**getImports**](ManagementApi.md#getImports) | **GET** /v1/imports | Get Imports
[**getLoyaltyPoints**](ManagementApi.md#getLoyaltyPoints) | **GET** /v1/loyalty_programs/{programID}/profile/{integrationID} | get the Loyalty Ledger for this integrationID
[**getLoyaltyProgram**](ManagementApi.md#getLoyaltyProgram) | **GET** /v1/loyalty_programs/{programID} | Get a loyalty program
[**getLoyaltyPrograms**](ManagementApi.md#getLoyaltyPrograms) | **GET** /v1/loyalty_programs | List all loyalty Programs
[**getReferrals**](ManagementApi.md#getReferrals) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals | List Referrals
[**getReferralsWithoutTotalCount**](ManagementApi.md#getReferralsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals/no_total | List Referrals
[**getRole**](ManagementApi.md#getRole) | **GET** /v1/roles/{roleId} | Get information for the specified role.
[**getRuleset**](ManagementApi.md#getRuleset) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets/{rulesetId} | Get a Ruleset
[**getRulesets**](ManagementApi.md#getRulesets) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets | List Campaign Rulesets
[**getUser**](ManagementApi.md#getUser) | **GET** /v1/users/{userId} | Get a single User
[**getUsers**](ManagementApi.md#getUsers) | **GET** /v1/users | List Users in your account
[**getWebhook**](ManagementApi.md#getWebhook) | **GET** /v1/webhooks/{webhookId} | Get Webhook
[**getWebhookActivationLogs**](ManagementApi.md#getWebhookActivationLogs) | **GET** /v1/webhook_activation_logs | List Webhook activation Log Entries
[**getWebhookLogs**](ManagementApi.md#getWebhookLogs) | **GET** /v1/webhook_logs | List Webhook Log Entries
[**getWebhooks**](ManagementApi.md#getWebhooks) | **GET** /v1/webhooks | List Webhooks
[**removeLoyaltyPoints**](ManagementApi.md#removeLoyaltyPoints) | **PUT** /v1/loyalty_programs/{programID}/profile/{integrationID}/deduct_points | Deduct points in a certain loyalty program for the specified customer
[**resetPassword**](ManagementApi.md#resetPassword) | **POST** /v1/reset_password | Reset password
[**searchCouponsAdvanced**](ManagementApi.md#searchCouponsAdvanced) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_search_advanced | Get a list of the coupons that match the given attributes
[**searchCouponsAdvancedApplicationWide**](ManagementApi.md#searchCouponsAdvancedApplicationWide) | **POST** /v1/applications/{applicationId}/coupons_search_advanced | Get a list of the coupons that match the given attributes in all active campaigns of an application
[**searchCouponsAdvancedApplicationWideWithoutTotalCount**](ManagementApi.md#searchCouponsAdvancedApplicationWideWithoutTotalCount) | **POST** /v1/applications/{applicationId}/coupons_search_advanced/no_total | Get a list of the coupons that match the given attributes in all active campaigns of an application
[**searchCouponsAdvancedWithoutTotalCount**](ManagementApi.md#searchCouponsAdvancedWithoutTotalCount) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_search_advanced/no_total | Get a list of the coupons that match the given attributes
[**updateAttribute**](ManagementApi.md#updateAttribute) | **PUT** /v1/attributes/{attributeId} | Update a custom attribute
[**updateCampaign**](ManagementApi.md#updateCampaign) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId} | Update a Campaign
[**updateCampaignSet**](ManagementApi.md#updateCampaignSet) | **PUT** /v1/applications/{applicationId}/campaign_set | Update a Campaign Set
[**updateCoupon**](ManagementApi.md#updateCoupon) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/{couponId} | Update a Coupon
[**updateCouponBatch**](ManagementApi.md#updateCouponBatch) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Update a Batch of Coupons
[**updateRuleset**](ManagementApi.md#updateRuleset) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets/{rulesetId} | Update a Ruleset


<a name="addLoyaltyPoints"></a>
# **addLoyaltyPoints**
> addLoyaltyPoints(programID, integrationID, body)

Add points in a certain loyalty program for the specified customer

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
    String programID = "programID_example"; // String | 
    String integrationID = "integrationID_example"; // String | 
    LoyaltyPoints body = new LoyaltyPoints(); // LoyaltyPoints | 
    try {
      apiInstance.addLoyaltyPoints(programID, integrationID, body);
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
 **programID** | **String**|  |
 **integrationID** | **String**|  |
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
> InlineResponse2003 copyCampaignToApplications(applicationId, campaignId, body)

Copy the campaign into every specified application

Copy the campaign into every specified application.

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    CampaignCopy body = new CampaignCopy(); // CampaignCopy | 
    try {
      InlineResponse2003 result = apiInstance.copyCampaignToApplications(applicationId, campaignId, body);
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **body** | [**CampaignCopy**](CampaignCopy.md)|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="createAttribute"></a>
# **createAttribute**
> Attribute createAttribute(body)

Define a new custom attribute

Defines a new _custom attribute_ in this account. Custom attributes allow you to attach new fields to Talon.One domain objects like campaigns, coupons, customers and so on. These attributes can then be given values when creating / updating these objects, and these values can be used in your campaign rules. For example, you could define a &#x60;zipCode&#x60; field for customer sessions, and add a rule to your campaign that only allows certain ZIP codes.  These attributes are shared across all applications in your account, and are never required. 

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

<a name="createCampaign"></a>
# **createCampaign**
> Campaign createCampaign(applicationId, body)

Create a Campaign

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
    Integer applicationId = 56; // Integer | 
    NewCampaign body = new NewCampaign(); // NewCampaign | 
    try {
      Campaign result = apiInstance.createCampaign(applicationId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCampaign");
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
 **applicationId** | **Integer**|  |
 **body** | [**NewCampaign**](NewCampaign.md)|  |

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
**201** | Created |  -  |

<a name="createCoupons"></a>
# **createCoupons**
> InlineResponse2001 createCoupons(applicationId, campaignId, body, silent)

Create Coupons

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    NewCoupons body = new NewCoupons(); // NewCoupons | 
    String silent = "silent_example"; // String | If set to 'yes', response will be an empty 204, otherwise a list of the coupons generated (to to 1000).
    try {
      InlineResponse2001 result = apiInstance.createCoupons(applicationId, campaignId, body, silent);
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **body** | [**NewCoupons**](NewCoupons.md)|  |
 **silent** | **String**| If set to &#39;yes&#39;, response will be an empty 204, otherwise a list of the coupons generated (to to 1000). | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

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

Sends an email with a password recovery link to the email of an existing account. 

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

<a name="createRuleset"></a>
# **createRuleset**
> Ruleset createRuleset(applicationId, campaignId, body)

Create a Ruleset

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    NewRuleset body = new NewRuleset(); // NewRuleset | 
    try {
      Ruleset result = apiInstance.createRuleset(applicationId, campaignId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createRuleset");
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **body** | [**NewRuleset**](NewRuleset.md)|  |

### Return type

[**Ruleset**](Ruleset.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="createSession"></a>
# **createSession**
> Session createSession(body)

Create a Session

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

<a name="deleteCampaign"></a>
# **deleteCampaign**
> deleteCampaign(applicationId, campaignId)

Delete a Campaign

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |

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

<a name="deleteCoupon"></a>
# **deleteCoupon**
> deleteCoupon(applicationId, campaignId, couponId)

Delete one Coupon

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    String couponId = "couponId_example"; // String | The ID of the coupon code to delete
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **couponId** | **String**| The ID of the coupon code to delete |

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

Delete Coupons

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime startsAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime startsBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime expiresAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime expiresBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Integer referralId = 56; // Integer | Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile id specified in the coupon's RecipientIntegrationId field
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **startsAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **startsBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **expiresAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **expiresBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **batchId** | **String**| Filter results by batches of coupons | [optional]
 **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false]
 **referralId** | **Integer**| Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code. | [optional]
 **recipientIntegrationId** | **String**| Filter results by match with a profile id specified in the coupon&#39;s RecipientIntegrationId field | [optional]
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

<a name="deleteReferral"></a>
# **deleteReferral**
> deleteReferral(applicationId, campaignId, referralId)

Delete one Referral

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
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

<a name="deleteRuleset"></a>
# **deleteRuleset**
> deleteRuleset(applicationId, campaignId, rulesetId)

Delete a Ruleset

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    Integer rulesetId = 56; // Integer | 
    try {
      apiInstance.deleteRuleset(applicationId, campaignId, rulesetId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteRuleset");
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **rulesetId** | **Integer**|  |

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

<a name="getAccessLogs"></a>
# **getAccessLogs**
> InlineResponse2009 getAccessLogs(applicationId, rangeStart, rangeEnd, path, method, status, pageSize, skip, sort)

Get access logs for application

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
    Integer applicationId = 56; // Integer | 
    OffsetDateTime rangeStart = new OffsetDateTime(); // OffsetDateTime | Only return results from after this timestamp, must be an RFC3339 timestamp string
    OffsetDateTime rangeEnd = new OffsetDateTime(); // OffsetDateTime | Only return results from before this timestamp, must be an RFC3339 timestamp string
    String path = "path_example"; // String | Only return results where the request path matches the given regular expression.
    String method = "method_example"; // String | Only return results where the request method matches the given regular expression.
    String status = "status_example"; // String | Filter results by HTTP status codes.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    try {
      InlineResponse2009 result = apiInstance.getAccessLogs(applicationId, rangeStart, rangeEnd, path, method, status, pageSize, skip, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getAccessLogs");
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
 **applicationId** | **Integer**|  |
 **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp, must be an RFC3339 timestamp string |
 **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp, must be an RFC3339 timestamp string |
 **path** | **String**| Only return results where the request path matches the given regular expression. | [optional]
 **method** | **String**| Only return results where the request method matches the given regular expression. | [optional] [enum: get, put, post, delete, patch]
 **status** | **String**| Filter results by HTTP status codes. | [optional] [enum: success, error]
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]

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

<a name="getAccessLogsWithoutTotalCount"></a>
# **getAccessLogsWithoutTotalCount**
> InlineResponse20010 getAccessLogsWithoutTotalCount(applicationId, rangeStart, rangeEnd, path, method, status, pageSize, skip, sort)

Get access logs for application

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
    Integer applicationId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |
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

Get Account Details

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
    Integer accountId = 56; // Integer | 
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
 **accountId** | **Integer**|  |

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

Get Account Analytics

Return the analytics of your companies Talon.One account. 

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
    Integer accountId = 56; // Integer | 
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
 **accountId** | **Integer**|  |

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

<a name="getAllAccessLogs"></a>
# **getAllAccessLogs**
> InlineResponse2009 getAllAccessLogs(rangeStart, rangeEnd, path, method, status, pageSize, skip, sort)

Get all access logs

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
      InlineResponse2009 result = apiInstance.getAllAccessLogs(rangeStart, rangeEnd, path, method, status, pageSize, skip, sort);
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

<a name="getAllRoles"></a>
# **getAllRoles**
> InlineResponse20029 getAllRoles()

Get all roles.

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
      InlineResponse20029 result = apiInstance.getAllRoles();
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

<a name="getApplication"></a>
# **getApplication**
> Application getApplication(applicationId)

Get Application

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
    Integer applicationId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |

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
    Integer applicationId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |

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

Get Application Customer

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
    Integer applicationId = 56; // Integer | 
    Integer customerId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |
 **customerId** | **Integer**|  |

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

<a name="getApplicationCustomers"></a>
# **getApplicationCustomers**
> InlineResponse20012 getApplicationCustomers(applicationId)

List Application Customers

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
    Integer applicationId = 56; // Integer | 
    try {
      InlineResponse20012 result = apiInstance.getApplicationCustomers(applicationId);
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
 **applicationId** | **Integer**|  |

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

<a name="getApplicationCustomersByAttributes"></a>
# **getApplicationCustomersByAttributes**
> InlineResponse20013 getApplicationCustomersByAttributes(body)

Get a list of the customer profiles that match the given attributes

Gets a list of all the customer profiles for the account that exactly match a set of attributes.  The match is successful if all the attributes of the request are found in a profile, even if the profile has more attributes that are not present on the request.  [Customer Profile]: https://help.talon.one/hc/en-us/articles/360005130739-Data-Model#CustomerProfile 

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
    
    // Configure API key authorization: integration_auth
    ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
    integration_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //integration_auth.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    ApplicationCustomerSearch body = new ApplicationCustomerSearch(); // ApplicationCustomerSearch | 
    try {
      InlineResponse20013 result = apiInstance.getApplicationCustomersByAttributes(body);
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
 **body** | [**ApplicationCustomerSearch**](ApplicationCustomerSearch.md)|  |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[integration_auth](../README.md#integration_auth)

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

List Applications Event Types

Get all of the distinct values of the Event &#x60;type&#x60; property for events recorded in the application.  See also: [Track an event](/integration-api/reference/#trackEvent) 

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
    Integer applicationId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |
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

<a name="getApplicationEvents"></a>
# **getApplicationEvents**
> InlineResponse20017 getApplicationEvents(applicationId, pageSize, skip, sort, type, createdBefore, createdAfter, session, profile, customerName, customerEmail, couponCode, referralCode, ruleQuery, campaignQuery)

List Applications Events

Lists all events recorded for an application. 

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
    Integer applicationId = 56; // Integer | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String type = "type_example"; // String | Comma-separated list of types by which to filter events. Must be exact match(es).
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Only return events created before this date
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Only return events created after this date
    String session = "session_example"; // String | Session integration ID filter for events. Must be exact match.
    String profile = "profile_example"; // String | Profile integration ID filter for events. Must be exact match.
    String customerName = "customerName_example"; // String | Customer name filter for events. Will match substrings case-insensitively.
    String customerEmail = "customerEmail_example"; // String | Customer e-mail address filter for events. Will match substrings case-insensitively.
    String couponCode = "couponCode_example"; // String | Coupon code
    String referralCode = "referralCode_example"; // String | Referral code
    String ruleQuery = "ruleQuery_example"; // String | Rule name filter for events
    String campaignQuery = "campaignQuery_example"; // String | Campaign name filter for events
    try {
      InlineResponse20017 result = apiInstance.getApplicationEvents(applicationId, pageSize, skip, sort, type, createdBefore, createdAfter, session, profile, customerName, customerEmail, couponCode, referralCode, ruleQuery, campaignQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getApplicationEvents");
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
 **applicationId** | **Integer**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **type** | **String**| Comma-separated list of types by which to filter events. Must be exact match(es). | [optional]
 **createdBefore** | **OffsetDateTime**| Only return events created before this date | [optional]
 **createdAfter** | **OffsetDateTime**| Only return events created after this date | [optional]
 **session** | **String**| Session integration ID filter for events. Must be exact match. | [optional]
 **profile** | **String**| Profile integration ID filter for events. Must be exact match. | [optional]
 **customerName** | **String**| Customer name filter for events. Will match substrings case-insensitively. | [optional]
 **customerEmail** | **String**| Customer e-mail address filter for events. Will match substrings case-insensitively. | [optional]
 **couponCode** | **String**| Coupon code | [optional]
 **referralCode** | **String**| Referral code | [optional]
 **ruleQuery** | **String**| Rule name filter for events | [optional]
 **campaignQuery** | **String**| Campaign name filter for events | [optional]

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

<a name="getApplicationEventsWithoutTotalCount"></a>
# **getApplicationEventsWithoutTotalCount**
> InlineResponse20018 getApplicationEventsWithoutTotalCount(applicationId, pageSize, skip, sort, type, createdBefore, createdAfter, session, profile, customerName, customerEmail, couponCode, referralCode, ruleQuery, campaignQuery)

List Applications Events

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
    Integer applicationId = 56; // Integer | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String type = "type_example"; // String | Comma-separated list of types by which to filter events. Must be exact match(es).
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Only return events created before this date
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Only return events created after this date
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
 **applicationId** | **Integer**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **type** | **String**| Comma-separated list of types by which to filter events. Must be exact match(es). | [optional]
 **createdBefore** | **OffsetDateTime**| Only return events created before this date | [optional]
 **createdAfter** | **OffsetDateTime**| Only return events created after this date | [optional]
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

Get Application Session

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
    Integer applicationId = 56; // Integer | 
    Integer sessionId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |
 **sessionId** | **Integer**|  |

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
> InlineResponse20016 getApplicationSessions(applicationId, pageSize, skip, sort, profile, state, coupon, referral, integrationId, customerId)

List Application Sessions

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
    Integer applicationId = 56; // Integer | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String profile = "profile_example"; // String | Profile integration ID filter for sessions. Must be exact match.
    String state = "state_example"; // String | Filter by sessions with this state. Must be exact match.
    String coupon = "coupon_example"; // String | Filter by sessions with this coupon. Must be exact match.
    String referral = "referral_example"; // String | Filter by sessions with this referral. Must be exact match.
    String integrationId = "integrationId_example"; // String | Filter by sessions with this integrationId. Must be exact match.
    String customerId = "customerId_example"; // String | Filter by integration ID of the customer for the session
    try {
      InlineResponse20016 result = apiInstance.getApplicationSessions(applicationId, pageSize, skip, sort, profile, state, coupon, referral, integrationId, customerId);
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
 **applicationId** | **Integer**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **profile** | **String**| Profile integration ID filter for sessions. Must be exact match. | [optional]
 **state** | **String**| Filter by sessions with this state. Must be exact match. | [optional] [enum: open, closed, cancelled]
 **coupon** | **String**| Filter by sessions with this coupon. Must be exact match. | [optional]
 **referral** | **String**| Filter by sessions with this referral. Must be exact match. | [optional]
 **integrationId** | **String**| Filter by sessions with this integrationId. Must be exact match. | [optional]
 **customerId** | **String**| Filter by integration ID of the customer for the session | [optional]

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

<a name="getApplications"></a>
# **getApplications**
> InlineResponse2002 getApplications(pageSize, skip, sort)

List Applications

List all application in the current account.

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
      InlineResponse2002 result = apiInstance.getApplications(pageSize, skip, sort);
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

<a name="getAttribute"></a>
# **getAttribute**
> Attribute getAttribute(attributeId)

Get a custom attribute

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
> InlineResponse20020 getAttributes(pageSize, skip, sort)

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
    try {
      InlineResponse20020 result = apiInstance.getAttributes(pageSize, skip, sort);
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

Get a Campaign

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |

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
> InlineResponse20011 getCampaignAnalytics(applicationId, campaignId, rangeStart, rangeEnd, granularity)

Get analytics of campaigns

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    OffsetDateTime rangeStart = new OffsetDateTime(); // OffsetDateTime | Only return results from after this timestamp, must be an RFC3339 timestamp string
    OffsetDateTime rangeEnd = new OffsetDateTime(); // OffsetDateTime | Only return results from before this timestamp, must be an RFC3339 timestamp string
    String granularity = "granularity_example"; // String | The time interval between the results in the returned time-series.
    try {
      InlineResponse20011 result = apiInstance.getCampaignAnalytics(applicationId, campaignId, rangeStart, rangeEnd, granularity);
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **rangeStart** | **OffsetDateTime**| Only return results from after this timestamp, must be an RFC3339 timestamp string |
 **rangeEnd** | **OffsetDateTime**| Only return results from before this timestamp, must be an RFC3339 timestamp string |
 **granularity** | **String**| The time interval between the results in the returned time-series. | [optional] [enum: 1 hour, 1 day, 1 week, 1 month, 1 year]

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

<a name="getCampaignByAttributes"></a>
# **getCampaignByAttributes**
> InlineResponse2003 getCampaignByAttributes(applicationId, body, pageSize, skip, sort, campaignState)

Get a list of all campaigns that match the given attributes

Gets a list of all the campaigns that exactly match a set of attributes. 

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
    Integer applicationId = 56; // Integer | 
    CampaignSearch body = new CampaignSearch(); // CampaignSearch | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String campaignState = "campaignState_example"; // String | Filter results by the state of the campaign.
    try {
      InlineResponse2003 result = apiInstance.getCampaignByAttributes(applicationId, body, pageSize, skip, sort, campaignState);
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
 **applicationId** | **Integer**|  |
 **body** | [**CampaignSearch**](CampaignSearch.md)|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **campaignState** | **String**| Filter results by the state of the campaign. | [optional] [enum: enabled, disabled, archived, draft, scheduled, running, expired]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCampaignSet"></a>
# **getCampaignSet**
> CampaignSet getCampaignSet(applicationId)

List CampaignSet

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
    Integer applicationId = 56; // Integer | 
    try {
      CampaignSet result = apiInstance.getCampaignSet(applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCampaignSet");
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
 **applicationId** | **Integer**|  |

### Return type

[**CampaignSet**](CampaignSet.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCampaigns"></a>
# **getCampaigns**
> InlineResponse2003 getCampaigns(applicationId, pageSize, skip, sort, campaignState, name, tags, createdBefore, createdAfter)

List your Campaigns

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
    Integer applicationId = 56; // Integer | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String campaignState = "campaignState_example"; // String | Filter results by the state of the campaign.
    String name = "name_example"; // String | Filter results performing case-insensitive matching against the name of the campaign.
    String tags = "tags_example"; // String | Filter results performing case-insensitive matching against the tags of the campaign. When used in conjunction with the \"name\" query parameter, a logical OR will be performed to search both tags and name for the provided values 
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the campaign creation timestamp.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the campaign creation timestamp.
    try {
      InlineResponse2003 result = apiInstance.getCampaigns(applicationId, pageSize, skip, sort, campaignState, name, tags, createdBefore, createdAfter);
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
 **applicationId** | **Integer**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **campaignState** | **String**| Filter results by the state of the campaign. | [optional] [enum: enabled, disabled, archived, draft, scheduled, running, expired]
 **name** | **String**| Filter results performing case-insensitive matching against the name of the campaign. | [optional]
 **tags** | **String**| Filter results performing case-insensitive matching against the tags of the campaign. When used in conjunction with the \&quot;name\&quot; query parameter, a logical OR will be performed to search both tags and name for the provided values  | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the campaign creation timestamp. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the campaign creation timestamp. | [optional]

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

<a name="getChanges"></a>
# **getChanges**
> InlineResponse20026 getChanges(pageSize, skip, sort, applicationId, createdBefore, createdAfter, withTotalResultSize, includeOld)

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
    Integer applicationId = 56; // Integer | 
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the change creation timestamp.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the change creation timestamp.
    Boolean withTotalResultSize = true; // Boolean | When this flag is set, the result will include the total size of the result, across all pages. This might decrease performance on large data sets. With this flag set to true, hasMore will be be true whenever there is a next page. totalResultSize will always be zero. With this flag set to false, hasMore will always be set to false. totalResultSize will contain the total number of results for this query. 
    Boolean includeOld = true; // Boolean | When this flag is set to false, the state without the change will not be returned. The default value is true.
    try {
      InlineResponse20026 result = apiInstance.getChanges(pageSize, skip, sort, applicationId, createdBefore, createdAfter, withTotalResultSize, includeOld);
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
 **applicationId** | **Integer**|  | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the change creation timestamp. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the change creation timestamp. | [optional]
 **withTotalResultSize** | **Boolean**| When this flag is set, the result will include the total size of the result, across all pages. This might decrease performance on large data sets. With this flag set to true, hasMore will be be true whenever there is a next page. totalResultSize will always be zero. With this flag set to false, hasMore will always be set to false. totalResultSize will contain the total number of results for this query.  | [optional]
 **includeOld** | **Boolean**| When this flag is set to false, the state without the change will not be returned. The default value is true. | [optional]

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

<a name="getCoupons"></a>
# **getCoupons**
> InlineResponse2001 getCoupons(applicationId, campaignId, pageSize, skip, sort, value, createdBefore, createdAfter, startsAfter, startsBefore, expiresAfter, expiresBefore, valid, batchId, usable, referralId, recipientIntegrationId, exactMatch)

List Coupons

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime startsAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime startsBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime expiresAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime expiresBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Integer referralId = 56; // Integer | Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile id specified in the coupon's RecipientIntegrationId field
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code
    try {
      InlineResponse2001 result = apiInstance.getCoupons(applicationId, campaignId, pageSize, skip, sort, value, createdBefore, createdAfter, startsAfter, startsBefore, expiresAfter, expiresBefore, valid, batchId, usable, referralId, recipientIntegrationId, exactMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCoupons");
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **startsAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **startsBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **expiresAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **expiresBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **batchId** | **String**| Filter results by batches of coupons | [optional]
 **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false]
 **referralId** | **Integer**| Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code. | [optional]
 **recipientIntegrationId** | **String**| Filter results by match with a profile id specified in the coupon&#39;s RecipientIntegrationId field | [optional]
 **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code | [optional] [default to false]

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

<a name="getCouponsByAttributes"></a>
# **getCouponsByAttributes**
> InlineResponse2001 getCouponsByAttributes(applicationId, campaignId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, exactMatch, batchId)

Get a list of the coupons that match the given attributes

Gets a list of all the coupons that exactly match a set of attributes.  The match is successful if all the attributes of the request are found in a coupon, even if the coupon has more attributes that are not present on the request. 

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    CouponSearch body = new CouponSearch(); // CouponSearch | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Integer referralId = 56; // Integer | Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile id specified in the coupon's RecipientIntegrationId field
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    try {
      InlineResponse2001 result = apiInstance.getCouponsByAttributes(applicationId, campaignId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, exactMatch, batchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCouponsByAttributes");
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **body** | [**CouponSearch**](CouponSearch.md)|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false]
 **referralId** | **Integer**| Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code. | [optional]
 **recipientIntegrationId** | **String**| Filter results by match with a profile id specified in the coupon&#39;s RecipientIntegrationId field | [optional]
 **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code | [optional] [default to false]
 **batchId** | **String**| Filter results by batches of coupons | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCouponsByAttributesApplicationWide"></a>
# **getCouponsByAttributesApplicationWide**
> InlineResponse2001 getCouponsByAttributesApplicationWide(applicationId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch, campaignState)

Get a list of the coupons that match the given attributes in all active campaigns of an application

Gets a list of all the coupons with attributes matching the query criteria Application wide 

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
    Integer applicationId = 56; // Integer | 
    CouponSearch body = new CouponSearch(); // CouponSearch | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Integer referralId = 56; // Integer | Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile id specified in the coupon's RecipientIntegrationId field
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code
    String campaignState = "campaignState_example"; // String | Filter results by the state of the campaign.
    try {
      InlineResponse2001 result = apiInstance.getCouponsByAttributesApplicationWide(applicationId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch, campaignState);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCouponsByAttributesApplicationWide");
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
 **applicationId** | **Integer**|  |
 **body** | [**CouponSearch**](CouponSearch.md)|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false]
 **referralId** | **Integer**| Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code. | [optional]
 **recipientIntegrationId** | **String**| Filter results by match with a profile id specified in the coupon&#39;s RecipientIntegrationId field | [optional]
 **batchId** | **String**| Filter results by batches of coupons | [optional]
 **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code | [optional] [default to false]
 **campaignState** | **String**| Filter results by the state of the campaign. | [optional] [enum: enabled, disabled, archived, draft, scheduled, running, expired]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCouponsWithoutTotalCount"></a>
# **getCouponsWithoutTotalCount**
> InlineResponse2005 getCouponsWithoutTotalCount(applicationId, campaignId, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch)

List Coupons

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
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

Get Activity Report for Single Customer

Fetch summary report for single application customer based on a time range

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
    Integer applicationId = 56; // Integer | 
    Integer customerId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |
 **customerId** | **Integer**|  |
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

<a name="getCustomerActivityReports"></a>
# **getCustomerActivityReports**
> InlineResponse20014 getCustomerActivityReports(rangeStart, rangeEnd, applicationId, pageSize, skip, sort, name, integrationId, campaignName, advocateName)

Get Activity Reports for Application Customers

Fetch summary reports for all application customers based on a time range

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
    Integer applicationId = 56; // Integer | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String name = "name_example"; // String | Only return reports matching the customer name
    String integrationId = "integrationId_example"; // String | Only return reports matching the integrationId
    String campaignName = "campaignName_example"; // String | Only return reports matching the campaignName
    String advocateName = "advocateName_example"; // String | Only return reports matching the current customer referrer name
    try {
      InlineResponse20014 result = apiInstance.getCustomerActivityReports(rangeStart, rangeEnd, applicationId, pageSize, skip, sort, name, integrationId, campaignName, advocateName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomerActivityReports");
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
 **applicationId** | **Integer**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **name** | **String**| Only return reports matching the customer name | [optional]
 **integrationId** | **String**| Only return reports matching the integrationId | [optional]
 **campaignName** | **String**| Only return reports matching the campaignName | [optional]
 **advocateName** | **String**| Only return reports matching the current customer referrer name | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

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
> InlineResponse20015 getCustomerActivityReportsWithoutTotalCount(rangeStart, rangeEnd, applicationId, pageSize, skip, sort, name, integrationId, campaignName, advocateName)

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
    Integer applicationId = 56; // Integer | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String name = "name_example"; // String | Only return reports matching the customer name
    String integrationId = "integrationId_example"; // String | Only return reports matching the integrationId
    String campaignName = "campaignName_example"; // String | Only return reports matching the campaignName
    String advocateName = "advocateName_example"; // String | Only return reports matching the current customer referrer name
    try {
      InlineResponse20015 result = apiInstance.getCustomerActivityReportsWithoutTotalCount(rangeStart, rangeEnd, applicationId, pageSize, skip, sort, name, integrationId, campaignName, advocateName);
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
 **applicationId** | **Integer**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **name** | **String**| Only return reports matching the customer name | [optional]
 **integrationId** | **String**| Only return reports matching the integrationId | [optional]
 **campaignName** | **String**| Only return reports matching the campaignName | [optional]
 **advocateName** | **String**| Only return reports matching the current customer referrer name | [optional]

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

<a name="getCustomerAnalytics"></a>
# **getCustomerAnalytics**
> CustomerAnalytics getCustomerAnalytics(applicationId, customerId, pageSize, skip, sort)

Get Analytics Report for a Customer

Fetch analytics for single application customer

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
    Integer applicationId = 56; // Integer | 
    Integer customerId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |
 **customerId** | **Integer**|  |
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
> ApplicationCustomer getCustomerProfile(applicationId, customerId)

Get Customer Profile

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
    Integer applicationId = 56; // Integer | 
    Integer customerId = 56; // Integer | 
    try {
      ApplicationCustomer result = apiInstance.getCustomerProfile(applicationId, customerId);
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
 **applicationId** | **Integer**|  |
 **customerId** | **Integer**|  |

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

<a name="getCustomerProfiles"></a>
# **getCustomerProfiles**
> InlineResponse20013 getCustomerProfiles(pageSize, skip)

List Customer Profiles

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
      InlineResponse20013 result = apiInstance.getCustomerProfiles(pageSize, skip);
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

<a name="getCustomersByAttributes"></a>
# **getCustomersByAttributes**
> InlineResponse20013 getCustomersByAttributes(body, pageSize, skip)

Get a list of the customer profiles that match the given attributes

Gets a list of all the customer profiles for the account that exactly match a set of attributes.  The match is successful if all the attributes of the request are found in a profile, even if the profile has more attributes that are not present on the request.  [Customer Profile]: https://help.talon.one/hc/en-us/articles/360005130739-Data-Model#CustomerProfile 

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
    ApplicationCustomerSearch body = new ApplicationCustomerSearch(); // ApplicationCustomerSearch | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    try {
      InlineResponse20013 result = apiInstance.getCustomersByAttributes(body, pageSize, skip);
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
 **body** | [**ApplicationCustomerSearch**](ApplicationCustomerSearch.md)|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

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
> InlineResponse20024 getEventTypes(applicationIds, name, includeOldVersions, pageSize, skip, sort)

List Event Types

Fetch all event type definitions for your account. Each event type can be 

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
    String name = "name_example"; // String | Filter results to event types with the given name. This parameter implies `includeOldVersions`.
    Boolean includeOldVersions = false; // Boolean | Include all versions of every event type.
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    try {
      InlineResponse20024 result = apiInstance.getEventTypes(applicationIds, name, includeOldVersions, pageSize, skip, sort);
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
 **applicationIds** | **String**| Filter by one or more application ids separated by comma | [optional]
 **name** | **String**| Filter results to event types with the given name. This parameter implies &#x60;includeOldVersions&#x60;. | [optional]
 **includeOldVersions** | **Boolean**| Include all versions of every event type. | [optional] [default to false]
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]

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

<a name="getExports"></a>
# **getExports**
> InlineResponse20027 getExports(pageSize, skip, applicationId, campaignId, entity)

Get Exports

Get a list of all past exports 

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    String entity = "entity_example"; // String | The name of the entity type that was exported.
    try {
      InlineResponse20027 result = apiInstance.getExports(pageSize, skip, applicationId, campaignId, entity);
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
 **applicationId** | **Integer**|  | [optional]
 **campaignId** | **Integer**|  | [optional]
 **entity** | **String**| The name of the entity type that was exported. | [optional] [enum: Coupon, Effect, CustomerSession]

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

<a name="getImports"></a>
# **getImports**
> InlineResponse20028 getImports(pageSize, skip)

Get Imports

Get a list of all past imports 

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
      InlineResponse20028 result = apiInstance.getImports(pageSize, skip);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getImports");
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

<a name="getLoyaltyPoints"></a>
# **getLoyaltyPoints**
> LoyaltyLedger getLoyaltyPoints(programID, integrationID)

get the Loyalty Ledger for this integrationID

Get the Loyalty Ledger for this profile integration ID.

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
    String programID = "programID_example"; // String | The identifier for the application, must be unique within the account.
    String integrationID = "integrationID_example"; // String | The identifier for the application, must be unique within the account.
    try {
      LoyaltyLedger result = apiInstance.getLoyaltyPoints(programID, integrationID);
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
 **programID** | **String**| The identifier for the application, must be unique within the account. |
 **integrationID** | **String**| The identifier for the application, must be unique within the account. |

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
> LoyaltyProgram getLoyaltyProgram(programID)

Get a loyalty program

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
    String programID = "programID_example"; // String | 
    try {
      LoyaltyProgram result = apiInstance.getLoyaltyProgram(programID);
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
 **programID** | **String**|  |

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
> InlineResponse2008 getLoyaltyPrograms()

List all loyalty Programs

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
      InlineResponse2008 result = apiInstance.getLoyaltyPrograms();
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

<a name="getReferrals"></a>
# **getReferrals**
> InlineResponse2006 getReferrals(applicationId, campaignId, pageSize, skip, sort, code, createdBefore, createdAfter, valid, usable, advocate)

List Referrals

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String code = "code_example"; // String | Filter results performing case-insensitive matching against the referral code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches referrals in which the expiry date is set and in the past. The second matches referrals in which start date is null or in the past and expiry date is null or in the future, the third matches referrals in which start date is set and in the future. 
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only referrals where `usageCounter < usageLimit` will be returned, \"false\" will return only referrals where `usageCounter >= usageLimit`. 
    String advocate = "advocate_example"; // String | Filter results by match with a profile id specified in the referral's AdvocateProfileIntegrationId field
    try {
      InlineResponse2006 result = apiInstance.getReferrals(applicationId, campaignId, pageSize, skip, sort, code, createdBefore, createdAfter, valid, usable, advocate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getReferrals");
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **code** | **String**| Filter results performing case-insensitive matching against the referral code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. | [optional]
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

<a name="getReferralsWithoutTotalCount"></a>
# **getReferralsWithoutTotalCount**
> InlineResponse2007 getReferralsWithoutTotalCount(applicationId, campaignId, pageSize, skip, sort, code, createdBefore, createdAfter, valid, usable, advocate)

List Referrals

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String code = "code_example"; // String | Filter results performing case-insensitive matching against the referral code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches referrals in which the expiry date is set and in the past. The second matches referrals in which start date is null or in the past and expiry date is null or in the future, the third matches referrals in which start date is set and in the future. 
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only referrals where `usageCounter < usageLimit` will be returned, \"false\" will return only referrals where `usageCounter >= usageLimit`. 
    String advocate = "advocate_example"; // String | Filter results by match with a profile id specified in the referral's AdvocateProfileIntegrationId field
    try {
      InlineResponse2007 result = apiInstance.getReferralsWithoutTotalCount(applicationId, campaignId, pageSize, skip, sort, code, createdBefore, createdAfter, valid, usable, advocate);
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **code** | **String**| Filter results performing case-insensitive matching against the referral code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the referral creation timestamp. | [optional]
 **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches referrals in which the expiry date is set and in the past. The second matches referrals in which start date is null or in the past and expiry date is null or in the future, the third matches referrals in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only referrals where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only referrals where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false]
 **advocate** | **String**| Filter results by match with a profile id specified in the referral&#39;s AdvocateProfileIntegrationId field | [optional]

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

<a name="getRole"></a>
# **getRole**
> Role getRole(roleId)

Get information for the specified role.

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
    Integer roleId = 56; // Integer | 
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
 **roleId** | **Integer**|  |

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

Get a Ruleset

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
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
> InlineResponse2004 getRulesets(applicationId, campaignId, pageSize, skip, sort)

List Campaign Rulesets

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    try {
      InlineResponse2004 result = apiInstance.getRulesets(applicationId, campaignId, pageSize, skip, sort);
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

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

Get a single User

Retrieves the data (including an invitation code) for a user. Non-admin users can only get themselves. 

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
    Integer userId = 56; // Integer | 
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
 **userId** | **Integer**|  |

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
> InlineResponse20025 getUsers(pageSize, skip, sort)

List Users in your account

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
      InlineResponse20025 result = apiInstance.getUsers(pageSize, skip, sort);
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

<a name="getWebhook"></a>
# **getWebhook**
> Webhook getWebhook(webhookId)

Get Webhook

Returns an webhook by its id.

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
> InlineResponse20022 getWebhookActivationLogs(pageSize, skip, sort, integrationRequestUuid, webhookId, applicationId, campaignId, createdBefore, createdAfter)

List Webhook activation Log Entries

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
    BigDecimal applicationId = new BigDecimal(); // BigDecimal | 
    BigDecimal campaignId = new BigDecimal(); // BigDecimal | Filter results by campaign.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Only return events created before this date.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results where request and response times to return entries after parameter value, expected to be an RFC3339 timestamp string.
    try {
      InlineResponse20022 result = apiInstance.getWebhookActivationLogs(pageSize, skip, sort, integrationRequestUuid, webhookId, applicationId, campaignId, createdBefore, createdAfter);
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
 **applicationId** | **BigDecimal**|  | [optional]
 **campaignId** | **BigDecimal**| Filter results by campaign. | [optional]
 **createdBefore** | **OffsetDateTime**| Only return events created before this date. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results where request and response times to return entries after parameter value, expected to be an RFC3339 timestamp string. | [optional]

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

<a name="getWebhookLogs"></a>
# **getWebhookLogs**
> InlineResponse20023 getWebhookLogs(pageSize, skip, sort, status, webhookId, applicationId, campaignId, requestUuid, createdBefore, createdAfter)

List Webhook Log Entries

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
    BigDecimal applicationId = new BigDecimal(); // BigDecimal | 
    BigDecimal campaignId = new BigDecimal(); // BigDecimal | Filter results by campaign.
    String requestUuid = "requestUuid_example"; // String | Filter results by request UUID.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results where request and response times to return entries before parameter value, expected to be an RFC3339 timestamp string.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results where request and response times to return entries after parameter value, expected to be an RFC3339 timestamp string.
    try {
      InlineResponse20023 result = apiInstance.getWebhookLogs(pageSize, skip, sort, status, webhookId, applicationId, campaignId, requestUuid, createdBefore, createdAfter);
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
 **applicationId** | **BigDecimal**|  | [optional]
 **campaignId** | **BigDecimal**| Filter results by campaign. | [optional]
 **requestUuid** | **String**| Filter results by request UUID. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results where request and response times to return entries before parameter value, expected to be an RFC3339 timestamp string. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results where request and response times to return entries after parameter value, expected to be an RFC3339 timestamp string. | [optional]

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

<a name="getWebhooks"></a>
# **getWebhooks**
> InlineResponse20021 getWebhooks(applicationIds, sort, pageSize, skip)

List Webhooks

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
      InlineResponse20021 result = apiInstance.getWebhooks(applicationIds, sort, pageSize, skip);
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

<a name="removeLoyaltyPoints"></a>
# **removeLoyaltyPoints**
> removeLoyaltyPoints(programID, integrationID, body)

Deduct points in a certain loyalty program for the specified customer

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
    String programID = "programID_example"; // String | 
    String integrationID = "integrationID_example"; // String | 
    LoyaltyPoints body = new LoyaltyPoints(); // LoyaltyPoints | 
    try {
      apiInstance.removeLoyaltyPoints(programID, integrationID, body);
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
 **programID** | **String**|  |
 **integrationID** | **String**|  |
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

<a name="searchCouponsAdvanced"></a>
# **searchCouponsAdvanced**
> InlineResponse2001 searchCouponsAdvanced(applicationId, campaignId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, exactMatch, batchId)

Get a list of the coupons that match the given attributes

Gets a list of all the coupons with attributes matching the query criteria 

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    Object body = null; // Object | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Integer referralId = 56; // Integer | Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile id specified in the coupon's RecipientIntegrationId field
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    try {
      InlineResponse2001 result = apiInstance.searchCouponsAdvanced(applicationId, campaignId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, exactMatch, batchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#searchCouponsAdvanced");
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **body** | **Object**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false]
 **referralId** | **Integer**| Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code. | [optional]
 **recipientIntegrationId** | **String**| Filter results by match with a profile id specified in the coupon&#39;s RecipientIntegrationId field | [optional]
 **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code | [optional] [default to false]
 **batchId** | **String**| Filter results by batches of coupons | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchCouponsAdvancedApplicationWide"></a>
# **searchCouponsAdvancedApplicationWide**
> InlineResponse2001 searchCouponsAdvancedApplicationWide(applicationId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch, campaignState)

Get a list of the coupons that match the given attributes in all active campaigns of an application

Gets a list of all the coupons with attributes matching the query criteria in all active campaigns of an application 

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
    Integer applicationId = 56; // Integer | 
    Object body = null; // Object | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Integer referralId = 56; // Integer | Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile id specified in the coupon's RecipientIntegrationId field
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code
    String campaignState = "campaignState_example"; // String | Filter results by the state of the campaign.
    try {
      InlineResponse2001 result = apiInstance.searchCouponsAdvancedApplicationWide(applicationId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch, campaignState);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#searchCouponsAdvancedApplicationWide");
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
 **applicationId** | **Integer**|  |
 **body** | **Object**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false]
 **referralId** | **Integer**| Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code. | [optional]
 **recipientIntegrationId** | **String**| Filter results by match with a profile id specified in the coupon&#39;s RecipientIntegrationId field | [optional]
 **batchId** | **String**| Filter results by batches of coupons | [optional]
 **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code | [optional] [default to false]
 **campaignState** | **String**| Filter results by the state of the campaign. | [optional] [enum: enabled, disabled, archived, draft, scheduled, running, expired]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchCouponsAdvancedApplicationWideWithoutTotalCount"></a>
# **searchCouponsAdvancedApplicationWideWithoutTotalCount**
> InlineResponse2005 searchCouponsAdvancedApplicationWideWithoutTotalCount(applicationId, body, pageSize, skip, sort, value, createdBefore, createdAfter, valid, usable, referralId, recipientIntegrationId, batchId, exactMatch, campaignState)

Get a list of the coupons that match the given attributes in all active campaigns of an application

Gets a list of all the coupons with attributes matching the query criteria in all active campaigns of an application 

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
    Integer applicationId = 56; // Integer | 
    Object body = null; // Object | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    String valid = "valid_example"; // String | Either \"expired\", \"validNow\", or \"validFuture\". The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future. 
    String usable = "usable_example"; // String | Either \"true\" or \"false\". If \"true\", only coupons where `usageCounter < usageLimit` will be returned, \"false\" will return only coupons where `usageCounter >= usageLimit`. 
    Integer referralId = 56; // Integer | Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code.
    String recipientIntegrationId = "recipientIntegrationId_example"; // String | Filter results by match with a profile id specified in the coupon's RecipientIntegrationId field
    String batchId = "batchId_example"; // String | Filter results by batches of coupons
    Boolean exactMatch = false; // Boolean | Filter results to an exact case-insensitive matching against the coupon code
    String campaignState = "campaignState_example"; // String | Filter results by the state of the campaign.
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
 **applicationId** | **Integer**|  |
 **body** | **Object**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **valid** | **String**| Either \&quot;expired\&quot;, \&quot;validNow\&quot;, or \&quot;validFuture\&quot;. The first option matches coupons in which the expiry date is set and in the past. The second matches coupons in which start date is null or in the past and expiry date is null or in the future, the third matches coupons in which start date is set and in the future.  | [optional] [enum: expired, validNow, validFuture]
 **usable** | **String**| Either \&quot;true\&quot; or \&quot;false\&quot;. If \&quot;true\&quot;, only coupons where &#x60;usageCounter &lt; usageLimit&#x60; will be returned, \&quot;false\&quot; will return only coupons where &#x60;usageCounter &gt;&#x3D; usageLimit&#x60;.  | [optional] [enum: true, false]
 **referralId** | **Integer**| Filter the results by matching them with the Id of a referral, that meaning the coupons that had been created as an effect of the usage of a referral code. | [optional]
 **recipientIntegrationId** | **String**| Filter results by match with a profile id specified in the coupon&#39;s RecipientIntegrationId field | [optional]
 **batchId** | **String**| Filter results by batches of coupons | [optional]
 **exactMatch** | **Boolean**| Filter results to an exact case-insensitive matching against the coupon code | [optional] [default to false]
 **campaignState** | **String**| Filter results by the state of the campaign. | [optional] [enum: enabled, disabled, archived, draft, scheduled, running, expired]

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

Get a list of the coupons that match the given attributes

Gets a list of all the coupons with attributes matching the query criteria 

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    Object body = null; // Object | 
    Integer pageSize = 56; // Integer | The number of items to include in this response. When omitted, the maximum value of 1000 will be used.
    Integer skip = 56; // Integer | Skips the given number of items when paging through large result sets.
    String sort = "sort_example"; // String | The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with `-` to sort in descending order.
    String value = "value_example"; // String | Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters.
    OffsetDateTime createdBefore = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
    OffsetDateTime createdAfter = new OffsetDateTime(); // OffsetDateTime | Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp.
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **body** | **Object**|  |
 **pageSize** | **Integer**| The number of items to include in this response. When omitted, the maximum value of 1000 will be used. | [optional]
 **skip** | **Integer**| Skips the given number of items when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. Sorting defaults to ascending order, prefix the field name with &#x60;-&#x60; to sort in descending order. | [optional]
 **value** | **String**| Filter results performing case-insensitive matching against the coupon code. Both the code and the query are folded to remove all non-alpha-numeric characters. | [optional]
 **createdBefore** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
 **createdAfter** | **OffsetDateTime**| Filter results comparing the parameter value, expected to be an RFC3339 timestamp string, to the coupon creation timestamp. | [optional]
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

<a name="updateAttribute"></a>
# **updateAttribute**
> Attribute updateAttribute(attributeId, body)

Update a custom attribute

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

Update a Campaign

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
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

<a name="updateCampaignSet"></a>
# **updateCampaignSet**
> CampaignSet updateCampaignSet(applicationId, body)

Update a Campaign Set

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
    Integer applicationId = 56; // Integer | 
    NewCampaignSet body = new NewCampaignSet(); // NewCampaignSet | 
    try {
      CampaignSet result = apiInstance.updateCampaignSet(applicationId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateCampaignSet");
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
 **applicationId** | **Integer**|  |
 **body** | [**NewCampaignSet**](NewCampaignSet.md)|  |

### Return type

[**CampaignSet**](CampaignSet.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateCoupon"></a>
# **updateCoupon**
> Coupon updateCoupon(applicationId, campaignId, couponId, body)

Update a Coupon

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
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

Update a Batch of Coupons

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
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

<a name="updateRuleset"></a>
# **updateRuleset**
> Ruleset updateRuleset(applicationId, campaignId, rulesetId, body)

Update a Ruleset

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
    Integer applicationId = 56; // Integer | 
    Integer campaignId = 56; // Integer | 
    Integer rulesetId = 56; // Integer | 
    NewRuleset body = new NewRuleset(); // NewRuleset | 
    try {
      Ruleset result = apiInstance.updateRuleset(applicationId, campaignId, rulesetId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateRuleset");
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
 **applicationId** | **Integer**|  |
 **campaignId** | **Integer**|  |
 **rulesetId** | **Integer**|  |
 **body** | [**NewRuleset**](NewRuleset.md)|  |

### Return type

[**Ruleset**](Ruleset.md)

### Authorization

[manager_auth](../README.md#manager_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

