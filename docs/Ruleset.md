

# Ruleset


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**userId** | **Integer** | The ID of the account that owns this entity. | 
**rules** | [**List&lt;Rule&gt;**](Rule.md) | Set of rules to apply. | 
**bindings** | [**List&lt;Binding&gt;**](Binding.md) | An array that provides objects with variable names (name) and talang expressions to whose result they are bound (expression) during rule evaluation. The order of the evaluation is decided by the position in the array. | 
**rbVersion** | **String** | The version of the rulebuilder used to create this ruleset. |  [optional]
**activate** | **Boolean** | Indicates whether this created ruleset should be activated for the campaign that owns it. |  [optional]
**campaignId** | **Integer** | The ID of the campaign that owns this entity. |  [optional]
**templateId** | **Integer** | The ID of the campaign template that owns this entity. |  [optional]
**activatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp indicating when this Ruleset was activated. |  [optional]



