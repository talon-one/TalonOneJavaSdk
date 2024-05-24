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
import one.talon.model.AccountAdditionalCost;
import one.talon.model.Achievement;
import one.talon.model.Attribute;
import one.talon.model.Audience;
import one.talon.model.Collection;
import one.talon.model.FunctionDef;
import one.talon.model.GiveawaysPool;
import one.talon.model.LoyaltyProgram;
import one.talon.model.SlotDef;
import one.talon.model.TemplateDef;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Environment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_SLOTS = "slots";
  @SerializedName(SERIALIZED_NAME_SLOTS)
  private List<SlotDef> slots = new ArrayList<SlotDef>();

  public static final String SERIALIZED_NAME_FUNCTIONS = "functions";
  @SerializedName(SERIALIZED_NAME_FUNCTIONS)
  private List<FunctionDef> functions = new ArrayList<FunctionDef>();

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<TemplateDef> templates = new ArrayList<TemplateDef>();

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private String variables;

  public static final String SERIALIZED_NAME_GIVEAWAYS_POOLS = "giveawaysPools";
  @SerializedName(SERIALIZED_NAME_GIVEAWAYS_POOLS)
  private List<GiveawaysPool> giveawaysPools = null;

  public static final String SERIALIZED_NAME_LOYALTY_PROGRAMS = "loyaltyPrograms";
  @SerializedName(SERIALIZED_NAME_LOYALTY_PROGRAMS)
  private List<LoyaltyProgram> loyaltyPrograms = null;

  public static final String SERIALIZED_NAME_ACHIEVEMENTS = "achievements";
  @SerializedName(SERIALIZED_NAME_ACHIEVEMENTS)
  private List<Achievement> achievements = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<Attribute> attributes = null;

  public static final String SERIALIZED_NAME_ADDITIONAL_COSTS = "additionalCosts";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_COSTS)
  private List<AccountAdditionalCost> additionalCosts = null;

  public static final String SERIALIZED_NAME_AUDIENCES = "audiences";
  @SerializedName(SERIALIZED_NAME_AUDIENCES)
  private List<Audience> audiences = null;

  public static final String SERIALIZED_NAME_COLLECTIONS = "collections";
  @SerializedName(SERIALIZED_NAME_COLLECTIONS)
  private List<Collection> collections = null;


  public Environment id(Integer id) {
    
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


  public Environment created(OffsetDateTime created) {
    
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


  public Environment applicationId(Integer applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The ID of the application that owns this entity.
   * @return applicationId
  **/
  @ApiModelProperty(example = "322", required = true, value = "The ID of the application that owns this entity.")

  public Integer getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }


  public Environment slots(List<SlotDef> slots) {
    
    this.slots = slots;
    return this;
  }

  public Environment addSlotsItem(SlotDef slotsItem) {
    this.slots.add(slotsItem);
    return this;
  }

   /**
   * The slots defined for this application.
   * @return slots
  **/
  @ApiModelProperty(required = true, value = "The slots defined for this application.")

  public List<SlotDef> getSlots() {
    return slots;
  }


  public void setSlots(List<SlotDef> slots) {
    this.slots = slots;
  }


  public Environment functions(List<FunctionDef> functions) {
    
    this.functions = functions;
    return this;
  }

  public Environment addFunctionsItem(FunctionDef functionsItem) {
    this.functions.add(functionsItem);
    return this;
  }

   /**
   * The functions defined for this application.
   * @return functions
  **/
  @ApiModelProperty(required = true, value = "The functions defined for this application.")

  public List<FunctionDef> getFunctions() {
    return functions;
  }


  public void setFunctions(List<FunctionDef> functions) {
    this.functions = functions;
  }


  public Environment templates(List<TemplateDef> templates) {
    
    this.templates = templates;
    return this;
  }

  public Environment addTemplatesItem(TemplateDef templatesItem) {
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * The templates defined for this application.
   * @return templates
  **/
  @ApiModelProperty(required = true, value = "The templates defined for this application.")

  public List<TemplateDef> getTemplates() {
    return templates;
  }


  public void setTemplates(List<TemplateDef> templates) {
    this.templates = templates;
  }


  public Environment variables(String variables) {
    
    this.variables = variables;
    return this;
  }

   /**
   * A stringified version of the environment&#39;s Talang variables scope.
   * @return variables
  **/
  @ApiModelProperty(required = true, value = "A stringified version of the environment's Talang variables scope.")

  public String getVariables() {
    return variables;
  }


  public void setVariables(String variables) {
    this.variables = variables;
  }


  public Environment giveawaysPools(List<GiveawaysPool> giveawaysPools) {
    
    this.giveawaysPools = giveawaysPools;
    return this;
  }

  public Environment addGiveawaysPoolsItem(GiveawaysPool giveawaysPoolsItem) {
    if (this.giveawaysPools == null) {
      this.giveawaysPools = new ArrayList<GiveawaysPool>();
    }
    this.giveawaysPools.add(giveawaysPoolsItem);
    return this;
  }

   /**
   * The giveaways pools that the application is subscribed to.
   * @return giveawaysPools
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The giveaways pools that the application is subscribed to.")

  public List<GiveawaysPool> getGiveawaysPools() {
    return giveawaysPools;
  }


  public void setGiveawaysPools(List<GiveawaysPool> giveawaysPools) {
    this.giveawaysPools = giveawaysPools;
  }


  public Environment loyaltyPrograms(List<LoyaltyProgram> loyaltyPrograms) {
    
    this.loyaltyPrograms = loyaltyPrograms;
    return this;
  }

  public Environment addLoyaltyProgramsItem(LoyaltyProgram loyaltyProgramsItem) {
    if (this.loyaltyPrograms == null) {
      this.loyaltyPrograms = new ArrayList<LoyaltyProgram>();
    }
    this.loyaltyPrograms.add(loyaltyProgramsItem);
    return this;
  }

   /**
   * The loyalty programs that the application is subscribed to.
   * @return loyaltyPrograms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The loyalty programs that the application is subscribed to.")

  public List<LoyaltyProgram> getLoyaltyPrograms() {
    return loyaltyPrograms;
  }


  public void setLoyaltyPrograms(List<LoyaltyProgram> loyaltyPrograms) {
    this.loyaltyPrograms = loyaltyPrograms;
  }


  public Environment achievements(List<Achievement> achievements) {
    
    this.achievements = achievements;
    return this;
  }

  public Environment addAchievementsItem(Achievement achievementsItem) {
    if (this.achievements == null) {
      this.achievements = new ArrayList<Achievement>();
    }
    this.achievements.add(achievementsItem);
    return this;
  }

   /**
   * The achievements, linked to the campaigns, belonging to the application.
   * @return achievements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The achievements, linked to the campaigns, belonging to the application.")

  public List<Achievement> getAchievements() {
    return achievements;
  }


  public void setAchievements(List<Achievement> achievements) {
    this.achievements = achievements;
  }


  public Environment attributes(List<Attribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public Environment addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<Attribute>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * The attributes that the application is subscribed to.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The attributes that the application is subscribed to.")

  public List<Attribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }


  public Environment additionalCosts(List<AccountAdditionalCost> additionalCosts) {
    
    this.additionalCosts = additionalCosts;
    return this;
  }

  public Environment addAdditionalCostsItem(AccountAdditionalCost additionalCostsItem) {
    if (this.additionalCosts == null) {
      this.additionalCosts = new ArrayList<AccountAdditionalCost>();
    }
    this.additionalCosts.add(additionalCostsItem);
    return this;
  }

   /**
   * The additional costs that the application is subscribed to.
   * @return additionalCosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The additional costs that the application is subscribed to.")

  public List<AccountAdditionalCost> getAdditionalCosts() {
    return additionalCosts;
  }


  public void setAdditionalCosts(List<AccountAdditionalCost> additionalCosts) {
    this.additionalCosts = additionalCosts;
  }


  public Environment audiences(List<Audience> audiences) {
    
    this.audiences = audiences;
    return this;
  }

  public Environment addAudiencesItem(Audience audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<Audience>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

   /**
   * The audiences contained in the account which the application belongs to.
   * @return audiences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The audiences contained in the account which the application belongs to.")

  public List<Audience> getAudiences() {
    return audiences;
  }


  public void setAudiences(List<Audience> audiences) {
    this.audiences = audiences;
  }


  public Environment collections(List<Collection> collections) {
    
    this.collections = collections;
    return this;
  }

  public Environment addCollectionsItem(Collection collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<Collection>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

   /**
   * The account-level collections that the application is subscribed to.
   * @return collections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account-level collections that the application is subscribed to.")

  public List<Collection> getCollections() {
    return collections;
  }


  public void setCollections(List<Collection> collections) {
    this.collections = collections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Environment environment = (Environment) o;
    return Objects.equals(this.id, environment.id) &&
        Objects.equals(this.created, environment.created) &&
        Objects.equals(this.applicationId, environment.applicationId) &&
        Objects.equals(this.slots, environment.slots) &&
        Objects.equals(this.functions, environment.functions) &&
        Objects.equals(this.templates, environment.templates) &&
        Objects.equals(this.variables, environment.variables) &&
        Objects.equals(this.giveawaysPools, environment.giveawaysPools) &&
        Objects.equals(this.loyaltyPrograms, environment.loyaltyPrograms) &&
        Objects.equals(this.achievements, environment.achievements) &&
        Objects.equals(this.attributes, environment.attributes) &&
        Objects.equals(this.additionalCosts, environment.additionalCosts) &&
        Objects.equals(this.audiences, environment.audiences) &&
        Objects.equals(this.collections, environment.collections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, applicationId, slots, functions, templates, variables, giveawaysPools, loyaltyPrograms, achievements, attributes, additionalCosts, audiences, collections);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Environment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    giveawaysPools: ").append(toIndentedString(giveawaysPools)).append("\n");
    sb.append("    loyaltyPrograms: ").append(toIndentedString(loyaltyPrograms)).append("\n");
    sb.append("    achievements: ").append(toIndentedString(achievements)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    additionalCosts: ").append(toIndentedString(additionalCosts)).append("\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
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

