/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * The version of the OpenAPI document: 1.0.0
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
import java.math.BigDecimal;

/**
 * The properties specific to the \&quot;triggerWebhook\&quot; effect. This gets triggered whenever a validated rule contained a \&quot;trigger webhook\&quot; effect. This is communicated as an FYI and should usually not require action on your side.
 */
@ApiModel(description = "The properties specific to the \"triggerWebhook\" effect. This gets triggered whenever a validated rule contained a \"trigger webhook\" effect. This is communicated as an FYI and should usually not require action on your side.")

public class TriggerWebhookEffectProps {
  public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhookId";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
  private BigDecimal webhookId;

  public static final String SERIALIZED_NAME_WEBHOOK_NAME = "webhookName";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_NAME)
  private String webhookName;


  public TriggerWebhookEffectProps webhookId(BigDecimal webhookId) {
    
    this.webhookId = webhookId;
    return this;
  }

   /**
   * The ID of the webhook that was triggered
   * @return webhookId
  **/
  @ApiModelProperty(required = true, value = "The ID of the webhook that was triggered")

  public BigDecimal getWebhookId() {
    return webhookId;
  }


  public void setWebhookId(BigDecimal webhookId) {
    this.webhookId = webhookId;
  }


  public TriggerWebhookEffectProps webhookName(String webhookName) {
    
    this.webhookName = webhookName;
    return this;
  }

   /**
   * The name of the webhook that was triggered
   * @return webhookName
  **/
  @ApiModelProperty(required = true, value = "The name of the webhook that was triggered")

  public String getWebhookName() {
    return webhookName;
  }


  public void setWebhookName(String webhookName) {
    this.webhookName = webhookName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerWebhookEffectProps triggerWebhookEffectProps = (TriggerWebhookEffectProps) o;
    return Objects.equals(this.webhookId, triggerWebhookEffectProps.webhookId) &&
        Objects.equals(this.webhookName, triggerWebhookEffectProps.webhookName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookId, webhookName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerWebhookEffectProps {\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    webhookName: ").append(toIndentedString(webhookName)).append("\n");
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

