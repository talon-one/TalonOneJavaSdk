

# ExperimentCopyExperiment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentType** | [**AssignmentTypeEnum**](#AssignmentTypeEnum) | Controls how customers are assigned to experiment variants in the copied experiment. - &#x60;random&#x60;: Talon.One assigns customers randomly based on variant weights. - &#x60;external&#x60;: The variant assignment is handled externally. - &#x60;audience&#x60;: Each variant targets a specific audience; customers are assigned based on audience membership. This is the source of truth. When omitted, it is derived from the deprecated &#x60;isVariantAssignmentExternal&#x60; flag (&#x60;true&#x60; maps to &#x60;external&#x60;, otherwise &#x60;random&#x60;).  |  [optional]
**isVariantAssignmentExternal** | **Boolean** | The source of the assignment. - false - The variant assignment is handled internally by Talon.One. - true - The variant assignment is handled externally. Deprecated: use &#x60;assignmentType&#x60; instead. Kept for backwards compatibility with older clients; when set and &#x60;assignmentType&#x60; is omitted, &#x60;true&#x60; maps to &#x60;external&#x60;.  |  [optional]
**campaign** | [**ExperimentCampaignCopy**](ExperimentCampaignCopy.md) |  | 
**goalType** | [**GoalTypeEnum**](#GoalTypeEnum) | The goal of the experiment. Determines which single metric is used to decide the winning variant. When set to &#x60;other&#x60;, multiple metrics are used. If omitted, the value from the source experiment is used.  |  [optional]
**goalDescription** | **String** | A description of the experiment goal. Provides context for the AI summary and helps it interpret the outcome of the experiment against the stated goal. If omitted, the value from the source experiment is used.  |  [optional]



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



