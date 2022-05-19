

# NewCouponCreationJob


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usageLimit** | **Integer** | The number of times the coupon code can be redeemed. &#x60;0&#x60; means unlimited redemptions but any campaign usage limits will still apply.  | 
**discountLimit** | [**BigDecimal**](BigDecimal.md) | The amount of discounts that can be given with this coupon code.  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the coupon becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiry date of the coupon. Coupon never expires if this is omitted, zero, or negative. |  [optional]
**numberOfCoupons** | **Integer** | The number of new coupon codes to generate for the campaign. Must be between 20,001 and 5,000,000. | 
**couponSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with coupons | 



