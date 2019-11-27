
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was last modified. | 
**email** | **String** | The email address associated with your account. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**inviteToken** | **String** | Invite token, empty if the user as already accepted their invite. | 
**state** | [**StateEnum**](#StateEnum) | Current user state. | 
**name** | **String** | Full name | 
**policy** | **String** | A blob of ACL JSON | 
**releaseUpdate** | **Boolean** | Update the user via email | 
**latestFeature** | **String** | Latest feature the user has been notified. |  [optional]
**roles** | **List&lt;Integer&gt;** | Contains a list of all roles a user is a memeber of |  [optional]
**applicationNotificationSubscriptions** | [**Object**](.md) |  |  [optional]
**authMethod** | **String** | The Authentication method for this user |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
INVITED | &quot;invited&quot;
ACTIVE | &quot;active&quot;
DEACTIVATED | &quot;deactivated&quot;



