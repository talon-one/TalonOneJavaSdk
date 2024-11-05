

# Role

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was last modified. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**campaignGroupID** | **Integer** | The ID of the [Campaign Group](https://docs.talon.one/docs/product/account/account-settings/managing-campaign-groups) this role was created for.  |  [optional]
**name** | **String** | Name of the role. | 
**description** | **String** | Description of the role. |  [optional]
**members** | **List&lt;Integer&gt;** | A list of user identifiers assigned to this role. |  [optional]
**acl** | [**Object**](.md) | The &#x60;Access Control List&#x60; json defining the role of the user. This represents the access control on the user level. | 



