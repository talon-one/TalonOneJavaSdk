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
 * 
 */
@ApiModel(description = "")

public class InventoryReferral {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_USAGE_LIMIT = "usageLimit";
  @SerializedName(SERIALIZED_NAME_USAGE_LIMIT)
  private Integer usageLimit;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_ADVOCATE_PROFILE_INTEGRATION_ID = "advocateProfileIntegrationId";
  @SerializedName(SERIALIZED_NAME_ADVOCATE_PROFILE_INTEGRATION_ID)
  private String advocateProfileIntegrationId;

  public static final String SERIALIZED_NAME_FRIEND_PROFILE_INTEGRATION_ID = "friendProfileIntegrationId";
  @SerializedName(SERIALIZED_NAME_FRIEND_PROFILE_INTEGRATION_ID)
  private String friendProfileIntegrationId;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_IMPORT_ID = "importId";
  @SerializedName(SERIALIZED_NAME_IMPORT_ID)
  private Integer importId;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_USAGE_COUNTER = "usageCounter";
  @SerializedName(SERIALIZED_NAME_USAGE_COUNTER)
  private Integer usageCounter;

  public static final String SERIALIZED_NAME_BATCH_ID = "batchId";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId;

  public static final String SERIALIZED_NAME_REFERRED_CUSTOMERS = "referredCustomers";
  @SerializedName(SERIALIZED_NAME_REFERRED_CUSTOMERS)
  private List<String> referredCustomers = new ArrayList<String>();


  public InventoryReferral id(Integer id) {
    
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


  public InventoryReferral created(OffsetDateTime created) {
    
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


  public InventoryReferral startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Timestamp at which point the referral code becomes valid.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-10T23:00Z", value = "Timestamp at which point the referral code becomes valid.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public InventoryReferral expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Expiration date of the referral code. Referral never expires if this is omitted, zero, or negative.
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-11-10T23:00Z", value = "Expiration date of the referral code. Referral never expires if this is omitted, zero, or negative.")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public InventoryReferral usageLimit(Integer usageLimit) {
    
    this.usageLimit = usageLimit;
    return this;
  }

   /**
   * The number of times a referral code can be used. &#x60;0&#x60; means no limit but any campaign usage limits will still apply. 
   * minimum: 0
   * maximum: 999999
   * @return usageLimit
  **/
  @ApiModelProperty(example = "1", required = true, value = "The number of times a referral code can be used. `0` means no limit but any campaign usage limits will still apply. ")

  public Integer getUsageLimit() {
    return usageLimit;
  }


  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }


  public InventoryReferral campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * ID of the campaign from which the referral received the referral code.
   * @return campaignId
  **/
  @ApiModelProperty(example = "78", required = true, value = "ID of the campaign from which the referral received the referral code.")

  public Integer getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public InventoryReferral advocateProfileIntegrationId(String advocateProfileIntegrationId) {
    
    this.advocateProfileIntegrationId = advocateProfileIntegrationId;
    return this;
  }

   /**
   * The Integration ID of the Advocate&#39;s Profile.
   * @return advocateProfileIntegrationId
  **/
  @ApiModelProperty(example = "URNGV8294NV", required = true, value = "The Integration ID of the Advocate's Profile.")

  public String getAdvocateProfileIntegrationId() {
    return advocateProfileIntegrationId;
  }


  public void setAdvocateProfileIntegrationId(String advocateProfileIntegrationId) {
    this.advocateProfileIntegrationId = advocateProfileIntegrationId;
  }


  public InventoryReferral friendProfileIntegrationId(String friendProfileIntegrationId) {
    
    this.friendProfileIntegrationId = friendProfileIntegrationId;
    return this;
  }

   /**
   * An optional Integration ID of the Friend&#39;s Profile.
   * @return friendProfileIntegrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BZGGC2454PA", value = "An optional Integration ID of the Friend's Profile.")

  public String getFriendProfileIntegrationId() {
    return friendProfileIntegrationId;
  }


  public void setFriendProfileIntegrationId(String friendProfileIntegrationId) {
    this.friendProfileIntegrationId = friendProfileIntegrationId;
  }


  public InventoryReferral attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this item.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"channel\":\"web\"}", value = "Arbitrary properties associated with this item.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public InventoryReferral importId(Integer importId) {
    
    this.importId = importId;
    return this;
  }

   /**
   * The ID of the Import which created this referral.
   * @return importId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "The ID of the Import which created this referral.")

  public Integer getImportId() {
    return importId;
  }


  public void setImportId(Integer importId) {
    this.importId = importId;
  }


  public InventoryReferral code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The referral code.
   * @return code
  **/
  @ApiModelProperty(example = "27G47Y54VH9L", required = true, value = "The referral code.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public InventoryReferral usageCounter(Integer usageCounter) {
    
    this.usageCounter = usageCounter;
    return this;
  }

   /**
   * The number of times this referral code has been successfully used.
   * @return usageCounter
  **/
  @ApiModelProperty(example = "1", required = true, value = "The number of times this referral code has been successfully used.")

  public Integer getUsageCounter() {
    return usageCounter;
  }


  public void setUsageCounter(Integer usageCounter) {
    this.usageCounter = usageCounter;
  }


  public InventoryReferral batchId(String batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * The ID of the batch the referrals belong to.
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tqyrgahe", value = "The ID of the batch the referrals belong to.")

  public String getBatchId() {
    return batchId;
  }


  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  public InventoryReferral referredCustomers(List<String> referredCustomers) {
    
    this.referredCustomers = referredCustomers;
    return this;
  }

  public InventoryReferral addReferredCustomersItem(String referredCustomersItem) {
    this.referredCustomers.add(referredCustomersItem);
    return this;
  }

   /**
   * An array of referred customers.
   * @return referredCustomers
  **/
  @ApiModelProperty(required = true, value = "An array of referred customers.")

  public List<String> getReferredCustomers() {
    return referredCustomers;
  }


  public void setReferredCustomers(List<String> referredCustomers) {
    this.referredCustomers = referredCustomers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryReferral inventoryReferral = (InventoryReferral) o;
    return Objects.equals(this.id, inventoryReferral.id) &&
        Objects.equals(this.created, inventoryReferral.created) &&
        Objects.equals(this.startDate, inventoryReferral.startDate) &&
        Objects.equals(this.expiryDate, inventoryReferral.expiryDate) &&
        Objects.equals(this.usageLimit, inventoryReferral.usageLimit) &&
        Objects.equals(this.campaignId, inventoryReferral.campaignId) &&
        Objects.equals(this.advocateProfileIntegrationId, inventoryReferral.advocateProfileIntegrationId) &&
        Objects.equals(this.friendProfileIntegrationId, inventoryReferral.friendProfileIntegrationId) &&
        Objects.equals(this.attributes, inventoryReferral.attributes) &&
        Objects.equals(this.importId, inventoryReferral.importId) &&
        Objects.equals(this.code, inventoryReferral.code) &&
        Objects.equals(this.usageCounter, inventoryReferral.usageCounter) &&
        Objects.equals(this.batchId, inventoryReferral.batchId) &&
        Objects.equals(this.referredCustomers, inventoryReferral.referredCustomers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, startDate, expiryDate, usageLimit, campaignId, advocateProfileIntegrationId, friendProfileIntegrationId, attributes, importId, code, usageCounter, batchId, referredCustomers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryReferral {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    advocateProfileIntegrationId: ").append(toIndentedString(advocateProfileIntegrationId)).append("\n");
    sb.append("    friendProfileIntegrationId: ").append(toIndentedString(friendProfileIntegrationId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    importId: ").append(toIndentedString(importId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    usageCounter: ").append(toIndentedString(usageCounter)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    referredCustomers: ").append(toIndentedString(referredCustomers)).append("\n");
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

