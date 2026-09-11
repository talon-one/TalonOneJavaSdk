

# UpdateAttributeValueBlock

A block that sets or updates an attribute. The `type` may be empty for [built-in attributes](https://docs.talon.one/docs/dev/concepts/attributes).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | **String** | Identifies the block variant and determines which additional properties are present in it. | 
**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly]
**operator** | [**OperatorEnum**](#OperatorEnum) | The update operation applied to the attribute. | 
**attribute** | [**UpdateAttributeValueBlockAttribute**](UpdateAttributeValueBlockAttribute.md) |  | 
**value** | [**Object**](.md) | The value of the attribute. Omitted when operator is set to &#x60;toggle&#x60;. |  [optional]
**target** | [**UpdateAttributeValueBlockTarget**](UpdateAttributeValueBlockTarget.md) |  | 



## Enum: OperatorEnum

Name | Value
---- | -----
SETTO | &quot;setTo&quot;
INCREASEBY | &quot;increaseBy&quot;
DECREASEBY | &quot;decreaseBy&quot;
MULTIPLYBY | &quot;multiplyBy&quot;
DIVIDEBY | &quot;divideBy&quot;
TOGGLE | &quot;toggle&quot;
LATERBY | &quot;laterBy&quot;
EARLIERBY | &quot;earlierBy&quot;



