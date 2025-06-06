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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.LoyaltyLedgerEntry;
import one.talon.model.Tier;

/**
 * Ledger of Balance in Loyalty Program for a Customer.
 */
@ApiModel(description = "Ledger of Balance in Loyalty Program for a Customer.")

public class LoyaltySubLedger {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public static final String SERIALIZED_NAME_TOTAL_ACTIVE_POINTS = "totalActivePoints";
  @SerializedName(SERIALIZED_NAME_TOTAL_ACTIVE_POINTS)
  private BigDecimal totalActivePoints;

  public static final String SERIALIZED_NAME_TOTAL_PENDING_POINTS = "totalPendingPoints";
  @SerializedName(SERIALIZED_NAME_TOTAL_PENDING_POINTS)
  private BigDecimal totalPendingPoints;

  public static final String SERIALIZED_NAME_TOTAL_SPENT_POINTS = "totalSpentPoints";
  @SerializedName(SERIALIZED_NAME_TOTAL_SPENT_POINTS)
  private BigDecimal totalSpentPoints;

  public static final String SERIALIZED_NAME_TOTAL_EXPIRED_POINTS = "totalExpiredPoints";
  @SerializedName(SERIALIZED_NAME_TOTAL_EXPIRED_POINTS)
  private BigDecimal totalExpiredPoints;

  public static final String SERIALIZED_NAME_TOTAL_NEGATIVE_POINTS = "totalNegativePoints";
  @SerializedName(SERIALIZED_NAME_TOTAL_NEGATIVE_POINTS)
  private BigDecimal totalNegativePoints;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<LoyaltyLedgerEntry> transactions = null;

  public static final String SERIALIZED_NAME_EXPIRING_POINTS = "expiringPoints";
  @SerializedName(SERIALIZED_NAME_EXPIRING_POINTS)
  private List<LoyaltyLedgerEntry> expiringPoints = null;

  public static final String SERIALIZED_NAME_ACTIVE_POINTS = "activePoints";
  @SerializedName(SERIALIZED_NAME_ACTIVE_POINTS)
  private List<LoyaltyLedgerEntry> activePoints = null;

  public static final String SERIALIZED_NAME_PENDING_POINTS = "pendingPoints";
  @SerializedName(SERIALIZED_NAME_PENDING_POINTS)
  private List<LoyaltyLedgerEntry> pendingPoints = null;

  public static final String SERIALIZED_NAME_EXPIRED_POINTS = "expiredPoints";
  @SerializedName(SERIALIZED_NAME_EXPIRED_POINTS)
  private List<LoyaltyLedgerEntry> expiredPoints = null;

  public static final String SERIALIZED_NAME_CURRENT_TIER = "currentTier";
  @SerializedName(SERIALIZED_NAME_CURRENT_TIER)
  private Tier currentTier;


  public LoyaltySubLedger total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * **DEPRECATED** Use &#x60;totalActivePoints&#x60; property instead. Total amount of currently active and available points in the customer&#39;s balance. 
   * @return total
  **/
  @ApiModelProperty(required = true, value = "**DEPRECATED** Use `totalActivePoints` property instead. Total amount of currently active and available points in the customer's balance. ")

  public BigDecimal getTotal() {
    return total;
  }


  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public LoyaltySubLedger totalActivePoints(BigDecimal totalActivePoints) {
    
    this.totalActivePoints = totalActivePoints;
    return this;
  }

   /**
   * Total amount of currently active and available points in the customer&#39;s balance.
   * @return totalActivePoints
  **/
  @ApiModelProperty(required = true, value = "Total amount of currently active and available points in the customer's balance.")

  public BigDecimal getTotalActivePoints() {
    return totalActivePoints;
  }


  public void setTotalActivePoints(BigDecimal totalActivePoints) {
    this.totalActivePoints = totalActivePoints;
  }


  public LoyaltySubLedger totalPendingPoints(BigDecimal totalPendingPoints) {
    
    this.totalPendingPoints = totalPendingPoints;
    return this;
  }

   /**
   * Total amount of pending points, which are not active yet but will become active in the future.
   * @return totalPendingPoints
  **/
  @ApiModelProperty(required = true, value = "Total amount of pending points, which are not active yet but will become active in the future.")

  public BigDecimal getTotalPendingPoints() {
    return totalPendingPoints;
  }


  public void setTotalPendingPoints(BigDecimal totalPendingPoints) {
    this.totalPendingPoints = totalPendingPoints;
  }


  public LoyaltySubLedger totalSpentPoints(BigDecimal totalSpentPoints) {
    
    this.totalSpentPoints = totalSpentPoints;
    return this;
  }

   /**
   * Total amount of points already spent by this customer.
   * @return totalSpentPoints
  **/
  @ApiModelProperty(required = true, value = "Total amount of points already spent by this customer.")

  public BigDecimal getTotalSpentPoints() {
    return totalSpentPoints;
  }


  public void setTotalSpentPoints(BigDecimal totalSpentPoints) {
    this.totalSpentPoints = totalSpentPoints;
  }


  public LoyaltySubLedger totalExpiredPoints(BigDecimal totalExpiredPoints) {
    
    this.totalExpiredPoints = totalExpiredPoints;
    return this;
  }

   /**
   * Total amount of points, that expired without ever being spent.
   * @return totalExpiredPoints
  **/
  @ApiModelProperty(required = true, value = "Total amount of points, that expired without ever being spent.")

  public BigDecimal getTotalExpiredPoints() {
    return totalExpiredPoints;
  }


  public void setTotalExpiredPoints(BigDecimal totalExpiredPoints) {
    this.totalExpiredPoints = totalExpiredPoints;
  }


  public LoyaltySubLedger totalNegativePoints(BigDecimal totalNegativePoints) {
    
    this.totalNegativePoints = totalNegativePoints;
    return this;
  }

   /**
   * Total amount of negative points. This implies that &#x60;totalActivePoints&#x60; is &#x60;0&#x60;.
   * @return totalNegativePoints
  **/
  @ApiModelProperty(required = true, value = "Total amount of negative points. This implies that `totalActivePoints` is `0`.")

  public BigDecimal getTotalNegativePoints() {
    return totalNegativePoints;
  }


  public void setTotalNegativePoints(BigDecimal totalNegativePoints) {
    this.totalNegativePoints = totalNegativePoints;
  }


  public LoyaltySubLedger transactions(List<LoyaltyLedgerEntry> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public LoyaltySubLedger addTransactionsItem(LoyaltyLedgerEntry transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<LoyaltyLedgerEntry>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * List of all events that have happened such as additions, subtractions and expiries.
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all events that have happened such as additions, subtractions and expiries.")

  public List<LoyaltyLedgerEntry> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<LoyaltyLedgerEntry> transactions) {
    this.transactions = transactions;
  }


  public LoyaltySubLedger expiringPoints(List<LoyaltyLedgerEntry> expiringPoints) {
    
    this.expiringPoints = expiringPoints;
    return this;
  }

  public LoyaltySubLedger addExpiringPointsItem(LoyaltyLedgerEntry expiringPointsItem) {
    if (this.expiringPoints == null) {
      this.expiringPoints = new ArrayList<LoyaltyLedgerEntry>();
    }
    this.expiringPoints.add(expiringPointsItem);
    return this;
  }

   /**
   * List of all points that will expire.
   * @return expiringPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all points that will expire.")

  public List<LoyaltyLedgerEntry> getExpiringPoints() {
    return expiringPoints;
  }


  public void setExpiringPoints(List<LoyaltyLedgerEntry> expiringPoints) {
    this.expiringPoints = expiringPoints;
  }


  public LoyaltySubLedger activePoints(List<LoyaltyLedgerEntry> activePoints) {
    
    this.activePoints = activePoints;
    return this;
  }

  public LoyaltySubLedger addActivePointsItem(LoyaltyLedgerEntry activePointsItem) {
    if (this.activePoints == null) {
      this.activePoints = new ArrayList<LoyaltyLedgerEntry>();
    }
    this.activePoints.add(activePointsItem);
    return this;
  }

   /**
   * List of all currently active points.
   * @return activePoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all currently active points.")

  public List<LoyaltyLedgerEntry> getActivePoints() {
    return activePoints;
  }


  public void setActivePoints(List<LoyaltyLedgerEntry> activePoints) {
    this.activePoints = activePoints;
  }


  public LoyaltySubLedger pendingPoints(List<LoyaltyLedgerEntry> pendingPoints) {
    
    this.pendingPoints = pendingPoints;
    return this;
  }

  public LoyaltySubLedger addPendingPointsItem(LoyaltyLedgerEntry pendingPointsItem) {
    if (this.pendingPoints == null) {
      this.pendingPoints = new ArrayList<LoyaltyLedgerEntry>();
    }
    this.pendingPoints.add(pendingPointsItem);
    return this;
  }

   /**
   * List of all points pending activation.
   * @return pendingPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all points pending activation.")

  public List<LoyaltyLedgerEntry> getPendingPoints() {
    return pendingPoints;
  }


  public void setPendingPoints(List<LoyaltyLedgerEntry> pendingPoints) {
    this.pendingPoints = pendingPoints;
  }


  public LoyaltySubLedger expiredPoints(List<LoyaltyLedgerEntry> expiredPoints) {
    
    this.expiredPoints = expiredPoints;
    return this;
  }

  public LoyaltySubLedger addExpiredPointsItem(LoyaltyLedgerEntry expiredPointsItem) {
    if (this.expiredPoints == null) {
      this.expiredPoints = new ArrayList<LoyaltyLedgerEntry>();
    }
    this.expiredPoints.add(expiredPointsItem);
    return this;
  }

   /**
   * List of expired points.
   * @return expiredPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of expired points.")

  public List<LoyaltyLedgerEntry> getExpiredPoints() {
    return expiredPoints;
  }


  public void setExpiredPoints(List<LoyaltyLedgerEntry> expiredPoints) {
    this.expiredPoints = expiredPoints;
  }


  public LoyaltySubLedger currentTier(Tier currentTier) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltySubLedger loyaltySubLedger = (LoyaltySubLedger) o;
    return Objects.equals(this.total, loyaltySubLedger.total) &&
        Objects.equals(this.totalActivePoints, loyaltySubLedger.totalActivePoints) &&
        Objects.equals(this.totalPendingPoints, loyaltySubLedger.totalPendingPoints) &&
        Objects.equals(this.totalSpentPoints, loyaltySubLedger.totalSpentPoints) &&
        Objects.equals(this.totalExpiredPoints, loyaltySubLedger.totalExpiredPoints) &&
        Objects.equals(this.totalNegativePoints, loyaltySubLedger.totalNegativePoints) &&
        Objects.equals(this.transactions, loyaltySubLedger.transactions) &&
        Objects.equals(this.expiringPoints, loyaltySubLedger.expiringPoints) &&
        Objects.equals(this.activePoints, loyaltySubLedger.activePoints) &&
        Objects.equals(this.pendingPoints, loyaltySubLedger.pendingPoints) &&
        Objects.equals(this.expiredPoints, loyaltySubLedger.expiredPoints) &&
        Objects.equals(this.currentTier, loyaltySubLedger.currentTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, totalActivePoints, totalPendingPoints, totalSpentPoints, totalExpiredPoints, totalNegativePoints, transactions, expiringPoints, activePoints, pendingPoints, expiredPoints, currentTier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltySubLedger {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalActivePoints: ").append(toIndentedString(totalActivePoints)).append("\n");
    sb.append("    totalPendingPoints: ").append(toIndentedString(totalPendingPoints)).append("\n");
    sb.append("    totalSpentPoints: ").append(toIndentedString(totalSpentPoints)).append("\n");
    sb.append("    totalExpiredPoints: ").append(toIndentedString(totalExpiredPoints)).append("\n");
    sb.append("    totalNegativePoints: ").append(toIndentedString(totalNegativePoints)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    expiringPoints: ").append(toIndentedString(expiringPoints)).append("\n");
    sb.append("    activePoints: ").append(toIndentedString(activePoints)).append("\n");
    sb.append("    pendingPoints: ").append(toIndentedString(pendingPoints)).append("\n");
    sb.append("    expiredPoints: ").append(toIndentedString(expiredPoints)).append("\n");
    sb.append("    currentTier: ").append(toIndentedString(currentTier)).append("\n");
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

