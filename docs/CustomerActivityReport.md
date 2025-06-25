

# CustomerActivityReport

A summary report of customer activity for a given time range.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integrationId** | **String** | The integration ID set by your integration layer. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**name** | **String** | The name for this customer profile. | 
**customerId** | **Long** | The internal Talon.One ID of the customer. | 
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) | The last activity of the customer. |  [optional]
**couponRedemptions** | **Long** | Number of coupon redemptions in all customer campaigns. | 
**couponUseAttempts** | **Long** | Number of coupon use attempts in all customer campaigns. | 
**couponFailedAttempts** | **Long** | Number of failed coupon use attempts in all customer campaigns. | 
**accruedDiscounts** | [**BigDecimal**](BigDecimal.md) | Number of accrued discounts in all customer campaigns. | 
**accruedRevenue** | [**BigDecimal**](BigDecimal.md) | Amount of accrued revenue in all customer campaigns. | 
**totalOrders** | **Long** | Number of orders in all customer campaigns. | 
**totalOrdersNoCoupon** | **Long** | Number of orders without coupon used in all customer campaigns. | 
**campaignName** | **String** | The name of the campaign this customer belongs to. | 



