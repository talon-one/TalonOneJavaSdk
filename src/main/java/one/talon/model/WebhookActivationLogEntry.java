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
import org.threeten.bp.OffsetDateTime;

/**
 * Log of activated webhooks.
 */
@ApiModel(description = "Log of activated webhooks.")

public class WebhookActivationLogEntry {
  public static final String SERIALIZED_NAME_INTEGRATION_REQUEST_UUID = "integrationRequestUuid";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_REQUEST_UUID)
  private String integrationRequestUuid;

  public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhookId";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
  private Integer webhookId;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;


  public WebhookActivationLogEntry integrationRequestUuid(String integrationRequestUuid) {
    
    this.integrationRequestUuid = integrationRequestUuid;
    return this;
  }

   /**
   * UUID reference of the integration request that triggered the effect with the webhook.
   * @return integrationRequestUuid
  **/
  @ApiModelProperty(example = "6d3699cf-95bd-444a-b62f-80d6e8391dc9", required = true, value = "UUID reference of the integration request that triggered the effect with the webhook.")

  public String getIntegrationRequestUuid() {
    return integrationRequestUuid;
  }


  public void setIntegrationRequestUuid(String integrationRequestUuid) {
    this.integrationRequestUuid = integrationRequestUuid;
  }


  public WebhookActivationLogEntry webhookId(Integer webhookId) {
    
    this.webhookId = webhookId;
    return this;
  }

   /**
   * ID of the webhook that triggered the request.
   * @return webhookId
  **/
  @ApiModelProperty(example = "1", required = true, value = "ID of the webhook that triggered the request.")

  public Integer getWebhookId() {
    return webhookId;
  }


  public void setWebhookId(Integer webhookId) {
    this.webhookId = webhookId;
  }


  public WebhookActivationLogEntry applicationId(Integer applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * ID of the application that triggered the webhook.
   * @return applicationId
  **/
  @ApiModelProperty(example = "13", required = true, value = "ID of the application that triggered the webhook.")

  public Integer getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }


  public WebhookActivationLogEntry campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * ID of the campaign that triggered the webhook.
   * @return campaignId
  **/
  @ApiModelProperty(example = "86", required = true, value = "ID of the campaign that triggered the webhook.")

  public Integer getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public WebhookActivationLogEntry created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Timestamp of request
   * @return created
  **/
  @ApiModelProperty(example = "2023-03-21T13:55:08.571144Z", required = true, value = "Timestamp of request")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookActivationLogEntry webhookActivationLogEntry = (WebhookActivationLogEntry) o;
    return Objects.equals(this.integrationRequestUuid, webhookActivationLogEntry.integrationRequestUuid) &&
        Objects.equals(this.webhookId, webhookActivationLogEntry.webhookId) &&
        Objects.equals(this.applicationId, webhookActivationLogEntry.applicationId) &&
        Objects.equals(this.campaignId, webhookActivationLogEntry.campaignId) &&
        Objects.equals(this.created, webhookActivationLogEntry.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationRequestUuid, webhookId, applicationId, campaignId, created);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookActivationLogEntry {\n");
    sb.append("    integrationRequestUuid: ").append(toIndentedString(integrationRequestUuid)).append("\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

