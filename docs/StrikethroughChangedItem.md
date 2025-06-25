

# StrikethroughChangedItem

The information of affected items.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID of the event that triggered the strikethrough labeling. | 
**catalogId** | **Long** | The ID of the catalog that the changed item belongs to. | 
**sku** | **String** | The unique SKU of the changed item. | 
**version** | **Long** | The version of the changed item. | 
**price** | [**BigDecimal**](BigDecimal.md) | The price of the changed item. | 
**evaluatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The evaluation time of the changed item. | 
**effects** | [**List&lt;StrikethroughEffect&gt;**](StrikethroughEffect.md) |  |  [optional]



