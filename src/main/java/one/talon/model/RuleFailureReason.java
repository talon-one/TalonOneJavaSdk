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
 * Details about why a rule failed
 */
@ApiModel(description = "Details about why a rule failed")

public class RuleFailureReason {
  public static final String SERIALIZED_NAME_CAMPAIGN_I_D = "campaignID";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_I_D)
  private Integer campaignID;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaignName";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName;

  public static final String SERIALIZED_NAME_RULESET_I_D = "rulesetID";
  @SerializedName(SERIALIZED_NAME_RULESET_I_D)
  private Integer rulesetID;

  public static final String SERIALIZED_NAME_COUPON_I_D = "couponID";
  @SerializedName(SERIALIZED_NAME_COUPON_I_D)
  private Integer couponID;

  public static final String SERIALIZED_NAME_COUPON_VALUE = "couponValue";
  @SerializedName(SERIALIZED_NAME_COUPON_VALUE)
  private String couponValue;

  public static final String SERIALIZED_NAME_REFERRAL_I_D = "referralID";
  @SerializedName(SERIALIZED_NAME_REFERRAL_I_D)
  private Integer referralID;

  public static final String SERIALIZED_NAME_REFERRAL_VALUE = "referralValue";
  @SerializedName(SERIALIZED_NAME_REFERRAL_VALUE)
  private String referralValue;

  public static final String SERIALIZED_NAME_RULE_INDEX = "ruleIndex";
  @SerializedName(SERIALIZED_NAME_RULE_INDEX)
  private Integer ruleIndex;

  public static final String SERIALIZED_NAME_RULE_NAME = "ruleName";
  @SerializedName(SERIALIZED_NAME_RULE_NAME)
  private String ruleName;

  public static final String SERIALIZED_NAME_CONDITION_INDEX = "conditionIndex";
  @SerializedName(SERIALIZED_NAME_CONDITION_INDEX)
  private Integer conditionIndex;

  public static final String SERIALIZED_NAME_EFFECT_INDEX = "effectIndex";
  @SerializedName(SERIALIZED_NAME_EFFECT_INDEX)
  private Integer effectIndex;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;


  public RuleFailureReason campaignID(Integer campaignID) {
    
    this.campaignID = campaignID;
    return this;
  }

   /**
   * The ID of the campaign that contains the rule that failed
   * @return campaignID
  **/
  @ApiModelProperty(required = true, value = "The ID of the campaign that contains the rule that failed")

  public Integer getCampaignID() {
    return campaignID;
  }


  public void setCampaignID(Integer campaignID) {
    this.campaignID = campaignID;
  }


  public RuleFailureReason campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * The name of the campaign that contains the rule that failed
   * @return campaignName
  **/
  @ApiModelProperty(required = true, value = "The name of the campaign that contains the rule that failed")

  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public RuleFailureReason rulesetID(Integer rulesetID) {
    
    this.rulesetID = rulesetID;
    return this;
  }

   /**
   * The ID of the ruleset that contains the rule that failed
   * @return rulesetID
  **/
  @ApiModelProperty(required = true, value = "The ID of the ruleset that contains the rule that failed")

  public Integer getRulesetID() {
    return rulesetID;
  }


  public void setRulesetID(Integer rulesetID) {
    this.rulesetID = rulesetID;
  }


  public RuleFailureReason couponID(Integer couponID) {
    
    this.couponID = couponID;
    return this;
  }

   /**
   * The ID of the coupon that was being evaluated at the time of the rule failure
   * @return couponID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the coupon that was being evaluated at the time of the rule failure")

  public Integer getCouponID() {
    return couponID;
  }


  public void setCouponID(Integer couponID) {
    this.couponID = couponID;
  }


  public RuleFailureReason couponValue(String couponValue) {
    
    this.couponValue = couponValue;
    return this;
  }

   /**
   * The value of the coupon that was being evaluated at the time of the rule failure
   * @return couponValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the coupon that was being evaluated at the time of the rule failure")

  public String getCouponValue() {
    return couponValue;
  }


  public void setCouponValue(String couponValue) {
    this.couponValue = couponValue;
  }


  public RuleFailureReason referralID(Integer referralID) {
    
    this.referralID = referralID;
    return this;
  }

   /**
   * The ID of the referral that was being evaluated at the time of the rule failure
   * @return referralID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the referral that was being evaluated at the time of the rule failure")

  public Integer getReferralID() {
    return referralID;
  }


  public void setReferralID(Integer referralID) {
    this.referralID = referralID;
  }


  public RuleFailureReason referralValue(String referralValue) {
    
    this.referralValue = referralValue;
    return this;
  }

   /**
   * The value of the referral that was being evaluated at the time of the rule failure
   * @return referralValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the referral that was being evaluated at the time of the rule failure")

  public String getReferralValue() {
    return referralValue;
  }


  public void setReferralValue(String referralValue) {
    this.referralValue = referralValue;
  }


  public RuleFailureReason ruleIndex(Integer ruleIndex) {
    
    this.ruleIndex = ruleIndex;
    return this;
  }

   /**
   * The index of the rule that failed within the ruleset
   * @return ruleIndex
  **/
  @ApiModelProperty(required = true, value = "The index of the rule that failed within the ruleset")

  public Integer getRuleIndex() {
    return ruleIndex;
  }


  public void setRuleIndex(Integer ruleIndex) {
    this.ruleIndex = ruleIndex;
  }


  public RuleFailureReason ruleName(String ruleName) {
    
    this.ruleName = ruleName;
    return this;
  }

   /**
   * The name of the rule that failed within the ruleset
   * @return ruleName
  **/
  @ApiModelProperty(required = true, value = "The name of the rule that failed within the ruleset")

  public String getRuleName() {
    return ruleName;
  }


  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public RuleFailureReason conditionIndex(Integer conditionIndex) {
    
    this.conditionIndex = conditionIndex;
    return this;
  }

   /**
   * The index of the condition that failed
   * @return conditionIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the condition that failed")

  public Integer getConditionIndex() {
    return conditionIndex;
  }


  public void setConditionIndex(Integer conditionIndex) {
    this.conditionIndex = conditionIndex;
  }


  public RuleFailureReason effectIndex(Integer effectIndex) {
    
    this.effectIndex = effectIndex;
    return this;
  }

   /**
   * The index of the effect that failed
   * @return effectIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the effect that failed")

  public Integer getEffectIndex() {
    return effectIndex;
  }


  public void setEffectIndex(Integer effectIndex) {
    this.effectIndex = effectIndex;
  }


  public RuleFailureReason details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * More details about the failure
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "More details about the failure")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleFailureReason ruleFailureReason = (RuleFailureReason) o;
    return Objects.equals(this.campaignID, ruleFailureReason.campaignID) &&
        Objects.equals(this.campaignName, ruleFailureReason.campaignName) &&
        Objects.equals(this.rulesetID, ruleFailureReason.rulesetID) &&
        Objects.equals(this.couponID, ruleFailureReason.couponID) &&
        Objects.equals(this.couponValue, ruleFailureReason.couponValue) &&
        Objects.equals(this.referralID, ruleFailureReason.referralID) &&
        Objects.equals(this.referralValue, ruleFailureReason.referralValue) &&
        Objects.equals(this.ruleIndex, ruleFailureReason.ruleIndex) &&
        Objects.equals(this.ruleName, ruleFailureReason.ruleName) &&
        Objects.equals(this.conditionIndex, ruleFailureReason.conditionIndex) &&
        Objects.equals(this.effectIndex, ruleFailureReason.effectIndex) &&
        Objects.equals(this.details, ruleFailureReason.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignID, campaignName, rulesetID, couponID, couponValue, referralID, referralValue, ruleIndex, ruleName, conditionIndex, effectIndex, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleFailureReason {\n");
    sb.append("    campaignID: ").append(toIndentedString(campaignID)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    rulesetID: ").append(toIndentedString(rulesetID)).append("\n");
    sb.append("    couponID: ").append(toIndentedString(couponID)).append("\n");
    sb.append("    couponValue: ").append(toIndentedString(couponValue)).append("\n");
    sb.append("    referralID: ").append(toIndentedString(referralID)).append("\n");
    sb.append("    referralValue: ").append(toIndentedString(referralValue)).append("\n");
    sb.append("    ruleIndex: ").append(toIndentedString(ruleIndex)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    conditionIndex: ").append(toIndentedString(conditionIndex)).append("\n");
    sb.append("    effectIndex: ").append(toIndentedString(effectIndex)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

