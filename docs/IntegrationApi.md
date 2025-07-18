# IntegrationApi

All URLs are relative to `https://yourbaseurl.talon.one`.

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAudienceV2**](IntegrationApi.md#createAudienceV2) | **POST** /v2/audiences | Create audience
[**createCouponReservation**](IntegrationApi.md#createCouponReservation) | **POST** /v1/coupon_reservations/{couponValue} | Create coupon reservation
[**createReferral**](IntegrationApi.md#createReferral) | **POST** /v1/referrals | Create referral code for an advocate
[**createReferralsForMultipleAdvocates**](IntegrationApi.md#createReferralsForMultipleAdvocates) | **POST** /v1/referrals_for_multiple_advocates | Create referral codes for multiple advocates
[**deleteAudienceMembershipsV2**](IntegrationApi.md#deleteAudienceMembershipsV2) | **DELETE** /v2/audiences/{audienceId}/memberships | Delete audience memberships
[**deleteAudienceV2**](IntegrationApi.md#deleteAudienceV2) | **DELETE** /v2/audiences/{audienceId} | Delete audience
[**deleteCouponReservation**](IntegrationApi.md#deleteCouponReservation) | **DELETE** /v1/coupon_reservations/{couponValue} | Delete coupon reservations
[**deleteCustomerData**](IntegrationApi.md#deleteCustomerData) | **DELETE** /v1/customer_data/{integrationId} | Delete customer&#39;s personal data
[**generateLoyaltyCard**](IntegrationApi.md#generateLoyaltyCard) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/cards | Generate loyalty card
[**getCustomerAchievementHistory**](IntegrationApi.md#getCustomerAchievementHistory) | **GET** /v1/customer_profiles/{integrationId}/achievements/{achievementId} | List customer&#39;s achievement history
[**getCustomerAchievements**](IntegrationApi.md#getCustomerAchievements) | **GET** /v1/customer_profiles/{integrationId}/achievements | List customer&#39;s available achievements
[**getCustomerInventory**](IntegrationApi.md#getCustomerInventory) | **GET** /v1/customer_profiles/{integrationId}/inventory | List customer data
[**getCustomerSession**](IntegrationApi.md#getCustomerSession) | **GET** /v2/customer_sessions/{customerSessionId} | Get customer session
[**getLoyaltyBalances**](IntegrationApi.md#getLoyaltyBalances) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/balances | Get customer&#39;s loyalty balances
[**getLoyaltyCardBalances**](IntegrationApi.md#getLoyaltyCardBalances) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/balances | Get card&#39;s point balances
[**getLoyaltyCardPoints**](IntegrationApi.md#getLoyaltyCardPoints) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/points | List card&#39;s unused loyalty points
[**getLoyaltyCardTransactions**](IntegrationApi.md#getLoyaltyCardTransactions) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/transactions | List card&#39;s transactions
[**getLoyaltyProgramProfilePoints**](IntegrationApi.md#getLoyaltyProgramProfilePoints) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/points | List customer&#39;s unused loyalty points
[**getLoyaltyProgramProfileTransactions**](IntegrationApi.md#getLoyaltyProgramProfileTransactions) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/transactions | List customer&#39;s loyalty transactions
[**getReservedCustomers**](IntegrationApi.md#getReservedCustomers) | **GET** /v1/coupon_reservations/customerprofiles/{couponValue} | List customers that have this coupon reserved
[**linkLoyaltyCardToProfile**](IntegrationApi.md#linkLoyaltyCardToProfile) | **POST** /v2/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/link_profile | Link customer profile to card
[**reopenCustomerSession**](IntegrationApi.md#reopenCustomerSession) | **PUT** /v2/customer_sessions/{customerSessionId}/reopen | Reopen customer session
[**returnCartItems**](IntegrationApi.md#returnCartItems) | **POST** /v2/customer_sessions/{customerSessionId}/returns | Return cart items
[**syncCatalog**](IntegrationApi.md#syncCatalog) | **PUT** /v1/catalogs/{catalogId}/sync | Sync cart item catalog
[**trackEventV2**](IntegrationApi.md#trackEventV2) | **POST** /v2/events | Track event
[**updateAudienceCustomersAttributes**](IntegrationApi.md#updateAudienceCustomersAttributes) | **PUT** /v2/audience_customers/{audienceId}/attributes | Update profile attributes for all customers in audience
[**updateAudienceV2**](IntegrationApi.md#updateAudienceV2) | **PUT** /v2/audiences/{audienceId} | Update audience name
[**updateCustomerProfileAudiences**](IntegrationApi.md#updateCustomerProfileAudiences) | **POST** /v2/customer_audiences | Update multiple customer profiles&#39; audiences
[**updateCustomerProfileV2**](IntegrationApi.md#updateCustomerProfileV2) | **PUT** /v2/customer_profiles/{integrationId} | Update customer profile
[**updateCustomerProfilesV2**](IntegrationApi.md#updateCustomerProfilesV2) | **PUT** /v2/customer_profiles | Update multiple customer profiles
[**updateCustomerSessionV2**](IntegrationApi.md#updateCustomerSessionV2) | **PUT** /v2/customer_sessions/{customerSessionId} | Update customer session



## createAudienceV2

> Audience createAudienceV2(body)

Create audience

Create an audience. The audience can be created directly from scratch or can come from third party platforms.  **Note:** Audiences can also be created from scratch via the Campaign Manager. See the [docs](https://docs.talon.one/docs/product/audiences/creating-audiences).  To create an audience from an existing audience from a [technology partner](https://docs.talon.one/docs/dev/technology-partners/overview): 1. Set the &#x60;integration&#x60; property to &#x60;mparticle&#x60;, &#x60;segment&#x60; etc., depending on a third-party platform. 1. Set &#x60;integrationId&#x60; to the ID of this audience in a third-party platform.  To create an audience from an existing audience in another platform: 1. Do not use the &#x60;integration&#x60; property. 1. Set &#x60;integrationId&#x60; to the ID of this audience in the 3rd-party platform.  To create an audience from scratch: 1. Only set the &#x60;name&#x60; property.  Once you create your first audience, audience-specific rule conditions are enabled in the Rule Builder. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        NewAudience body = new NewAudience(); // NewAudience | body
        try {
            Audience result = apiInstance.createAudienceV2(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#createAudienceV2");
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
 **body** | [**NewAudience**](NewAudience.md)| body |

### Return type cool

[**Audience**](Audience.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **409** | Conflict. An Audience with this ID already exists for this integration. |  -  |


## createCouponReservation

> Coupon createCouponReservation(couponValue, body)

Create coupon reservation

Create a coupon reservation for the specified customer profiles on the specified coupon. You can also create a reservation via the Campaign Manager using the [Create coupon code reservation](https://docs.talon.one/docs/product/rules/effects/using-effects#reserving-a-coupon-code) effect.  **Note:**  - If the **Reservation mandatory** option was selected when creating the specified coupon, the endpoint creates a **hard** reservation, meaning only users who have this coupon code reserved can redeem it. Otherwise, the endpoint creates a **soft** reservation, meaning the coupon is associated with the specified customer profiles (they show up when using the [List customer data](https://docs.talon.one/integration-api#operation/getCustomerInventory) endpoint), but any user can redeem it. This can be useful, for example, to display a _coupon wallet_ for customers when they visit your store.  - If the **Coupon visibility** option was selected when creating the specified coupon, the coupon code is implicitly soft-reserved for all customers, and the code will be returned for all customer profiles in the [List customer data](https://docs.talon.one/integration-api#operation/getCustomerInventory) endpoint.  - This endpoint overrides the coupon reservation limit set when [the coupon is created](https://docs.talon.one/docs/product/campaigns/coupons/creating-coupons). To ensure that coupons cannot be reserved after the reservation limit is reached, use the [Create coupon code reservation](https://docs.talon.one/docs/product/rules/effects/using-effects#reserving-a-coupon-code) effect in the Rule Builder and the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint.  To delete a reservation, use the [Delete reservation](https://docs.talon.one/integration-api#tag/Coupons/operation/deleteCouponReservation) endpoint. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        String couponValue = "couponValue_example"; // String | The code of the coupon.
        CouponReservations body = new CouponReservations(); // CouponReservations | body
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
 **couponValue** | **String**| The code of the coupon. |
 **body** | [**CouponReservations**](CouponReservations.md)| body |

### Return type cool

[**Coupon**](Coupon.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |


## createReferral

> Referral createReferral(body)

Create referral code for an advocate

Creates a referral code for an advocate. The code will be valid for the referral campaign for which is created, indicated in the &#x60;campaignId&#x60; parameter, and will be associated with the profile specified in the &#x60;advocateProfileIntegrationId&#x60; parameter as the advocate&#39;s profile.  **Note:** Any [referral limits](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets#referral-limits) set are ignored when you use this endpoint. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        NewReferral body = new NewReferral(); // NewReferral | body
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
 **body** | [**NewReferral**](NewReferral.md)| body |

### Return type cool

[**Referral**](Referral.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |


## createReferralsForMultipleAdvocates

> InlineResponse201 createReferralsForMultipleAdvocates(body, silent)

Create referral codes for multiple advocates

Creates unique referral codes for multiple advocates. The code will be valid for the referral campaign for which it is created, indicated in the &#x60;campaignId&#x60; parameter, and one referral code will be associated with one advocate using the profile specified in the &#x60;advocateProfileIntegrationId&#x60; parameter as the advocate&#39;s profile.  **Note:** Any [referral limits](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets#referral-limits) set are ignored when you use this endpoint. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        NewReferralsForMultipleAdvocates body = new NewReferralsForMultipleAdvocates(); // NewReferralsForMultipleAdvocates | body
        String silent = "\"yes\""; // String | Possible values: `yes` or `no`. - `yes`: Increases the performance of the API call by returning a 204 response. - `no`: Returns a 200 response that contains the updated customer profiles. 
        try {
            InlineResponse201 result = apiInstance.createReferralsForMultipleAdvocates(body, silent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#createReferralsForMultipleAdvocates");
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
 **body** | [**NewReferralsForMultipleAdvocates**](NewReferralsForMultipleAdvocates.md)| body |
 **silent** | **String**| Possible values: &#x60;yes&#x60; or &#x60;no&#x60;. - &#x60;yes&#x60;: Increases the performance of the API call by returning a 204 response. - &#x60;no&#x60;: Returns a 200 response that contains the updated customer profiles.  | [optional] [default to &quot;yes&quot;]

### Return type cool

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **204** | No Content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |


## deleteAudienceMembershipsV2

> deleteAudienceMembershipsV2(audienceId)

Delete audience memberships

Remove all members from this audience. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        Long audienceId = 56L; // Long | The ID of the audience.
        try {
            apiInstance.deleteAudienceMembershipsV2(audienceId);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#deleteAudienceMembershipsV2");
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
 **audienceId** | **Long**| The ID of the audience. |

### Return type cool

null (empty response body)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## deleteAudienceV2

> deleteAudienceV2(audienceId)

Delete audience

Delete an audience created by a third-party integration.  **Warning:** This endpoint also removes any associations recorded between a customer profile and this audience.  **Note:** Audiences can also be deleted via the Campaign Manager. See the [docs](https://docs.talon.one/docs/product/audiences/managing-audiences#deleting-an-audience). 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        Long audienceId = 56L; // Long | The ID of the audience.
        try {
            apiInstance.deleteAudienceV2(audienceId);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#deleteAudienceV2");
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
 **audienceId** | **Long**| The ID of the audience. |

### Return type cool

null (empty response body)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## deleteCouponReservation

> deleteCouponReservation(couponValue, body)

Delete coupon reservations

Remove all the coupon reservations from the provided customer profile integration IDs and the provided coupon code. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        String couponValue = "couponValue_example"; // String | The code of the coupon.
        CouponReservations body = new CouponReservations(); // CouponReservations | body
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
 **couponValue** | **String**| The code of the coupon. |
 **body** | [**CouponReservations**](CouponReservations.md)| body |

### Return type cool

null (empty response body)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |


## deleteCustomerData

> deleteCustomerData(integrationId)

Delete customer&#39;s personal data

Delete all attributes on the customer profile and on entities that reference this customer profile.  **Important:** - Customer data is deleted from all Applications in the [environment](https://docs.talon.one/docs/product/applications/overview#application-environments)   that the API key belongs to. For example, if you use this endpoint with an API key that belongs to a sandbox Application,   customer data will be deleted from all sandbox Applications. This is because customer data is shared   between Applications from the same environment. - To preserve performance, we recommend avoiding deleting customer data during peak-traffic hours. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        String integrationId = "integrationId_example"; // String | The integration ID of the customer profile. You can get the `integrationId` of a profile using: - A customer session integration ID with the [Update customer session](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint. - The Management API with the [List application's customers](https://docs.talon.one/management-api#operation/getApplicationCustomers) endpoint. 
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
 **integrationId** | **String**| The integration ID of the customer profile. You can get the &#x60;integrationId&#x60; of a profile using: - A customer session integration ID with the [Update customer session](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint. - The Management API with the [List application&#39;s customers](https://docs.talon.one/management-api#operation/getApplicationCustomers) endpoint.  |

### Return type cool

null (empty response body)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |


## generateLoyaltyCard

> LoyaltyCard generateLoyaltyCard(loyaltyProgramId, body)

Generate loyalty card

Generate a loyalty card in a specified [card-based loyalty program](https://docs.talon.one/docs/product/loyalty-programs/card-based/card-based-overview).  To link the card to one or more customer profiles, use the &#x60;customerProfileIds&#x60; parameter in the request body.  **Note:** - The number of customer profiles linked to the loyalty card cannot exceed the loyalty program&#39;s &#x60;usersPerCardLimit&#x60;. To find the program&#39;s limit, use the [Get loyalty program](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyProgram) endpoint. - If the loyalty program has a defined code format, it will be used for the loyalty card identifier. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
        GenerateLoyaltyCard body = new GenerateLoyaltyCard(); // GenerateLoyaltyCard | body
        try {
            LoyaltyCard result = apiInstance.generateLoyaltyCard(loyaltyProgramId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#generateLoyaltyCard");
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
 **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  |
 **body** | [**GenerateLoyaltyCard**](GenerateLoyaltyCard.md)| body |

### Return type cool

[**LoyaltyCard**](LoyaltyCard.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |


## getCustomerAchievementHistory

> InlineResponse2002 getCustomerAchievementHistory(integrationId, achievementId, progressStatus, startDate, endDate, pageSize, skip)

List customer&#39;s achievement history

Retrieve all progress history of a given customer in the given achievement. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        String integrationId = "integrationId_example"; // String | The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier. 
        Long achievementId = 56L; // Long | The achievement identifier. 
        List<String> progressStatus = Arrays.asList(); // List<String> | Filter by customer progress status in the achievement. 
        OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | Timestamp that filters the results to only contain achievements created on or after the start date.
        OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | Timestamp that filters the results to only contain achievements created before or on the end date.
        Long pageSize = 1000lL; // Long | The number of items in the response.
        Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
        try {
            InlineResponse2002 result = apiInstance.getCustomerAchievementHistory(integrationId, achievementId, progressStatus, startDate, endDate, pageSize, skip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#getCustomerAchievementHistory");
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
 **integrationId** | **String**| The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier.  |
 **achievementId** | **Long**| The achievement identifier.  |
 **progressStatus** | [**List&lt;String&gt;**](String.md)| Filter by customer progress status in the achievement.  | [optional] [enum: inprogress, completed, expired]
 **startDate** | **OffsetDateTime**| Timestamp that filters the results to only contain achievements created on or after the start date. | [optional]
 **endDate** | **OffsetDateTime**| Timestamp that filters the results to only contain achievements created before or on the end date. | [optional]
 **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000l]
 **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional]

### Return type cool

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## getCustomerAchievements

> InlineResponse2001 getCustomerAchievements(integrationId, campaignIds, achievementIds, achievementStatus, currentProgressStatus, pageSize, skip)

List customer&#39;s available achievements

Retrieve all the achievements available to a given customer and their progress in them. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        String integrationId = "integrationId_example"; // String | The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier. 
        List<String> campaignIds = Arrays.asList(); // List<String> | Filter by one or more Campaign IDs, separated by a comma.  **Note:** If no campaigns are specified, data for all the campaigns in the Application is returned. 
        List<String> achievementIds = Arrays.asList(); // List<String> | Filter by one or more Achievement IDs, separated by a comma.  **Note:** If no achievements are specified, data for all the achievements in the Application is returned. 
        List<String> achievementStatus = Arrays.asList(); // List<String> | Filter by status of the achievement.  **Note:** If the achievement status is not specified, only data for all active achievements in the Application is returned. 
        List<String> currentProgressStatus = Arrays.asList(); // List<String> | Filter by customer progress status in the achievement. 
        Long pageSize = 1000lL; // Long | The number of items in the response.
        Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
        try {
            InlineResponse2001 result = apiInstance.getCustomerAchievements(integrationId, campaignIds, achievementIds, achievementStatus, currentProgressStatus, pageSize, skip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#getCustomerAchievements");
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
 **integrationId** | **String**| The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier.  |
 **campaignIds** | [**List&lt;String&gt;**](String.md)| Filter by one or more Campaign IDs, separated by a comma.  **Note:** If no campaigns are specified, data for all the campaigns in the Application is returned.  | [optional]
 **achievementIds** | [**List&lt;String&gt;**](String.md)| Filter by one or more Achievement IDs, separated by a comma.  **Note:** If no achievements are specified, data for all the achievements in the Application is returned.  | [optional]
 **achievementStatus** | [**List&lt;String&gt;**](String.md)| Filter by status of the achievement.  **Note:** If the achievement status is not specified, only data for all active achievements in the Application is returned.  | [optional] [enum: active, scheduled]
 **currentProgressStatus** | [**List&lt;String&gt;**](String.md)| Filter by customer progress status in the achievement.  | [optional] [enum: inprogress, completed, not_started]
 **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000l]
 **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional]

### Return type cool

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## getCustomerInventory

> CustomerInventory getCustomerInventory(integrationId, profile, referrals, coupons, loyalty, giveaways, achievements)

List customer data

Return the customer inventory regarding entities referencing this customer profile&#39;s &#x60;integrationId&#x60;.  Typical entities returned are: customer profile information, referral codes, loyalty points, loyalty cards and reserved coupons. Reserved coupons also include redeemed coupons. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        String integrationId = "integrationId_example"; // String | The integration ID of the customer profile. You can get the `integrationId` of a profile using: - A customer session integration ID with the [Update customer session](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint. - The Management API with the [List application's customers](https://docs.talon.one/management-api#operation/getApplicationCustomers) endpoint. 
        Boolean profile = true; // Boolean | Set to `true` to include customer profile information in the response.
        Boolean referrals = true; // Boolean | Set to `true` to include referral information in the response.
        Boolean coupons = true; // Boolean | Set to `true` to include coupon information in the response.
        Boolean loyalty = true; // Boolean | Set to `true` to include loyalty information in the response.
        Boolean giveaways = true; // Boolean | Set to `true` to include giveaways information in the response.
        Boolean achievements = true; // Boolean | Set to `true` to include achievement information in the response.
        try {
            CustomerInventory result = apiInstance.getCustomerInventory(integrationId, profile, referrals, coupons, loyalty, giveaways, achievements);
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
 **integrationId** | **String**| The integration ID of the customer profile. You can get the &#x60;integrationId&#x60; of a profile using: - A customer session integration ID with the [Update customer session](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint. - The Management API with the [List application&#39;s customers](https://docs.talon.one/management-api#operation/getApplicationCustomers) endpoint.  |
 **profile** | **Boolean**| Set to &#x60;true&#x60; to include customer profile information in the response. | [optional]
 **referrals** | **Boolean**| Set to &#x60;true&#x60; to include referral information in the response. | [optional]
 **coupons** | **Boolean**| Set to &#x60;true&#x60; to include coupon information in the response. | [optional]
 **loyalty** | **Boolean**| Set to &#x60;true&#x60; to include loyalty information in the response. | [optional]
 **giveaways** | **Boolean**| Set to &#x60;true&#x60; to include giveaways information in the response. | [optional]
 **achievements** | **Boolean**| Set to &#x60;true&#x60; to include achievement information in the response. | [optional]

### Return type cool

[**CustomerInventory**](CustomerInventory.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |


## getCustomerSession

> IntegrationCustomerSessionResponse getCustomerSession(customerSessionId)

Get customer session

Get the details of the given customer session.  You can get the same data via other endpoints that also apply changes, which can help you save requests and increase performance. See:  - [Update customer session](#tag/Customer-sessions/operation/updateCustomerSessionV2) - [Update customer profile](#tag/Customer-profiles/operation/updateCustomerProfileV2) 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        String customerSessionId = "customerSessionId_example"; // String | The `integration ID` of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager's **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#operation/getApplicationSessions) endpoint. 
        try {
            IntegrationCustomerSessionResponse result = apiInstance.getCustomerSession(customerSessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#getCustomerSession");
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
 **customerSessionId** | **String**| The &#x60;integration ID&#x60; of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager&#39;s **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#operation/getApplicationSessions) endpoint.  |

### Return type cool

[**IntegrationCustomerSessionResponse**](IntegrationCustomerSessionResponse.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |


## getLoyaltyBalances

> LoyaltyBalancesWithTiers getLoyaltyBalances(loyaltyProgramId, integrationId, endDate, subledgerId, includeTiers, includeProjectedTier)

Get customer&#39;s loyalty balances

Retrieve loyalty ledger balances for the given Integration ID in the specified loyalty program. You can filter balances by date and subledger ID, and include tier-related information in the response.  **Note**: If no filtering options are applied, you retrieve all loyalty balances on the current date for the given integration ID.  Loyalty balances are calculated when Talon.One receives your request using the points stored in our database, so retrieving a large number of balances at once can impact performance.  For more information, see: - [Managing card-based loyalty program data](https://docs.talon.one/docs/product/loyalty-programs/card-based/managing-loyalty-cards) - [Managing profile-based loyalty program data](https://docs.talon.one/docs/product/loyalty-programs/profile-based/managing-pb-lp-data) 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        Long loyaltyProgramId = 56L; // Long | Identifier of the profile-based loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
        String integrationId = "integrationId_example"; // String | The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier. 
        OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        String subledgerId = "subledgerId_example"; // String | The ID of the subledger by which we filter the data.
        Boolean includeTiers = false; // Boolean | Indicates whether tier information is included in the response.  When set to `true`, the response includes information about the current tier and the number of points required to move to next tier. 
        Boolean includeProjectedTier = false; // Boolean | Indicates whether the customer's projected tier information is included in the response.  When set to `true`, the response includes information about the customer's active points and the name of the projected tier.  **Note** We recommend filtering by `subledgerId` for better performance. 
        try {
            LoyaltyBalancesWithTiers result = apiInstance.getLoyaltyBalances(loyaltyProgramId, integrationId, endDate, subledgerId, includeTiers, includeProjectedTier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#getLoyaltyBalances");
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
 **loyaltyProgramId** | **Long**| Identifier of the profile-based loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  |
 **integrationId** | **String**| The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier.  |
 **endDate** | **OffsetDateTime**| Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **subledgerId** | **String**| The ID of the subledger by which we filter the data. | [optional]
 **includeTiers** | **Boolean**| Indicates whether tier information is included in the response.  When set to &#x60;true&#x60;, the response includes information about the current tier and the number of points required to move to next tier.  | [optional] [default to false]
 **includeProjectedTier** | **Boolean**| Indicates whether the customer&#39;s projected tier information is included in the response.  When set to &#x60;true&#x60;, the response includes information about the customer&#39;s active points and the name of the projected tier.  **Note** We recommend filtering by &#x60;subledgerId&#x60; for better performance.  | [optional] [default to false]

### Return type cool

[**LoyaltyBalancesWithTiers**](LoyaltyBalancesWithTiers.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## getLoyaltyCardBalances

> LoyaltyCardBalances getLoyaltyCardBalances(loyaltyProgramId, loyaltyCardId, endDate, subledgerId)

Get card&#39;s point balances

Retrieve loyalty balances for the given loyalty card in the specified loyalty program with filtering options applied. If no filtering options are applied, all loyalty balances for the given loyalty card are returned. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
        String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint. 
        OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        List<String> subledgerId = Arrays.asList(); // List<String> | Filter results by one or more subledger IDs. Must be exact match.
        try {
            LoyaltyCardBalances result = apiInstance.getLoyaltyCardBalances(loyaltyProgramId, loyaltyCardId, endDate, subledgerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#getLoyaltyCardBalances");
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
 **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  |
 **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  |
 **endDate** | **OffsetDateTime**| Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **subledgerId** | [**List&lt;String&gt;**](String.md)| Filter results by one or more subledger IDs. Must be exact match. | [optional]

### Return type cool

[**LoyaltyCardBalances**](LoyaltyCardBalances.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## getLoyaltyCardPoints

> InlineResponse2005 getLoyaltyCardPoints(loyaltyProgramId, loyaltyCardId, status, subledgerId, pageSize, skip)

List card&#39;s unused loyalty points

Get paginated results of loyalty points for a given loyalty card identifier in a card-based loyalty program. This endpoint returns only the balances of unused points on a loyalty card.  You can filter points by status: - &#x60;active&#x60;: Points ready to be redeemed. - &#x60;pending&#x60;: Points with a start date in the future. - &#x60;expired&#x60;: Points with an expiration date in the past. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
        String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint. 
        String status = "active"; // String | Filter points based on their status.
        List<String> subledgerId = Arrays.asList(); // List<String> | Filter results by one or more subledger IDs. Must be exact match.
        Long pageSize = 50lL; // Long | The number of items in the response.
        Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
        try {
            InlineResponse2005 result = apiInstance.getLoyaltyCardPoints(loyaltyProgramId, loyaltyCardId, status, subledgerId, pageSize, skip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#getLoyaltyCardPoints");
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
 **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  |
 **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  |
 **status** | **String**| Filter points based on their status. | [optional] [default to active] [enum: active, pending, expired]
 **subledgerId** | [**List&lt;String&gt;**](String.md)| Filter results by one or more subledger IDs. Must be exact match. | [optional]
 **pageSize** | **Long**| The number of items in the response. | [optional] [default to 50l]
 **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional]

### Return type cool

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## getLoyaltyCardTransactions

> InlineResponse2003 getLoyaltyCardTransactions(loyaltyProgramId, loyaltyCardId, subledgerId, loyaltyTransactionType, startDate, endDate, pageSize, skip)

List card&#39;s transactions

Retrieve loyalty transaction logs for the given loyalty card in the specified loyalty program with filtering options applied. If no filtering options are applied, the last 50 loyalty transactions for the given loyalty card are returned. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
        String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint. 
        List<String> subledgerId = Arrays.asList(); // List<String> | Filter results by one or more subledger IDs. Must be exact match.
        String loyaltyTransactionType = "loyaltyTransactionType_example"; // String | Filter results by loyalty transaction type: - `manual`: Loyalty transaction that was done manually. - `session`: Loyalty transaction that resulted from a customer session. - `import`: Loyalty transaction that was imported from a CSV file. 
        OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | Date and time from which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | Date and time by which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        Long pageSize = 50lL; // Long | The number of items in the response.
        Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
        try {
            InlineResponse2003 result = apiInstance.getLoyaltyCardTransactions(loyaltyProgramId, loyaltyCardId, subledgerId, loyaltyTransactionType, startDate, endDate, pageSize, skip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#getLoyaltyCardTransactions");
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
 **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  |
 **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  |
 **subledgerId** | [**List&lt;String&gt;**](String.md)| Filter results by one or more subledger IDs. Must be exact match. | [optional]
 **loyaltyTransactionType** | **String**| Filter results by loyalty transaction type: - &#x60;manual&#x60;: Loyalty transaction that was done manually. - &#x60;session&#x60;: Loyalty transaction that resulted from a customer session. - &#x60;import&#x60;: Loyalty transaction that was imported from a CSV file.  | [optional] [enum: manual, session, import]
 **startDate** | **OffsetDateTime**| Date and time from which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **endDate** | **OffsetDateTime**| Date and time by which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **pageSize** | **Long**| The number of items in the response. | [optional] [default to 50l]
 **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional]

### Return type cool

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## getLoyaltyProgramProfilePoints

> InlineResponse2006 getLoyaltyProgramProfilePoints(loyaltyProgramId, integrationId, status, subledgerId, pageSize, skip)

List customer&#39;s unused loyalty points

Get paginated results of loyalty points for a given Integration ID in the specified profile-based loyalty program. This endpoint returns only the balances of unused points linked to a customer profile.  You can filter points by status: - &#x60;active&#x60;: Points ready to be redeemed. - &#x60;pending&#x60;: Points with a start date in the future. - &#x60;expired&#x60;: Points with an expiration date in the past. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        Long loyaltyProgramId = 56L; // Long | Identifier of the profile-based loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
        String integrationId = "integrationId_example"; // String | The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier. 
        String status = "active"; // String | Filter points based on their status.
        String subledgerId = "subledgerId_example"; // String | The ID of the subledger by which we filter the data.
        Long pageSize = 50lL; // Long | The number of items in the response.
        Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
        try {
            InlineResponse2006 result = apiInstance.getLoyaltyProgramProfilePoints(loyaltyProgramId, integrationId, status, subledgerId, pageSize, skip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#getLoyaltyProgramProfilePoints");
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
 **loyaltyProgramId** | **Long**| Identifier of the profile-based loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  |
 **integrationId** | **String**| The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier.  |
 **status** | **String**| Filter points based on their status. | [optional] [default to active] [enum: active, pending, expired]
 **subledgerId** | **String**| The ID of the subledger by which we filter the data. | [optional]
 **pageSize** | **Long**| The number of items in the response. | [optional] [default to 50l]
 **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional]

### Return type cool

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## getLoyaltyProgramProfileTransactions

> InlineResponse2004 getLoyaltyProgramProfileTransactions(loyaltyProgramId, integrationId, subledgerId, loyaltyTransactionType, startDate, endDate, pageSize, skip)

List customer&#39;s loyalty transactions

Retrieve paginated results of loyalty transaction logs for the given Integration ID in the specified loyalty program.  You can filter transactions by date. If no filters are applied, the last 50 loyalty transactions for the given integration ID are returned.  **Note:** To retrieve all loyalty program transaction logs in a given loyalty program, use the [List loyalty program transactions](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyProgramTransactions) endpoint. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        Long loyaltyProgramId = 56L; // Long | Identifier of the profile-based loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
        String integrationId = "integrationId_example"; // String | The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier. 
        String subledgerId = "subledgerId_example"; // String | The ID of the subledger by which we filter the data.
        String loyaltyTransactionType = "loyaltyTransactionType_example"; // String | Filter results by loyalty transaction type: - `manual`: Loyalty transaction that was done manually. - `session`: Loyalty transaction that resulted from a customer session. - `import`: Loyalty transaction that was imported from a CSV file. 
        OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | Date and time from which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | Date and time by which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        Long pageSize = 50lL; // Long | The number of items in the response.
        Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
        try {
            InlineResponse2004 result = apiInstance.getLoyaltyProgramProfileTransactions(loyaltyProgramId, integrationId, subledgerId, loyaltyTransactionType, startDate, endDate, pageSize, skip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#getLoyaltyProgramProfileTransactions");
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
 **loyaltyProgramId** | **Long**| Identifier of the profile-based loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  |
 **integrationId** | **String**| The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier.  |
 **subledgerId** | **String**| The ID of the subledger by which we filter the data. | [optional]
 **loyaltyTransactionType** | **String**| Filter results by loyalty transaction type: - &#x60;manual&#x60;: Loyalty transaction that was done manually. - &#x60;session&#x60;: Loyalty transaction that resulted from a customer session. - &#x60;import&#x60;: Loyalty transaction that was imported from a CSV file.  | [optional] [enum: manual, session, import]
 **startDate** | **OffsetDateTime**| Date and time from which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **endDate** | **OffsetDateTime**| Date and time by which results are returned. Results are filtered by transaction creation date.  **Note:**  - It must be an RFC3339 timestamp string. - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **pageSize** | **Long**| The number of items in the response. | [optional] [default to 50l]
 **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional]

### Return type cool

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## getReservedCustomers

> InlineResponse200 getReservedCustomers(couponValue)

List customers that have this coupon reserved

Return all customers that have this coupon marked as reserved. This includes hard and soft reservations. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        String couponValue = "couponValue_example"; // String | The code of the coupon.
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
 **couponValue** | **String**| The code of the coupon. |

### Return type cool

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |


## linkLoyaltyCardToProfile

> LoyaltyCard linkLoyaltyCardToProfile(loyaltyProgramId, loyaltyCardId, body)

Link customer profile to card

[Loyalty cards](https://docs.talon.one/docs/product/loyalty-programs/card-based/card-based-overview) allow customers to collect and spend loyalty points within a [card-based loyalty program](https://docs.talon.one/docs/product/loyalty-programs/overview#loyalty-program-types). They are useful to gamify loyalty programs and can be used with or without customer profiles linked to them.  Link a customer profile to a given loyalty card for the card to be set as **Registered**. This affects how it can be used. See the [docs](https://docs.talon.one/docs/product/loyalty-programs/card-based/managing-loyalty-cards#linking-customer-profiles-to-a-loyalty-card).  **Note:** You can link as many customer profiles to a given loyalty card as the [**card user limit**](https://docs.talon.one/docs/product/loyalty-programs/card-based/creating-cb-programs) allows. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        Long loyaltyProgramId = 56L; // Long | Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
        String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint. 
        LoyaltyCardRegistration body = new LoyaltyCardRegistration(); // LoyaltyCardRegistration | body
        try {
            LoyaltyCard result = apiInstance.linkLoyaltyCardToProfile(loyaltyProgramId, loyaltyCardId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#linkLoyaltyCardToProfile");
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
 **loyaltyProgramId** | **Long**| Identifier of the card-based loyalty program containing the loyalty card. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  |
 **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  |
 **body** | [**LoyaltyCardRegistration**](LoyaltyCardRegistration.md)| body |

### Return type cool

[**LoyaltyCard**](LoyaltyCard.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## reopenCustomerSession

> ReopenSessionResponse reopenCustomerSession(customerSessionId)

Reopen customer session

Reopen a closed [customer session](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions). For example, if a session has been completed but still needs to be edited, you can reopen it with this endpoint. A reopen session is treated like a standard open session.  When reopening a session: - The &#x60;talon_session_reopened&#x60; event is triggered. You can see it in the **Events** view in the Campaign Manager. - The session state is updated to &#x60;open&#x60;. - Modified budgets and triggered effects when the session was closed are rolled back except for the list below.  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Effects and budgets unimpacted by a session reopening&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;     &lt;p&gt;The following effects and budgets are left the way they were once the session was originally closed:&lt;/p&gt;     &lt;ul&gt;       &lt;li&gt;Add free item effect&lt;/li&gt;       &lt;li&gt;Any &lt;strong&gt;non-pending&lt;/strong&gt; loyalty points&lt;/li&gt;       &lt;li&gt;Award giveaway&lt;/li&gt;       &lt;li&gt;Coupon and referral creation&lt;/li&gt;       &lt;li&gt;Coupon reservation&lt;/li&gt;       &lt;li&gt;Custom effect&lt;/li&gt;       &lt;li&gt;Update attribute value&lt;/li&gt;       &lt;li&gt;Update cart item attribute value&lt;/li&gt;     &lt;/ul&gt;   &lt;/div&gt; &lt;p&gt;To see an example of roll back, see the &lt;a href&#x3D;\&quot;https://docs.talon.one/docs/dev/tutorials/rolling-back-effects\&quot;&gt;Cancelling a session with campaign budgets tutorial&lt;/a&gt;.&lt;/p&gt; &lt;/details&gt;  **Note:** If your order workflow requires you to create a new session instead of reopening a session, use the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint to cancel a closed session and create a new one. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        String customerSessionId = "customerSessionId_example"; // String | The `integration ID` of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager's **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#operation/getApplicationSessions) endpoint. 
        try {
            ReopenSessionResponse result = apiInstance.reopenCustomerSession(customerSessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#reopenCustomerSession");
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
 **customerSessionId** | **String**| The &#x60;integration ID&#x60; of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager&#39;s **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#operation/getApplicationSessions) endpoint.  |

### Return type cool

[**ReopenSessionResponse**](ReopenSessionResponse.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |


## returnCartItems

> IntegrationStateV2 returnCartItems(customerSessionId, body, dry)

Return cart items

Create a new return request for the specified cart items.  This endpoint automatically changes the session state from &#x60;closed&#x60; to &#x60;partially_returned&#x60;.  **Note:** This will roll back any effects associated with these cart items. For more information, see [our documentation on session states](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions#customer-session-states) and [this tutorial](https://docs.talon.one/docs/dev/tutorials/partially-returning-a-session). 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        String customerSessionId = "customerSessionId_example"; // String | The `integration ID` of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager's **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#operation/getApplicationSessions) endpoint. 
        ReturnIntegrationRequest body = new ReturnIntegrationRequest(); // ReturnIntegrationRequest | body
        Boolean dry = true; // Boolean | Indicates whether to persist the changes. Changes are ignored when `dry=true`. 
        try {
            IntegrationStateV2 result = apiInstance.returnCartItems(customerSessionId, body, dry);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#returnCartItems");
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
 **customerSessionId** | **String**| The &#x60;integration ID&#x60; of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager&#39;s **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#operation/getApplicationSessions) endpoint.  |
 **body** | [**ReturnIntegrationRequest**](ReturnIntegrationRequest.md)| body |
 **dry** | **Boolean**| Indicates whether to persist the changes. Changes are ignored when &#x60;dry&#x3D;true&#x60;.  | [optional]

### Return type cool

[**IntegrationStateV2**](IntegrationStateV2.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |


## syncCatalog

> Catalog syncCatalog(catalogId, body)

Sync cart item catalog

Perform the following actions for a given cart item catalog:  - Add an item to the catalog. - Add multiple items to the catalog. - Update the attributes of an item in the catalog. - Update the attributes of multiple items in the catalog. - Remove an item from the catalog. - Remove multiple items from the catalog.  You can either add, update, or delete up to 1000 cart items in a single request. Each item synced to a catalog must have a unique &#x60;SKU&#x60;.  **Important**: You can perform only one type of action in a single sync request. Syncing items with duplicate &#x60;SKU&#x60; values in a single request returns an error message with a &#x60;400&#x60; status code.  For more information, read [managing cart item catalogs](https://docs.talon.one/docs/product/account/dev-tools/managing-cart-item-catalogs).  ### Filtering cart items  Use [cart item attributes](https://docs.talon.one/docs/product/account/dev-tools/managing-attributes) to filter items and select the ones you want to edit or delete when editing or deleting more than one item at a time.  The &#x60;filters&#x60; array contains an object with the following properties:  - &#x60;attr&#x60;: A [cart item attribute](https://docs.talon.one/docs/product/account/dev-tools/managing-attributes)   connected to the catalog. It is applied to all items in the catalog. - &#x60;op&#x60;: The filtering operator indicating the relationship between the value of each   cart item in the catalog and the value of the &#x60;value&#x60; property for the attribute selected   in &#x60;attr&#x60;.    The value of &#x60;op&#x60; can be one of the following:    - &#x60;EQ&#x60;: Equal to &#x60;value&#x60;   - &#x60;LT&#x60;: Less than &#x60;value&#x60;   - &#x60;LE&#x60;: Less than or equal to &#x60;value&#x60;   - &#x60;GT&#x60;: Greater than &#x60;value&#x60;   - &#x60;GE&#x60;: Greater than or equal to &#x60;value&#x60;   - &#x60;IN&#x60;: One of the comma-separated values that &#x60;value&#x60; is set to.    **Note:** &#x60;GE&#x60;, &#x60;LE&#x60;, &#x60;GT&#x60;, &#x60;LT&#x60; are for numeric values only.  - &#x60;value&#x60;: The value of the attribute selected in &#x60;attr&#x60;.  ### Payload examples  Synchronization actions are sent as &#x60;PUT&#x60; requests. See the structure for each action:  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Adding an item to the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;attributes\&quot;: {             \&quot;color\&quot;: \&quot;Navy blue\&quot;,             \&quot;type\&quot;: \&quot;shoes\&quot;           },           \&quot;replaceIfExists\&quot;: true,           \&quot;sku\&quot;: \&quot;SKU1241028\&quot;,           \&quot;price\&quot;: 100,           \&quot;product\&quot;: {             \&quot;name\&quot;: \&quot;sneakers\&quot;           }         },         \&quot;type\&quot;: \&quot;ADD\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Adding multiple items to the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;attributes\&quot;: {             \&quot;color\&quot;: \&quot;Navy blue\&quot;,             \&quot;type\&quot;: \&quot;shoes\&quot;           },           \&quot;replaceIfExists\&quot;: true,           \&quot;sku\&quot;: \&quot;SKU1241027\&quot;,           \&quot;price\&quot;: 100,           \&quot;product\&quot;: {             \&quot;name\&quot;: \&quot;sneakers\&quot;           }         },         \&quot;type\&quot;: \&quot;ADD\&quot;       },       {         \&quot;payload\&quot;: {           \&quot;attributes\&quot;: {             \&quot;color\&quot;: \&quot;Navy blue\&quot;,             \&quot;type\&quot;: \&quot;shoes\&quot;           },           \&quot;replaceIfExists\&quot;: true,           \&quot;sku\&quot;: \&quot;SKU1241028\&quot;,           \&quot;price\&quot;: 100,           \&quot;product\&quot;: {             \&quot;name\&quot;: \&quot;sneakers\&quot;           }         },         \&quot;type\&quot;: \&quot;ADD\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Updating the attributes of an item in the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;attributes\&quot;: {             \&quot;age\&quot;: 11,             \&quot;origin\&quot;: \&quot;germany\&quot;           },           \&quot;createIfNotExists\&quot;: false,           \&quot;sku\&quot;: \&quot;SKU1241028\&quot;,           \&quot;product\&quot;: {             \&quot;name\&quot;: \&quot;sneakers\&quot;           }         },         \&quot;type\&quot;: \&quot;PATCH\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Updating the attributes of multiple items in the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;attributes\&quot;: {             \&quot;color\&quot;: \&quot;red\&quot;           },           \&quot;filters\&quot;: [             {               \&quot;attr\&quot;: \&quot;color\&quot;,               \&quot;op\&quot;: \&quot;EQ\&quot;,               \&quot;value\&quot;: \&quot;blue\&quot;             }           ]         },         \&quot;type\&quot;: \&quot;PATCH_MANY\&quot;       }     ]   }   &#x60;&#x60;&#x60;    &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Removing an item from the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;sku\&quot;: \&quot;SKU1241028\&quot;         },         \&quot;type\&quot;: \&quot;REMOVE\&quot;       }     ]   }   &#x60;&#x60;&#x60;    &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Removing multiple items from the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;filters\&quot;: [             {               \&quot;attr\&quot;: \&quot;color\&quot;,               \&quot;op\&quot;: \&quot;EQ\&quot;,               \&quot;value\&quot;: \&quot;blue\&quot;             }           ]         },         \&quot;type\&quot;: \&quot;REMOVE_MANY\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Removing shoes of sizes above 45 from the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;   &lt;p&gt;   Let&#39;s imagine that we have a shoe store and we have decided to stop selling   shoes larger than size 45. We can remove from the catalog all the shoes of sizes above 45   with a single action:&lt;/p&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;filters\&quot;: [             {               \&quot;attr\&quot;: \&quot;size\&quot;,               \&quot;op\&quot;: \&quot;GT\&quot;,               \&quot;value\&quot;: \&quot;45\&quot;             }           ]         },         \&quot;type\&quot;: \&quot;REMOVE_MANY\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt; 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        Long catalogId = 56L; // Long | The ID of the catalog. You can find the ID in the Campaign Manager in **Account** > **Tools** > **Cart item catalogs**.
        CatalogSyncRequest body = new CatalogSyncRequest(); // CatalogSyncRequest | body
        try {
            Catalog result = apiInstance.syncCatalog(catalogId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#syncCatalog");
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
 **catalogId** | **Long**| The ID of the catalog. You can find the ID in the Campaign Manager in **Account** &gt; **Tools** &gt; **Cart item catalogs**. |
 **body** | [**CatalogSyncRequest**](CatalogSyncRequest.md)| body |

### Return type cool

[**Catalog**](Catalog.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |


## trackEventV2

> TrackEventV2Response trackEventV2(body, silent, dry, forceCompleteEvaluation)

Track event

Triggers a custom event.  To use this endpoint: 1. Define a [custom event](https://docs.talon.one/docs/dev/concepts/entities/events#creating-a-custom-event) in the Campaign Manager. 1. Update or create a rule to check for this event. 1. Trigger the event with this endpoint. After you have successfully sent an event to Talon.One, you can list the received events in the **Events** view in the Campaign Manager.  Talon.One also offers a set of [built-in events](https://docs.talon.one/docs/dev/concepts/entities/events). Ensure you do not create a custom event when you can use a built-in event.  For example, use this endpoint to trigger an event when a customer shares a link to a product. See the [tutorial](https://docs.talon.one/docs/product/tutorials/referrals/incentivizing-product-link-sharing).  &lt;div class&#x3D;\&quot;redoc-section\&quot;&gt;    &lt;p class&#x3D;\&quot;title\&quot;&gt;Important&lt;/p&gt;    1. &#x60;profileId&#x60; is required even though the schema does not specify it.   1. If the customer profile ID is new, a new profile is automatically created but the &#x60;customer_profile_created&#x60; [built-in event ](https://docs.talon.one/docs/dev/concepts/entities/events) is **not** triggered.   1. We recommend sending requests sequentially. See [Managing parallel requests](https://docs.talon.one/docs/dev/getting-started/integration-tutorial#managing-parallel-requests).   1. [Archived campaigns](https://docs.talon.one/docs/product/campaigns/managing-campaigns#archiving-a-campaign) are not considered in rule evaluation.  &lt;/div&gt; 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        IntegrationEventV2Request body = new IntegrationEventV2Request(); // IntegrationEventV2Request | body
        String silent = "\"yes\""; // String | Possible values: `yes` or `no`. - `yes`: Increases the performance of the API call by returning a 204 response. - `no`: Returns a 200 response that contains the updated customer profiles. 
        Boolean dry = true; // Boolean | Indicates whether to persist the changes. Changes are ignored when `dry=true`. 
        Boolean forceCompleteEvaluation = false; // Boolean | Forces evaluation for all matching campaigns regardless of the [campaign evaluation mode](https://docs.talon.one/docs/product/applications/managing-campaign-evaluation#setting-campaign-evaluation-mode). Requires `dry=true`. 
        try {
            TrackEventV2Response result = apiInstance.trackEventV2(body, silent, dry, forceCompleteEvaluation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#trackEventV2");
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
 **body** | [**IntegrationEventV2Request**](IntegrationEventV2Request.md)| body |
 **silent** | **String**| Possible values: &#x60;yes&#x60; or &#x60;no&#x60;. - &#x60;yes&#x60;: Increases the performance of the API call by returning a 204 response. - &#x60;no&#x60;: Returns a 200 response that contains the updated customer profiles.  | [optional] [default to &quot;yes&quot;]
 **dry** | **Boolean**| Indicates whether to persist the changes. Changes are ignored when &#x60;dry&#x3D;true&#x60;.  | [optional]
 **forceCompleteEvaluation** | **Boolean**| Forces evaluation for all matching campaigns regardless of the [campaign evaluation mode](https://docs.talon.one/docs/product/applications/managing-campaign-evaluation#setting-campaign-evaluation-mode). Requires &#x60;dry&#x3D;true&#x60;.  | [optional] [default to false]

### Return type cool

[**TrackEventV2Response**](TrackEventV2Response.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **409** | Too many requests or limit reached - Avoid parallel requests. See the [docs](https://docs.talon.one/docs/dev/tutorials/integrating-talon-one#managing-parallel-requests). |  -  |


## updateAudienceCustomersAttributes

> updateAudienceCustomersAttributes(audienceId, body)

Update profile attributes for all customers in audience

Update the specified profile attributes to the provided values for all customers in the specified audience. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        Long audienceId = 56L; // Long | The ID of the audience.
        Object body = null; // Object | body
        try {
            apiInstance.updateAudienceCustomersAttributes(audienceId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#updateAudienceCustomersAttributes");
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
 **audienceId** | **Long**| The ID of the audience. |
 **body** | **Object**| body |

### Return type cool

null (empty response body)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## updateAudienceV2

> Audience updateAudienceV2(audienceId, body)

Update audience name

Update the name of the given audience created by a third-party integration. Sending a request to this endpoint does **not** trigger the Rule Engine.  To update the audience&#39;s members, use the [Update customer profile](#tag/Customer-profiles/operation/updateCustomerProfileV2) endpoint. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        Long audienceId = 56L; // Long | The ID of the audience.
        UpdateAudience body = new UpdateAudience(); // UpdateAudience | body
        try {
            Audience result = apiInstance.updateAudienceV2(audienceId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#updateAudienceV2");
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
 **audienceId** | **Long**| The ID of the audience. |
 **body** | [**UpdateAudience**](UpdateAudience.md)| body |

### Return type cool

[**Audience**](Audience.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## updateCustomerProfileAudiences

> updateCustomerProfileAudiences(body)

Update multiple customer profiles&#39; audiences

Add customer profiles to or remove them from an audience.  The endpoint supports 1000 audience actions (&#x60;add&#x60; or &#x60;remove&#x60;) per request.  **Note:** You can also do this using the [Update audience](https://docs.talon.one/docs/product/rules/effects/using-effects#updating-an-audience) effect. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        CustomerProfileAudienceRequest body = new CustomerProfileAudienceRequest(); // CustomerProfileAudienceRequest | body
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
 **body** | [**CustomerProfileAudienceRequest**](CustomerProfileAudienceRequest.md)| body |

### Return type cool

null (empty response body)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## updateCustomerProfileV2

> CustomerProfileIntegrationResponseV2 updateCustomerProfileV2(integrationId, body, runRuleEngine, dry)

Update customer profile

Update or create a [Customer Profile](https://docs.talon.one/docs/dev/concepts/entities/customer-profiles). This endpoint triggers the Rule Builder.  You can use this endpoint to: - Set attributes on the given customer profile. Ensure you create the attributes in the Campaign Manager, first. - Modify the audience the customer profile is a member of. **Note:** [Archived campaigns](https://docs.talon.one/docs/product/campaigns/managing-campaigns#archiving-a-campaign) are not considered in rule evaluation when &#x60;runRuleEngine&#x60; is &#x60;true&#x60;. &lt;div class&#x3D;\&quot;redoc-section\&quot;&gt;   &lt;p class&#x3D;\&quot;title\&quot;&gt;Performance tips&lt;/p&gt;    - Updating a customer profile returns a response with the requested integration state.   - You can use the &#x60;responseContent&#x60; property to save yourself extra API calls. For example, you can get     the customer profile details directly without extra requests.   - We recommend sending requests sequentially.     See [Managing parallel requests](https://docs.talon.one/docs/dev/getting-started/integration-tutorial#managing-parallel-requests). &lt;/div&gt; 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        String integrationId = "integrationId_example"; // String | The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier. 
        CustomerProfileIntegrationRequestV2 body = new CustomerProfileIntegrationRequestV2(); // CustomerProfileIntegrationRequestV2 | body
        Boolean runRuleEngine = false; // Boolean | Indicates whether to run the Rule Engine.  If `true`, the response includes: - The effects generated by the triggered campaigns are returned in the `effects` property. - The created coupons and referral objects.  If `false`: - The rules are not executed and the `effects` property is always empty. - The response time improves. - You cannot use `responseContent` in the body. 
        Boolean dry = true; // Boolean | (Only works when `runRuleEngine=true`) Indicates whether to persist the changes. Changes are ignored when `dry=true`.  When set to `true`, you can use the `evaluableCampaignIds` body property to select specific campaigns to run. 
        try {
            CustomerProfileIntegrationResponseV2 result = apiInstance.updateCustomerProfileV2(integrationId, body, runRuleEngine, dry);
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
 **integrationId** | **String**| The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier.  |
 **body** | [**CustomerProfileIntegrationRequestV2**](CustomerProfileIntegrationRequestV2.md)| body |
 **runRuleEngine** | **Boolean**| Indicates whether to run the Rule Engine.  If &#x60;true&#x60;, the response includes: - The effects generated by the triggered campaigns are returned in the &#x60;effects&#x60; property. - The created coupons and referral objects.  If &#x60;false&#x60;: - The rules are not executed and the &#x60;effects&#x60; property is always empty. - The response time improves. - You cannot use &#x60;responseContent&#x60; in the body.  | [optional] [default to false]
 **dry** | **Boolean**| (Only works when &#x60;runRuleEngine&#x3D;true&#x60;) Indicates whether to persist the changes. Changes are ignored when &#x60;dry&#x3D;true&#x60;.  When set to &#x60;true&#x60;, you can use the &#x60;evaluableCampaignIds&#x60; body property to select specific campaigns to run.  | [optional]

### Return type cool

[**CustomerProfileIntegrationResponseV2**](CustomerProfileIntegrationResponseV2.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **409** | Too many requests or limit reached - Avoid parallel requests. See the [docs](https://docs.talon.one/docs/dev/tutorials/integrating-talon-one#managing-parallel-requests). |  -  |


## updateCustomerProfilesV2

> MultipleCustomerProfileIntegrationResponseV2 updateCustomerProfilesV2(body, silent)

Update multiple customer profiles

Update (or create) up to 1000 [customer profiles](https://docs.talon.one/docs/dev/concepts/entities/customer-profiles) in 1 request.  The &#x60;integrationId&#x60; must be any identifier that remains stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  A customer profile [can be linked to one or more sessions](https://docs.talon.one/integration-api#tag/Customer-sessions).  **Note:** This endpoint does not trigger the Rule Engine. To trigger the Rule Engine for customer profile updates, use the [Update customer profile](#tag/Customer-profiles/operation/updateCustomerProfileV2) endpoint. 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        MultipleCustomerProfileIntegrationRequest body = new MultipleCustomerProfileIntegrationRequest(); // MultipleCustomerProfileIntegrationRequest | body
        String silent = "\"yes\""; // String | Possible values: `yes` or `no`. - `yes`: Increases the performance of the API call by returning a 204 response. - `no`: Returns a 200 response that contains the updated customer profiles. 
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
 **body** | [**MultipleCustomerProfileIntegrationRequest**](MultipleCustomerProfileIntegrationRequest.md)| body |
 **silent** | **String**| Possible values: &#x60;yes&#x60; or &#x60;no&#x60;. - &#x60;yes&#x60;: Increases the performance of the API call by returning a 204 response. - &#x60;no&#x60;: Returns a 200 response that contains the updated customer profiles.  | [optional] [default to &quot;yes&quot;]

### Return type cool

[**MultipleCustomerProfileIntegrationResponseV2**](MultipleCustomerProfileIntegrationResponseV2.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |


## updateCustomerSessionV2

> IntegrationStateV2 updateCustomerSessionV2(customerSessionId, body, dry, now)

Update customer session

Update or create a [customer session](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions). The endpoint responds with the potential promotion rule [effects](https://docs.talon.one/docs/dev/integration-api/api-effects) that match the current cart. For example, use this endpoint to share the contents of a customer&#39;s cart with Talon.One.  **Note:**  - The currency for the session and the cart items in it is the currency set for the Application linked to this session. - [Archived campaigns](https://docs.talon.one/docs/product/campaigns/managing-campaigns#archiving-a-campaign) are not considered for rule evaluation.  ### Session management  To use this endpoint, start by learning about [customer sessions](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions) and their states and refer to the &#x60;state&#x60; parameter documentation the request body schema docs below.  ### Sessions and customer profiles  - To link a session to a customer profile, set the &#x60;profileId&#x60; parameter in the request body to a customer profile&#39;s &#x60;integrationId&#x60;. - While you can create an anonymous session with &#x60;profileId&#x3D;\&quot;\&quot;&#x60;, we recommend you use a guest ID instead. - A profile can be linked to simultaneous sessions in different Applications. Either:   - Use unique session integration IDs or,   - Use the same session integration ID across all of the Applications.  **Note:** If the specified profile does not exist, an empty profile is **created automatically**.   You can update it with [Update customer profile](https://docs.talon.one/integration-api#tag/Customer-profiles/operation/updateCustomerProfileV2).  &lt;div class&#x3D;\&quot;redoc-section\&quot;&gt;   &lt;p class&#x3D;\&quot;title\&quot;&gt;Performance tips&lt;/p&gt;    - Updating a customer session returns a response with the new integration state. Use the &#x60;responseContent&#x60; property to save yourself extra API calls.     For example, you can get the customer profile details directly without extra requests.   - We recommend sending requests sequentially. See [Managing parallel requests](https://docs.talon.one/docs/dev/getting-started/integration-tutorial#managing-parallel-requests). &lt;/div&gt;  For more information, see: - The introductory video in [Getting started](https://docs.talon.one/docs/dev/getting-started/overview). - The [integration tutorial](https://docs.talon.one/docs/dev/tutorials/integrating-talon-one). 

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
        defaultClient.setBasePath("https://yourbaseurl.talon.one");
        
        // Configure API key authorization: api_key_v1
        ApiKeyAuth api_key_v1 = (ApiKeyAuth) defaultClient.getAuthentication("api_key_v1");
        api_key_v1.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_v1.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        String customerSessionId = "customerSessionId_example"; // String | The `integration ID` of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager's **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#operation/getApplicationSessions) endpoint. 
        IntegrationRequest body = new IntegrationRequest(); // IntegrationRequest | body
        Boolean dry = true; // Boolean | Indicates whether to persist the changes. Changes are ignored when `dry=true`.  When set to `true`: - The endpoint considers **only** the payload that you pass when **closing** the session.   When you do not use the `dry` parameter, the endpoint behaves as a typical PUT endpoint. Each update builds upon the previous ones. - You can use the `evaluableCampaignIds` body property to select specific campaigns to run.  [See the docs](https://docs.talon.one/docs/dev/integration-api/dry-requests). 
        OffsetDateTime now = new OffsetDateTime(); // OffsetDateTime | A timestamp value of a future date that acts as a current date when included in the query.  Use this parameter, for example, to test campaigns that would be evaluated for this customer session in the future (say, [scheduled campaigns](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-schedule)).  **Note:**  - It must be an RFC3339 timestamp string. - It can **only** be a date in the future. - It can **only** be used if the `dry` parameter in the query is set to `true`. 
        try {
            IntegrationStateV2 result = apiInstance.updateCustomerSessionV2(customerSessionId, body, dry, now);
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
 **customerSessionId** | **String**| The &#x60;integration ID&#x60; of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager&#39;s **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#operation/getApplicationSessions) endpoint.  |
 **body** | [**IntegrationRequest**](IntegrationRequest.md)| body |
 **dry** | **Boolean**| Indicates whether to persist the changes. Changes are ignored when &#x60;dry&#x3D;true&#x60;.  When set to &#x60;true&#x60;: - The endpoint considers **only** the payload that you pass when **closing** the session.   When you do not use the &#x60;dry&#x60; parameter, the endpoint behaves as a typical PUT endpoint. Each update builds upon the previous ones. - You can use the &#x60;evaluableCampaignIds&#x60; body property to select specific campaigns to run.  [See the docs](https://docs.talon.one/docs/dev/integration-api/dry-requests).  | [optional]
 **now** | **OffsetDateTime**| A timestamp value of a future date that acts as a current date when included in the query.  Use this parameter, for example, to test campaigns that would be evaluated for this customer session in the future (say, [scheduled campaigns](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-schedule)).  **Note:**  - It must be an RFC3339 timestamp string. - It can **only** be a date in the future. - It can **only** be used if the &#x60;dry&#x60; parameter in the query is set to &#x60;true&#x60;.  | [optional]

### Return type cool

[**IntegrationStateV2**](IntegrationStateV2.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **409** | Too many requests or limit reached - Avoid parallel requests. See the [docs](https://docs.talon.one/docs/dev/tutorials/integrating-talon-one#managing-parallel-requests). |  -  |

