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
import one.talon.model.ApplicationCampaignAnalyticsAvgItemsPerSession;
import one.talon.model.ApplicationCampaignAnalyticsAvgSessionValue;
import one.talon.model.ApplicationCampaignAnalyticsCouponsCount;
import one.talon.model.ApplicationCampaignAnalyticsSessionsCount;
import one.talon.model.ApplicationCampaignAnalyticsTotalDiscounts;
import one.talon.model.ApplicationCampaignAnalyticsTotalRevenue;
import org.threeten.bp.OffsetDateTime;

/**
 * ApplicationCampaignAnalytics
 */

public class ApplicationCampaignAnalytics {
  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaignName";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName;

  public static final String SERIALIZED_NAME_CAMPAIGN_TAGS = "campaignTags";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TAGS)
  private List<String> campaignTags = null;

  /**
   * The state of the campaign.  **Note:** A disabled or archived campaign is not evaluated for rules or coupons. 
   */
  @JsonAdapter(CampaignStateEnum.Adapter.class)
  public enum CampaignStateEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled"),
    
    ARCHIVED("archived");

    private String value;

    CampaignStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CampaignStateEnum fromValue(String value) {
      for (CampaignStateEnum b : CampaignStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CampaignStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CampaignStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CampaignStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CampaignStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAMPAIGN_STATE = "campaignState";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_STATE)
  private CampaignStateEnum campaignState = CampaignStateEnum.ENABLED;

  public static final String SERIALIZED_NAME_CAMPAIGN_ACTIVE_RULESET_ID = "campaignActiveRulesetId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ACTIVE_RULESET_ID)
  private Integer campaignActiveRulesetId;

  public static final String SERIALIZED_NAME_CAMPAIGN_START_TIME = "campaignStartTime";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_START_TIME)
  private OffsetDateTime campaignStartTime;

  public static final String SERIALIZED_NAME_CAMPAIGN_END_TIME = "campaignEndTime";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_END_TIME)
  private OffsetDateTime campaignEndTime;

  public static final String SERIALIZED_NAME_TOTAL_REVENUE = "totalRevenue";
  @SerializedName(SERIALIZED_NAME_TOTAL_REVENUE)
  private ApplicationCampaignAnalyticsTotalRevenue totalRevenue;

  public static final String SERIALIZED_NAME_SESSIONS_COUNT = "sessionsCount";
  @SerializedName(SERIALIZED_NAME_SESSIONS_COUNT)
  private ApplicationCampaignAnalyticsSessionsCount sessionsCount;

  public static final String SERIALIZED_NAME_AVG_ITEMS_PER_SESSION = "avgItemsPerSession";
  @SerializedName(SERIALIZED_NAME_AVG_ITEMS_PER_SESSION)
  private ApplicationCampaignAnalyticsAvgItemsPerSession avgItemsPerSession;

  public static final String SERIALIZED_NAME_AVG_SESSION_VALUE = "avgSessionValue";
  @SerializedName(SERIALIZED_NAME_AVG_SESSION_VALUE)
  private ApplicationCampaignAnalyticsAvgSessionValue avgSessionValue;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNTS = "totalDiscounts";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNTS)
  private ApplicationCampaignAnalyticsTotalDiscounts totalDiscounts;

  public static final String SERIALIZED_NAME_COUPONS_COUNT = "couponsCount";
  @SerializedName(SERIALIZED_NAME_COUPONS_COUNT)
  private ApplicationCampaignAnalyticsCouponsCount couponsCount;


  public ApplicationCampaignAnalytics startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The start of the aggregation time frame in UTC.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2024-02-01T00:00Z", value = "The start of the aggregation time frame in UTC.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public ApplicationCampaignAnalytics endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * The end of the aggregation time frame in UTC.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end of the aggregation time frame in UTC.")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public ApplicationCampaignAnalytics campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The ID of the campaign.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The ID of the campaign.")

  public Integer getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public ApplicationCampaignAnalytics campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * The name of the campaign.
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Summer promotions", value = "The name of the campaign.")

  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public ApplicationCampaignAnalytics campaignTags(List<String> campaignTags) {
    
    this.campaignTags = campaignTags;
    return this;
  }

  public ApplicationCampaignAnalytics addCampaignTagsItem(String campaignTagsItem) {
    if (this.campaignTags == null) {
      this.campaignTags = new ArrayList<String>();
    }
    this.campaignTags.add(campaignTagsItem);
    return this;
  }

   /**
   * A list of tags for the campaign.
   * @return campaignTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[summer]", value = "A list of tags for the campaign.")

  public List<String> getCampaignTags() {
    return campaignTags;
  }


  public void setCampaignTags(List<String> campaignTags) {
    this.campaignTags = campaignTags;
  }


  public ApplicationCampaignAnalytics campaignState(CampaignStateEnum campaignState) {
    
    this.campaignState = campaignState;
    return this;
  }

   /**
   * The state of the campaign.  **Note:** A disabled or archived campaign is not evaluated for rules or coupons. 
   * @return campaignState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "enabled", value = "The state of the campaign.  **Note:** A disabled or archived campaign is not evaluated for rules or coupons. ")

  public CampaignStateEnum getCampaignState() {
    return campaignState;
  }


  public void setCampaignState(CampaignStateEnum campaignState) {
    this.campaignState = campaignState;
  }


  public ApplicationCampaignAnalytics campaignActiveRulesetId(Integer campaignActiveRulesetId) {
    
    this.campaignActiveRulesetId = campaignActiveRulesetId;
    return this;
  }

   /**
   * The [ID of the ruleset](https://docs.talon.one/management-api#operation/getRulesets) this campaign applies on customer session evaluation. 
   * @return campaignActiveRulesetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "The [ID of the ruleset](https://docs.talon.one/management-api#operation/getRulesets) this campaign applies on customer session evaluation. ")

  public Integer getCampaignActiveRulesetId() {
    return campaignActiveRulesetId;
  }


  public void setCampaignActiveRulesetId(Integer campaignActiveRulesetId) {
    this.campaignActiveRulesetId = campaignActiveRulesetId;
  }


  public ApplicationCampaignAnalytics campaignStartTime(OffsetDateTime campaignStartTime) {
    
    this.campaignStartTime = campaignStartTime;
    return this;
  }

   /**
   * Date and time when the campaign becomes active.
   * @return campaignStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-07-20T22:00Z", value = "Date and time when the campaign becomes active.")

  public OffsetDateTime getCampaignStartTime() {
    return campaignStartTime;
  }


  public void setCampaignStartTime(OffsetDateTime campaignStartTime) {
    this.campaignStartTime = campaignStartTime;
  }


  public ApplicationCampaignAnalytics campaignEndTime(OffsetDateTime campaignEndTime) {
    
    this.campaignEndTime = campaignEndTime;
    return this;
  }

   /**
   * Date and time when the campaign becomes inactive.
   * @return campaignEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-01T02:00Z", value = "Date and time when the campaign becomes inactive.")

  public OffsetDateTime getCampaignEndTime() {
    return campaignEndTime;
  }


  public void setCampaignEndTime(OffsetDateTime campaignEndTime) {
    this.campaignEndTime = campaignEndTime;
  }


  public ApplicationCampaignAnalytics totalRevenue(ApplicationCampaignAnalyticsTotalRevenue totalRevenue) {
    
    this.totalRevenue = totalRevenue;
    return this;
  }

   /**
   * Get totalRevenue
   * @return totalRevenue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationCampaignAnalyticsTotalRevenue getTotalRevenue() {
    return totalRevenue;
  }


  public void setTotalRevenue(ApplicationCampaignAnalyticsTotalRevenue totalRevenue) {
    this.totalRevenue = totalRevenue;
  }


  public ApplicationCampaignAnalytics sessionsCount(ApplicationCampaignAnalyticsSessionsCount sessionsCount) {
    
    this.sessionsCount = sessionsCount;
    return this;
  }

   /**
   * Get sessionsCount
   * @return sessionsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationCampaignAnalyticsSessionsCount getSessionsCount() {
    return sessionsCount;
  }


  public void setSessionsCount(ApplicationCampaignAnalyticsSessionsCount sessionsCount) {
    this.sessionsCount = sessionsCount;
  }


  public ApplicationCampaignAnalytics avgItemsPerSession(ApplicationCampaignAnalyticsAvgItemsPerSession avgItemsPerSession) {
    
    this.avgItemsPerSession = avgItemsPerSession;
    return this;
  }

   /**
   * Get avgItemsPerSession
   * @return avgItemsPerSession
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationCampaignAnalyticsAvgItemsPerSession getAvgItemsPerSession() {
    return avgItemsPerSession;
  }


  public void setAvgItemsPerSession(ApplicationCampaignAnalyticsAvgItemsPerSession avgItemsPerSession) {
    this.avgItemsPerSession = avgItemsPerSession;
  }


  public ApplicationCampaignAnalytics avgSessionValue(ApplicationCampaignAnalyticsAvgSessionValue avgSessionValue) {
    
    this.avgSessionValue = avgSessionValue;
    return this;
  }

   /**
   * Get avgSessionValue
   * @return avgSessionValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationCampaignAnalyticsAvgSessionValue getAvgSessionValue() {
    return avgSessionValue;
  }


  public void setAvgSessionValue(ApplicationCampaignAnalyticsAvgSessionValue avgSessionValue) {
    this.avgSessionValue = avgSessionValue;
  }


  public ApplicationCampaignAnalytics totalDiscounts(ApplicationCampaignAnalyticsTotalDiscounts totalDiscounts) {
    
    this.totalDiscounts = totalDiscounts;
    return this;
  }

   /**
   * Get totalDiscounts
   * @return totalDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationCampaignAnalyticsTotalDiscounts getTotalDiscounts() {
    return totalDiscounts;
  }


  public void setTotalDiscounts(ApplicationCampaignAnalyticsTotalDiscounts totalDiscounts) {
    this.totalDiscounts = totalDiscounts;
  }


  public ApplicationCampaignAnalytics couponsCount(ApplicationCampaignAnalyticsCouponsCount couponsCount) {
    
    this.couponsCount = couponsCount;
    return this;
  }

   /**
   * Get couponsCount
   * @return couponsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationCampaignAnalyticsCouponsCount getCouponsCount() {
    return couponsCount;
  }


  public void setCouponsCount(ApplicationCampaignAnalyticsCouponsCount couponsCount) {
    this.couponsCount = couponsCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationCampaignAnalytics applicationCampaignAnalytics = (ApplicationCampaignAnalytics) o;
    return Objects.equals(this.startTime, applicationCampaignAnalytics.startTime) &&
        Objects.equals(this.endTime, applicationCampaignAnalytics.endTime) &&
        Objects.equals(this.campaignId, applicationCampaignAnalytics.campaignId) &&
        Objects.equals(this.campaignName, applicationCampaignAnalytics.campaignName) &&
        Objects.equals(this.campaignTags, applicationCampaignAnalytics.campaignTags) &&
        Objects.equals(this.campaignState, applicationCampaignAnalytics.campaignState) &&
        Objects.equals(this.campaignActiveRulesetId, applicationCampaignAnalytics.campaignActiveRulesetId) &&
        Objects.equals(this.campaignStartTime, applicationCampaignAnalytics.campaignStartTime) &&
        Objects.equals(this.campaignEndTime, applicationCampaignAnalytics.campaignEndTime) &&
        Objects.equals(this.totalRevenue, applicationCampaignAnalytics.totalRevenue) &&
        Objects.equals(this.sessionsCount, applicationCampaignAnalytics.sessionsCount) &&
        Objects.equals(this.avgItemsPerSession, applicationCampaignAnalytics.avgItemsPerSession) &&
        Objects.equals(this.avgSessionValue, applicationCampaignAnalytics.avgSessionValue) &&
        Objects.equals(this.totalDiscounts, applicationCampaignAnalytics.totalDiscounts) &&
        Objects.equals(this.couponsCount, applicationCampaignAnalytics.couponsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, campaignId, campaignName, campaignTags, campaignState, campaignActiveRulesetId, campaignStartTime, campaignEndTime, totalRevenue, sessionsCount, avgItemsPerSession, avgSessionValue, totalDiscounts, couponsCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationCampaignAnalytics {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignTags: ").append(toIndentedString(campaignTags)).append("\n");
    sb.append("    campaignState: ").append(toIndentedString(campaignState)).append("\n");
    sb.append("    campaignActiveRulesetId: ").append(toIndentedString(campaignActiveRulesetId)).append("\n");
    sb.append("    campaignStartTime: ").append(toIndentedString(campaignStartTime)).append("\n");
    sb.append("    campaignEndTime: ").append(toIndentedString(campaignEndTime)).append("\n");
    sb.append("    totalRevenue: ").append(toIndentedString(totalRevenue)).append("\n");
    sb.append("    sessionsCount: ").append(toIndentedString(sessionsCount)).append("\n");
    sb.append("    avgItemsPerSession: ").append(toIndentedString(avgItemsPerSession)).append("\n");
    sb.append("    avgSessionValue: ").append(toIndentedString(avgSessionValue)).append("\n");
    sb.append("    totalDiscounts: ").append(toIndentedString(totalDiscounts)).append("\n");
    sb.append("    couponsCount: ").append(toIndentedString(couponsCount)).append("\n");
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

