# IntegrationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReferral**](IntegrationApi.md#createReferral) | **POST** /v1/referrals | Create a referral code for an advocate
[**deleteCustomerData**](IntegrationApi.md#deleteCustomerData) | **DELETE** /v1/customer_data/{integrationId} | Delete the personal data of a customer.
[**trackEvent**](IntegrationApi.md#trackEvent) | **POST** /v1/events | Track an Event
[**updateCustomerProfile**](IntegrationApi.md#updateCustomerProfile) | **PUT** /v1/customer_profiles/{integrationId} | Update a Customer Profile
[**updateCustomerSession**](IntegrationApi.md#updateCustomerSession) | **PUT** /v1/customer_sessions/{customerSessionId} | Update a Customer Session


<a name="createReferral"></a>
# **createReferral**
> Referral createReferral(newReferral)

Create a referral code for an advocate

Creates a referral code for an advocate. The code will be valid for the referral campaign for which is created, indicated in the &#x60;campaignId&#x60; parameter, and will be associated with the profile specified in the &#x60;advocateProfileIntegrationId&#x60; parameter as the advocate&#39;s profile. 

### Example
```java
// Import classes:
//import one.talon.ApiClient;
//import one.talon.ApiException;
//import one.talon.Configuration;
//import one.talon.auth.*;
//import one.talon.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: integration_auth
ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
integration_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//integration_auth.setApiKeyPrefix("Token");

IntegrationApi apiInstance = new IntegrationApi();
NewReferral newReferral = new NewReferral(); // NewReferral | 
try {
    Referral result = apiInstance.createReferral(newReferral);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#createReferral");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newReferral** | [**NewReferral**](NewReferral.md)|  | [optional]

### Return type

[**Referral**](Referral.md)

### Authorization

[integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomerData"></a>
# **deleteCustomerData**
> deleteCustomerData(integrationId)

Delete the personal data of a customer.

Delete all attributes on the customer profile and on entities that reference that customer profile. 

### Example
```java
// Import classes:
//import one.talon.ApiClient;
//import one.talon.ApiException;
//import one.talon.Configuration;
//import one.talon.auth.*;
//import one.talon.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: integration_auth
ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
integration_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//integration_auth.setApiKeyPrefix("Token");

IntegrationApi apiInstance = new IntegrationApi();
String integrationId = "integrationId_example"; // String | The custom identifier for this profile, must be unique within the account.
try {
    apiInstance.deleteCustomerData(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#deleteCustomerData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **String**| The custom identifier for this profile, must be unique within the account. |

### Return type

null (empty response body)

### Authorization

[integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="trackEvent"></a>
# **trackEvent**
> IntegrationState trackEvent(newEvent)

Track an Event

Records an arbitrary event in a customer session. For example, an integration might record an event when a user updates their payment information.  The &#x60;sessionId&#x60; body parameter is required, an event is always part of a session. Much like updating a customer session, if either the profile or the session do not exist, a new empty one will be created. Note that if the specified session already exists, it must belong to the same &#x60;profileId&#x60; or an error will be returned.  As with customer sessions, you can use an empty string for &#x60;profileId&#x60; to indicate that this is an anonymous session.  Updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place. 

### Example
```java
// Import classes:
//import one.talon.ApiClient;
//import one.talon.ApiException;
//import one.talon.Configuration;
//import one.talon.auth.*;
//import one.talon.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: integration_auth
ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
integration_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//integration_auth.setApiKeyPrefix("Token");

IntegrationApi apiInstance = new IntegrationApi();
NewEvent newEvent = new NewEvent(); // NewEvent | 
try {
    IntegrationState result = apiInstance.trackEvent(newEvent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#trackEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newEvent** | [**NewEvent**](NewEvent.md)|  | [optional]

### Return type

[**IntegrationState**](IntegrationState.md)

### Authorization

[integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomerProfile"></a>
# **updateCustomerProfile**
> IntegrationState updateCustomerProfile(integrationId, newCustomerProfile)

Update a Customer Profile

Update (or create) a [Customer Profile][]. This profile information can then be matched and/or updated by campaign [Rules][].  The &#x60;integrationId&#x60; may be any identifier that will remain stable for the customer. For example, you might use a database ID, an email, or a phone number as the &#x60;integrationId&#x60;. It is vital that this ID **not** change over time, so **don&#39;t** use any identifier that the customer can update themselves. E.g. if your application allows a customer to update their e-mail address, you should instead use a database ID.  Updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  [Customer Profile]: /Getting-Started/entities#customer-profile [Rules]: /Getting-Started/entities#campaigns-rulesets-and-coupons 

### Example
```java
// Import classes:
//import one.talon.ApiClient;
//import one.talon.ApiException;
//import one.talon.Configuration;
//import one.talon.auth.*;
//import one.talon.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: integration_auth
ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
integration_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//integration_auth.setApiKeyPrefix("Token");

IntegrationApi apiInstance = new IntegrationApi();
String integrationId = "integrationId_example"; // String | The custom identifier for this profile, must be unique within the account.
NewCustomerProfile newCustomerProfile = new NewCustomerProfile(); // NewCustomerProfile | 
try {
    IntegrationState result = apiInstance.updateCustomerProfile(integrationId, newCustomerProfile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#updateCustomerProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **String**| The custom identifier for this profile, must be unique within the account. |
 **newCustomerProfile** | [**NewCustomerProfile**](NewCustomerProfile.md)|  | [optional]

### Return type

[**IntegrationState**](IntegrationState.md)

### Authorization

[integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomerSession"></a>
# **updateCustomerSession**
> IntegrationState updateCustomerSession(customerSessionId, newCustomerSession)

Update a Customer Session

Update (or create) a [Customer Session][]. For example, the items in a customers cart are part of a session.  The Talon.One platform supports multiple simultaneous sessions for the same profile, so if you have multiple ways of accessing the same application you have the option of either tracking multiple independent sessions or using the same session across all of them. You should share sessions when application access points share other state, such as the users cart. If two points of access to the application have independent state (e.g. a user can have different items in their cart across the two) they should use independent customer session ID&#39;s.  The &#x60;profileId&#x60; parameter in the request body should correspond to an &#x60;integrationId&#x60; for a customer profile, to track an anonymous session use the empty string (&#x60;\&quot;\&quot;&#x60;) as the &#x60;profileId&#x60;. Note that you do **not** need to create a customer profile first: if the specified profile does not yet exist, an empty profile will be created automatically.  Updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  The currency for the session and the cart items in the session is the same as that of the application with which the session is associated.  [Customer Session]: /Getting-Started/entities#customer-session 

### Example
```java
// Import classes:
//import one.talon.ApiClient;
//import one.talon.ApiException;
//import one.talon.Configuration;
//import one.talon.auth.*;
//import one.talon.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: integration_auth
ApiKeyAuth integration_auth = (ApiKeyAuth) defaultClient.getAuthentication("integration_auth");
integration_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//integration_auth.setApiKeyPrefix("Token");

IntegrationApi apiInstance = new IntegrationApi();
String customerSessionId = "customerSessionId_example"; // String | The custom identifier for this session, must be unique within the account.
NewCustomerSession newCustomerSession = new NewCustomerSession(); // NewCustomerSession | 
try {
    IntegrationState result = apiInstance.updateCustomerSession(customerSessionId, newCustomerSession);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#updateCustomerSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerSessionId** | **String**| The custom identifier for this session, must be unique within the account. |
 **newCustomerSession** | [**NewCustomerSession**](NewCustomerSession.md)|  | [optional]

### Return type

[**IntegrationState**](IntegrationState.md)

### Authorization

[integration_auth](../README.md#integration_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

