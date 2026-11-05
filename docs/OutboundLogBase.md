

# OutboundLogBase

Shared details of an outbound notification or webhook message.
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
**request** | [**OutboundLogRequest**](OutboundLogRequest.md) |  |  [optional]



