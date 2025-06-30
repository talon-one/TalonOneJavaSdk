

# ScimGroup

Define the schema for groups created using the SCIM provisioning protocol. In Talon.One, a `Group` corresponds to a [role](https://docs.talon.one/docs/product/account/account-settings/managing-roles), and `members` are the [users](https://docs.talon.one/docs/product/account/account-settings/managing-users) assigned to that role.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | Display name of the group (Talon.One role). |  [optional]
**members** | [**List&lt;ScimGroupMember&gt;**](ScimGroupMember.md) | List of members to assign to the new Talon.One role. |  [optional]
**id** | **String** | ID of the group. | 



