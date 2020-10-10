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
import java.math.BigDecimal;

/**
 * Points to add or deduct
 */
@ApiModel(description = "Points to add or deduct")

public class LoyaltyPoints {
  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private BigDecimal points;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALIDITY_DURATION = "validityDuration";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DURATION)
  private String validityDuration;

  public static final String SERIALIZED_NAME_PENDING_DURATION = "pendingDuration";
  @SerializedName(SERIALIZED_NAME_PENDING_DURATION)
  private String pendingDuration;

  public static final String SERIALIZED_NAME_SUB_LEDGER_I_D = "subLedgerID";
  @SerializedName(SERIALIZED_NAME_SUB_LEDGER_I_D)
  private String subLedgerID;


  public LoyaltyPoints points(BigDecimal points) {
    
    this.points = points;
    return this;
  }

   /**
   * Amount of loyalty points
   * @return points
  **/
  @ApiModelProperty(required = true, value = "Amount of loyalty points")

  public BigDecimal getPoints() {
    return points;
  }


  public void setPoints(BigDecimal points) {
    this.points = points;
  }


  public LoyaltyPoints name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Allows to specify a name for the addition or deduction
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows to specify a name for the addition or deduction")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LoyaltyPoints validityDuration(String validityDuration) {
    
    this.validityDuration = validityDuration;
    return this;
  }

   /**
   * Indicates the duration after which the added loyalty points should expire. The format is a number followed by one letter indicating the time unit, like &#39;1h&#39; or &#39;40m&#39; (defined by Go time package).
   * @return validityDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the duration after which the added loyalty points should expire. The format is a number followed by one letter indicating the time unit, like '1h' or '40m' (defined by Go time package).")

  public String getValidityDuration() {
    return validityDuration;
  }


  public void setValidityDuration(String validityDuration) {
    this.validityDuration = validityDuration;
  }


  public LoyaltyPoints pendingDuration(String pendingDuration) {
    
    this.pendingDuration = pendingDuration;
    return this;
  }

   /**
   * Indicates the amount of time before the points are considered valid. The format is a number followed by one letter indicating the time unit, like &#39;1h&#39; or &#39;40m&#39; (defined by Go time package).
   * @return pendingDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the amount of time before the points are considered valid. The format is a number followed by one letter indicating the time unit, like '1h' or '40m' (defined by Go time package).")

  public String getPendingDuration() {
    return pendingDuration;
  }


  public void setPendingDuration(String pendingDuration) {
    this.pendingDuration = pendingDuration;
  }


  public LoyaltyPoints subLedgerID(String subLedgerID) {
    
    this.subLedgerID = subLedgerID;
    return this;
  }

   /**
   * This specifies if we are adding loyalty points to the main ledger or a subledger
   * @return subLedgerID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This specifies if we are adding loyalty points to the main ledger or a subledger")

  public String getSubLedgerID() {
    return subLedgerID;
  }


  public void setSubLedgerID(String subLedgerID) {
    this.subLedgerID = subLedgerID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyPoints loyaltyPoints = (LoyaltyPoints) o;
    return Objects.equals(this.points, loyaltyPoints.points) &&
        Objects.equals(this.name, loyaltyPoints.name) &&
        Objects.equals(this.validityDuration, loyaltyPoints.validityDuration) &&
        Objects.equals(this.pendingDuration, loyaltyPoints.pendingDuration) &&
        Objects.equals(this.subLedgerID, loyaltyPoints.subLedgerID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, name, validityDuration, pendingDuration, subLedgerID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyPoints {\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validityDuration: ").append(toIndentedString(validityDuration)).append("\n");
    sb.append("    pendingDuration: ").append(toIndentedString(pendingDuration)).append("\n");
    sb.append("    subLedgerID: ").append(toIndentedString(subLedgerID)).append("\n");
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

