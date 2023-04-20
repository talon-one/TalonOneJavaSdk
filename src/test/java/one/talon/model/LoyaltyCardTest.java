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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import one.talon.model.LedgerInfo;
import one.talon.model.LoyaltyCardProfileRegistration;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for LoyaltyCard
 */
public class LoyaltyCardTest {
    private final LoyaltyCard model = new LoyaltyCard();

    /**
     * Model tests for LoyaltyCard
     */
    @Test
    public void testLoyaltyCard() {
        // TODO: test LoyaltyCard
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
     * Test the property 'programID'
     */
    @Test
    public void programIDTest() {
        // TODO: test programID
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'identifier'
     */
    @Test
    public void identifierTest() {
        // TODO: test identifier
    }

    /**
     * Test the property 'usersPerCardLimit'
     */
    @Test
    public void usersPerCardLimitTest() {
        // TODO: test usersPerCardLimit
    }

    /**
     * Test the property 'profiles'
     */
    @Test
    public void profilesTest() {
        // TODO: test profiles
    }

    /**
     * Test the property 'ledger'
     */
    @Test
    public void ledgerTest() {
        // TODO: test ledger
    }

    /**
     * Test the property 'subledgers'
     */
    @Test
    public void subledgersTest() {
        // TODO: test subledgers
    }

    /**
     * Test the property 'modified'
     */
    @Test
    public void modifiedTest() {
        // TODO: test modified
    }

    /**
     * Test the property 'oldCardIdentifier'
     */
    @Test
    public void oldCardIdentifierTest() {
        // TODO: test oldCardIdentifier
    }

    /**
     * Test the property 'newCardIdentifier'
     */
    @Test
    public void newCardIdentifierTest() {
        // TODO: test newCardIdentifier
    }

}
