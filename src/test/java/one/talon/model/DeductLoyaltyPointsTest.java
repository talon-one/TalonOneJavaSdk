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
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for DeductLoyaltyPoints
 */
public class DeductLoyaltyPointsTest {
    private final DeductLoyaltyPoints model = new DeductLoyaltyPoints();

    /**
     * Model tests for DeductLoyaltyPoints
     */
    @Test
    public void testDeductLoyaltyPoints() {
        // TODO: test DeductLoyaltyPoints
    }

    /**
     * Test the property 'points'
     */
    @Test
    public void pointsTest() {
        // TODO: test points
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'subledgerId'
     */
    @Test
    public void subledgerIdTest() {
        // TODO: test subledgerId
    }

    /**
     * Test the property 'applicationId'
     */
    @Test
    public void applicationIdTest() {
        // TODO: test applicationId
    }

}
