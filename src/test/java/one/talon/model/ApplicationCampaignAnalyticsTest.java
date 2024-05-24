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
import one.talon.model.ApplicationCampaignAnalyticsAvgItemsPerSession;
import one.talon.model.ApplicationCampaignAnalyticsAvgSessionValue;
import one.talon.model.ApplicationCampaignAnalyticsCouponsCount;
import one.talon.model.ApplicationCampaignAnalyticsSessionsCount;
import one.talon.model.ApplicationCampaignAnalyticsTotalDiscounts;
import one.talon.model.ApplicationCampaignAnalyticsTotalRevenue;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ApplicationCampaignAnalytics
 */
public class ApplicationCampaignAnalyticsTest {
    private final ApplicationCampaignAnalytics model = new ApplicationCampaignAnalytics();

    /**
     * Model tests for ApplicationCampaignAnalytics
     */
    @Test
    public void testApplicationCampaignAnalytics() {
        // TODO: test ApplicationCampaignAnalytics
    }

    /**
     * Test the property 'startTime'
     */
    @Test
    public void startTimeTest() {
        // TODO: test startTime
    }

    /**
     * Test the property 'endTime'
     */
    @Test
    public void endTimeTest() {
        // TODO: test endTime
    }

    /**
     * Test the property 'campaignId'
     */
    @Test
    public void campaignIdTest() {
        // TODO: test campaignId
    }

    /**
     * Test the property 'campaignName'
     */
    @Test
    public void campaignNameTest() {
        // TODO: test campaignName
    }

    /**
     * Test the property 'campaignTags'
     */
    @Test
    public void campaignTagsTest() {
        // TODO: test campaignTags
    }

    /**
     * Test the property 'campaignState'
     */
    @Test
    public void campaignStateTest() {
        // TODO: test campaignState
    }

    /**
     * Test the property 'campaignActiveRulesetId'
     */
    @Test
    public void campaignActiveRulesetIdTest() {
        // TODO: test campaignActiveRulesetId
    }

    /**
     * Test the property 'campaignStartTime'
     */
    @Test
    public void campaignStartTimeTest() {
        // TODO: test campaignStartTime
    }

    /**
     * Test the property 'campaignEndTime'
     */
    @Test
    public void campaignEndTimeTest() {
        // TODO: test campaignEndTime
    }

    /**
     * Test the property 'totalRevenue'
     */
    @Test
    public void totalRevenueTest() {
        // TODO: test totalRevenue
    }

    /**
     * Test the property 'sessionsCount'
     */
    @Test
    public void sessionsCountTest() {
        // TODO: test sessionsCount
    }

    /**
     * Test the property 'avgItemsPerSession'
     */
    @Test
    public void avgItemsPerSessionTest() {
        // TODO: test avgItemsPerSession
    }

    /**
     * Test the property 'avgSessionValue'
     */
    @Test
    public void avgSessionValueTest() {
        // TODO: test avgSessionValue
    }

    /**
     * Test the property 'totalDiscounts'
     */
    @Test
    public void totalDiscountsTest() {
        // TODO: test totalDiscounts
    }

    /**
     * Test the property 'couponsCount'
     */
    @Test
    public void couponsCountTest() {
        // TODO: test couponsCount
    }

}