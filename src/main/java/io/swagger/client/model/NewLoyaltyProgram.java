/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Tiers;
import java.io.IOException;

/**
 * NewLoyaltyProgram
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-06T13:17:26.027+01:00")
public class NewLoyaltyProgram {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("pointValidity")
  private Integer pointValidity = null;

  @SerializedName("spendingRate")
  private Integer spendingRate = null;

  @SerializedName("allowFallback")
  private Boolean allowFallback = null;

  @SerializedName("allowMixedPayment")
  private Boolean allowMixedPayment = null;

  @SerializedName("tiers")
  private Tiers tiers = null;

  public NewLoyaltyProgram name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this loyalty program
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this loyalty program")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewLoyaltyProgram description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A longer description of the loyalty program
   * @return description
  **/
  @ApiModelProperty(value = "A longer description of the loyalty program")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NewLoyaltyProgram pointValidity(Integer pointValidity) {
    this.pointValidity = pointValidity;
    return this;
  }

   /**
   * Validity of newly added points in months
   * minimum: 1
   * @return pointValidity
  **/
  @ApiModelProperty(required = true, value = "Validity of newly added points in months")
  public Integer getPointValidity() {
    return pointValidity;
  }

  public void setPointValidity(Integer pointValidity) {
    this.pointValidity = pointValidity;
  }

  public NewLoyaltyProgram spendingRate(Integer spendingRate) {
    this.spendingRate = spendingRate;
    return this;
  }

   /**
   * Exchange rate between loyalty points and currency for spending points
   * @return spendingRate
  **/
  @ApiModelProperty(value = "Exchange rate between loyalty points and currency for spending points")
  public Integer getSpendingRate() {
    return spendingRate;
  }

  public void setSpendingRate(Integer spendingRate) {
    this.spendingRate = spendingRate;
  }

  public NewLoyaltyProgram allowFallback(Boolean allowFallback) {
    this.allowFallback = allowFallback;
    return this;
  }

   /**
   * Allow/disallow use of currency conversion rate for spending points
   * @return allowFallback
  **/
  @ApiModelProperty(value = "Allow/disallow use of currency conversion rate for spending points")
  public Boolean isAllowFallback() {
    return allowFallback;
  }

  public void setAllowFallback(Boolean allowFallback) {
    this.allowFallback = allowFallback;
  }

  public NewLoyaltyProgram allowMixedPayment(Boolean allowMixedPayment) {
    this.allowMixedPayment = allowMixedPayment;
    return this;
  }

   /**
   * Allow/disallow partial payment in currency for products bought with loyalty points
   * @return allowMixedPayment
  **/
  @ApiModelProperty(value = "Allow/disallow partial payment in currency for products bought with loyalty points")
  public Boolean isAllowMixedPayment() {
    return allowMixedPayment;
  }

  public void setAllowMixedPayment(Boolean allowMixedPayment) {
    this.allowMixedPayment = allowMixedPayment;
  }

  public NewLoyaltyProgram tiers(Tiers tiers) {
    this.tiers = tiers;
    return this;
  }

   /**
   * Get tiers
   * @return tiers
  **/
  @ApiModelProperty(value = "")
  public Tiers getTiers() {
    return tiers;
  }

  public void setTiers(Tiers tiers) {
    this.tiers = tiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewLoyaltyProgram newLoyaltyProgram = (NewLoyaltyProgram) o;
    return Objects.equals(this.name, newLoyaltyProgram.name) &&
        Objects.equals(this.description, newLoyaltyProgram.description) &&
        Objects.equals(this.pointValidity, newLoyaltyProgram.pointValidity) &&
        Objects.equals(this.spendingRate, newLoyaltyProgram.spendingRate) &&
        Objects.equals(this.allowFallback, newLoyaltyProgram.allowFallback) &&
        Objects.equals(this.allowMixedPayment, newLoyaltyProgram.allowMixedPayment) &&
        Objects.equals(this.tiers, newLoyaltyProgram.tiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, pointValidity, spendingRate, allowFallback, allowMixedPayment, tiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewLoyaltyProgram {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pointValidity: ").append(toIndentedString(pointValidity)).append("\n");
    sb.append("    spendingRate: ").append(toIndentedString(spendingRate)).append("\n");
    sb.append("    allowFallback: ").append(toIndentedString(allowFallback)).append("\n");
    sb.append("    allowMixedPayment: ").append(toIndentedString(allowMixedPayment)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
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

