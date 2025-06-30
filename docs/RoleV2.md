

# RoleV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was last modified. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**name** | **String** | Name of the role. |  [optional]
**description** | **String** | Description of the role. |  [optional]
**permissions** | [**RoleV2Permissions**](RoleV2Permissions.md) |  |  [optional]
**members** | **List&lt;Integer&gt;** | A list of user IDs the role is assigned to. |  [optional]



