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
import one.talon.model.AudienceMembership;
import one.talon.model.LoyaltyMembership;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for AudienceCustomer
 */
public class AudienceCustomerTest {
    private final AudienceCustomer model = new AudienceCustomer();

    /**
     * Model tests for AudienceCustomer
     */
    @Test
    public void testAudienceCustomer() {
        // TODO: test AudienceCustomer
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
     * Test the property 'integrationId'
     */
    @Test
    public void integrationIdTest() {
        // TODO: test integrationId
    }

    /**
     * Test the property 'attributes'
     */
    @Test
    public void attributesTest() {
        // TODO: test attributes
    }

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
        // TODO: test accountId
    }

    /**
     * Test the property 'closedSessions'
     */
    @Test
    public void closedSessionsTest() {
        // TODO: test closedSessions
    }

    /**
     * Test the property 'totalSales'
     */
    @Test
    public void totalSalesTest() {
        // TODO: test totalSales
    }

    /**
     * Test the property 'loyaltyMemberships'
     */
    @Test
    public void loyaltyMembershipsTest() {
        // TODO: test loyaltyMemberships
    }

    /**
     * Test the property 'audienceMemberships'
     */
    @Test
    public void audienceMembershipsTest() {
        // TODO: test audienceMemberships
    }

    /**
     * Test the property 'lastActivity'
     */
    @Test
    public void lastActivityTest() {
        // TODO: test lastActivity
    }

    /**
     * Test the property 'sandbox'
     */
    @Test
    public void sandboxTest() {
        // TODO: test sandbox
    }

    /**
     * Test the property 'connectedApplicationsIds'
     */
    @Test
    public void connectedApplicationsIdsTest() {
        // TODO: test connectedApplicationsIds
    }

    /**
     * Test the property 'connectedAudiences'
     */
    @Test
    public void connectedAudiencesTest() {
        // TODO: test connectedAudiences
    }

}
