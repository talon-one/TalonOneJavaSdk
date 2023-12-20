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
import one.talon.model.LedgerEntry;
import one.talon.model.Meta;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Event {
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
  private String profileId;

  public static final String SERIALIZED_NAME_STORE_INTEGRATION_ID = "storeIntegrationId";
  @SerializedName(SERIALIZED_NAME_STORE_INTEGRATION_ID)
  private String storeIntegrationId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_EFFECTS = "effects";
  @SerializedName(SERIALIZED_NAME_EFFECTS)
  private List<Object> effects = new ArrayList<Object>();

  public static final String SERIALIZED_NAME_LEDGER_ENTRIES = "ledgerEntries";
  @SerializedName(SERIALIZED_NAME_LEDGER_ENTRIES)
  private List<LedgerEntry> ledgerEntries = new ArrayList<LedgerEntry>();

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Meta meta;


  public Event id(Integer id) {
    
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


  public Event created(OffsetDateTime created) {
    
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


  public Event applicationId(Integer applicationId) {
    
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


  public Event profileId(String profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * ID of the customer profile set by your integration layer.  **Note:** If the customer does not yet have a known &#x60;profileId&#x60;, we recommend you use a guest &#x60;profileId&#x60;. 
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "URNGV8294NV", value = "ID of the customer profile set by your integration layer.  **Note:** If the customer does not yet have a known `profileId`, we recommend you use a guest `profileId`. ")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public Event storeIntegrationId(String storeIntegrationId) {
    
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


  public Event type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * A string representing the event. Must not be a reserved event name.
   * @return type
  **/
  @ApiModelProperty(example = "pageViewed", required = true, value = "A string representing the event. Must not be a reserved event name.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Event attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary additional JSON data associated with the event.
   * @return attributes
  **/
  @ApiModelProperty(example = "{\"myAttribute\":\"myValue\"}", required = true, value = "Arbitrary additional JSON data associated with the event.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public Event sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The ID of the session that this event occurred in.
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "175KJPS947296", value = "The ID of the session that this event occurred in.")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public Event effects(List<Object> effects) {
    
    this.effects = effects;
    return this;
  }

  public Event addEffectsItem(Object effectsItem) {
    this.effects.add(effectsItem);
    return this;
  }

   /**
   * An array of effects generated by the rules of the enabled campaigns of the Application.  You decide how to apply them in your system. See the list of [API effects](https://docs.talon.one/docs/dev/integration-api/api-effects). 
   * @return effects
  **/
  @ApiModelProperty(required = true, value = "An array of effects generated by the rules of the enabled campaigns of the Application.  You decide how to apply them in your system. See the list of [API effects](https://docs.talon.one/docs/dev/integration-api/api-effects). ")

  public List<Object> getEffects() {
    return effects;
  }


  public void setEffects(List<Object> effects) {
    this.effects = effects;
  }


  public Event ledgerEntries(List<LedgerEntry> ledgerEntries) {
    
    this.ledgerEntries = ledgerEntries;
    return this;
  }

  public Event addLedgerEntriesItem(LedgerEntry ledgerEntriesItem) {
    this.ledgerEntries.add(ledgerEntriesItem);
    return this;
  }

   /**
   * Ledger entries for the event.
   * @return ledgerEntries
  **/
  @ApiModelProperty(required = true, value = "Ledger entries for the event.")

  public List<LedgerEntry> getLedgerEntries() {
    return ledgerEntries;
  }


  public void setLedgerEntries(List<LedgerEntry> ledgerEntries) {
    this.ledgerEntries = ledgerEntries;
  }


  public Event meta(Meta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Meta getMeta() {
    return meta;
  }


  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.created, event.created) &&
        Objects.equals(this.applicationId, event.applicationId) &&
        Objects.equals(this.profileId, event.profileId) &&
        Objects.equals(this.storeIntegrationId, event.storeIntegrationId) &&
        Objects.equals(this.type, event.type) &&
        Objects.equals(this.attributes, event.attributes) &&
        Objects.equals(this.sessionId, event.sessionId) &&
        Objects.equals(this.effects, event.effects) &&
        Objects.equals(this.ledgerEntries, event.ledgerEntries) &&
        Objects.equals(this.meta, event.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, applicationId, profileId, storeIntegrationId, type, attributes, sessionId, effects, ledgerEntries, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    storeIntegrationId: ").append(toIndentedString(storeIntegrationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    effects: ").append(toIndentedString(effects)).append("\n");
    sb.append("    ledgerEntries: ").append(toIndentedString(ledgerEntries)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

