

# Campaign


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**applicationId** | **Integer** | The ID of the application that owns this entity. | 
**userId** | **Integer** | The ID of the user associated with this entity. | 
**name** | **String** | A user-facing name for this campaign. | 
**description** | **String** | A detailed description of the campaign. | 
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the campaign will become active. |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the campaign will become inactive. |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this campaign. |  [optional]
**state** | [**StateEnum**](#StateEnum) | A disabled or archived campaign is not evaluated for rules or coupons.  | 
**activeRulesetId** | **Integer** | [ID of Ruleset](https://docs.talon.one/management-api#operation/getRulesets) this campaign applies on customer session evaluation.  |  [optional]
**tags** | **List&lt;String&gt;** | A list of tags for the campaign. | 
**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) | The features enabled in this campaign. | 
**couponSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**referralSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**limits** | [**List&lt;LimitConfig&gt;**](LimitConfig.md) | The set of [budget limits](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets) for this campaign.  | 
**campaignGroups** | **List&lt;Integer&gt;** | The IDs of the [campaign groups](https://docs.talon.one/docs/product/account/managing-campaign-groups) this campaign belongs to.  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The campaign type. Possible type values:   - &#x60;cartItem&#x60;: Type of campaign that can apply effects only to cart items.   - &#x60;advanced&#x60;: Type of campaign that can apply effects to customer sessions and cart items.  | 
**linkedStoreIds** | **List&lt;Integer&gt;** | A list of store IDs that you want to link to the campaign.  **Note:** Campaigns with linked store IDs will only be evaluated when there is a [customer session update](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) that references a linked store.  |  [optional]
**budgets** | [**List&lt;CampaignBudget&gt;**](CampaignBudget.md) | A list of all the budgets that are defined by this campaign and their usage.  **Note:** Budgets that are not defined do not appear in this list and their usage is not counted until they are defined.  | 
**couponRedemptionCount** | **Integer** | This property is **deprecated**. The count should be available under *budgets* property. Number of coupons redeemed in the campaign.  |  [optional]
**referralRedemptionCount** | **Integer** | This property is **deprecated**. The count should be available under *budgets* property. Number of referral codes redeemed in the campaign.  |  [optional]
**discountCount** | [**BigDecimal**](BigDecimal.md) | This property is **deprecated**. The count should be available under *budgets* property. Total amount of discounts redeemed in the campaign.  |  [optional]
**discountEffectCount** | **Integer** | This property is **deprecated**. The count should be available under *budgets* property. Total number of times discounts were redeemed in this campaign.  |  [optional]
**couponCreationCount** | **Integer** | This property is **deprecated**. The count should be available under *budgets* property. Total number of coupons created by rules in this campaign.  |  [optional]
**customEffectCount** | **Integer** | This property is **deprecated**. The count should be available under *budgets* property. Total number of custom effects triggered by rules in this campaign.  |  [optional]
**referralCreationCount** | **Integer** | This property is **deprecated**. The count should be available under *budgets* property. Total number of referrals created by rules in this campaign.  |  [optional]
**addFreeItemEffectCount** | **Integer** | This property is **deprecated**. The count should be available under *budgets* property. Total number of times the [add free item effect](https://docs.talon.one/docs/dev/integration-api/api-effects#addfreeitem) can be triggered in this campaign.  |  [optional]
**awardedGiveawaysCount** | **Integer** | This property is **deprecated**. The count should be available under *budgets* property. Total number of giveaways awarded by rules in this campaign.  |  [optional]
**createdLoyaltyPointsCount** | [**BigDecimal**](BigDecimal.md) | This property is **deprecated**. The count should be available under *budgets* property. Total number of loyalty points created by rules in this campaign.  |  [optional]
**createdLoyaltyPointsEffectCount** | **Integer** | This property is **deprecated**. The count should be available under *budgets* property. Total number of loyalty point creation effects triggered by rules in this campaign.  |  [optional]
**redeemedLoyaltyPointsCount** | [**BigDecimal**](BigDecimal.md) | This property is **deprecated**. The count should be available under *budgets* property. Total number of loyalty points redeemed by rules in this campaign.  |  [optional]
**redeemedLoyaltyPointsEffectCount** | **Integer** | This property is **deprecated**. The count should be available under *budgets* property. Total number of loyalty point redemption effects triggered by rules in this campaign.  |  [optional]
**callApiEffectCount** | **Integer** | This property is **deprecated**. The count should be available under *budgets* property. Total number of webhooks triggered by rules in this campaign.  |  [optional]
**reservecouponEffectCount** | **Integer** | This property is **deprecated**. The count should be available under *budgets* property. Total number of reserve coupon effects triggered by rules in this campaign.  |  [optional]
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent event received by this campaign. |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent update to the campaign&#39;s property. Updates to external entities used in this campaign are **not** registered by this property, such as collection or coupon updates.  |  [optional]
**createdBy** | **String** | Name of the user who created this campaign if available. |  [optional]
**updatedBy** | **String** | Name of the user who last updated this campaign if available. |  [optional]
**templateId** | **Integer** | The ID of the Campaign Template this Campaign was created from. |  [optional]
**frontendState** | [**FrontendStateEnum**](#FrontendStateEnum) | A campaign state described exactly as in the Campaign Manager. | 
**storesImported** | **Boolean** | Indicates whether the linked stores were imported via a CSV file. | 
**activeRevisionId** | **Integer** | ID of the revision that was last activated on this campaign.  |  [optional]
**activeRevisionVersionId** | **Integer** | ID of the revision version that is active on the campaign.  |  [optional]
**version** | **Integer** | Incrementing number representing how many revisions have been activated on this campaign, starts from 0 for a new campaign.  |  [optional]
**currentRevisionId** | **Integer** | ID of the revision currently being modified for the campaign.  |  [optional]
**currentRevisionVersionId** | **Integer** | ID of the latest version applied on the current revision.  |  [optional]
**stageRevision** | **Boolean** | Flag for determining whether we use current revision when sending requests with staging API key.  |  [optional]



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



## Enum: FrontendStateEnum

Name | Value
---- | -----
EXPIRED | &quot;expired&quot;
SCHEDULED | &quot;scheduled&quot;
RUNNING | &quot;running&quot;
DISABLED | &quot;disabled&quot;
ARCHIVED | &quot;archived&quot;



