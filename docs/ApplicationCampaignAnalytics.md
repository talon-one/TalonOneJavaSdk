

# ApplicationCampaignAnalytics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the aggregation time frame in UTC. |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the aggregation time frame in UTC. |  [optional]
**campaignId** | **Integer** | The ID of the campaign. |  [optional]
**campaignName** | **String** | The name of the campaign. |  [optional]
**campaignTags** | **List&lt;String&gt;** | A list of tags for the campaign. |  [optional]
**campaignState** | [**CampaignStateEnum**](#CampaignStateEnum) | The state of the campaign.  **Note:** A disabled or archived campaign is not evaluated for rules or coupons.  |  [optional]
**campaignActiveRulesetId** | **Integer** | The [ID of the ruleset](https://docs.talon.one/management-api#operation/getRulesets) this campaign applies on customer session evaluation.  |  [optional]
**campaignStartTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time when the campaign becomes active. |  [optional]
**campaignEndTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time when the campaign becomes inactive. |  [optional]
**totalRevenue** | [**ApplicationCampaignAnalyticsTotalRevenue**](ApplicationCampaignAnalyticsTotalRevenue.md) |  |  [optional]
**sessionsCount** | [**ApplicationCampaignAnalyticsSessionsCount**](ApplicationCampaignAnalyticsSessionsCount.md) |  |  [optional]
**avgItemsPerSession** | [**ApplicationCampaignAnalyticsAvgItemsPerSession**](ApplicationCampaignAnalyticsAvgItemsPerSession.md) |  |  [optional]
**avgSessionValue** | [**ApplicationCampaignAnalyticsAvgSessionValue**](ApplicationCampaignAnalyticsAvgSessionValue.md) |  |  [optional]
**totalDiscounts** | [**ApplicationCampaignAnalyticsTotalDiscounts**](ApplicationCampaignAnalyticsTotalDiscounts.md) |  |  [optional]
**couponsCount** | [**ApplicationCampaignAnalyticsCouponsCount**](ApplicationCampaignAnalyticsCouponsCount.md) |  |  [optional]



## Enum: CampaignStateEnum

Name | Value
---- | -----
ENABLED | &quot;enabled&quot;
DISABLED | &quot;disabled&quot;
ARCHIVED | &quot;archived&quot;



