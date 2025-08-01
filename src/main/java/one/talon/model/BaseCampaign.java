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
import one.talon.model.CodeGeneratorSettings;
import one.talon.model.LimitConfig;
import org.threeten.bp.OffsetDateTime;

/**
 * BaseCampaign
 */

public class BaseCampaign {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  /**
   * A disabled or archived campaign is not evaluated for rules or coupons. 
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled"),
    
    ARCHIVED("archived");

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
  private StateEnum state = StateEnum.ENABLED;

  public static final String SERIALIZED_NAME_ACTIVE_RULESET_ID = "activeRulesetId";
  @SerializedName(SERIALIZED_NAME_ACTIVE_RULESET_ID)
  private Long activeRulesetId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<String>();

  /**
   * Gets or Sets features
   */
  @JsonAdapter(FeaturesEnum.Adapter.class)
  public enum FeaturesEnum {
    COUPONS("coupons"),
    
    REFERRALS("referrals"),
    
    LOYALTY("loyalty"),
    
    GIVEAWAYS("giveaways"),
    
    STRIKETHROUGH("strikethrough"),
    
    ACHIEVEMENTS("achievements");

    private String value;

    FeaturesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeaturesEnum fromValue(String value) {
      for (FeaturesEnum b : FeaturesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeaturesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeaturesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeaturesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeaturesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<FeaturesEnum> features = new ArrayList<FeaturesEnum>();

  public static final String SERIALIZED_NAME_COUPON_SETTINGS = "couponSettings";
  @SerializedName(SERIALIZED_NAME_COUPON_SETTINGS)
  private CodeGeneratorSettings couponSettings;

  public static final String SERIALIZED_NAME_REFERRAL_SETTINGS = "referralSettings";
  @SerializedName(SERIALIZED_NAME_REFERRAL_SETTINGS)
  private CodeGeneratorSettings referralSettings;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private List<LimitConfig> limits = new ArrayList<LimitConfig>();

  public static final String SERIALIZED_NAME_CAMPAIGN_GROUPS = "campaignGroups";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_GROUPS)
  private List<Long> campaignGroups = null;

  /**
   * The campaign type. Possible type values:   - &#x60;cartItem&#x60;: Type of campaign that can apply effects only to cart items.   - &#x60;advanced&#x60;: Type of campaign that can apply effects to customer sessions and cart items. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CARTITEM("cartItem"),
    
    ADVANCED("advanced");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.ADVANCED;

  public static final String SERIALIZED_NAME_LINKED_STORE_IDS = "linkedStoreIds";
  @SerializedName(SERIALIZED_NAME_LINKED_STORE_IDS)
  private List<Long> linkedStoreIds = null;


  public BaseCampaign name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A user-facing name for this campaign.
   * @return name
  **/
  @ApiModelProperty(example = "Summer promotions", required = true, value = "A user-facing name for this campaign.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BaseCampaign description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A detailed description of the campaign.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Campaign for all summer 2021 promotions", value = "A detailed description of the campaign.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BaseCampaign startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Timestamp when the campaign will become active.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-07-20T22:00Z", value = "Timestamp when the campaign will become active.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public BaseCampaign endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Timestamp when the campaign will become inactive.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-09-22T22:00Z", value = "Timestamp when the campaign will become inactive.")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public BaseCampaign attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this campaign.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary properties associated with this campaign.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public BaseCampaign state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * A disabled or archived campaign is not evaluated for rules or coupons. 
   * @return state
  **/
  @ApiModelProperty(example = "enabled", required = true, value = "A disabled or archived campaign is not evaluated for rules or coupons. ")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public BaseCampaign activeRulesetId(Long activeRulesetId) {
    
    this.activeRulesetId = activeRulesetId;
    return this;
  }

   /**
   * [ID of Ruleset](https://docs.talon.one/management-api#operation/getRulesets) this campaign applies on customer session evaluation. 
   * @return activeRulesetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "[ID of Ruleset](https://docs.talon.one/management-api#operation/getRulesets) this campaign applies on customer session evaluation. ")

  public Long getActiveRulesetId() {
    return activeRulesetId;
  }


  public void setActiveRulesetId(Long activeRulesetId) {
    this.activeRulesetId = activeRulesetId;
  }


  public BaseCampaign tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public BaseCampaign addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags for the campaign.
   * @return tags
  **/
  @ApiModelProperty(example = "[summer]", required = true, value = "A list of tags for the campaign.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public BaseCampaign features(List<FeaturesEnum> features) {
    
    this.features = features;
    return this;
  }

  public BaseCampaign addFeaturesItem(FeaturesEnum featuresItem) {
    this.features.add(featuresItem);
    return this;
  }

   /**
   * The features enabled in this campaign.
   * @return features
  **/
  @ApiModelProperty(example = "[coupons, referrals]", required = true, value = "The features enabled in this campaign.")

  public List<FeaturesEnum> getFeatures() {
    return features;
  }


  public void setFeatures(List<FeaturesEnum> features) {
    this.features = features;
  }


  public BaseCampaign couponSettings(CodeGeneratorSettings couponSettings) {
    
    this.couponSettings = couponSettings;
    return this;
  }

   /**
   * Get couponSettings
   * @return couponSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CodeGeneratorSettings getCouponSettings() {
    return couponSettings;
  }


  public void setCouponSettings(CodeGeneratorSettings couponSettings) {
    this.couponSettings = couponSettings;
  }


  public BaseCampaign referralSettings(CodeGeneratorSettings referralSettings) {
    
    this.referralSettings = referralSettings;
    return this;
  }

   /**
   * Get referralSettings
   * @return referralSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CodeGeneratorSettings getReferralSettings() {
    return referralSettings;
  }


  public void setReferralSettings(CodeGeneratorSettings referralSettings) {
    this.referralSettings = referralSettings;
  }


  public BaseCampaign limits(List<LimitConfig> limits) {
    
    this.limits = limits;
    return this;
  }

  public BaseCampaign addLimitsItem(LimitConfig limitsItem) {
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * The set of [budget limits](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets) for this campaign. 
   * @return limits
  **/
  @ApiModelProperty(required = true, value = "The set of [budget limits](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets) for this campaign. ")

  public List<LimitConfig> getLimits() {
    return limits;
  }


  public void setLimits(List<LimitConfig> limits) {
    this.limits = limits;
  }


  public BaseCampaign campaignGroups(List<Long> campaignGroups) {
    
    this.campaignGroups = campaignGroups;
    return this;
  }

  public BaseCampaign addCampaignGroupsItem(Long campaignGroupsItem) {
    if (this.campaignGroups == null) {
      this.campaignGroups = new ArrayList<Long>();
    }
    this.campaignGroups.add(campaignGroupsItem);
    return this;
  }

   /**
   * The IDs of the [campaign groups](https://docs.talon.one/docs/product/account/managing-campaign-groups) this campaign belongs to. 
   * @return campaignGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1, 3]", value = "The IDs of the [campaign groups](https://docs.talon.one/docs/product/account/managing-campaign-groups) this campaign belongs to. ")

  public List<Long> getCampaignGroups() {
    return campaignGroups;
  }


  public void setCampaignGroups(List<Long> campaignGroups) {
    this.campaignGroups = campaignGroups;
  }


  public BaseCampaign type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The campaign type. Possible type values:   - &#x60;cartItem&#x60;: Type of campaign that can apply effects only to cart items.   - &#x60;advanced&#x60;: Type of campaign that can apply effects to customer sessions and cart items. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "advanced", value = "The campaign type. Possible type values:   - `cartItem`: Type of campaign that can apply effects only to cart items.   - `advanced`: Type of campaign that can apply effects to customer sessions and cart items. ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public BaseCampaign linkedStoreIds(List<Long> linkedStoreIds) {
    
    this.linkedStoreIds = linkedStoreIds;
    return this;
  }

  public BaseCampaign addLinkedStoreIdsItem(Long linkedStoreIdsItem) {
    if (this.linkedStoreIds == null) {
      this.linkedStoreIds = new ArrayList<Long>();
    }
    this.linkedStoreIds.add(linkedStoreIdsItem);
    return this;
  }

   /**
   * A list of store IDs that you want to link to the campaign.  **Note:** Campaigns with linked store IDs will only be evaluated when there is a [customer session update](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) that references a linked store. 
   * @return linkedStoreIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1, 2, 3]", value = "A list of store IDs that you want to link to the campaign.  **Note:** Campaigns with linked store IDs will only be evaluated when there is a [customer session update](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) that references a linked store. ")

  public List<Long> getLinkedStoreIds() {
    return linkedStoreIds;
  }


  public void setLinkedStoreIds(List<Long> linkedStoreIds) {
    this.linkedStoreIds = linkedStoreIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseCampaign baseCampaign = (BaseCampaign) o;
    return Objects.equals(this.name, baseCampaign.name) &&
        Objects.equals(this.description, baseCampaign.description) &&
        Objects.equals(this.startTime, baseCampaign.startTime) &&
        Objects.equals(this.endTime, baseCampaign.endTime) &&
        Objects.equals(this.attributes, baseCampaign.attributes) &&
        Objects.equals(this.state, baseCampaign.state) &&
        Objects.equals(this.activeRulesetId, baseCampaign.activeRulesetId) &&
        Objects.equals(this.tags, baseCampaign.tags) &&
        Objects.equals(this.features, baseCampaign.features) &&
        Objects.equals(this.couponSettings, baseCampaign.couponSettings) &&
        Objects.equals(this.referralSettings, baseCampaign.referralSettings) &&
        Objects.equals(this.limits, baseCampaign.limits) &&
        Objects.equals(this.campaignGroups, baseCampaign.campaignGroups) &&
        Objects.equals(this.type, baseCampaign.type) &&
        Objects.equals(this.linkedStoreIds, baseCampaign.linkedStoreIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, startTime, endTime, attributes, state, activeRulesetId, tags, features, couponSettings, referralSettings, limits, campaignGroups, type, linkedStoreIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseCampaign {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    activeRulesetId: ").append(toIndentedString(activeRulesetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    couponSettings: ").append(toIndentedString(couponSettings)).append("\n");
    sb.append("    referralSettings: ").append(toIndentedString(referralSettings)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    campaignGroups: ").append(toIndentedString(campaignGroups)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    linkedStoreIds: ").append(toIndentedString(linkedStoreIds)).append("\n");
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

