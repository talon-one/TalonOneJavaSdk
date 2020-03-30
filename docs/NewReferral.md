

# NewReferral

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **Integer** | ID of the campaign from which the referral received the referral code. | 
**advocateProfileIntegrationId** | **String** | The Integration Id of the Advocate&#39;s Profile | 
**friendProfileIntegrationId** | **String** | An optional Integration ID of the Friend&#39;s Profile |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the referral code becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiry date of the referral code. Referral never expires if this is omitted, zero, or negative. |  [optional]



