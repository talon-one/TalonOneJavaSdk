/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you access the Campaign Manager at `https://yourbaseurl.talon.one/`, the URL for the [updateCustomerSessionV2](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint is `https://yourbaseurl.talon.one/v2/customer_sessions/{Id}` 
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package one.talon.api;

import one.talon.ApiException;
import one.talon.model.Audience;
import one.talon.model.Catalog;
import one.talon.model.CatalogSyncRequest;
import one.talon.model.Coupon;
import one.talon.model.CouponReservations;
import one.talon.model.CustomerInventory;
import one.talon.model.CustomerProfileAudienceRequest;
import one.talon.model.CustomerProfileIntegrationRequestV2;
import one.talon.model.CustomerProfileIntegrationResponseV2;
import one.talon.model.ErrorResponse;
import one.talon.model.ErrorResponseWithStatus;
import one.talon.model.InlineResponse200;
import one.talon.model.InlineResponse2001;
import one.talon.model.InlineResponse2002;
import one.talon.model.InlineResponse2003;
import one.talon.model.InlineResponse2004;
import one.talon.model.InlineResponse201;
import one.talon.model.IntegrationCustomerSessionResponse;
import one.talon.model.IntegrationEventV2Request;
import one.talon.model.IntegrationRequest;
import one.talon.model.IntegrationStateV2;
import one.talon.model.LoyaltyBalances;
import one.talon.model.LoyaltyCard;
import one.talon.model.LoyaltyCardBalances;
import one.talon.model.LoyaltyCardRegistration;
import one.talon.model.MultipleCustomerProfileIntegrationRequest;
import one.talon.model.MultipleCustomerProfileIntegrationResponseV2;
import one.talon.model.NewAudience;
import one.talon.model.NewReferral;
import one.talon.model.NewReferralsForMultipleAdvocates;
import org.threeten.bp.OffsetDateTime;
import one.talon.model.Referral;
import one.talon.model.ReopenSessionResponse;
import one.talon.model.ReturnIntegrationRequest;
import one.talon.model.TrackEventV2Response;
import one.talon.model.UpdateAudience;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationApi
 */
@Ignore
public class IntegrationApiTest {

    private final IntegrationApi api = new IntegrationApi();

    
    /**
     * Create audience
     *
     * Create an audience. The audience can be created directly from scratch or can come from third party platforms.  **Note:** Audiences can also be created from scratch via the Campaign Manager. See the [docs](https://docs.talon.one/docs/product/audiences/creating-audiences).  To create an audience from an existing audience from a [technology partner](https://docs.talon.one/docs/dev/technology-partners/overview): 1. Set the &#x60;integration&#x60; property to &#x60;mparticle&#x60;, &#x60;segment&#x60; etc., depending on a third-party platform. 1. Set &#x60;integrationId&#x60; to the ID of this audience in a third-party platform.  To create an audience from an existing audience in another platform: 1. Do not use the &#x60;integration&#x60; property. 1. Set &#x60;integrationId&#x60; to the ID of this audience in the 3rd-party platform.  To create an audience from scratch: 1. Only set the &#x60;name&#x60; property.  Once you create your first audience, audience-specific rule conditions are enabled in the Rule Builder. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAudienceV2Test() throws ApiException {
        NewAudience body = null;
        Audience response = api.createAudienceV2(body);

        // TODO: test validations
    }
    
    /**
     * Create coupon reservation
     *
     * Create a coupon reservation for the specified customer profiles on the specified coupon. You can also create a reservation via the Campaign Manager using the [Create coupon code reservation effect](https://docs.talon.one/docs/product/rules/effects/using-effects#reserving-a-coupon-code).  - If the **Reservation mandatory** option was selected when creating the specified coupon, the endpoint creates a **hard** reservation, meaning only users who have this coupon code reserved can redeem it. Otherwise, the endpoint creates a **soft** reservation, meaning the coupon will be associated with the specified customer profiles (they show up when using the [List customer data](https://docs.talon.one/integration-api#operation/getCustomerInventory) endpoint), but any user can redeem it. This can be useful, for example, to display a _coupon wallet_ for customers when they visit your store.  - If the **Coupon visibility** option was selected when creating the specified coupon, the coupon code is implicitly soft-reserved for all customers, and the code will be returned for all customer profiles in the [List customer data](https://docs.talon.one/integration-api#operation/getCustomerInventory) endpoint.  To delete a reservation, use the [Delete reservation](https://docs.talon.one/integration-api#tag/Coupons/operation/deleteCouponReservation) endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCouponReservationTest() throws ApiException {
        String couponValue = null;
        CouponReservations body = null;
        Coupon response = api.createCouponReservation(couponValue, body);

        // TODO: test validations
    }
    
    /**
     * Create referral code for an advocate
     *
     * Creates a referral code for an advocate. The code will be valid for the referral campaign for which is created, indicated in the &#x60;campaignId&#x60; parameter, and will be associated with the profile specified in the &#x60;advocateProfileIntegrationId&#x60; parameter as the advocate&#39;s profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReferralTest() throws ApiException {
        NewReferral body = null;
        Referral response = api.createReferral(body);

        // TODO: test validations
    }
    
    /**
     * Create referral codes for multiple advocates
     *
     * Creates unique referral codes for multiple advocates. The code will be valid for the referral campaign for which it is created, indicated in the &#x60;campaignId&#x60; parameter, and one referral code will be associated with one advocate using the profile specified in the &#x60;advocateProfileIntegrationId&#x60; parameter as the advocate&#39;s profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReferralsForMultipleAdvocatesTest() throws ApiException {
        NewReferralsForMultipleAdvocates body = null;
        String silent = null;
        InlineResponse201 response = api.createReferralsForMultipleAdvocates(body, silent);

        // TODO: test validations
    }
    
    /**
     * Delete audience memberships
     *
     * Remove all members from this audience. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAudienceMembershipsV2Test() throws ApiException {
        Integer audienceId = null;
        api.deleteAudienceMembershipsV2(audienceId);

        // TODO: test validations
    }
    
    /**
     * Delete audience
     *
     * Delete an audience created by a third-party integration.  **Warning:** This endpoint also removes any associations recorded between a customer profile and this audience.  **Note:** Audiences can also be deleted via the Campaign Manager. See the [docs](https://docs.talon.one/docs/product/audiences/managing-audiences#deleting-an-audience). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAudienceV2Test() throws ApiException {
        Integer audienceId = null;
        api.deleteAudienceV2(audienceId);

        // TODO: test validations
    }
    
    /**
     * Delete coupon reservations
     *
     * Remove all the coupon reservations from the provided customer profile integration IDs and the provided coupon code. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCouponReservationTest() throws ApiException {
        String couponValue = null;
        CouponReservations body = null;
        api.deleteCouponReservation(couponValue, body);

        // TODO: test validations
    }
    
    /**
     * Delete customer&#39;s personal data
     *
     * Delete all attributes on the customer profile and on entities that reference this customer profile.  **Important:** To preserve performance, we recommend avoiding deleting customer data during peak-traffic hours. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerDataTest() throws ApiException {
        String integrationId = null;
        api.deleteCustomerData(integrationId);

        // TODO: test validations
    }
    
    /**
     * List customer data
     *
     * Return the customer inventory regarding entities referencing this customer profile&#39;s &#x60;integrationId&#x60;.  Typical entities returned are: customer profile information, referral codes, loyalty points, loyalty cards and reserved coupons. Reserved coupons also include redeemed coupons. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerInventoryTest() throws ApiException {
        String integrationId = null;
        Boolean profile = null;
        Boolean referrals = null;
        Boolean coupons = null;
        Boolean loyalty = null;
        Boolean giveaways = null;
        Boolean achievements = null;
        CustomerInventory response = api.getCustomerInventory(integrationId, profile, referrals, coupons, loyalty, giveaways, achievements);

        // TODO: test validations
    }
    
    /**
     * Get customer session
     *
     * Get the details of the given customer session.  You can get the same data via other endpoints that also apply changes, which can help you save requests and increase performance. See:  - [Update customer session](#tag/Customer-sessions/operation/updateCustomerSessionV2) - [Update customer profile](#tag/Customer-profiles/operation/updateCustomerProfileV2) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerSessionTest() throws ApiException {
        String customerSessionId = null;
        IntegrationCustomerSessionResponse response = api.getCustomerSession(customerSessionId);

        // TODO: test validations
    }
    
    /**
     * Get customer&#39;s loyalty points
     *
     * Retrieve loyalty ledger balances for the given Integration ID in the specified loyalty program. You can filter balances by date and subledger ID.  **Note**: If no filtering options are applied, you retrieve all loyalty balances on the current date for the given integration ID.  Loyalty balances are calculated when Talon.One receives your request using the points stored in our database, so retrieving a large number of balances at once can impact performance.  For more information, see: - [Managing card-based loyalty program data](https://docs.talon.one/docs/product/loyalty-programs/card-based/managing-loyalty-cards) - [Managing profile-based loyalty program data](https://docs.talon.one/docs/product/loyalty-programs/profile-based/managing-pb-lp-data) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyBalancesTest() throws ApiException {
        Integer loyaltyProgramId = null;
        String integrationId = null;
        OffsetDateTime endDate = null;
        String subledgerId = null;
        LoyaltyBalances response = api.getLoyaltyBalances(loyaltyProgramId, integrationId, endDate, subledgerId);

        // TODO: test validations
    }
    
    /**
     * Get card&#39;s point balances
     *
     * Retrieve loyalty balances for the given loyalty card in the specified loyalty program with filtering options applied. If no filtering options are applied, all loyalty balances for the given loyalty card are returned. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyCardBalancesTest() throws ApiException {
        Integer loyaltyProgramId = null;
        String loyaltyCardId = null;
        OffsetDateTime endDate = null;
        List<String> subledgerId = null;
        LoyaltyCardBalances response = api.getLoyaltyCardBalances(loyaltyProgramId, loyaltyCardId, endDate, subledgerId);

        // TODO: test validations
    }
    
    /**
     * List card&#39;s unused loyalty points
     *
     * Get paginated results of loyalty points for a given loyalty card identifier in a card-based loyalty program. This endpoint returns only the balances of unused points on a loyalty card.  You can filter points by status: - &#x60;active&#x60;: Points ready to be redeemed. - &#x60;pending&#x60;: Points with a start date in the future. - &#x60;expired&#x60;: Points with an expiration date in the past. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyCardPointsTest() throws ApiException {
        Integer loyaltyProgramId = null;
        String loyaltyCardId = null;
        String status = null;
        List<String> subledgerId = null;
        Integer pageSize = null;
        Integer skip = null;
        InlineResponse2003 response = api.getLoyaltyCardPoints(loyaltyProgramId, loyaltyCardId, status, subledgerId, pageSize, skip);

        // TODO: test validations
    }
    
    /**
     * List card&#39;s transactions
     *
     * Retrieve loyalty transaction logs for the given loyalty card in the specified loyalty program with filtering options applied. If no filtering options are applied, the last 50 loyalty transactions for the given loyalty card are returned. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyCardTransactionsTest() throws ApiException {
        Integer loyaltyProgramId = null;
        String loyaltyCardId = null;
        List<String> subledgerId = null;
        String loyaltyTransactionType = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        Integer pageSize = null;
        Integer skip = null;
        InlineResponse2001 response = api.getLoyaltyCardTransactions(loyaltyProgramId, loyaltyCardId, subledgerId, loyaltyTransactionType, startDate, endDate, pageSize, skip);

        // TODO: test validations
    }
    
    /**
     * List customer&#39;s unused loyalty points
     *
     * Get paginated results of loyalty points for a given Integration ID in the specified profile-based loyalty program. This endpoint returns only the balances of unused points linked to a customer profile.  You can filter points by status: - &#x60;active&#x60;: Points ready to be redeemed. - &#x60;pending&#x60;: Points with a start date in the future. - &#x60;expired&#x60;: Points with an expiration date in the past. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyProgramProfilePointsTest() throws ApiException {
        Integer loyaltyProgramId = null;
        String integrationId = null;
        String status = null;
        String subledgerId = null;
        Integer pageSize = null;
        Integer skip = null;
        InlineResponse2004 response = api.getLoyaltyProgramProfilePoints(loyaltyProgramId, integrationId, status, subledgerId, pageSize, skip);

        // TODO: test validations
    }
    
    /**
     * List customer&#39;s loyalty transactions
     *
     * Retrieve paginated results of loyalty transaction logs for the given Integration ID in the specified loyalty program.  You can filter transactions by date. If no filters are applied, the last 50 loyalty transactions for the given integration ID are returned.  **Note:** To retrieve all loyalty program transaction logs in a given loyalty program, use the [List loyalty program transactions](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyProgramTransactions) endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyProgramProfileTransactionsTest() throws ApiException {
        Integer loyaltyProgramId = null;
        String integrationId = null;
        String subledgerId = null;
        String loyaltyTransactionType = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        Integer pageSize = null;
        Integer skip = null;
        InlineResponse2002 response = api.getLoyaltyProgramProfileTransactions(loyaltyProgramId, integrationId, subledgerId, loyaltyTransactionType, startDate, endDate, pageSize, skip);

        // TODO: test validations
    }
    
    /**
     * List customers that have this coupon reserved
     *
     * Return all customers that have this coupon marked as reserved. This includes hard and soft reservations. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReservedCustomersTest() throws ApiException {
        String couponValue = null;
        InlineResponse200 response = api.getReservedCustomers(couponValue);

        // TODO: test validations
    }
    
    /**
     * Link customer profile to card
     *
     * [Loyalty cards](https://docs.talon.one/docs/product/loyalty-programs/card-based/card-based-overview) allow customers to collect and spend loyalty points within a [card-based loyalty program](https://docs.talon.one/docs/product/loyalty-programs/overview#loyalty-program-types). They are useful to gamify loyalty programs and can be used with or without customer profiles linked to them.  Link a customer profile to a given loyalty card for the card to be set as **Registered**. This affects how it can be used. See the [docs](https://docs.talon.one/docs/product/loyalty-programs/card-based/managing-loyalty-cards#linking-customer-profiles-to-a-loyalty-card).  **Note:** You can link as many customer profiles to a given loyalty card as the [**card user limit**](https://docs.talon.one/docs/product/loyalty-programs/card-based/creating-cb-programs) allows. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linkLoyaltyCardToProfileTest() throws ApiException {
        Integer loyaltyProgramId = null;
        String loyaltyCardId = null;
        LoyaltyCardRegistration body = null;
        LoyaltyCard response = api.linkLoyaltyCardToProfile(loyaltyProgramId, loyaltyCardId, body);

        // TODO: test validations
    }
    
    /**
     * Reopen customer session
     *
     * Reopen a closed [customer session](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions). For example, if a session has been completed but still needs to be edited, you can reopen it with this endpoint. A reopen session is treated like a standard open session.  When reopening a session: - The &#x60;talon_session_reopened&#x60; event is triggered. You can see it in the **Events** view in the Campaign Manager. - The session state is updated to &#x60;open&#x60;. - Modified budgets and triggered effects when the session was closed are rolled back except for the list below.  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Effects and budgets unimpacted by a session reopening&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;     &lt;p&gt;The following effects and budgets are left the way they were once the session was originally closed:&lt;/p&gt;     &lt;ul&gt;       &lt;li&gt;Add free item effect&lt;/li&gt;       &lt;li&gt;Any &lt;strong&gt;non-pending&lt;/strong&gt; loyalty points&lt;/li&gt;       &lt;li&gt;Award giveaway&lt;/li&gt;       &lt;li&gt;Coupon and referral creation&lt;/li&gt;       &lt;li&gt;Coupon reservation&lt;/li&gt;       &lt;li&gt;Custom effect&lt;/li&gt;       &lt;li&gt;Update attribute value&lt;/li&gt;       &lt;li&gt;Update cart item attribute value&lt;/li&gt;     &lt;/ul&gt;   &lt;/div&gt; &lt;p&gt;To see an example of roll back, see the &lt;a href&#x3D;\&quot;https://docs.talon.one/docs/dev/tutorials/rolling-back-effects\&quot;&gt;Cancelling a session with campaign budgets tutorial&lt;/a&gt;.&lt;/p&gt; &lt;/details&gt;  **Note:** If your order workflow requires you to create a new session instead of reopening a session, use the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint to cancel a closed session and create a new one. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reopenCustomerSessionTest() throws ApiException {
        String customerSessionId = null;
        ReopenSessionResponse response = api.reopenCustomerSession(customerSessionId);

        // TODO: test validations
    }
    
    /**
     * Return cart items
     *
     * Create a new return request for the specified cart items.  This endpoint automatically changes the session state from &#x60;closed&#x60; to &#x60;partially_returned&#x60;.  **Note:** This will roll back any effects associated with these cart items. For more information, see [our documentation on session states](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions#customer-session-states) and [this tutorial](https://docs.talon.one/docs/dev/tutorials/partially-returning-a-session). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void returnCartItemsTest() throws ApiException {
        String customerSessionId = null;
        ReturnIntegrationRequest body = null;
        Boolean dry = null;
        IntegrationStateV2 response = api.returnCartItems(customerSessionId, body, dry);

        // TODO: test validations
    }
    
    /**
     * Sync cart item catalog
     *
     * Perform one or more of the following actions for a given cart item catalog:  - Adding an item to the catalog. - Adding several items to the catalog. - Editing the attributes of an item in the catalog. - Editing the attributes of several items in the catalog. - Removing an item from the catalog. - Removing several items from the catalog.  You can add, update, or delete up to 1000 cart items in a single request. Each item synced to a catalog must have a unique &#x60;SKU&#x60;.  **Important**: Syncing items with duplicate &#x60;SKU&#x60; values in a single request returns an error message with a &#x60;400&#x60; status code.  For more information, read [managing cart item catalogs](https://docs.talon.one/docs/product/account/dev-tools/managing-cart-item-catalogs).  ### Filtering cart items  Use [cart item attributes](https://docs.talon.one/docs/product/account/dev-tools/managing-attributes) to filter items and select the ones you want to edit or delete when editing or deleting more than one item at a time.  The &#x60;filters&#x60; array contains an object with the following properties:  - &#x60;attr&#x60;: A [cart item attribute](https://docs.talon.one/docs/product/account/dev-tools/managing-attributes)   connected to the catalog. It is applied to all items in the catalog. - &#x60;op&#x60;: The filtering operator indicating the relationship between the value of each   cart item in the catalog and the value of the &#x60;value&#x60; property for the attribute selected   in &#x60;attr&#x60;.    The value of &#x60;op&#x60; can be one of the following:    - &#x60;EQ&#x60;: Equal to &#x60;value&#x60;   - &#x60;LT&#x60;: Less than &#x60;value&#x60;   - &#x60;LE&#x60;: Less than or equal to &#x60;value&#x60;   - &#x60;GT&#x60;: Greater than &#x60;value&#x60;   - &#x60;GE&#x60;: Greater than or equal to &#x60;value&#x60;   - &#x60;IN&#x60;: One of the comma-separated values that &#x60;value&#x60; is set to.    **Note:** &#x60;GE&#x60;, &#x60;LE&#x60;, &#x60;GT&#x60;, &#x60;LT&#x60; are for numeric values only.  - &#x60;value&#x60;: The value of the attribute selected in &#x60;attr&#x60;.  ### Payload examples  Synchronization actions are sent as &#x60;PUT&#x60; requests. See the structure for each action:  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Adding an item to the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;attributes\&quot;: {             \&quot;color\&quot;: \&quot;Navy blue\&quot;,             \&quot;type\&quot;: \&quot;shoes\&quot;           },           \&quot;replaceIfExists\&quot;: true,           \&quot;sku\&quot;: \&quot;SKU1241028\&quot;,           \&quot;price\&quot;: 100,           \&quot;product\&quot;: {             \&quot;name\&quot;: \&quot;sneakers\&quot;           }         },         \&quot;type\&quot;: \&quot;ADD\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Adding several items to the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;attributes\&quot;: {             \&quot;color\&quot;: \&quot;Navy blue\&quot;,             \&quot;type\&quot;: \&quot;shoes\&quot;           },           \&quot;replaceIfExists\&quot;: true,           \&quot;sku\&quot;: \&quot;SKU1241027\&quot;,           \&quot;price\&quot;: 100,           \&quot;product\&quot;: {             \&quot;name\&quot;: \&quot;sneakers\&quot;           }         },         \&quot;type\&quot;: \&quot;ADD\&quot;       },       {         \&quot;payload\&quot;: {           \&quot;attributes\&quot;: {             \&quot;color\&quot;: \&quot;Navy blue\&quot;,             \&quot;type\&quot;: \&quot;shoes\&quot;           },           \&quot;replaceIfExists\&quot;: true,           \&quot;sku\&quot;: \&quot;SKU1241028\&quot;,           \&quot;price\&quot;: 100,           \&quot;product\&quot;: {             \&quot;name\&quot;: \&quot;sneakers\&quot;           }         },         \&quot;type\&quot;: \&quot;ADD\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Editing the attributes of an item in the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;attributes\&quot;: {             \&quot;age\&quot;: 11,             \&quot;origin\&quot;: \&quot;germany\&quot;           },           \&quot;createIfNotExists\&quot;: false,           \&quot;sku\&quot;: \&quot;SKU1241028\&quot;,           \&quot;product\&quot;: {             \&quot;name\&quot;: \&quot;sneakers\&quot;           }         },         \&quot;type\&quot;: \&quot;PATCH\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Editing the attributes of several items in the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;attributes\&quot;: {             \&quot;color\&quot;: \&quot;red\&quot;           },           \&quot;filters\&quot;: [             {               \&quot;attr\&quot;: \&quot;color\&quot;,               \&quot;op\&quot;: \&quot;EQ\&quot;,               \&quot;value\&quot;: \&quot;blue\&quot;             }           ]         },         \&quot;type\&quot;: \&quot;PATCH_MANY\&quot;       }     ]   }   &#x60;&#x60;&#x60;    &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Removing an item from the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;sku\&quot;: \&quot;SKU1241028\&quot;         },         \&quot;type\&quot;: \&quot;REMOVE\&quot;       }     ]   }   &#x60;&#x60;&#x60;    &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Removing several items from the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;filters\&quot;: [             {               \&quot;attr\&quot;: \&quot;color\&quot;,               \&quot;op\&quot;: \&quot;EQ\&quot;,               \&quot;value\&quot;: \&quot;blue\&quot;             }           ]         },         \&quot;type\&quot;: \&quot;REMOVE_MANY\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Removing shoes of sizes above 45 from the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;   &lt;p&gt;   Let&#39;s imagine that we have a shoe store and we have decided to stop selling   shoes larger than size 45. We can remove from the catalog all the shoes of sizes above 45   with a single action:&lt;/p&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;filters\&quot;: [             {               \&quot;attr\&quot;: \&quot;size\&quot;,               \&quot;op\&quot;: \&quot;GT\&quot;,               \&quot;value\&quot;: \&quot;45\&quot;             }           ]         },         \&quot;type\&quot;: \&quot;REMOVE_MANY\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void syncCatalogTest() throws ApiException {
        Integer catalogId = null;
        CatalogSyncRequest body = null;
        Catalog response = api.syncCatalog(catalogId, body);

        // TODO: test validations
    }
    
    /**
     * Track event
     *
     * Triggers a custom event.  To use this endpoint: 1. Define a [custom event](https://docs.talon.one/docs/dev/concepts/entities/events#creating-a-custom-event) in the Campaign Manager. 1. Update or create a rule to check for this event. 1. Trigger the event with this endpoint. After you have successfully sent an event to Talon.One, you can list the received events in the **Events** view in the Campaign Manager.  Talon.One also offers a set of [built-in events](https://docs.talon.one/docs/dev/concepts/entities/events). Ensure you do not create a custom event when you can use a built-in event.  For example, use this endpoint to trigger an event when a customer shares a link to a product. See the [tutorial](https://docs.talon.one/docs/product/tutorials/referrals/incentivizing-product-link-sharing).  &lt;div class&#x3D;\&quot;redoc-section\&quot;&gt;    &lt;p class&#x3D;\&quot;title\&quot;&gt;Important&lt;/p&gt;    1. &#x60;profileId&#x60; is required even though the schema does not say it.   1. If the customer profile ID is new, a new profile is automatically created but the &#x60;customer_profile_created&#x60; [built-in event ](https://docs.talon.one/docs/dev/concepts/entities/events) is **not** triggered.   1. We recommend sending requests sequentially. See [Managing parallel requests](https://docs.talon.one/docs/dev/getting-started/integration-tutorial#managing-parallel-requests).  &lt;/div&gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void trackEventV2Test() throws ApiException {
        IntegrationEventV2Request body = null;
        String silent = null;
        Boolean dry = null;
        TrackEventV2Response response = api.trackEventV2(body, silent, dry);

        // TODO: test validations
    }
    
    /**
     * Update profile attributes for all customers in audience
     *
     * Update the specified profile attributes to the provided values for all customers in the specified audience. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAudienceCustomersAttributesTest() throws ApiException {
        Integer audienceId = null;
        Object body = null;
        api.updateAudienceCustomersAttributes(audienceId, body);

        // TODO: test validations
    }
    
    /**
     * Update audience name
     *
     * Update the name of the given audience created by a third-party integration. Sending a request to this endpoint does **not** trigger the Rule Engine.  To update the audience&#39;s members, use the [Update customer profile](#tag/Customer-profiles/operation/updateCustomerProfileV2) endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAudienceV2Test() throws ApiException {
        Integer audienceId = null;
        UpdateAudience body = null;
        Audience response = api.updateAudienceV2(audienceId, body);

        // TODO: test validations
    }
    
    /**
     * Update multiple customer profiles&#39; audiences
     *
     * Add customer profiles to or remove them from an audience.  The endpoint supports 1000 audience actions (&#x60;add&#x60; or &#x60;remove&#x60;) per request.  **Note:** You can also do this using the [Update audience](https://docs.talon.one/docs/product/rules/effects/using-effects#updating-an-audience) effect. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerProfileAudiencesTest() throws ApiException {
        CustomerProfileAudienceRequest body = null;
        api.updateCustomerProfileAudiences(body);

        // TODO: test validations
    }
    
    /**
     * Update customer profile
     *
     * Update or create a [Customer Profile](https://docs.talon.one/docs/dev/concepts/entities/customer-profiles). This endpoint triggers the Rule Builder.  You can use this endpoint to: - Set attributes on the given customer profile. Ensure you create the attributes in the Campaign Manager, first. - Modify the audience the customer profile is a member of.  &lt;div class&#x3D;\&quot;redoc-section\&quot;&gt;   &lt;p class&#x3D;\&quot;title\&quot;&gt;Performance tips&lt;/p&gt;    - Updating a customer profile returns a response with the requested integration state.   - You can use the &#x60;responseContent&#x60; property to save yourself extra API calls. For example, you can get     the customer profile details directly without extra requests.   - We recommend sending requests sequentially.     See [Managing parallel requests](https://docs.talon.one/docs/dev/getting-started/integration-tutorial#managing-parallel-requests). &lt;/div&gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerProfileV2Test() throws ApiException {
        String integrationId = null;
        CustomerProfileIntegrationRequestV2 body = null;
        Boolean runRuleEngine = null;
        Boolean dry = null;
        CustomerProfileIntegrationResponseV2 response = api.updateCustomerProfileV2(integrationId, body, runRuleEngine, dry);

        // TODO: test validations
    }
    
    /**
     * Update multiple customer profiles
     *
     * Update (or create) up to 1000 [customer profiles](https://docs.talon.one/docs/dev/concepts/entities/customer-profiles) in 1 request.  The &#x60;integrationId&#x60; must be any identifier that remains stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  A customer profile [can be linked to one or more sessions](https://docs.talon.one/integration-api#tag/Customer-sessions).  **Note:** This endpoint does not trigger the Rule Engine. To trigger the Rule Engine for customer profile updates, use the [Update customer profile](#tag/Customer-profiles/operation/updateCustomerProfileV2) endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerProfilesV2Test() throws ApiException {
        MultipleCustomerProfileIntegrationRequest body = null;
        String silent = null;
        MultipleCustomerProfileIntegrationResponseV2 response = api.updateCustomerProfilesV2(body, silent);

        // TODO: test validations
    }
    
    /**
     * Update customer session
     *
     * Update or create a [customer session](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions). The endpoint responds with the potential promotion rule [effects](https://docs.talon.one/docs/dev/integration-api/api-effects) that match the current cart. For example, use this endpoint to share the contents of a customer&#39;s cart with Talon.One.  **Note:** The currency for the session and the cart items in the session is the currency set for the Application that owns this session.  ### Session management  To use this endpoint, start by learning about [customer sessions](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions) and their states and refer to the &#x60;state&#x60; parameter documentation the request body schema docs below.  ### Sessions and customer profiles  - To link a session to a customer profile, set the &#x60;profileId&#x60; parameter in the request body to a customer profile&#39;s &#x60;integrationId&#x60;. - While you can create an anonymous session with &#x60;profileId&#x3D;\&quot;\&quot;&#x60;, we recommend you use a guest ID instead. - A profile can be linked to simultaneous sessions in different Applications. Either:   - Use unique session integration IDs or,   - Use the same session integration ID across all of the Applications.  **Note:** If the specified profile does not exist, an empty profile is **created automatically**.   You can update it with [Update customer profile](https://docs.talon.one/integration-api#tag/Customer-profiles/operation/updateCustomerProfileV2).  &lt;div class&#x3D;\&quot;redoc-section\&quot;&gt;   &lt;p class&#x3D;\&quot;title\&quot;&gt;Performance tips&lt;/p&gt;    - Updating a customer session returns a response with the new integration state. Use the &#x60;responseContent&#x60; property to save yourself extra API calls.     For example, you can get the customer profile details directly without extra requests.   - We recommend sending requests sequentially. See [Managing parallel requests](https://docs.talon.one/docs/dev/getting-started/integration-tutorial#managing-parallel-requests). &lt;/div&gt;  For more information, see: - The introductory video in [Getting started](https://docs.talon.one/docs/dev/getting-started/overview). - The [integration tutorial](https://docs.talon.one/docs/dev/tutorials/integrating-talon-one). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerSessionV2Test() throws ApiException {
        String customerSessionId = null;
        IntegrationRequest body = null;
        Boolean dry = null;
        OffsetDateTime now = null;
        IntegrationStateV2 response = api.updateCustomerSessionV2(customerSessionId, body, dry, now);

        // TODO: test validations
    }
    
}
