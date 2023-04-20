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
import java.util.List;
import one.talon.model.StrikethroughChangedItem;
import one.talon.model.StrikethroughTrigger;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for StrikethroughLabelingNotification
 */
public class StrikethroughLabelingNotificationTest {
    private final StrikethroughLabelingNotification model = new StrikethroughLabelingNotification();

    /**
     * Model tests for StrikethroughLabelingNotification
     */
    @Test
    public void testStrikethroughLabelingNotification() {
        // TODO: test StrikethroughLabelingNotification
    }

    /**
     * Test the property 'applicationId'
     */
    @Test
    public void applicationIdTest() {
        // TODO: test applicationId
    }

    /**
     * Test the property 'currentBatch'
     */
    @Test
    public void currentBatchTest() {
        // TODO: test currentBatch
    }

    /**
     * Test the property 'totalBatches'
     */
    @Test
    public void totalBatchesTest() {
        // TODO: test totalBatches
    }

    /**
     * Test the property 'trigger'
     */
    @Test
    public void triggerTest() {
        // TODO: test trigger
    }

    /**
     * Test the property 'changedItems'
     */
    @Test
    public void changedItemsTest() {
        // TODO: test changedItems
    }

}