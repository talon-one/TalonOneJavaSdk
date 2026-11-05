

# RevisionVersion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique ID for this entity. Not to be confused with the Integration ID, which is set by your integration layer and used in most endpoints. | 
**accountId** | **Long** | The ID of the account that owns this entity. | 
**applicationId** | **Long** | The ID of the Application that owns this entity. | 
**campaignId** | **Long** | The ID of the campaign that the revision was created from. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the revision was created. | 
**createdBy** | **Long** | The ID of the user who created this revision. | 
**revisionId** | **Long** | The ID of the revision. | 
**version** | **Long** | Incrementing number representing how many revisions have been activated on this campaign. Starts from &#x60;0&#x60; for a new campaign.  | 
**name** | **String** | A user-facing name for this campaign. |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the campaign will become active. |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the campaign will become inactive. |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this campaign. |  [optional]
**description** | **String** | A detailed description of the campaign. |  [optional]
**activeRulesetId** | **Integer** | The ID of the ruleset this campaign will use. |  [optional]
**tags** | **List&lt;String&gt;** | A list of tags for the campaign. |  [optional]
**couponSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**referralSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**limits** | [**List&lt;LimitConfig&gt;**](LimitConfig.md) | The set of limits that will operate for this campaign version. |  [optional]
**reevaluateOnReturn** | **Boolean** | Indicates whether this campaign should be reevaluated when a customer returns an item. |  [optional]
**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) | A list of features for the campaign. |  [optional]
**couponAttributes** | [**Object**](.md) | Arbitrary properties associated with coupons in this campaign. |  [optional]



## Enum: List&lt;FeaturesEnum&gt;

Name | Value
---- | -----
COUPONS | &quot;coupons&quot;
REFERRALS | &quot;referrals&quot;
LOYALTY | &quot;loyalty&quot;
GIVEAWAYS | &quot;giveaways&quot;
STRIKETHROUGH | &quot;strikethrough&quot;
ACHIEVEMENTS | &quot;achievements&quot;
ADVANCEDEVENTS | &quot;advancedEvents&quot;



