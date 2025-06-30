

# ScimBaseGroup

Define the schema for base fields in a group using the SCIM provisioning protocol. Talon.One uses this schema to create roles.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | Display name of the group (Talon.One role). |  [optional]
**members** | [**List&lt;ScimGroupMember&gt;**](ScimGroupMember.md) | List of members to assign to the new Talon.One role. |  [optional]



