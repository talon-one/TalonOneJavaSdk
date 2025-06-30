

# MessageLogEntry

Message Log.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the message. | 
**service** | **String** | Name of the service that generated the log entry. | 
**changeType** | **String** | Type of change that triggered the notification. |  [optional]
**notificationId** | **Integer** | ID of the notification. |  [optional]
**notificationName** | **String** | The name of the notification. |  [optional]
**webhookId** | **Integer** | ID of the webhook. |  [optional]
**webhookName** | **String** | The name of the webhook. |  [optional]
**request** | [**MessageLogRequest**](MessageLogRequest.md) |  |  [optional]
**response** | [**MessageLogResponse**](MessageLogResponse.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the log entry was created. | 
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | The entity type the log is related to.  | 
**url** | **String** | The target URL of the request. |  [optional]
**applicationId** | **Integer** | Identifier of the Application. |  [optional]
**loyaltyProgramId** | **Integer** | Identifier of the loyalty program. |  [optional]
**campaignId** | **Integer** | Identifier of the campaign. |  [optional]



## Enum: EntityTypeEnum

Name | Value
---- | -----
APPLICATION | &quot;application&quot;
LOYALTY_PROGRAM | &quot;loyalty_program&quot;
WEBHOOK | &quot;webhook&quot;



