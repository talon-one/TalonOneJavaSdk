

# LoyaltyBalanceWithTier

Point balance of a ledger in the Loyalty Program.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activePoints** | [**BigDecimal**](BigDecimal.md) | Total amount of points awarded to this customer and available to spend. |  [optional]
**pendingPoints** | [**BigDecimal**](BigDecimal.md) | Total amount of points awarded to this customer but not available until their start date. |  [optional]
**spentPoints** | [**BigDecimal**](BigDecimal.md) | Total amount of points already spent by this customer. |  [optional]
**expiredPoints** | [**BigDecimal**](BigDecimal.md) | Total amount of points awarded but never redeemed. They cannot be used anymore. |  [optional]
**currentTier** | [**Tier**](Tier.md) |  |  [optional]
**projectedTier** | [**ProjectedTier**](ProjectedTier.md) |  |  [optional]
**pointsToNextTier** | [**BigDecimal**](BigDecimal.md) | The number of points required to move up a tier. |  [optional]
**nextTierName** | **String** | The name of the tier consecutive to the current tier. |  [optional]



