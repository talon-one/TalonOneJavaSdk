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
 * The properties specific to the \&quot;changeLoyaltyTierLevel\&quot; effect. This is triggered whenever the user&#39;s loyalty tier is upgraded due to a validated rule that contained an \&quot;addLoyaltyPoints\&quot; effect. 
 */
@ApiModel(description = "The properties specific to the \"changeLoyaltyTierLevel\" effect. This is triggered whenever the user's loyalty tier is upgraded due to a validated rule that contained an \"addLoyaltyPoints\" effect. ")

public class ChangeLoyaltyTierLevelEffectProps {
  public static final String SERIALIZED_NAME_RULE_TITLE = "ruleTitle";
  @SerializedName(SERIALIZED_NAME_RULE_TITLE)
  private String ruleTitle;

  public static final String SERIALIZED_NAME_PROGRAM_ID = "programId";
  @SerializedName(SERIALIZED_NAME_PROGRAM_ID)
  private Long programId;

  public static final String SERIALIZED_NAME_SUB_LEDGER_ID = "subLedgerId";
  @SerializedName(SERIALIZED_NAME_SUB_LEDGER_ID)
  private String subLedgerId;

  public static final String SERIALIZED_NAME_PREVIOUS_TIER_NAME = "previousTierName";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_TIER_NAME)
  private String previousTierName;

  public static final String SERIALIZED_NAME_NEW_TIER_NAME = "newTierName";
  @SerializedName(SERIALIZED_NAME_NEW_TIER_NAME)
  private String newTierName;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;


  public ChangeLoyaltyTierLevelEffectProps ruleTitle(String ruleTitle) {
    
    this.ruleTitle = ruleTitle;
    return this;
  }

   /**
   * The title of the rule that triggered the tier upgrade.
   * @return ruleTitle
  **/
  @ApiModelProperty(required = true, value = "The title of the rule that triggered the tier upgrade.")

  public String getRuleTitle() {
    return ruleTitle;
  }


  public void setRuleTitle(String ruleTitle) {
    this.ruleTitle = ruleTitle;
  }


  public ChangeLoyaltyTierLevelEffectProps programId(Long programId) {
    
    this.programId = programId;
    return this;
  }

   /**
   * The ID of the loyalty program where these points were added.
   * @return programId
  **/
  @ApiModelProperty(required = true, value = "The ID of the loyalty program where these points were added.")

  public Long getProgramId() {
    return programId;
  }


  public void setProgramId(Long programId) {
    this.programId = programId;
  }


  public ChangeLoyaltyTierLevelEffectProps subLedgerId(String subLedgerId) {
    
    this.subLedgerId = subLedgerId;
    return this;
  }

   /**
   * The ID of the subledger within the loyalty program where these points were added.
   * @return subLedgerId
  **/
  @ApiModelProperty(required = true, value = "The ID of the subledger within the loyalty program where these points were added.")

  public String getSubLedgerId() {
    return subLedgerId;
  }


  public void setSubLedgerId(String subLedgerId) {
    this.subLedgerId = subLedgerId;
  }


  public ChangeLoyaltyTierLevelEffectProps previousTierName(String previousTierName) {
    
    this.previousTierName = previousTierName;
    return this;
  }

   /**
   * The name of the tier from which the user was upgraded.
   * @return previousTierName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the tier from which the user was upgraded.")

  public String getPreviousTierName() {
    return previousTierName;
  }


  public void setPreviousTierName(String previousTierName) {
    this.previousTierName = previousTierName;
  }


  public ChangeLoyaltyTierLevelEffectProps newTierName(String newTierName) {
    
    this.newTierName = newTierName;
    return this;
  }

   /**
   * The name of the tier to which the user has been upgraded.
   * @return newTierName
  **/
  @ApiModelProperty(required = true, value = "The name of the tier to which the user has been upgraded.")

  public String getNewTierName() {
    return newTierName;
  }


  public void setNewTierName(String newTierName) {
    this.newTierName = newTierName;
  }


  public ChangeLoyaltyTierLevelEffectProps expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * The expiration date of the new tier.
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The expiration date of the new tier.")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeLoyaltyTierLevelEffectProps changeLoyaltyTierLevelEffectProps = (ChangeLoyaltyTierLevelEffectProps) o;
    return Objects.equals(this.ruleTitle, changeLoyaltyTierLevelEffectProps.ruleTitle) &&
        Objects.equals(this.programId, changeLoyaltyTierLevelEffectProps.programId) &&
        Objects.equals(this.subLedgerId, changeLoyaltyTierLevelEffectProps.subLedgerId) &&
        Objects.equals(this.previousTierName, changeLoyaltyTierLevelEffectProps.previousTierName) &&
        Objects.equals(this.newTierName, changeLoyaltyTierLevelEffectProps.newTierName) &&
        Objects.equals(this.expiryDate, changeLoyaltyTierLevelEffectProps.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleTitle, programId, subLedgerId, previousTierName, newTierName, expiryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeLoyaltyTierLevelEffectProps {\n");
    sb.append("    ruleTitle: ").append(toIndentedString(ruleTitle)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    subLedgerId: ").append(toIndentedString(subLedgerId)).append("\n");
    sb.append("    previousTierName: ").append(toIndentedString(previousTierName)).append("\n");
    sb.append("    newTierName: ").append(toIndentedString(newTierName)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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

