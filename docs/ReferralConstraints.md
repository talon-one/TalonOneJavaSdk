

# ReferralConstraints

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the referral code becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiry date of the referral code. Referral never expires if this is omitted, zero, or negative. |  [optional]
**usageLimit** | **Integer** | The number of times a referral code can be used. This can be set to 0 for no limit, but any campaign usage limits will still apply.  |  [optional]



