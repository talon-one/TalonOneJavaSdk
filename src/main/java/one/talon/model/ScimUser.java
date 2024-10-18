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
import one.talon.model.ScimBaseUserName;

/**
 * Schema definition for users that have been provisioned using the SCIM protocol with an identity provider, for example, Microsoft Entra ID.
 */
@ApiModel(description = "Schema definition for users that have been provisioned using the SCIM protocol with an identity provider, for example, Microsoft Entra ID.")

public class ScimUser {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private ScimBaseUserName name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public ScimUser active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Status of the user.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Status of the user.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public ScimUser displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of the user.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe", value = "Display name of the user.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ScimUser userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Unique identifier of the user. This is usually an email address.
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john.doe@example.com", value = "Unique identifier of the user. This is usually an email address.")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  public ScimUser name(ScimBaseUserName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScimBaseUserName getName() {
    return name;
  }


  public void setName(ScimBaseUserName name) {
    this.name = name;
  }


  public ScimUser id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the user.
   * @return id
  **/
  @ApiModelProperty(example = "359", required = true, value = "ID of the user.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimUser scimUser = (ScimUser) o;
    return Objects.equals(this.active, scimUser.active) &&
        Objects.equals(this.displayName, scimUser.displayName) &&
        Objects.equals(this.userName, scimUser.userName) &&
        Objects.equals(this.name, scimUser.name) &&
        Objects.equals(this.id, scimUser.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, displayName, userName, name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimUser {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
