

# NewExternalInvitation

Parameters for inviting a new user from an external identity provider.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the user. |  [optional]
**userGroups** | **List&lt;String&gt;** | List of user groups in the external identity provider.  If there are roles in Talon.One whose names match these user groups, those roles will be automatically assigned to the user upon invitation.  |  [optional]
**email** | **String** | Email address of the user. | 



