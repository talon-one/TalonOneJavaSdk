
# ApplicationStorage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was last modified. | 
**applicationId** | **Integer** | The ID of the application that owns this entity. | 
**name** | **String** | Identifier for the information to be saved, e.g. \&quot;Loyalty points for SKU\&quot;. | 
**datatype** | [**Object**](.md) | A JSON Schema describing the information to be saved in the storage | 
**description** | **String** | Description of the application store |  [optional]
**usedAt** | **List&lt;String&gt;** | array of rulesets where the application storage is used | 



