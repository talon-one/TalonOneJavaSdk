

# NewExperimentBlueprint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | The display name for the experiment blueprint. | 
**description** | **String** | A longer, more detailed description of the experiment blueprint. |  [optional]
**category** | [**CategoryEnum**](#CategoryEnum) | Category used to group experiment blueprints. |  [optional]
**variants** | [**List&lt;ExperimentBlueprintVariant&gt;**](ExperimentBlueprintVariant.md) | Array of experiment variant templates to store in this experiment blueprint. At least one variant or cart item filter is required. |  [optional]
**cartItemFilters** | [**List&lt;CartItemFilterTemplate&gt;**](CartItemFilterTemplate.md) | Array of cart item filters to store in this experiment blueprint. If not provided, will be extracted from the variant rulesets. Cart item filters should only contain name (no description, as description is at the experiment blueprint level). |  [optional]



## Enum: CategoryEnum

Name | Value
---- | -----
PROMOTIONS | &quot;promotions&quot;
PRICING | &quot;pricing&quot;
LOYALTY | &quot;loyalty&quot;
CUSTOM | &quot;custom&quot;



