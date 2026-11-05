

# LocationCheckAttributeBlock

A block variant of `CheckAttributeBlock` for operators that check whether a geographical location is inside a set of geometric areas.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operator** | [**OperatorEnum**](#OperatorEnum) | The location membership operator applied to the attribute. |  [optional]
**values** | [**Object**](.md) | The geometric areas to check the location against. | 



## Enum: OperatorEnum

Name | Value
---- | -----
IN | &quot;in&quot;
NOT_IN_ | &quot;not(in)&quot;



