

# NewReferral

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the referral code becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiry date of the referral code. Referral never expires if this is omitted, zero, or negative. |  [optional]
**usageLimit** | **Integer** | The number of times a referral code can be used. This can be set to 0 for no limit, but any campaign usage limits will still apply.  |  [optional]
**campaignId** | **Integer** | ID of the campaign from which the referral received the referral code. | 
**advocateProfileIntegrationId** | **String** | The Integration ID of the Advocate&#39;s Profile. | 
**friendProfileIntegrationId** | **String** | An optional Integration ID of the Friend&#39;s Profile |  [optional]
**attributes** | **Map&lt;String, Object&gt;** | Arbitrary properties associated with this item. |  [optional]



