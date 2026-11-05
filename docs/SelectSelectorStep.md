

# SelectSelectorStep

Picks a subset of the items by count, range, or exact position. The `operator` determines which additional fields are required: - `many` selects items from `from` (`start` or `end`) and is limited by `count`. - `between` selects items between integer indices `from` and `to`. - `one` selects the single item at `index`.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | A step discriminator of type &#x60;select&#x60;. | 
**operator** | [**OperatorEnum**](#OperatorEnum) | The selection operator applied to the items. | 
**from** | [**Object**](.md) | The starting value of the selection. For the &#x60;many&#x60; operator this is the string &#x60;start&#x60; or &#x60;end&#x60;; for the &#x60;between&#x60; operator this is an integer start index. No discriminator is needed since the string and integer branches are distinguishable by JSON type alone. |  [optional]
**to** | **Integer** | The end index for the &#x60;between&#x60; operator. The item at this index is not included. |  [optional]
**count** | **Integer** | The maximum number of items to select for the &#x60;many&#x60; operator. |  [optional]
**index** | **Integer** | The exact position of the item to select for the &#x60;one&#x60; operator. |  [optional]
**partial** | **Boolean** | Indicates if the step returns fewer items than requested when the source list is shorter than the range needs. Always &#x60;true&#x60; for the &#x60;many&#x60; and &#x60;between&#x60; operators; not present for &#x60;one&#x60;, which fails instead of returning a partial result. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
SELECT | &quot;select&quot;



## Enum: OperatorEnum

Name | Value
---- | -----
MANY | &quot;many&quot;
BETWEEN | &quot;between&quot;
ONE | &quot;one&quot;



