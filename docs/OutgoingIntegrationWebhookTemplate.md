

# OutgoingIntegrationWebhookTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique Id for this entity. | 
**integrationType** | **Integer** | Unique Id of outgoing integration type. | 
**title** | **String** | Title of the webhook template. | 
**description** | **String** | General description for the specific outgoing integration webhook template. | 
**payload** | **String** | API payload (supports templating using parameters) for this webhook template. | 
**method** | [**MethodEnum**](#MethodEnum) | API method for this webhook. | 



## Enum: MethodEnum

Name | Value
---- | -----
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
GET | &quot;GET&quot;
DELETE | &quot;DELETE&quot;
PATCH | &quot;PATCH&quot;



