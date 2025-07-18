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
import one.talon.model.CampaignStoreBudgetLimitConfig;
import org.threeten.bp.OffsetDateTime;

/**
 * CampaignStoreBudget
 */

public class CampaignStoreBudget {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private Long storeId;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private List<CampaignStoreBudgetLimitConfig> limits = new ArrayList<CampaignStoreBudgetLimitConfig>();


  public CampaignStoreBudget id(Long id) {
    
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


  public CampaignStoreBudget created(OffsetDateTime created) {
    
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


  public CampaignStoreBudget campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The ID of the campaign that owns this entity.
   * @return campaignId
  **/
  @ApiModelProperty(example = "322", required = true, value = "The ID of the campaign that owns this entity.")

  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public CampaignStoreBudget storeId(Long storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The ID of the store.
   * @return storeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the store.")

  public Long getStoreId() {
    return storeId;
  }


  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }


  public CampaignStoreBudget limits(List<CampaignStoreBudgetLimitConfig> limits) {
    
    this.limits = limits;
    return this;
  }

  public CampaignStoreBudget addLimitsItem(CampaignStoreBudgetLimitConfig limitsItem) {
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * The set of budget limits for stores linked to the campaign.
   * @return limits
  **/
  @ApiModelProperty(required = true, value = "The set of budget limits for stores linked to the campaign.")

  public List<CampaignStoreBudgetLimitConfig> getLimits() {
    return limits;
  }


  public void setLimits(List<CampaignStoreBudgetLimitConfig> limits) {
    this.limits = limits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignStoreBudget campaignStoreBudget = (CampaignStoreBudget) o;
    return Objects.equals(this.id, campaignStoreBudget.id) &&
        Objects.equals(this.created, campaignStoreBudget.created) &&
        Objects.equals(this.campaignId, campaignStoreBudget.campaignId) &&
        Objects.equals(this.storeId, campaignStoreBudget.storeId) &&
        Objects.equals(this.limits, campaignStoreBudget.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, campaignId, storeId, limits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignStoreBudget {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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

