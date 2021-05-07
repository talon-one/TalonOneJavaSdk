

# Campaign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**applicationId** | **Integer** | The ID of the application that owns this entity. | 
**userId** | **Integer** | The ID of the account that owns this entity. | 
**name** | **String** | A friendly name for this campaign. | 
**description** | **String** | A detailed description of the campaign. | 
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Datetime when the campaign will become active. |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | Datetime when the campaign will become in-active. |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this campaign |  [optional]
**state** | [**StateEnum**](#StateEnum) | A disabled or archived campaign is not evaluated for rules or coupons.  | 
**activeRulesetId** | **Integer** | ID of Ruleset this campaign applies on customer session evaluation. |  [optional]
**tags** | **List&lt;String&gt;** | A list of tags for the campaign. | 
**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) | A list of features for the campaign. | 
**couponSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**referralSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**limits** | [**List&lt;LimitConfig&gt;**](LimitConfig.md) | The set of limits that will operate for this campaign | 
**campaignGroups** | **List&lt;Integer&gt;** | The IDs of the campaign groups that own this entity. |  [optional]
**couponRedemptionCount** | **Integer** | Number of coupons redeemed in the campaign. |  [optional]
**referralRedemptionCount** | **Integer** | Number of referral codes redeemed in the campaign. |  [optional]
**discountCount** | [**BigDecimal**](BigDecimal.md) | Total amount of discounts redeemed in the campaign. |  [optional]
**discountEffectCount** | **Integer** | Total number of times discounts were redeemed in this campaign. |  [optional]
**couponCreationCount** | **Integer** | Total number of coupons created by rules in this campaign. |  [optional]
**referralCreationCount** | **Integer** | Total number of referrals created by rules in this campaign. |  [optional]
**awardedGiveawaysCount** | **Integer** | Total number of giveaways awarded by rules in this campaign. |  [optional]
**createdLoyaltyPointsCount** | [**BigDecimal**](BigDecimal.md) | Total number of loyalty points created by rules in this campaign. |  [optional]
**createdLoyaltyPointsEffectCount** | **Integer** | Total number of loyalty point creation effects triggered by rules in this campaign. |  [optional]
**redeemedLoyaltyPointsCount** | [**BigDecimal**](BigDecimal.md) | Total number of loyalty points redeemed by rules in this campaign. |  [optional]
**redeemedLoyaltyPointsEffectCount** | **Integer** | Total number of loyalty point redemption effects triggered by rules in this campaign. |  [optional]
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent event received by this campaign. |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent update to the campaign or any of its elements. |  [optional]
**createdBy** | **String** | Name of the user who created this campaign if available. |  [optional]
**updatedBy** | **String** | Name of the user who last updated this campaign if available. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
ENABLED | &quot;enabled&quot;
DISABLED | &quot;disabled&quot;
ARCHIVED | &quot;archived&quot;



## Enum: List&lt;FeaturesEnum&gt;

Name | Value
---- | -----
COUPONS | &quot;coupons&quot;
REFERRALS | &quot;referrals&quot;
LOYALTY | &quot;loyalty&quot;
GIVEAWAYS | &quot;giveaways&quot;



