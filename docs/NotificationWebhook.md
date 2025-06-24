

# NotificationWebhook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was last modified. | 
**applicationId** | **Long** | The ID of the application that owns this entity. | 
**url** | **String** | API URL for the given webhook-based notification. | 
**headers** | **List&lt;String&gt;** | List of API HTTP headers for the given webhook-based notification. | 
**enabled** | **Boolean** | Indicates whether sending the notification is enabled. |  [optional]



