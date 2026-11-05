

# Selector

A named pipeline of steps (filter, sort, map, etc.) that filters or transforms a list of cart items. Replaces `cartItemFilter` [bindings](https://docs.talon.one/management-api#tag/Campaigns/operation/getRuleset.responses.200.bindings) in V1 rulesets.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the selector binding. | 
**type** | [**TypeEnum**](#TypeEnum) | A binding of type &#x60;selector&#x60;. | 
**source** | **String** | The attribute path the pipeline draws items from. | 
**steps** | **List&lt;Object&gt;** | Ordered pipeline steps applied to the source items. | 



## Enum: TypeEnum

Name | Value
---- | -----
SELECTOR | &quot;selector&quot;



