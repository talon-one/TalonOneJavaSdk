

# Collection


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was last modified. | 
**description** | **String** | A short description of the purpose of this collection. |  [optional]
**subscribedApplicationsIds** | **List&lt;Integer&gt;** | A list of the IDs of the Applications where this collection is enabled. |  [optional]
**name** | **String** | The name of this collection. | 
**modifiedBy** | **Integer** | ID of the user who last updated this effect if available. |  [optional]
**createdBy** | **Integer** | ID of the user who created this effect. | 
**applicationId** | **Integer** | The ID of the Application that owns this entity. |  [optional]
**campaignId** | **Integer** | The ID of the campaign that owns this entity. |  [optional]
**payload** | **List&lt;String&gt;** | The content of the collection. |  [optional]



