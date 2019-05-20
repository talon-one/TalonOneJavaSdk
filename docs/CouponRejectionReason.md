
# CouponRejectionReason

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **Integer** |  | 
**couponId** | **Integer** |  | 
**reason** | [**ReasonEnum**](#ReasonEnum) |  | 


<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
COUPONNOTFOUND | &quot;CouponNotFound&quot;
COUPONPARTOFNOTRUNNINGCAMPAIGN | &quot;CouponPartOfNotRunningCampaign&quot;
COUPONLIMITREACHED | &quot;CouponLimitReached&quot;
COUPONRECIPIENTDOESNOTMATCH | &quot;CouponRecipientDoesNotMatch&quot;
COUPONEXPIRED | &quot;CouponExpired&quot;
COUPONSTARTDATEINFUTURE | &quot;CouponStartDateInFuture&quot;
COUPONREJECTEDBYCONDITION | &quot;CouponRejectedByCondition&quot;



