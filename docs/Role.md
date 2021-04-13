

# Role


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was last modified. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**campaignGroupID** | **Integer** | The ID of the Campaign Group this role was created for. |  [optional]
**name** | **String** | Name of the role | 
**description** | **String** | Description of the role |  [optional]
**members** | **List&lt;Integer&gt;** | A list of user identifiers assigned to this role |  [optional]
**acl** | [**Object**](.md) | Role ACL Policy | 



