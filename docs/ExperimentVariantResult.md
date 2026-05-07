

# ExperimentVariantResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**variantId** | **Long** | The ID of the variant. |  [optional]
**variantName** | **String** | The name of the variant. |  [optional]
**variantWeight** | **Long** | The weight of the variant. |  [optional]
**isWinner** | **Boolean** | Calculated flag if the variant is the winner. |  [optional]
**totalRevenue** | [**BigDecimal**](BigDecimal.md) | The total, pre-discount value of all items purchased in a customer session. |  [optional]
**sessionsCount** | [**BigDecimal**](BigDecimal.md) | The number of all closed sessions. |  [optional]
**avgItemsPerSession** | [**BigDecimal**](BigDecimal.md) | The number of items from sessions divided by the number of sessions. |  [optional]
**avgSessionValue** | [**BigDecimal**](BigDecimal.md) | The average customer session value, calculated by dividing the revenue value by the number of sessions. |  [optional]
**avgDiscountedSessionValue** | [**BigDecimal**](BigDecimal.md) | The average customer session value, calculated by dividing the revenue value by the number of sessions. |  [optional]
**totalDiscounts** | [**BigDecimal**](BigDecimal.md) | The total value of discounts given for cart items in sessions. |  [optional]
**couponsCount** | [**BigDecimal**](BigDecimal.md) | The number of times a coupon was successfully redeemed in sessions. |  [optional]



