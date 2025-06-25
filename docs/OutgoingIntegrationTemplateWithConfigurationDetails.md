

# OutgoingIntegrationTemplateWithConfigurationDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique ID for this entity. | 
**integrationType** | **Long** | Unique ID of outgoing integration type. | 
**title** | **String** | The title of the integration template. | 
**description** | **String** | The description of the specific outgoing integration template. | 
**payload** | **String** | The API payload (supports templating using parameters) for this integration template. | 
**method** | [**MethodEnum**](#MethodEnum) | API method for this webhook. | 
**relativeUrl** | **String** | The relative URL corresponding to each integration template. | 
**headers** | **List&lt;String&gt;** | The list of HTTP headers for this integration template. | 
**policy** | [**Object**](.md) | The outgoing integration policy specific to each integration type. | 



## Enum: MethodEnum

Name | Value
---- | -----
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
GET | &quot;GET&quot;
DELETE | &quot;DELETE&quot;
PATCH | &quot;PATCH&quot;



