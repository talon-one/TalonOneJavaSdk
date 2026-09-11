

# GroupBlock

A structural combinator block that groups child blocks using a logical operator. Evaluates to true when its operator condition is satisfied across all child blocks.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | **String** | Identifies the block variant and determines which additional properties are present in it. | 
**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly]
**operator** | [**OperatorEnum**](#OperatorEnum) | Logical operator applied across child blocks. &#x60;all&#x60; requires every child to pass, &#x60;atLeastOne&#x60; requires at least one, &#x60;none&#x60; requires all to fail. | 
**blocks** | **List&lt;Object&gt;** | Child blocks evaluated according to the operator. | 
**onFailure** | **List&lt;Object&gt;** | Blocks evaluated when this block fails or returns false. |  [optional]
**onError** | [**Map&lt;String, List&lt;Object&gt;&gt;**](List.md) | Named error handlers evaluated when a specific error occurs. |  [optional]



## Enum: OperatorEnum

Name | Value
---- | -----
ALL | &quot;all&quot;
ATLEASTONE | &quot;atLeastOne&quot;
NONE | &quot;none&quot;



