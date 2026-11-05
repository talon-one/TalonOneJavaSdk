

# CampaignEligibility

A list of campaigns and their evaluation status for the current customer session.  For experiment campaigns, the experiment and variant assigned to the customer profile are returned through the `experiment` field. Customer profiles with no variant assignment are not included.  **Note**:  - This response can **only** be included if the `dry` parameter in the query is set to `true`.  - Do not include `triggeredCampaigns` or `ruleFailureReasons` in `responseContent` to avoid duplicate results. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationId** | **Long** | The ID of the Application that owns this entity. | 
**id** | **Long** | Unique ID of Campaign. | 
**name** | **String** | The name of the campaign. | 
**description** | **String** | A detailed description of the campaign. |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the campaign will become active. |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the campaign will become inactive. |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this campaign. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the campaign.  | 
**tags** | **List&lt;String&gt;** | A list of tags for the campaign. | 
**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) | The features enabled in this campaign. | 
**eligibility** | [**List&lt;CampaignEligibilityDetails&gt;**](CampaignEligibilityDetails.md) | The customer&#39;s eligibility for each campaign in the current customer session. | 
**rules** | [**List&lt;RuleMetadataEligibility&gt;**](RuleMetadataEligibility.md) | A list of rules containing customer-facing details of the rewards defined in the campaign. | 
**experiment** | [**CampaignEligibilityExperiment**](CampaignEligibilityExperiment.md) |  |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
ENABLED | &quot;enabled&quot;



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



