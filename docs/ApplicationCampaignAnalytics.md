

# ApplicationCampaignAnalytics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the aggregation time frame in UTC. | 
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the aggregation time frame in UTC. | 
**campaignId** | **Integer** | The ID of the campaign. | 
**campaignName** | **String** | The name of the campaign. | 
**campaignTags** | **List&lt;String&gt;** | A list of tags for the campaign. | 
**campaignState** | [**CampaignStateEnum**](#CampaignStateEnum) | The state of the campaign.  **Note:** A disabled or archived campaign is not evaluated for rules or coupons.  | 
**totalRevenue** | [**AnalyticsDataPointWithTrendAndInfluencedRate**](AnalyticsDataPointWithTrendAndInfluencedRate.md) |  |  [optional]
**sessionsCount** | [**AnalyticsDataPointWithTrendAndInfluencedRate**](AnalyticsDataPointWithTrendAndInfluencedRate.md) |  |  [optional]
**avgItemsPerSession** | [**AnalyticsDataPointWithTrendAndUplift**](AnalyticsDataPointWithTrendAndUplift.md) |  |  [optional]
**avgSessionValue** | [**AnalyticsDataPointWithTrendAndUplift**](AnalyticsDataPointWithTrendAndUplift.md) |  |  [optional]
**totalDiscounts** | [**AnalyticsDataPointWithTrend**](AnalyticsDataPointWithTrend.md) |  |  [optional]
**couponsCount** | [**AnalyticsDataPointWithTrend**](AnalyticsDataPointWithTrend.md) |  |  [optional]



## Enum: CampaignStateEnum

Name | Value
---- | -----
EXPIRED | &quot;expired&quot;
SCHEDULED | &quot;scheduled&quot;
RUNNING | &quot;running&quot;
DISABLED | &quot;disabled&quot;
ARCHIVED | &quot;archived&quot;
STAGED | &quot;staged&quot;



