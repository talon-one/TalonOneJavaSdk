

# RulesetV2

Ruleset in the V2 JSON block format.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Internal ID of this entity. |  [optional] [readonly]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. |  [optional] [readonly]
**userId** | **Long** | The ID of the user that created this ruleset. |  [optional] [readonly]
**campaignId** | **Long** | The ID of the campaign that owns this entity. |  [optional] [readonly]
**templateId** | **Long** | The ID of the campaign template that owns this entity. |  [optional] [readonly]
**activatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp indicating when this ruleset was activated. |  [optional] [readonly]
**promotionRules** | [**List&lt;RuleV2&gt;**](RuleV2.md) | Set of promotion rules. | 
**strikethroughRules** | [**List&lt;RuleV2&gt;**](RuleV2.md) | Set of strikethrough rules. |  [optional]
**selectors** | [**List&lt;Selector&gt;**](Selector.md) | Variable bindings of type selector. |  [optional] [readonly]
**bundles** | [**List&lt;Bundle&gt;**](Bundle.md) | Variable bindings of type bundle. |  [optional] [readonly]
**parameters** | [**List&lt;TemplateParameter&gt;**](TemplateParameter.md) | Variable bindings of type template parameter. |  [optional] [readonly]



