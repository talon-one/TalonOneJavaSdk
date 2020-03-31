/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * The version of the OpenAPI document: 1.0.0
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
 * Model tests for CustomerActivityReport
 */
public class CustomerActivityReportTest {
    private final CustomerActivityReport model = new CustomerActivityReport();

    /**
     * Model tests for CustomerActivityReport
     */
    @Test
    public void testCustomerActivityReport() {
        // TODO: test CustomerActivityReport
    }

    /**
     * Test the property 'integrationId'
     */
    @Test
    public void integrationIdTest() {
        // TODO: test integrationId
    }

    /**
     * Test the property 'created'
     */
    @Test
    public void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'customerId'
     */
    @Test
    public void customerIdTest() {
        // TODO: test customerId
    }

    /**
     * Test the property 'lastActivity'
     */
    @Test
    public void lastActivityTest() {
        // TODO: test lastActivity
    }

    /**
     * Test the property 'couponRedemptions'
     */
    @Test
    public void couponRedemptionsTest() {
        // TODO: test couponRedemptions
    }

    /**
     * Test the property 'couponUseAttempts'
     */
    @Test
    public void couponUseAttemptsTest() {
        // TODO: test couponUseAttempts
    }

    /**
     * Test the property 'couponFailedAttempts'
     */
    @Test
    public void couponFailedAttemptsTest() {
        // TODO: test couponFailedAttempts
    }

    /**
     * Test the property 'accruedDiscounts'
     */
    @Test
    public void accruedDiscountsTest() {
        // TODO: test accruedDiscounts
    }

    /**
     * Test the property 'accruedRevenue'
     */
    @Test
    public void accruedRevenueTest() {
        // TODO: test accruedRevenue
    }

    /**
     * Test the property 'totalOrders'
     */
    @Test
    public void totalOrdersTest() {
        // TODO: test totalOrders
    }

    /**
     * Test the property 'totalOrdersNoCoupon'
     */
    @Test
    public void totalOrdersNoCouponTest() {
        // TODO: test totalOrdersNoCoupon
    }

    /**
     * Test the property 'campaignName'
     */
    @Test
    public void campaignNameTest() {
        // TODO: test campaignName
    }

}
