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
import one.talon.model.CustomerProfile;

/**
 * Contains the updated customer profiles entities. This is the response type returned by the V2 PUT customer_profiles endpoint 
 */
@ApiModel(description = "Contains the updated customer profiles entities. This is the response type returned by the V2 PUT customer_profiles endpoint ")

public class CustomerProfileUpdateV2Response {
  public static final String SERIALIZED_NAME_CUSTOMER_PROFILE = "customerProfile";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PROFILE)
  private CustomerProfile customerProfile;


  public CustomerProfileUpdateV2Response customerProfile(CustomerProfile customerProfile) {
    
    this.customerProfile = customerProfile;
    return this;
  }

   /**
   * Get customerProfile
   * @return customerProfile
  **/
  @ApiModelProperty(required = true, value = "")

  public CustomerProfile getCustomerProfile() {
    return customerProfile;
  }


  public void setCustomerProfile(CustomerProfile customerProfile) {
    this.customerProfile = customerProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerProfileUpdateV2Response customerProfileUpdateV2Response = (CustomerProfileUpdateV2Response) o;
    return Objects.equals(this.customerProfile, customerProfileUpdateV2Response.customerProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerProfile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerProfileUpdateV2Response {\n");
    sb.append("    customerProfile: ").append(toIndentedString(customerProfile)).append("\n");
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

