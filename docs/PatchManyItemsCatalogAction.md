

# PatchManyItemsCatalogAction

The specific properties of the \"PATCH_MANY\" catalog sync action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | [**BigDecimal**](BigDecimal.md) | Price of the item. |  [optional]
**filters** | [**List&lt;CatalogActionFilter&gt;**](CatalogActionFilter.md) | The list of filters used to select the items to patch, joined by &#x60;AND&#x60;.  **Note:** Every item in the catalog will be modified if there are no filters.  |  [optional]
**attributes** | [**Object**](.md) | The attributes of the items to patch. |  [optional]



