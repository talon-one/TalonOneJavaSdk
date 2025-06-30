

# RejectCouponEffectProps

The properties specific to the \"rejectCoupon\" effect. This gets triggered whenever the coupon was rejected. See rejectionReason for more info on why.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The coupon code that was rejected. | 
**rejectionReason** | **String** | The reason why this coupon was rejected. | 
**conditionIndex** | **Integer** | The index of the condition that caused the rejection of the coupon. |  [optional]
**effectIndex** | **Integer** | The index of the effect that caused the rejection of the coupon. |  [optional]
**details** | **String** | More details about the failure. |  [optional]
**campaignExclusionReason** | **String** | The reason why the campaign was not applied. |  [optional]



