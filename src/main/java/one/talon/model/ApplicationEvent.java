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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.Effect;
import one.talon.model.RuleFailureReason;
import org.threeten.bp.OffsetDateTime;

/**
 * ApplicationEvent
 */

public class ApplicationEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private Integer profileId;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private Integer storeId;

  public static final String SERIALIZED_NAME_STORE_INTEGRATION_ID = "storeIntegrationId";
  @SerializedName(SERIALIZED_NAME_STORE_INTEGRATION_ID)
  private String storeIntegrationId;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private Integer sessionId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_EFFECTS = "effects";
  @SerializedName(SERIALIZED_NAME_EFFECTS)
  private List<Effect> effects = new ArrayList<Effect>();

  public static final String SERIALIZED_NAME_RULE_FAILURE_REASONS = "ruleFailureReasons";
  @SerializedName(SERIALIZED_NAME_RULE_FAILURE_REASONS)
  private List<RuleFailureReason> ruleFailureReasons = null;


  public ApplicationEvent id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Internal ID of this entity.
   * @return id
  **/
  @ApiModelProperty(example = "6", required = true, value = "Internal ID of this entity.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ApplicationEvent created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The time this entity was created.
   * @return created
  **/
  @ApiModelProperty(example = "2020-06-10T09:05:27.993483Z", required = true, value = "The time this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public ApplicationEvent applicationId(Integer applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The ID of the application that owns this entity.
   * @return applicationId
  **/
  @ApiModelProperty(example = "322", required = true, value = "The ID of the application that owns this entity.")

  public Integer getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }


  public ApplicationEvent profileId(Integer profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * The globally unique Talon.One ID of the customer that created this entity.
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "138", value = "The globally unique Talon.One ID of the customer that created this entity.")

  public Integer getProfileId() {
    return profileId;
  }


  public void setProfileId(Integer profileId) {
    this.profileId = profileId;
  }


  public ApplicationEvent storeId(Integer storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The ID of the store.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the store.")

  public Integer getStoreId() {
    return storeId;
  }


  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }


  public ApplicationEvent storeIntegrationId(String storeIntegrationId) {
    
    this.storeIntegrationId = storeIntegrationId;
    return this;
  }

   /**
   * The integration ID of the store. You choose this ID when you create a store.
   * @return storeIntegrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STORE-001", value = "The integration ID of the store. You choose this ID when you create a store.")

  public String getStoreIntegrationId() {
    return storeIntegrationId;
  }


  public void setStoreIntegrationId(String storeIntegrationId) {
    this.storeIntegrationId = storeIntegrationId;
  }


  public ApplicationEvent sessionId(Integer sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The globally unique Talon.One ID of the session that contains this event.
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The globally unique Talon.One ID of the session that contains this event.")

  public Integer getSessionId() {
    return sessionId;
  }


  public void setSessionId(Integer sessionId) {
    this.sessionId = sessionId;
  }


  public ApplicationEvent type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * A string representing the event. Must not be a reserved event name.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "A string representing the event. Must not be a reserved event name.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ApplicationEvent attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Additional JSON serialized data associated with the event.
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "Additional JSON serialized data associated with the event.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public ApplicationEvent effects(List<Effect> effects) {
    
    this.effects = effects;
    return this;
  }

  public ApplicationEvent addEffectsItem(Effect effectsItem) {
    this.effects.add(effectsItem);
    return this;
  }

   /**
   * An array containing the effects that were applied as a result of this event.
   * @return effects
  **/
  @ApiModelProperty(required = true, value = "An array containing the effects that were applied as a result of this event.")

  public List<Effect> getEffects() {
    return effects;
  }


  public void setEffects(List<Effect> effects) {
    this.effects = effects;
  }


  public ApplicationEvent ruleFailureReasons(List<RuleFailureReason> ruleFailureReasons) {
    
    this.ruleFailureReasons = ruleFailureReasons;
    return this;
  }

  public ApplicationEvent addRuleFailureReasonsItem(RuleFailureReason ruleFailureReasonsItem) {
    if (this.ruleFailureReasons == null) {
      this.ruleFailureReasons = new ArrayList<RuleFailureReason>();
    }
    this.ruleFailureReasons.add(ruleFailureReasonsItem);
    return this;
  }

   /**
   * An array containing the rule failure reasons which happened during this event.
   * @return ruleFailureReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array containing the rule failure reasons which happened during this event.")

  public List<RuleFailureReason> getRuleFailureReasons() {
    return ruleFailureReasons;
  }


  public void setRuleFailureReasons(List<RuleFailureReason> ruleFailureReasons) {
    this.ruleFailureReasons = ruleFailureReasons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationEvent applicationEvent = (ApplicationEvent) o;
    return Objects.equals(this.id, applicationEvent.id) &&
        Objects.equals(this.created, applicationEvent.created) &&
        Objects.equals(this.applicationId, applicationEvent.applicationId) &&
        Objects.equals(this.profileId, applicationEvent.profileId) &&
        Objects.equals(this.storeId, applicationEvent.storeId) &&
        Objects.equals(this.storeIntegrationId, applicationEvent.storeIntegrationId) &&
        Objects.equals(this.sessionId, applicationEvent.sessionId) &&
        Objects.equals(this.type, applicationEvent.type) &&
        Objects.equals(this.attributes, applicationEvent.attributes) &&
        Objects.equals(this.effects, applicationEvent.effects) &&
        Objects.equals(this.ruleFailureReasons, applicationEvent.ruleFailureReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, applicationId, profileId, storeId, storeIntegrationId, sessionId, type, attributes, effects, ruleFailureReasons);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeIntegrationId: ").append(toIndentedString(storeIntegrationId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    effects: ").append(toIndentedString(effects)).append("\n");
    sb.append("    ruleFailureReasons: ").append(toIndentedString(ruleFailureReasons)).append("\n");
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

