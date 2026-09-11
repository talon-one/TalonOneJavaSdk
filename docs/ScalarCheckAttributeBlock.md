

# ScalarCheckAttributeBlock

Variant of `CheckAttributeBlock` for operators that compare an attribute against a single value.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operator** | [**OperatorEnum**](#OperatorEnum) | The comparison operator applied to the attribute. |  [optional]
**value** | [**Object**](.md) | The comparison value for this operator. | 



## Enum: OperatorEnum

Name | Value
---- | -----
EQUALS | &quot;equals&quot;
NOT_EQUALS_ | &quot;not(equals)&quot;
LESSTHAN | &quot;lessThan&quot;
LESSTHANOREQUAL | &quot;lessThanOrEqual&quot;
GREATERTHAN | &quot;greaterThan&quot;
GREATERTHANOREQUAL | &quot;greaterThanOrEqual&quot;
CONTAINS | &quot;contains&quot;
NOT_CONTAINS_ | &quot;not(contains)&quot;
MATCHESREGEXP | &quot;matchesRegexp&quot;
STARTSWITH | &quot;startsWith&quot;
ENDSWITH | &quot;endsWith&quot;
ONEOF | &quot;oneOf&quot;
NOT_ONEOF_ | &quot;not(oneOf)&quot;
INCOLLECTION | &quot;inCollection&quot;
NOT_INCOLLECTION_ | &quot;not(inCollection)&quot;
AFTER | &quot;after&quot;
BEFORE | &quot;before&quot;



