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
import one.talon.model.ScimGroupMember;

/**
 * Define the schema for groups created using the SCIM provisioning protocol. In Talon.One, a &#x60;Group&#x60; corresponds to a [role](https://docs.talon.one/docs/product/account/account-settings/managing-roles), and &#x60;members&#x60; are the [users](https://docs.talon.one/docs/product/account/account-settings/managing-users) assigned to that role.
 */
@ApiModel(description = "Define the schema for groups created using the SCIM provisioning protocol. In Talon.One, a `Group` corresponds to a [role](https://docs.talon.one/docs/product/account/account-settings/managing-roles), and `members` are the [users](https://docs.talon.one/docs/product/account/account-settings/managing-users) assigned to that role.")

public class ScimGroup {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<ScimGroupMember> members = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public ScimGroup displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of the group (Talon.One role).
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Manager", value = "Display name of the group (Talon.One role).")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ScimGroup members(List<ScimGroupMember> members) {
    
    this.members = members;
    return this;
  }

  public ScimGroup addMembersItem(ScimGroupMember membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<ScimGroupMember>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * List of members to assign to the new Talon.One role.
   * @return members
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of members to assign to the new Talon.One role.")

  public List<ScimGroupMember> getMembers() {
    return members;
  }


  public void setMembers(List<ScimGroupMember> members) {
    this.members = members;
  }


  public ScimGroup id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the group.
   * @return id
  **/
  @ApiModelProperty(example = "359", required = true, value = "ID of the group.")

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
    ScimGroup scimGroup = (ScimGroup) o;
    return Objects.equals(this.displayName, scimGroup.displayName) &&
        Objects.equals(this.members, scimGroup.members) &&
        Objects.equals(this.id, scimGroup.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, members, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimGroup {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

