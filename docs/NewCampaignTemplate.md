

# NewCampaignTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The campaign template name. | 
**description** | **String** | Customer-facing text that explains the objective of the template. | 
**instructions** | **String** | Customer-facing text that explains how to use the template. For example, you can use this property to explain the available attributes of this template, and how they can be modified when a user uses this template to create a new campaign. | 
**campaignAttributes** | [**Object**](.md) | The Campaign Attributes that Campaigns created from this template will have by default. |  [optional]
**couponAttributes** | [**Object**](.md) | The Campaign Attributes that Coupons created from this template will have by default. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Only Campaign Templates in &#39;available&#39; state may be used to create Campaigns. | 
**tags** | **List&lt;String&gt;** | A list of tags for the campaign template. |  [optional]
**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) | A list of features for the campaign template. |  [optional]
**couponSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**referralSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**limits** | [**List&lt;TemplateLimitConfig&gt;**](TemplateLimitConfig.md) | The set of limits that will operate for this campaign template |  [optional]
**templateParams** | [**List&lt;CampaignTemplateParams&gt;**](CampaignTemplateParams.md) | Template parameters are fields which can be used to replace values in a rule. |  [optional]
**campaignCollections** | [**List&lt;CampaignTemplateCollection&gt;**](CampaignTemplateCollection.md) | The campaign collections from the blueprint campaign for the template. |  [optional]



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



