

# LedgerInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentBalance** | [**BigDecimal**](BigDecimal.md) | Sum of currently active points | 
**pendingBalance** | [**BigDecimal**](BigDecimal.md) | Sum of pending points | 
**expiredBalance** | [**BigDecimal**](BigDecimal.md) | Sum of expired points | 
**spentBalance** | [**BigDecimal**](BigDecimal.md) | Sum of spent points | 
**tentativeCurrentBalance** | [**BigDecimal**](BigDecimal.md) | Sum of currently active points, including points added and deducted in open sessions | 
**currentTier** | [**Tier**](Tier.md) |  |  [optional]
**pointsToNextTier** | [**BigDecimal**](BigDecimal.md) | Points required to move up a tier. |  [optional]
**projection** | [**LoyaltyProjection**](LoyaltyProjection.md) |  |  [optional]



