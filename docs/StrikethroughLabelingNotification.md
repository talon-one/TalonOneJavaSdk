

# StrikethroughLabelingNotification

The strikethrough labels notification for an application.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**VersionEnum**](#VersionEnum) | The version of the strikethrough pricing notification. |  [optional]
**validFrom** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which the strikethrough pricing update becomes valid. Set for **scheduled** strikethrough pricing updates (version: v2) only.  |  [optional]
**applicationId** | **Long** | The ID of the Application to which the catalog items labels belongs. | 
**currentBatch** | **Long** | The batch number of the notification. Notifications might be sent in different batches. | 
**totalBatches** | **Long** | The total number of batches for the notification. | 
**trigger** | [**StrikethroughTrigger**](StrikethroughTrigger.md) |  | 
**changedItems** | [**List&lt;StrikethroughChangedItem&gt;**](StrikethroughChangedItem.md) |  | 
**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) | The type of notification. | 
**sentAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which the notification was sent. | 



## Enum: VersionEnum

Name | Value
---- | -----
V2 | &quot;v2&quot;



## Enum: NotificationTypeEnum

Name | Value
---- | -----
STRIKETHROUGHPRICE | &quot;StrikethroughPrice&quot;



