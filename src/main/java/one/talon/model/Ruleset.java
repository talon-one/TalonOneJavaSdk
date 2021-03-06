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
import one.talon.model.Binding;
import one.talon.model.Rule;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Ruleset {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<Rule> rules = new ArrayList<Rule>();

  public static final String SERIALIZED_NAME_BINDINGS = "bindings";
  @SerializedName(SERIALIZED_NAME_BINDINGS)
  private List<Binding> bindings = new ArrayList<Binding>();

  public static final String SERIALIZED_NAME_RB_VERSION = "rbVersion";
  @SerializedName(SERIALIZED_NAME_RB_VERSION)
  private String rbVersion;

  public static final String SERIALIZED_NAME_ACTIVATE = "activate";
  @SerializedName(SERIALIZED_NAME_ACTIVATE)
  private Boolean activate;

  public static final String SERIALIZED_NAME_ACTIVATED_AT = "activatedAt";
  @SerializedName(SERIALIZED_NAME_ACTIVATED_AT)
  private OffsetDateTime activatedAt;


  public Ruleset id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID for this entity.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique ID for this entity.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Ruleset created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The exact moment this entity was created.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The exact moment this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Ruleset campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The ID of the campaign that owns this entity.
   * @return campaignId
  **/
  @ApiModelProperty(required = true, value = "The ID of the campaign that owns this entity.")

  public Integer getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public Ruleset userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the account that owns this entity.
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account that owns this entity.")

  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public Ruleset rules(List<Rule> rules) {
    
    this.rules = rules;
    return this;
  }

  public Ruleset addRulesItem(Rule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Set of rules to apply.
   * @return rules
  **/
  @ApiModelProperty(required = true, value = "Set of rules to apply.")

  public List<Rule> getRules() {
    return rules;
  }


  public void setRules(List<Rule> rules) {
    this.rules = rules;
  }


  public Ruleset bindings(List<Binding> bindings) {
    
    this.bindings = bindings;
    return this;
  }

  public Ruleset addBindingsItem(Binding bindingsItem) {
    this.bindings.add(bindingsItem);
    return this;
  }

   /**
   * An array that provides objects with variable names (name) and talang expressions to whose result they are bound (expression) during rule evaluation. The order of the evaluation is decided by the position in the array.
   * @return bindings
  **/
  @ApiModelProperty(required = true, value = "An array that provides objects with variable names (name) and talang expressions to whose result they are bound (expression) during rule evaluation. The order of the evaluation is decided by the position in the array.")

  public List<Binding> getBindings() {
    return bindings;
  }


  public void setBindings(List<Binding> bindings) {
    this.bindings = bindings;
  }


  public Ruleset rbVersion(String rbVersion) {
    
    this.rbVersion = rbVersion;
    return this;
  }

   /**
   * A string indicating which version of the rulebuilder was used to create this ruleset.
   * @return rbVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string indicating which version of the rulebuilder was used to create this ruleset.")

  public String getRbVersion() {
    return rbVersion;
  }


  public void setRbVersion(String rbVersion) {
    this.rbVersion = rbVersion;
  }


  public Ruleset activate(Boolean activate) {
    
    this.activate = activate;
    return this;
  }

   /**
   * A boolean indicating whether this newly created ruleset should also be activated for the campaign owns it
   * @return activate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean indicating whether this newly created ruleset should also be activated for the campaign owns it")

  public Boolean getActivate() {
    return activate;
  }


  public void setActivate(Boolean activate) {
    this.activate = activate;
  }


  public Ruleset activatedAt(OffsetDateTime activatedAt) {
    
    this.activatedAt = activatedAt;
    return this;
  }

   /**
   * Timestamp indicating when this Ruleset was activated.
   * @return activatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp indicating when this Ruleset was activated.")

  public OffsetDateTime getActivatedAt() {
    return activatedAt;
  }


  public void setActivatedAt(OffsetDateTime activatedAt) {
    this.activatedAt = activatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ruleset ruleset = (Ruleset) o;
    return Objects.equals(this.id, ruleset.id) &&
        Objects.equals(this.created, ruleset.created) &&
        Objects.equals(this.campaignId, ruleset.campaignId) &&
        Objects.equals(this.userId, ruleset.userId) &&
        Objects.equals(this.rules, ruleset.rules) &&
        Objects.equals(this.bindings, ruleset.bindings) &&
        Objects.equals(this.rbVersion, ruleset.rbVersion) &&
        Objects.equals(this.activate, ruleset.activate) &&
        Objects.equals(this.activatedAt, ruleset.activatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, campaignId, userId, rules, bindings, rbVersion, activate, activatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ruleset {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
    sb.append("    rbVersion: ").append(toIndentedString(rbVersion)).append("\n");
    sb.append("    activate: ").append(toIndentedString(activate)).append("\n");
    sb.append("    activatedAt: ").append(toIndentedString(activatedAt)).append("\n");
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

