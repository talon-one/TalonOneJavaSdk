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

/**
 * RoleAssign
 */

public class RoleAssign {
  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<Integer> users = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<Integer> roles = new ArrayList<Integer>();


  public RoleAssign users(List<Integer> users) {
    
    this.users = users;
    return this;
  }

  public RoleAssign addUsersItem(Integer usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * An array of user IDs.
   * @return users
  **/
  @ApiModelProperty(example = "[48, 562, 475, 18]", required = true, value = "An array of user IDs.")

  public List<Integer> getUsers() {
    return users;
  }


  public void setUsers(List<Integer> users) {
    this.users = users;
  }


  public RoleAssign roles(List<Integer> roles) {
    
    this.roles = roles;
    return this;
  }

  public RoleAssign addRolesItem(Integer rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * An array of role IDs.
   * @return roles
  **/
  @ApiModelProperty(example = "[128, 147]", required = true, value = "An array of role IDs.")

  public List<Integer> getRoles() {
    return roles;
  }


  public void setRoles(List<Integer> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleAssign roleAssign = (RoleAssign) o;
    return Objects.equals(this.users, roleAssign.users) &&
        Objects.equals(this.roles, roleAssign.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAssign {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

