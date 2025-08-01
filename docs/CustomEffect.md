

# CustomEffect

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**accountId** | **Long** | The ID of the account that owns this entity. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was last modified. | 
**applicationIds** | **List&lt;Long&gt;** | The IDs of the Applications that are related to this entity. | 
**isPerItem** | **Boolean** | Indicates if this effect is per item or not. |  [optional]
**name** | **String** | The name of this effect. | 
**title** | **String** | The title of this effect. | 
**payload** | **String** | The JSON payload of this effect. | 
**description** | **String** | The description of this effect. |  [optional]
**enabled** | **Boolean** | Determines if this effect is active. | 
**params** | [**List&lt;TemplateArgDef&gt;**](TemplateArgDef.md) | Array of template argument definitions. |  [optional]
**modifiedBy** | **Long** | ID of the user who last updated this effect if available. |  [optional]
**createdBy** | **Long** | ID of the user who created this effect. | 



