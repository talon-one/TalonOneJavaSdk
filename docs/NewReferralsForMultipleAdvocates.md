

# NewReferralsForMultipleAdvocates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the referral code becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiration date of the referral code. Referral never expires if this is omitted. |  [optional]
**usageLimit** | **Long** | The number of times a referral code can be used. &#x60;0&#x60; means no limit but any campaign usage limits will still apply.  | 
**campaignId** | **Long** | The ID of the campaign from which the referral received the referral code. | 
**advocateProfileIntegrationIds** | **List&lt;String&gt;** | An array containing all the respective advocate profiles. | 
**attributes** | [**Object**](.md) | Arbitrary properties associated with this referral code. |  [optional]
**validCharacters** | **List&lt;String&gt;** | List of characters used to generate the random parts of a code. By default, the list of characters is equivalent to the &#x60;[A-Z, 0-9]&#x60; regular expression.  |  [optional]
**referralPattern** | **String** | The pattern used to generate referrals. The character &#x60;#&#x60; is a placeholder and is replaced by a random character from the &#x60;validCharacters&#x60; set.  |  [optional]



