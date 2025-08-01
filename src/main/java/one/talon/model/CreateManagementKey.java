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
import java.util.List;
import one.talon.model.Endpoint;
import org.threeten.bp.OffsetDateTime;

/**
 * CreateManagementKey
 */

public class CreateManagementKey {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";
  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private List<Endpoint> endpoints = new ArrayList<Endpoint>();

  public static final String SERIALIZED_NAME_ALLOWED_APPLICATION_IDS = "allowedApplicationIds";
  @SerializedName(SERIALIZED_NAME_ALLOWED_APPLICATION_IDS)
  private List<Long> allowedApplicationIds = null;


  public CreateManagementKey name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name for management key.
   * @return name
  **/
  @ApiModelProperty(example = "My generated key", required = true, value = "Name for management key.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateManagementKey expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * The date the management key expires.
   * @return expiryDate
  **/
  @ApiModelProperty(example = "2023-08-24T14:00Z", required = true, value = "The date the management key expires.")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public CreateManagementKey endpoints(List<Endpoint> endpoints) {
    
    this.endpoints = endpoints;
    return this;
  }

  public CreateManagementKey addEndpointsItem(Endpoint endpointsItem) {
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * The list of endpoints that can be accessed with the key
   * @return endpoints
  **/
  @ApiModelProperty(required = true, value = "The list of endpoints that can be accessed with the key")

  public List<Endpoint> getEndpoints() {
    return endpoints;
  }


  public void setEndpoints(List<Endpoint> endpoints) {
    this.endpoints = endpoints;
  }


  public CreateManagementKey allowedApplicationIds(List<Long> allowedApplicationIds) {
    
    this.allowedApplicationIds = allowedApplicationIds;
    return this;
  }

  public CreateManagementKey addAllowedApplicationIdsItem(Long allowedApplicationIdsItem) {
    if (this.allowedApplicationIds == null) {
      this.allowedApplicationIds = new ArrayList<Long>();
    }
    this.allowedApplicationIds.add(allowedApplicationIdsItem);
    return this;
  }

   /**
   * A list of Application IDs that you can access with the management key. An empty or missing list means the management key can be used for all Applications in the account. 
   * @return allowedApplicationIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1, 2, 3]", value = "A list of Application IDs that you can access with the management key. An empty or missing list means the management key can be used for all Applications in the account. ")

  public List<Long> getAllowedApplicationIds() {
    return allowedApplicationIds;
  }


  public void setAllowedApplicationIds(List<Long> allowedApplicationIds) {
    this.allowedApplicationIds = allowedApplicationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateManagementKey createManagementKey = (CreateManagementKey) o;
    return Objects.equals(this.name, createManagementKey.name) &&
        Objects.equals(this.expiryDate, createManagementKey.expiryDate) &&
        Objects.equals(this.endpoints, createManagementKey.endpoints) &&
        Objects.equals(this.allowedApplicationIds, createManagementKey.allowedApplicationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, expiryDate, endpoints, allowedApplicationIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateManagementKey {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    allowedApplicationIds: ").append(toIndentedString(allowedApplicationIds)).append("\n");
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

