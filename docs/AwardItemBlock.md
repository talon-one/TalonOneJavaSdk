

# AwardItemBlock

A block that awards a free cart item to the customer. The item is identified by SKU and name and has a configurable quantity.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | **String** | Identifies the block variant and determines which additional properties are present in it. | 
**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly]
**sku** | **String** | The stock keeping unit of the item to award. | 
**name** | **String** | The display name of the item to award. | 
**quantity** | **String** | The number of items to award. Supports template placeholders (e.g. \&quot;{{$Session.Total / 2}}\&quot;) for dynamic quantities. | 
**partial** | **Boolean** | When set to &#x60;true&#x60;, applies a partial item reward if the remaining budget is insufficient to award the full reward. |  [optional]
**onFailure** | **List&lt;Object&gt;** | Blocks evaluated when this block fails or returns false. |  [optional]
**onError** | [**Map&lt;String, List&lt;Object&gt;&gt;**](List.md) | Named error handlers evaluated when a specific error occurs. |  [optional]



