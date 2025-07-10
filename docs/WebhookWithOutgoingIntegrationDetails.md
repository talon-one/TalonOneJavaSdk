

# WebhookWithOutgoingIntegrationDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was last modified. | 
**applicationIds** | **List&lt;Long&gt;** | The IDs of the Applications in which this webhook is available. An empty array means the webhook is available in &#x60;All Applications&#x60;.  | 
**title** | **String** | Name or title for this webhook. | 
**description** | **String** | A description of the webhook. |  [optional]
**draft** | **Boolean** | Indicates if the webhook is a draft. | 
**verb** | [**VerbEnum**](#VerbEnum) | API method for this webhook. | 
**url** | **String** | API URL (supports templating using parameters) for this webhook. | 
**headers** | **List&lt;String&gt;** | List of API HTTP headers for this webhook. | 
**payload** | **String** | API payload (supports templating using parameters) for this webhook. |  [optional]
**params** | [**List&lt;TemplateArgDef&gt;**](TemplateArgDef.md) | Array of template argument definitions. | 
**enabled** | **Boolean** | Enables or disables webhook from showing in the Rule Builder. | 
**authenticationId** | **Long** | The ID of the credential that this webhook is using. |  [optional]
**outgoingIntegrationTemplateId** | **Long** | Identifier of the outgoing integration template. |  [optional]
**outgoingIntegrationTypeId** | **Long** | Identifier of the outgoing integration type. |  [optional]
**outgoingIntegrationTypeName** | **String** | Name of the outgoing integration. |  [optional]



## Enum: VerbEnum

Name | Value
---- | -----
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
GET | &quot;GET&quot;
DELETE | &quot;DELETE&quot;
PATCH | &quot;PATCH&quot;



