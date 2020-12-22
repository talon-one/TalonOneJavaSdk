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

/**
 * Definition of all properties that are present on all effects, independent of their type
 */
@ApiModel(description = "Definition of all properties that are present on all effects, independent of their type")

public class EffectEntity {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_RULESET_ID = "rulesetId";
  @SerializedName(SERIALIZED_NAME_RULESET_ID)
  private Integer rulesetId;

  public static final String SERIALIZED_NAME_RULE_INDEX = "ruleIndex";
  @SerializedName(SERIALIZED_NAME_RULE_INDEX)
  private Integer ruleIndex;

  public static final String SERIALIZED_NAME_RULE_NAME = "ruleName";
  @SerializedName(SERIALIZED_NAME_RULE_NAME)
  private String ruleName;

  public static final String SERIALIZED_NAME_EFFECT_TYPE = "effectType";
  @SerializedName(SERIALIZED_NAME_EFFECT_TYPE)
  private String effectType;

  public static final String SERIALIZED_NAME_TRIGGERED_BY_COUPON = "triggeredByCoupon";
  @SerializedName(SERIALIZED_NAME_TRIGGERED_BY_COUPON)
  private Integer triggeredByCoupon;


  public EffectEntity campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The ID of the campaign that triggered this effect
   * @return campaignId
  **/
  @ApiModelProperty(required = true, value = "The ID of the campaign that triggered this effect")

  public Integer getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public EffectEntity rulesetId(Integer rulesetId) {
    
    this.rulesetId = rulesetId;
    return this;
  }

   /**
   * The ID of the ruleset that was active in the campaign when this effect was triggered
   * @return rulesetId
  **/
  @ApiModelProperty(required = true, value = "The ID of the ruleset that was active in the campaign when this effect was triggered")

  public Integer getRulesetId() {
    return rulesetId;
  }


  public void setRulesetId(Integer rulesetId) {
    this.rulesetId = rulesetId;
  }


  public EffectEntity ruleIndex(Integer ruleIndex) {
    
    this.ruleIndex = ruleIndex;
    return this;
  }

   /**
   * The position of the rule that triggered this effect within the ruleset
   * @return ruleIndex
  **/
  @ApiModelProperty(required = true, value = "The position of the rule that triggered this effect within the ruleset")

  public Integer getRuleIndex() {
    return ruleIndex;
  }


  public void setRuleIndex(Integer ruleIndex) {
    this.ruleIndex = ruleIndex;
  }


  public EffectEntity ruleName(String ruleName) {
    
    this.ruleName = ruleName;
    return this;
  }

   /**
   * The name of the rule that triggered this effect
   * @return ruleName
  **/
  @ApiModelProperty(required = true, value = "The name of the rule that triggered this effect")

  public String getRuleName() {
    return ruleName;
  }


  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public EffectEntity effectType(String effectType) {
    
    this.effectType = effectType;
    return this;
  }

   /**
   * The type of effect that was triggered
   * @return effectType
  **/
  @ApiModelProperty(required = true, value = "The type of effect that was triggered")

  public String getEffectType() {
    return effectType;
  }


  public void setEffectType(String effectType) {
    this.effectType = effectType;
  }


  public EffectEntity triggeredByCoupon(Integer triggeredByCoupon) {
    
    this.triggeredByCoupon = triggeredByCoupon;
    return this;
  }

   /**
   * The ID of the coupon that was being evaluated when this effect was triggered
   * @return triggeredByCoupon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the coupon that was being evaluated when this effect was triggered")

  public Integer getTriggeredByCoupon() {
    return triggeredByCoupon;
  }


  public void setTriggeredByCoupon(Integer triggeredByCoupon) {
    this.triggeredByCoupon = triggeredByCoupon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectEntity effectEntity = (EffectEntity) o;
    return Objects.equals(this.campaignId, effectEntity.campaignId) &&
        Objects.equals(this.rulesetId, effectEntity.rulesetId) &&
        Objects.equals(this.ruleIndex, effectEntity.ruleIndex) &&
        Objects.equals(this.ruleName, effectEntity.ruleName) &&
        Objects.equals(this.effectType, effectEntity.effectType) &&
        Objects.equals(this.triggeredByCoupon, effectEntity.triggeredByCoupon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, rulesetId, ruleIndex, ruleName, effectType, triggeredByCoupon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectEntity {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    rulesetId: ").append(toIndentedString(rulesetId)).append("\n");
    sb.append("    ruleIndex: ").append(toIndentedString(ruleIndex)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    effectType: ").append(toIndentedString(effectType)).append("\n");
    sb.append("    triggeredByCoupon: ").append(toIndentedString(triggeredByCoupon)).append("\n");
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

