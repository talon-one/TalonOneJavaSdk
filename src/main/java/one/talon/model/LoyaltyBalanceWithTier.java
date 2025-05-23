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
import one.talon.model.ProjectedTier;
import one.talon.model.Tier;

/**
 * Point balance of a ledger in the Loyalty Program.
 */
@ApiModel(description = "Point balance of a ledger in the Loyalty Program.")

public class LoyaltyBalanceWithTier {
  public static final String SERIALIZED_NAME_ACTIVE_POINTS = "activePoints";
  @SerializedName(SERIALIZED_NAME_ACTIVE_POINTS)
  private BigDecimal activePoints;

  public static final String SERIALIZED_NAME_PENDING_POINTS = "pendingPoints";
  @SerializedName(SERIALIZED_NAME_PENDING_POINTS)
  private BigDecimal pendingPoints;

  public static final String SERIALIZED_NAME_SPENT_POINTS = "spentPoints";
  @SerializedName(SERIALIZED_NAME_SPENT_POINTS)
  private BigDecimal spentPoints;

  public static final String SERIALIZED_NAME_EXPIRED_POINTS = "expiredPoints";
  @SerializedName(SERIALIZED_NAME_EXPIRED_POINTS)
  private BigDecimal expiredPoints;

  public static final String SERIALIZED_NAME_NEGATIVE_POINTS = "negativePoints";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_POINTS)
  private BigDecimal negativePoints;

  public static final String SERIALIZED_NAME_CURRENT_TIER = "currentTier";
  @SerializedName(SERIALIZED_NAME_CURRENT_TIER)
  private Tier currentTier;

  public static final String SERIALIZED_NAME_PROJECTED_TIER = "projectedTier";
  @SerializedName(SERIALIZED_NAME_PROJECTED_TIER)
  private ProjectedTier projectedTier;

  public static final String SERIALIZED_NAME_POINTS_TO_NEXT_TIER = "pointsToNextTier";
  @SerializedName(SERIALIZED_NAME_POINTS_TO_NEXT_TIER)
  private BigDecimal pointsToNextTier;

  public static final String SERIALIZED_NAME_NEXT_TIER_NAME = "nextTierName";
  @SerializedName(SERIALIZED_NAME_NEXT_TIER_NAME)
  private String nextTierName;


  public LoyaltyBalanceWithTier activePoints(BigDecimal activePoints) {
    
    this.activePoints = activePoints;
    return this;
  }

   /**
   * Total amount of points awarded to this customer and available to spend.
   * @return activePoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "286.0", value = "Total amount of points awarded to this customer and available to spend.")

  public BigDecimal getActivePoints() {
    return activePoints;
  }


  public void setActivePoints(BigDecimal activePoints) {
    this.activePoints = activePoints;
  }


  public LoyaltyBalanceWithTier pendingPoints(BigDecimal pendingPoints) {
    
    this.pendingPoints = pendingPoints;
    return this;
  }

   /**
   * Total amount of points awarded to this customer but not available until their start date.
   * @return pendingPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50.0", value = "Total amount of points awarded to this customer but not available until their start date.")

  public BigDecimal getPendingPoints() {
    return pendingPoints;
  }


  public void setPendingPoints(BigDecimal pendingPoints) {
    this.pendingPoints = pendingPoints;
  }


  public LoyaltyBalanceWithTier spentPoints(BigDecimal spentPoints) {
    
    this.spentPoints = spentPoints;
    return this;
  }

   /**
   * Total amount of points already spent by this customer.
   * @return spentPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "150.0", value = "Total amount of points already spent by this customer.")

  public BigDecimal getSpentPoints() {
    return spentPoints;
  }


  public void setSpentPoints(BigDecimal spentPoints) {
    this.spentPoints = spentPoints;
  }


  public LoyaltyBalanceWithTier expiredPoints(BigDecimal expiredPoints) {
    
    this.expiredPoints = expiredPoints;
    return this;
  }

   /**
   * Total amount of points awarded but never redeemed. They cannot be used anymore.
   * @return expiredPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "286.0", value = "Total amount of points awarded but never redeemed. They cannot be used anymore.")

  public BigDecimal getExpiredPoints() {
    return expiredPoints;
  }


  public void setExpiredPoints(BigDecimal expiredPoints) {
    this.expiredPoints = expiredPoints;
  }


  public LoyaltyBalanceWithTier negativePoints(BigDecimal negativePoints) {
    
    this.negativePoints = negativePoints;
    return this;
  }

   /**
   * Total amount of negative points. This implies that &#x60;activePoints&#x60; is &#x60;0&#x60;.
   * @return negativePoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "286.0", value = "Total amount of negative points. This implies that `activePoints` is `0`.")

  public BigDecimal getNegativePoints() {
    return negativePoints;
  }


  public void setNegativePoints(BigDecimal negativePoints) {
    this.negativePoints = negativePoints;
  }


  public LoyaltyBalanceWithTier currentTier(Tier currentTier) {
    
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


  public LoyaltyBalanceWithTier projectedTier(ProjectedTier projectedTier) {
    
    this.projectedTier = projectedTier;
    return this;
  }

   /**
   * Get projectedTier
   * @return projectedTier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectedTier getProjectedTier() {
    return projectedTier;
  }


  public void setProjectedTier(ProjectedTier projectedTier) {
    this.projectedTier = projectedTier;
  }


  public LoyaltyBalanceWithTier pointsToNextTier(BigDecimal pointsToNextTier) {
    
    this.pointsToNextTier = pointsToNextTier;
    return this;
  }

   /**
   * The number of points required to move up a tier.
   * @return pointsToNextTier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20.0", value = "The number of points required to move up a tier.")

  public BigDecimal getPointsToNextTier() {
    return pointsToNextTier;
  }


  public void setPointsToNextTier(BigDecimal pointsToNextTier) {
    this.pointsToNextTier = pointsToNextTier;
  }


  public LoyaltyBalanceWithTier nextTierName(String nextTierName) {
    
    this.nextTierName = nextTierName;
    return this;
  }

   /**
   * The name of the tier consecutive to the current tier.
   * @return nextTierName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "silver", value = "The name of the tier consecutive to the current tier.")

  public String getNextTierName() {
    return nextTierName;
  }


  public void setNextTierName(String nextTierName) {
    this.nextTierName = nextTierName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyBalanceWithTier loyaltyBalanceWithTier = (LoyaltyBalanceWithTier) o;
    return Objects.equals(this.activePoints, loyaltyBalanceWithTier.activePoints) &&
        Objects.equals(this.pendingPoints, loyaltyBalanceWithTier.pendingPoints) &&
        Objects.equals(this.spentPoints, loyaltyBalanceWithTier.spentPoints) &&
        Objects.equals(this.expiredPoints, loyaltyBalanceWithTier.expiredPoints) &&
        Objects.equals(this.negativePoints, loyaltyBalanceWithTier.negativePoints) &&
        Objects.equals(this.currentTier, loyaltyBalanceWithTier.currentTier) &&
        Objects.equals(this.projectedTier, loyaltyBalanceWithTier.projectedTier) &&
        Objects.equals(this.pointsToNextTier, loyaltyBalanceWithTier.pointsToNextTier) &&
        Objects.equals(this.nextTierName, loyaltyBalanceWithTier.nextTierName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activePoints, pendingPoints, spentPoints, expiredPoints, negativePoints, currentTier, projectedTier, pointsToNextTier, nextTierName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyBalanceWithTier {\n");
    sb.append("    activePoints: ").append(toIndentedString(activePoints)).append("\n");
    sb.append("    pendingPoints: ").append(toIndentedString(pendingPoints)).append("\n");
    sb.append("    spentPoints: ").append(toIndentedString(spentPoints)).append("\n");
    sb.append("    expiredPoints: ").append(toIndentedString(expiredPoints)).append("\n");
    sb.append("    negativePoints: ").append(toIndentedString(negativePoints)).append("\n");
    sb.append("    currentTier: ").append(toIndentedString(currentTier)).append("\n");
    sb.append("    projectedTier: ").append(toIndentedString(projectedTier)).append("\n");
    sb.append("    pointsToNextTier: ").append(toIndentedString(pointsToNextTier)).append("\n");
    sb.append("    nextTierName: ").append(toIndentedString(nextTierName)).append("\n");
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

