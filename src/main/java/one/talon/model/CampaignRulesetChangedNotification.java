/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSession](https://docs.talon.one/integration-api/#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
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
import one.talon.model.Campaign;
import one.talon.model.Ruleset;

/**
 * A notification regarding a campaign whose ruleset was changed.
 */
@ApiModel(description = "A notification regarding a campaign whose ruleset was changed.")

public class CampaignRulesetChangedNotification {
  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private Campaign campaign;

  public static final String SERIALIZED_NAME_OLD_RULESET = "oldRuleset";
  @SerializedName(SERIALIZED_NAME_OLD_RULESET)
  private Ruleset oldRuleset;

  public static final String SERIALIZED_NAME_RULESET = "ruleset";
  @SerializedName(SERIALIZED_NAME_RULESET)
  private Ruleset ruleset;


  public CampaignRulesetChangedNotification campaign(Campaign campaign) {
    
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


  public CampaignRulesetChangedNotification oldRuleset(Ruleset oldRuleset) {
    
    this.oldRuleset = oldRuleset;
    return this;
  }

   /**
   * Get oldRuleset
   * @return oldRuleset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Ruleset getOldRuleset() {
    return oldRuleset;
  }


  public void setOldRuleset(Ruleset oldRuleset) {
    this.oldRuleset = oldRuleset;
  }


  public CampaignRulesetChangedNotification ruleset(Ruleset ruleset) {
    
    this.ruleset = ruleset;
    return this;
  }

   /**
   * Get ruleset
   * @return ruleset
  **/
  @ApiModelProperty(required = true, value = "")

  public Ruleset getRuleset() {
    return ruleset;
  }


  public void setRuleset(Ruleset ruleset) {
    this.ruleset = ruleset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRulesetChangedNotification campaignRulesetChangedNotification = (CampaignRulesetChangedNotification) o;
    return Objects.equals(this.campaign, campaignRulesetChangedNotification.campaign) &&
        Objects.equals(this.oldRuleset, campaignRulesetChangedNotification.oldRuleset) &&
        Objects.equals(this.ruleset, campaignRulesetChangedNotification.ruleset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, oldRuleset, ruleset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRulesetChangedNotification {\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    oldRuleset: ").append(toIndentedString(oldRuleset)).append("\n");
    sb.append("    ruleset: ").append(toIndentedString(ruleset)).append("\n");
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
