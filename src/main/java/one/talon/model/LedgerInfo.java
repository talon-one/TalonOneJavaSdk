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
import java.math.BigDecimal;
import one.talon.model.Tier;

/**
 * The balance in a Loyalty Program for some Customer.
 */
@ApiModel(description = "The balance in a Loyalty Program for some Customer.")

public class LedgerInfo {
  public static final String SERIALIZED_NAME_CURRENT_BALANCE = "currentBalance";
  @SerializedName(SERIALIZED_NAME_CURRENT_BALANCE)
  private BigDecimal currentBalance;

  public static final String SERIALIZED_NAME_PENDING_BALANCE = "pendingBalance";
  @SerializedName(SERIALIZED_NAME_PENDING_BALANCE)
  private BigDecimal pendingBalance;

  public static final String SERIALIZED_NAME_NEGATIVE_BALANCE = "negativeBalance";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_BALANCE)
  private BigDecimal negativeBalance;

  public static final String SERIALIZED_NAME_EXPIRED_BALANCE = "expiredBalance";
  @SerializedName(SERIALIZED_NAME_EXPIRED_BALANCE)
  private BigDecimal expiredBalance;

  public static final String SERIALIZED_NAME_SPENT_BALANCE = "spentBalance";
  @SerializedName(SERIALIZED_NAME_SPENT_BALANCE)
  private BigDecimal spentBalance;

  public static final String SERIALIZED_NAME_TENTATIVE_CURRENT_BALANCE = "tentativeCurrentBalance";
  @SerializedName(SERIALIZED_NAME_TENTATIVE_CURRENT_BALANCE)
  private BigDecimal tentativeCurrentBalance;

  public static final String SERIALIZED_NAME_TENTATIVE_PENDING_BALANCE = "tentativePendingBalance";
  @SerializedName(SERIALIZED_NAME_TENTATIVE_PENDING_BALANCE)
  private BigDecimal tentativePendingBalance;

  public static final String SERIALIZED_NAME_TENTATIVE_NEGATIVE_BALANCE = "tentativeNegativeBalance";
  @SerializedName(SERIALIZED_NAME_TENTATIVE_NEGATIVE_BALANCE)
  private BigDecimal tentativeNegativeBalance;

  public static final String SERIALIZED_NAME_CURRENT_TIER = "currentTier";
  @SerializedName(SERIALIZED_NAME_CURRENT_TIER)
  private Tier currentTier;

  public static final String SERIALIZED_NAME_POINTS_TO_NEXT_TIER = "pointsToNextTier";
  @SerializedName(SERIALIZED_NAME_POINTS_TO_NEXT_TIER)
  private BigDecimal pointsToNextTier;


  public LedgerInfo currentBalance(BigDecimal currentBalance) {
    
    this.currentBalance = currentBalance;
    return this;
  }

   /**
   * Sum of currently active points.
   * @return currentBalance
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "Sum of currently active points.")

  public BigDecimal getCurrentBalance() {
    return currentBalance;
  }


  public void setCurrentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
  }


  public LedgerInfo pendingBalance(BigDecimal pendingBalance) {
    
    this.pendingBalance = pendingBalance;
    return this;
  }

   /**
   * Sum of pending points.
   * @return pendingBalance
  **/
  @ApiModelProperty(example = "10.0", required = true, value = "Sum of pending points.")

  public BigDecimal getPendingBalance() {
    return pendingBalance;
  }


  public void setPendingBalance(BigDecimal pendingBalance) {
    this.pendingBalance = pendingBalance;
  }


  public LedgerInfo negativeBalance(BigDecimal negativeBalance) {
    
    this.negativeBalance = negativeBalance;
    return this;
  }

   /**
   * Sum of negative points. This implies that &#x60;currentBalance&#x60; is &#x60;0&#x60;.
   * @return negativeBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.0", value = "Sum of negative points. This implies that `currentBalance` is `0`.")

  public BigDecimal getNegativeBalance() {
    return negativeBalance;
  }


  public void setNegativeBalance(BigDecimal negativeBalance) {
    this.negativeBalance = negativeBalance;
  }


  public LedgerInfo expiredBalance(BigDecimal expiredBalance) {
    
    this.expiredBalance = expiredBalance;
    return this;
  }

   /**
   * **DEPRECATED** Value is shown as 0. 
   * @return expiredBalance
  **/
  @ApiModelProperty(example = "0.0", required = true, value = "**DEPRECATED** Value is shown as 0. ")

  public BigDecimal getExpiredBalance() {
    return expiredBalance;
  }


  public void setExpiredBalance(BigDecimal expiredBalance) {
    this.expiredBalance = expiredBalance;
  }


  public LedgerInfo spentBalance(BigDecimal spentBalance) {
    
    this.spentBalance = spentBalance;
    return this;
  }

   /**
   * **DEPRECATED** Value is shown as 0. 
   * @return spentBalance
  **/
  @ApiModelProperty(example = "0.0", required = true, value = "**DEPRECATED** Value is shown as 0. ")

  public BigDecimal getSpentBalance() {
    return spentBalance;
  }


  public void setSpentBalance(BigDecimal spentBalance) {
    this.spentBalance = spentBalance;
  }


  public LedgerInfo tentativeCurrentBalance(BigDecimal tentativeCurrentBalance) {
    
    this.tentativeCurrentBalance = tentativeCurrentBalance;
    return this;
  }

   /**
   * The tentative points balance, reflecting the &#x60;currentBalance&#x60; and all point additions and deductions within the current open customer session. When the session is closed, the effects are applied and the &#x60;currentBalance&#x60; is updated to this value.  **Note:** Tentative balances are specific to the current session and do not take into account other open sessions for the given customer. 
   * @return tentativeCurrentBalance
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "The tentative points balance, reflecting the `currentBalance` and all point additions and deductions within the current open customer session. When the session is closed, the effects are applied and the `currentBalance` is updated to this value.  **Note:** Tentative balances are specific to the current session and do not take into account other open sessions for the given customer. ")

  public BigDecimal getTentativeCurrentBalance() {
    return tentativeCurrentBalance;
  }


  public void setTentativeCurrentBalance(BigDecimal tentativeCurrentBalance) {
    this.tentativeCurrentBalance = tentativeCurrentBalance;
  }


  public LedgerInfo tentativePendingBalance(BigDecimal tentativePendingBalance) {
    
    this.tentativePendingBalance = tentativePendingBalance;
    return this;
  }

   /**
   * The tentative points balance, reflecting the &#x60;pendingBalance&#x60; and all point additions with a future activation date within the current open customer session. When the session is closed, the effects are applied and the &#x60;pendingBalance&#x60; is updated to this value.  **Note:** Tentative balances are specific to the current session and do not take into account other open sessions for the given customer. 
   * @return tentativePendingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20.0", value = "The tentative points balance, reflecting the `pendingBalance` and all point additions with a future activation date within the current open customer session. When the session is closed, the effects are applied and the `pendingBalance` is updated to this value.  **Note:** Tentative balances are specific to the current session and do not take into account other open sessions for the given customer. ")

  public BigDecimal getTentativePendingBalance() {
    return tentativePendingBalance;
  }


  public void setTentativePendingBalance(BigDecimal tentativePendingBalance) {
    this.tentativePendingBalance = tentativePendingBalance;
  }


  public LedgerInfo tentativeNegativeBalance(BigDecimal tentativeNegativeBalance) {
    
    this.tentativeNegativeBalance = tentativeNegativeBalance;
    return this;
  }

   /**
   * The tentative negative balance after all additions and deductions from the current customer session are applied to &#x60;negativeBalance&#x60;. When the session is closed, the tentative effects are applied and &#x60;negativeBalance&#x60; is updated to this value.  **Note:** Tentative balances are specific to the current session and do not take into account other open sessions for the given customer. 
   * @return tentativeNegativeBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.0", value = "The tentative negative balance after all additions and deductions from the current customer session are applied to `negativeBalance`. When the session is closed, the tentative effects are applied and `negativeBalance` is updated to this value.  **Note:** Tentative balances are specific to the current session and do not take into account other open sessions for the given customer. ")

  public BigDecimal getTentativeNegativeBalance() {
    return tentativeNegativeBalance;
  }


  public void setTentativeNegativeBalance(BigDecimal tentativeNegativeBalance) {
    this.tentativeNegativeBalance = tentativeNegativeBalance;
  }


  public LedgerInfo currentTier(Tier currentTier) {
    
    this.currentTier = currentTier;
    return this;
  }

   /**
   * Get currentTier
   * @return currentTier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Tier getCurrentTier() {
    return currentTier;
  }


  public void setCurrentTier(Tier currentTier) {
    this.currentTier = currentTier;
  }


  public LedgerInfo pointsToNextTier(BigDecimal pointsToNextTier) {
    
    this.pointsToNextTier = pointsToNextTier;
    return this;
  }

   /**
   * Points required to move up a tier.
   * @return pointsToNextTier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20.0", value = "Points required to move up a tier.")

  public BigDecimal getPointsToNextTier() {
    return pointsToNextTier;
  }


  public void setPointsToNextTier(BigDecimal pointsToNextTier) {
    this.pointsToNextTier = pointsToNextTier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LedgerInfo ledgerInfo = (LedgerInfo) o;
    return Objects.equals(this.currentBalance, ledgerInfo.currentBalance) &&
        Objects.equals(this.pendingBalance, ledgerInfo.pendingBalance) &&
        Objects.equals(this.negativeBalance, ledgerInfo.negativeBalance) &&
        Objects.equals(this.expiredBalance, ledgerInfo.expiredBalance) &&
        Objects.equals(this.spentBalance, ledgerInfo.spentBalance) &&
        Objects.equals(this.tentativeCurrentBalance, ledgerInfo.tentativeCurrentBalance) &&
        Objects.equals(this.tentativePendingBalance, ledgerInfo.tentativePendingBalance) &&
        Objects.equals(this.tentativeNegativeBalance, ledgerInfo.tentativeNegativeBalance) &&
        Objects.equals(this.currentTier, ledgerInfo.currentTier) &&
        Objects.equals(this.pointsToNextTier, ledgerInfo.pointsToNextTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentBalance, pendingBalance, negativeBalance, expiredBalance, spentBalance, tentativeCurrentBalance, tentativePendingBalance, tentativeNegativeBalance, currentTier, pointsToNextTier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LedgerInfo {\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    pendingBalance: ").append(toIndentedString(pendingBalance)).append("\n");
    sb.append("    negativeBalance: ").append(toIndentedString(negativeBalance)).append("\n");
    sb.append("    expiredBalance: ").append(toIndentedString(expiredBalance)).append("\n");
    sb.append("    spentBalance: ").append(toIndentedString(spentBalance)).append("\n");
    sb.append("    tentativeCurrentBalance: ").append(toIndentedString(tentativeCurrentBalance)).append("\n");
    sb.append("    tentativePendingBalance: ").append(toIndentedString(tentativePendingBalance)).append("\n");
    sb.append("    tentativeNegativeBalance: ").append(toIndentedString(tentativeNegativeBalance)).append("\n");
    sb.append("    currentTier: ").append(toIndentedString(currentTier)).append("\n");
    sb.append("    pointsToNextTier: ").append(toIndentedString(pointsToNextTier)).append("\n");
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

