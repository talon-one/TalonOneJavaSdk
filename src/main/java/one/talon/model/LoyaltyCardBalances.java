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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import one.talon.model.LoyaltyBalance;
import one.talon.model.LoyaltyCardProfileRegistration;

/**
 * 
 */
@ApiModel(description = "")

public class LoyaltyCardBalances {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private LoyaltyBalance balance;

  public static final String SERIALIZED_NAME_SUBLEDGER_BALANCES = "subledgerBalances";
  @SerializedName(SERIALIZED_NAME_SUBLEDGER_BALANCES)
  private Map<String, LoyaltyBalance> subledgerBalances = null;

  public static final String SERIALIZED_NAME_PROFILES = "profiles";
  @SerializedName(SERIALIZED_NAME_PROFILES)
  private List<LoyaltyCardProfileRegistration> profiles = null;


  public LoyaltyCardBalances balance(LoyaltyBalance balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoyaltyBalance getBalance() {
    return balance;
  }


  public void setBalance(LoyaltyBalance balance) {
    this.balance = balance;
  }


  public LoyaltyCardBalances subledgerBalances(Map<String, LoyaltyBalance> subledgerBalances) {
    
    this.subledgerBalances = subledgerBalances;
    return this;
  }

  public LoyaltyCardBalances putSubledgerBalancesItem(String key, LoyaltyBalance subledgerBalancesItem) {
    if (this.subledgerBalances == null) {
      this.subledgerBalances = new HashMap<String, LoyaltyBalance>();
    }
    this.subledgerBalances.put(key, subledgerBalancesItem);
    return this;
  }

   /**
   * Map of the loyalty balances of the subledgers of a ledger.
   * @return subledgerBalances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"mysubledger\":{\"activePoints\":286,\"pendingPoints\":50,\"spentPoints\":150,\"expiredPoints\":25}}", value = "Map of the loyalty balances of the subledgers of a ledger.")

  public Map<String, LoyaltyBalance> getSubledgerBalances() {
    return subledgerBalances;
  }


  public void setSubledgerBalances(Map<String, LoyaltyBalance> subledgerBalances) {
    this.subledgerBalances = subledgerBalances;
  }


  public LoyaltyCardBalances profiles(List<LoyaltyCardProfileRegistration> profiles) {
    
    this.profiles = profiles;
    return this;
  }

  public LoyaltyCardBalances addProfilesItem(LoyaltyCardProfileRegistration profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<LoyaltyCardProfileRegistration>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

   /**
   * Customer profiles linked to the loyalty card.
   * @return profiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Customer profiles linked to the loyalty card.")

  public List<LoyaltyCardProfileRegistration> getProfiles() {
    return profiles;
  }


  public void setProfiles(List<LoyaltyCardProfileRegistration> profiles) {
    this.profiles = profiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyCardBalances loyaltyCardBalances = (LoyaltyCardBalances) o;
    return Objects.equals(this.balance, loyaltyCardBalances.balance) &&
        Objects.equals(this.subledgerBalances, loyaltyCardBalances.subledgerBalances) &&
        Objects.equals(this.profiles, loyaltyCardBalances.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, subledgerBalances, profiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardBalances {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    subledgerBalances: ").append(toIndentedString(subledgerBalances)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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

