

# BaseCampaign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A user-facing name for this campaign. | 
**description** | **String** | A detailed description of the campaign. |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the campaign will become active. |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the campaign will become inactive. |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this campaign. |  [optional]
**state** | [**StateEnum**](#StateEnum) | A disabled or archived campaign is not evaluated for rules or coupons.  | 
**activeRulesetId** | **Long** | [ID of Ruleset](https://docs.talon.one/management-api#operation/getRulesets) this campaign applies on customer session evaluation.  |  [optional]
**tags** | **List&lt;String&gt;** | A list of tags for the campaign. | 
**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) | The features enabled in this campaign. | 
**couponSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**referralSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**limits** | [**List&lt;LimitConfig&gt;**](LimitConfig.md) | The set of [budget limits](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets) for this campaign.  | 
**campaignGroups** | **List&lt;Long&gt;** | The IDs of the [campaign groups](https://docs.talon.one/docs/product/account/managing-campaign-groups) this campaign belongs to.  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The campaign type. Possible type values:   - &#x60;cartItem&#x60;: Type of campaign that can apply effects only to cart items.   - &#x60;advanced&#x60;: Type of campaign that can apply effects to customer sessions and cart items.  |  [optional]
**linkedStoreIds** | **List&lt;Long&gt;** | A list of store IDs that you want to link to the campaign.  **Note:** Campaigns with linked store IDs will only be evaluated when there is a [customer session update](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) that references a linked store.  |  [optional]



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
STRIKETHROUGH | &quot;strikethrough&quot;
ACHIEVEMENTS | &quot;achievements&quot;



## Enum: TypeEnum

Name | Value
---- | -----
CARTITEM | &quot;cartItem&quot;
ADVANCED | &quot;advanced&quot;



