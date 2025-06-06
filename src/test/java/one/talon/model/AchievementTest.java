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
import one.talon.model.TimePoint;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Achievement
 */
public class AchievementTest {
    private final Achievement model = new Achievement();

    /**
     * Model tests for Achievement
     */
    @Test
    public void testAchievement() {
        // TODO: test Achievement
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
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
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
     * Test the property 'target'
     */
    @Test
    public void targetTest() {
        // TODO: test target
    }

    /**
     * Test the property 'period'
     */
    @Test
    public void periodTest() {
        // TODO: test period
    }

    /**
     * Test the property 'periodEndOverride'
     */
    @Test
    public void periodEndOverrideTest() {
        // TODO: test periodEndOverride
    }

    /**
     * Test the property 'recurrencePolicy'
     */
    @Test
    public void recurrencePolicyTest() {
        // TODO: test recurrencePolicy
    }

    /**
     * Test the property 'activationPolicy'
     */
    @Test
    public void activationPolicyTest() {
        // TODO: test activationPolicy
    }

    /**
     * Test the property 'fixedStartDate'
     */
    @Test
    public void fixedStartDateTest() {
        // TODO: test fixedStartDate
    }

    /**
     * Test the property 'endDate'
     */
    @Test
    public void endDateTest() {
        // TODO: test endDate
    }

    /**
     * Test the property 'campaignId'
     */
    @Test
    public void campaignIdTest() {
        // TODO: test campaignId
    }

    /**
     * Test the property 'userId'
     */
    @Test
    public void userIdTest() {
        // TODO: test userId
    }

    /**
     * Test the property 'createdBy'
     */
    @Test
    public void createdByTest() {
        // TODO: test createdBy
    }

    /**
     * Test the property 'hasProgress'
     */
    @Test
    public void hasProgressTest() {
        // TODO: test hasProgress
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

}
