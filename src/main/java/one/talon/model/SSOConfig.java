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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SSOConfig
 */

public class SSOConfig {
  public static final String SERIALIZED_NAME_ENFORCED = "enforced";
  @SerializedName(SERIALIZED_NAME_ENFORCED)
  private Boolean enforced;

  public static final String SERIALIZED_NAME_NEW_ACS_URL = "newAcsUrl";
  @SerializedName(SERIALIZED_NAME_NEW_ACS_URL)
  private String newAcsUrl;


  public SSOConfig enforced(Boolean enforced) {
    
    this.enforced = enforced;
    return this;
  }

   /**
   * An indication of whether single sign-on is enforced for the account. When enforced, users cannot use their email and password to sign in to Talon.One. It is not possible to change this to &#x60;false&#x60; after it is set to &#x60;true&#x60;. 
   * @return enforced
  **/
  @ApiModelProperty(example = "true", required = true, value = "An indication of whether single sign-on is enforced for the account. When enforced, users cannot use their email and password to sign in to Talon.One. It is not possible to change this to `false` after it is set to `true`. ")

  public Boolean getEnforced() {
    return enforced;
  }


  public void setEnforced(Boolean enforced) {
    this.enforced = enforced;
  }


  public SSOConfig newAcsUrl(String newAcsUrl) {
    
    this.newAcsUrl = newAcsUrl;
    return this;
  }

   /**
   * Assertion Consumer Service (ACS) URL for setting up a new SAML connection with an identity provider like Okta or Microsoft Entra ID. 
   * @return newAcsUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://yourdeployment.talon.one/v1/saml_connections/5/saml_callback", value = "Assertion Consumer Service (ACS) URL for setting up a new SAML connection with an identity provider like Okta or Microsoft Entra ID. ")

  public String getNewAcsUrl() {
    return newAcsUrl;
  }


  public void setNewAcsUrl(String newAcsUrl) {
    this.newAcsUrl = newAcsUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSOConfig ssOConfig = (SSOConfig) o;
    return Objects.equals(this.enforced, ssOConfig.enforced) &&
        Objects.equals(this.newAcsUrl, ssOConfig.newAcsUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enforced, newAcsUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSOConfig {\n");
    sb.append("    enforced: ").append(toIndentedString(enforced)).append("\n");
    sb.append("    newAcsUrl: ").append(toIndentedString(newAcsUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

