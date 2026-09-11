

# BetweenCheckAttributeBlock

Variant of `CheckAttributeBlock` for the `between` operator, which requires both a minimum and maximum value.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operator** | [**OperatorEnum**](#OperatorEnum) | The range comparison operator. Must be &#x60;between&#x60;. |  [optional]
**min** | [**Object**](.md) | The minimum value allowed for the &#x60;between&#x60; operator. | 
**max** | [**Object**](.md) | The maximum value allowed for the &#x60;between&#x60; operator. | 



## Enum: OperatorEnum

Name | Value
---- | -----
BETWEEN | &quot;between&quot;



