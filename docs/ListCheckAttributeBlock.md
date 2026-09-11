

# ListCheckAttributeBlock

Variant of `CheckAttributeBlock` for operators that test list membership against a set of values.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operator** | [**OperatorEnum**](#OperatorEnum) | The list membership operator applied to the attribute. |  [optional]
**values** | [**Object**](.md) | The set of values to match against. | 



## Enum: OperatorEnum

Name | Value
---- | -----
CONTAINSONEOF | &quot;containsOneOf&quot;
CONTAINSNONEOF | &quot;containsNoneOf&quot;
CONTAINSALLOF | &quot;containsAllOf&quot;



