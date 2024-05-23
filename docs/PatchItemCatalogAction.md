

# PatchItemCatalogAction

The specific properties of the \"PATCH\" catalog sync action.  **Note:**   - If you do not provide a new `price` value, the existing `price` value is retained.   - If you do not provide a new `product` value, the `product` value is set to `null`. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sku** | **String** | The unique SKU of the item to patch. | 
**price** | [**BigDecimal**](BigDecimal.md) | Price of the item. |  [optional]
**attributes** | [**Object**](.md) | The attributes of the item to patch. |  [optional]
**product** | [**Product**](Product.md) |  |  [optional]
**createIfNotExists** | **Boolean** | Indicates whether to create an item if the SKU does not exist. |  [optional]



