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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import one.talon.model.CodeGeneratorSettings;
import one.talon.model.LimitConfig;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Campaign {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

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

    ARCHIVED("archived"),

    EXPIREfD("expired"),

    SCHEDULED("scheduled"),

    RUNNING("running"),

    DRAFT("draft");

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
  private Integer activeRulesetId;

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
    
    STRIKETHROUGH("strikethrough");

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
  private List<Integer> campaignGroups = null;

  public static final String SERIALIZED_NAME_COUPON_REDEMPTION_COUNT = "couponRedemptionCount";
  @SerializedName(SERIALIZED_NAME_COUPON_REDEMPTION_COUNT)
  private Integer couponRedemptionCount;

  public static final String SERIALIZED_NAME_REFERRAL_REDEMPTION_COUNT = "referralRedemptionCount";
  @SerializedName(SERIALIZED_NAME_REFERRAL_REDEMPTION_COUNT)
  private Integer referralRedemptionCount;

  public static final String SERIALIZED_NAME_DISCOUNT_COUNT = "discountCount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_COUNT)
  private BigDecimal discountCount;

  public static final String SERIALIZED_NAME_DISCOUNT_EFFECT_COUNT = "discountEffectCount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_EFFECT_COUNT)
  private Integer discountEffectCount;

  public static final String SERIALIZED_NAME_COUPON_CREATION_COUNT = "couponCreationCount";
  @SerializedName(SERIALIZED_NAME_COUPON_CREATION_COUNT)
  private Integer couponCreationCount;

  public static final String SERIALIZED_NAME_CUSTOM_EFFECT_COUNT = "customEffectCount";
  @SerializedName(SERIALIZED_NAME_CUSTOM_EFFECT_COUNT)
  private Integer customEffectCount;

  public static final String SERIALIZED_NAME_REFERRAL_CREATION_COUNT = "referralCreationCount";
  @SerializedName(SERIALIZED_NAME_REFERRAL_CREATION_COUNT)
  private Integer referralCreationCount;

  public static final String SERIALIZED_NAME_ADD_FREE_ITEM_EFFECT_COUNT = "addFreeItemEffectCount";
  @SerializedName(SERIALIZED_NAME_ADD_FREE_ITEM_EFFECT_COUNT)
  private Integer addFreeItemEffectCount;

  public static final String SERIALIZED_NAME_AWARDED_GIVEAWAYS_COUNT = "awardedGiveawaysCount";
  @SerializedName(SERIALIZED_NAME_AWARDED_GIVEAWAYS_COUNT)
  private Integer awardedGiveawaysCount;

  public static final String SERIALIZED_NAME_CREATED_LOYALTY_POINTS_COUNT = "createdLoyaltyPointsCount";
  @SerializedName(SERIALIZED_NAME_CREATED_LOYALTY_POINTS_COUNT)
  private BigDecimal createdLoyaltyPointsCount;

  public static final String SERIALIZED_NAME_CREATED_LOYALTY_POINTS_EFFECT_COUNT = "createdLoyaltyPointsEffectCount";
  @SerializedName(SERIALIZED_NAME_CREATED_LOYALTY_POINTS_EFFECT_COUNT)
  private Integer createdLoyaltyPointsEffectCount;

  public static final String SERIALIZED_NAME_REDEEMED_LOYALTY_POINTS_COUNT = "redeemedLoyaltyPointsCount";
  @SerializedName(SERIALIZED_NAME_REDEEMED_LOYALTY_POINTS_COUNT)
  private BigDecimal redeemedLoyaltyPointsCount;

  public static final String SERIALIZED_NAME_REDEEMED_LOYALTY_POINTS_EFFECT_COUNT = "redeemedLoyaltyPointsEffectCount";
  @SerializedName(SERIALIZED_NAME_REDEEMED_LOYALTY_POINTS_EFFECT_COUNT)
  private Integer redeemedLoyaltyPointsEffectCount;

  public static final String SERIALIZED_NAME_CALL_API_EFFECT_COUNT = "callApiEffectCount";
  @SerializedName(SERIALIZED_NAME_CALL_API_EFFECT_COUNT)
  private Integer callApiEffectCount;

  public static final String SERIALIZED_NAME_RESERVECOUPON_EFFECT_COUNT = "reservecouponEffectCount";
  @SerializedName(SERIALIZED_NAME_RESERVECOUPON_EFFECT_COUNT)
  private Integer reservecouponEffectCount;

  public static final String SERIALIZED_NAME_LAST_ACTIVITY = "lastActivity";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVITY)
  private OffsetDateTime lastActivity;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updatedBy";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private String updatedBy;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;


  public Campaign id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID for this entity.
   * @return id
  **/
  @ApiModelProperty(example = "4", required = true, value = "Unique ID for this entity.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Campaign created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The exact moment this entity was created.
   * @return created
  **/
  @ApiModelProperty(example = "2020-06-10T09:05:27.993483Z", required = true, value = "The exact moment this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Campaign applicationId(Integer applicationId) {
    
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


  public Campaign userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user associated with this entity.
   * @return userId
  **/
  @ApiModelProperty(example = "388", required = true, value = "The ID of the user associated with this entity.")

  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public Campaign name(String name) {
    
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


  public Campaign description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A detailed description of the campaign.
   * @return description
  **/
  @ApiModelProperty(example = "Campaign for all summer 2021 promotions", required = true, value = "A detailed description of the campaign.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Campaign startTime(OffsetDateTime startTime) {
    
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


  public Campaign endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Timestamp the campaign will become inactive.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-09-22T22:00Z", value = "Timestamp the campaign will become inactive.")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public Campaign attributes(Object attributes) {
    
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


  public Campaign state(StateEnum state) {
    
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


  public Campaign activeRulesetId(Integer activeRulesetId) {
    
    this.activeRulesetId = activeRulesetId;
    return this;
  }

   /**
   * [ID of Ruleset](https://docs.talon.one/management-api#operation/getRulesets) this campaign applies on customer session evaluation. 
   * @return activeRulesetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "[ID of Ruleset](https://docs.talon.one/management-api#operation/getRulesets) this campaign applies on customer session evaluation. ")

  public Integer getActiveRulesetId() {
    return activeRulesetId;
  }


  public void setActiveRulesetId(Integer activeRulesetId) {
    this.activeRulesetId = activeRulesetId;
  }


  public Campaign tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Campaign addTagsItem(String tagsItem) {
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


  public Campaign features(List<FeaturesEnum> features) {
    
    this.features = features;
    return this;
  }

  public Campaign addFeaturesItem(FeaturesEnum featuresItem) {
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


  public Campaign couponSettings(CodeGeneratorSettings couponSettings) {
    
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


  public Campaign referralSettings(CodeGeneratorSettings referralSettings) {
    
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


  public Campaign limits(List<LimitConfig> limits) {
    
    this.limits = limits;
    return this;
  }

  public Campaign addLimitsItem(LimitConfig limitsItem) {
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


  public Campaign campaignGroups(List<Integer> campaignGroups) {
    
    this.campaignGroups = campaignGroups;
    return this;
  }

  public Campaign addCampaignGroupsItem(Integer campaignGroupsItem) {
    if (this.campaignGroups == null) {
      this.campaignGroups = new ArrayList<Integer>();
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

  public List<Integer> getCampaignGroups() {
    return campaignGroups;
  }


  public void setCampaignGroups(List<Integer> campaignGroups) {
    this.campaignGroups = campaignGroups;
  }


  public Campaign couponRedemptionCount(Integer couponRedemptionCount) {
    
    this.couponRedemptionCount = couponRedemptionCount;
    return this;
  }

   /**
   * Number of coupons redeemed in the campaign.
   * @return couponRedemptionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "163", value = "Number of coupons redeemed in the campaign.")

  public Integer getCouponRedemptionCount() {
    return couponRedemptionCount;
  }


  public void setCouponRedemptionCount(Integer couponRedemptionCount) {
    this.couponRedemptionCount = couponRedemptionCount;
  }


  public Campaign referralRedemptionCount(Integer referralRedemptionCount) {
    
    this.referralRedemptionCount = referralRedemptionCount;
    return this;
  }

   /**
   * Number of referral codes redeemed in the campaign.
   * @return referralRedemptionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Number of referral codes redeemed in the campaign.")

  public Integer getReferralRedemptionCount() {
    return referralRedemptionCount;
  }


  public void setReferralRedemptionCount(Integer referralRedemptionCount) {
    this.referralRedemptionCount = referralRedemptionCount;
  }


  public Campaign discountCount(BigDecimal discountCount) {
    
    this.discountCount = discountCount;
    return this;
  }

   /**
   * Total amount of discounts redeemed in the campaign.
   * @return discountCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "288.0", value = "Total amount of discounts redeemed in the campaign.")

  public BigDecimal getDiscountCount() {
    return discountCount;
  }


  public void setDiscountCount(BigDecimal discountCount) {
    this.discountCount = discountCount;
  }


  public Campaign discountEffectCount(Integer discountEffectCount) {
    
    this.discountEffectCount = discountEffectCount;
    return this;
  }

   /**
   * Total number of times discounts were redeemed in this campaign.
   * @return discountEffectCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "343", value = "Total number of times discounts were redeemed in this campaign.")

  public Integer getDiscountEffectCount() {
    return discountEffectCount;
  }


  public void setDiscountEffectCount(Integer discountEffectCount) {
    this.discountEffectCount = discountEffectCount;
  }


  public Campaign couponCreationCount(Integer couponCreationCount) {
    
    this.couponCreationCount = couponCreationCount;
    return this;
  }

   /**
   * Total number of coupons created by rules in this campaign.
   * @return couponCreationCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "16", value = "Total number of coupons created by rules in this campaign.")

  public Integer getCouponCreationCount() {
    return couponCreationCount;
  }


  public void setCouponCreationCount(Integer couponCreationCount) {
    this.couponCreationCount = couponCreationCount;
  }


  public Campaign customEffectCount(Integer customEffectCount) {
    
    this.customEffectCount = customEffectCount;
    return this;
  }

   /**
   * Total number of custom effects triggered by rules in this campaign.
   * @return customEffectCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of custom effects triggered by rules in this campaign.")

  public Integer getCustomEffectCount() {
    return customEffectCount;
  }


  public void setCustomEffectCount(Integer customEffectCount) {
    this.customEffectCount = customEffectCount;
  }


  public Campaign referralCreationCount(Integer referralCreationCount) {
    
    this.referralCreationCount = referralCreationCount;
    return this;
  }

   /**
   * Total number of referrals created by rules in this campaign.
   * @return referralCreationCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "Total number of referrals created by rules in this campaign.")

  public Integer getReferralCreationCount() {
    return referralCreationCount;
  }


  public void setReferralCreationCount(Integer referralCreationCount) {
    this.referralCreationCount = referralCreationCount;
  }


  public Campaign addFreeItemEffectCount(Integer addFreeItemEffectCount) {
    
    this.addFreeItemEffectCount = addFreeItemEffectCount;
    return this;
  }

   /**
   * Total number of times triggering add free item effext is allowed in this campaign.
   * @return addFreeItemEffectCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of times triggering add free item effext is allowed in this campaign.")

  public Integer getAddFreeItemEffectCount() {
    return addFreeItemEffectCount;
  }


  public void setAddFreeItemEffectCount(Integer addFreeItemEffectCount) {
    this.addFreeItemEffectCount = addFreeItemEffectCount;
  }


  public Campaign awardedGiveawaysCount(Integer awardedGiveawaysCount) {
    
    this.awardedGiveawaysCount = awardedGiveawaysCount;
    return this;
  }

   /**
   * Total number of giveaways awarded by rules in this campaign.
   * @return awardedGiveawaysCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9", value = "Total number of giveaways awarded by rules in this campaign.")

  public Integer getAwardedGiveawaysCount() {
    return awardedGiveawaysCount;
  }


  public void setAwardedGiveawaysCount(Integer awardedGiveawaysCount) {
    this.awardedGiveawaysCount = awardedGiveawaysCount;
  }


  public Campaign createdLoyaltyPointsCount(BigDecimal createdLoyaltyPointsCount) {
    
    this.createdLoyaltyPointsCount = createdLoyaltyPointsCount;
    return this;
  }

   /**
   * Total number of loyalty points created by rules in this campaign.
   * @return createdLoyaltyPointsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9.0", value = "Total number of loyalty points created by rules in this campaign.")

  public BigDecimal getCreatedLoyaltyPointsCount() {
    return createdLoyaltyPointsCount;
  }


  public void setCreatedLoyaltyPointsCount(BigDecimal createdLoyaltyPointsCount) {
    this.createdLoyaltyPointsCount = createdLoyaltyPointsCount;
  }


  public Campaign createdLoyaltyPointsEffectCount(Integer createdLoyaltyPointsEffectCount) {
    
    this.createdLoyaltyPointsEffectCount = createdLoyaltyPointsEffectCount;
    return this;
  }

   /**
   * Total number of loyalty point creation effects triggered by rules in this campaign.
   * @return createdLoyaltyPointsEffectCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Total number of loyalty point creation effects triggered by rules in this campaign.")

  public Integer getCreatedLoyaltyPointsEffectCount() {
    return createdLoyaltyPointsEffectCount;
  }


  public void setCreatedLoyaltyPointsEffectCount(Integer createdLoyaltyPointsEffectCount) {
    this.createdLoyaltyPointsEffectCount = createdLoyaltyPointsEffectCount;
  }


  public Campaign redeemedLoyaltyPointsCount(BigDecimal redeemedLoyaltyPointsCount) {
    
    this.redeemedLoyaltyPointsCount = redeemedLoyaltyPointsCount;
    return this;
  }

   /**
   * Total number of loyalty points redeemed by rules in this campaign.
   * @return redeemedLoyaltyPointsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.0", value = "Total number of loyalty points redeemed by rules in this campaign.")

  public BigDecimal getRedeemedLoyaltyPointsCount() {
    return redeemedLoyaltyPointsCount;
  }


  public void setRedeemedLoyaltyPointsCount(BigDecimal redeemedLoyaltyPointsCount) {
    this.redeemedLoyaltyPointsCount = redeemedLoyaltyPointsCount;
  }


  public Campaign redeemedLoyaltyPointsEffectCount(Integer redeemedLoyaltyPointsEffectCount) {
    
    this.redeemedLoyaltyPointsEffectCount = redeemedLoyaltyPointsEffectCount;
    return this;
  }

   /**
   * Total number of loyalty point redemption effects triggered by rules in this campaign.
   * @return redeemedLoyaltyPointsEffectCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9", value = "Total number of loyalty point redemption effects triggered by rules in this campaign.")

  public Integer getRedeemedLoyaltyPointsEffectCount() {
    return redeemedLoyaltyPointsEffectCount;
  }


  public void setRedeemedLoyaltyPointsEffectCount(Integer redeemedLoyaltyPointsEffectCount) {
    this.redeemedLoyaltyPointsEffectCount = redeemedLoyaltyPointsEffectCount;
  }


  public Campaign callApiEffectCount(Integer callApiEffectCount) {
    
    this.callApiEffectCount = callApiEffectCount;
    return this;
  }

   /**
   * Total number of webhook triggered by rules in this campaign.
   * @return callApiEffectCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of webhook triggered by rules in this campaign.")

  public Integer getCallApiEffectCount() {
    return callApiEffectCount;
  }


  public void setCallApiEffectCount(Integer callApiEffectCount) {
    this.callApiEffectCount = callApiEffectCount;
  }


  public Campaign reservecouponEffectCount(Integer reservecouponEffectCount) {
    
    this.reservecouponEffectCount = reservecouponEffectCount;
    return this;
  }

   /**
   * Total number of reserve coupon effects triggered by rules in this campaign.
   * @return reservecouponEffectCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9", value = "Total number of reserve coupon effects triggered by rules in this campaign.")

  public Integer getReservecouponEffectCount() {
    return reservecouponEffectCount;
  }


  public void setReservecouponEffectCount(Integer reservecouponEffectCount) {
    this.reservecouponEffectCount = reservecouponEffectCount;
  }


  public Campaign lastActivity(OffsetDateTime lastActivity) {
    
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * Timestamp of the most recent event received by this campaign.
   * @return lastActivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-11-10T23:00Z", value = "Timestamp of the most recent event received by this campaign.")

  public OffsetDateTime getLastActivity() {
    return lastActivity;
  }


  public void setLastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
  }


  public Campaign updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Timestamp of the most recent update to the campaign&#39;s property. Updates to external entities used in this campaign are **not** registered by this property, such as collection or coupon updates. 
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of the most recent update to the campaign's property. Updates to external entities used in this campaign are **not** registered by this property, such as collection or coupon updates. ")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  public Campaign createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Name of the user who created this campaign if available.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe", value = "Name of the user who created this campaign if available.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public Campaign updatedBy(String updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Name of the user who last updated this campaign if available.
   * @return updatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jane Doe", value = "Name of the user who last updated this campaign if available.")

  public String getUpdatedBy() {
    return updatedBy;
  }


  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }


  public Campaign templateId(Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * The ID of the Campaign Template this Campaign was created from.
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The ID of the Campaign Template this Campaign was created from.")

  public Integer getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.id, campaign.id) &&
        Objects.equals(this.created, campaign.created) &&
        Objects.equals(this.applicationId, campaign.applicationId) &&
        Objects.equals(this.userId, campaign.userId) &&
        Objects.equals(this.name, campaign.name) &&
        Objects.equals(this.description, campaign.description) &&
        Objects.equals(this.startTime, campaign.startTime) &&
        Objects.equals(this.endTime, campaign.endTime) &&
        Objects.equals(this.attributes, campaign.attributes) &&
        Objects.equals(this.state, campaign.state) &&
        Objects.equals(this.activeRulesetId, campaign.activeRulesetId) &&
        Objects.equals(this.tags, campaign.tags) &&
        Objects.equals(this.features, campaign.features) &&
        Objects.equals(this.couponSettings, campaign.couponSettings) &&
        Objects.equals(this.referralSettings, campaign.referralSettings) &&
        Objects.equals(this.limits, campaign.limits) &&
        Objects.equals(this.campaignGroups, campaign.campaignGroups) &&
        Objects.equals(this.couponRedemptionCount, campaign.couponRedemptionCount) &&
        Objects.equals(this.referralRedemptionCount, campaign.referralRedemptionCount) &&
        Objects.equals(this.discountCount, campaign.discountCount) &&
        Objects.equals(this.discountEffectCount, campaign.discountEffectCount) &&
        Objects.equals(this.couponCreationCount, campaign.couponCreationCount) &&
        Objects.equals(this.customEffectCount, campaign.customEffectCount) &&
        Objects.equals(this.referralCreationCount, campaign.referralCreationCount) &&
        Objects.equals(this.addFreeItemEffectCount, campaign.addFreeItemEffectCount) &&
        Objects.equals(this.awardedGiveawaysCount, campaign.awardedGiveawaysCount) &&
        Objects.equals(this.createdLoyaltyPointsCount, campaign.createdLoyaltyPointsCount) &&
        Objects.equals(this.createdLoyaltyPointsEffectCount, campaign.createdLoyaltyPointsEffectCount) &&
        Objects.equals(this.redeemedLoyaltyPointsCount, campaign.redeemedLoyaltyPointsCount) &&
        Objects.equals(this.redeemedLoyaltyPointsEffectCount, campaign.redeemedLoyaltyPointsEffectCount) &&
        Objects.equals(this.callApiEffectCount, campaign.callApiEffectCount) &&
        Objects.equals(this.reservecouponEffectCount, campaign.reservecouponEffectCount) &&
        Objects.equals(this.lastActivity, campaign.lastActivity) &&
        Objects.equals(this.updated, campaign.updated) &&
        Objects.equals(this.createdBy, campaign.createdBy) &&
        Objects.equals(this.updatedBy, campaign.updatedBy) &&
        Objects.equals(this.templateId, campaign.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, applicationId, userId, name, description, startTime, endTime, attributes, state, activeRulesetId, tags, features, couponSettings, referralSettings, limits, campaignGroups, couponRedemptionCount, referralRedemptionCount, discountCount, discountEffectCount, couponCreationCount, customEffectCount, referralCreationCount, addFreeItemEffectCount, awardedGiveawaysCount, createdLoyaltyPointsCount, createdLoyaltyPointsEffectCount, redeemedLoyaltyPointsCount, redeemedLoyaltyPointsEffectCount, callApiEffectCount, reservecouponEffectCount, lastActivity, updated, createdBy, updatedBy, templateId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    sb.append("    couponRedemptionCount: ").append(toIndentedString(couponRedemptionCount)).append("\n");
    sb.append("    referralRedemptionCount: ").append(toIndentedString(referralRedemptionCount)).append("\n");
    sb.append("    discountCount: ").append(toIndentedString(discountCount)).append("\n");
    sb.append("    discountEffectCount: ").append(toIndentedString(discountEffectCount)).append("\n");
    sb.append("    couponCreationCount: ").append(toIndentedString(couponCreationCount)).append("\n");
    sb.append("    customEffectCount: ").append(toIndentedString(customEffectCount)).append("\n");
    sb.append("    referralCreationCount: ").append(toIndentedString(referralCreationCount)).append("\n");
    sb.append("    addFreeItemEffectCount: ").append(toIndentedString(addFreeItemEffectCount)).append("\n");
    sb.append("    awardedGiveawaysCount: ").append(toIndentedString(awardedGiveawaysCount)).append("\n");
    sb.append("    createdLoyaltyPointsCount: ").append(toIndentedString(createdLoyaltyPointsCount)).append("\n");
    sb.append("    createdLoyaltyPointsEffectCount: ").append(toIndentedString(createdLoyaltyPointsEffectCount)).append("\n");
    sb.append("    redeemedLoyaltyPointsCount: ").append(toIndentedString(redeemedLoyaltyPointsCount)).append("\n");
    sb.append("    redeemedLoyaltyPointsEffectCount: ").append(toIndentedString(redeemedLoyaltyPointsEffectCount)).append("\n");
    sb.append("    callApiEffectCount: ").append(toIndentedString(callApiEffectCount)).append("\n");
    sb.append("    reservecouponEffectCount: ").append(toIndentedString(reservecouponEffectCount)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

