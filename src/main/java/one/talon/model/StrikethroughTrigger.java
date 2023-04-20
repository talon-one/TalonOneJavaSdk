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
 * Information about the event that triggered the strikethrough labeling.
 */
@ApiModel(description = "Information about the event that triggered the strikethrough labeling.")

public class StrikethroughTrigger {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TRIGGERED_AT = "triggeredAt";
  @SerializedName(SERIALIZED_NAME_TRIGGERED_AT)
  private OffsetDateTime triggeredAt;

  public static final String SERIALIZED_NAME_TOTAL_AFFECTED_ITEMS = "totalAffectedItems";
  @SerializedName(SERIALIZED_NAME_TOTAL_AFFECTED_ITEMS)
  private Integer totalAffectedItems;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private Object payload;


  public StrikethroughTrigger id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the event that triggered the strikethrough labeling.
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "The ID of the event that triggered the strikethrough labeling.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public StrikethroughTrigger type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of event that triggered the strikethrough labeling.
   * @return type
  **/
  @ApiModelProperty(example = "CATALOG_SYNC", required = true, value = "The type of event that triggered the strikethrough labeling.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public StrikethroughTrigger triggeredAt(OffsetDateTime triggeredAt) {
    
    this.triggeredAt = triggeredAt;
    return this;
  }

   /**
   * The creation time of the event that triggered the strikethrough labeling.
   * @return triggeredAt
  **/
  @ApiModelProperty(example = "2020-06-10T09:05:27.993483Z", required = true, value = "The creation time of the event that triggered the strikethrough labeling.")

  public OffsetDateTime getTriggeredAt() {
    return triggeredAt;
  }


  public void setTriggeredAt(OffsetDateTime triggeredAt) {
    this.triggeredAt = triggeredAt;
  }


  public StrikethroughTrigger totalAffectedItems(Integer totalAffectedItems) {
    
    this.totalAffectedItems = totalAffectedItems;
    return this;
  }

   /**
   * The total number of items affected by the event that triggered the strikethrough labeling.
   * @return totalAffectedItems
  **/
  @ApiModelProperty(example = "1500", required = true, value = "The total number of items affected by the event that triggered the strikethrough labeling.")

  public Integer getTotalAffectedItems() {
    return totalAffectedItems;
  }


  public void setTotalAffectedItems(Integer totalAffectedItems) {
    this.totalAffectedItems = totalAffectedItems;
  }


  public StrikethroughTrigger payload(Object payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * The arbitrary properties associated with this trigger type.
   * @return payload
  **/
  @ApiModelProperty(example = "{\"catalogId\":2,\"catalogVersion\":100}", required = true, value = "The arbitrary properties associated with this trigger type.")

  public Object getPayload() {
    return payload;
  }


  public void setPayload(Object payload) {
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
    StrikethroughTrigger strikethroughTrigger = (StrikethroughTrigger) o;
    return Objects.equals(this.id, strikethroughTrigger.id) &&
        Objects.equals(this.type, strikethroughTrigger.type) &&
        Objects.equals(this.triggeredAt, strikethroughTrigger.triggeredAt) &&
        Objects.equals(this.totalAffectedItems, strikethroughTrigger.totalAffectedItems) &&
        Objects.equals(this.payload, strikethroughTrigger.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, triggeredAt, totalAffectedItems, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrikethroughTrigger {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    triggeredAt: ").append(toIndentedString(triggeredAt)).append("\n");
    sb.append("    totalAffectedItems: ").append(toIndentedString(totalAffectedItems)).append("\n");
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

