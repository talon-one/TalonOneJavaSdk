

# CustomEffect


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was last modified. | 
**name** | **String** | The name of this effect. | 
**title** | **String** | The title of this effect. | 
**payload** | **String** | The JSON payload of this effect. | 
**description** | **String** | The description of this effect. |  [optional]
**enabled** | **Boolean** | Determines if this effect is active. | 
**subscribedApplicationsIds** | **List&lt;Integer&gt;** | A list of the IDs of the applications that this effect is enabled for |  [optional]
**params** | [**List&lt;TemplateArgDef&gt;**](TemplateArgDef.md) | Array of template argument definitions |  [optional]
**modifiedBy** | **Integer** | ID of the user who last updated this effect if available. |  [optional]
**createdBy** | **Integer** | ID of the user who created this effect. | 



