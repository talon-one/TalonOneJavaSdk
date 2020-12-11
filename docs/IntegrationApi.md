# IntegrationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCouponReservation**](IntegrationApi.md#createCouponReservation) | **POST** /v1/coupon_reservations/{couponValue} | Create a new coupon reservation
[**createReferral**](IntegrationApi.md#createReferral) | **POST** /v1/referrals | Create a referral code for an advocate
[**deleteCouponReservation**](IntegrationApi.md#deleteCouponReservation) | **DELETE** /v1/coupon_reservations/{couponValue} | Delete coupon reservations
[**deleteCustomerData**](IntegrationApi.md#deleteCustomerData) | **DELETE** /v1/customer_data/{integrationId} | Delete the personal data of a customer.
[**getCustomerInventory**](IntegrationApi.md#getCustomerInventory) | **GET** /v1/customer_profiles/{integrationId}/inventory | Get an inventory of all data associated with a specific customer profile.
[**getReservedCustomers**](IntegrationApi.md#getReservedCustomers) | **GET** /v1/coupon_reservations/customerprofiles/{couponValue} | Get the users that have this coupon reserved
[**trackEvent**](IntegrationApi.md#trackEvent) | **POST** /v1/events | Track an Event
[**updateCustomerProfile**](IntegrationApi.md#updateCustomerProfile) | **PUT** /v1/customer_profiles/{integrationId} | Update a Customer Profile V1
[**updateCustomerProfileAudiences**](IntegrationApi.md#updateCustomerProfileAudiences) | **POST** /v2/customer_audiences | Update a Customer Profile Audiences
[**updateCustomerProfileV2**](IntegrationApi.md#updateCustomerProfileV2) | **PUT** /v2/customer_profiles/{integrationId} | Update a Customer Profile
[**updateCustomerProfilesV2**](IntegrationApi.md#updateCustomerProfilesV2) | **PUT** /v2/customer_profiles | Update multiple Customer Profiles
[**updateCustomerSession**](IntegrationApi.md#updateCustomerSession) | **PUT** /v1/customer_sessions/{customerSessionId} | Update a Customer Session V1
[**updateCustomerSessionV2**](IntegrationApi.md#updateCustomerSessionV2) | **PUT** /v2/customer_sessions/{customerSessionId} | Update a Customer Session


<a name="createCouponReservation"></a>
# **createCouponReservation**
> Coupon createCouponReservation(couponValue, body)

Create a new coupon reservation

Creates a coupon reservation for all passed customer profiles on this couponID 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    // Configure API key authorization: integration_auth
    ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
    integration_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //integration_auth.setApiKeyPrefix("Token");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String couponValue = "couponValue_example"; // String | The value of a coupon
    CouponReservations body = new CouponReservations(); // CouponReservations | 
    try {
      Coupon result = apiInstance.createCouponReservation(couponValue, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#createCouponReservation");
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
 **couponValue** | **String**| The value of a coupon |
 **body** | [**CouponReservations**](CouponReservations.md)|  |

### Return type

[**Coupon**](Coupon.md)

### Authorization

[api_key_v1](../README.md#api_key_v1), [integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="createReferral"></a>
# **createReferral**
> Referral createReferral(body)

Create a referral code for an advocate

Creates a referral code for an advocate. The code will be valid for the referral campaign for which is created, indicated in the &#x60;campaignId&#x60; parameter, and will be associated with the profile specified in the &#x60;advocateProfileIntegrationId&#x60; parameter as the advocate&#39;s profile. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    // Configure API key authorization: integration_auth
    ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
    integration_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //integration_auth.setApiKeyPrefix("Token");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    NewReferral body = new NewReferral(); // NewReferral | 
    try {
      Referral result = apiInstance.createReferral(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#createReferral");
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
 **body** | [**NewReferral**](NewReferral.md)|  |

### Return type

[**Referral**](Referral.md)

### Authorization

[api_key_v1](../README.md#api_key_v1), [integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="deleteCouponReservation"></a>
# **deleteCouponReservation**
> deleteCouponReservation(couponValue, body)

Delete coupon reservations

Removes all passed customer profiles reservation from this coupon 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    // Configure API key authorization: integration_auth
    ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
    integration_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //integration_auth.setApiKeyPrefix("Token");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String couponValue = "couponValue_example"; // String | The value of a coupon
    CouponReservations body = new CouponReservations(); // CouponReservations | 
    try {
      apiInstance.deleteCouponReservation(couponValue, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#deleteCouponReservation");
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
 **couponValue** | **String**| The value of a coupon |
 **body** | [**CouponReservations**](CouponReservations.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key_v1](../README.md#api_key_v1), [integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="deleteCustomerData"></a>
# **deleteCustomerData**
> deleteCustomerData(integrationId)

Delete the personal data of a customer.

Delete all attributes on the customer profile and on entities that reference that customer profile. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    // Configure API key authorization: integration_auth
    ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
    integration_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //integration_auth.setApiKeyPrefix("Token");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String integrationId = "integrationId_example"; // String | The custom identifier for this profile, must be unique within the account.
    try {
      apiInstance.deleteCustomerData(integrationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#deleteCustomerData");
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
 **integrationId** | **String**| The custom identifier for this profile, must be unique within the account. |

### Return type

null (empty response body)

### Authorization

[api_key_v1](../README.md#api_key_v1), [integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="getCustomerInventory"></a>
# **getCustomerInventory**
> CustomerInventory getCustomerInventory(integrationId, profile, referrals, coupons, loyalty)

Get an inventory of all data associated with a specific customer profile.

Get information regarding entities referencing this customer profile&#39;s integrationId. Currently we support customer profile information, referral codes and reserved coupons. In the future, this will be expanded with loyalty points.

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    // Configure API key authorization: integration_auth
    ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
    integration_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //integration_auth.setApiKeyPrefix("Token");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String integrationId = "integrationId_example"; // String | The custom identifier for this profile, must be unique within the account.
    Boolean profile = true; // Boolean | optional flag to decide if you would like customer profile information in the response
    Boolean referrals = true; // Boolean | optional flag to decide if you would like referral information in the response
    Boolean coupons = true; // Boolean | optional flag to decide if you would like coupon information in the response
    Boolean loyalty = true; // Boolean | optional flag to decide if you would like loyalty information in the response
    try {
      CustomerInventory result = apiInstance.getCustomerInventory(integrationId, profile, referrals, coupons, loyalty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#getCustomerInventory");
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
 **integrationId** | **String**| The custom identifier for this profile, must be unique within the account. |
 **profile** | **Boolean**| optional flag to decide if you would like customer profile information in the response | [optional]
 **referrals** | **Boolean**| optional flag to decide if you would like referral information in the response | [optional]
 **coupons** | **Boolean**| optional flag to decide if you would like coupon information in the response | [optional]
 **loyalty** | **Boolean**| optional flag to decide if you would like loyalty information in the response | [optional]

### Return type

[**CustomerInventory**](CustomerInventory.md)

### Authorization

[api_key_v1](../README.md#api_key_v1), [integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getReservedCustomers"></a>
# **getReservedCustomers**
> InlineResponse200 getReservedCustomers(couponValue)

Get the users that have this coupon reserved

Returns all users that have this coupon marked as reserved 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    // Configure API key authorization: integration_auth
    ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
    integration_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //integration_auth.setApiKeyPrefix("Token");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String couponValue = "couponValue_example"; // String | The value of a coupon
    try {
      InlineResponse200 result = apiInstance.getReservedCustomers(couponValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#getReservedCustomers");
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
 **couponValue** | **String**| The value of a coupon |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[api_key_v1](../README.md#api_key_v1), [integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="trackEvent"></a>
# **trackEvent**
> IntegrationState trackEvent(body, dry)

Track an Event

Records an arbitrary event in a customer session. For example, an integration might record an event when a user updates their payment information.  The &#x60;sessionId&#x60; body parameter is required, an event is always part of a session. Much like updating a customer session, if either the profile or the session do not exist, a new empty one will be created. Note that if the specified session already exists, it must belong to the same &#x60;profileId&#x60; or an error will be returned.  As with customer sessions, you can use an empty string for &#x60;profileId&#x60; to indicate that this is an anonymous session.  Updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place. 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    // Configure API key authorization: integration_auth
    ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
    integration_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //integration_auth.setApiKeyPrefix("Token");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    NewEvent body = new NewEvent(); // NewEvent | 
    Boolean dry = true; // Boolean | Flag to indicate whether to skip persisting the changes or not (Will not persist if set to 'true').
    try {
      IntegrationState result = apiInstance.trackEvent(body, dry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#trackEvent");
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
 **body** | [**NewEvent**](NewEvent.md)|  |
 **dry** | **Boolean**| Flag to indicate whether to skip persisting the changes or not (Will not persist if set to &#39;true&#39;). | [optional]

### Return type

[**IntegrationState**](IntegrationState.md)

### Authorization

[api_key_v1](../README.md#api_key_v1), [integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="updateCustomerProfile"></a>
# **updateCustomerProfile**
> IntegrationState updateCustomerProfile(integrationId, body, dry)

Update a Customer Profile V1

⚠️ Deprecation Notice: Support for requests to this endpoint will end on 15.07.2021. We will not remove the endpoint, and it will still be accessible for you to use. For new features support, please migrate to [API V2.0](/Getting-Started/APIV2).  Update (or create) a [Customer Profile][]. This profile information can then be matched and/or updated by campaign [Rules][].  The &#x60;integrationId&#x60; may be any identifier that will remain stable for the customer. For example, you might use a database ID, an email, or a phone number as the &#x60;integrationId&#x60;. It is vital that this ID **not** change over time, so **don&#39;t** use any identifier that the customer can update themselves. E.g. if your application allows a customer to update their e-mail address, you should instead use a database ID.  Updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  [Customer Profile]: /Getting-Started/entities#customer-profile [Rules]: /Getting-Started/entities#campaigns-rulesets-and-coupons 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    // Configure API key authorization: integration_auth
    ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
    integration_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //integration_auth.setApiKeyPrefix("Token");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String integrationId = "integrationId_example"; // String | The custom identifier for this profile, must be unique within the account.
    NewCustomerProfile body = new NewCustomerProfile(); // NewCustomerProfile | 
    Boolean dry = true; // Boolean | Flag to indicate whether to skip persisting the changes or not (Will not persist if set to 'true').
    try {
      IntegrationState result = apiInstance.updateCustomerProfile(integrationId, body, dry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#updateCustomerProfile");
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
 **integrationId** | **String**| The custom identifier for this profile, must be unique within the account. |
 **body** | [**NewCustomerProfile**](NewCustomerProfile.md)|  |
 **dry** | **Boolean**| Flag to indicate whether to skip persisting the changes or not (Will not persist if set to &#39;true&#39;). | [optional]

### Return type

[**IntegrationState**](IntegrationState.md)

### Authorization

[api_key_v1](../README.md#api_key_v1), [integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateCustomerProfileAudiences"></a>
# **updateCustomerProfileAudiences**
> updateCustomerProfileAudiences(body)

Update a Customer Profile Audiences

Update one ore multiple Customer Profiles with the specified Audiences 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    CustomerProfileAudienceRequest body = new CustomerProfileAudienceRequest(); // CustomerProfileAudienceRequest | 
    try {
      apiInstance.updateCustomerProfileAudiences(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#updateCustomerProfileAudiences");
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
 **body** | [**CustomerProfileAudienceRequest**](CustomerProfileAudienceRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="updateCustomerProfileV2"></a>
# **updateCustomerProfileV2**
> IntegrationStateV2 updateCustomerProfileV2(integrationId, body, runRuleEngine, dry)

Update a Customer Profile

Update (or create) a [Customer Profile][].  The &#x60;integrationId&#x60; may be any identifier that will remain stable for the customer. For example, you might use a database ID, an email, or a phone number as the &#x60;integrationId&#x60;. It is vital that this ID **not** change over time, so **don&#39;t** use any identifier that the customer can update themselves. E.g. if your application allows a customer to update their e-mail address, you should instead use a database ID.  Updating a customer profile will return a response with the requested integration state. If &#x60;runRuleEngine&#x60; is set to &#x60;true&#x60;, this includes the effects that were generated due to triggered campaigns, the created coupons and referral objects, as well as any entity that was requested in the request parameter \&quot;responseContent\&quot;.  [Customer Profile]: /Getting-Started/entities#customer-profile 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String integrationId = "integrationId_example"; // String | The custom identifier for this profile, must be unique within the account.
    CustomerProfileIntegrationRequestV2 body = new CustomerProfileIntegrationRequestV2(); // CustomerProfileIntegrationRequestV2 | 
    Boolean runRuleEngine = true; // Boolean | Flag to indicate whether to run the rule engine (Defaults to false).
    Boolean dry = true; // Boolean | Flag to indicate whether to skip persisting the changes or not (Will not persist if set to 'true'. Only used when 'runRuleEngine' is set to 'true').
    try {
      IntegrationStateV2 result = apiInstance.updateCustomerProfileV2(integrationId, body, runRuleEngine, dry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#updateCustomerProfileV2");
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
 **integrationId** | **String**| The custom identifier for this profile, must be unique within the account. |
 **body** | [**CustomerProfileIntegrationRequestV2**](CustomerProfileIntegrationRequestV2.md)|  |
 **runRuleEngine** | **Boolean**| Flag to indicate whether to run the rule engine (Defaults to false). | [optional]
 **dry** | **Boolean**| Flag to indicate whether to skip persisting the changes or not (Will not persist if set to &#39;true&#39;. Only used when &#39;runRuleEngine&#39; is set to &#39;true&#39;). | [optional]

### Return type

[**IntegrationStateV2**](IntegrationStateV2.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateCustomerProfilesV2"></a>
# **updateCustomerProfilesV2**
> MultipleCustomerProfileIntegrationResponseV2 updateCustomerProfilesV2(body, silent)

Update multiple Customer Profiles

Update (or create) up to 1000 [Customer Profiles][] in 1 request.  The &#x60;integrationId&#x60; may be any identifier that will remain stable for the customer. For example, you might use a database ID, an email, or a phone number as the &#x60;integrationId&#x60;. It is vital that this ID **not** change over time, so **don&#39;t** use any identifier that the customer can update themselves. E.g. if your application allows a customer to update their e-mail address, you should instead use a database ID.  [Customer Profiles]: /Getting-Started/entities#customer-profile 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    MultipleCustomerProfileIntegrationRequest body = new MultipleCustomerProfileIntegrationRequest(); // MultipleCustomerProfileIntegrationRequest | 
    String silent = "silent_example"; // String | If set to 'yes', response will be an empty 204, otherwise a list of integration states will be generated (up to 1000).
    try {
      MultipleCustomerProfileIntegrationResponseV2 result = apiInstance.updateCustomerProfilesV2(body, silent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#updateCustomerProfilesV2");
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
 **body** | [**MultipleCustomerProfileIntegrationRequest**](MultipleCustomerProfileIntegrationRequest.md)|  |
 **silent** | **String**| If set to &#39;yes&#39;, response will be an empty 204, otherwise a list of integration states will be generated (up to 1000). | [optional]

### Return type

[**MultipleCustomerProfileIntegrationResponseV2**](MultipleCustomerProfileIntegrationResponseV2.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateCustomerSession"></a>
# **updateCustomerSession**
> IntegrationState updateCustomerSession(customerSessionId, body, dry)

Update a Customer Session V1

⚠️ Deprecation Notice: Support for requests to this endpoint will end on 15.07.2021. We will not remove the endpoint, and it will still be accessible for you to use. For new features support, please migrate to [API V2.0](/Getting-Started/APIV2).  Update (or create) a [Customer Session][]. For example, the items in a customers cart are part of a session.  The Talon.One platform supports multiple simultaneous sessions for the same profile, so if you have multiple ways of accessing the same application you have the option of either tracking multiple independent sessions or using the same session across all of them. You should share sessions when application access points share other state, such as the users cart. If two points of access to the application have independent state (e.g. a user can have different items in their cart across the two) they should use independent customer session ID&#39;s.  The &#x60;profileId&#x60; parameter in the request body should correspond to an &#x60;integrationId&#x60; for a customer profile, to track an anonymous session use the empty string (&#x60;\&quot;\&quot;&#x60;) as the &#x60;profileId&#x60;. Note that you do **not** need to create a customer profile first: if the specified profile does not yet exist, an empty profile will be created automatically.  Updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  The currency for the session and the cart items in the session is the same as that of the application with which the session is associated.  [Customer Session]: /Getting-Started/entities#customer-session 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    // Configure API key authorization: integration_auth
    ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
    integration_auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //integration_auth.setApiKeyPrefix("Token");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String customerSessionId = "customerSessionId_example"; // String | The custom identifier for this session, must be unique within the account.
    NewCustomerSession body = new NewCustomerSession(); // NewCustomerSession | 
    Boolean dry = true; // Boolean | Flag to indicate whether to skip persisting the changes or not (Will not persist if set to 'true').
    try {
      IntegrationState result = apiInstance.updateCustomerSession(customerSessionId, body, dry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#updateCustomerSession");
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
 **customerSessionId** | **String**| The custom identifier for this session, must be unique within the account. |
 **body** | [**NewCustomerSession**](NewCustomerSession.md)|  |
 **dry** | **Boolean**| Flag to indicate whether to skip persisting the changes or not (Will not persist if set to &#39;true&#39;). | [optional]

### Return type

[**IntegrationState**](IntegrationState.md)

### Authorization

[api_key_v1](../README.md#api_key_v1), [integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateCustomerSessionV2"></a>
# **updateCustomerSessionV2**
> IntegrationStateV2 updateCustomerSessionV2(customerSessionId, body, dry)

Update a Customer Session

Update (or create) a [Customer Session][]. For example, the items in a customers cart are part of a session.  The Talon.One platform supports multiple simultaneous sessions for the same profile, so if you have multiple ways of accessing the same application you have the option of either tracking multiple independent sessions or using the same session across all of them. You should share sessions when application access points share other state, such as the users cart. If two points of access to the application have independent state (e.g. a user can have different items in their cart across the two) they should use independent customer session ID&#39;s.  The &#x60;customerProfileId&#x60; parameter in the request body should correspond to an &#x60;integrationId&#x60; for a customer profile, to track an anonymous session you can simply omit the &#x60;customerProfileId&#x60; property from the request. Note that you do **not** need to create a customer profile first: if the specified profile does not yet exist, an empty profile will be created automatically.  Updating a customer session will return a response with the requested integration state. If &#x60;runRuleEngine&#x60; is set to &#x60;true&#x60;, this includes the effects that were generated due to triggered campaigns, the created coupons and referral objects, as well as any entity that was requested in the request parameter \&quot;responseContent\&quot;.  The currency for the session and the cart items in the session is the same as that of the application with which the session is associated.  [Customer Session]: /Getting-Started/entities#customer-session 

### Example
```java
// Import classes:
import one.talon.ApiClient;
import one.talon.ApiException;
import one.talon.Configuration;
import one.talon.auth.*;
import one.talon.models.*;
import one.talon.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: api_key_v1
    ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
    api_key_v1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_v1.setApiKeyPrefix("Token");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String customerSessionId = "customerSessionId_example"; // String | The custom identifier for this session, must be unique within the account.
    IntegrationRequest body = new IntegrationRequest(); // IntegrationRequest | 
    Boolean dry = true; // Boolean | Flag to indicate whether to skip persisting the changes or not (Will not persist if set to 'true').
    try {
      IntegrationStateV2 result = apiInstance.updateCustomerSessionV2(customerSessionId, body, dry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#updateCustomerSessionV2");
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
 **customerSessionId** | **String**| The custom identifier for this session, must be unique within the account. |
 **body** | [**IntegrationRequest**](IntegrationRequest.md)|  |
 **dry** | **Boolean**| Flag to indicate whether to skip persisting the changes or not (Will not persist if set to &#39;true&#39;). | [optional]

### Return type

[**IntegrationStateV2**](IntegrationStateV2.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

