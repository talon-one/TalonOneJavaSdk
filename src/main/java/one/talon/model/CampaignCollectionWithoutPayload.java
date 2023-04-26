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
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class CampaignCollectionWithoutPayload {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private Integer modifiedBy;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Integer createdBy;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;


  public CampaignCollectionWithoutPayload id(Integer id) {
    
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


  public CampaignCollectionWithoutPayload created(OffsetDateTime created) {
    
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


  public CampaignCollectionWithoutPayload accountId(Integer accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that owns this entity.
   * @return accountId
  **/
  @ApiModelProperty(example = "3886", required = true, value = "The ID of the account that owns this entity.")

  public Integer getAccountId() {
    return accountId;
  }


  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }


  public CampaignCollectionWithoutPayload modified(OffsetDateTime modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * The time this entity was last modified.
   * @return modified
  **/
  @ApiModelProperty(example = "2021-09-12T10:12:42Z", required = true, value = "The time this entity was last modified.")

  public OffsetDateTime getModified() {
    return modified;
  }


  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  public CampaignCollectionWithoutPayload description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A short description of the purpose of this collection.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My collection of SKUs", value = "A short description of the purpose of this collection.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CampaignCollectionWithoutPayload name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this collection.
   * @return name
  **/
  @ApiModelProperty(example = "My collection", required = true, value = "The name of this collection.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CampaignCollectionWithoutPayload modifiedBy(Integer modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * ID of the user who last updated this effect if available.
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "48", value = "ID of the user who last updated this effect if available.")

  public Integer getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(Integer modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public CampaignCollectionWithoutPayload createdBy(Integer createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of the user who created this effect.
   * @return createdBy
  **/
  @ApiModelProperty(example = "134", required = true, value = "ID of the user who created this effect.")

  public Integer getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }


  public CampaignCollectionWithoutPayload applicationId(Integer applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The ID of the Application that owns this entity.
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The ID of the Application that owns this entity.")

  public Integer getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }


  public CampaignCollectionWithoutPayload campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The ID of the campaign that owns this entity.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "The ID of the campaign that owns this entity.")

  public Integer getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Integer campaignId) {
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
    CampaignCollectionWithoutPayload campaignCollectionWithoutPayload = (CampaignCollectionWithoutPayload) o;
    return Objects.equals(this.id, campaignCollectionWithoutPayload.id) &&
        Objects.equals(this.created, campaignCollectionWithoutPayload.created) &&
        Objects.equals(this.accountId, campaignCollectionWithoutPayload.accountId) &&
        Objects.equals(this.modified, campaignCollectionWithoutPayload.modified) &&
        Objects.equals(this.description, campaignCollectionWithoutPayload.description) &&
        Objects.equals(this.name, campaignCollectionWithoutPayload.name) &&
        Objects.equals(this.modifiedBy, campaignCollectionWithoutPayload.modifiedBy) &&
        Objects.equals(this.createdBy, campaignCollectionWithoutPayload.createdBy) &&
        Objects.equals(this.applicationId, campaignCollectionWithoutPayload.applicationId) &&
        Objects.equals(this.campaignId, campaignCollectionWithoutPayload.campaignId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, accountId, modified, description, name, modifiedBy, createdBy, applicationId, campaignId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCollectionWithoutPayload {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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

