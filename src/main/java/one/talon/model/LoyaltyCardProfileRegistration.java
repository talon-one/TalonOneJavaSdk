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
import org.threeten.bp.OffsetDateTime;

/**
 * LoyaltyCardProfileRegistration
 */

public class LoyaltyCardProfileRegistration {
  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integrationId";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;


  public LoyaltyCardProfileRegistration integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Integration ID of the customer profile linked to the card.
   * @return integrationId
  **/
  @ApiModelProperty(example = "R195412", required = true, value = "Integration ID of the customer profile linked to the card.")

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public LoyaltyCardProfileRegistration timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp the customer profile was linked to the card.
   * @return timestamp
  **/
  @ApiModelProperty(example = "2021-09-12T10:12:42Z", required = true, value = "Timestamp the customer profile was linked to the card.")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyCardProfileRegistration loyaltyCardProfileRegistration = (LoyaltyCardProfileRegistration) o;
    return Objects.equals(this.integrationId, loyaltyCardProfileRegistration.integrationId) &&
        Objects.equals(this.timestamp, loyaltyCardProfileRegistration.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardProfileRegistration {\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

