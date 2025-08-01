# Talon.One Java SDK

This SDK supports all of the operations of Talon.One's Integration API and Management API.

If you use Maven, we also host [Maven Artifacts](https://github.com/talon-one/maven-artefacts).

## Requirements

Building the API client library requires:

1. Java 21+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>one.talon</groupId>
  <artifactId>talon-one-client</artifactId>
  <version>13.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "one.talon:talon-one-client:13.1.0"
```

### Others

1. Generate the JAR by running `mvn clean package`.
1. Manually install the following JARs:
    - `target/talon-one-client-2.0.0.jar`
    - `target/lib/*.jar`

## Determining the base URL of the endpoints

The API is available at the same hostname as your Campaign Manager deployment.
For example, if you access the Campaign Manager at `https://yourbaseurl.talon.one`,
the URL for the [Update customer session](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint
is `https://yourbaseurl.talon.one/v2/customer_sessions/{Id}`.

## Getting started

### Integration API

The following code shows an example of using the Integration API:

```java
package com.example.consumer;

import com.google.gson.Gson;

import one.talon.ApiClient;
import one.talon.api.IntegrationApi;
import one.talon.api.ManagementApi;
import one.talon.model.*;

import java.util.*;

public class TalonApiTest {
    public static void main(String[] args) {
        Gson gson = new Gson();
        IntegrationApi iApi = new IntegrationApi(new ApiClient("api_key_v1"));

        // Setup: basePath
        iApi.getApiClient().setBasePath("https://yourbaseurl.talon.one"); // No trailing slash!
        // Setup: when using 'api_key_v1', set apiKey & apiKeyPrefix must be provided
        iApi.getApiClient().setApiKeyPrefix("ApiKey-v1");
        iApi.getApiClient().setApiKey("dbc644d33aa74d582bd9479c59e16f970fe13bf34a208c39d6c7fa7586968468");

        try {
          // Creating a cart item object
            CartItem cartItem = new CartItem();
            cartItem.setName("Hawaiian Pizza");
            cartItem.setSku("pizza-x");
            cartItem.setQuantity(1L);
            cartItem.setPrice(new java.math.BigDecimal("5.5"));

            // Creating a customer session of V2
            NewCustomerSessionV2 customerSession = new NewCustomerSessionV2();
            customerSession.setProfileId("Cool_Dude");
            customerSession.addCouponCodesItem("Cool-Summer!");
            customerSession.addCartItemsItem(cartItem);

            // Initiating integration request wrapping the customer session update
            IntegrationRequest request = new IntegrationRequest()
                .customerSession(customerSession)
                // Optional parameter of requested information to be present on the response related to the customer session update
                .responseContent(Arrays.asList(
                    IntegrationRequest.ResponseContentEnum.CUSTOMERSESSION,
                    IntegrationRequest.ResponseContentEnum.CUSTOMERPROFILE
                ));

            // Flag to communicate whether the request is a "dry run"
            Boolean dryRun = false;

            // Create/update a customer session using `updateCustomerSessionV2` function
            IntegrationStateV2 is = iApi.updateCustomerSessionV2("deetdoot", request, dryRun, null);
            System.out.println(is.toString());

            // Parsing the returned effects list, please consult https://developers.talon.one/Integration-API/handling-effects-v2 for the full list of effects and their corresponding properties
            for (Effect eff : is.getEffects()) {
                if (eff.getEffectType().equals("addLoyaltyPoints")) {
                    // Typecasting according to the specific effect type
                    AddLoyaltyPointsEffectProps props = gson.fromJson(
                        gson.toJson(eff.getProps()),
                        AddLoyaltyPointsEffectProps.class
                    );
                    // Access the specific effect's properties
                    System.out.println(props.getName());
                    System.out.println(props.getProgramId());
                    System.out.println(props.getValue());
                }
                if (eff.getEffectType().equals("acceptCoupon")) {
                    // Typecasting according to the specific effect type
                    AcceptCouponEffectProps props = gson.fromJson(
                      gson.toJson(eff.getProps()),
                      AcceptCouponEffectProps.class
                    );
                    // work with AcceptCouponEffectProps' properties
                    // ...
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

### Management API

The following code shows an example of using the Management API:

```java
package com.example.consumer;

import one.talon.ApiClient;
import one.talon.api.IntegrationApi;
import one.talon.api.ManagementApi;
import one.talon.model.*;

public class TalonApiTest {
    public static void main(String[] args) {
        // Management API example to load application with id 7
        ManagementApi mApi = new ManagementApi(new ApiClient("management_key"));

        // Setup: basePath
        mApi.getApiClient().setBasePath("https://yourbaseurl.talon.one"); // No trailing slash!
        // Setup: when using 'management_key', set apiKey & apiKeyPrefix must be provided
        mApi.getApiClient().setApiKeyPrefix("ManagementKey-v1");
        mApi.getApiClient().setApiKey("2f0dce055da01ae595005d7d79154bae7448d319d5fc7c5b2951fadd6ba1ea07");

        try {
            // Calling `getApplication` function with the desired id (7)
            Application application = mApi.getApplication(7L);
            System.out.println(application.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

## Documentation for API endpoints

All URLs are relative to `https://yourbaseurl.talon.one`.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*IntegrationApi* | [**createAudienceV2**](docs/IntegrationApi.md#createAudienceV2) | **POST** /v2/audiences | Create audience
*IntegrationApi* | [**createCouponReservation**](docs/IntegrationApi.md#createCouponReservation) | **POST** /v1/coupon_reservations/{couponValue} | Create coupon reservation
*IntegrationApi* | [**createReferral**](docs/IntegrationApi.md#createReferral) | **POST** /v1/referrals | Create referral code for an advocate
*IntegrationApi* | [**createReferralsForMultipleAdvocates**](docs/IntegrationApi.md#createReferralsForMultipleAdvocates) | **POST** /v1/referrals_for_multiple_advocates | Create referral codes for multiple advocates
*IntegrationApi* | [**deleteAudienceMembershipsV2**](docs/IntegrationApi.md#deleteAudienceMembershipsV2) | **DELETE** /v2/audiences/{audienceId}/memberships | Delete audience memberships
*IntegrationApi* | [**deleteAudienceV2**](docs/IntegrationApi.md#deleteAudienceV2) | **DELETE** /v2/audiences/{audienceId} | Delete audience
*IntegrationApi* | [**deleteCouponReservation**](docs/IntegrationApi.md#deleteCouponReservation) | **DELETE** /v1/coupon_reservations/{couponValue} | Delete coupon reservations
*IntegrationApi* | [**deleteCustomerData**](docs/IntegrationApi.md#deleteCustomerData) | **DELETE** /v1/customer_data/{integrationId} | Delete customer&#39;s personal data
*IntegrationApi* | [**generateLoyaltyCard**](docs/IntegrationApi.md#generateLoyaltyCard) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/cards | Generate loyalty card
*IntegrationApi* | [**getCustomerAchievementHistory**](docs/IntegrationApi.md#getCustomerAchievementHistory) | **GET** /v1/customer_profiles/{integrationId}/achievements/{achievementId} | List customer&#39;s achievement history
*IntegrationApi* | [**getCustomerAchievements**](docs/IntegrationApi.md#getCustomerAchievements) | **GET** /v1/customer_profiles/{integrationId}/achievements | List customer&#39;s available achievements
*IntegrationApi* | [**getCustomerInventory**](docs/IntegrationApi.md#getCustomerInventory) | **GET** /v1/customer_profiles/{integrationId}/inventory | List customer data
*IntegrationApi* | [**getCustomerSession**](docs/IntegrationApi.md#getCustomerSession) | **GET** /v2/customer_sessions/{customerSessionId} | Get customer session
*IntegrationApi* | [**getLoyaltyBalances**](docs/IntegrationApi.md#getLoyaltyBalances) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/balances | Get customer&#39;s loyalty balances
*IntegrationApi* | [**getLoyaltyCardBalances**](docs/IntegrationApi.md#getLoyaltyCardBalances) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/balances | Get card&#39;s point balances
*IntegrationApi* | [**getLoyaltyCardPoints**](docs/IntegrationApi.md#getLoyaltyCardPoints) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/points | List card&#39;s unused loyalty points
*IntegrationApi* | [**getLoyaltyCardTransactions**](docs/IntegrationApi.md#getLoyaltyCardTransactions) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/transactions | List card&#39;s transactions
*IntegrationApi* | [**getLoyaltyProgramProfilePoints**](docs/IntegrationApi.md#getLoyaltyProgramProfilePoints) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/points | List customer&#39;s unused loyalty points
*IntegrationApi* | [**getLoyaltyProgramProfileTransactions**](docs/IntegrationApi.md#getLoyaltyProgramProfileTransactions) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/transactions | List customer&#39;s loyalty transactions
*IntegrationApi* | [**getReservedCustomers**](docs/IntegrationApi.md#getReservedCustomers) | **GET** /v1/coupon_reservations/customerprofiles/{couponValue} | List customers that have this coupon reserved
*IntegrationApi* | [**linkLoyaltyCardToProfile**](docs/IntegrationApi.md#linkLoyaltyCardToProfile) | **POST** /v2/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/link_profile | Link customer profile to card
*IntegrationApi* | [**reopenCustomerSession**](docs/IntegrationApi.md#reopenCustomerSession) | **PUT** /v2/customer_sessions/{customerSessionId}/reopen | Reopen customer session
*IntegrationApi* | [**returnCartItems**](docs/IntegrationApi.md#returnCartItems) | **POST** /v2/customer_sessions/{customerSessionId}/returns | Return cart items
*IntegrationApi* | [**syncCatalog**](docs/IntegrationApi.md#syncCatalog) | **PUT** /v1/catalogs/{catalogId}/sync | Sync cart item catalog
*IntegrationApi* | [**trackEventV2**](docs/IntegrationApi.md#trackEventV2) | **POST** /v2/events | Track event
*IntegrationApi* | [**updateAudienceCustomersAttributes**](docs/IntegrationApi.md#updateAudienceCustomersAttributes) | **PUT** /v2/audience_customers/{audienceId}/attributes | Update profile attributes for all customers in audience
*IntegrationApi* | [**updateAudienceV2**](docs/IntegrationApi.md#updateAudienceV2) | **PUT** /v2/audiences/{audienceId} | Update audience name
*IntegrationApi* | [**updateCustomerProfileAudiences**](docs/IntegrationApi.md#updateCustomerProfileAudiences) | **POST** /v2/customer_audiences | Update multiple customer profiles&#39; audiences
*IntegrationApi* | [**updateCustomerProfileV2**](docs/IntegrationApi.md#updateCustomerProfileV2) | **PUT** /v2/customer_profiles/{integrationId} | Update customer profile
*IntegrationApi* | [**updateCustomerProfilesV2**](docs/IntegrationApi.md#updateCustomerProfilesV2) | **PUT** /v2/customer_profiles | Update multiple customer profiles
*IntegrationApi* | [**updateCustomerSessionV2**](docs/IntegrationApi.md#updateCustomerSessionV2) | **PUT** /v2/customer_sessions/{customerSessionId} | Update customer session
*ManagementApi* | [**activateUserByEmail**](docs/ManagementApi.md#activateUserByEmail) | **POST** /v1/users/activate | Enable user by email address
*ManagementApi* | [**addLoyaltyCardPoints**](docs/ManagementApi.md#addLoyaltyCardPoints) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/add_points | Add points to card
*ManagementApi* | [**addLoyaltyPoints**](docs/ManagementApi.md#addLoyaltyPoints) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/add_points | Add points to customer profile
*ManagementApi* | [**copyCampaignToApplications**](docs/ManagementApi.md#copyCampaignToApplications) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/copy | Copy the campaign into the specified Application
*ManagementApi* | [**createAccountCollection**](docs/ManagementApi.md#createAccountCollection) | **POST** /v1/collections | Create account-level collection
*ManagementApi* | [**createAchievement**](docs/ManagementApi.md#createAchievement) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/achievements | Create achievement
*ManagementApi* | [**createAdditionalCost**](docs/ManagementApi.md#createAdditionalCost) | **POST** /v1/additional_costs | Create additional cost
*ManagementApi* | [**createAttribute**](docs/ManagementApi.md#createAttribute) | **POST** /v1/attributes | Create custom attribute
*ManagementApi* | [**createBatchLoyaltyCards**](docs/ManagementApi.md#createBatchLoyaltyCards) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/cards/batch | Create loyalty cards
*ManagementApi* | [**createCampaignFromTemplate**](docs/ManagementApi.md#createCampaignFromTemplate) | **POST** /v1/applications/{applicationId}/create_campaign_from_template | Create campaign from campaign template
*ManagementApi* | [**createCampaignStoreBudget**](docs/ManagementApi.md#createCampaignStoreBudget) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/budgets | Create campaign store budget
*ManagementApi* | [**createCollection**](docs/ManagementApi.md#createCollection) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/collections | Create campaign-level collection
*ManagementApi* | [**createCoupons**](docs/ManagementApi.md#createCoupons) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Create coupons
*ManagementApi* | [**createCouponsAsync**](docs/ManagementApi.md#createCouponsAsync) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_async | Create coupons asynchronously
*ManagementApi* | [**createCouponsDeletionJob**](docs/ManagementApi.md#createCouponsDeletionJob) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_deletion_jobs | Creates a coupon deletion job
*ManagementApi* | [**createCouponsForMultipleRecipients**](docs/ManagementApi.md#createCouponsForMultipleRecipients) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_with_recipients | Create coupons for multiple recipients
*ManagementApi* | [**createInviteEmail**](docs/ManagementApi.md#createInviteEmail) | **POST** /v1/invite_emails | Resend invitation email
*ManagementApi* | [**createInviteV2**](docs/ManagementApi.md#createInviteV2) | **POST** /v2/invites | Invite user
*ManagementApi* | [**createPasswordRecoveryEmail**](docs/ManagementApi.md#createPasswordRecoveryEmail) | **POST** /v1/password_recovery_emails | Request a password reset
*ManagementApi* | [**createSession**](docs/ManagementApi.md#createSession) | **POST** /v1/sessions | Create session
*ManagementApi* | [**createStore**](docs/ManagementApi.md#createStore) | **POST** /v1/applications/{applicationId}/stores | Create store
*ManagementApi* | [**deactivateUserByEmail**](docs/ManagementApi.md#deactivateUserByEmail) | **POST** /v1/users/deactivate | Disable user by email address
*ManagementApi* | [**deductLoyaltyCardPoints**](docs/ManagementApi.md#deductLoyaltyCardPoints) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/deduct_points | Deduct points from card
*ManagementApi* | [**deleteAccountCollection**](docs/ManagementApi.md#deleteAccountCollection) | **DELETE** /v1/collections/{collectionId} | Delete account-level collection
*ManagementApi* | [**deleteAchievement**](docs/ManagementApi.md#deleteAchievement) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/achievements/{achievementId} | Delete achievement
*ManagementApi* | [**deleteCampaign**](docs/ManagementApi.md#deleteCampaign) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId} | Delete campaign
*ManagementApi* | [**deleteCampaignStoreBudgets**](docs/ManagementApi.md#deleteCampaignStoreBudgets) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/budgets | Delete campaign store budgets
*ManagementApi* | [**deleteCollection**](docs/ManagementApi.md#deleteCollection) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId} | Delete campaign-level collection
*ManagementApi* | [**deleteCoupon**](docs/ManagementApi.md#deleteCoupon) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/{couponId} | Delete coupon
*ManagementApi* | [**deleteCoupons**](docs/ManagementApi.md#deleteCoupons) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Delete coupons
*ManagementApi* | [**deleteLoyaltyCard**](docs/ManagementApi.md#deleteLoyaltyCard) | **DELETE** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId} | Delete loyalty card
*ManagementApi* | [**deleteReferral**](docs/ManagementApi.md#deleteReferral) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals/{referralId} | Delete referral
*ManagementApi* | [**deleteStore**](docs/ManagementApi.md#deleteStore) | **DELETE** /v1/applications/{applicationId}/stores/{storeId} | Delete store
*ManagementApi* | [**deleteUser**](docs/ManagementApi.md#deleteUser) | **DELETE** /v1/users/{userId} | Delete user
*ManagementApi* | [**deleteUserByEmail**](docs/ManagementApi.md#deleteUserByEmail) | **POST** /v1/users/delete | Delete user by email address
*ManagementApi* | [**destroySession**](docs/ManagementApi.md#destroySession) | **DELETE** /v1/sessions | Destroy session
*ManagementApi* | [**disconnectCampaignStores**](docs/ManagementApi.md#disconnectCampaignStores) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/stores | Disconnect stores
*ManagementApi* | [**exportAccountCollectionItems**](docs/ManagementApi.md#exportAccountCollectionItems) | **GET** /v1/collections/{collectionId}/export | Export account-level collection&#39;s items
*ManagementApi* | [**exportAchievements**](docs/ManagementApi.md#exportAchievements) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/achievements/{achievementId}/export | Export achievement customer data
*ManagementApi* | [**exportAudiencesMemberships**](docs/ManagementApi.md#exportAudiencesMemberships) | **GET** /v1/audiences/{audienceId}/memberships/export | Export audience members
*ManagementApi* | [**exportCampaignStoreBudgets**](docs/ManagementApi.md#exportCampaignStoreBudgets) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/budgets/export | Export campaign store budgets
*ManagementApi* | [**exportCampaignStores**](docs/ManagementApi.md#exportCampaignStores) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/export | Export stores
*ManagementApi* | [**exportCollectionItems**](docs/ManagementApi.md#exportCollectionItems) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId}/export | Export campaign-level collection&#39;s items
*ManagementApi* | [**exportCoupons**](docs/ManagementApi.md#exportCoupons) | **GET** /v1/applications/{applicationId}/export_coupons | Export coupons
*ManagementApi* | [**exportCustomerSessions**](docs/ManagementApi.md#exportCustomerSessions) | **GET** /v1/applications/{applicationId}/export_customer_sessions | Export customer sessions
*ManagementApi* | [**exportCustomersTiers**](docs/ManagementApi.md#exportCustomersTiers) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/export_customers_tiers | Export customers&#39; tier data
*ManagementApi* | [**exportEffects**](docs/ManagementApi.md#exportEffects) | **GET** /v1/applications/{applicationId}/export_effects | Export triggered effects
*ManagementApi* | [**exportLoyaltyBalance**](docs/ManagementApi.md#exportLoyaltyBalance) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/export_customer_balance | Export customer loyalty balance to CSV
*ManagementApi* | [**exportLoyaltyBalances**](docs/ManagementApi.md#exportLoyaltyBalances) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/export_customer_balances | Export customer loyalty balances
*ManagementApi* | [**exportLoyaltyCardBalances**](docs/ManagementApi.md#exportLoyaltyCardBalances) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/export_card_balances | Export all card transaction logs
*ManagementApi* | [**exportLoyaltyCardLedger**](docs/ManagementApi.md#exportLoyaltyCardLedger) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/export_log | Export card&#39;s ledger log
*ManagementApi* | [**exportLoyaltyCards**](docs/ManagementApi.md#exportLoyaltyCards) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/export | Export loyalty cards
*ManagementApi* | [**exportLoyaltyLedger**](docs/ManagementApi.md#exportLoyaltyLedger) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/export_log | Export customer&#39;s transaction logs
*ManagementApi* | [**exportPoolGiveaways**](docs/ManagementApi.md#exportPoolGiveaways) | **GET** /v1/giveaways/pools/{poolId}/export | Export giveaway codes of a giveaway pool
*ManagementApi* | [**exportReferrals**](docs/ManagementApi.md#exportReferrals) | **GET** /v1/applications/{applicationId}/export_referrals | Export referrals
*ManagementApi* | [**getAccessLogsWithoutTotalCount**](docs/ManagementApi.md#getAccessLogsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/access_logs/no_total | Get access logs for Application
*ManagementApi* | [**getAccount**](docs/ManagementApi.md#getAccount) | **GET** /v1/accounts/{accountId} | Get account details
*ManagementApi* | [**getAccountAnalytics**](docs/ManagementApi.md#getAccountAnalytics) | **GET** /v1/accounts/{accountId}/analytics | Get account analytics
*ManagementApi* | [**getAccountCollection**](docs/ManagementApi.md#getAccountCollection) | **GET** /v1/collections/{collectionId} | Get account-level collection
*ManagementApi* | [**getAchievement**](docs/ManagementApi.md#getAchievement) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/achievements/{achievementId} | Get achievement
*ManagementApi* | [**getAdditionalCost**](docs/ManagementApi.md#getAdditionalCost) | **GET** /v1/additional_costs/{additionalCostId} | Get additional cost
*ManagementApi* | [**getAdditionalCosts**](docs/ManagementApi.md#getAdditionalCosts) | **GET** /v1/additional_costs | List additional costs
*ManagementApi* | [**getApplication**](docs/ManagementApi.md#getApplication) | **GET** /v1/applications/{applicationId} | Get Application
*ManagementApi* | [**getApplicationApiHealth**](docs/ManagementApi.md#getApplicationApiHealth) | **GET** /v1/applications/{applicationId}/health_report | Get Application health
*ManagementApi* | [**getApplicationCustomer**](docs/ManagementApi.md#getApplicationCustomer) | **GET** /v1/applications/{applicationId}/customers/{customerId} | Get application&#39;s customer
*ManagementApi* | [**getApplicationCustomerFriends**](docs/ManagementApi.md#getApplicationCustomerFriends) | **GET** /v1/applications/{applicationId}/profile/{integrationId}/friends | List friends referred by customer profile
*ManagementApi* | [**getApplicationCustomers**](docs/ManagementApi.md#getApplicationCustomers) | **GET** /v1/applications/{applicationId}/customers | List application&#39;s customers
*ManagementApi* | [**getApplicationCustomersByAttributes**](docs/ManagementApi.md#getApplicationCustomersByAttributes) | **POST** /v1/applications/{applicationId}/customer_search | List application customers matching the given attributes
*ManagementApi* | [**getApplicationEventTypes**](docs/ManagementApi.md#getApplicationEventTypes) | **GET** /v1/applications/{applicationId}/event_types | List Applications event types
*ManagementApi* | [**getApplicationEventsWithoutTotalCount**](docs/ManagementApi.md#getApplicationEventsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/events/no_total | List Applications events
*ManagementApi* | [**getApplicationSession**](docs/ManagementApi.md#getApplicationSession) | **GET** /v1/applications/{applicationId}/sessions/{sessionId} | Get Application session
*ManagementApi* | [**getApplicationSessions**](docs/ManagementApi.md#getApplicationSessions) | **GET** /v1/applications/{applicationId}/sessions | List Application sessions
*ManagementApi* | [**getApplications**](docs/ManagementApi.md#getApplications) | **GET** /v1/applications | List Applications
*ManagementApi* | [**getAttribute**](docs/ManagementApi.md#getAttribute) | **GET** /v1/attributes/{attributeId} | Get custom attribute
*ManagementApi* | [**getAttributes**](docs/ManagementApi.md#getAttributes) | **GET** /v1/attributes | List custom attributes
*ManagementApi* | [**getAudienceMemberships**](docs/ManagementApi.md#getAudienceMemberships) | **GET** /v1/audiences/{audienceId}/memberships | List audience members
*ManagementApi* | [**getAudiences**](docs/ManagementApi.md#getAudiences) | **GET** /v1/audiences | List audiences
*ManagementApi* | [**getAudiencesAnalytics**](docs/ManagementApi.md#getAudiencesAnalytics) | **GET** /v1/audiences/analytics | List audience analytics
*ManagementApi* | [**getCampaign**](docs/ManagementApi.md#getCampaign) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId} | Get campaign
*ManagementApi* | [**getCampaignAnalytics**](docs/ManagementApi.md#getCampaignAnalytics) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/analytics | Get analytics of campaigns
*ManagementApi* | [**getCampaignByAttributes**](docs/ManagementApi.md#getCampaignByAttributes) | **POST** /v1/applications/{applicationId}/campaigns_search | List campaigns that match the given attributes
*ManagementApi* | [**getCampaignGroup**](docs/ManagementApi.md#getCampaignGroup) | **GET** /v1/campaign_groups/{campaignGroupId} | Get campaign access group
*ManagementApi* | [**getCampaignGroups**](docs/ManagementApi.md#getCampaignGroups) | **GET** /v1/campaign_groups | List campaign access groups
*ManagementApi* | [**getCampaignTemplates**](docs/ManagementApi.md#getCampaignTemplates) | **GET** /v1/campaign_templates | List campaign templates
*ManagementApi* | [**getCampaigns**](docs/ManagementApi.md#getCampaigns) | **GET** /v1/applications/{applicationId}/campaigns | List campaigns
*ManagementApi* | [**getChanges**](docs/ManagementApi.md#getChanges) | **GET** /v1/changes | Get audit logs for an account
*ManagementApi* | [**getCollection**](docs/ManagementApi.md#getCollection) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId} | Get campaign-level collection
*ManagementApi* | [**getCollectionItems**](docs/ManagementApi.md#getCollectionItems) | **GET** /v1/collections/{collectionId}/items | Get collection items
*ManagementApi* | [**getCouponsWithoutTotalCount**](docs/ManagementApi.md#getCouponsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/no_total | List coupons
*ManagementApi* | [**getCustomerActivityReport**](docs/ManagementApi.md#getCustomerActivityReport) | **GET** /v1/applications/{applicationId}/customer_activity_reports/{customerId} | Get customer&#39;s activity report
*ManagementApi* | [**getCustomerActivityReportsWithoutTotalCount**](docs/ManagementApi.md#getCustomerActivityReportsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/customer_activity_reports/no_total | Get Activity Reports for Application Customers
*ManagementApi* | [**getCustomerAnalytics**](docs/ManagementApi.md#getCustomerAnalytics) | **GET** /v1/applications/{applicationId}/customers/{customerId}/analytics | Get customer&#39;s analytics report
*ManagementApi* | [**getCustomerProfile**](docs/ManagementApi.md#getCustomerProfile) | **GET** /v1/customers/{customerId} | Get customer profile
*ManagementApi* | [**getCustomerProfileAchievementProgress**](docs/ManagementApi.md#getCustomerProfileAchievementProgress) | **GET** /v1/applications/{applicationId}/achievement_progress/{integrationId} | List customer achievements
*ManagementApi* | [**getCustomerProfiles**](docs/ManagementApi.md#getCustomerProfiles) | **GET** /v1/customers/no_total | List customer profiles
*ManagementApi* | [**getCustomersByAttributes**](docs/ManagementApi.md#getCustomersByAttributes) | **POST** /v1/customer_search/no_total | List customer profiles matching the given attributes
*ManagementApi* | [**getDashboardStatistics**](docs/ManagementApi.md#getDashboardStatistics) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/dashboard | Get statistics for loyalty dashboard
*ManagementApi* | [**getEventTypes**](docs/ManagementApi.md#getEventTypes) | **GET** /v1/event_types | List event types
*ManagementApi* | [**getExports**](docs/ManagementApi.md#getExports) | **GET** /v1/exports | Get exports
*ManagementApi* | [**getLoyaltyCard**](docs/ManagementApi.md#getLoyaltyCard) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId} | Get loyalty card
*ManagementApi* | [**getLoyaltyCardTransactionLogs**](docs/ManagementApi.md#getLoyaltyCardTransactionLogs) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/logs | List card&#39;s transactions
*ManagementApi* | [**getLoyaltyCards**](docs/ManagementApi.md#getLoyaltyCards) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/cards | List loyalty cards
*ManagementApi* | [**getLoyaltyPoints**](docs/ManagementApi.md#getLoyaltyPoints) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId} | Get customer&#39;s full loyalty ledger
*ManagementApi* | [**getLoyaltyProgram**](docs/ManagementApi.md#getLoyaltyProgram) | **GET** /v1/loyalty_programs/{loyaltyProgramId} | Get loyalty program
*ManagementApi* | [**getLoyaltyProgramTransactions**](docs/ManagementApi.md#getLoyaltyProgramTransactions) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/transactions | List loyalty program transactions
*ManagementApi* | [**getLoyaltyPrograms**](docs/ManagementApi.md#getLoyaltyPrograms) | **GET** /v1/loyalty_programs | List loyalty programs
*ManagementApi* | [**getLoyaltyStatistics**](docs/ManagementApi.md#getLoyaltyStatistics) | **GET** /v1/loyalty_programs/{loyaltyProgramId}/statistics | Get loyalty program statistics
*ManagementApi* | [**getMessageLogs**](docs/ManagementApi.md#getMessageLogs) | **GET** /v1/message_logs | List message log entries
*ManagementApi* | [**getReferralsWithoutTotalCount**](docs/ManagementApi.md#getReferralsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals/no_total | List referrals
*ManagementApi* | [**getRoleV2**](docs/ManagementApi.md#getRoleV2) | **GET** /v2/roles/{roleId} | Get role
*ManagementApi* | [**getRuleset**](docs/ManagementApi.md#getRuleset) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets/{rulesetId} | Get ruleset
*ManagementApi* | [**getRulesets**](docs/ManagementApi.md#getRulesets) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets | List campaign rulesets
*ManagementApi* | [**getStore**](docs/ManagementApi.md#getStore) | **GET** /v1/applications/{applicationId}/stores/{storeId} | Get store
*ManagementApi* | [**getUser**](docs/ManagementApi.md#getUser) | **GET** /v1/users/{userId} | Get user
*ManagementApi* | [**getUsers**](docs/ManagementApi.md#getUsers) | **GET** /v1/users | List users in account
*ManagementApi* | [**getWebhook**](docs/ManagementApi.md#getWebhook) | **GET** /v1/webhooks/{webhookId} | Get webhook
*ManagementApi* | [**getWebhooks**](docs/ManagementApi.md#getWebhooks) | **GET** /v1/webhooks | List webhooks
*ManagementApi* | [**importAccountCollection**](docs/ManagementApi.md#importAccountCollection) | **POST** /v1/collections/{collectionId}/import | Import data into existing account-level collection
*ManagementApi* | [**importAllowedList**](docs/ManagementApi.md#importAllowedList) | **POST** /v1/attributes/{attributeId}/allowed_list/import | Import allowed values for attribute
*ManagementApi* | [**importAudiencesMemberships**](docs/ManagementApi.md#importAudiencesMemberships) | **POST** /v1/audiences/{audienceId}/memberships/import | Import audience members
*ManagementApi* | [**importCampaignStoreBudget**](docs/ManagementApi.md#importCampaignStoreBudget) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/budgets/import | Import campaign store budgets
*ManagementApi* | [**importCampaignStores**](docs/ManagementApi.md#importCampaignStores) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/import | Import stores
*ManagementApi* | [**importCollection**](docs/ManagementApi.md#importCollection) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId}/import | Import data into existing campaign-level collection
*ManagementApi* | [**importCoupons**](docs/ManagementApi.md#importCoupons) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/import_coupons | Import coupons
*ManagementApi* | [**importLoyaltyCards**](docs/ManagementApi.md#importLoyaltyCards) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/import_cards | Import loyalty cards
*ManagementApi* | [**importLoyaltyCustomersTiers**](docs/ManagementApi.md#importLoyaltyCustomersTiers) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/import_customers_tiers | Import customers into loyalty tiers
*ManagementApi* | [**importLoyaltyPoints**](docs/ManagementApi.md#importLoyaltyPoints) | **POST** /v1/loyalty_programs/{loyaltyProgramId}/import_points | Import loyalty points
*ManagementApi* | [**importPoolGiveaways**](docs/ManagementApi.md#importPoolGiveaways) | **POST** /v1/giveaways/pools/{poolId}/import | Import giveaway codes into a giveaway pool
*ManagementApi* | [**importReferrals**](docs/ManagementApi.md#importReferrals) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/import_referrals | Import referrals
*ManagementApi* | [**inviteUserExternal**](docs/ManagementApi.md#inviteUserExternal) | **POST** /v1/users/invite | Invite user from identity provider
*ManagementApi* | [**listAccountCollections**](docs/ManagementApi.md#listAccountCollections) | **GET** /v1/collections | List collections in account
*ManagementApi* | [**listAchievements**](docs/ManagementApi.md#listAchievements) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/achievements | List achievements
*ManagementApi* | [**listAllRolesV2**](docs/ManagementApi.md#listAllRolesV2) | **GET** /v2/roles | List roles
*ManagementApi* | [**listCampaignStoreBudgetLimits**](docs/ManagementApi.md#listCampaignStoreBudgetLimits) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/budgets | List campaign store budget limits
*ManagementApi* | [**listCatalogItems**](docs/ManagementApi.md#listCatalogItems) | **GET** /v1/catalogs/{catalogId}/items | List items in a catalog
*ManagementApi* | [**listCollections**](docs/ManagementApi.md#listCollections) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/collections | List collections in campaign
*ManagementApi* | [**listCollectionsInApplication**](docs/ManagementApi.md#listCollectionsInApplication) | **GET** /v1/applications/{applicationId}/collections | List collections in Application
*ManagementApi* | [**listStores**](docs/ManagementApi.md#listStores) | **GET** /v1/applications/{applicationId}/stores | List stores
*ManagementApi* | [**oktaEventHandlerChallenge**](docs/ManagementApi.md#oktaEventHandlerChallenge) | **GET** /v1/provisioning/okta | Validate Okta API ownership
*ManagementApi* | [**removeLoyaltyPoints**](docs/ManagementApi.md#removeLoyaltyPoints) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/profile/{integrationId}/deduct_points | Deduct points from customer profile
*ManagementApi* | [**resetPassword**](docs/ManagementApi.md#resetPassword) | **POST** /v1/reset_password | Reset password
*ManagementApi* | [**scimCreateGroup**](docs/ManagementApi.md#scimCreateGroup) | **POST** /v1/provisioning/scim/Groups | Create SCIM group
*ManagementApi* | [**scimCreateUser**](docs/ManagementApi.md#scimCreateUser) | **POST** /v1/provisioning/scim/Users | Create SCIM user
*ManagementApi* | [**scimDeleteGroup**](docs/ManagementApi.md#scimDeleteGroup) | **DELETE** /v1/provisioning/scim/Groups/{groupId} | Delete SCIM group
*ManagementApi* | [**scimDeleteUser**](docs/ManagementApi.md#scimDeleteUser) | **DELETE** /v1/provisioning/scim/Users/{userId} | Delete SCIM user
*ManagementApi* | [**scimGetGroup**](docs/ManagementApi.md#scimGetGroup) | **GET** /v1/provisioning/scim/Groups/{groupId} | Get SCIM group
*ManagementApi* | [**scimGetGroups**](docs/ManagementApi.md#scimGetGroups) | **GET** /v1/provisioning/scim/Groups | List SCIM groups
*ManagementApi* | [**scimGetResourceTypes**](docs/ManagementApi.md#scimGetResourceTypes) | **GET** /v1/provisioning/scim/ResourceTypes | List supported SCIM resource types
*ManagementApi* | [**scimGetSchemas**](docs/ManagementApi.md#scimGetSchemas) | **GET** /v1/provisioning/scim/Schemas | List supported SCIM schemas
*ManagementApi* | [**scimGetServiceProviderConfig**](docs/ManagementApi.md#scimGetServiceProviderConfig) | **GET** /v1/provisioning/scim/ServiceProviderConfig | Get SCIM service provider configuration
*ManagementApi* | [**scimGetUser**](docs/ManagementApi.md#scimGetUser) | **GET** /v1/provisioning/scim/Users/{userId} | Get SCIM user
*ManagementApi* | [**scimGetUsers**](docs/ManagementApi.md#scimGetUsers) | **GET** /v1/provisioning/scim/Users | List SCIM users
*ManagementApi* | [**scimPatchGroup**](docs/ManagementApi.md#scimPatchGroup) | **PATCH** /v1/provisioning/scim/Groups/{groupId} | Update SCIM group attributes
*ManagementApi* | [**scimPatchUser**](docs/ManagementApi.md#scimPatchUser) | **PATCH** /v1/provisioning/scim/Users/{userId} | Update SCIM user attributes
*ManagementApi* | [**scimReplaceGroupAttributes**](docs/ManagementApi.md#scimReplaceGroupAttributes) | **PUT** /v1/provisioning/scim/Groups/{groupId} | Update SCIM group
*ManagementApi* | [**scimReplaceUserAttributes**](docs/ManagementApi.md#scimReplaceUserAttributes) | **PUT** /v1/provisioning/scim/Users/{userId} | Update SCIM user
*ManagementApi* | [**searchCouponsAdvancedApplicationWideWithoutTotalCount**](docs/ManagementApi.md#searchCouponsAdvancedApplicationWideWithoutTotalCount) | **POST** /v1/applications/{applicationId}/coupons_search_advanced/no_total | List coupons that match the given attributes (without total count)
*ManagementApi* | [**searchCouponsAdvancedWithoutTotalCount**](docs/ManagementApi.md#searchCouponsAdvancedWithoutTotalCount) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_search_advanced/no_total | List coupons that match the given attributes in campaign (without total count)
*ManagementApi* | [**summarizeCampaignStoreBudget**](docs/ManagementApi.md#summarizeCampaignStoreBudget) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/stores/budgets/summary | Get summary of campaign store budgets
*ManagementApi* | [**transferLoyaltyCard**](docs/ManagementApi.md#transferLoyaltyCard) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId}/transfer | Transfer card data
*ManagementApi* | [**updateAccountCollection**](docs/ManagementApi.md#updateAccountCollection) | **PUT** /v1/collections/{collectionId} | Update account-level collection
*ManagementApi* | [**updateAchievement**](docs/ManagementApi.md#updateAchievement) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/achievements/{achievementId} | Update achievement
*ManagementApi* | [**updateAdditionalCost**](docs/ManagementApi.md#updateAdditionalCost) | **PUT** /v1/additional_costs/{additionalCostId} | Update additional cost
*ManagementApi* | [**updateAttribute**](docs/ManagementApi.md#updateAttribute) | **PUT** /v1/attributes/{attributeId} | Update custom attribute
*ManagementApi* | [**updateCampaign**](docs/ManagementApi.md#updateCampaign) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId} | Update campaign
*ManagementApi* | [**updateCollection**](docs/ManagementApi.md#updateCollection) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/collections/{collectionId} | Update campaign-level collection&#39;s description
*ManagementApi* | [**updateCoupon**](docs/ManagementApi.md#updateCoupon) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/{couponId} | Update coupon
*ManagementApi* | [**updateCouponBatch**](docs/ManagementApi.md#updateCouponBatch) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Update coupons
*ManagementApi* | [**updateLoyaltyCard**](docs/ManagementApi.md#updateLoyaltyCard) | **PUT** /v1/loyalty_programs/{loyaltyProgramId}/cards/{loyaltyCardId} | Update loyalty card status
*ManagementApi* | [**updateReferral**](docs/ManagementApi.md#updateReferral) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals/{referralId} | Update referral
*ManagementApi* | [**updateRoleV2**](docs/ManagementApi.md#updateRoleV2) | **PUT** /v2/roles/{roleId} | Update role
*ManagementApi* | [**updateStore**](docs/ManagementApi.md#updateStore) | **PUT** /v1/applications/{applicationId}/stores/{storeId} | Update store
*ManagementApi* | [**updateUser**](docs/ManagementApi.md#updateUser) | **PUT** /v1/users/{userId} | Update user

## Documentation for models

- [APIError](docs/APIError.md)
- [AcceptCouponEffectProps](docs/AcceptCouponEffectProps.md)
- [AcceptReferralEffectProps](docs/AcceptReferralEffectProps.md)
- [AccessLogEntry](docs/AccessLogEntry.md)
- [Account](docs/Account.md)
- [AccountAdditionalCost](docs/AccountAdditionalCost.md)
- [AccountAnalytics](docs/AccountAnalytics.md)
- [AccountDashboardStatistic](docs/AccountDashboardStatistic.md)
- [AccountDashboardStatisticCampaigns](docs/AccountDashboardStatisticCampaigns.md)
- [AccountDashboardStatisticDiscount](docs/AccountDashboardStatisticDiscount.md)
- [AccountDashboardStatisticLoyaltyPoints](docs/AccountDashboardStatisticLoyaltyPoints.md)
- [AccountDashboardStatisticReferrals](docs/AccountDashboardStatisticReferrals.md)
- [AccountDashboardStatisticRevenue](docs/AccountDashboardStatisticRevenue.md)
- [AccountEntity](docs/AccountEntity.md)
- [AccountLimits](docs/AccountLimits.md)
- [Achievement](docs/Achievement.md)
- [AchievementAdditionalProperties](docs/AchievementAdditionalProperties.md)
- [AchievementBase](docs/AchievementBase.md)
- [AchievementProgress](docs/AchievementProgress.md)
- [AchievementProgressWithDefinition](docs/AchievementProgressWithDefinition.md)
- [AchievementStatusEntry](docs/AchievementStatusEntry.md)
- [AddFreeItemEffectProps](docs/AddFreeItemEffectProps.md)
- [AddItemCatalogAction](docs/AddItemCatalogAction.md)
- [AddLoyaltyPoints](docs/AddLoyaltyPoints.md)
- [AddLoyaltyPointsEffectProps](docs/AddLoyaltyPointsEffectProps.md)
- [AddPriceAdjustmentCatalogAction](docs/AddPriceAdjustmentCatalogAction.md)
- [AddToAudienceEffectProps](docs/AddToAudienceEffectProps.md)
- [AddedDeductedPointsBalancesNotificationPolicy](docs/AddedDeductedPointsBalancesNotificationPolicy.md)
- [AddedDeductedPointsNotification](docs/AddedDeductedPointsNotification.md)
- [AddedDeductedPointsNotificationPolicy](docs/AddedDeductedPointsNotificationPolicy.md)
- [AdditionalCampaignProperties](docs/AdditionalCampaignProperties.md)
- [AdditionalCost](docs/AdditionalCost.md)
- [AnalyticsDataPoint](docs/AnalyticsDataPoint.md)
- [AnalyticsDataPointWithTrend](docs/AnalyticsDataPointWithTrend.md)
- [AnalyticsDataPointWithTrendAndInfluencedRate](docs/AnalyticsDataPointWithTrendAndInfluencedRate.md)
- [AnalyticsDataPointWithTrendAndUplift](docs/AnalyticsDataPointWithTrendAndUplift.md)
- [AnalyticsProduct](docs/AnalyticsProduct.md)
- [AnalyticsSKU](docs/AnalyticsSKU.md)
- [Application](docs/Application.md)
- [ApplicationAPIKey](docs/ApplicationAPIKey.md)
- [ApplicationAnalyticsDataPoint](docs/ApplicationAnalyticsDataPoint.md)
- [ApplicationApiHealth](docs/ApplicationApiHealth.md)
- [ApplicationCIF](docs/ApplicationCIF.md)
- [ApplicationCIFExpression](docs/ApplicationCIFExpression.md)
- [ApplicationCIFReferences](docs/ApplicationCIFReferences.md)
- [ApplicationCampaignAnalytics](docs/ApplicationCampaignAnalytics.md)
- [ApplicationCampaignStats](docs/ApplicationCampaignStats.md)
- [ApplicationCustomer](docs/ApplicationCustomer.md)
- [ApplicationCustomerEntity](docs/ApplicationCustomerEntity.md)
- [ApplicationEntity](docs/ApplicationEntity.md)
- [ApplicationEvent](docs/ApplicationEvent.md)
- [ApplicationNotification](docs/ApplicationNotification.md)
- [ApplicationReferee](docs/ApplicationReferee.md)
- [ApplicationSession](docs/ApplicationSession.md)
- [ApplicationSessionEntity](docs/ApplicationSessionEntity.md)
- [ApplicationStoreEntity](docs/ApplicationStoreEntity.md)
- [AsyncCouponCreationResponse](docs/AsyncCouponCreationResponse.md)
- [AsyncCouponDeletionJobResponse](docs/AsyncCouponDeletionJobResponse.md)
- [AsyncCouponsData](docs/AsyncCouponsData.md)
- [Attribute](docs/Attribute.md)
- [AttributesMandatory](docs/AttributesMandatory.md)
- [AttributesSettings](docs/AttributesSettings.md)
- [Audience](docs/Audience.md)
- [AudienceAnalytics](docs/AudienceAnalytics.md)
- [AudienceCustomer](docs/AudienceCustomer.md)
- [AudienceIntegrationID](docs/AudienceIntegrationID.md)
- [AudienceMembership](docs/AudienceMembership.md)
- [AwardGiveawayEffectProps](docs/AwardGiveawayEffectProps.md)
- [BaseCampaign](docs/BaseCampaign.md)
- [BaseLoyaltyProgram](docs/BaseLoyaltyProgram.md)
- [BaseNotification](docs/BaseNotification.md)
- [BaseNotificationEntity](docs/BaseNotificationEntity.md)
- [BaseNotificationWebhook](docs/BaseNotificationWebhook.md)
- [BaseNotifications](docs/BaseNotifications.md)
- [BaseSamlConnection](docs/BaseSamlConnection.md)
- [Binding](docs/Binding.md)
- [BulkApplicationNotification](docs/BulkApplicationNotification.md)
- [BulkCampaignNotification](docs/BulkCampaignNotification.md)
- [BulkOperationOnCampaigns](docs/BulkOperationOnCampaigns.md)
- [Campaign](docs/Campaign.md)
- [CampaignActivationRequest](docs/CampaignActivationRequest.md)
- [CampaignAnalytics](docs/CampaignAnalytics.md)
- [CampaignBudget](docs/CampaignBudget.md)
- [CampaignCollection](docs/CampaignCollection.md)
- [CampaignCollectionEditedNotification](docs/CampaignCollectionEditedNotification.md)
- [CampaignCollectionWithoutPayload](docs/CampaignCollectionWithoutPayload.md)
- [CampaignCopy](docs/CampaignCopy.md)
- [CampaignCreatedNotification](docs/CampaignCreatedNotification.md)
- [CampaignDeactivationRequest](docs/CampaignDeactivationRequest.md)
- [CampaignDeletedNotification](docs/CampaignDeletedNotification.md)
- [CampaignDetail](docs/CampaignDetail.md)
- [CampaignEditedNotification](docs/CampaignEditedNotification.md)
- [CampaignEntity](docs/CampaignEntity.md)
- [CampaignEvaluationGroup](docs/CampaignEvaluationGroup.md)
- [CampaignEvaluationPosition](docs/CampaignEvaluationPosition.md)
- [CampaignEvaluationTreeChangedMessage](docs/CampaignEvaluationTreeChangedMessage.md)
- [CampaignEvaluationTreeChangedNotification](docs/CampaignEvaluationTreeChangedNotification.md)
- [CampaignGroup](docs/CampaignGroup.md)
- [CampaignGroupEntity](docs/CampaignGroupEntity.md)
- [CampaignNotification](docs/CampaignNotification.md)
- [CampaignNotificationData](docs/CampaignNotificationData.md)
- [CampaignNotificationMessage](docs/CampaignNotificationMessage.md)
- [CampaignNotificationPolicy](docs/CampaignNotificationPolicy.md)
- [CampaignRulesetChangedNotification](docs/CampaignRulesetChangedNotification.md)
- [CampaignSearch](docs/CampaignSearch.md)
- [CampaignSet](docs/CampaignSet.md)
- [CampaignSetBranchNode](docs/CampaignSetBranchNode.md)
- [CampaignSetLeafNode](docs/CampaignSetLeafNode.md)
- [CampaignSetNode](docs/CampaignSetNode.md)
- [CampaignStateChangedNotification](docs/CampaignStateChangedNotification.md)
- [CampaignStoreBudget](docs/CampaignStoreBudget.md)
- [CampaignStoreBudgetLimitConfig](docs/CampaignStoreBudgetLimitConfig.md)
- [CampaignTemplate](docs/CampaignTemplate.md)
- [CampaignTemplateCollection](docs/CampaignTemplateCollection.md)
- [CampaignTemplateCouponReservationSettings](docs/CampaignTemplateCouponReservationSettings.md)
- [CampaignTemplateParams](docs/CampaignTemplateParams.md)
- [CampaignVersions](docs/CampaignVersions.md)
- [CardAddedDeductedPointsBalancesNotificationPolicy](docs/CardAddedDeductedPointsBalancesNotificationPolicy.md)
- [CardAddedDeductedPointsNotification](docs/CardAddedDeductedPointsNotification.md)
- [CardAddedDeductedPointsNotificationPolicy](docs/CardAddedDeductedPointsNotificationPolicy.md)
- [CardExpiringPointsNotificationPolicy](docs/CardExpiringPointsNotificationPolicy.md)
- [CardExpiringPointsNotificationTrigger](docs/CardExpiringPointsNotificationTrigger.md)
- [CardLedgerPointsEntryIntegrationAPI](docs/CardLedgerPointsEntryIntegrationAPI.md)
- [CardLedgerTransactionLogEntry](docs/CardLedgerTransactionLogEntry.md)
- [CardLedgerTransactionLogEntryIntegrationAPI](docs/CardLedgerTransactionLogEntryIntegrationAPI.md)
- [CartItem](docs/CartItem.md)
- [Catalog](docs/Catalog.md)
- [CatalogAction](docs/CatalogAction.md)
- [CatalogActionFilter](docs/CatalogActionFilter.md)
- [CatalogItem](docs/CatalogItem.md)
- [CatalogSyncRequest](docs/CatalogSyncRequest.md)
- [CatalogsStrikethroughNotificationPolicy](docs/CatalogsStrikethroughNotificationPolicy.md)
- [Change](docs/Change.md)
- [ChangeLoyaltyTierLevelEffectProps](docs/ChangeLoyaltyTierLevelEffectProps.md)
- [ChangeProfilePassword](docs/ChangeProfilePassword.md)
- [CodeGeneratorSettings](docs/CodeGeneratorSettings.md)
- [Collection](docs/Collection.md)
- [CollectionItem](docs/CollectionItem.md)
- [CollectionWithoutPayload](docs/CollectionWithoutPayload.md)
- [Coupon](docs/Coupon.md)
- [CouponConstraints](docs/CouponConstraints.md)
- [CouponCreatedEffectProps](docs/CouponCreatedEffectProps.md)
- [CouponCreationJob](docs/CouponCreationJob.md)
- [CouponDeletionFilters](docs/CouponDeletionFilters.md)
- [CouponDeletionJob](docs/CouponDeletionJob.md)
- [CouponEntity](docs/CouponEntity.md)
- [CouponLimitConfigs](docs/CouponLimitConfigs.md)
- [CouponRejectionReason](docs/CouponRejectionReason.md)
- [CouponReservations](docs/CouponReservations.md)
- [CouponSearch](docs/CouponSearch.md)
- [CouponValue](docs/CouponValue.md)
- [CouponsNotificationData](docs/CouponsNotificationData.md)
- [CouponsNotificationPolicy](docs/CouponsNotificationPolicy.md)
- [CreateAchievement](docs/CreateAchievement.md)
- [CreateApplicationAPIKey](docs/CreateApplicationAPIKey.md)
- [CreateCouponData](docs/CreateCouponData.md)
- [CreateManagementKey](docs/CreateManagementKey.md)
- [CreateTemplateCampaign](docs/CreateTemplateCampaign.md)
- [CreateTemplateCampaignResponse](docs/CreateTemplateCampaignResponse.md)
- [CustomEffect](docs/CustomEffect.md)
- [CustomEffectProps](docs/CustomEffectProps.md)
- [CustomerActivityReport](docs/CustomerActivityReport.md)
- [CustomerAnalytics](docs/CustomerAnalytics.md)
- [CustomerInventory](docs/CustomerInventory.md)
- [CustomerProfile](docs/CustomerProfile.md)
- [CustomerProfileAudienceRequest](docs/CustomerProfileAudienceRequest.md)
- [CustomerProfileAudienceRequestItem](docs/CustomerProfileAudienceRequestItem.md)
- [CustomerProfileEntity](docs/CustomerProfileEntity.md)
- [CustomerProfileIntegrationRequestV2](docs/CustomerProfileIntegrationRequestV2.md)
- [CustomerProfileIntegrationResponseV2](docs/CustomerProfileIntegrationResponseV2.md)
- [CustomerProfileSearchQuery](docs/CustomerProfileSearchQuery.md)
- [CustomerProfileUpdateV2Response](docs/CustomerProfileUpdateV2Response.md)
- [CustomerSession](docs/CustomerSession.md)
- [CustomerSessionV2](docs/CustomerSessionV2.md)
- [DeductLoyaltyPoints](docs/DeductLoyaltyPoints.md)
- [DeductLoyaltyPointsEffectProps](docs/DeductLoyaltyPointsEffectProps.md)
- [DeleteCouponsData](docs/DeleteCouponsData.md)
- [DeleteUserRequest](docs/DeleteUserRequest.md)
- [Effect](docs/Effect.md)
- [EffectEntity](docs/EffectEntity.md)
- [EmailEntity](docs/EmailEntity.md)
- [Endpoint](docs/Endpoint.md)
- [Entity](docs/Entity.md)
- [EntityWithTalangVisibleID](docs/EntityWithTalangVisibleID.md)
- [Environment](docs/Environment.md)
- [ErrorEffectProps](docs/ErrorEffectProps.md)
- [ErrorResponse](docs/ErrorResponse.md)
- [ErrorResponseWithStatus](docs/ErrorResponseWithStatus.md)
- [ErrorSource](docs/ErrorSource.md)
- [EvaluableCampaignIds](docs/EvaluableCampaignIds.md)
- [Event](docs/Event.md)
- [EventType](docs/EventType.md)
- [EventV2](docs/EventV2.md)
- [ExpiringCardPointsData](docs/ExpiringCardPointsData.md)
- [ExpiringCardPointsNotification](docs/ExpiringCardPointsNotification.md)
- [ExpiringCouponsData](docs/ExpiringCouponsData.md)
- [ExpiringCouponsNotification](docs/ExpiringCouponsNotification.md)
- [ExpiringCouponsNotificationPolicy](docs/ExpiringCouponsNotificationPolicy.md)
- [ExpiringCouponsNotificationTrigger](docs/ExpiringCouponsNotificationTrigger.md)
- [ExpiringPointsData](docs/ExpiringPointsData.md)
- [ExpiringPointsNotification](docs/ExpiringPointsNotification.md)
- [ExpiringPointsNotificationPolicy](docs/ExpiringPointsNotificationPolicy.md)
- [ExpiringPointsNotificationTrigger](docs/ExpiringPointsNotificationTrigger.md)
- [Export](docs/Export.md)
- [ExtendLoyaltyPointsExpiryDateEffectProps](docs/ExtendLoyaltyPointsExpiryDateEffectProps.md)
- [ExtendedCoupon](docs/ExtendedCoupon.md)
- [FeatureFlag](docs/FeatureFlag.md)
- [FeaturesFeed](docs/FeaturesFeed.md)
- [FuncArgDef](docs/FuncArgDef.md)
- [FunctionDef](docs/FunctionDef.md)
- [GenerateCampaignDescription](docs/GenerateCampaignDescription.md)
- [GenerateCampaignTags](docs/GenerateCampaignTags.md)
- [GenerateItemFilterDescription](docs/GenerateItemFilterDescription.md)
- [GenerateLoyaltyCard](docs/GenerateLoyaltyCard.md)
- [GenerateRuleTitle](docs/GenerateRuleTitle.md)
- [GenerateRuleTitleRule](docs/GenerateRuleTitleRule.md)
- [GetIntegrationCouponRequest](docs/GetIntegrationCouponRequest.md)
- [Giveaway](docs/Giveaway.md)
- [GiveawaysPool](docs/GiveawaysPool.md)
- [HiddenConditionsEffects](docs/HiddenConditionsEffects.md)
- [IdentifiableEntity](docs/IdentifiableEntity.md)
- [ImportEntity](docs/ImportEntity.md)
- [IncreaseAchievementProgressEffectProps](docs/IncreaseAchievementProgressEffectProps.md)
- [InlineResponse200](docs/InlineResponse200.md)
- [InlineResponse2001](docs/InlineResponse2001.md)
- [InlineResponse20010](docs/InlineResponse20010.md)
- [InlineResponse20011](docs/InlineResponse20011.md)
- [InlineResponse20012](docs/InlineResponse20012.md)
- [InlineResponse20013](docs/InlineResponse20013.md)
- [InlineResponse20014](docs/InlineResponse20014.md)
- [InlineResponse20015](docs/InlineResponse20015.md)
- [InlineResponse20016](docs/InlineResponse20016.md)
- [InlineResponse20017](docs/InlineResponse20017.md)
- [InlineResponse20018](docs/InlineResponse20018.md)
- [InlineResponse20019](docs/InlineResponse20019.md)
- [InlineResponse2002](docs/InlineResponse2002.md)
- [InlineResponse20020](docs/InlineResponse20020.md)
- [InlineResponse20021](docs/InlineResponse20021.md)
- [InlineResponse20022](docs/InlineResponse20022.md)
- [InlineResponse20023](docs/InlineResponse20023.md)
- [InlineResponse20024](docs/InlineResponse20024.md)
- [InlineResponse20025](docs/InlineResponse20025.md)
- [InlineResponse20026](docs/InlineResponse20026.md)
- [InlineResponse20027](docs/InlineResponse20027.md)
- [InlineResponse20028](docs/InlineResponse20028.md)
- [InlineResponse20029](docs/InlineResponse20029.md)
- [InlineResponse2003](docs/InlineResponse2003.md)
- [InlineResponse20030](docs/InlineResponse20030.md)
- [InlineResponse20031](docs/InlineResponse20031.md)
- [InlineResponse20032](docs/InlineResponse20032.md)
- [InlineResponse20033](docs/InlineResponse20033.md)
- [InlineResponse20034](docs/InlineResponse20034.md)
- [InlineResponse20035](docs/InlineResponse20035.md)
- [InlineResponse20036](docs/InlineResponse20036.md)
- [InlineResponse20037](docs/InlineResponse20037.md)
- [InlineResponse20038](docs/InlineResponse20038.md)
- [InlineResponse20039](docs/InlineResponse20039.md)
- [InlineResponse2004](docs/InlineResponse2004.md)
- [InlineResponse20040](docs/InlineResponse20040.md)
- [InlineResponse20041](docs/InlineResponse20041.md)
- [InlineResponse20042](docs/InlineResponse20042.md)
- [InlineResponse20043](docs/InlineResponse20043.md)
- [InlineResponse20044](docs/InlineResponse20044.md)
- [InlineResponse20045](docs/InlineResponse20045.md)
- [InlineResponse20046](docs/InlineResponse20046.md)
- [InlineResponse20047](docs/InlineResponse20047.md)
- [InlineResponse20048](docs/InlineResponse20048.md)
- [InlineResponse20049](docs/InlineResponse20049.md)
- [InlineResponse2005](docs/InlineResponse2005.md)
- [InlineResponse2006](docs/InlineResponse2006.md)
- [InlineResponse2007](docs/InlineResponse2007.md)
- [InlineResponse2008](docs/InlineResponse2008.md)
- [InlineResponse2009](docs/InlineResponse2009.md)
- [InlineResponse201](docs/InlineResponse201.md)
- [IntegrationCoupon](docs/IntegrationCoupon.md)
- [IntegrationCustomerProfileAudienceRequest](docs/IntegrationCustomerProfileAudienceRequest.md)
- [IntegrationCustomerProfileAudienceRequestItem](docs/IntegrationCustomerProfileAudienceRequestItem.md)
- [IntegrationCustomerSessionResponse](docs/IntegrationCustomerSessionResponse.md)
- [IntegrationEntity](docs/IntegrationEntity.md)
- [IntegrationEvent](docs/IntegrationEvent.md)
- [IntegrationEventV2Request](docs/IntegrationEventV2Request.md)
- [IntegrationProfileEntity](docs/IntegrationProfileEntity.md)
- [IntegrationRequest](docs/IntegrationRequest.md)
- [IntegrationState](docs/IntegrationState.md)
- [IntegrationStateV2](docs/IntegrationStateV2.md)
- [IntegrationStoreEntity](docs/IntegrationStoreEntity.md)
- [InventoryCoupon](docs/InventoryCoupon.md)
- [InventoryReferral](docs/InventoryReferral.md)
- [ItemAttribute](docs/ItemAttribute.md)
- [LedgerEntry](docs/LedgerEntry.md)
- [LedgerInfo](docs/LedgerInfo.md)
- [LedgerPointsEntryIntegrationAPI](docs/LedgerPointsEntryIntegrationAPI.md)
- [LedgerTransactionLogEntryIntegrationAPI](docs/LedgerTransactionLogEntryIntegrationAPI.md)
- [LibraryAttribute](docs/LibraryAttribute.md)
- [LimitConfig](docs/LimitConfig.md)
- [LimitCounter](docs/LimitCounter.md)
- [ListCampaignStoreBudgets](docs/ListCampaignStoreBudgets.md)
- [ListCampaignStoreBudgetsStore](docs/ListCampaignStoreBudgetsStore.md)
- [LoginParams](docs/LoginParams.md)
- [Loyalty](docs/Loyalty.md)
- [LoyaltyBalance](docs/LoyaltyBalance.md)
- [LoyaltyBalanceWithTier](docs/LoyaltyBalanceWithTier.md)
- [LoyaltyBalances](docs/LoyaltyBalances.md)
- [LoyaltyBalancesWithTiers](docs/LoyaltyBalancesWithTiers.md)
- [LoyaltyCard](docs/LoyaltyCard.md)
- [LoyaltyCardBalances](docs/LoyaltyCardBalances.md)
- [LoyaltyCardBatch](docs/LoyaltyCardBatch.md)
- [LoyaltyCardBatchResponse](docs/LoyaltyCardBatchResponse.md)
- [LoyaltyCardProfileRegistration](docs/LoyaltyCardProfileRegistration.md)
- [LoyaltyCardRegistration](docs/LoyaltyCardRegistration.md)
- [LoyaltyDashboardData](docs/LoyaltyDashboardData.md)
- [LoyaltyDashboardPointsBreakdown](docs/LoyaltyDashboardPointsBreakdown.md)
- [LoyaltyLedger](docs/LoyaltyLedger.md)
- [LoyaltyLedgerEntry](docs/LoyaltyLedgerEntry.md)
- [LoyaltyLedgerEntryFlags](docs/LoyaltyLedgerEntryFlags.md)
- [LoyaltyLedgerTransactions](docs/LoyaltyLedgerTransactions.md)
- [LoyaltyMembership](docs/LoyaltyMembership.md)
- [LoyaltyProgram](docs/LoyaltyProgram.md)
- [LoyaltyProgramBalance](docs/LoyaltyProgramBalance.md)
- [LoyaltyProgramEntity](docs/LoyaltyProgramEntity.md)
- [LoyaltyProgramLedgers](docs/LoyaltyProgramLedgers.md)
- [LoyaltyProgramTransaction](docs/LoyaltyProgramTransaction.md)
- [LoyaltySubLedger](docs/LoyaltySubLedger.md)
- [LoyaltyTier](docs/LoyaltyTier.md)
- [ManagementKey](docs/ManagementKey.md)
- [ManagerConfig](docs/ManagerConfig.md)
- [MessageLogEntries](docs/MessageLogEntries.md)
- [MessageLogEntry](docs/MessageLogEntry.md)
- [MessageLogRequest](docs/MessageLogRequest.md)
- [MessageLogResponse](docs/MessageLogResponse.md)
- [MessageTest](docs/MessageTest.md)
- [Meta](docs/Meta.md)
- [ModelImport](docs/ModelImport.md)
- [ModelReturn](docs/ModelReturn.md)
- [MultiApplicationEntity](docs/MultiApplicationEntity.md)
- [MultipleAttribute](docs/MultipleAttribute.md)
- [MultipleAudiences](docs/MultipleAudiences.md)
- [MultipleAudiencesItem](docs/MultipleAudiencesItem.md)
- [MultipleCustomerProfileIntegrationRequest](docs/MultipleCustomerProfileIntegrationRequest.md)
- [MultipleCustomerProfileIntegrationRequestItem](docs/MultipleCustomerProfileIntegrationRequestItem.md)
- [MultipleCustomerProfileIntegrationResponseV2](docs/MultipleCustomerProfileIntegrationResponseV2.md)
- [MultipleNewAttribute](docs/MultipleNewAttribute.md)
- [MultipleNewAudiences](docs/MultipleNewAudiences.md)
- [MutableEntity](docs/MutableEntity.md)
- [NewAccount](docs/NewAccount.md)
- [NewAccountSignUp](docs/NewAccountSignUp.md)
- [NewAdditionalCost](docs/NewAdditionalCost.md)
- [NewAppWideCouponDeletionJob](docs/NewAppWideCouponDeletionJob.md)
- [NewApplication](docs/NewApplication.md)
- [NewApplicationAPIKey](docs/NewApplicationAPIKey.md)
- [NewApplicationCIF](docs/NewApplicationCIF.md)
- [NewApplicationCIFExpression](docs/NewApplicationCIFExpression.md)
- [NewAttribute](docs/NewAttribute.md)
- [NewAudience](docs/NewAudience.md)
- [NewBaseNotification](docs/NewBaseNotification.md)
- [NewCampaign](docs/NewCampaign.md)
- [NewCampaignCollection](docs/NewCampaignCollection.md)
- [NewCampaignEvaluationGroup](docs/NewCampaignEvaluationGroup.md)
- [NewCampaignGroup](docs/NewCampaignGroup.md)
- [NewCampaignSet](docs/NewCampaignSet.md)
- [NewCampaignStoreBudget](docs/NewCampaignStoreBudget.md)
- [NewCampaignStoreBudgetStoreLimit](docs/NewCampaignStoreBudgetStoreLimit.md)
- [NewCampaignTemplate](docs/NewCampaignTemplate.md)
- [NewCatalog](docs/NewCatalog.md)
- [NewCollection](docs/NewCollection.md)
- [NewCouponCreationJob](docs/NewCouponCreationJob.md)
- [NewCouponDeletionJob](docs/NewCouponDeletionJob.md)
- [NewCoupons](docs/NewCoupons.md)
- [NewCouponsForMultipleRecipients](docs/NewCouponsForMultipleRecipients.md)
- [NewCustomEffect](docs/NewCustomEffect.md)
- [NewCustomerProfile](docs/NewCustomerProfile.md)
- [NewCustomerSession](docs/NewCustomerSession.md)
- [NewCustomerSessionV2](docs/NewCustomerSessionV2.md)
- [NewEvent](docs/NewEvent.md)
- [NewEventType](docs/NewEventType.md)
- [NewExternalInvitation](docs/NewExternalInvitation.md)
- [NewGiveawaysPool](docs/NewGiveawaysPool.md)
- [NewInternalAudience](docs/NewInternalAudience.md)
- [NewInvitation](docs/NewInvitation.md)
- [NewInviteEmail](docs/NewInviteEmail.md)
- [NewLoyaltyProgram](docs/NewLoyaltyProgram.md)
- [NewLoyaltyTier](docs/NewLoyaltyTier.md)
- [NewManagementKey](docs/NewManagementKey.md)
- [NewMessageTest](docs/NewMessageTest.md)
- [NewMultipleAudiencesItem](docs/NewMultipleAudiencesItem.md)
- [NewNotificationWebhook](docs/NewNotificationWebhook.md)
- [NewOutgoingIntegrationWebhook](docs/NewOutgoingIntegrationWebhook.md)
- [NewPassword](docs/NewPassword.md)
- [NewPasswordEmail](docs/NewPasswordEmail.md)
- [NewPicklist](docs/NewPicklist.md)
- [NewPriceAdjustment](docs/NewPriceAdjustment.md)
- [NewPriceType](docs/NewPriceType.md)
- [NewReferral](docs/NewReferral.md)
- [NewReferralsForMultipleAdvocates](docs/NewReferralsForMultipleAdvocates.md)
- [NewReturn](docs/NewReturn.md)
- [NewRevisionVersion](docs/NewRevisionVersion.md)
- [NewRole](docs/NewRole.md)
- [NewRoleV2](docs/NewRoleV2.md)
- [NewRuleset](docs/NewRuleset.md)
- [NewSamlConnection](docs/NewSamlConnection.md)
- [NewSecondaryDeployment](docs/NewSecondaryDeployment.md)
- [NewStore](docs/NewStore.md)
- [NewTemplateDef](docs/NewTemplateDef.md)
- [NewUser](docs/NewUser.md)
- [NewWebhook](docs/NewWebhook.md)
- [Notification](docs/Notification.md)
- [NotificationActivation](docs/NotificationActivation.md)
- [NotificationListItem](docs/NotificationListItem.md)
- [OktaEvent](docs/OktaEvent.md)
- [OktaEventPayload](docs/OktaEventPayload.md)
- [OktaEventPayloadData](docs/OktaEventPayloadData.md)
- [OktaEventTarget](docs/OktaEventTarget.md)
- [OneTimeCode](docs/OneTimeCode.md)
- [OutgoingIntegrationBrazePolicy](docs/OutgoingIntegrationBrazePolicy.md)
- [OutgoingIntegrationCleverTapPolicy](docs/OutgoingIntegrationCleverTapPolicy.md)
- [OutgoingIntegrationConfiguration](docs/OutgoingIntegrationConfiguration.md)
- [OutgoingIntegrationIterablePolicy](docs/OutgoingIntegrationIterablePolicy.md)
- [OutgoingIntegrationMoEngagePolicy](docs/OutgoingIntegrationMoEngagePolicy.md)
- [OutgoingIntegrationTemplate](docs/OutgoingIntegrationTemplate.md)
- [OutgoingIntegrationTemplateWithConfigurationDetails](docs/OutgoingIntegrationTemplateWithConfigurationDetails.md)
- [OutgoingIntegrationTemplates](docs/OutgoingIntegrationTemplates.md)
- [OutgoingIntegrationType](docs/OutgoingIntegrationType.md)
- [OutgoingIntegrationTypes](docs/OutgoingIntegrationTypes.md)
- [PatchItemCatalogAction](docs/PatchItemCatalogAction.md)
- [PatchManyItemsCatalogAction](docs/PatchManyItemsCatalogAction.md)
- [PendingActivePointsData](docs/PendingActivePointsData.md)
- [PendingActivePointsNotification](docs/PendingActivePointsNotification.md)
- [PendingPointsNotificationPolicy](docs/PendingPointsNotificationPolicy.md)
- [Picklist](docs/Picklist.md)
- [PriceDetail](docs/PriceDetail.md)
- [PriceType](docs/PriceType.md)
- [Product](docs/Product.md)
- [ProductSearchMatch](docs/ProductSearchMatch.md)
- [ProductUnitAnalytics](docs/ProductUnitAnalytics.md)
- [ProductUnitAnalyticsDataPoint](docs/ProductUnitAnalyticsDataPoint.md)
- [ProductUnitAnalyticsTotals](docs/ProductUnitAnalyticsTotals.md)
- [ProfileAudiencesChanges](docs/ProfileAudiencesChanges.md)
- [ProjectedTier](docs/ProjectedTier.md)
- [RedeemReferralEffectProps](docs/RedeemReferralEffectProps.md)
- [Referral](docs/Referral.md)
- [ReferralConstraints](docs/ReferralConstraints.md)
- [ReferralCreatedEffectProps](docs/ReferralCreatedEffectProps.md)
- [ReferralRejectionReason](docs/ReferralRejectionReason.md)
- [RejectCouponEffectProps](docs/RejectCouponEffectProps.md)
- [RejectReferralEffectProps](docs/RejectReferralEffectProps.md)
- [RemoveFromAudienceEffectProps](docs/RemoveFromAudienceEffectProps.md)
- [RemoveItemCatalogAction](docs/RemoveItemCatalogAction.md)
- [RemoveManyItemsCatalogAction](docs/RemoveManyItemsCatalogAction.md)
- [ReopenSessionResponse](docs/ReopenSessionResponse.md)
- [ReserveCouponEffectProps](docs/ReserveCouponEffectProps.md)
- [ReturnIntegrationRequest](docs/ReturnIntegrationRequest.md)
- [ReturnedCartItem](docs/ReturnedCartItem.md)
- [Revision](docs/Revision.md)
- [RevisionActivation](docs/RevisionActivation.md)
- [RevisionActivationRequest](docs/RevisionActivationRequest.md)
- [RevisionVersion](docs/RevisionVersion.md)
- [Role](docs/Role.md)
- [RoleAssign](docs/RoleAssign.md)
- [RoleMembership](docs/RoleMembership.md)
- [RoleV2](docs/RoleV2.md)
- [RoleV2ApplicationDetails](docs/RoleV2ApplicationDetails.md)
- [RoleV2Base](docs/RoleV2Base.md)
- [RoleV2PermissionSet](docs/RoleV2PermissionSet.md)
- [RoleV2Permissions](docs/RoleV2Permissions.md)
- [RoleV2RolesGroup](docs/RoleV2RolesGroup.md)
- [RollbackAddedLoyaltyPointsEffectProps](docs/RollbackAddedLoyaltyPointsEffectProps.md)
- [RollbackCouponEffectProps](docs/RollbackCouponEffectProps.md)
- [RollbackDeductedLoyaltyPointsEffectProps](docs/RollbackDeductedLoyaltyPointsEffectProps.md)
- [RollbackDiscountEffectProps](docs/RollbackDiscountEffectProps.md)
- [RollbackIncreasedAchievementProgressEffectProps](docs/RollbackIncreasedAchievementProgressEffectProps.md)
- [RollbackReferralEffectProps](docs/RollbackReferralEffectProps.md)
- [Rule](docs/Rule.md)
- [RuleFailureReason](docs/RuleFailureReason.md)
- [Ruleset](docs/Ruleset.md)
- [SSOConfig](docs/SSOConfig.md)
- [SamlConnection](docs/SamlConnection.md)
- [SamlConnectionInternal](docs/SamlConnectionInternal.md)
- [SamlConnectionMetadata](docs/SamlConnectionMetadata.md)
- [SamlLoginEndpoint](docs/SamlLoginEndpoint.md)
- [ScimBaseGroup](docs/ScimBaseGroup.md)
- [ScimBaseUser](docs/ScimBaseUser.md)
- [ScimBaseUserName](docs/ScimBaseUserName.md)
- [ScimGroup](docs/ScimGroup.md)
- [ScimGroupMember](docs/ScimGroupMember.md)
- [ScimGroupsListResponse](docs/ScimGroupsListResponse.md)
- [ScimNewUser](docs/ScimNewUser.md)
- [ScimPatchOperation](docs/ScimPatchOperation.md)
- [ScimPatchRequest](docs/ScimPatchRequest.md)
- [ScimResource](docs/ScimResource.md)
- [ScimResourceTypesListResponse](docs/ScimResourceTypesListResponse.md)
- [ScimSchemaResource](docs/ScimSchemaResource.md)
- [ScimSchemasListResponse](docs/ScimSchemasListResponse.md)
- [ScimServiceProviderConfigResponse](docs/ScimServiceProviderConfigResponse.md)
- [ScimServiceProviderConfigResponseBulk](docs/ScimServiceProviderConfigResponseBulk.md)
- [ScimServiceProviderConfigResponseChangePassword](docs/ScimServiceProviderConfigResponseChangePassword.md)
- [ScimServiceProviderConfigResponseFilter](docs/ScimServiceProviderConfigResponseFilter.md)
- [ScimServiceProviderConfigResponsePatch](docs/ScimServiceProviderConfigResponsePatch.md)
- [ScimServiceProviderConfigResponseSort](docs/ScimServiceProviderConfigResponseSort.md)
- [ScimUser](docs/ScimUser.md)
- [ScimUsersListResponse](docs/ScimUsersListResponse.md)
- [SecondaryDeployment](docs/SecondaryDeployment.md)
- [Session](docs/Session.md)
- [SetDiscountEffectProps](docs/SetDiscountEffectProps.md)
- [SetDiscountPerAdditionalCostEffectProps](docs/SetDiscountPerAdditionalCostEffectProps.md)
- [SetDiscountPerAdditionalCostPerItemEffectProps](docs/SetDiscountPerAdditionalCostPerItemEffectProps.md)
- [SetDiscountPerItemEffectProps](docs/SetDiscountPerItemEffectProps.md)
- [ShowBundleMetadataEffectProps](docs/ShowBundleMetadataEffectProps.md)
- [ShowNotificationEffectProps](docs/ShowNotificationEffectProps.md)
- [SkuUnitAnalytics](docs/SkuUnitAnalytics.md)
- [SkuUnitAnalyticsDataPoint](docs/SkuUnitAnalyticsDataPoint.md)
- [SlotDef](docs/SlotDef.md)
- [Store](docs/Store.md)
- [StrikethroughChangedItem](docs/StrikethroughChangedItem.md)
- [StrikethroughCustomEffectPerItemProps](docs/StrikethroughCustomEffectPerItemProps.md)
- [StrikethroughDebugResponse](docs/StrikethroughDebugResponse.md)
- [StrikethroughEffect](docs/StrikethroughEffect.md)
- [StrikethroughLabelingNotification](docs/StrikethroughLabelingNotification.md)
- [StrikethroughSetDiscountPerItemEffectProps](docs/StrikethroughSetDiscountPerItemEffectProps.md)
- [StrikethroughTrigger](docs/StrikethroughTrigger.md)
- [SummaryCampaignStoreBudget](docs/SummaryCampaignStoreBudget.md)
- [TalangAttribute](docs/TalangAttribute.md)
- [TalangAttributeVisibility](docs/TalangAttributeVisibility.md)
- [TemplateArgDef](docs/TemplateArgDef.md)
- [TemplateDef](docs/TemplateDef.md)
- [TemplateLimitConfig](docs/TemplateLimitConfig.md)
- [Tier](docs/Tier.md)
- [TierDowngradeData](docs/TierDowngradeData.md)
- [TierDowngradeNotification](docs/TierDowngradeNotification.md)
- [TierDowngradeNotificationPolicy](docs/TierDowngradeNotificationPolicy.md)
- [TierUpgradeData](docs/TierUpgradeData.md)
- [TierUpgradeNotification](docs/TierUpgradeNotification.md)
- [TierUpgradeNotificationPolicy](docs/TierUpgradeNotificationPolicy.md)
- [TierWillDowngradeData](docs/TierWillDowngradeData.md)
- [TierWillDowngradeNotification](docs/TierWillDowngradeNotification.md)
- [TierWillDowngradeNotificationPolicy](docs/TierWillDowngradeNotificationPolicy.md)
- [TierWillDowngradeNotificationTrigger](docs/TierWillDowngradeNotificationTrigger.md)
- [TimePoint](docs/TimePoint.md)
- [TrackEventV2Response](docs/TrackEventV2Response.md)
- [TransferLoyaltyCard](docs/TransferLoyaltyCard.md)
- [TriggerWebhookEffectProps](docs/TriggerWebhookEffectProps.md)
- [TwoFAConfig](docs/TwoFAConfig.md)
- [UpdateAccount](docs/UpdateAccount.md)
- [UpdateAchievement](docs/UpdateAchievement.md)
- [UpdateApplication](docs/UpdateApplication.md)
- [UpdateApplicationAPIKey](docs/UpdateApplicationAPIKey.md)
- [UpdateApplicationCIF](docs/UpdateApplicationCIF.md)
- [UpdateAttributeEffectProps](docs/UpdateAttributeEffectProps.md)
- [UpdateAudience](docs/UpdateAudience.md)
- [UpdateCampaign](docs/UpdateCampaign.md)
- [UpdateCampaignCollection](docs/UpdateCampaignCollection.md)
- [UpdateCampaignEvaluationGroup](docs/UpdateCampaignEvaluationGroup.md)
- [UpdateCampaignGroup](docs/UpdateCampaignGroup.md)
- [UpdateCampaignTemplate](docs/UpdateCampaignTemplate.md)
- [UpdateCatalog](docs/UpdateCatalog.md)
- [UpdateCollection](docs/UpdateCollection.md)
- [UpdateCoupon](docs/UpdateCoupon.md)
- [UpdateCouponBatch](docs/UpdateCouponBatch.md)
- [UpdateCouponsData](docs/UpdateCouponsData.md)
- [UpdateLoyaltyCard](docs/UpdateLoyaltyCard.md)
- [UpdateLoyaltyProgram](docs/UpdateLoyaltyProgram.md)
- [UpdateLoyaltyProgramTier](docs/UpdateLoyaltyProgramTier.md)
- [UpdatePicklist](docs/UpdatePicklist.md)
- [UpdateReferral](docs/UpdateReferral.md)
- [UpdateReferralBatch](docs/UpdateReferralBatch.md)
- [UpdateRole](docs/UpdateRole.md)
- [UpdateStore](docs/UpdateStore.md)
- [UpdateUser](docs/UpdateUser.md)
- [User](docs/User.md)
- [UserEntity](docs/UserEntity.md)
- [ValueMap](docs/ValueMap.md)
- [Webhook](docs/Webhook.md)
- [WebhookAuthentication](docs/WebhookAuthentication.md)
- [WebhookAuthenticationBase](docs/WebhookAuthenticationBase.md)
- [WebhookAuthenticationDataBasic](docs/WebhookAuthenticationDataBasic.md)
- [WebhookAuthenticationDataCustom](docs/WebhookAuthenticationDataCustom.md)
- [WebhookAuthenticationWebhookRef](docs/WebhookAuthenticationWebhookRef.md)
- [WebhookWithOutgoingIntegrationDetails](docs/WebhookWithOutgoingIntegrationDetails.md)
- [WillAwardGiveawayEffectProps](docs/WillAwardGiveawayEffectProps.md)

## Authorization

Authentication schemes defined for the API:

### api_key_v1

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### management_key

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### manager_auth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
