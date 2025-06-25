

# ScimUsersListResponse

List of users that have been provisioned using the SCIM protocol with an identity provider, for example, Microsoft Entra ID.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resources** | [**List&lt;ScimUser&gt;**](ScimUser.md) |  | 
**schemas** | **List&lt;String&gt;** | SCIM schema for the given resource. |  [optional]
**totalResults** | **Long** | Number of total results in the response. |  [optional]



