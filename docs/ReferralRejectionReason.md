

# ReferralRejectionReason

Holds a reference to the campaign, the referral and the reason for which that referral was rejected. Should only be present when there is a 'rejectReferral' effect.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **Integer** |  | 
**referralId** | **Integer** |  | 
**reason** | [**ReasonEnum**](#ReasonEnum) |  | 



## Enum: ReasonEnum

Name | Value
---- | -----
REFERRALNOTFOUND | &quot;ReferralNotFound&quot;
REFERRALRECIPIENTIDSAMEASADVOCATE | &quot;ReferralRecipientIdSameAsAdvocate&quot;
REFERRALPARTOFNOTRUNNINGCAMPAIGN | &quot;ReferralPartOfNotRunningCampaign&quot;
REFERRALVALIDCONDITIONMISSING | &quot;ReferralValidConditionMissing&quot;
REFERRALLIMITREACHED | &quot;ReferralLimitReached&quot;
CAMPAIGNLIMITREACHED | &quot;CampaignLimitReached&quot;
PROFILELIMITREACHED | &quot;ProfileLimitReached&quot;
REFERRALRECIPIENTDOESNOTMATCH | &quot;ReferralRecipientDoesNotMatch&quot;
REFERRALEXPIRED | &quot;ReferralExpired&quot;
REFERRALSTARTDATEINFUTURE | &quot;ReferralStartDateInFuture&quot;
REFERRALREJECTEDBYCONDITION | &quot;ReferralRejectedByCondition&quot;
EFFECTCOULDNOTBEAPPLIED | &quot;EffectCouldNotBeApplied&quot;



