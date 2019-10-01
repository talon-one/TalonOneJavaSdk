
# UpdateUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | The email address associated with your account. | 
**name** | **String** | Your name. |  [optional]
**password** | **String** | Your old password. |  [optional]
**newPassword** | **String** | Your new password. |  [optional]
**policy** | **String** | a blob of acl json |  [optional]
**state** | [**StateEnum**](#StateEnum) | New state (\&quot;deactivated\&quot; or \&quot;active\&quot;) for the user. Only usable by admins for the user. |  [optional]
**releaseUpdate** | **Boolean** | Update the user via email |  [optional]
**latestFeature** | **String** | The latest feature you&#39;ve been notified. |  [optional]
**roles** | **List&lt;Integer&gt;** | Update |  [optional]
**applicationNotificationSubscriptions** | [**Object**](.md) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
DEACTIVATED | &quot;deactivated&quot;
ACTIVE | &quot;active&quot;



