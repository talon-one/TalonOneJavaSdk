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
 * ManagementKey
 */

public class ManagementKey {
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
  private List<Integer> allowedApplicationIds = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Integer createdBy;

  public static final String SERIALIZED_NAME_ACCOUNT_I_D = "accountID";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_I_D)
  private Integer accountID;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;


  public ManagementKey name(String name) {
    
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


  public ManagementKey expiryDate(OffsetDateTime expiryDate) {
    
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


  public ManagementKey endpoints(List<Endpoint> endpoints) {
    
    this.endpoints = endpoints;
    return this;
  }

  public ManagementKey addEndpointsItem(Endpoint endpointsItem) {
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


  public ManagementKey allowedApplicationIds(List<Integer> allowedApplicationIds) {
    
    this.allowedApplicationIds = allowedApplicationIds;
    return this;
  }

  public ManagementKey addAllowedApplicationIdsItem(Integer allowedApplicationIdsItem) {
    if (this.allowedApplicationIds == null) {
      this.allowedApplicationIds = new ArrayList<Integer>();
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

  public List<Integer> getAllowedApplicationIds() {
    return allowedApplicationIds;
  }


  public void setAllowedApplicationIds(List<Integer> allowedApplicationIds) {
    this.allowedApplicationIds = allowedApplicationIds;
  }


  public ManagementKey id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the management key.
   * @return id
  **/
  @ApiModelProperty(example = "34", required = true, value = "ID of the management key.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ManagementKey createdBy(Integer createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of the user who created it.
   * @return createdBy
  **/
  @ApiModelProperty(example = "280", required = true, value = "ID of the user who created it.")

  public Integer getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }


  public ManagementKey accountID(Integer accountID) {
    
    this.accountID = accountID;
    return this;
  }

   /**
   * ID of account the key is used for.
   * @return accountID
  **/
  @ApiModelProperty(example = "13", required = true, value = "ID of account the key is used for.")

  public Integer getAccountID() {
    return accountID;
  }


  public void setAccountID(Integer accountID) {
    this.accountID = accountID;
  }


  public ManagementKey created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The date the management key was created.
   * @return created
  **/
  @ApiModelProperty(example = "2022-03-02T16:46:17.758585Z", required = true, value = "The date the management key was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementKey managementKey = (ManagementKey) o;
    return Objects.equals(this.name, managementKey.name) &&
        Objects.equals(this.expiryDate, managementKey.expiryDate) &&
        Objects.equals(this.endpoints, managementKey.endpoints) &&
        Objects.equals(this.allowedApplicationIds, managementKey.allowedApplicationIds) &&
        Objects.equals(this.id, managementKey.id) &&
        Objects.equals(this.createdBy, managementKey.createdBy) &&
        Objects.equals(this.accountID, managementKey.accountID) &&
        Objects.equals(this.created, managementKey.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, expiryDate, endpoints, allowedApplicationIds, id, createdBy, accountID, created);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementKey {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    allowedApplicationIds: ").append(toIndentedString(allowedApplicationIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

