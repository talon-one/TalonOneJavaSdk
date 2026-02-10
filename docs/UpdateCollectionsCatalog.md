

# UpdateCollectionsCatalog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | The display name for the collection catalog. |  [optional]
**description** | **String** | A longer, more detailed description of the collection catalog. |  [optional]
**category** | [**CategoryEnum**](#CategoryEnum) | Category used to group collection catalogs. |  [optional]
**rules** | [**List&lt;CatalogRule&gt;**](CatalogRule.md) | Replaces the stored rules. Rules should only contain title (no description, as description is at the collection catalog level). |  [optional]
**cartItemFilters** | [**List&lt;CartItemFilterTemplate&gt;**](CartItemFilterTemplate.md) | Replaces the stored cart item filters. Cart item filters should only contain name (no description, as description is at the collection catalog level). |  [optional]



## Enum: CategoryEnum

Name | Value
---- | -----
PROMOTIONS | &quot;promotions&quot;
PRICING | &quot;pricing&quot;
LOYALTY | &quot;loyalty&quot;
CUSTOM | &quot;custom&quot;



