

# CatalogItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**sku** | **String** | The stock keeping unit of the item. | 
**price** | [**BigDecimal**](BigDecimal.md) | Price of the item. |  [optional]
**catalogid** | **Long** | The ID of the catalog the item belongs to. | 
**version** | **Long** | The version of the catalog item. | 
**attributes** | [**List&lt;ItemAttribute&gt;**](ItemAttribute.md) |  |  [optional]
**product** | [**Product**](Product.md) |  |  [optional]



