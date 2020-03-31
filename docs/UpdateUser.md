

# UpdateUser

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Your name. |  [optional]
**policy** | **String** | a blob of acl json |  [optional]
**state** | [**StateEnum**](#StateEnum) | New state (\&quot;deactivated\&quot; or \&quot;active\&quot;) for the user. Only usable by admins for the user. |  [optional]
**releaseUpdate** | **Boolean** | Update the user via email |  [optional]
**latestFeature** | **String** | The latest feature you&#39;ve been notified. |  [optional]
**roles** | **List&lt;Integer&gt;** | Update |  [optional]
**applicationNotificationSubscriptions** | [**Object**](.md) |  |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
DEACTIVATED | &quot;deactivated&quot;
ACTIVE | &quot;active&quot;



