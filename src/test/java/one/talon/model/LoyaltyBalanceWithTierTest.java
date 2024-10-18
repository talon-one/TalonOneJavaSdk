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
import one.talon.model.ProjectedTier;
import one.talon.model.Tier;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for LoyaltyBalanceWithTier
 */
public class LoyaltyBalanceWithTierTest {
    private final LoyaltyBalanceWithTier model = new LoyaltyBalanceWithTier();

    /**
     * Model tests for LoyaltyBalanceWithTier
     */
    @Test
    public void testLoyaltyBalanceWithTier() {
        // TODO: test LoyaltyBalanceWithTier
    }

    /**
     * Test the property 'activePoints'
     */
    @Test
    public void activePointsTest() {
        // TODO: test activePoints
    }

    /**
     * Test the property 'pendingPoints'
     */
    @Test
    public void pendingPointsTest() {
        // TODO: test pendingPoints
    }

    /**
     * Test the property 'spentPoints'
     */
    @Test
    public void spentPointsTest() {
        // TODO: test spentPoints
    }

    /**
     * Test the property 'expiredPoints'
     */
    @Test
    public void expiredPointsTest() {
        // TODO: test expiredPoints
    }

    /**
     * Test the property 'currentTier'
     */
    @Test
    public void currentTierTest() {
        // TODO: test currentTier
    }

    /**
     * Test the property 'projectedTier'
     */
    @Test
    public void projectedTierTest() {
        // TODO: test projectedTier
    }

    /**
     * Test the property 'pointsToNextTier'
     */
    @Test
    public void pointsToNextTierTest() {
        // TODO: test pointsToNextTier
    }

    /**
     * Test the property 'nextTierName'
     */
    @Test
    public void nextTierNameTest() {
        // TODO: test nextTierName
    }

}