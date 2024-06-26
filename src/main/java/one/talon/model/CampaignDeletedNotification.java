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
import one.talon.model.Campaign;
import org.threeten.bp.OffsetDateTime;

/**
 * A notification regarding a campaign that was deleted.
 */
@ApiModel(description = "A notification regarding a campaign that was deleted.")

public class CampaignDeletedNotification {
  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private Campaign campaign;

  public static final String SERIALIZED_NAME_DELETED_AT = "deletedAt";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private OffsetDateTime deletedAt;


  public CampaignDeletedNotification campaign(Campaign campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @ApiModelProperty(required = true, value = "")

  public Campaign getCampaign() {
    return campaign;
  }


  public void setCampaign(Campaign campaign) {
    this.campaign = campaign;
  }


  public CampaignDeletedNotification deletedAt(OffsetDateTime deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Time when the campaign was deleted.
   * @return deletedAt
  **/
  @ApiModelProperty(example = "2022-11-10T23:00Z", required = true, value = "Time when the campaign was deleted.")

  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignDeletedNotification campaignDeletedNotification = (CampaignDeletedNotification) o;
    return Objects.equals(this.campaign, campaignDeletedNotification.campaign) &&
        Objects.equals(this.deletedAt, campaignDeletedNotification.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, deletedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDeletedNotification {\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
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

