

# ListWithCountCheckAttributeBlock

Variant of `CheckAttributeBlock` for operators that test list membership with a minimum or exact count threshold.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operator** | [**OperatorEnum**](#OperatorEnum) | The list membership operator with a count threshold applied to the attribute. |  [optional]
**values** | [**Object**](.md) | The set of values to match against. | 
**count** | [**Object**](.md) | The count threshold for this operator. | 



## Enum: OperatorEnum

Name | Value
---- | -----
CONTAINSATLEAST | &quot;containsAtLeast&quot;
CONTAINSEXACTLY | &quot;containsExactly&quot;



