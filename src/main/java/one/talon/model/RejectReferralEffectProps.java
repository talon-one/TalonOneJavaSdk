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

/**
 * The properties specific to the \&quot;rejectReferral\&quot; effect. This gets triggered whenever the referral code was rejected. See rejectionReason for more info on why.
 */
@ApiModel(description = "The properties specific to the \"rejectReferral\" effect. This gets triggered whenever the referral code was rejected. See rejectionReason for more info on why.")

public class RejectReferralEffectProps {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_REJECTION_REASON = "rejectionReason";
  @SerializedName(SERIALIZED_NAME_REJECTION_REASON)
  private String rejectionReason;

  public static final String SERIALIZED_NAME_CONDITION_INDEX = "conditionIndex";
  @SerializedName(SERIALIZED_NAME_CONDITION_INDEX)
  private Integer conditionIndex;

  public static final String SERIALIZED_NAME_EFFECT_INDEX = "effectIndex";
  @SerializedName(SERIALIZED_NAME_EFFECT_INDEX)
  private Integer effectIndex;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_CAMPAIGN_EXCLUSION_REASON = "campaignExclusionReason";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_EXCLUSION_REASON)
  private String campaignExclusionReason;


  public RejectReferralEffectProps value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The referral code that was rejected.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The referral code that was rejected.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public RejectReferralEffectProps rejectionReason(String rejectionReason) {
    
    this.rejectionReason = rejectionReason;
    return this;
  }

   /**
   * The reason why this referral code was rejected.
   * @return rejectionReason
  **/
  @ApiModelProperty(required = true, value = "The reason why this referral code was rejected.")

  public String getRejectionReason() {
    return rejectionReason;
  }


  public void setRejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
  }


  public RejectReferralEffectProps conditionIndex(Integer conditionIndex) {
    
    this.conditionIndex = conditionIndex;
    return this;
  }

   /**
   * The index of the condition that caused the rejection of the referral.
   * @return conditionIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the condition that caused the rejection of the referral.")

  public Integer getConditionIndex() {
    return conditionIndex;
  }


  public void setConditionIndex(Integer conditionIndex) {
    this.conditionIndex = conditionIndex;
  }


  public RejectReferralEffectProps effectIndex(Integer effectIndex) {
    
    this.effectIndex = effectIndex;
    return this;
  }

   /**
   * The index of the effect that caused the rejection of the referral.
   * @return effectIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the effect that caused the rejection of the referral.")

  public Integer getEffectIndex() {
    return effectIndex;
  }


  public void setEffectIndex(Integer effectIndex) {
    this.effectIndex = effectIndex;
  }


  public RejectReferralEffectProps details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * More details about the failure.
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "More details about the failure.")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public RejectReferralEffectProps campaignExclusionReason(String campaignExclusionReason) {
    
    this.campaignExclusionReason = campaignExclusionReason;
    return this;
  }

   /**
   * The reason why the campaign was not applied.
   * @return campaignExclusionReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CampaignGaveLowerDiscount", value = "The reason why the campaign was not applied.")

  public String getCampaignExclusionReason() {
    return campaignExclusionReason;
  }


  public void setCampaignExclusionReason(String campaignExclusionReason) {
    this.campaignExclusionReason = campaignExclusionReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectReferralEffectProps rejectReferralEffectProps = (RejectReferralEffectProps) o;
    return Objects.equals(this.value, rejectReferralEffectProps.value) &&
        Objects.equals(this.rejectionReason, rejectReferralEffectProps.rejectionReason) &&
        Objects.equals(this.conditionIndex, rejectReferralEffectProps.conditionIndex) &&
        Objects.equals(this.effectIndex, rejectReferralEffectProps.effectIndex) &&
        Objects.equals(this.details, rejectReferralEffectProps.details) &&
        Objects.equals(this.campaignExclusionReason, rejectReferralEffectProps.campaignExclusionReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, rejectionReason, conditionIndex, effectIndex, details, campaignExclusionReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectReferralEffectProps {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
    sb.append("    conditionIndex: ").append(toIndentedString(conditionIndex)).append("\n");
    sb.append("    effectIndex: ").append(toIndentedString(effectIndex)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    campaignExclusionReason: ").append(toIndentedString(campaignExclusionReason)).append("\n");
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

