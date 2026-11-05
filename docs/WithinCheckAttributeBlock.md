

# WithinCheckAttributeBlock

Variant of `CheckAttributeBlock` for the `within` and `not(within)` operators, which require both a start and end value.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operator** | [**OperatorEnum**](#OperatorEnum) | The range comparison operator. Must be &#x60;within&#x60; or &#x60;not(within)&#x60;. |  [optional]
**start** | [**Object**](.md) | The start value for the &#x60;within&#x60; operator. | 
**end** | [**Object**](.md) | The end value for the &#x60;within&#x60; operator. | 
**startInclusive** | **Boolean** | When &#x60;true&#x60;, the &#x60;start&#x60; value is included in the range for the &#x60;within&#x60; operator. |  [optional]
**endInclusive** | **Boolean** | When &#x60;true&#x60;, the &#x60;end&#x60; value is included in the range for the &#x60;within&#x60; operator. |  [optional]
**timezoneInsensitive** | **Boolean** | Indicates whether the &#x60;within&#x60; operator ignores time zones and compares the wall-clock time only. When &#x60;false&#x60;, time zones are taken into account. |  [optional]



## Enum: OperatorEnum

Name | Value
---- | -----
WITHIN | &quot;within&quot;
NOT_WITHIN_ | &quot;not(within)&quot;



