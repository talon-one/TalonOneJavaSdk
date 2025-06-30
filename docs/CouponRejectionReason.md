

# CouponRejectionReason

Holds a reference to the campaign, the coupon and the reason for which that coupon was rejected. Should only be present when there is a 'rejectCoupon' effect.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **Integer** |  | 
**couponId** | **Integer** |  | 
**reason** | [**ReasonEnum**](#ReasonEnum) |  | 



## Enum: ReasonEnum

Name | Value
---- | -----
COUPONNOTFOUND | &quot;CouponNotFound&quot;
COUPONPARTOFNOTRUNNINGCAMPAIGN | &quot;CouponPartOfNotRunningCampaign&quot;
CAMPAIGNLIMITREACHED | &quot;CampaignLimitReached&quot;
PROFILELIMITREACHED | &quot;ProfileLimitReached&quot;
COUPONRECIPIENTDOESNOTMATCH | &quot;CouponRecipientDoesNotMatch&quot;
COUPONEXPIRED | &quot;CouponExpired&quot;
COUPONSTARTDATEINFUTURE | &quot;CouponStartDateInFuture&quot;
COUPONREJECTEDBYCONDITION | &quot;CouponRejectedByCondition&quot;
EFFECTCOULDNOTBEAPPLIED | &quot;EffectCouldNotBeApplied&quot;
COUPONPARTOFNOTTRIGGEREDCAMPAIGN | &quot;CouponPartOfNotTriggeredCampaign&quot;
COUPONRESERVATIONREQUIRED | &quot;CouponReservationRequired&quot;
PROFILEREQUIRED | &quot;ProfileRequired&quot;



