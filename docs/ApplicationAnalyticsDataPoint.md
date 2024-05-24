

# ApplicationAnalyticsDataPoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the aggregation time frame in UTC. |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the aggregation time frame in UTC. |  [optional]
**totalRevenue** | [**ApplicationAnalyticsDataPointTotalRevenue**](ApplicationAnalyticsDataPointTotalRevenue.md) |  |  [optional]
**sessionsCount** | [**ApplicationAnalyticsDataPointSessionsCount**](ApplicationAnalyticsDataPointSessionsCount.md) |  |  [optional]
**avgItemsPerSession** | [**ApplicationAnalyticsDataPointAvgItemsPerSession**](ApplicationAnalyticsDataPointAvgItemsPerSession.md) |  |  [optional]
**avgSessionValue** | [**ApplicationAnalyticsDataPointAvgSessionValue**](ApplicationAnalyticsDataPointAvgSessionValue.md) |  |  [optional]
**totalDiscounts** | [**BigDecimal**](BigDecimal.md) | The total value of discounts given for cart items in influenced sessions. |  [optional]
**couponsCount** | [**BigDecimal**](BigDecimal.md) | The number of times a coupon was successfully redeemed in influenced sessions. |  [optional]



