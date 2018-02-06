
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
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) | Last time user used management API |  [optional]
**policy** | [**Map&lt;String, Policy&gt;**](Policy.md) | Access policy for the user as json object. | 
**releaseUpdate** | **Boolean** | Update the user via email | 


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
INVITED | &quot;invited&quot;
ACTIVE | &quot;active&quot;
DEACTIVATED | &quot;deactivated&quot;



