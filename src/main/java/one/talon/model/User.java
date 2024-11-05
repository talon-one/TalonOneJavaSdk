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
import org.threeten.bp.OffsetDateTime;

/**
 * User
 */

public class User {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * State of the user.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    INVITED("invited"),
    
    ACTIVE("active"),
    
    DEACTIVATED("deactivated");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_INVITE_TOKEN = "inviteToken";
  @SerializedName(SERIALIZED_NAME_INVITE_TOKEN)
  private String inviteToken;

  public static final String SERIALIZED_NAME_IS_ADMIN = "isAdmin";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN)
  private Boolean isAdmin;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private Object policy;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<Integer> roles = null;

  public static final String SERIALIZED_NAME_AUTH_METHOD = "authMethod";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD)
  private String authMethod;

  public static final String SERIALIZED_NAME_APPLICATION_NOTIFICATION_SUBSCRIPTIONS = "applicationNotificationSubscriptions";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NOTIFICATION_SUBSCRIPTIONS)
  private Object applicationNotificationSubscriptions;

  public static final String SERIALIZED_NAME_LAST_SIGNED_IN = "lastSignedIn";
  @SerializedName(SERIALIZED_NAME_LAST_SIGNED_IN)
  private OffsetDateTime lastSignedIn;

  public static final String SERIALIZED_NAME_LAST_ACCESSED = "lastAccessed";
  @SerializedName(SERIALIZED_NAME_LAST_ACCESSED)
  private OffsetDateTime lastAccessed;

  public static final String SERIALIZED_NAME_LATEST_FEED_TIMESTAMP = "latestFeedTimestamp";
  @SerializedName(SERIALIZED_NAME_LATEST_FEED_TIMESTAMP)
  private OffsetDateTime latestFeedTimestamp;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private Object additionalAttributes;


  public User id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Internal ID of this entity.
   * @return id
  **/
  @ApiModelProperty(example = "6", required = true, value = "Internal ID of this entity.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public User created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The time this entity was created.
   * @return created
  **/
  @ApiModelProperty(example = "2020-06-10T09:05:27.993483Z", required = true, value = "The time this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public User modified(OffsetDateTime modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * The time this entity was last modified.
   * @return modified
  **/
  @ApiModelProperty(example = "2021-09-12T10:12:42Z", required = true, value = "The time this entity was last modified.")

  public OffsetDateTime getModified() {
    return modified;
  }


  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  public User email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address associated with the user profile.
   * @return email
  **/
  @ApiModelProperty(example = "john.doe@example.com", required = true, value = "The email address associated with the user profile.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public User accountId(Integer accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that owns this entity.
   * @return accountId
  **/
  @ApiModelProperty(example = "3886", required = true, value = "The ID of the account that owns this entity.")

  public Integer getAccountId() {
    return accountId;
  }


  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }


  public User name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the user.
   * @return name
  **/
  @ApiModelProperty(example = "John Doe", required = true, value = "Name of the user.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public User state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * State of the user.
   * @return state
  **/
  @ApiModelProperty(example = "invited", required = true, value = "State of the user.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public User inviteToken(String inviteToken) {
    
    this.inviteToken = inviteToken;
    return this;
  }

   /**
   * Invitation token of the user.  **Note**: If the user has already accepted their invitation, this is &#x60;null&#x60;. 
   * @return inviteToken
  **/
  @ApiModelProperty(example = "Gy9b8w1irmQtEPo5RmbMmSPheL5h4", required = true, value = "Invitation token of the user.  **Note**: If the user has already accepted their invitation, this is `null`. ")

  public String getInviteToken() {
    return inviteToken;
  }


  public void setInviteToken(String inviteToken) {
    this.inviteToken = inviteToken;
  }


  public User isAdmin(Boolean isAdmin) {
    
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


  public User policy(Object policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Access level of the user.
   * @return policy
  **/
  @ApiModelProperty(example = "{\"Role\":127}", required = true, value = "Access level of the user.")

  public Object getPolicy() {
    return policy;
  }


  public void setPolicy(Object policy) {
    this.policy = policy;
  }


  public User roles(List<Integer> roles) {
    
    this.roles = roles;
    return this;
  }

  public User addRolesItem(Integer rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<Integer>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * A list of the IDs of the roles assigned to the user.
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[71]", value = "A list of the IDs of the roles assigned to the user.")

  public List<Integer> getRoles() {
    return roles;
  }


  public void setRoles(List<Integer> roles) {
    this.roles = roles;
  }


  public User authMethod(String authMethod) {
    
    this.authMethod = authMethod;
    return this;
  }

   /**
   * Authentication method for this user.
   * @return authMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "basic_auth", value = "Authentication method for this user.")

  public String getAuthMethod() {
    return authMethod;
  }


  public void setAuthMethod(String authMethod) {
    this.authMethod = authMethod;
  }


  public User applicationNotificationSubscriptions(Object applicationNotificationSubscriptions) {
    
    this.applicationNotificationSubscriptions = applicationNotificationSubscriptions;
    return this;
  }

   /**
   * Application notifications that the user is subscribed to.
   * @return applicationNotificationSubscriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Application notifications that the user is subscribed to.")

  public Object getApplicationNotificationSubscriptions() {
    return applicationNotificationSubscriptions;
  }


  public void setApplicationNotificationSubscriptions(Object applicationNotificationSubscriptions) {
    this.applicationNotificationSubscriptions = applicationNotificationSubscriptions;
  }


  public User lastSignedIn(OffsetDateTime lastSignedIn) {
    
    this.lastSignedIn = lastSignedIn;
    return this;
  }

   /**
   * Timestamp when the user last signed in to Talon.One.
   * @return lastSignedIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-09-12T10:12:42Z", value = "Timestamp when the user last signed in to Talon.One.")

  public OffsetDateTime getLastSignedIn() {
    return lastSignedIn;
  }


  public void setLastSignedIn(OffsetDateTime lastSignedIn) {
    this.lastSignedIn = lastSignedIn;
  }


  public User lastAccessed(OffsetDateTime lastAccessed) {
    
    this.lastAccessed = lastAccessed;
    return this;
  }

   /**
   * Timestamp of the user&#39;s last activity after signing in to Talon.One.
   * @return lastAccessed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-09-12T10:14:42Z", value = "Timestamp of the user's last activity after signing in to Talon.One.")

  public OffsetDateTime getLastAccessed() {
    return lastAccessed;
  }


  public void setLastAccessed(OffsetDateTime lastAccessed) {
    this.lastAccessed = lastAccessed;
  }


  public User latestFeedTimestamp(OffsetDateTime latestFeedTimestamp) {
    
    this.latestFeedTimestamp = latestFeedTimestamp;
    return this;
  }

   /**
   * Timestamp when the user was notified for feed.
   * @return latestFeedTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-01T00:00Z", value = "Timestamp when the user was notified for feed.")

  public OffsetDateTime getLatestFeedTimestamp() {
    return latestFeedTimestamp;
  }


  public void setLatestFeedTimestamp(OffsetDateTime latestFeedTimestamp) {
    this.latestFeedTimestamp = latestFeedTimestamp;
  }


  public User additionalAttributes(Object additionalAttributes) {
    
    this.additionalAttributes = additionalAttributes;
    return this;
  }

   /**
   * Additional user attributes, created and used by external identity providers.
   * @return additionalAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional user attributes, created and used by external identity providers.")

  public Object getAdditionalAttributes() {
    return additionalAttributes;
  }


  public void setAdditionalAttributes(Object additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.created, user.created) &&
        Objects.equals(this.modified, user.modified) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.accountId, user.accountId) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.state, user.state) &&
        Objects.equals(this.inviteToken, user.inviteToken) &&
        Objects.equals(this.isAdmin, user.isAdmin) &&
        Objects.equals(this.policy, user.policy) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.authMethod, user.authMethod) &&
        Objects.equals(this.applicationNotificationSubscriptions, user.applicationNotificationSubscriptions) &&
        Objects.equals(this.lastSignedIn, user.lastSignedIn) &&
        Objects.equals(this.lastAccessed, user.lastAccessed) &&
        Objects.equals(this.latestFeedTimestamp, user.latestFeedTimestamp) &&
        Objects.equals(this.additionalAttributes, user.additionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, modified, email, accountId, name, state, inviteToken, isAdmin, policy, roles, authMethod, applicationNotificationSubscriptions, lastSignedIn, lastAccessed, latestFeedTimestamp, additionalAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    inviteToken: ").append(toIndentedString(inviteToken)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
    sb.append("    applicationNotificationSubscriptions: ").append(toIndentedString(applicationNotificationSubscriptions)).append("\n");
    sb.append("    lastSignedIn: ").append(toIndentedString(lastSignedIn)).append("\n");
    sb.append("    lastAccessed: ").append(toIndentedString(lastAccessed)).append("\n");
    sb.append("    latestFeedTimestamp: ").append(toIndentedString(latestFeedTimestamp)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
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

