

# UnaryCheckAttributeBlock

Variant of `CheckAttributeBlock` for operators that test a property of the attribute itself with no comparison value.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operator** | [**OperatorEnum**](#OperatorEnum) | The unary operator applied to the attribute. These operators require no comparison value. |  [optional]



## Enum: OperatorEnum

Name | Value
---- | -----
EMPTY | &quot;empty&quot;
NOT_EMPTY_ | &quot;not(empty)&quot;
EXISTS | &quot;exists&quot;
NOT_EXISTS_ | &quot;not(exists)&quot;
ISTRUE | &quot;isTrue&quot;
ISFALSE | &quot;isFalse&quot;



