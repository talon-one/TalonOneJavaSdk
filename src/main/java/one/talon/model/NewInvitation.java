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
 * Parameters for inviting a new user.
 */
@ApiModel(description = "Parameters for inviting a new user.")

public class NewInvitation {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_IS_ADMIN = "isAdmin";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN)
  private Boolean isAdmin;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<Long> roles = null;

  public static final String SERIALIZED_NAME_ACL = "acl";
  @SerializedName(SERIALIZED_NAME_ACL)
  private String acl;


  public NewInvitation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the user.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe", value = "Name of the user.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewInvitation email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email address of the user.
   * @return email
  **/
  @ApiModelProperty(example = "john.doe@example.com", required = true, value = "Email address of the user.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public NewInvitation isAdmin(Boolean isAdmin) {
    
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Indicates whether the user is an &#x60;admin&#x60;.
   * @return isAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates whether the user is an `admin`.")

  public Boolean getIsAdmin() {
    return isAdmin;
  }


  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }


  public NewInvitation roles(List<Long> roles) {
    
    this.roles = roles;
    return this;
  }

  public NewInvitation addRolesItem(Long rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<Long>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * A list of the IDs of the roles assigned to the user.
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the IDs of the roles assigned to the user.")

  public List<Long> getRoles() {
    return roles;
  }


  public void setRoles(List<Long> roles) {
    this.roles = roles;
  }


  public NewInvitation acl(String acl) {
    
    this.acl = acl;
    return this;
  }

   /**
   * Indicates the access level of the user.
   * @return acl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the access level of the user.")

  public String getAcl() {
    return acl;
  }


  public void setAcl(String acl) {
    this.acl = acl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewInvitation newInvitation = (NewInvitation) o;
    return Objects.equals(this.name, newInvitation.name) &&
        Objects.equals(this.email, newInvitation.email) &&
        Objects.equals(this.isAdmin, newInvitation.isAdmin) &&
        Objects.equals(this.roles, newInvitation.roles) &&
        Objects.equals(this.acl, newInvitation.acl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, isAdmin, roles, acl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewInvitation {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
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

