/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSessionV2](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
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
import one.talon.model.LoyaltyTier;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class LoyaltyProgram {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS = "subscribedApplications";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS)
  private List<Integer> subscribedApplications = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_DEFAULT_VALIDITY = "defaultValidity";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALIDITY)
  private String defaultValidity;

  public static final String SERIALIZED_NAME_DEFAULT_PENDING = "defaultPending";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PENDING)
  private String defaultPending;

  public static final String SERIALIZED_NAME_ALLOW_SUBLEDGER = "allowSubledger";
  @SerializedName(SERIALIZED_NAME_ALLOW_SUBLEDGER)
  private Boolean allowSubledger;

  public static final String SERIALIZED_NAME_USERS_PER_CARD_LIMIT = "usersPerCardLimit";
  @SerializedName(SERIALIZED_NAME_USERS_PER_CARD_LIMIT)
  private Integer usersPerCardLimit;

  public static final String SERIALIZED_NAME_SANDBOX = "sandbox";
  @SerializedName(SERIALIZED_NAME_SANDBOX)
  private Boolean sandbox;

  public static final String SERIALIZED_NAME_ACCOUNT_I_D = "accountID";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_I_D)
  private Integer accountID;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TIERS = "tiers";
  @SerializedName(SERIALIZED_NAME_TIERS)
  private List<LoyaltyTier> tiers = null;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_CARD_BASED = "cardBased";
  @SerializedName(SERIALIZED_NAME_CARD_BASED)
  private Boolean cardBased = false;


  public LoyaltyProgram id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of loyalty program. Internal ID of this entity.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of loyalty program. Internal ID of this entity.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public LoyaltyProgram created(OffsetDateTime created) {
    
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


  public LoyaltyProgram title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The display title for the Loyalty Program.
   * @return title
  **/
  @ApiModelProperty(example = "Point collection", required = true, value = "The display title for the Loyalty Program.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public LoyaltyProgram description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of our Loyalty Program.
   * @return description
  **/
  @ApiModelProperty(example = "Customers collect 10 points per 1$ spent", required = true, value = "Description of our Loyalty Program.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public LoyaltyProgram subscribedApplications(List<Integer> subscribedApplications) {
    
    this.subscribedApplications = subscribedApplications;
    return this;
  }

  public LoyaltyProgram addSubscribedApplicationsItem(Integer subscribedApplicationsItem) {
    this.subscribedApplications.add(subscribedApplicationsItem);
    return this;
  }

   /**
   * A list containing the IDs of all applications that are subscribed to this Loyalty Program.
   * @return subscribedApplications
  **/
  @ApiModelProperty(example = "[132, 97]", required = true, value = "A list containing the IDs of all applications that are subscribed to this Loyalty Program.")

  public List<Integer> getSubscribedApplications() {
    return subscribedApplications;
  }


  public void setSubscribedApplications(List<Integer> subscribedApplications) {
    this.subscribedApplications = subscribedApplications;
  }


  public LoyaltyProgram defaultValidity(String defaultValidity) {
    
    this.defaultValidity = defaultValidity;
    return this;
  }

   /**
   * The default duration after which new loyalty points should expire. Can be &#39;unlimited&#39; or a specific time. The time format is a number followed by one letter indicating the time unit, like &#39;30s&#39;, &#39;40m&#39;, &#39;1h&#39;, &#39;5D&#39;, &#39;7W&#39;, or 10M&#39;. These rounding suffixes are also supported: - &#39;_D&#39; for rounding down. Can be used as a suffix after &#39;D&#39;, and signifies the start of the day. - &#39;_U&#39; for rounding up. Can be used as a suffix after &#39;D&#39;, &#39;W&#39;, and &#39;M&#39;, and signifies the end of the day, week, and month. 
   * @return defaultValidity
  **/
  @ApiModelProperty(example = "2W_U", required = true, value = "The default duration after which new loyalty points should expire. Can be 'unlimited' or a specific time. The time format is a number followed by one letter indicating the time unit, like '30s', '40m', '1h', '5D', '7W', or 10M'. These rounding suffixes are also supported: - '_D' for rounding down. Can be used as a suffix after 'D', and signifies the start of the day. - '_U' for rounding up. Can be used as a suffix after 'D', 'W', and 'M', and signifies the end of the day, week, and month. ")

  public String getDefaultValidity() {
    return defaultValidity;
  }


  public void setDefaultValidity(String defaultValidity) {
    this.defaultValidity = defaultValidity;
  }


  public LoyaltyProgram defaultPending(String defaultPending) {
    
    this.defaultPending = defaultPending;
    return this;
  }

   /**
   * The default duration of the pending time after which points should be valid. Can be &#39;immediate&#39; or a specific time. The time format is a number followed by one letter indicating the time unit, like &#39;30s&#39;, &#39;40m&#39;, &#39;1h&#39;, &#39;5D&#39;, &#39;7W&#39;, or 10M&#39;. These rounding suffixes are also supported: - &#39;_D&#39; for rounding down. Can be used as a suffix after &#39;D&#39;, and signifies the start of the day. - &#39;_U&#39; for rounding up. Can be used as a suffix after &#39;D&#39;, &#39;W&#39;, and &#39;M&#39;, and signifies the end of the day, week, and month. 
   * @return defaultPending
  **/
  @ApiModelProperty(example = "immediate", required = true, value = "The default duration of the pending time after which points should be valid. Can be 'immediate' or a specific time. The time format is a number followed by one letter indicating the time unit, like '30s', '40m', '1h', '5D', '7W', or 10M'. These rounding suffixes are also supported: - '_D' for rounding down. Can be used as a suffix after 'D', and signifies the start of the day. - '_U' for rounding up. Can be used as a suffix after 'D', 'W', and 'M', and signifies the end of the day, week, and month. ")

  public String getDefaultPending() {
    return defaultPending;
  }


  public void setDefaultPending(String defaultPending) {
    this.defaultPending = defaultPending;
  }


  public LoyaltyProgram allowSubledger(Boolean allowSubledger) {
    
    this.allowSubledger = allowSubledger;
    return this;
  }

   /**
   * Indicates if this program supports subledgers inside the program.
   * @return allowSubledger
  **/
  @ApiModelProperty(example = "false", required = true, value = "Indicates if this program supports subledgers inside the program.")

  public Boolean getAllowSubledger() {
    return allowSubledger;
  }


  public void setAllowSubledger(Boolean allowSubledger) {
    this.allowSubledger = allowSubledger;
  }


  public LoyaltyProgram usersPerCardLimit(Integer usersPerCardLimit) {
    
    this.usersPerCardLimit = usersPerCardLimit;
    return this;
  }

   /**
   * The max amount of user profiles with whom a card can be shared. This can be set to 0 for no limit. This property is only used when &#x60;cardBased&#x60; is &#x60;true&#x60;. 
   * minimum: 0
   * @return usersPerCardLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "111", value = "The max amount of user profiles with whom a card can be shared. This can be set to 0 for no limit. This property is only used when `cardBased` is `true`. ")

  public Integer getUsersPerCardLimit() {
    return usersPerCardLimit;
  }


  public void setUsersPerCardLimit(Integer usersPerCardLimit) {
    this.usersPerCardLimit = usersPerCardLimit;
  }


  public LoyaltyProgram sandbox(Boolean sandbox) {
    
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Indicates if this program is a live or sandbox program. Programs of a given type can only be connected to Applications of the same type.
   * @return sandbox
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates if this program is a live or sandbox program. Programs of a given type can only be connected to Applications of the same type.")

  public Boolean getSandbox() {
    return sandbox;
  }


  public void setSandbox(Boolean sandbox) {
    this.sandbox = sandbox;
  }


  public LoyaltyProgram accountID(Integer accountID) {
    
    this.accountID = accountID;
    return this;
  }

   /**
   * The ID of the Talon.One account that owns this program.
   * @return accountID
  **/
  @ApiModelProperty(example = "1", required = true, value = "The ID of the Talon.One account that owns this program.")

  public Integer getAccountID() {
    return accountID;
  }


  public void setAccountID(Integer accountID) {
    this.accountID = accountID;
  }


  public LoyaltyProgram name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The internal name for the Loyalty Program. This is an immutable value.
   * @return name
  **/
  @ApiModelProperty(example = "my_program", required = true, value = "The internal name for the Loyalty Program. This is an immutable value.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LoyaltyProgram tiers(List<LoyaltyTier> tiers) {
    
    this.tiers = tiers;
    return this;
  }

  public LoyaltyProgram addTiersItem(LoyaltyTier tiersItem) {
    if (this.tiers == null) {
      this.tiers = new ArrayList<LoyaltyTier>();
    }
    this.tiers.add(tiersItem);
    return this;
  }

   /**
   * The tiers in this loyalty program.
   * @return tiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{name=Gold, minPoints=300, id=3, created=2021-06-10T09:05:27.993483Z, programID=139}, {name=Silver, minPoints=200, id=2, created=2021-06-10T09:04:59.355258Z, programId=139}, {name=Bronze, minPoints=100, id=1, created=2021-06-10T09:04:39.355258Z, programId=139}]", value = "The tiers in this loyalty program.")

  public List<LoyaltyTier> getTiers() {
    return tiers;
  }


  public void setTiers(List<LoyaltyTier> tiers) {
    this.tiers = tiers;
  }


  public LoyaltyProgram timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * A string containing an IANA timezone descriptor.
   * @return timezone
  **/
  @ApiModelProperty(example = "Europe/Berlin", required = true, value = "A string containing an IANA timezone descriptor.")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public LoyaltyProgram cardBased(Boolean cardBased) {
    
    this.cardBased = cardBased;
    return this;
  }

   /**
   * Defines the type of loyalty program: - &#x60;true&#x60;: the program is a card-based. - &#x60;false&#x60;: the program is profile-based. 
   * @return cardBased
  **/
  @ApiModelProperty(example = "true", required = true, value = "Defines the type of loyalty program: - `true`: the program is a card-based. - `false`: the program is profile-based. ")

  public Boolean getCardBased() {
    return cardBased;
  }


  public void setCardBased(Boolean cardBased) {
    this.cardBased = cardBased;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyProgram loyaltyProgram = (LoyaltyProgram) o;
    return Objects.equals(this.id, loyaltyProgram.id) &&
        Objects.equals(this.created, loyaltyProgram.created) &&
        Objects.equals(this.title, loyaltyProgram.title) &&
        Objects.equals(this.description, loyaltyProgram.description) &&
        Objects.equals(this.subscribedApplications, loyaltyProgram.subscribedApplications) &&
        Objects.equals(this.defaultValidity, loyaltyProgram.defaultValidity) &&
        Objects.equals(this.defaultPending, loyaltyProgram.defaultPending) &&
        Objects.equals(this.allowSubledger, loyaltyProgram.allowSubledger) &&
        Objects.equals(this.usersPerCardLimit, loyaltyProgram.usersPerCardLimit) &&
        Objects.equals(this.sandbox, loyaltyProgram.sandbox) &&
        Objects.equals(this.accountID, loyaltyProgram.accountID) &&
        Objects.equals(this.name, loyaltyProgram.name) &&
        Objects.equals(this.tiers, loyaltyProgram.tiers) &&
        Objects.equals(this.timezone, loyaltyProgram.timezone) &&
        Objects.equals(this.cardBased, loyaltyProgram.cardBased);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, title, description, subscribedApplications, defaultValidity, defaultPending, allowSubledger, usersPerCardLimit, sandbox, accountID, name, tiers, timezone, cardBased);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyProgram {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subscribedApplications: ").append(toIndentedString(subscribedApplications)).append("\n");
    sb.append("    defaultValidity: ").append(toIndentedString(defaultValidity)).append("\n");
    sb.append("    defaultPending: ").append(toIndentedString(defaultPending)).append("\n");
    sb.append("    allowSubledger: ").append(toIndentedString(allowSubledger)).append("\n");
    sb.append("    usersPerCardLimit: ").append(toIndentedString(usersPerCardLimit)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    cardBased: ").append(toIndentedString(cardBased)).append("\n");
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

