

# RejectReferralEffectProps

The properties specific to the \"rejectReferral\" effect. This gets triggered whenever the referral code was rejected. See rejectionReason for more info on why.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The referral code that was rejected. | 
**rejectionReason** | **String** | The reason why this referral code was rejected. | 
**conditionIndex** | **Long** | The index of the condition that caused the rejection of the referral. |  [optional]
**effectIndex** | **Long** | The index of the effect that caused the rejection of the referral. |  [optional]
**details** | **String** | More details about the failure. |  [optional]
**campaignExclusionReason** | **String** | The reason why the campaign was not applied. |  [optional]



