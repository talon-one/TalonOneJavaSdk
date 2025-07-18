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
import org.threeten.bp.OffsetDateTime;

/**
 * Store
 */

public class Store {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integrationId";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Long applicationId;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_LINKED_CAMPAIGN_IDS = "linkedCampaignIds";
  @SerializedName(SERIALIZED_NAME_LINKED_CAMPAIGN_IDS)
  private List<Long> linkedCampaignIds = null;


  public Store id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The internal ID of this entity.
   * @return id
  **/
  @ApiModelProperty(example = "6", required = true, value = "The internal ID of this entity.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Store created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The time this entity was created.
   * @return created
  **/
  @ApiModelProperty(example = "2020-02-07T08:15:22Z", required = true, value = "The time this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Store name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the store.
   * @return name
  **/
  @ApiModelProperty(example = "South US store", required = true, value = "The name of the store.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Store description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the store.
   * @return description
  **/
  @ApiModelProperty(example = "This is the description of the store in south US.", required = true, value = "The description of the store.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Store attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * The attributes of the store.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"country\":\"USA\",\"code\":1234}", value = "The attributes of the store.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public Store integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The integration ID of the store. You choose this ID when you create a store.  **Note**: You cannot edit the &#x60;integrationId&#x60; after the store has been created. 
   * @return integrationId
  **/
  @ApiModelProperty(example = "STORE-001", required = true, value = "The integration ID of the store. You choose this ID when you create a store.  **Note**: You cannot edit the `integrationId` after the store has been created. ")

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public Store applicationId(Long applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The ID of the Application that owns this entity.
   * @return applicationId
  **/
  @ApiModelProperty(example = "322", required = true, value = "The ID of the Application that owns this entity.")

  public Long getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }


  public Store updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Timestamp of the most recent update on this entity.
   * @return updated
  **/
  @ApiModelProperty(example = "2021-09-23T10:12:42Z", required = true, value = "Timestamp of the most recent update on this entity.")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  public Store linkedCampaignIds(List<Long> linkedCampaignIds) {
    
    this.linkedCampaignIds = linkedCampaignIds;
    return this;
  }

  public Store addLinkedCampaignIdsItem(Long linkedCampaignIdsItem) {
    if (this.linkedCampaignIds == null) {
      this.linkedCampaignIds = new ArrayList<Long>();
    }
    this.linkedCampaignIds.add(linkedCampaignIdsItem);
    return this;
  }

   /**
   * A list of IDs of the campaigns that are linked with current store.
   * @return linkedCampaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[4, 6, 8]", value = "A list of IDs of the campaigns that are linked with current store.")

  public List<Long> getLinkedCampaignIds() {
    return linkedCampaignIds;
  }


  public void setLinkedCampaignIds(List<Long> linkedCampaignIds) {
    this.linkedCampaignIds = linkedCampaignIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Store store = (Store) o;
    return Objects.equals(this.id, store.id) &&
        Objects.equals(this.created, store.created) &&
        Objects.equals(this.name, store.name) &&
        Objects.equals(this.description, store.description) &&
        Objects.equals(this.attributes, store.attributes) &&
        Objects.equals(this.integrationId, store.integrationId) &&
        Objects.equals(this.applicationId, store.applicationId) &&
        Objects.equals(this.updated, store.updated) &&
        Objects.equals(this.linkedCampaignIds, store.linkedCampaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, name, description, attributes, integrationId, applicationId, updated, linkedCampaignIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Store {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    linkedCampaignIds: ").append(toIndentedString(linkedCampaignIds)).append("\n");
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

