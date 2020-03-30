# IntegrationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCouponReservation**](IntegrationApi.md#createCouponReservation) | **POST** /v1/coupon_reservations/{couponValue} | Create a new coupon reservation
[**createReferral**](IntegrationApi.md#createReferral) | **POST** /v1/referrals | Create a referral code for an advocate
[**deleteCouponReservation**](IntegrationApi.md#deleteCouponReservation) | **DELETE** /v1/coupon_reservations/{couponValue} | Delete coupon reservations
[**deleteCustomerData**](IntegrationApi.md#deleteCustomerData) | **DELETE** /v1/customer_data/{integrationId} | Delete the personal data of a customer.
[**getCustomerInventory**](IntegrationApi.md#getCustomerInventory) | **GET** /v1/customer_profiles/{integrationId}/inventory | Get an inventory of all data associated with a specific customer profile.
[**getReservedCoupons**](IntegrationApi.md#getReservedCoupons) | **GET** /v1/coupon_reservations/coupons/{integrationId} | Get all valid reserved coupons
[**getReservedCustomers**](IntegrationApi.md#getReservedCustomers) | **GET** /v1/coupon_reservations/customerprofiles/{couponValue} | Get the users that have this coupon reserved
[**trackEvent**](IntegrationApi.md#trackEvent) | **POST** /v1/events | Track an Event
[**updateCustomerProfile**](IntegrationApi.md#updateCustomerProfile) | **PUT** /v1/customer_profiles/{integrationId} | Update a Customer Profile
[**updateCustomerSession**](IntegrationApi.md#updateCustomerSession) | **PUT** /v1/customer_sessions/{customerSessionId} | Update a Customer Session
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
> CustomerInventory getCustomerInventory(integrationId, profile, referrals)

Get an inventory of all data associated with a specific customer profile.

Get information regarding entities referencing this customer profile&#39;s integrationId. Currently we support customer profile information and referral codes. In the future, this will be expanded with coupon codes and loyalty points.

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
    Object profile = null; // Object | optional flag to decide if you would like customer profile information in the response
    Object referrals = null; // Object | optional flag to decide if you would like referral information in the response
    try {
      CustomerInventory result = apiInstance.getCustomerInventory(integrationId, profile, referrals);
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
 **profile** | [**Object**](.md)| optional flag to decide if you would like customer profile information in the response | [optional] [default to null]
 **referrals** | [**Object**](.md)| optional flag to decide if you would like referral information in the response | [optional] [default to null]

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

<a name="getReservedCoupons"></a>
# **getReservedCoupons**
> InlineResponse2001 getReservedCoupons(integrationId)

Get all valid reserved coupons

Returns all coupons this user is subscribed to that are valid and usable 

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
      InlineResponse2001 result = apiInstance.getReservedCoupons(integrationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#getReservedCoupons");
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

[**InlineResponse2001**](InlineResponse2001.md)

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
> IntegrationState trackEvent(body)

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
    try {
      IntegrationState result = apiInstance.trackEvent(body);
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
> IntegrationState updateCustomerProfile(integrationId, body)

Update a Customer Profile

Update (or create) a [Customer Profile][]. This profile information can then be matched and/or updated by campaign [Rules][].  The &#x60;integrationId&#x60; may be any identifier that will remain stable for the customer. For example, you might use a database ID, an email, or a phone number as the &#x60;integrationId&#x60;. It is vital that this ID **not** change over time, so **don&#39;t** use any identifier that the customer can update themselves. E.g. if your application allows a customer to update their e-mail address, you should instead use a database ID.  Updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  [Customer Profile]: /Getting-Started/entities#customer-profile [Rules]: /Getting-Started/entities#campaigns-rulesets-and-coupons 

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
    try {
      IntegrationState result = apiInstance.updateCustomerProfile(integrationId, body);
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

<a name="updateCustomerSession"></a>
# **updateCustomerSession**
> IntegrationState updateCustomerSession(customerSessionId, body)

Update a Customer Session

Update (or create) a [Customer Session][]. For example, the items in a customers cart are part of a session.  The Talon.One platform supports multiple simultaneous sessions for the same profile, so if you have multiple ways of accessing the same application you have the option of either tracking multiple independent sessions or using the same session across all of them. You should share sessions when application access points share other state, such as the users cart. If two points of access to the application have independent state (e.g. a user can have different items in their cart across the two) they should use independent customer session ID&#39;s.  The &#x60;profileId&#x60; parameter in the request body should correspond to an &#x60;integrationId&#x60; for a customer profile, to track an anonymous session use the empty string (&#x60;\&quot;\&quot;&#x60;) as the &#x60;profileId&#x60;. Note that you do **not** need to create a customer profile first: if the specified profile does not yet exist, an empty profile will be created automatically.  Updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  The currency for the session and the cart items in the session is the same as that of the application with which the session is associated.  [Customer Session]: /Getting-Started/entities#customer-session 

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
    try {
      IntegrationState result = apiInstance.updateCustomerSession(customerSessionId, body);
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
> IntegrationStateV2 updateCustomerSessionV2(customerSessionId, body)

Update a Customer Session

Update (or create) a [Customer Session][]. For example, the items in a customers cart are part of a session.  The Talon.One platform supports multiple simultaneous sessions for the same profile, so if you have multiple ways of accessing the same application you have the option of either tracking multiple independent sessions or using the same session across all of them. You should share sessions when application access points share other state, such as the users cart. If two points of access to the application have independent state (e.g. a user can have different items in their cart across the two) they should use independent customer session ID&#39;s.  The &#x60;profileId&#x60; parameter in the request body should correspond to an &#x60;integrationId&#x60; for a customer profile, to track an anonymous session use the empty string (&#x60;\&quot;\&quot;&#x60;) as the &#x60;profileId&#x60;. Note that you do **not** need to create a customer profile first: if the specified profile does not yet exist, an empty profile will be created automatically.  Updating a customer profile will return a response with the requested integration state. This includes the effects that were generated due to triggered campaigns, the created coupons and referral objects, as well as any entity that was requested in the request parameter \&quot;responseContent\&quot;.  The currency for the session and the cart items in the session is the same as that of the application with which the session is associated.  [Customer Session]: /Getting-Started/entities#customer-session 

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
    IntegrationRequest body = new IntegrationRequest(); // IntegrationRequest | 
    try {
      IntegrationStateV2 result = apiInstance.updateCustomerSessionV2(customerSessionId, body);
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

### Return type

[**IntegrationStateV2**](IntegrationStateV2.md)

### Authorization

[api_key_v1](../README.md#api_key_v1), [integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

