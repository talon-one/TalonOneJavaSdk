

# WebhookLogEntry

Log of webhook API calls.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | UUID reference of the webhook request. | 
**integrationRequestUuid** | **String** | UUID reference of the integration request linked to this webhook request. | 
**webhookId** | **Integer** | ID of the webhook that triggered the request. | 
**applicationId** | **Integer** | ID of the application that triggered the webhook. |  [optional]
**url** | **String** | Target url of request | 
**request** | **String** | Request message | 
**response** | **String** | Response message |  [optional]
**status** | **Integer** | HTTP status code of response. |  [optional]
**requestTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of request | 
**responseTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of response |  [optional]



