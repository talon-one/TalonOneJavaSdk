

# NewRevisionVersion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A user-facing name for this campaign. |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the campaign will become active. |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the campaign will become inactive. |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this campaign. |  [optional]
**description** | **String** | A detailed description of the campaign. |  [optional]
**activeRulesetId** | **Integer** | The ID of the ruleset this campaign template will use. |  [optional]
**tags** | **List&lt;String&gt;** | A list of tags for the campaign template. |  [optional]
**couponSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**referralSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**limits** | [**List&lt;LimitConfig&gt;**](LimitConfig.md) | The set of limits that will operate for this campaign version. |  [optional]
**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) | A list of features for the campaign template. |  [optional]



## Enum: List&lt;FeaturesEnum&gt;

Name | Value
---- | -----
COUPONS | &quot;coupons&quot;
REFERRALS | &quot;referrals&quot;
LOYALTY | &quot;loyalty&quot;
GIVEAWAYS | &quot;giveaways&quot;
STRIKETHROUGH | &quot;strikethrough&quot;
ACHIEVEMENTS | &quot;achievements&quot;



