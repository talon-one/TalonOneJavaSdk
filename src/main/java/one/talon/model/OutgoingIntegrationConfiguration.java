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

/**
 * OutgoingIntegrationConfiguration
 */

public class OutgoingIntegrationConfiguration {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_TYPE_ID = "typeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private Integer typeId;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private Object policy;


  public OutgoingIntegrationConfiguration accountId(Integer accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account to which this configuration belongs.
   * @return accountId
  **/
  @ApiModelProperty(example = "3886", required = true, value = "The ID of the account to which this configuration belongs.")

  public Integer getAccountId() {
    return accountId;
  }


  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }


  public OutgoingIntegrationConfiguration typeId(Integer typeId) {
    
    this.typeId = typeId;
    return this;
  }

   /**
   * The outgoing integration type ID.
   * @return typeId
  **/
  @ApiModelProperty(example = "12", required = true, value = "The outgoing integration type ID.")

  public Integer getTypeId() {
    return typeId;
  }


  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  public OutgoingIntegrationConfiguration policy(Object policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getPolicy() {
    return policy;
  }


  public void setPolicy(Object policy) {
    this.policy = policy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutgoingIntegrationConfiguration outgoingIntegrationConfiguration = (OutgoingIntegrationConfiguration) o;
    return Objects.equals(this.accountId, outgoingIntegrationConfiguration.accountId) &&
        Objects.equals(this.typeId, outgoingIntegrationConfiguration.typeId) &&
        Objects.equals(this.policy, outgoingIntegrationConfiguration.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, typeId, policy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutgoingIntegrationConfiguration {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
