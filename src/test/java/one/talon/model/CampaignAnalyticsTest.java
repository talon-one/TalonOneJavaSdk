/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSessionV2](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package one.talon.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for CampaignAnalytics
 */
public class CampaignAnalyticsTest {
    private final CampaignAnalytics model = new CampaignAnalytics();

    /**
     * Model tests for CampaignAnalytics
     */
    @Test
    public void testCampaignAnalytics() {
        // TODO: test CampaignAnalytics
    }

    /**
     * Test the property 'date'
     */
    @Test
    public void dateTest() {
        // TODO: test date
    }

    /**
     * Test the property 'campaignRevenue'
     */
    @Test
    public void campaignRevenueTest() {
        // TODO: test campaignRevenue
    }

    /**
     * Test the property 'totalCampaignRevenue'
     */
    @Test
    public void totalCampaignRevenueTest() {
        // TODO: test totalCampaignRevenue
    }

    /**
     * Test the property 'campaignRefund'
     */
    @Test
    public void campaignRefundTest() {
        // TODO: test campaignRefund
    }

    /**
     * Test the property 'totalCampaignRefund'
     */
    @Test
    public void totalCampaignRefundTest() {
        // TODO: test totalCampaignRefund
    }

    /**
     * Test the property 'campaignDiscountCosts'
     */
    @Test
    public void campaignDiscountCostsTest() {
        // TODO: test campaignDiscountCosts
    }

    /**
     * Test the property 'totalCampaignDiscountCosts'
     */
    @Test
    public void totalCampaignDiscountCostsTest() {
        // TODO: test totalCampaignDiscountCosts
    }

    /**
     * Test the property 'campaignRefundedDiscounts'
     */
    @Test
    public void campaignRefundedDiscountsTest() {
        // TODO: test campaignRefundedDiscounts
    }

    /**
     * Test the property 'totalCampaignRefundedDiscounts'
     */
    @Test
    public void totalCampaignRefundedDiscountsTest() {
        // TODO: test totalCampaignRefundedDiscounts
    }

    /**
     * Test the property 'campaignFreeItems'
     */
    @Test
    public void campaignFreeItemsTest() {
        // TODO: test campaignFreeItems
    }

    /**
     * Test the property 'totalCampaignFreeItems'
     */
    @Test
    public void totalCampaignFreeItemsTest() {
        // TODO: test totalCampaignFreeItems
    }

    /**
     * Test the property 'couponRedemptions'
     */
    @Test
    public void couponRedemptionsTest() {
        // TODO: test couponRedemptions
    }

    /**
     * Test the property 'totalCouponRedemptions'
     */
    @Test
    public void totalCouponRedemptionsTest() {
        // TODO: test totalCouponRedemptions
    }

    /**
     * Test the property 'couponRolledbackRedemptions'
     */
    @Test
    public void couponRolledbackRedemptionsTest() {
        // TODO: test couponRolledbackRedemptions
    }

    /**
     * Test the property 'totalCouponRolledbackRedemptions'
     */
    @Test
    public void totalCouponRolledbackRedemptionsTest() {
        // TODO: test totalCouponRolledbackRedemptions
    }

    /**
     * Test the property 'referralRedemptions'
     */
    @Test
    public void referralRedemptionsTest() {
        // TODO: test referralRedemptions
    }

    /**
     * Test the property 'totalReferralRedemptions'
     */
    @Test
    public void totalReferralRedemptionsTest() {
        // TODO: test totalReferralRedemptions
    }

    /**
     * Test the property 'couponsCreated'
     */
    @Test
    public void couponsCreatedTest() {
        // TODO: test couponsCreated
    }

    /**
     * Test the property 'totalCouponsCreated'
     */
    @Test
    public void totalCouponsCreatedTest() {
        // TODO: test totalCouponsCreated
    }

    /**
     * Test the property 'referralsCreated'
     */
    @Test
    public void referralsCreatedTest() {
        // TODO: test referralsCreated
    }

    /**
     * Test the property 'totalReferralsCreated'
     */
    @Test
    public void totalReferralsCreatedTest() {
        // TODO: test totalReferralsCreated
    }

    /**
     * Test the property 'addedLoyaltyPoints'
     */
    @Test
    public void addedLoyaltyPointsTest() {
        // TODO: test addedLoyaltyPoints
    }

    /**
     * Test the property 'totalAddedLoyaltyPoints'
     */
    @Test
    public void totalAddedLoyaltyPointsTest() {
        // TODO: test totalAddedLoyaltyPoints
    }

    /**
     * Test the property 'deductedLoyaltyPoints'
     */
    @Test
    public void deductedLoyaltyPointsTest() {
        // TODO: test deductedLoyaltyPoints
    }

    /**
     * Test the property 'totalDeductedLoyaltyPoints'
     */
    @Test
    public void totalDeductedLoyaltyPointsTest() {
        // TODO: test totalDeductedLoyaltyPoints
    }

}
