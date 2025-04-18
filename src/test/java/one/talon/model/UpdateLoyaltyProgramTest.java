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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.CodeGeneratorSettings;
import one.talon.model.NewLoyaltyTier;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for UpdateLoyaltyProgram
 */
public class UpdateLoyaltyProgramTest {
    private final UpdateLoyaltyProgram model = new UpdateLoyaltyProgram();

    /**
     * Model tests for UpdateLoyaltyProgram
     */
    @Test
    public void testUpdateLoyaltyProgram() {
        // TODO: test UpdateLoyaltyProgram
    }

    /**
     * Test the property 'title'
     */
    @Test
    public void titleTest() {
        // TODO: test title
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'subscribedApplications'
     */
    @Test
    public void subscribedApplicationsTest() {
        // TODO: test subscribedApplications
    }

    /**
     * Test the property 'defaultValidity'
     */
    @Test
    public void defaultValidityTest() {
        // TODO: test defaultValidity
    }

    /**
     * Test the property 'defaultPending'
     */
    @Test
    public void defaultPendingTest() {
        // TODO: test defaultPending
    }

    /**
     * Test the property 'allowSubledger'
     */
    @Test
    public void allowSubledgerTest() {
        // TODO: test allowSubledger
    }

    /**
     * Test the property 'usersPerCardLimit'
     */
    @Test
    public void usersPerCardLimitTest() {
        // TODO: test usersPerCardLimit
    }

    /**
     * Test the property 'sandbox'
     */
    @Test
    public void sandboxTest() {
        // TODO: test sandbox
    }

    /**
     * Test the property 'programJoinPolicy'
     */
    @Test
    public void programJoinPolicyTest() {
        // TODO: test programJoinPolicy
    }

    /**
     * Test the property 'tiersExpirationPolicy'
     */
    @Test
    public void tiersExpirationPolicyTest() {
        // TODO: test tiersExpirationPolicy
    }

    /**
     * Test the property 'tierCycleStartDate'
     */
    @Test
    public void tierCycleStartDateTest() {
        // TODO: test tierCycleStartDate
    }

    /**
     * Test the property 'tiersExpireIn'
     */
    @Test
    public void tiersExpireInTest() {
        // TODO: test tiersExpireIn
    }

    /**
     * Test the property 'tiersDowngradePolicy'
     */
    @Test
    public void tiersDowngradePolicyTest() {
        // TODO: test tiersDowngradePolicy
    }

    /**
     * Test the property 'cardCodeSettings'
     */
    @Test
    public void cardCodeSettingsTest() {
        // TODO: test cardCodeSettings
    }

    /**
     * Test the property 'returnPolicy'
     */
    @Test
    public void returnPolicyTest() {
        // TODO: test returnPolicy
    }

    /**
     * Test the property 'tiers'
     */
    @Test
    public void tiersTest() {
        // TODO: test tiers
    }

}
