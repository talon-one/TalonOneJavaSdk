

# NewExperiment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentType** | [**AssignmentTypeEnum**](#AssignmentTypeEnum) | Controls how customers are assigned to experiment variants. Either &#x60;assignmentType&#x60; or &#x60;isVariantAssignmentExternal&#x60; must be provided; &#x60;assignmentType&#x60; takes priority when both are present. - &#x60;random&#x60;: Talon.One assigns customers randomly based on variant weights. - &#x60;external&#x60;: Variant assignment is handled externally. - &#x60;audience&#x60;: Each variant targets a specific audience; customers are   assigned based on audience membership.  |  [optional]
**isVariantAssignmentExternal** | **Boolean** | Deprecated. Use &#x60;assignmentType&#x60; instead. Either &#x60;assignmentType&#x60; or &#x60;isVariantAssignmentExternal&#x60; must be provided. - false - The variant assignment is handled internally by Talon.One. - true - The variant assignment is handled externally.  |  [optional]
**campaign** | [**NewCampaign**](NewCampaign.md) |  | 
**goalType** | [**GoalTypeEnum**](#GoalTypeEnum) | The goal of the experiment. Determines which single metric is used to decide the winning variant. When set to &#x60;other&#x60;, multiple metrics are used.  | 
**goalDescription** | **String** | A description of the experiment goal. Provides context for the AI summary and helps it interpret the outcome of the experiment against the stated goal.  |  [optional]



## Enum: AssignmentTypeEnum

Name | Value
---- | -----
RANDOM | &quot;random&quot;
EXTERNAL | &quot;external&quot;
AUDIENCE | &quot;audience&quot;



## Enum: GoalTypeEnum

Name | Value
---- | -----
OTHER | &quot;other&quot;
MAXIMIZE_REVENUE | &quot;maximize_revenue&quot;
MAXIMIZE_ITEMS_SOLD | &quot;maximize_items_sold&quot;
OPTIMIZE_DISCOUNT_EFFICIENCY | &quot;optimize_discount_efficiency&quot;



