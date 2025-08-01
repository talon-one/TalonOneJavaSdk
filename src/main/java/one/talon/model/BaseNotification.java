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
import one.talon.model.BaseNotificationWebhook;

/**
 * BaseNotification
 */

public class BaseNotification {
  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private Object policy;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = true;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private BaseNotificationWebhook webhook;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  /**
   * The notification type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CAMPAIGN("campaign"),
    
    LOYALTY_ADDED_DEDUCTED_POINTS("loyalty_added_deducted_points"),
    
    CARD_ADDED_DEDUCTED_POINTS("card_added_deducted_points"),
    
    LOYALTY_ADDED_DEDUCTED_POINTS_BALANCES("loyalty_added_deducted_points_balances"),
    
    LOYALTY_CARD_ADDED_DEDUCTED_POINTS_BALANCES("loyalty_card_added_deducted_points_balances"),
    
    COUPON("coupon"),
    
    EXPIRING_COUPONS("expiring_coupons"),
    
    EXPIRING_POINTS("expiring_points"),
    
    CARD_EXPIRING_POINTS("card_expiring_points"),
    
    PENDING_TO_ACTIVE_POINTS("pending_to_active_points"),
    
    STRIKETHROUGH_PRICING("strikethrough_pricing"),
    
    TIER_DOWNGRADE("tier_downgrade"),
    
    TIER_UPGRADE("tier_upgrade"),
    
    TIER_WILL_DOWNGRADE("tier_will_downgrade");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public BaseNotification policy(Object policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Indicates which notification properties to apply.
   * @return policy
  **/
  @ApiModelProperty(required = true, value = "Indicates which notification properties to apply.")

  public Object getPolicy() {
    return policy;
  }


  public void setPolicy(Object policy) {
    this.policy = policy;
  }


  public BaseNotification enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the notification is activated.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the notification is activated.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public BaseNotification webhook(BaseNotificationWebhook webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @ApiModelProperty(required = true, value = "")

  public BaseNotificationWebhook getWebhook() {
    return webhook;
  }


  public void setWebhook(BaseNotificationWebhook webhook) {
    this.webhook = webhook;
  }


  public BaseNotification id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID for this entity.
   * minimum: 1
   * @return id
  **/
  @ApiModelProperty(example = "6", required = true, value = "Unique ID for this entity.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public BaseNotification type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The notification type.
   * @return type
  **/
  @ApiModelProperty(example = "loyalty_added_deducted_points", required = true, value = "The notification type.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseNotification baseNotification = (BaseNotification) o;
    return Objects.equals(this.policy, baseNotification.policy) &&
        Objects.equals(this.enabled, baseNotification.enabled) &&
        Objects.equals(this.webhook, baseNotification.webhook) &&
        Objects.equals(this.id, baseNotification.id) &&
        Objects.equals(this.type, baseNotification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, enabled, webhook, id, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseNotification {\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

