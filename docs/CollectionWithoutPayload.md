

# CollectionWithoutPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**accountId** | **Long** | The ID of the account that owns this entity. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was last modified. | 
**description** | **String** | A short description of the purpose of this collection. |  [optional]
**subscribedApplicationsIds** | **List&lt;Long&gt;** | A list of the IDs of the Applications where this collection is enabled. |  [optional]
**name** | **String** | The name of this collection. | 
**modifiedBy** | **Long** | ID of the user who last updated this effect if available. |  [optional]
**createdBy** | **Long** | ID of the user who created this effect. | 
**applicationId** | **Long** | The ID of the Application that owns this entity. |  [optional]
**campaignId** | **Long** | The ID of the campaign that owns this entity. |  [optional]



