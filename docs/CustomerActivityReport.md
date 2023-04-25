

# CustomerActivityReport

A summary report of customer activity for a given time range.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integrationId** | **String** | The integration ID set by your integration layer. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**name** | **String** | The name for this customer profile. | 
**customerId** | **Integer** | The internal Talon.One ID of the customer. | 
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) | The last activity of the customer. |  [optional]
**couponRedemptions** | **Integer** | Number of coupon redemptions in all customer campaigns. | 
**couponUseAttempts** | **Integer** | Number of coupon use attempts in all customer campaigns. | 
**couponFailedAttempts** | **Integer** | Number of failed coupon use attempts in all customer campaigns. | 
**accruedDiscounts** | [**BigDecimal**](BigDecimal.md) | Number of accrued discounts in all customer campaigns. | 
**accruedRevenue** | [**BigDecimal**](BigDecimal.md) | Amount of accrued revenue in all customer campaigns. | 
**totalOrders** | **Integer** | Number of orders in all customer campaigns. | 
**totalOrdersNoCoupon** | **Integer** | Number of orders without coupon used in all customer campaigns. | 
**campaignName** | **String** | The name of the campaign this customer belongs to. | 



