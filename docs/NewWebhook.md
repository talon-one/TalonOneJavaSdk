

# NewWebhook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationIds** | **List&lt;Integer&gt;** | The IDs of the Applications that are related to this entity. | 
**title** | **String** | Name or title for this webhook. | 
**description** | **String** | A description of the webhook. |  [optional]
**verb** | [**VerbEnum**](#VerbEnum) | API method for this webhook. | 
**url** | **String** | API URL (supports templating using parameters) for this webhook. | 
**headers** | **List&lt;String&gt;** | List of API HTTP headers for this webhook. | 
**payload** | **String** | API payload (supports templating using parameters) for this webhook. |  [optional]
**params** | [**List&lt;TemplateArgDef&gt;**](TemplateArgDef.md) | Array of template argument definitions. | 
**enabled** | **Boolean** | Enables or disables webhook from showing in the Rule Builder. | 



## Enum: VerbEnum

Name | Value
---- | -----
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
GET | &quot;GET&quot;
DELETE | &quot;DELETE&quot;
PATCH | &quot;PATCH&quot;



