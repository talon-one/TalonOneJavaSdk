

# Referral


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the referral code becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiry date of the referral code. Referral never expires if this is omitted, zero, or negative. |  [optional]
**usageLimit** | **Integer** | The number of times a referral code can be used. This can be set to 0 for no limit, but any campaign usage limits will still apply.  | 
**campaignId** | **Integer** | ID of the campaign from which the referral received the referral code. | 
**advocateProfileIntegrationId** | **String** | The Integration ID of the Advocate&#39;s Profile. | 
**friendProfileIntegrationId** | **String** | An optional Integration ID of the Friend&#39;s Profile |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this item. |  [optional]
**importId** | **Integer** | The ID of the Import which created this referral. |  [optional]
**code** | **String** | The actual referral code. | 
**usageCounter** | **Integer** | The number of times this referral code has been successfully used. | 
**batchId** | **String** | The ID of the batch the referrals belong to. |  [optional]



