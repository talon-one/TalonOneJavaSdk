# IntegrationApi

All URLs are relative to `https://yourbaseurl.talon.one`.

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateLoyaltyPoints**](IntegrationApi.md#activateLoyaltyPoints) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/activate_points | Activate loyalty points
[**bestPriorPrice**](IntegrationApi.md#bestPriorPrice) | **POST** /v1/best_prior_price | Fetch best prior price
[**createAudienceV2**](IntegrationApi.md#createAudienceV2) | **POST** /v2/audiences | Create audience
[**createCouponReservation**](IntegrationApi.md#createCouponReservation) | **POST** /v1/coupon_reservations/{couponValue} | Create coupon reservation
[**createReferral**](IntegrationApi.md#createReferral) | **POST** /v1/referrals | Create referral code for an advocate
[**createReferralsForMultipleAdvocates**](IntegrationApi.md#createReferralsForMultipleAdvocates) | **POST** /v1/referrals_for_multiple_advocates | Create referral codes for multiple advocates
[**deleteAudienceMembershipsV2**](IntegrationApi.md#deleteAudienceMembershipsV2) | **DELETE** /v2/audiences/{audienceId}/memberships | Delete audience memberships
[**deleteAudienceV2**](IntegrationApi.md#deleteAudienceV2) | **DELETE** /v2/audiences/{audienceId} | Delete audience
[**deleteCouponReservation**](IntegrationApi.md#deleteCouponReservation) | **DELETE** /v1/coupon_reservations/{couponValue} | Delete coupon reservations
[**deleteCustomerData**](IntegrationApi.md#deleteCustomerData) | **DELETE** /v1/customer_data/{integrationId} | Delete customer&#39;s personal data
[**deleteLoyaltyTransactionsFromLedgers**](IntegrationApi.md#deleteLoyaltyTransactionsFromLedgers) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/delete_transactions | Delete customer&#39;s transactions from loyalty ledgers
[**generateLoyaltyCard**](IntegrationApi.md#generateLoyaltyCard) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/cards | Generate loyalty card
[**getCustomerAchievementHistory**](IntegrationApi.md#getCustomerAchievementHistory) | **GET** /v1/customer_profiles/{integrationId}/achievements/{achievementId} | List customer&#39;s achievement history
[**getCustomerAchievements**](IntegrationApi.md#getCustomerAchievements) | **GET** /v1/customer_profiles/{integrationId}/achievements | List customer&#39;s available achievements
[**getCustomerInventory**](IntegrationApi.md#getCustomerInventory) | **GET** /v1/customer_profiles/{integrationId}/inventory | List customer data
[**getCustomerSession**](IntegrationApi.md#getCustomerSession) | **GET** /v2/customer_sessions/{customerSessionId} | Get customer session
[**getEventV3**](IntegrationApi.md#getEventV3) | **GET** /v3/events/{integrationId} | Get advanced event
[**getLoyaltyBalances**](IntegrationApi.md#getLoyaltyBalances) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/balances | Get customer&#39;s loyalty balances
[**getLoyaltyCardBalances**](IntegrationApi.md#getLoyaltyCardBalances) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/balances | Get card&#39;s point balances
[**getLoyaltyCardPoints**](IntegrationApi.md#getLoyaltyCardPoints) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/points | List card&#39;s unused loyalty points
[**getLoyaltyCardTransactions**](IntegrationApi.md#getLoyaltyCardTransactions) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/transactions | List card&#39;s transactions
[**getLoyaltyProgramProfilePoints**](IntegrationApi.md#getLoyaltyProgramProfilePoints) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/points | List customer&#39;s unused loyalty points
[**getLoyaltyProgramProfileTransactions**](IntegrationApi.md#getLoyaltyProgramProfileTransactions) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/transactions | List customer&#39;s loyalty transactions
[**getReservedCustomers**](IntegrationApi.md#getReservedCustomers) | **GET** /v1/coupon_reservations/customerprofiles/{couponValue} | List customers that have this coupon reserved
[**integrationGetAllCampaigns**](IntegrationApi.md#integrationGetAllCampaigns) | **GET** /v1/integration/campaigns | List all running campaigns
[**integrationRewardsCatalog**](IntegrationApi.md#integrationRewardsCatalog) | **GET** /v1/rewards/catalog | List rewards in the catalog
[**joinLoyaltyProgram**](IntegrationApi.md#joinLoyaltyProgram) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/join | Join customer profile to loyalty program
[**linkLoyaltyCardToProfile**](IntegrationApi.md#linkLoyaltyCardToProfile) | **POST** /v2/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/link_profile | Link customer profile to card
[**reopenCustomerSession**](IntegrationApi.md#reopenCustomerSession) | **PUT** /v2/customer_sessions/{customerSessionId}/reopen | Reopen customer session
[**returnCartItems**](IntegrationApi.md#returnCartItems) | **POST** /v2/customer_sessions/{customerSessionId}/returns | Return cart items
[**syncCatalog**](IntegrationApi.md#syncCatalog) | **PUT** /v1/catalogs/{catalogId}/sync | Sync cart item catalog
[**trackEventV2**](IntegrationApi.md#trackEventV2) | **POST** /v2/events | Track event
[**trackEventV3**](IntegrationApi.md#trackEventV3) | **POST** /v3/events | Track advanced event
[**unlinkLoyaltyCardFromProfile**](IntegrationApi.md#unlinkLoyaltyCardFromProfile) | **POST** /v2/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/unlink_profile | Unlink customer profile from a loyalty card
[**unlockReward**](IntegrationApi.md#unlockReward) | **POST** /v1/rewards/{rewardId}/unlock | Unlock a reward
[**updateAudienceCustomersAttributes**](IntegrationApi.md#updateAudienceCustomersAttributes) | **PUT** /v2/audience_customers/{audienceId}/attributes | Update profile attributes for all customers in audience
[**updateAudienceV2**](IntegrationApi.md#updateAudienceV2) | **PUT** /v2/audiences/{audienceId} | Update audience name
[**updateCustomerProfileAudiences**](IntegrationApi.md#updateCustomerProfileAudiences) | **POST** /v2/customer_audiences | Update multiple customer profiles&#39; audiences
[**updateCustomerProfileV2**](IntegrationApi.md#updateCustomerProfileV2) | **PUT** /v2/customer_profiles/{integrationId} | Update customer profile
[**updateCustomerProfilesV2**](IntegrationApi.md#updateCustomerProfilesV2) | **PUT** /v2/customer_profiles | Update multiple customer profiles
[**updateCustomerSessionV2**](IntegrationApi.md#updateCustomerSessionV2) | **PUT** /v2/customer_sessions/{customerSessionId} | Update customer session



## activateLoyaltyPoints

> ActivateLoyaltyPointsResponse activateLoyaltyPoints(loyaltyProgramId, body)

Activate loyalty points

Activate points when a defined action occurs.  You can activate pending points using one of the following parameters: - &#x60;sessionId&#x60;: Activates all points earned in the specified session.  - &#x60;transactionUUIDs&#x60;: Activates points earned in the transactions specified by the  given UUIDs.  

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
        Long loyaltyProgramId = 56L; // Long | The identifier for the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
        ActivateLoyaltyPoints body = new ActivateLoyaltyPoints(); // ActivateLoyaltyPoints | body
        try {
            ActivateLoyaltyPointsResponse result = apiInstance.activateLoyaltyPoints(loyaltyProgramId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#activateLoyaltyPoints");
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
 **loyaltyProgramId** | **Long**| The identifier for the loyalty program. You can get the ID with the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  |
 **body** | [**ActivateLoyaltyPoints**](ActivateLoyaltyPoints.md)| body |

### Return type cool

[**ActivateLoyaltyPointsResponse**](ActivateLoyaltyPointsResponse.md)

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


## bestPriorPrice

> List&lt;BestPriorPrice&gt; bestPriorPrice(body)

Fetch best prior price

Returns the best prior price based on historical pricing data for the specified SKUs within a defined timeframe. 

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

        // Configure API key authorization: management_key
        ApiKeyAuth management_key = (ApiKeyAuth) defaultClient.getAuthentication("management_key");
        management_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //management_key.setApiKeyPrefix("Token");

        // Configure API key authorization: manager_auth
        ApiKeyAuth manager_auth = (ApiKeyAuth) defaultClient.getAuthentication("manager_auth");
        manager_auth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //manager_auth.setApiKeyPrefix("Token");

        IntegrationApi apiInstance = new IntegrationApi(defaultClient);
        BestPriorPriceRequest body = new BestPriorPriceRequest(); // BestPriorPriceRequest | body
        try {
            List<BestPriorPrice> result = apiInstance.bestPriorPrice(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#bestPriorPrice");
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
 **body** | [**BestPriorPriceRequest**](BestPriorPriceRequest.md)| body |

### Return type cool

[**List&lt;BestPriorPrice&gt;**](BestPriorPrice.md)

### Authorization

[api_key_v1](../README.md#api_key_v1), [management_key](../README.md#management_key), [manager_auth](../README.md#manager_auth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


## createAudienceV2

> Audience createAudienceV2(body)

Create audience

Create an audience. The audience can be created directly from scratch or can come from third party platforms.  &gt; [!note] Audiences can also be created from scratch via the Campaign Manager. See the [docs](https://docs.talon.one/docs/product/audiences/creating-audiences).  To create an audience from an existing audience from a [technology partner](https://docs.talon.one/docs/dev/technology-partners/overview):  1. Set the &#x60;integration&#x60; property to &#x60;mparticle&#x60;, &#x60;segment&#x60; etc., depending on a third-party platform. 1. Set &#x60;integrationId&#x60; to the ID of this audience in a third-party platform.  To create an audience from an existing audience in another platform:  1. Do not use the &#x60;integration&#x60; property. 1. Set &#x60;integrationId&#x60; to the ID of this audience in the 3rd-party platform.  To create an audience from scratch, only set the &#x60;name&#x60; property.  Once you create your first audience, audience-specific rule conditions are enabled in the Rule Builder. 

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

Create a coupon reservation for the specified customer profiles on the specified coupon.  You can also create a reservation via the Campaign Manager using the [Create coupon code reservation](https://docs.talon.one/docs/product/rules/effects/using-effects#reserving-a-coupon-code) effect.  &gt; [!note] **Note** &gt; - If the **Reservation mandatory** option was selected when creating the &gt;   specified coupon, the endpoint creates a **hard** reservation, meaning only users who have &gt;   this coupon code reserved can redeem it. &gt; &gt;   Otherwise, the endpoint creates a **soft** reservation, meaning the coupon &gt;   is associated with the specified customer profiles (they show up when using &gt;   the [List customer data](https://docs.talon.one/integration-api#tag/Customer-profiles/operation/getCustomerInventory) &gt;   endpoint), but any user can redeem it. &gt; &gt;   This can be useful, for example, to display a _coupon wallet_ for customers &gt;   when they visit your store. &gt; - If the **Coupon visibility** option was selected when creating the &gt;   specified coupon, the coupon code is implicitly soft-reserved for all customers, and the code &gt;   will be returned for all customer profiles in the [List customer &gt;   data](https://docs.talon.one/integration-api#tag/Customer-profiles/operation/getCustomerInventory) endpoint. &gt; - This endpoint overrides the coupon reservation limit set when &gt;   [the coupon is created](https://docs.talon.one/docs/product/campaigns/coupons/creating-coupons).  To ensure that coupons cannot be reserved after the reservation limit is reached, use the [Create coupon code reservation](https://docs.talon.one/docs/product/rules/effects/using-effects#reserving-a-coupon-code) effect in the Rule Builder and the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint.  To delete a reservation, use the [Delete reservation](https://docs.talon.one/integration-api#tag/Coupons/operation/deleteCouponReservation) endpoint. 

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
        String couponValue = "couponValue_example"; // String | The code of the coupon.  **Important:** The coupon code requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode `SUMMER25%OFF` as `SUMMER25%25OFF`. 
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
 **couponValue** | **String**| The code of the coupon.  **Important:** The coupon code requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode &#x60;SUMMER25%OFF&#x60; as &#x60;SUMMER25%25OFF&#x60;.  |
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

Creates a referral code for an advocate. The code will be valid for the referral campaign for which is created, indicated in the &#x60;campaignId&#x60; parameter, and will be associated with the profile specified in the &#x60;advocateProfileIntegrationId&#x60; parameter as the advocate&#39;s profile.  &gt; [!note] Any [referral limits](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets#referral-limits) &gt; set are ignored when you use this endpoint. 

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

Creates unique referral codes for multiple advocates. The code will be valid for the referral campaign for which it is created, indicated in the &#x60;campaignId&#x60; parameter, and one referral code will be associated with one advocate using the profile specified in the &#x60;advocateProfileIntegrationId&#x60; parameter as the advocate&#39;s profile.  &gt; [!note] Any [referral limits](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets#referral-limits) &gt; set are ignored when you use this endpoint. 

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

Delete an audience.  &gt; [!warning] This endpoint also removes any associations recorded between a customer profile and this audience.  &gt; [!note] Audiences can also be deleted via the Campaign Manager. See the [docs](https://docs.talon.one/docs/product/audiences/managing-audiences#deleting-an-audience).  The audience isn&#39;t deleted if any experiment variant uses it. The response identifies each blocking experiment by its Campaign Manager path. 

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
| **409** | Conflict. The audience is used by one or more experiments. Each &#x60;errors[].source.resource&#x60; value contains the Campaign Manager path of a blocking experiment.  |  -  |


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
        String couponValue = "couponValue_example"; // String | The code of the coupon.  **Important:** The coupon code requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode `SUMMER25%OFF` as `SUMMER25%25OFF`. 
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
 **couponValue** | **String**| The code of the coupon.  **Important:** The coupon code requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode &#x60;SUMMER25%OFF&#x60; as &#x60;SUMMER25%25OFF&#x60;.  |
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

Delete all attributes on the customer profile and on entities that reference this customer profile.  &gt; [!warning] **Warning** &gt; - Customer data is deleted from all Applications in the &gt;   [environment](https://docs.talon.one/docs/product/applications/overview#application-environments) &gt;   that the API key belongs to. For example, if you use this endpoint with an API key that belongs &gt;   to a sandbox Application, customer data will be deleted from all sandbox Applications. &gt;   This is because customer data is shared between Applications from the same environment. &gt; - To preserve performance, we recommend avoiding deleting customer data &gt;   during peak-traffic hours. 

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
        String integrationId = "integrationId_example"; // String | The integration ID of the customer profile. You can get the `integrationId` of a profile using: - A customer session integration ID with the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint. - The Management API with the [List application's customers](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationCustomers) endpoint. 
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
 **integrationId** | **String**| The integration ID of the customer profile. You can get the &#x60;integrationId&#x60; of a profile using: - A customer session integration ID with the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint. - The Management API with the [List application&#39;s customers](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationCustomers) endpoint.  |

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


## deleteLoyaltyTransactionsFromLedgers

> deleteLoyaltyTransactionsFromLedgers(loyaltyProgramId, integrationId, body)

Delete customer&#39;s transactions from loyalty ledgers

Delete a customer&#39;s transactions in all loyalty ledgers or a specified ledger.  &gt; [!note] To retrieve loyalty transaction logs for a specific customer in a given loyalty program, &gt; use the [List customer&#39;s loyalty transactions](https://docs.talon.one/integration-api#tag/Loyalty/operation/getLoyaltyProgramProfileTransactions) &gt; endpoint. 

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
        String integrationId = "integrationId_example"; // String | The integration ID of the customer profile. You can get the `integrationId` of a profile using: - A customer session integration ID with the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint. - The Management API with the [List application's customers](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationCustomers) endpoint. 
        DeleteLoyaltyTransactionsRequest body = new DeleteLoyaltyTransactionsRequest(); // DeleteLoyaltyTransactionsRequest | 
        try {
            apiInstance.deleteLoyaltyTransactionsFromLedgers(loyaltyProgramId, integrationId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#deleteLoyaltyTransactionsFromLedgers");
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
 **integrationId** | **String**| The integration ID of the customer profile. You can get the &#x60;integrationId&#x60; of a profile using: - A customer session integration ID with the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint. - The Management API with the [List application&#39;s customers](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationCustomers) endpoint.  |
 **body** | [**DeleteLoyaltyTransactionsRequest**](DeleteLoyaltyTransactionsRequest.md)|  |

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


## generateLoyaltyCard

> LoyaltyCard generateLoyaltyCard(loyaltyProgramId, body)

Generate loyalty card

Generate a loyalty card in a specified [card-based loyalty program](https://docs.talon.one/docs/product/loyalty-programs/card-based/card-based-overview).  To link the card to one or more customer profiles, use the &#x60;customerProfileIds&#x60; parameter in the request body.  &gt; [!note] **Note** &gt; - The number of customer profiles linked to the loyalty card cannot exceed &gt;   the loyalty program&#39;s &#x60;usersPerCardLimit&#x60;. To find the program&#39;s limit, use &gt;   the [Get loyalty program](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyProgram) &gt;   endpoint. &gt; - If the loyalty program has a defined code format, it will be used for the &gt;   loyalty card identifier. 

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

> InlineResponse2003 getCustomerAchievementHistory(integrationId, achievementId, progressStatus, startDate, endDate, pageSize, skip)

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
            InlineResponse2003 result = apiInstance.getCustomerAchievementHistory(integrationId, achievementId, progressStatus, startDate, endDate, pageSize, skip);
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


## getCustomerAchievements

> InlineResponse2002 getCustomerAchievements(integrationId, campaignIds, achievementIds, achievementStatus, currentProgressStatus, pageSize, skip)

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
            InlineResponse2002 result = apiInstance.getCustomerAchievements(integrationId, campaignIds, achievementIds, achievementStatus, currentProgressStatus, pageSize, skip);
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


## getCustomerInventory

> CustomerInventory getCustomerInventory(integrationId, profile, referrals, coupons, loyalty, giveaways, achievements, unlockedRewards)

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
        String integrationId = "integrationId_example"; // String | The integration ID of the customer profile. You can get the `integrationId` of a profile using: - A customer session integration ID with the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint. - The Management API with the [List application's customers](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationCustomers) endpoint. 
        Boolean profile = true; // Boolean | Set to `true` to include customer profile information in the response.
        Boolean referrals = true; // Boolean | Set to `true` to include referral information in the response.
        Boolean coupons = true; // Boolean | Set to `true` to include coupon information in the response.
        Boolean loyalty = true; // Boolean | Set to `true` to include loyalty information in the response.
        Boolean giveaways = true; // Boolean | Set to `true` to include giveaways information in the response.
        Boolean achievements = true; // Boolean | Set to `true` to include achievement information in the response.
        Boolean unlockedRewards = true; // Boolean | Set to `true` to include `unlocked` rewards that have not been `used` in the response.
        try {
            CustomerInventory result = apiInstance.getCustomerInventory(integrationId, profile, referrals, coupons, loyalty, giveaways, achievements, unlockedRewards);
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
 **integrationId** | **String**| The integration ID of the customer profile. You can get the &#x60;integrationId&#x60; of a profile using: - A customer session integration ID with the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint. - The Management API with the [List application&#39;s customers](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationCustomers) endpoint.  |
 **profile** | **Boolean**| Set to &#x60;true&#x60; to include customer profile information in the response. | [optional]
 **referrals** | **Boolean**| Set to &#x60;true&#x60; to include referral information in the response. | [optional]
 **coupons** | **Boolean**| Set to &#x60;true&#x60; to include coupon information in the response. | [optional]
 **loyalty** | **Boolean**| Set to &#x60;true&#x60; to include loyalty information in the response. | [optional]
 **giveaways** | **Boolean**| Set to &#x60;true&#x60; to include giveaways information in the response. | [optional]
 **achievements** | **Boolean**| Set to &#x60;true&#x60; to include achievement information in the response. | [optional]
 **unlockedRewards** | **Boolean**| Set to &#x60;true&#x60; to include &#x60;unlocked&#x60; rewards that have not been &#x60;used&#x60; in the response. | [optional]

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
        String customerSessionId = "customerSessionId_example"; // String | The `integration ID` of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager's **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationSessions) endpoint. **Notes**: - There is no length limit for this ID. - It must be URL-encoded. For example, replace spaces with `%20`. [Learn more](https://www.w3schools.com/tags/ref_urlencode.asp). 
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
 **customerSessionId** | **String**| The &#x60;integration ID&#x60; of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager&#39;s **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationSessions) endpoint. **Notes**: - There is no length limit for this ID. - It must be URL-encoded. For example, replace spaces with &#x60;%20&#x60;. [Learn more](https://www.w3schools.com/tags/ref_urlencode.asp).  |

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


## getEventV3

> EventV3 getEventV3(integrationId)

Get advanced event

Retrieve an advanced event by its identifier. 

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
        String integrationId = "integrationId_example"; // String | The unique ID of the advanced event.
        try {
            EventV3 result = apiInstance.getEventV3(integrationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#getEventV3");
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
 **integrationId** | **String**| The unique ID of the advanced event. |

### Return type cool

[**EventV3**](EventV3.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |


## getLoyaltyBalances

> LoyaltyBalancesWithTiers getLoyaltyBalances(loyaltyProgramId, integrationId, endDate, subledgerId, includeTiers, includeProjectedTier)

Get customer&#39;s loyalty balances

Retrieve loyalty ledger balances for the given Integration ID in the specified loyalty program.  You can filter balances by date and subledger ID, and include tier-related information in the response.  &gt; [!note] If no filtering options are applied, you retrieve all loyalty &gt; balances on the current date for the given integration ID.  Loyalty balances are calculated when Talon.One receives your request using the points stored in our database, so retrieving a large number of balances at once can impact performance.  For more information, see: - [Managing card-based loyalty program data](https://docs.talon.one/docs/product/loyalty-programs/card-based/managing-loyalty-cards) - [Managing profile-based loyalty program data](https://docs.talon.one/docs/product/loyalty-programs/profile-based/managing-pb-lp-data) 

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
        OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  > [!note] **Note** > - This must be an RFC3339 timestamp string. > - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting >   considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
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
 **endDate** | **OffsetDateTime**| Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  &gt; [!note] **Note** &gt; - This must be an RFC3339 timestamp string. &gt; - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting &gt;   considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
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
        String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  **Important**: The loyalty card ID requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode `NewCard2026%` as `NewCard2026%25`. 
        OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  > [!note] **Note** > - This must be an RFC3339 timestamp string. > - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting >   considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
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
 **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  **Important**: The loyalty card ID requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode &#x60;NewCard2026%&#x60; as &#x60;NewCard2026%25&#x60;.  |
 **endDate** | **OffsetDateTime**| Used to return expired, active, and pending loyalty balances before this timestamp. You can enter any past, present, or future timestamp value.  &gt; [!note] **Note** &gt; - This must be an RFC3339 timestamp string. &gt; - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting &gt;   considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
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

> InlineResponse2006 getLoyaltyCardPoints(loyaltyProgramId, loyaltyCardId, status, subledgerId, customerSessionIDs, transactionUUIDs, pageSize, skip, sort)

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
        String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  **Important**: The loyalty card ID requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode `NewCard2026%` as `NewCard2026%25`. 
        String status = "active"; // String | Filter points based on their status.
        List<String> subledgerId = Arrays.asList(); // List<String> | Filter results by one or more subledger IDs. Must be exact match.
        List<String> customerSessionIDs = Arrays.asList(); // List<String> | Filter the results by a list of customer session IDs.  To include multiple IDs, repeat the parameter for each one, for example, `?customerSessionIDs=id1&customerSessionIDs=id2`.  The response contains only data associated with the specified sessions. 
        List<String> transactionUUIDs = Arrays.asList(); // List<String> | Filter the results by a list of transaction UUIDs.  To include multiple IDs, repeat the parameter for each one, for example, `?transactionUUIDs=uuid1&transactionUUIDs=uuid2`.  The response contains only data associated with the specified transactions. 
        Long pageSize = 50lL; // Long | The number of items in the response.
        Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
        String sort = "sort_example"; // String | The field by which results should be sorted. You can enter one of the following values:  - `startDate`: Sorts the results by the start date of the points. - `expiryDate`: Sorts the results by the expiry date of the points.  By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You can only sort by one field at a time. 
        try {
            InlineResponse2006 result = apiInstance.getLoyaltyCardPoints(loyaltyProgramId, loyaltyCardId, status, subledgerId, customerSessionIDs, transactionUUIDs, pageSize, skip, sort);
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
 **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  **Important**: The loyalty card ID requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode &#x60;NewCard2026%&#x60; as &#x60;NewCard2026%25&#x60;.  |
 **status** | **String**| Filter points based on their status. | [optional] [default to active] [enum: active, pending, expired]
 **subledgerId** | [**List&lt;String&gt;**](String.md)| Filter results by one or more subledger IDs. Must be exact match. | [optional]
 **customerSessionIDs** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of customer session IDs.  To include multiple IDs, repeat the parameter for each one, for example, &#x60;?customerSessionIDs&#x3D;id1&amp;customerSessionIDs&#x3D;id2&#x60;.  The response contains only data associated with the specified sessions.  | [optional]
 **transactionUUIDs** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of transaction UUIDs.  To include multiple IDs, repeat the parameter for each one, for example, &#x60;?transactionUUIDs&#x3D;uuid1&amp;transactionUUIDs&#x3D;uuid2&#x60;.  The response contains only data associated with the specified transactions.  | [optional]
 **pageSize** | **Long**| The number of items in the response. | [optional] [default to 50l]
 **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. You can enter one of the following values:  - &#x60;startDate&#x60;: Sorts the results by the start date of the points. - &#x60;expiryDate&#x60;: Sorts the results by the expiry date of the points.  By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You can only sort by one field at a time.  | [optional] [enum: startDate, expiryDate]

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


## getLoyaltyCardTransactions

> InlineResponse2004 getLoyaltyCardTransactions(loyaltyProgramId, loyaltyCardId, subledgerId, loyaltyTransactionType, startDate, endDate, customerSessionIDs, transactionUUIDs, pageSize, skip, awaitsActivation)

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
        String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  **Important**: The loyalty card ID requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode `NewCard2026%` as `NewCard2026%25`. 
        List<String> subledgerId = Arrays.asList(); // List<String> | Filter results by one or more subledger IDs. Must be exact match.
        String loyaltyTransactionType = "loyaltyTransactionType_example"; // String | Filter results by loyalty transaction type: - `manual`: Loyalty transaction that was done manually. - `session`: Loyalty transaction that resulted from a customer session. - `import`: Loyalty transaction that was imported from a CSV file. 
        OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | Date and time from which results are returned. Results are filtered by transaction creation date.  > [!note] **Note** > - This must be an RFC3339 timestamp string. > - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting >   considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | Date and time by which results are returned. Results are filtered by transaction creation date.  > [!note] **Note** > - This must be an RFC3339 timestamp string. > - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting >   considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        List<String> customerSessionIDs = Arrays.asList(); // List<String> | Filter the results by a list of customer session IDs.  To include multiple IDs, repeat the parameter for each one, for example, `?customerSessionIDs=id1&customerSessionIDs=id2`.  The response contains only data associated with the specified sessions. 
        List<String> transactionUUIDs = Arrays.asList(); // List<String> | Filter the results by a list of transaction UUIDs.  To include multiple IDs, repeat the parameter for each one, for example, `?transactionUUIDs=uuid1&transactionUUIDs=uuid2`.  The response contains only data associated with the specified transactions. 
        Long pageSize = 50lL; // Long | The number of items in the response.
        Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
        Boolean awaitsActivation = true; // Boolean | If `true`: Filters results to include only point transactions that have action-based activation and have not expired.  If `false`: Returns a `400` response. 
        try {
            InlineResponse2004 result = apiInstance.getLoyaltyCardTransactions(loyaltyProgramId, loyaltyCardId, subledgerId, loyaltyTransactionType, startDate, endDate, customerSessionIDs, transactionUUIDs, pageSize, skip, awaitsActivation);
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
 **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  **Important**: The loyalty card ID requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode &#x60;NewCard2026%&#x60; as &#x60;NewCard2026%25&#x60;.  |
 **subledgerId** | [**List&lt;String&gt;**](String.md)| Filter results by one or more subledger IDs. Must be exact match. | [optional]
 **loyaltyTransactionType** | **String**| Filter results by loyalty transaction type: - &#x60;manual&#x60;: Loyalty transaction that was done manually. - &#x60;session&#x60;: Loyalty transaction that resulted from a customer session. - &#x60;import&#x60;: Loyalty transaction that was imported from a CSV file.  | [optional] [enum: manual, session, import]
 **startDate** | **OffsetDateTime**| Date and time from which results are returned. Results are filtered by transaction creation date.  &gt; [!note] **Note** &gt; - This must be an RFC3339 timestamp string. &gt; - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting &gt;   considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **endDate** | **OffsetDateTime**| Date and time by which results are returned. Results are filtered by transaction creation date.  &gt; [!note] **Note** &gt; - This must be an RFC3339 timestamp string. &gt; - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting &gt;   considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **customerSessionIDs** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of customer session IDs.  To include multiple IDs, repeat the parameter for each one, for example, &#x60;?customerSessionIDs&#x3D;id1&amp;customerSessionIDs&#x3D;id2&#x60;.  The response contains only data associated with the specified sessions.  | [optional]
 **transactionUUIDs** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of transaction UUIDs.  To include multiple IDs, repeat the parameter for each one, for example, &#x60;?transactionUUIDs&#x3D;uuid1&amp;transactionUUIDs&#x3D;uuid2&#x60;.  The response contains only data associated with the specified transactions.  | [optional]
 **pageSize** | **Long**| The number of items in the response. | [optional] [default to 50l]
 **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional]
 **awaitsActivation** | **Boolean**| If &#x60;true&#x60;: Filters results to include only point transactions that have action-based activation and have not expired.  If &#x60;false&#x60;: Returns a &#x60;400&#x60; response.  | [optional]

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


## getLoyaltyProgramProfilePoints

> InlineResponse2007 getLoyaltyProgramProfilePoints(loyaltyProgramId, integrationId, status, subledgerId, customerSessionIDs, transactionUUIDs, pageSize, skip, sort)

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
        List<String> subledgerId = Arrays.asList(); // List<String> | Filter the results by a list of subledger IDs.  To include multiple IDs, repeat the parameter for each one, for example, `?subledgerId=id1&subledgerId=id2`.  The response contains only data associated with the specified subledgers. 
        List<String> customerSessionIDs = Arrays.asList(); // List<String> | Filter the results by a list of customer session IDs.  To include multiple IDs, repeat the parameter for each one, for example, `?customerSessionIDs=id1&customerSessionIDs=id2`.  The response contains only data associated with the specified sessions. 
        List<String> transactionUUIDs = Arrays.asList(); // List<String> | Filter the results by a list of transaction UUIDs.  To include multiple IDs, repeat the parameter for each one, for example, `?transactionUUIDs=uuid1&transactionUUIDs=uuid2`.  The response contains only data associated with the specified transactions. 
        Long pageSize = 50lL; // Long | The number of items in the response.
        Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
        String sort = "sort_example"; // String | The field by which results should be sorted. You can enter one of the following values:  - `startDate`: Sorts the results by the start date of the points. - `expiryDate`: Sorts the results by the expiry date of the points.  By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with `-`.  **Note:** You can only sort by one field at a time. 
        try {
            InlineResponse2007 result = apiInstance.getLoyaltyProgramProfilePoints(loyaltyProgramId, integrationId, status, subledgerId, customerSessionIDs, transactionUUIDs, pageSize, skip, sort);
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
 **subledgerId** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of subledger IDs.  To include multiple IDs, repeat the parameter for each one, for example, &#x60;?subledgerId&#x3D;id1&amp;subledgerId&#x3D;id2&#x60;.  The response contains only data associated with the specified subledgers.  | [optional]
 **customerSessionIDs** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of customer session IDs.  To include multiple IDs, repeat the parameter for each one, for example, &#x60;?customerSessionIDs&#x3D;id1&amp;customerSessionIDs&#x3D;id2&#x60;.  The response contains only data associated with the specified sessions.  | [optional]
 **transactionUUIDs** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of transaction UUIDs.  To include multiple IDs, repeat the parameter for each one, for example, &#x60;?transactionUUIDs&#x3D;uuid1&amp;transactionUUIDs&#x3D;uuid2&#x60;.  The response contains only data associated with the specified transactions.  | [optional]
 **pageSize** | **Long**| The number of items in the response. | [optional] [default to 50l]
 **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional]
 **sort** | **String**| The field by which results should be sorted. You can enter one of the following values:  - &#x60;startDate&#x60;: Sorts the results by the start date of the points. - &#x60;expiryDate&#x60;: Sorts the results by the expiry date of the points.  By default, results are sorted in ascending order. To sort them in descending order, prefix the field name with &#x60;-&#x60;.  **Note:** You can only sort by one field at a time.  | [optional] [enum: startDate, expiryDate]

### Return type cool

[**InlineResponse2007**](InlineResponse2007.md)

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

> InlineResponse2005 getLoyaltyProgramProfileTransactions(loyaltyProgramId, integrationId, customerSessionIDs, transactionUUIDs, subledgerId, loyaltyTransactionType, startDate, endDate, pageSize, skip, awaitsActivation)

List customer&#39;s loyalty transactions

Retrieve paginated results of loyalty transaction logs for the given Integration ID in the specified loyalty program.  You can filter transactions by date. If no filters are applied, the last 50 loyalty transactions for the given integration ID are returned.  &gt; [!note] To retrieve all loyalty program transaction logs in a given &gt; loyalty program, use the [List loyalty program transactions](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyProgramTransactions) &gt; endpoint. 

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
        List<String> customerSessionIDs = Arrays.asList(); // List<String> | Filter the results by a list of customer session IDs.  To include multiple IDs, repeat the parameter for each one, for example, `?customerSessionIDs=id1&customerSessionIDs=id2`.  The response contains only data associated with the specified sessions. 
        List<String> transactionUUIDs = Arrays.asList(); // List<String> | Filter the results by a list of transaction UUIDs.  To include multiple IDs, repeat the parameter for each one, for example, `?transactionUUIDs=uuid1&transactionUUIDs=uuid2`.  The response contains only data associated with the specified transactions. 
        List<String> subledgerId = Arrays.asList(); // List<String> | Filter the results by a list of subledger IDs.  To include multiple IDs, repeat the parameter for each one, for example, `?subledgerId=id1&subledgerId=id2`.  The response contains only data associated with the specified subledgers. 
        String loyaltyTransactionType = "loyaltyTransactionType_example"; // String | Filter results by loyalty transaction type: - `manual`: Loyalty transaction that was done manually. - `session`: Loyalty transaction that resulted from a customer session. - `import`: Loyalty transaction that was imported from a CSV file. 
        OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | Date and time from which results are returned. Results are filtered by transaction creation date.  > [!note] **Note** > - This must be an RFC3339 timestamp string. > - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting >   considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | Date and time by which results are returned. Results are filtered by transaction creation date.  > [!note] **Note** > - This must be an RFC3339 timestamp string. > - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting >   considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        Long pageSize = 50lL; // Long | The number of items in the response.
        Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
        Boolean awaitsActivation = true; // Boolean | If `true`: Filters results to include only point transactions that have action-based activation and have not expired.  If `false`: Returns a `400` response. 
        try {
            InlineResponse2005 result = apiInstance.getLoyaltyProgramProfileTransactions(loyaltyProgramId, integrationId, customerSessionIDs, transactionUUIDs, subledgerId, loyaltyTransactionType, startDate, endDate, pageSize, skip, awaitsActivation);
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
 **customerSessionIDs** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of customer session IDs.  To include multiple IDs, repeat the parameter for each one, for example, &#x60;?customerSessionIDs&#x3D;id1&amp;customerSessionIDs&#x3D;id2&#x60;.  The response contains only data associated with the specified sessions.  | [optional]
 **transactionUUIDs** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of transaction UUIDs.  To include multiple IDs, repeat the parameter for each one, for example, &#x60;?transactionUUIDs&#x3D;uuid1&amp;transactionUUIDs&#x3D;uuid2&#x60;.  The response contains only data associated with the specified transactions.  | [optional]
 **subledgerId** | [**List&lt;String&gt;**](String.md)| Filter the results by a list of subledger IDs.  To include multiple IDs, repeat the parameter for each one, for example, &#x60;?subledgerId&#x3D;id1&amp;subledgerId&#x3D;id2&#x60;.  The response contains only data associated with the specified subledgers.  | [optional]
 **loyaltyTransactionType** | **String**| Filter results by loyalty transaction type: - &#x60;manual&#x60;: Loyalty transaction that was done manually. - &#x60;session&#x60;: Loyalty transaction that resulted from a customer session. - &#x60;import&#x60;: Loyalty transaction that was imported from a CSV file.  | [optional] [enum: manual, session, import]
 **startDate** | **OffsetDateTime**| Date and time from which results are returned. Results are filtered by transaction creation date.  &gt; [!note] **Note** &gt; - This must be an RFC3339 timestamp string. &gt; - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting &gt;   considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **endDate** | **OffsetDateTime**| Date and time by which results are returned. Results are filtered by transaction creation date.  &gt; [!note] **Note** &gt; - This must be an RFC3339 timestamp string. &gt; - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting &gt;   considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **pageSize** | **Long**| The number of items in the response. | [optional] [default to 50l]
 **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional]
 **awaitsActivation** | **Boolean**| If &#x60;true&#x60;: Filters results to include only point transactions that have action-based activation and have not expired.  If &#x60;false&#x60;: Returns a &#x60;400&#x60; response.  | [optional]

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


## getReservedCustomers

> InlineResponse2001 getReservedCustomers(couponValue)

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
        String couponValue = "couponValue_example"; // String | The code of the coupon.  **Important:** The coupon code requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode `SUMMER25%OFF` as `SUMMER25%25OFF`. 
        try {
            InlineResponse2001 result = apiInstance.getReservedCustomers(couponValue);
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
 **couponValue** | **String**| The code of the coupon.  **Important:** The coupon code requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode &#x60;SUMMER25%OFF&#x60; as &#x60;SUMMER25%25OFF&#x60;.  |

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
| **401** | Unauthorized - Invalid API key |  -  |
| **404** | Not found |  -  |


## integrationGetAllCampaigns

> InlineResponse200 integrationGetAllCampaigns(pageSize, skip, campaignIds, startAfter, startBefore, endAfter, endBefore, storeId, audienceId)

List all running campaigns

Retrieve all running campaigns for the specified Application. You can filter the results by providing specific campaign IDs or a range of  start and end dates. 

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
        Long pageSize = 50lL; // Long | The number of items in the response.
        Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
        List<String> campaignIds = Arrays.asList(); // List<String> | Filter by one or more campaign IDs, separated by a comma.  **Note:** If no campaigns are specified, data for all the campaigns in the Application is returned. 
        OffsetDateTime startAfter = new OffsetDateTime(); // OffsetDateTime | Filter results to only include campaigns that start on or after  the specified timestamp.  **Note:**  - It must be an RFC3339 timestamp string.  - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        OffsetDateTime startBefore = new OffsetDateTime(); // OffsetDateTime | Filter results to only include campaigns that start on or before  the specified timestamp.  **Note:**  - It must be an RFC3339 timestamp string.  - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        OffsetDateTime endAfter = new OffsetDateTime(); // OffsetDateTime | Filter results to only include campaigns that end on or after  the specified timestamp.  **Note:**  - It must be an RFC3339 timestamp string.  - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        OffsetDateTime endBefore = new OffsetDateTime(); // OffsetDateTime | Filter results to only include campaigns that end on or before  the specified timestamp.  **Note:**  - It must be an RFC3339 timestamp string.  - You can include a time component in your string, for example, `T23:59:59` to specify the end of the day. The time zone setting considered is `UTC`. If you do not include a time component, a default time value of `T00:00:00` (midnight) in `UTC` is considered. 
        Long storeId = 56L; // Long | Filter results to campaigns linked to the specified store ID.
        Long audienceId = 56L; // Long | Filter results to campaigns linked to the specified audience ID.
        try {
            InlineResponse200 result = apiInstance.integrationGetAllCampaigns(pageSize, skip, campaignIds, startAfter, startBefore, endAfter, endBefore, storeId, audienceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#integrationGetAllCampaigns");
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
 **pageSize** | **Long**| The number of items in the response. | [optional] [default to 50l]
 **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional]
 **campaignIds** | [**List&lt;String&gt;**](String.md)| Filter by one or more campaign IDs, separated by a comma.  **Note:** If no campaigns are specified, data for all the campaigns in the Application is returned.  | [optional]
 **startAfter** | **OffsetDateTime**| Filter results to only include campaigns that start on or after  the specified timestamp.  **Note:**  - It must be an RFC3339 timestamp string.  - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **startBefore** | **OffsetDateTime**| Filter results to only include campaigns that start on or before  the specified timestamp.  **Note:**  - It must be an RFC3339 timestamp string.  - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **endAfter** | **OffsetDateTime**| Filter results to only include campaigns that end on or after  the specified timestamp.  **Note:**  - It must be an RFC3339 timestamp string.  - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **endBefore** | **OffsetDateTime**| Filter results to only include campaigns that end on or before  the specified timestamp.  **Note:**  - It must be an RFC3339 timestamp string.  - You can include a time component in your string, for example, &#x60;T23:59:59&#x60; to specify the end of the day. The time zone setting considered is &#x60;UTC&#x60;. If you do not include a time component, a default time value of &#x60;T00:00:00&#x60; (midnight) in &#x60;UTC&#x60; is considered.  | [optional]
 **storeId** | **Long**| Filter results to campaigns linked to the specified store ID. | [optional]
 **audienceId** | **Long**| Filter results to campaigns linked to the specified audience ID. | [optional]

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
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## integrationRewardsCatalog

> InlineResponse20056 integrationRewardsCatalog(pageSize, skip, pointsFrom, pointsTo, includeFree, loyaltyProgramId, subledgerId, profileIntegrationId, loyaltyCardId)

List rewards in the catalog

Retrieve the rewards catalog for the Application. Returns a paginated list of rewards. 

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
        Long pageSize = 1000lL; // Long | The number of items in the response.
        Long skip = 56L; // Long | The number of items to skip when paging through large result sets.
        BigDecimal pointsFrom = new BigDecimal(); // BigDecimal | Return only rewards whose points required is greater than or equal to this value.
        BigDecimal pointsTo = new BigDecimal(); // BigDecimal | Return only rewards whose points required is less than or equal to this value.
        Boolean includeFree = true; // Boolean | Whether to include rewards that have no `pointsRequired`. These rewards are treated as free and available to all customers. 
        Long loyaltyProgramId = 56L; // Long | Return only rewards available in this loyalty program. 
        String subledgerId = "subledgerId_example"; // String | Return only rewards available in this subledger. Must be combined with `loyaltyProgramId`. To specify the main ledger, provide an empty string (\"\"). 
        String profileIntegrationId = "profileIntegrationId_example"; // String | The integration ID of the customer profile whose loyalty balances to include in the response. Balances are returned only when `loyaltyProgramId` is also provided.  **Note:** `profileIntegrationId` and `loyaltyCardId` are mutually exclusive. Do not send both in the same request. 
        String loyaltyCardId = "loyaltyCardId_example"; // String | The identifier of the loyalty card whose loyalty balances to include in the response. Balances are returned only when `loyaltyProgramId` is also provided.  **Note:** `profileIntegrationId` and `loyaltyCardId` are mutually exclusive. Do not send both in the same request. 
        try {
            InlineResponse20056 result = apiInstance.integrationRewardsCatalog(pageSize, skip, pointsFrom, pointsTo, includeFree, loyaltyProgramId, subledgerId, profileIntegrationId, loyaltyCardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#integrationRewardsCatalog");
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
 **pageSize** | **Long**| The number of items in the response. | [optional] [default to 1000l]
 **skip** | **Long**| The number of items to skip when paging through large result sets. | [optional]
 **pointsFrom** | **BigDecimal**| Return only rewards whose points required is greater than or equal to this value. | [optional]
 **pointsTo** | **BigDecimal**| Return only rewards whose points required is less than or equal to this value. | [optional]
 **includeFree** | **Boolean**| Whether to include rewards that have no &#x60;pointsRequired&#x60;. These rewards are treated as free and available to all customers.  | [optional] [default to true]
 **loyaltyProgramId** | **Long**| Return only rewards available in this loyalty program.  | [optional]
 **subledgerId** | **String**| Return only rewards available in this subledger. Must be combined with &#x60;loyaltyProgramId&#x60;. To specify the main ledger, provide an empty string (\&quot;\&quot;).  | [optional]
 **profileIntegrationId** | **String**| The integration ID of the customer profile whose loyalty balances to include in the response. Balances are returned only when &#x60;loyaltyProgramId&#x60; is also provided.  **Note:** &#x60;profileIntegrationId&#x60; and &#x60;loyaltyCardId&#x60; are mutually exclusive. Do not send both in the same request.  | [optional]
 **loyaltyCardId** | **String**| The identifier of the loyalty card whose loyalty balances to include in the response. Balances are returned only when &#x60;loyaltyProgramId&#x60; is also provided.  **Note:** &#x60;profileIntegrationId&#x60; and &#x60;loyaltyCardId&#x60; are mutually exclusive. Do not send both in the same request.  | [optional]

### Return type cool

[**InlineResponse20056**](InlineResponse20056.md)

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


## joinLoyaltyProgram

> joinLoyaltyProgram(loyaltyProgramId, integrationId)

Join customer profile to loyalty program

Join a customer profile to the specified loyalty program.  If the customer profile does not exist, it will be created first using the provided &#x60;integrationId&#x60;, then joined to the loyalty program.  &gt; [!note] This endpoint only works with profile-based loyalty programs.  **Behavior**: - If the loyalty program does not exist, the request fails. - If the customer profile is already joined to the loyalty program, the request fails. - If the customer profile does not exist, it is created and then joined to the loyalty program. 

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
        String integrationId = "integrationId_example"; // String | The integration ID of the customer profile. You can get the `integrationId` of a profile using: - A customer session integration ID with the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint. - The Management API with the [List application's customers](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationCustomers) endpoint. 
        try {
            apiInstance.joinLoyaltyProgram(loyaltyProgramId, integrationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#joinLoyaltyProgram");
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
 **integrationId** | **String**| The integration ID of the customer profile. You can get the &#x60;integrationId&#x60; of a profile using: - A customer session integration ID with the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint. - The Management API with the [List application&#39;s customers](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationCustomers) endpoint.  |

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
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## linkLoyaltyCardToProfile

> LoyaltyCard linkLoyaltyCardToProfile(loyaltyProgramId, loyaltyCardId, body)

Link customer profile to card

[Loyalty cards](https://docs.talon.one/docs/product/loyalty-programs/card-based/card-based-overview) allow customers to collect and spend loyalty points within a [card-based loyalty program](https://docs.talon.one/docs/product/loyalty-programs/overview#loyalty-program-types).  They are useful to gamify loyalty programs and can be used with or without customer profiles linked to them.  Link a customer profile to a given loyalty card for the card to be set as **Registered**.  This affects how it can be used. See the [docs](https://docs.talon.one/docs/product/loyalty-programs/card-based/managing-loyalty-cards#linking-customer-profiles-to-a-loyalty-card).  &gt; [!note] You can link as many customer profiles to a given loyalty card as the &gt; [**card user limit**](https://docs.talon.one/docs/product/loyalty-programs/card-based/creating-cb-programs) &gt; allows. 

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
        String loyaltyCardId = "loyaltyCardId_example"; // String | Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  **Important**: The loyalty card ID requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode `NewCard2026%` as `NewCard2026%25`. 
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
 **loyaltyCardId** | **String**| Identifier of the loyalty card. You can get the identifier with the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  **Important**: The loyalty card ID requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode &#x60;NewCard2026%&#x60; as &#x60;NewCard2026%25&#x60;.  |
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

Reopen a closed [customer session](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions).  For example, if a session has been completed but still needs to be edited, you can reopen it with this endpoint.  A reopen session is treated like a standard open session.  When reopening a session:  - The &#x60;talon_session_reopened&#x60; event is triggered. You can see it in the **Events** view in the Campaign Manager. - The session state is updated to &#x60;open&#x60;. - Any modified budgets and triggered effects are rolled back when the session closes. - Depending on the [return policy](https://docs.talon.one/docs/product/loyalty-programs/managing-loyalty-programs#return-policy)  in your loyalty programs, points are rolled back in the following ways:   - Pending points are rolled back automatically.   - If **Active points deduction** setting is enabled, any points that were earned and activated when the session closed   are rolled back.   - If **Negative balance** is enabled, the rollback can create a negative points balance.  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Effects and budgets unimpacted by a session reopening&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;     &lt;p&gt;The following effects and budgets remain in the state they were in when the session closed:&lt;/p&gt;     &lt;ul&gt;       &lt;li&gt;Add free item effect&lt;/li&gt;       &lt;li&gt;Award giveaway&lt;/li&gt;       &lt;li&gt;Coupon and referral creation&lt;/li&gt;       &lt;li&gt;Coupon reservation&lt;/li&gt;       &lt;li&gt;Custom effect&lt;/li&gt;       &lt;li&gt;Update attribute value&lt;/li&gt;       &lt;li&gt;Update cart item attribute value&lt;/li&gt;     &lt;/ul&gt;   &lt;/div&gt; &lt;/details&gt;  To see an example of a rollback, see the [Cancelling a session with campaign budgets](https://docs.talon.one/docs/dev/tutorials/rolling-back-effects) tutorial.  &gt; [!note] If your order workflow requires you to create a new session &gt; instead of reopening a session, use the &gt; [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) &gt; endpoint to cancel a closed session and create a new one. 

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
        String customerSessionId = "customerSessionId_example"; // String | The `integration ID` of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager's **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationSessions) endpoint. 
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
 **customerSessionId** | **String**| The &#x60;integration ID&#x60; of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager&#39;s **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationSessions) endpoint.  |

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

> IntegrationStateV2 returnCartItems(customerSessionId, body, dry, runRuleEngine)

Return cart items

Create a new return request for the specified cart items.  This endpoint automatically changes the session state from &#x60;closed&#x60; to &#x60;partially_returned&#x60;.  &gt; [!note] This will roll back any effects associated with these cart items. &gt; For more information, see [our documentation on session &gt; states](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions#customer-session-states) &gt; and [this tutorial](https://docs.talon.one/docs/dev/tutorials/partially-returning-a-session). 

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
        String customerSessionId = "customerSessionId_example"; // String | The `integration ID` of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager's **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationSessions) endpoint. 
        ReturnIntegrationRequest body = new ReturnIntegrationRequest(); // ReturnIntegrationRequest | body
        Boolean dry = true; // Boolean | Indicates whether to persist the changes. Changes are ignored when `dry=true`. 
        Boolean runRuleEngine = true; // Boolean | When set to `true`, reevaluates the updated session after items are returned. Only reevaluates campaigns where `reevaluateOnReturn` is set to `true` and which produced an effect when the session was closed. 
        try {
            IntegrationStateV2 result = apiInstance.returnCartItems(customerSessionId, body, dry, runRuleEngine);
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
 **customerSessionId** | **String**| The &#x60;integration ID&#x60; of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager&#39;s **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationSessions) endpoint.  |
 **body** | [**ReturnIntegrationRequest**](ReturnIntegrationRequest.md)| body |
 **dry** | **Boolean**| Indicates whether to persist the changes. Changes are ignored when &#x60;dry&#x3D;true&#x60;.  | [optional]
 **runRuleEngine** | **Boolean**| When set to &#x60;true&#x60;, reevaluates the updated session after items are returned. Only reevaluates campaigns where &#x60;reevaluateOnReturn&#x60; is set to &#x60;true&#x60; and which produced an effect when the session was closed.  | [optional]

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

Perform the following actions for a given cart item catalog:  - Add an item to the catalog. - Add multiple items to the catalog. - Update the attributes of an item in the catalog. - Update the attributes of multiple items in the catalog. - Remove an item from the catalog. - Remove multiple items from the catalog.  You can either add, update, or delete up to 1000 cart items in a single request. Each item synced to a catalog must have a unique &#x60;SKU&#x60;.  &gt; [!important] You can perform only one type of action in a single sync request. Syncing items with duplicate &#x60;SKU&#x60; values in a single request returns an error message with a &#x60;400&#x60; status code.  For more information, read [managing cart item catalogs](https://docs.talon.one/docs/product/account/dev-tools/managing-cart-item-catalogs).  ### Filtering cart items  Use [cart item attributes](https://docs.talon.one/docs/product/account/dev-tools/managing-attributes) to filter items and select the ones you want to edit or delete when editing or deleting more than one item at a time.  The &#x60;filters&#x60; array contains an object with the following properties:  - &#x60;attr&#x60;: A [cart item attribute](https://docs.talon.one/docs/product/account/dev-tools/managing-attributes)   connected to the catalog. It is applied to all items in the catalog. - &#x60;op&#x60;: The filtering operator indicating the relationship between the value   of each cart item in the catalog and the value of the &#x60;value&#x60; property for the attribute selected   in &#x60;attr&#x60;.    The value of &#x60;op&#x60; can be one of the following:    - &#x60;EQ&#x60;: Equal to &#x60;value&#x60;   - &#x60;LT&#x60;: Less than &#x60;value&#x60;   - &#x60;LE&#x60;: Less than or equal to &#x60;value&#x60;   - &#x60;GT&#x60;: Greater than &#x60;value&#x60;   - &#x60;GE&#x60;: Greater than or equal to &#x60;value&#x60;   - &#x60;IN&#x60;: One of the comma-separated values that &#x60;value&#x60; is set to.    **Note:** &#x60;GE&#x60;, &#x60;LE&#x60;, &#x60;GT&#x60;, &#x60;LT&#x60; are for numeric values only. - &#x60;value&#x60;: The value of the attribute selected in &#x60;attr&#x60;.  For request examples of each action, see the **Request Body** examples. 

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

> IntegrationEventV2Response trackEventV2(body, silent, dry, forceCompleteEvaluation)

Track event

Trigger a [custom event](https://docs.talon.one/docs/dev/concepts/entities/events#custom-events).  To use this endpoint:  1. [Create](https://docs.talon.one/docs/dev/concepts/entities/events#create-an-event) an event in the Campaign Manager. 1. In a rule, add the **Check for event types** [condition](https://docs.talon.one/docs/dev/concepts/entities/events#use-an-event-in-a-rule) and select the event you created. 1. Trigger the event with this endpoint.  You can [list](https://docs.talon.one/docs/product/applications/display-events#list-events) the received events in the **Events** view of the Campaign Manager.  For example, you can use this endpoint to trigger an event when a customer shares a link to a product. See our [tutorial](https://docs.talon.one/docs/product/tutorials/referrals/incentivizing-product-link-sharing).  &gt; [!note] **Note** &gt; - &#x60;profileId&#x60; is required even though the schema does not specify it. &gt; - If the customer profile ID is new, a new profile is automatically created but the &#x60;customer_profile_created&#x60; [built-in event ](https://docs.talon.one/docs/dev/concepts/entities/events) is **not** triggered. &gt; - We recommend sending requests sequentially. See [Manage parallel requests](https://docs.talon.one/docs/dev/getting-started/integration-tutorial#manage-parallel-requests). &gt; - [Archived campaigns](https://docs.talon.one/docs/product/campaigns/managing-campaigns#archive-a-campaign) are not considered in rule evaluation. 

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
            IntegrationEventV2Response result = apiInstance.trackEventV2(body, silent, dry, forceCompleteEvaluation);
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

[**IntegrationEventV2Response**](IntegrationEventV2Response.md)

### Authorization

[api_key_v1](../README.md#api_key_v1)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **409** | Too many requests or limit reached - Avoid parallel requests. See the [docs](https://docs.talon.one/docs/dev/tutorials/integrating-talon-one#manage-parallel-requests). |  -  |


## trackEventV3

> IntegrationEventV3Response trackEventV3(body, silent, dry, forceCompleteEvaluation)

Track advanced event

Trigger an [advanced event](https://docs.talon.one/docs/dev/concepts/entities/events#advanced-events).  Advanced events are idempotent, uniquely identifiable events. They can also reference a previously closed session to add more context for rule evaluation.  To use this endpoint:  1. [Create](https://docs.talon.one/docs/dev/concepts/entities/events#create-an-event) an event in the Campaign Manager. 1. In a rule, add the **Check for event types** [condition](https://docs.talon.one/docs/dev/concepts/entities/events#use-an-event-in-a-rule) and select the event you created. 1. Trigger the event with this endpoint.  You can [list](https://docs.talon.one/docs/product/applications/display-events#list-events) the received events in the **Events** view of the Campaign Manager.  For example, you can use this endpoint to award loyalty points after an order is delivered. See our [tutorial](https://docs.talon.one/docs/dev/tutorials/award-loyalty-points-after-delivery).  &gt; [!note] **Note** &gt; - If the customer profile does not exist, it will be created. However, the &#x60;customer_profile_created&#x60; [built-in event](https://docs.talon.one/docs/dev/concepts/entities/events#built-in-events) is **not** triggered. &gt; - We recommend sending requests sequentially. See [Manage parallel requests](https://docs.talon.one/docs/dev/getting-started/integration-tutorial#manage-parallel-requests). &gt; - [Archived campaigns](https://docs.talon.one/docs/product/campaigns/managing-campaigns#archive-a-campaign) are not considered in rule evaluation. 

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
        IntegrationEventV3Request body = new IntegrationEventV3Request(); // IntegrationEventV3Request | body
        String silent = "\"yes\""; // String | Possible values: `yes` or `no`. - `yes`: Increases the performance of the API call by returning a 204 response. - `no`: Returns a 200 response that contains the updated customer profiles. 
        Boolean dry = true; // Boolean | Indicates whether to persist the changes. Changes are ignored when `dry=true`. 
        Boolean forceCompleteEvaluation = false; // Boolean | Forces evaluation for all matching campaigns regardless of the [campaign evaluation mode](https://docs.talon.one/docs/product/applications/managing-campaign-evaluation#setting-campaign-evaluation-mode). Requires `dry=true`. 
        try {
            IntegrationEventV3Response result = apiInstance.trackEventV3(body, silent, dry, forceCompleteEvaluation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#trackEventV3");
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
 **body** | [**IntegrationEventV3Request**](IntegrationEventV3Request.md)| body |
 **silent** | **String**| Possible values: &#x60;yes&#x60; or &#x60;no&#x60;. - &#x60;yes&#x60;: Increases the performance of the API call by returning a 204 response. - &#x60;no&#x60;: Returns a 200 response that contains the updated customer profiles.  | [optional] [default to &quot;yes&quot;]
 **dry** | **Boolean**| Indicates whether to persist the changes. Changes are ignored when &#x60;dry&#x3D;true&#x60;.  | [optional]
 **forceCompleteEvaluation** | **Boolean**| Forces evaluation for all matching campaigns regardless of the [campaign evaluation mode](https://docs.talon.one/docs/product/applications/managing-campaign-evaluation#setting-campaign-evaluation-mode). Requires &#x60;dry&#x3D;true&#x60;.  | [optional] [default to false]

### Return type cool

[**IntegrationEventV3Response**](IntegrationEventV3Response.md)

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
| **409** | An advanced event already exists, too many requests, or limit reached. Avoid parallel requests. See the [docs](https://docs.talon.one/docs/dev/tutorials/integrating-talon-one#manage-parallel-requests). |  -  |


## unlinkLoyaltyCardFromProfile

> LoyaltyCard unlinkLoyaltyCardFromProfile(loyaltyProgramId, loyaltyCardId, body)

Unlink customer profile from a loyalty card

Unlink a customer profile from a [registered](https://docs.talon.one/docs/product/loyalty-programs/card-based/managing-loyalty-cards#linking-customer-profiles-to-a-loyalty-card) loyalty card.  To get the &#x60;integrationId&#x60; of a customer profile, you can use the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint. 

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
        Long loyaltyProgramId = 56L; // Long | The identifier of the card-based loyalty program containing the loyalty card. You can get this ID using the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint. 
        String loyaltyCardId = "loyaltyCardId_example"; // String | The identifier of the loyalty card. You can get this ID using the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  **Important**: The loyalty card ID requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode `NewCard2026%` as `NewCard2026%25`. 
        LoyaltyCardRegistration body = new LoyaltyCardRegistration(); // LoyaltyCardRegistration | body
        try {
            LoyaltyCard result = apiInstance.unlinkLoyaltyCardFromProfile(loyaltyProgramId, loyaltyCardId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#unlinkLoyaltyCardFromProfile");
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
 **loyaltyProgramId** | **Long**| The identifier of the card-based loyalty program containing the loyalty card. You can get this ID using the [List loyalty programs](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyPrograms) endpoint.  |
 **loyaltyCardId** | **String**| The identifier of the loyalty card. You can get this ID using the [List loyalty cards](https://docs.talon.one/management-api#tag/Loyalty-cards/operation/getLoyaltyCards) endpoint.  **Important**: The loyalty card ID requires [URL encoding](https://www.w3schools.com/tags//ref_urlencode.asp) if it contains special characters. For example, you must encode &#x60;NewCard2026%&#x60; as &#x60;NewCard2026%25&#x60;.  |
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


## unlockReward

> IntegrationStateV2 unlockReward(rewardId, body, dry)

Unlock a reward

Unlock a reward for a customer. If the reward has &#x60;pointsRequired&#x60; configured, the corresponding loyalty points are deducted from the customer&#39;s balance.  To unlock a reward with the points of a loyalty card, provide the card in &#x60;cardIdentifier&#x60;. The points are then deducted from the card, and the unlocked reward belongs to the card, which makes it available to all customer profiles linked to that card. 

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
        Long rewardId = 56L; // Long | The ID of the reward. You can get the ID with the [List rewards](#tag/Rewards/operation/listRewards) endpoint.
        IntegrationUnlockRewardRequest body = new IntegrationUnlockRewardRequest(); // IntegrationUnlockRewardRequest | 
        Boolean dry = true; // Boolean | When set to `true`, the rule evaluation is performed but no changes are persisted. Use this to preview the outcome of an unlocking.
        try {
            IntegrationStateV2 result = apiInstance.unlockReward(rewardId, body, dry);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationApi#unlockReward");
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
 **rewardId** | **Long**| The ID of the reward. You can get the ID with the [List rewards](#tag/Rewards/operation/listRewards) endpoint. |
 **body** | [**IntegrationUnlockRewardRequest**](IntegrationUnlockRewardRequest.md)|  |
 **dry** | **Boolean**| When set to &#x60;true&#x60;, the rule evaluation is performed but no changes are persisted. Use this to preview the outcome of an unlocking. | [optional]

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **409** | Conflict. A reward unlock with this integration ID already exists. |  -  |
| **422** | Unprocessable entity. The reward unlock was rejected by the Rule Engine, for example because the customer already unlocked this reward, the customer has insufficient points, or the reward&#39;s eligibility conditions are not met.  |  -  |


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

Add customer profiles to or remove them from an audience.  The endpoint supports 1000 audience actions (&#x60;add&#x60; or &#x60;remove&#x60;) per request.  &gt; [!note] You can also do this using the &gt; [Update audience](https://docs.talon.one/docs/product/rules/effects/using-effects#updating-an-audience) &gt; effect. 

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

Update or create a [Customer Profile](https://docs.talon.one/docs/dev/concepts/entities/customer-profiles). This endpoint triggers the Rule Builder.  You can use this endpoint to: - Set attributes on the given customer profile. Ensure you create the attributes in the Campaign Manager, first. - Modify the audience the customer profile is a member of.  &gt; [!note] **Note** &gt; - Updating a customer profile returns a response with the requested integration state. &gt; - The [Has joined an audience](https://docs.talon.one/docs/product/rules/conditions/available-conditions#audience-conditions) and &gt;   [Has left an audience](https://docs.talon.one/docs/product/rules/conditions/available-conditions#audience-conditions) conditions &gt;   only trigger through this endpoint. &gt; - You can use the &#x60;responseContent&#x60; property to save yourself extra API calls. For example, you can get &gt;   the customer profile details directly without extra requests. &gt; - We recommend sending requests sequentially. &gt;   See [Managing parallel requests](https://docs.talon.one/docs/dev/getting-started/integration-tutorial#managing-parallel-requests). &gt; - [Archived campaigns](https://docs.talon.one/docs/product/campaigns/managing-campaigns#archiving-a-campaign) are not considered in rule evaluation when &#x60;runRuleEngine&#x60; is &#x60;true&#x60;. 

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
        String integrationId = "integrationId_example"; // String | The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier. **Note**: It must be URL-encoded. For example, replace spaces with `%20`. [Learn more](https://www.w3schools.com/tags/ref_urlencode.asp). 
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
 **integrationId** | **String**| The integration identifier for this customer profile. Must be: - Unique within the deployment. - Stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Once set, you cannot update this identifier. **Note**: It must be URL-encoded. For example, replace spaces with &#x60;%20&#x60;. [Learn more](https://www.w3schools.com/tags/ref_urlencode.asp).  |
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

Update (or create) up to 1000 [customer profiles](https://docs.talon.one/docs/dev/concepts/entities/customer-profiles) in 1 request.  The &#x60;integrationId&#x60; must be any identifier that remains stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  A customer profile [can be linked to one or more sessions](https://docs.talon.one/integration-api#tag/Customer-sessions).  &gt; [!note] This endpoint does not trigger the Rule Engine. &gt; To trigger the Rule Engine for customer profile updates, &gt; use the [Update customer profile](#tag/Customer-profiles/operation/updateCustomerProfileV2) endpoint. 

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
| **204** | No content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized - Invalid API key |  -  |


## updateCustomerSessionV2

> IntegrationStateV2 updateCustomerSessionV2(customerSessionId, body, dry, now)

Update customer session

Update or create a [customer session](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions).  The endpoint responds with the potential promotion rule [effects](https://docs.talon.one/docs/dev/integration-api/api-effects) that match the current cart.  For example, use this endpoint to share the contents of a customer&#39;s cart with Talon.One.  &gt; [!note] **Note** &gt; - The currency for the session and the cart items in it is the currency set for the Application linked to this session. &gt; - [Archived campaigns](https://docs.talon.one/docs/product/campaigns/managing-campaigns#archiving-a-campaign) are not considered for rule evaluation.  ### Session management  To use this endpoint, start by learning about [customer sessions](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions) and their states and refer to the &#x60;state&#x60; parameter documentation the request body schema docs below.  ### Sessions and customer profiles  - To link a session to a customer profile, set the &#x60;profileId&#x60; parameter in the request body to a customer profile&#39;s &#x60;integrationId&#x60;.  - While you can create an anonymous session with &#x60;profileId&#x3D;\&quot;\&quot;&#x60;, we recommend you use a guest ID instead.  - A profile can be linked to simultaneous sessions in different Applications. Either:   - Use unique session integration IDs or,   - Use the same session integration ID across all of the Applications.  &gt; [!note] **Note** &gt; - If the specified profile does not exist, an empty profile is **created automatically**. &gt;   You can update it with [Update customer profile](https://docs.talon.one/integration-api#tag/Customer-profiles/operation/updateCustomerProfileV2). &gt; - Updating a customer session returns a response with the new integration state. Use the &#x60;responseContent&#x60; property to save yourself extra API calls. &gt;   For example, you can get the customer profile details directly without extra requests. &gt; - We recommend sending requests sequentially. See [Managing parallel requests](https://docs.talon.one/docs/dev/getting-started/integration-tutorial#managing-parallel-requests).  For more information, see:  - The introductory video in [Getting started](https://docs.talon.one/docs/dev/getting-started/overview). - The [integration tutorial](https://docs.talon.one/docs/dev/tutorials/integrating-talon-one). 

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
        String customerSessionId = "customerSessionId_example"; // String | The `integration ID` of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager's **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationSessions) endpoint. **Notes**: - There is no length limit for this ID. - It must be URL-encoded. For example, replace spaces with `%20`. [Learn more](https://www.w3schools.com/tags/ref_urlencode.asp). 
        IntegrationRequest body = new IntegrationRequest(); // IntegrationRequest | body
        Boolean dry = true; // Boolean | Indicates whether to persist the changes. Changes are ignored when `dry=true`.  When set to `true`: - The endpoint considers **only** the payload that you pass when **closing** the session.   When you do not use the `dry` parameter, the endpoint behaves as a typical PUT endpoint. Each update builds upon the previous ones. - You can use the `evaluableCampaignIds` body property to select specific campaigns to run.  [See the docs](https://docs.talon.one/docs/dev/integration-api/dry-requests). 
        OffsetDateTime now = new OffsetDateTime(); // OffsetDateTime | A timestamp value of a future date that acts as a current date when included in the query.  Use this parameter, for example, to test campaigns that would be evaluated for this customer session in the future (say, [scheduled campaigns](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-schedule)).  > [!note] **Note** > - It must be an RFC3339 timestamp string. > - It can **only** be a date in the future. > - It can **only** be used if the `dry` parameter in the query is set to `true`. 
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
 **customerSessionId** | **String**| The &#x60;integration ID&#x60; of the customer session. You set this ID when you create a customer session.  You can see existing customer session integration IDs in the Campaign Manager&#39;s **Sessions** menu, or via the [List Application session](https://docs.talon.one/management-api#tag/Customer-data/operation/getApplicationSessions) endpoint. **Notes**: - There is no length limit for this ID. - It must be URL-encoded. For example, replace spaces with &#x60;%20&#x60;. [Learn more](https://www.w3schools.com/tags/ref_urlencode.asp).  |
 **body** | [**IntegrationRequest**](IntegrationRequest.md)| body |
 **dry** | **Boolean**| Indicates whether to persist the changes. Changes are ignored when &#x60;dry&#x3D;true&#x60;.  When set to &#x60;true&#x60;: - The endpoint considers **only** the payload that you pass when **closing** the session.   When you do not use the &#x60;dry&#x60; parameter, the endpoint behaves as a typical PUT endpoint. Each update builds upon the previous ones. - You can use the &#x60;evaluableCampaignIds&#x60; body property to select specific campaigns to run.  [See the docs](https://docs.talon.one/docs/dev/integration-api/dry-requests).  | [optional]
 **now** | **OffsetDateTime**| A timestamp value of a future date that acts as a current date when included in the query.  Use this parameter, for example, to test campaigns that would be evaluated for this customer session in the future (say, [scheduled campaigns](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-schedule)).  &gt; [!note] **Note** &gt; - It must be an RFC3339 timestamp string. &gt; - It can **only** be a date in the future. &gt; - It can **only** be used if the &#x60;dry&#x60; parameter in the query is set to &#x60;true&#x60;.  | [optional]

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

