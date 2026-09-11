

# Bundle

A named bundle definition consisting of selector sources with matching constraints. Replaces `bundle` [bindings](https://docs.talon.one/management-api#tag/Campaigns/operation/getRuleset.responses.200.bindings) in V1 rulesets.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | An identifier derived from the bundle content. | 
**name** | **String** | The name of the bundle. | 
**type** | [**TypeEnum**](#TypeEnum) | A binding of type &#x60;bundle&#x60;. | 
**sources** | **List&lt;String&gt;** | The selector sources of bundle items. Each source is expressed as a &#x60;{{$selectorName}}&#x60; reference. | 
**counts** | **List&lt;Long&gt;** | The number of items to retrieve from each corresponding source in &#x60;sources&#x60;. | 
**matchers** | **List&lt;String&gt;** | Attribute names that the bundled items must share. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
BUNDLE | &quot;bundle&quot;



