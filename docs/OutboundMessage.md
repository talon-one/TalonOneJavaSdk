

# OutboundMessage

Outbound notification or webhook message with its shared request details.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | UUID of the outbound message. | 
**notificationId** | **Long** | ID of the notification that produced the outbound request. |  [optional]
**notificationName** | **String** | Name of the notification that produced the outbound request. |  [optional]
**webhookId** | **Long** | ID of the webhook that produced the outbound request. |  [optional]
**webhookName** | **String** | The name of the webhook that produced the outbound request. |  [optional]
**notificationType** | **String** | Type of notification that produced the outbound request. | 
**applicationId** | **Long** | ID of the Application associated with the outbound request. |  [optional]
**loyaltyProgramId** | **Long** | ID of the loyalty program associated with the outbound request. |  [optional]
**request** | [**OutboundLogRequest**](OutboundLogRequest.md) |  | 
**firstLogAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the first log entry for this message. | 
**lastLogAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the last log entry for this message. | 
**lastResponseCode** | **Long** | HTTP status code from the latest response. |  [optional]
**status** | **String** |  | 
**retryCount** | **Long** | Number of retries. |  [optional]
**responses** | [**List&lt;OutboundMessageResponse&gt;**](OutboundMessageResponse.md) | Log entries for this message. Omitted when &#x60;includeLogs&#x3D;false&#x60;. |  [optional]



