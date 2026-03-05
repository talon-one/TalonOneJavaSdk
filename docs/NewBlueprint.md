

# NewBlueprint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | The display name for the blueprint. | 
**description** | **String** | A longer, more detailed description of the blueprint. |  [optional]
**category** | [**CategoryEnum**](#CategoryEnum) | Category used to group blueprints. |  [optional]
**rules** | [**List&lt;CatalogRule&gt;**](CatalogRule.md) | Array of rules to store in this blueprint. Rules should only contain title (no description, as description is at the blueprint level). At least one rule or cart item filter is required. |  [optional]
**cartItemFilters** | [**List&lt;CartItemFilterTemplate&gt;**](CartItemFilterTemplate.md) | Array of cart item filters to store in this blueprint. If not provided, will be extracted from the rules. Cart item filters should only contain name (no description, as description is at the blueprint level). |  [optional]



## Enum: CategoryEnum

Name | Value
---- | -----
PROMOTIONS | &quot;promotions&quot;
PRICING | &quot;pricing&quot;
LOYALTY | &quot;loyalty&quot;
CUSTOM | &quot;custom&quot;



