

# ExperimentBlueprint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this experiment blueprint. | 
**accountId** | **Long** | The ID of the account that owns this experiment blueprint. | 
**applicationId** | **Long** | The ID of the Application that owns this experiment blueprint. | 
**title** | **String** | A short description of the experiment blueprint. | 
**description** | **String** | A longer, more detailed description of the experiment blueprint. |  [optional]
**category** | [**CategoryEnum**](#CategoryEnum) | Category used to group experiment blueprints. | 
**source** | [**SourceEnum**](#SourceEnum) | Indicates whether the experiment blueprint is custom or shipped by Talon.One. | 
**variants** | [**List&lt;ExperimentBlueprintVariant&gt;**](ExperimentBlueprintVariant.md) | Array of experiment variant templates in this experiment blueprint. Variants only contain name, weight, ruleset and the primary flag. | 
**cartItemFilters** | [**List&lt;CartItemFilterTemplate&gt;**](CartItemFilterTemplate.md) | Array of cart item filter templates in this experiment blueprint. Cart item filters only contain name (no description, as description is at the experiment blueprint level). | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the experiment blueprint was created. | 
**createdBy** | **Long** | ID of the user who created the experiment blueprint. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the experiment blueprint was last updated. |  [optional]
**modifiedBy** | **Long** | ID of the user who last updated the experiment blueprint. |  [optional]



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



