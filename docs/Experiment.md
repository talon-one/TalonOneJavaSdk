

# Experiment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**applicationId** | **Long** | The ID of the Application that owns this entity. | 
**assignmentType** | [**AssignmentTypeEnum**](#AssignmentTypeEnum) | Controls how customers are assigned to experiment variants. - &#x60;random&#x60;: Talon.One assigns customers randomly based on variant weights. - &#x60;external&#x60;: Variant assignment is handled externally. - &#x60;audience&#x60;: Each variant targets a specific audience; customers are assigned based on audience membership.  |  [optional]
**isVariantAssignmentExternal** | **Boolean** | Deprecated. Use &#x60;assignmentType&#x60; instead. - false - The variant assignment is handled internally by Talon.One. - true - The variant assignment is handled externally.  |  [optional]
**campaign** | [**Campaign**](Campaign.md) |  |  [optional]
**activated** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the experiment was activated.  |  [optional]
**state** | [**StateEnum**](#StateEnum) | A disabled experiment is not evaluated for rules or coupons.  | 
**variants** | [**List&lt;ExperimentVariant&gt;**](ExperimentVariant.md) |  |  [optional]
**goalType** | [**GoalTypeEnum**](#GoalTypeEnum) | The goal of the experiment. Determines which single metric is used to decide the winning variant. When set to &#x60;other&#x60;, multiple metrics are used.  | 
**goalDescription** | **String** | A description of the experiment goal. Provides context for the AI summary and helps it interpret the outcome of the experiment against the stated goal.  |  [optional]
**deletedat** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the experiment was deleted.  |  [optional]



## Enum: AssignmentTypeEnum

Name | Value
---- | -----
RANDOM | &quot;random&quot;
EXTERNAL | &quot;external&quot;
AUDIENCE | &quot;audience&quot;



## Enum: StateEnum

Name | Value
---- | -----
ENABLED | &quot;enabled&quot;
DISABLED | &quot;disabled&quot;
ARCHIVED | &quot;archived&quot;



## Enum: GoalTypeEnum

Name | Value
---- | -----
OTHER | &quot;other&quot;
MAXIMIZE_REVENUE | &quot;maximize_revenue&quot;
OPTIMIZE_DISCOUNT_EFFICIENCY | &quot;optimize_discount_efficiency&quot;
MAXIMIZE_ITEMS_SOLD | &quot;maximize_items_sold&quot;



