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
 * OutgoingIntegrationWebhookTemplate
 */

public class OutgoingIntegrationWebhookTemplate {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_INTEGRATION_TYPE = "integrationType";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_TYPE)
  private Integer integrationType;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;


  public OutgoingIntegrationWebhookTemplate id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique Id for this entity.
   * @return id
  **/
  @ApiModelProperty(example = "6", required = true, value = "Unique Id for this entity.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public OutgoingIntegrationWebhookTemplate integrationType(Integer integrationType) {
    
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Unique Id of outgoing integration type.
   * @return integrationType
  **/
  @ApiModelProperty(example = "2", required = true, value = "Unique Id of outgoing integration type.")

  public Integer getIntegrationType() {
    return integrationType;
  }


  public void setIntegrationType(Integer integrationType) {
    this.integrationType = integrationType;
  }


  public OutgoingIntegrationWebhookTemplate title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the webhook template.
   * @return title
  **/
  @ApiModelProperty(example = "Send email via braze", required = true, value = "Title of the webhook template.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public OutgoingIntegrationWebhookTemplate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * General description for the specific outgoing integration webhook template.
   * @return description
  **/
  @ApiModelProperty(example = "Waiting for docs team", required = true, value = "General description for the specific outgoing integration webhook template.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public OutgoingIntegrationWebhookTemplate payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * API payload (supports templating using parameters) for this webhook template.
   * @return payload
  **/
  @ApiModelProperty(example = "{  \"message\": \"${message}\" }", required = true, value = "API payload (supports templating using parameters) for this webhook template.")

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutgoingIntegrationWebhookTemplate outgoingIntegrationWebhookTemplate = (OutgoingIntegrationWebhookTemplate) o;
    return Objects.equals(this.id, outgoingIntegrationWebhookTemplate.id) &&
        Objects.equals(this.integrationType, outgoingIntegrationWebhookTemplate.integrationType) &&
        Objects.equals(this.title, outgoingIntegrationWebhookTemplate.title) &&
        Objects.equals(this.description, outgoingIntegrationWebhookTemplate.description) &&
        Objects.equals(this.payload, outgoingIntegrationWebhookTemplate.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, integrationType, title, description, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutgoingIntegrationWebhookTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
