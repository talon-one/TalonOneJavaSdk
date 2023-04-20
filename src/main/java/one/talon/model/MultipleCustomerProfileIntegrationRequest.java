/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSessionV2](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
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
import java.util.List;
import one.talon.model.MultipleCustomerProfileIntegrationRequestItem;

/**
 * MultipleCustomerProfileIntegrationRequest
 */

public class MultipleCustomerProfileIntegrationRequest {
  public static final String SERIALIZED_NAME_CUSTOMER_PROFILES = "customerProfiles";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PROFILES)
  private List<MultipleCustomerProfileIntegrationRequestItem> customerProfiles = null;


  public MultipleCustomerProfileIntegrationRequest customerProfiles(List<MultipleCustomerProfileIntegrationRequestItem> customerProfiles) {
    
    this.customerProfiles = customerProfiles;
    return this;
  }

  public MultipleCustomerProfileIntegrationRequest addCustomerProfilesItem(MultipleCustomerProfileIntegrationRequestItem customerProfilesItem) {
    if (this.customerProfiles == null) {
      this.customerProfiles = new ArrayList<MultipleCustomerProfileIntegrationRequestItem>();
    }
    this.customerProfiles.add(customerProfilesItem);
    return this;
  }

   /**
   * Get customerProfiles
   * @return customerProfiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MultipleCustomerProfileIntegrationRequestItem> getCustomerProfiles() {
    return customerProfiles;
  }


  public void setCustomerProfiles(List<MultipleCustomerProfileIntegrationRequestItem> customerProfiles) {
    this.customerProfiles = customerProfiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleCustomerProfileIntegrationRequest multipleCustomerProfileIntegrationRequest = (MultipleCustomerProfileIntegrationRequest) o;
    return Objects.equals(this.customerProfiles, multipleCustomerProfileIntegrationRequest.customerProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerProfiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleCustomerProfileIntegrationRequest {\n");
    sb.append("    customerProfiles: ").append(toIndentedString(customerProfiles)).append("\n");
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

