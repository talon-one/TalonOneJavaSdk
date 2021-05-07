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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.LedgerEntry;
import one.talon.model.Meta;
import org.threeten.bp.OffsetDateTime;

/**
 * Event
 */

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
   * Unique ID for this entity.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique ID for this entity.")

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
   * The exact moment this entity was created.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The exact moment this entity was created.")

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
  @ApiModelProperty(required = true, value = "The ID of the application that owns this entity.")

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
   * ID of the customers profile as used within this Talon.One account. May be omitted or set to the empty string if the customer does not yet have a known profile ID.
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the customers profile as used within this Talon.One account. May be omitted or set to the empty string if the customer does not yet have a known profile ID.")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public Event type(String type) {
    
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


  public Event attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary additional JSON data associated with the event.
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "Arbitrary additional JSON data associated with the event.")

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
  @ApiModelProperty(value = "The ID of the session that this event occurred in.")

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
   * An array of \&quot;effects\&quot; that must be applied in response to this event. Example effects include &#x60;addItemToCart&#x60; or &#x60;setDiscount&#x60;. 
   * @return effects
  **/
  @ApiModelProperty(required = true, value = "An array of \"effects\" that must be applied in response to this event. Example effects include `addItemToCart` or `setDiscount`. ")

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
        Objects.equals(this.type, event.type) &&
        Objects.equals(this.attributes, event.attributes) &&
        Objects.equals(this.sessionId, event.sessionId) &&
        Objects.equals(this.effects, event.effects) &&
        Objects.equals(this.ledgerEntries, event.ledgerEntries) &&
        Objects.equals(this.meta, event.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, applicationId, profileId, type, attributes, sessionId, effects, ledgerEntries, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
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

