

# CollectionsCatalog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this collection. | 
**accountId** | **Long** | The ID of the account that owns this collection. | 
**applicationId** | **Long** | The ID of the Application that owns this collection. | 
**title** | **String** | A short description of the collection catalog. | 
**description** | **String** | A longer, more detailed description of the collection catalog. |  [optional]
**category** | [**CategoryEnum**](#CategoryEnum) | Category used to group collection catalogs. | 
**source** | [**SourceEnum**](#SourceEnum) | Indicates whether the collection is custom or shipped by Talon.One. | 
**rules** | [**List&lt;CatalogRule&gt;**](CatalogRule.md) | Array of rule templates in this collection catalog. Rules only contain title (no description, as description is at the collection catalog level). | 
**cartItemFilters** | [**List&lt;CartItemFilterTemplate&gt;**](CartItemFilterTemplate.md) | Array of cart item filter templates in this collection catalog. Cart item filters only contain name (no description, as description is at the collection catalog level). | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the collection was created. | 
**createdBy** | **Long** | ID of the user who created the collection. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the collection was last updated. |  [optional]
**modifiedBy** | **Long** | ID of the user who last updated the collection. |  [optional]



## Enum: CategoryEnum

Name | Value
---- | -----
PROMOTIONS | &quot;promotions&quot;
PRICING | &quot;pricing&quot;
LOYALTY | &quot;loyalty&quot;
CUSTOM | &quot;custom&quot;



## Enum: SourceEnum

Name | Value
---- | -----
CUSTOM | &quot;custom&quot;
DEFAULT | &quot;default&quot;



