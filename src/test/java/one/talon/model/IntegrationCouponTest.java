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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.LimitConfig;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for IntegrationCoupon
 */
public class IntegrationCouponTest {
    private final IntegrationCoupon model = new IntegrationCoupon();

    /**
     * Model tests for IntegrationCoupon
     */
    @Test
    public void testIntegrationCoupon() {
        // TODO: test IntegrationCoupon
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'created'
     */
    @Test
    public void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'campaignId'
     */
    @Test
    public void campaignIdTest() {
        // TODO: test campaignId
    }

    /**
     * Test the property 'value'
     */
    @Test
    public void valueTest() {
        // TODO: test value
    }

    /**
     * Test the property 'usageLimit'
     */
    @Test
    public void usageLimitTest() {
        // TODO: test usageLimit
    }

    /**
     * Test the property 'discountLimit'
     */
    @Test
    public void discountLimitTest() {
        // TODO: test discountLimit
    }

    /**
     * Test the property 'reservationLimit'
     */
    @Test
    public void reservationLimitTest() {
        // TODO: test reservationLimit
    }

    /**
     * Test the property 'startDate'
     */
    @Test
    public void startDateTest() {
        // TODO: test startDate
    }

    /**
     * Test the property 'expiryDate'
     */
    @Test
    public void expiryDateTest() {
        // TODO: test expiryDate
    }

    /**
     * Test the property 'limits'
     */
    @Test
    public void limitsTest() {
        // TODO: test limits
    }

    /**
     * Test the property 'usageCounter'
     */
    @Test
    public void usageCounterTest() {
        // TODO: test usageCounter
    }

    /**
     * Test the property 'discountCounter'
     */
    @Test
    public void discountCounterTest() {
        // TODO: test discountCounter
    }

    /**
     * Test the property 'discountRemainder'
     */
    @Test
    public void discountRemainderTest() {
        // TODO: test discountRemainder
    }

    /**
     * Test the property 'reservationCounter'
     */
    @Test
    public void reservationCounterTest() {
        // TODO: test reservationCounter
    }

    /**
     * Test the property 'attributes'
     */
    @Test
    public void attributesTest() {
        // TODO: test attributes
    }

    /**
     * Test the property 'referralId'
     */
    @Test
    public void referralIdTest() {
        // TODO: test referralId
    }

    /**
     * Test the property 'recipientIntegrationId'
     */
    @Test
    public void recipientIntegrationIdTest() {
        // TODO: test recipientIntegrationId
    }

    /**
     * Test the property 'importId'
     */
    @Test
    public void importIdTest() {
        // TODO: test importId
    }

    /**
     * Test the property 'reservation'
     */
    @Test
    public void reservationTest() {
        // TODO: test reservation
    }

    /**
     * Test the property 'batchId'
     */
    @Test
    public void batchIdTest() {
        // TODO: test batchId
    }

    /**
     * Test the property 'isReservationMandatory'
     */
    @Test
    public void isReservationMandatoryTest() {
        // TODO: test isReservationMandatory
    }

    /**
     * Test the property 'implicitlyReserved'
     */
    @Test
    public void implicitlyReservedTest() {
        // TODO: test implicitlyReserved
    }

    /**
     * Test the property 'profileRedemptionCount'
     */
    @Test
    public void profileRedemptionCountTest() {
        // TODO: test profileRedemptionCount
    }

}
