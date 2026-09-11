

# ReduceSelectorStep

Aggregates items into a single value.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | A step discriminator of type &#x60;reduce&#x60;. | 
**operator** | [**OperatorEnum**](#OperatorEnum) | The aggregation operator applied to the items produced by the preceding step: - &#x60;max&#x60;, &#x60;min&#x60;, and &#x60;sum&#x60; operate on numeric values. - &#x60;count&#x60; returns the number of items. - &#x60;empty&#x60; reports whether the list is empty.  | 



## Enum: TypeEnum

Name | Value
---- | -----
REDUCE | &quot;reduce&quot;



## Enum: OperatorEnum

Name | Value
---- | -----
MAX | &quot;max&quot;
MIN | &quot;min&quot;
SUM | &quot;sum&quot;
COUNT | &quot;count&quot;
EMPTY | &quot;empty&quot;



