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
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")

public class NewAttribute {
  /**
   * The name of the entity that can have this attribute. When creating or updating the entities of a given type, you can include an &#x60;attributes&#x60; object with keys corresponding to the &#x60;name&#x60; of the custom attributes for that type.
   */
  @JsonAdapter(EntityEnum.Adapter.class)
  public enum EntityEnum {
    ACCOUNT("Account"),
    
    APPLICATION("Application"),
    
    CAMPAIGN("Campaign"),
    
    CUSTOMERPROFILE("CustomerProfile"),
    
    CUSTOMERSESSION("CustomerSession"),
    
    CARTITEM("CartItem"),
    
    COUPON("Coupon"),
    
    EVENT("Event"),
    
    GIVEAWAY("Giveaway"),
    
    REFERRAL("Referral");

    private String value;

    EntityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityEnum fromValue(String value) {
      for (EntityEnum b : EntityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private EntityEnum entity;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  /**
   * The data type of the attribute, a &#x60;time&#x60; attribute must be sent as a string that conforms to the [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp format.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    STRING("string"),
    
    NUMBER("number"),
    
    BOOLEAN("boolean"),
    
    TIME("time"),
    
    _LIST_STRING_("(list string)"),
    
    _LIST_NUMBER_("(list number)"),
    
    _LIST_TIME_("(list time)"),
    
    LOCATION("location"),
    
    _LIST_LOCATION_("(list location)");

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

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUGGESTIONS = "suggestions";
  @SerializedName(SERIALIZED_NAME_SUGGESTIONS)
  private List<String> suggestions = new ArrayList<String>();

  public static final String SERIALIZED_NAME_HAS_ALLOWED_LIST = "hasAllowedList";
  @SerializedName(SERIALIZED_NAME_HAS_ALLOWED_LIST)
  private Boolean hasAllowedList = false;

  public static final String SERIALIZED_NAME_RESTRICTED_BY_SUGGESTIONS = "restrictedBySuggestions";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_BY_SUGGESTIONS)
  private Boolean restrictedBySuggestions = false;

  public static final String SERIALIZED_NAME_EDITABLE = "editable";
  @SerializedName(SERIALIZED_NAME_EDITABLE)
  private Boolean editable;

  public static final String SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS = "subscribedApplicationsIds";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS)
  private List<Integer> subscribedApplicationsIds = null;

  public static final String SERIALIZED_NAME_SUBSCRIBED_CATALOGS_IDS = "subscribedCatalogsIds";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_CATALOGS_IDS)
  private List<Integer> subscribedCatalogsIds = null;

  /**
   * Gets or Sets allowedSubscriptions
   */
  @JsonAdapter(AllowedSubscriptionsEnum.Adapter.class)
  public enum AllowedSubscriptionsEnum {
    APPLICATION("application"),
    
    CATALOG("catalog");

    private String value;

    AllowedSubscriptionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AllowedSubscriptionsEnum fromValue(String value) {
      for (AllowedSubscriptionsEnum b : AllowedSubscriptionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AllowedSubscriptionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllowedSubscriptionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllowedSubscriptionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AllowedSubscriptionsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALLOWED_SUBSCRIPTIONS = "allowedSubscriptions";
  @SerializedName(SERIALIZED_NAME_ALLOWED_SUBSCRIPTIONS)
  private List<AllowedSubscriptionsEnum> allowedSubscriptions = null;


  public NewAttribute entity(EntityEnum entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * The name of the entity that can have this attribute. When creating or updating the entities of a given type, you can include an &#x60;attributes&#x60; object with keys corresponding to the &#x60;name&#x60; of the custom attributes for that type.
   * @return entity
  **/
  @ApiModelProperty(example = "Event", required = true, value = "The name of the entity that can have this attribute. When creating or updating the entities of a given type, you can include an `attributes` object with keys corresponding to the `name` of the custom attributes for that type.")

  public EntityEnum getEntity() {
    return entity;
  }


  public void setEntity(EntityEnum entity) {
    this.entity = entity;
  }


  public NewAttribute eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pageViewed", value = "")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public NewAttribute name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The attribute name that will be used in API requests and Talang. E.g. if &#x60;name &#x3D;&#x3D; \&quot;region\&quot;&#x60; then you would set the region attribute by including an &#x60;attributes.region&#x60; property in your request payload.
   * @return name
  **/
  @ApiModelProperty(example = "pageViewed", required = true, value = "The attribute name that will be used in API requests and Talang. E.g. if `name == \"region\"` then you would set the region attribute by including an `attributes.region` property in your request payload.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewAttribute title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The human-readable name for the attribute that will be shown in the Campaign Manager. Like &#x60;name&#x60;, the combination of entity and title must also be unique.
   * @return title
  **/
  @ApiModelProperty(example = "Page view event", required = true, value = "The human-readable name for the attribute that will be shown in the Campaign Manager. Like `name`, the combination of entity and title must also be unique.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public NewAttribute type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The data type of the attribute, a &#x60;time&#x60; attribute must be sent as a string that conforms to the [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp format.
   * @return type
  **/
  @ApiModelProperty(example = "string", required = true, value = "The data type of the attribute, a `time` attribute must be sent as a string that conforms to the [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp format.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public NewAttribute description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of this attribute.
   * @return description
  **/
  @ApiModelProperty(example = "Event triggered when a customer displays a page.", required = true, value = "A description of this attribute.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NewAttribute suggestions(List<String> suggestions) {
    
    this.suggestions = suggestions;
    return this;
  }

  public NewAttribute addSuggestionsItem(String suggestionsItem) {
    this.suggestions.add(suggestionsItem);
    return this;
  }

   /**
   * A list of suggestions for the attribute.
   * @return suggestions
  **/
  @ApiModelProperty(required = true, value = "A list of suggestions for the attribute.")

  public List<String> getSuggestions() {
    return suggestions;
  }


  public void setSuggestions(List<String> suggestions) {
    this.suggestions = suggestions;
  }


  public NewAttribute hasAllowedList(Boolean hasAllowedList) {
    
    this.hasAllowedList = hasAllowedList;
    return this;
  }

   /**
   * Whether or not this attribute has an allowed list of values associated with it.
   * @return hasAllowedList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not this attribute has an allowed list of values associated with it.")

  public Boolean getHasAllowedList() {
    return hasAllowedList;
  }


  public void setHasAllowedList(Boolean hasAllowedList) {
    this.hasAllowedList = hasAllowedList;
  }


  public NewAttribute restrictedBySuggestions(Boolean restrictedBySuggestions) {
    
    this.restrictedBySuggestions = restrictedBySuggestions;
    return this;
  }

   /**
   * Whether or not this attribute&#39;s value is restricted by suggestions (&#x60;suggestions&#x60; property) or by an allowed list of value (&#x60;hasAllowedList&#x60; property). 
   * @return restrictedBySuggestions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not this attribute's value is restricted by suggestions (`suggestions` property) or by an allowed list of value (`hasAllowedList` property). ")

  public Boolean getRestrictedBySuggestions() {
    return restrictedBySuggestions;
  }


  public void setRestrictedBySuggestions(Boolean restrictedBySuggestions) {
    this.restrictedBySuggestions = restrictedBySuggestions;
  }


  public NewAttribute editable(Boolean editable) {
    
    this.editable = editable;
    return this;
  }

   /**
   * Whether or not this attribute can be edited.
   * @return editable
  **/
  @ApiModelProperty(example = "true", required = true, value = "Whether or not this attribute can be edited.")

  public Boolean getEditable() {
    return editable;
  }


  public void setEditable(Boolean editable) {
    this.editable = editable;
  }


  public NewAttribute subscribedApplicationsIds(List<Integer> subscribedApplicationsIds) {
    
    this.subscribedApplicationsIds = subscribedApplicationsIds;
    return this;
  }

  public NewAttribute addSubscribedApplicationsIdsItem(Integer subscribedApplicationsIdsItem) {
    if (this.subscribedApplicationsIds == null) {
      this.subscribedApplicationsIds = new ArrayList<Integer>();
    }
    this.subscribedApplicationsIds.add(subscribedApplicationsIdsItem);
    return this;
  }

   /**
   * A list of the IDs of the applications where this attribute is available.
   * @return subscribedApplicationsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1, 4, 9]", value = "A list of the IDs of the applications where this attribute is available.")

  public List<Integer> getSubscribedApplicationsIds() {
    return subscribedApplicationsIds;
  }


  public void setSubscribedApplicationsIds(List<Integer> subscribedApplicationsIds) {
    this.subscribedApplicationsIds = subscribedApplicationsIds;
  }


  public NewAttribute subscribedCatalogsIds(List<Integer> subscribedCatalogsIds) {
    
    this.subscribedCatalogsIds = subscribedCatalogsIds;
    return this;
  }

  public NewAttribute addSubscribedCatalogsIdsItem(Integer subscribedCatalogsIdsItem) {
    if (this.subscribedCatalogsIds == null) {
      this.subscribedCatalogsIds = new ArrayList<Integer>();
    }
    this.subscribedCatalogsIds.add(subscribedCatalogsIdsItem);
    return this;
  }

   /**
   * A list of the IDs of the catalogs where this attribute is available.
   * @return subscribedCatalogsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[2, 5]", value = "A list of the IDs of the catalogs where this attribute is available.")

  public List<Integer> getSubscribedCatalogsIds() {
    return subscribedCatalogsIds;
  }


  public void setSubscribedCatalogsIds(List<Integer> subscribedCatalogsIds) {
    this.subscribedCatalogsIds = subscribedCatalogsIds;
  }


  public NewAttribute allowedSubscriptions(List<AllowedSubscriptionsEnum> allowedSubscriptions) {
    
    this.allowedSubscriptions = allowedSubscriptions;
    return this;
  }

  public NewAttribute addAllowedSubscriptionsItem(AllowedSubscriptionsEnum allowedSubscriptionsItem) {
    if (this.allowedSubscriptions == null) {
      this.allowedSubscriptions = new ArrayList<AllowedSubscriptionsEnum>();
    }
    this.allowedSubscriptions.add(allowedSubscriptionsItem);
    return this;
  }

   /**
   * A list of allowed subscription types for this attribute.  **Note:** This only applies to attributes associated with the &#x60;CartItem&#x60; entity. 
   * @return allowedSubscriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[application, catalog]", value = "A list of allowed subscription types for this attribute.  **Note:** This only applies to attributes associated with the `CartItem` entity. ")

  public List<AllowedSubscriptionsEnum> getAllowedSubscriptions() {
    return allowedSubscriptions;
  }


  public void setAllowedSubscriptions(List<AllowedSubscriptionsEnum> allowedSubscriptions) {
    this.allowedSubscriptions = allowedSubscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewAttribute newAttribute = (NewAttribute) o;
    return Objects.equals(this.entity, newAttribute.entity) &&
        Objects.equals(this.eventType, newAttribute.eventType) &&
        Objects.equals(this.name, newAttribute.name) &&
        Objects.equals(this.title, newAttribute.title) &&
        Objects.equals(this.type, newAttribute.type) &&
        Objects.equals(this.description, newAttribute.description) &&
        Objects.equals(this.suggestions, newAttribute.suggestions) &&
        Objects.equals(this.hasAllowedList, newAttribute.hasAllowedList) &&
        Objects.equals(this.restrictedBySuggestions, newAttribute.restrictedBySuggestions) &&
        Objects.equals(this.editable, newAttribute.editable) &&
        Objects.equals(this.subscribedApplicationsIds, newAttribute.subscribedApplicationsIds) &&
        Objects.equals(this.subscribedCatalogsIds, newAttribute.subscribedCatalogsIds) &&
        Objects.equals(this.allowedSubscriptions, newAttribute.allowedSubscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, eventType, name, title, type, description, suggestions, hasAllowedList, restrictedBySuggestions, editable, subscribedApplicationsIds, subscribedCatalogsIds, allowedSubscriptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAttribute {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
    sb.append("    hasAllowedList: ").append(toIndentedString(hasAllowedList)).append("\n");
    sb.append("    restrictedBySuggestions: ").append(toIndentedString(restrictedBySuggestions)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    subscribedApplicationsIds: ").append(toIndentedString(subscribedApplicationsIds)).append("\n");
    sb.append("    subscribedCatalogsIds: ").append(toIndentedString(subscribedCatalogsIds)).append("\n");
    sb.append("    allowedSubscriptions: ").append(toIndentedString(allowedSubscriptions)).append("\n");
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

