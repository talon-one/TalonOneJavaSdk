

# UpdateUser

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The user name. |  [optional]
**policy** | **String** | The &#x60;Access Control List&#x60; json defining the role of the user. This represents the access control on the user level. |  [optional]
**state** | [**StateEnum**](#StateEnum) | New state (\&quot;deactivated\&quot; or \&quot;active\&quot;) for the user. Only usable by admins for the user. |  [optional]
**roles** | **List&lt;Integer&gt;** | List of roles to assign to the user. |  [optional]
**applicationNotificationSubscriptions** | [**Object**](.md) |  |  [optional]
**isAdmin** | **Boolean** | An indication of whether the user has admin permissions. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
DEACTIVATED | &quot;deactivated&quot;
ACTIVE | &quot;active&quot;



