

# Blueprint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this blueprint. | 
**accountId** | **Long** | The ID of the account that owns this blueprint. | 
**applicationId** | **Long** | The ID of the Application that owns this blueprint. | 
**title** | **String** | A short description of the blueprint. | 
**description** | **String** | A longer, more detailed description of the blueprint. |  [optional]
**category** | [**CategoryEnum**](#CategoryEnum) | Category used to group blueprints. | 
**source** | [**SourceEnum**](#SourceEnum) | Indicates whether the blueprint is custom or shipped by Talon.One. | 
**rules** | [**List&lt;CatalogRule&gt;**](CatalogRule.md) | Array of rule templates in this blueprint. Rules only contain title (no description, as description is at the blueprint level). | 
**cartItemFilters** | [**List&lt;CartItemFilterTemplate&gt;**](CartItemFilterTemplate.md) | Array of cart item filter templates in this blueprint. Cart item filters only contain name (no description, as description is at the blueprint level). | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the blueprint was created. | 
**createdBy** | **Long** | ID of the user who created the blueprint. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the blueprint was last updated. |  [optional]
**modifiedBy** | **Long** | ID of the user who last updated the blueprint. |  [optional]



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



