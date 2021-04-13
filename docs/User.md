

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
**policy** | [**Object**](.md) | User ACL Policy | 
**latestFeedTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) | Latest timestamp the user has been notified for feed. |  [optional]
**roles** | **List&lt;Integer&gt;** | Contains a list of all roles the user is a member of |  [optional]
**applicationNotificationSubscriptions** | **Map&lt;String, Object&gt;** |  |  [optional]
**authMethod** | **String** | The Authentication method for this user |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
INVITED | &quot;invited&quot;
ACTIVE | &quot;active&quot;
DEACTIVATED | &quot;deactivated&quot;



