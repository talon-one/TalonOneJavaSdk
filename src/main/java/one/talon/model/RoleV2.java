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
import one.talon.model.RoleV2Permissions;

/**
 * RoleV2
 */

public class RoleV2 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_ADMIN = "isAdmin";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN)
  private Boolean isAdmin;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private RoleV2Permissions permissions;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<Integer> members = null;


  public RoleV2 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the role.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Campaign manager", value = "Name of the role.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RoleV2 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the role.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Manages the campaigns", value = "Description of the role.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RoleV2 isAdmin(Boolean isAdmin) {
    
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Indicates whether the role grants admin permissions.
   * @return isAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the role grants admin permissions.")

  public Boolean getIsAdmin() {
    return isAdmin;
  }


  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }


  public RoleV2 permissions(RoleV2Permissions permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RoleV2Permissions getPermissions() {
    return permissions;
  }


  public void setPermissions(RoleV2Permissions permissions) {
    this.permissions = permissions;
  }


  public RoleV2 members(List<Integer> members) {
    
    this.members = members;
    return this;
  }

  public RoleV2 addMembersItem(Integer membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<Integer>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * An array of user identifiers.
   * @return members
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[48, 562, 475, 18]", value = "An array of user identifiers.")

  public List<Integer> getMembers() {
    return members;
  }


  public void setMembers(List<Integer> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleV2 roleV2 = (RoleV2) o;
    return Objects.equals(this.name, roleV2.name) &&
        Objects.equals(this.description, roleV2.description) &&
        Objects.equals(this.isAdmin, roleV2.isAdmin) &&
        Objects.equals(this.permissions, roleV2.permissions) &&
        Objects.equals(this.members, roleV2.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, isAdmin, permissions, members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleV2 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

