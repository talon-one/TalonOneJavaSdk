

# ApplicationAnalyticsDataPoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the aggregation time frame in UTC. | 
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the aggregation time frame in UTC. | 
**totalRevenue** | [**AnalyticsDataPoint**](AnalyticsDataPoint.md) |  |  [optional]
**sessionsCount** | [**AnalyticsDataPoint**](AnalyticsDataPoint.md) |  |  [optional]
**avgItemsPerSession** | [**AnalyticsDataPoint**](AnalyticsDataPoint.md) |  |  [optional]
**avgSessionValue** | [**AnalyticsDataPoint**](AnalyticsDataPoint.md) |  |  [optional]
**totalDiscounts** | [**BigDecimal**](BigDecimal.md) | The total value of discounts given for cart items in influenced sessions. |  [optional]
**couponsCount** | [**BigDecimal**](BigDecimal.md) | The number of times a coupon was successfully redeemed in influenced sessions. |  [optional]



