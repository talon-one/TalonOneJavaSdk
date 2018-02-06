
# ApiKeyWithUsage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was last modified. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**name** | **String** | The name of this API key. | 
**description** | **String** | A longer description of the API key. |  [optional]
**roleId** | **Integer** | ID of the role to be used. | 
**applicationId** | **Integer** | ID of the application to be used for integration requests. |  [optional]
**token** | **String** | Token for the API Key. | 
**usageCount** | **Integer** | Number of times the API key was used. | 
**lastUsed** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the last usage of the API key. | 



