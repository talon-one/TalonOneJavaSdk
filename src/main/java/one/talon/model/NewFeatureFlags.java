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
 * NewFeatureFlags
 */

public class NewFeatureFlags {
  public static final String SERIALIZED_NAME_LOYALTY = "loyalty";
  @SerializedName(SERIALIZED_NAME_LOYALTY)
  private Boolean loyalty;

  public static final String SERIALIZED_NAME_COUPONS_WITHOUT_COUNT = "coupons_without_count";
  @SerializedName(SERIALIZED_NAME_COUPONS_WITHOUT_COUNT)
  private Boolean couponsWithoutCount;

  public static final String SERIALIZED_NAME_BETA_EFFECTS = "betaEffects";
  @SerializedName(SERIALIZED_NAME_BETA_EFFECTS)
  private Boolean betaEffects;


  public NewFeatureFlags loyalty(Boolean loyalty) {
    
    this.loyalty = loyalty;
    return this;
  }

   /**
   * Whether the account has access to the loyalty features or not
   * @return loyalty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the account has access to the loyalty features or not")

  public Boolean getLoyalty() {
    return loyalty;
  }


  public void setLoyalty(Boolean loyalty) {
    this.loyalty = loyalty;
  }


  public NewFeatureFlags couponsWithoutCount(Boolean couponsWithoutCount) {
    
    this.couponsWithoutCount = couponsWithoutCount;
    return this;
  }

   /**
   * Whether the account queries coupons with or without total result size
   * @return couponsWithoutCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the account queries coupons with or without total result size")

  public Boolean getCouponsWithoutCount() {
    return couponsWithoutCount;
  }


  public void setCouponsWithoutCount(Boolean couponsWithoutCount) {
    this.couponsWithoutCount = couponsWithoutCount;
  }


  public NewFeatureFlags betaEffects(Boolean betaEffects) {
    
    this.betaEffects = betaEffects;
    return this;
  }

   /**
   * Whether the account can test beta effects or not
   * @return betaEffects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the account can test beta effects or not")

  public Boolean getBetaEffects() {
    return betaEffects;
  }


  public void setBetaEffects(Boolean betaEffects) {
    this.betaEffects = betaEffects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewFeatureFlags newFeatureFlags = (NewFeatureFlags) o;
    return Objects.equals(this.loyalty, newFeatureFlags.loyalty) &&
        Objects.equals(this.couponsWithoutCount, newFeatureFlags.couponsWithoutCount) &&
        Objects.equals(this.betaEffects, newFeatureFlags.betaEffects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyalty, couponsWithoutCount, betaEffects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewFeatureFlags {\n");
    sb.append("    loyalty: ").append(toIndentedString(loyalty)).append("\n");
    sb.append("    couponsWithoutCount: ").append(toIndentedString(couponsWithoutCount)).append("\n");
    sb.append("    betaEffects: ").append(toIndentedString(betaEffects)).append("\n");
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

