

# CampaignTemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**userId** | **Integer** | The ID of the user associated with this entity. | 
**name** | **String** | The campaign template name. | 
**description** | **String** | Customer-facing text that explains the objective of the template. | 
**instructions** | **String** | Customer-facing text that explains how to use the template. For example, you can use this property to explain the available attributes of this template, and how they can be modified when a user uses this template to create a new campaign. | 
**campaignAttributes** | [**Object**](.md) | The campaign attributes that campaigns created from this template will have by default. |  [optional]
**couponAttributes** | [**Object**](.md) | The campaign attributes that coupons created from this template will have by default. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Only campaign templates in &#39;available&#39; state may be used to create campaigns. | 
**activeRulesetId** | **Integer** | The ID of the ruleset this campaign template will use. |  [optional]
**tags** | **List&lt;String&gt;** | A list of tags for the campaign template. |  [optional]
**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) | A list of features for the campaign template. |  [optional]
**couponSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**referralSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**limits** | [**List&lt;TemplateLimitConfig&gt;**](TemplateLimitConfig.md) | The set of limits that operate for this campaign template. |  [optional]
**templateParams** | [**List&lt;CampaignTemplateParams&gt;**](CampaignTemplateParams.md) | Fields which can be used to replace values in a rule. |  [optional]
**applicationsIds** | **List&lt;Integer&gt;** | A list of IDs of the Applications that are subscribed to this campaign template. | 
**campaignCollections** | [**List&lt;CampaignTemplateCollection&gt;**](CampaignTemplateCollection.md) | The campaign collections from the blueprint campaign for the template. |  [optional]
**defaultCampaignGroupId** | **Integer** | The default campaign group ID. |  [optional]
**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | The campaign type. Possible type values:   - &#x60;cartItem&#x60;: Type of campaign that can apply effects only to cart items.   - &#x60;advanced&#x60;: Type of campaign that can apply effects to customer sessions and cart items.  | 
**updated** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent update to the campaign template or any of its elements. |  [optional]
**updatedBy** | **String** | Name of the user who last updated this campaign template, if available. |  [optional]
**validApplicationIds** | **List&lt;Integer&gt;** | The IDs of the Applications that are related to this entity. | 



## Enum: StateEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
ENABLED | &quot;enabled&quot;
DISABLED | &quot;disabled&quot;



## Enum: List&lt;FeaturesEnum&gt;

Name | Value
---- | -----
COUPONS | &quot;coupons&quot;
REFERRALS | &quot;referrals&quot;
LOYALTY | &quot;loyalty&quot;
GIVEAWAYS | &quot;giveaways&quot;
STRIKETHROUGH | &quot;strikethrough&quot;
ACHIEVEMENTS | &quot;achievements&quot;



## Enum: CampaignTypeEnum

Name | Value
---- | -----
CARTITEM | &quot;cartItem&quot;
ADVANCED | &quot;advanced&quot;



