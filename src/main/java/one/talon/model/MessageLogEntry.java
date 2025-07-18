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
import one.talon.model.MessageLogRequest;
import one.talon.model.MessageLogResponse;
import org.threeten.bp.OffsetDateTime;

/**
 * Message Log.
 */
@ApiModel(description = "Message Log.")

public class MessageLogEntry {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_CHANGE_TYPE = "changeType";
  @SerializedName(SERIALIZED_NAME_CHANGE_TYPE)
  private String changeType;

  public static final String SERIALIZED_NAME_NOTIFICATION_ID = "notificationId";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_ID)
  private Long notificationId;

  public static final String SERIALIZED_NAME_NOTIFICATION_NAME = "notificationName";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_NAME)
  private String notificationName;

  public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhookId";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
  private Long webhookId;

  public static final String SERIALIZED_NAME_WEBHOOK_NAME = "webhookName";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_NAME)
  private String webhookName;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private MessageLogRequest request;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private MessageLogResponse response;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * The entity type the log is related to. 
   */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
  public enum EntityTypeEnum {
    APPLICATION("application"),
    
    LOYALTY_PROGRAM("loyalty_program"),
    
    WEBHOOK("webhook");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityTypeEnum fromValue(String value) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntityTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private EntityTypeEnum entityType;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Long applicationId;

  public static final String SERIALIZED_NAME_LOYALTY_PROGRAM_ID = "loyaltyProgramId";
  @SerializedName(SERIALIZED_NAME_LOYALTY_PROGRAM_ID)
  private Long loyaltyProgramId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId;


  public MessageLogEntry id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the message.
   * @return id
  **/
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", required = true, value = "Unique identifier of the message.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MessageLogEntry service(String service) {
    
    this.service = service;
    return this;
  }

   /**
   * Name of the service that generated the log entry.
   * @return service
  **/
  @ApiModelProperty(example = "NotificationService", required = true, value = "Name of the service that generated the log entry.")

  public String getService() {
    return service;
  }


  public void setService(String service) {
    this.service = service;
  }


  public MessageLogEntry changeType(String changeType) {
    
    this.changeType = changeType;
    return this;
  }

   /**
   * Type of change that triggered the notification.
   * @return changeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Update", value = "Type of change that triggered the notification.")

  public String getChangeType() {
    return changeType;
  }


  public void setChangeType(String changeType) {
    this.changeType = changeType;
  }


  public MessageLogEntry notificationId(Long notificationId) {
    
    this.notificationId = notificationId;
    return this;
  }

   /**
   * ID of the notification.
   * @return notificationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "101", value = "ID of the notification.")

  public Long getNotificationId() {
    return notificationId;
  }


  public void setNotificationId(Long notificationId) {
    this.notificationId = notificationId;
  }


  public MessageLogEntry notificationName(String notificationName) {
    
    this.notificationName = notificationName;
    return this;
  }

   /**
   * The name of the notification.
   * @return notificationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My campaign notification", value = "The name of the notification.")

  public String getNotificationName() {
    return notificationName;
  }


  public void setNotificationName(String notificationName) {
    this.notificationName = notificationName;
  }


  public MessageLogEntry webhookId(Long webhookId) {
    
    this.webhookId = webhookId;
    return this;
  }

   /**
   * ID of the webhook.
   * @return webhookId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "101", value = "ID of the webhook.")

  public Long getWebhookId() {
    return webhookId;
  }


  public void setWebhookId(Long webhookId) {
    this.webhookId = webhookId;
  }


  public MessageLogEntry webhookName(String webhookName) {
    
    this.webhookName = webhookName;
    return this;
  }

   /**
   * The name of the webhook.
   * @return webhookName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My webhook", value = "The name of the webhook.")

  public String getWebhookName() {
    return webhookName;
  }


  public void setWebhookName(String webhookName) {
    this.webhookName = webhookName;
  }


  public MessageLogEntry request(MessageLogRequest request) {
    
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MessageLogRequest getRequest() {
    return request;
  }


  public void setRequest(MessageLogRequest request) {
    this.request = request;
  }


  public MessageLogEntry response(MessageLogResponse response) {
    
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MessageLogResponse getResponse() {
    return response;
  }


  public void setResponse(MessageLogResponse response) {
    this.response = response;
  }


  public MessageLogEntry createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp when the log entry was created.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2021-07-20T22:00Z", required = true, value = "Timestamp when the log entry was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public MessageLogEntry entityType(EntityTypeEnum entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * The entity type the log is related to. 
   * @return entityType
  **/
  @ApiModelProperty(example = "loyalty_program", required = true, value = "The entity type the log is related to. ")

  public EntityTypeEnum getEntityType() {
    return entityType;
  }


  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }


  public MessageLogEntry url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The target URL of the request.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "www.my-company.com/my-endpoint-name", value = "The target URL of the request.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public MessageLogEntry applicationId(Long applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Identifier of the Application.
   * minimum: 1
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "Identifier of the Application.")

  public Long getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }


  public MessageLogEntry loyaltyProgramId(Long loyaltyProgramId) {
    
    this.loyaltyProgramId = loyaltyProgramId;
    return this;
  }

   /**
   * Identifier of the loyalty program.
   * minimum: 1
   * @return loyaltyProgramId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Identifier of the loyalty program.")

  public Long getLoyaltyProgramId() {
    return loyaltyProgramId;
  }


  public void setLoyaltyProgramId(Long loyaltyProgramId) {
    this.loyaltyProgramId = loyaltyProgramId;
  }


  public MessageLogEntry campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Identifier of the campaign.
   * minimum: 1
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Identifier of the campaign.")

  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageLogEntry messageLogEntry = (MessageLogEntry) o;
    return Objects.equals(this.id, messageLogEntry.id) &&
        Objects.equals(this.service, messageLogEntry.service) &&
        Objects.equals(this.changeType, messageLogEntry.changeType) &&
        Objects.equals(this.notificationId, messageLogEntry.notificationId) &&
        Objects.equals(this.notificationName, messageLogEntry.notificationName) &&
        Objects.equals(this.webhookId, messageLogEntry.webhookId) &&
        Objects.equals(this.webhookName, messageLogEntry.webhookName) &&
        Objects.equals(this.request, messageLogEntry.request) &&
        Objects.equals(this.response, messageLogEntry.response) &&
        Objects.equals(this.createdAt, messageLogEntry.createdAt) &&
        Objects.equals(this.entityType, messageLogEntry.entityType) &&
        Objects.equals(this.url, messageLogEntry.url) &&
        Objects.equals(this.applicationId, messageLogEntry.applicationId) &&
        Objects.equals(this.loyaltyProgramId, messageLogEntry.loyaltyProgramId) &&
        Objects.equals(this.campaignId, messageLogEntry.campaignId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, service, changeType, notificationId, notificationName, webhookId, webhookName, request, response, createdAt, entityType, url, applicationId, loyaltyProgramId, campaignId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageLogEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    notificationName: ").append(toIndentedString(notificationName)).append("\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    webhookName: ").append(toIndentedString(webhookName)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    loyaltyProgramId: ").append(toIndentedString(loyaltyProgramId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
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

