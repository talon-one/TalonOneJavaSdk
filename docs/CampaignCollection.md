

# CampaignCollection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was last modified. | 
**description** | **String** | A short description of the purpose of this collection. |  [optional]
**name** | **String** | The name of this collection. | 
**modifiedBy** | **Integer** | ID of the user who last updated this effect if available. |  [optional]
**createdBy** | **Integer** | ID of the user who created this effect. | 
**applicationId** | **Integer** | The ID of the Application that owns this entity. |  [optional]
**campaignId** | **Integer** | The ID of the campaign that owns this entity. |  [optional]
**payload** | **List&lt;String&gt;** | The content of the collection. |  [optional]



