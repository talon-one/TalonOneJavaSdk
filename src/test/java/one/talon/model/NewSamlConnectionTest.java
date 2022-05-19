/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSession](https://docs.talon.one/integration-api/#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
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
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for NewSamlConnection
 */
public class NewSamlConnectionTest {
    private final NewSamlConnection model = new NewSamlConnection();

    /**
     * Model tests for NewSamlConnection
     */
    @Test
    public void testNewSamlConnection() {
        // TODO: test NewSamlConnection
    }

    /**
     * Test the property 'x509certificate'
     */
    @Test
    public void x509certificateTest() {
        // TODO: test x509certificate
    }

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
        // TODO: test accountId
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'issuer'
     */
    @Test
    public void issuerTest() {
        // TODO: test issuer
    }

    /**
     * Test the property 'signOnURL'
     */
    @Test
    public void signOnURLTest() {
        // TODO: test signOnURL
    }

    /**
     * Test the property 'signOutURL'
     */
    @Test
    public void signOutURLTest() {
        // TODO: test signOutURL
    }

    /**
     * Test the property 'metadataURL'
     */
    @Test
    public void metadataURLTest() {
        // TODO: test metadataURL
    }

    /**
     * Test the property 'audienceURI'
     */
    @Test
    public void audienceURITest() {
        // TODO: test audienceURI
    }

}
