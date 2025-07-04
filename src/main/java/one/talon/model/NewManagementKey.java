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
 * NewManagementKey
 */

public class NewManagementKey {
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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Long createdBy;

  public static final String SERIALIZED_NAME_ACCOUNT_I_D = "accountID";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_I_D)
  private Long accountID;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;


  public NewManagementKey name(String name) {
    
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


  public NewManagementKey expiryDate(OffsetDateTime expiryDate) {
    
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


  public NewManagementKey endpoints(List<Endpoint> endpoints) {
    
    this.endpoints = endpoints;
    return this;
  }

  public NewManagementKey addEndpointsItem(Endpoint endpointsItem) {
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


  public NewManagementKey allowedApplicationIds(List<Long> allowedApplicationIds) {
    
    this.allowedApplicationIds = allowedApplicationIds;
    return this;
  }

  public NewManagementKey addAllowedApplicationIdsItem(Long allowedApplicationIdsItem) {
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


  public NewManagementKey id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the management key.
   * @return id
  **/
  @ApiModelProperty(example = "34", required = true, value = "ID of the management key.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public NewManagementKey createdBy(Long createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of the user who created it.
   * @return createdBy
  **/
  @ApiModelProperty(example = "280", required = true, value = "ID of the user who created it.")

  public Long getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }


  public NewManagementKey accountID(Long accountID) {
    
    this.accountID = accountID;
    return this;
  }

   /**
   * ID of account the key is used for.
   * @return accountID
  **/
  @ApiModelProperty(example = "13", required = true, value = "ID of account the key is used for.")

  public Long getAccountID() {
    return accountID;
  }


  public void setAccountID(Long accountID) {
    this.accountID = accountID;
  }


  public NewManagementKey created(OffsetDateTime created) {
    
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


  public NewManagementKey disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * The management key is disabled (this property is set to &#x60;true&#x60;) when the user who created the key is disabled or deleted.
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "The management key is disabled (this property is set to `true`) when the user who created the key is disabled or deleted.")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public NewManagementKey key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The management key.
   * @return key
  **/
  @ApiModelProperty(example = "f45f90d21dcd9bac965c45e547e9754a3196891d09948e35adbcbedc4e9e4b01", required = true, value = "The management key.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewManagementKey newManagementKey = (NewManagementKey) o;
    return Objects.equals(this.name, newManagementKey.name) &&
        Objects.equals(this.expiryDate, newManagementKey.expiryDate) &&
        Objects.equals(this.endpoints, newManagementKey.endpoints) &&
        Objects.equals(this.allowedApplicationIds, newManagementKey.allowedApplicationIds) &&
        Objects.equals(this.id, newManagementKey.id) &&
        Objects.equals(this.createdBy, newManagementKey.createdBy) &&
        Objects.equals(this.accountID, newManagementKey.accountID) &&
        Objects.equals(this.created, newManagementKey.created) &&
        Objects.equals(this.disabled, newManagementKey.disabled) &&
        Objects.equals(this.key, newManagementKey.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, expiryDate, endpoints, allowedApplicationIds, id, createdBy, accountID, created, disabled, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewManagementKey {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    allowedApplicationIds: ").append(toIndentedString(allowedApplicationIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

