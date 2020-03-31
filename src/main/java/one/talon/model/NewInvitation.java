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

/**
 * Parameters for inviting a new user
 */
@ApiModel(description = "Parameters for inviting a new user")

public class NewInvitation {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ACL = "acl";
  @SerializedName(SERIALIZED_NAME_ACL)
  private String acl;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<Integer> roles = null;


  public NewInvitation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the user being invited.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the user being invited.")

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
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public NewInvitation acl(String acl) {
    
    this.acl = acl;
    return this;
  }

   /**
   * a blob of acl json
   * @return acl
  **/
  @ApiModelProperty(required = true, value = "a blob of acl json")

  public String getAcl() {
    return acl;
  }


  public void setAcl(String acl) {
    this.acl = acl;
  }


  public NewInvitation roles(List<Integer> roles) {
    
    this.roles = roles;
    return this;
  }

  public NewInvitation addRolesItem(Integer rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<Integer>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * An array of roleIDs to assign the new user to
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of roleIDs to assign the new user to")

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
    NewInvitation newInvitation = (NewInvitation) o;
    return Objects.equals(this.name, newInvitation.name) &&
        Objects.equals(this.email, newInvitation.email) &&
        Objects.equals(this.acl, newInvitation.acl) &&
        Objects.equals(this.roles, newInvitation.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, acl, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewInvitation {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
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

