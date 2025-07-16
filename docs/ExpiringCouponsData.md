

# ExpiringCouponsData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**couponValue** | **String** | The coupon code. | 
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the coupon was created. |  [optional]
**validFrom** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the coupon becomes valid. |  [optional]
**validUntil** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the coupon expires. Coupon never expires if this is omitted, zero, or negative. |  [optional]
**campaignId** | **Long** | The ID of the campaign to which the coupon belongs. | 
**customerProfileId** | **String** | The Integration ID of the customer that is allowed to redeem this coupon. |  [optional]
**usageLimit** | **Long** | The number of times the coupon code can be redeemed. &#x60;0&#x60; means unlimited redemptions but any campaign usage limits will still apply.  | 
**usageCounter** | **Long** | The number of times the coupon has been successfully redeemed. | 
**batchId** | **String** | The ID of the batch the coupon belongs to. |  [optional]
**attributes** | [**Object**](.md) | Custom attributes associated with this coupon. | 



