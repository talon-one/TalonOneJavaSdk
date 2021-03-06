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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.IntegrationStateV2;

/**
 * MultipleCustomerProfileIntegrationResponseV2
 */

public class MultipleCustomerProfileIntegrationResponseV2 {
  public static final String SERIALIZED_NAME_INTEGRATION_STATES = "integrationStates";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_STATES)
  private List<IntegrationStateV2> integrationStates = null;


  public MultipleCustomerProfileIntegrationResponseV2 integrationStates(List<IntegrationStateV2> integrationStates) {
    
    this.integrationStates = integrationStates;
    return this;
  }

  public MultipleCustomerProfileIntegrationResponseV2 addIntegrationStatesItem(IntegrationStateV2 integrationStatesItem) {
    if (this.integrationStates == null) {
      this.integrationStates = new ArrayList<IntegrationStateV2>();
    }
    this.integrationStates.add(integrationStatesItem);
    return this;
  }

   /**
   * Get integrationStates
   * @return integrationStates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IntegrationStateV2> getIntegrationStates() {
    return integrationStates;
  }


  public void setIntegrationStates(List<IntegrationStateV2> integrationStates) {
    this.integrationStates = integrationStates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleCustomerProfileIntegrationResponseV2 multipleCustomerProfileIntegrationResponseV2 = (MultipleCustomerProfileIntegrationResponseV2) o;
    return Objects.equals(this.integrationStates, multipleCustomerProfileIntegrationResponseV2.integrationStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationStates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleCustomerProfileIntegrationResponseV2 {\n");
    sb.append("    integrationStates: ").append(toIndentedString(integrationStates)).append("\n");
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

