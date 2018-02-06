
# CampaignAnalytics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**campaignId** | **Integer** | The ID of the campaign that owns this entity. | 
**couponRevenue** | [**BigDecimal**](BigDecimal.md) | Amount of revenue from campaign with coupons. | 
**couponDiscountCosts** | [**BigDecimal**](BigDecimal.md) | Amount of cost caused by discounts given in the campaign with sessions involving coupons. | 
**couponsCount** | **Integer** | Number of coupons in the campaign. | 
**couponRedemptions** | **Integer** | Number of redemptions in the campaign. | 
**campaignRedemptionLimit** | **Integer** | Limit on overall redemptions in the campaign. | 
**couponRedemptionLimit** | **Integer** | Possible redemptions calculated over all coupons. | 
**couponRedemptionsRemaining** | **Integer** | Number of redemptions remaining on the coupon level in the campaign. | 
**campaignRedemptionsRemaining** | **Integer** | Hard limit of redemptions remaining on the campaign level. | 
**revenuePerRedemption** | [**BigDecimal**](BigDecimal.md) | Composite to describe coupon performance. | 
**unlimitedCoupons** | **Integer** | Number of unlimited coupons in the campaign. | 



