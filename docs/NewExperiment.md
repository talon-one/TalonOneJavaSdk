

# NewExperiment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isVariantAssignmentExternal** | **Boolean** | The source of the assignment. - false - The variant assignment is handled internally by Talon.One. - true - The variant assignment is handled externally.  | 
**campaign** | [**NewCampaign**](NewCampaign.md) |  | 
**goalType** | [**GoalTypeEnum**](#GoalTypeEnum) | The goal of the experiment. Determines which single metric is used to decide the winning variant. When set to &#x60;other&#x60;, multiple metrics are used.  | 
**goalDescription** | **String** | A description of the experiment goal. Provides context for the AI summary and helps it interpret the outcome of the experiment against the stated goal.  |  [optional]



## Enum: GoalTypeEnum

Name | Value
---- | -----
OTHER | &quot;other&quot;
MAXIMIZE_REVENUE | &quot;maximize_revenue&quot;
MAXIMIZE_ITEMS_SOLD | &quot;maximize_items_sold&quot;
OPTIMIZE_DISCOUNT_EFFICIENCY | &quot;optimize_discount_efficiency&quot;



