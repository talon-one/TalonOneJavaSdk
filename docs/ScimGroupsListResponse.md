

# ScimGroupsListResponse

List of groups created using the SCIM provisioning protocol with an identity provider, for example, Microsoft Entra ID. In Talon.One, a `Group` corresponds to a [role](https://docs.talon.one/docs/product/account/account-settings/managing-roles), and `members` are the [users](https://docs.talon.one/docs/product/account/account-settings/managing-users) assigned to that role.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resources** | [**List&lt;ScimGroup&gt;**](ScimGroup.md) |  | 
**schemas** | **List&lt;String&gt;** | SCIM schema for the given resource. |  [optional]
**totalResults** | **Long** | Number of results in the response. |  [optional]



