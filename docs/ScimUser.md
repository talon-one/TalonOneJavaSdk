

# ScimUser

Schema definition for users that have been provisioned using the SCIM protocol with an identity provider, for example, Microsoft Entra ID.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | Status of the user. |  [optional]
**displayName** | **String** | Display name of the user. |  [optional]
**userName** | **String** | Unique identifier of the user. This is usually an email address. | 
**name** | [**ScimBaseUserName**](ScimBaseUserName.md) |  |  [optional]
**id** | **String** | ID of the user. | 



