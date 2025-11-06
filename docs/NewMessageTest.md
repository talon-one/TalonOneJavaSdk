

# NewMessageTest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headers** | **Map&lt;String, String&gt;** | List of API HTTP headers for the given message. |  [optional]
**verb** | [**VerbEnum**](#VerbEnum) | API method for this message. | 
**url** | **String** | API URL for the given message. | 
**payload** | **String** | API payload of this message. |  [optional]
**params** | [**List&lt;TemplateArgDef&gt;**](TemplateArgDef.md) | Array of template argument definitions. |  [optional]
**applicationIds** | **List&lt;Long&gt;** | The IDs of the Applications in which this webhook is available. An empty array means the webhook is available in &#x60;All Applications&#x60;.  |  [optional]



## Enum: VerbEnum

Name | Value
---- | -----
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
GET | &quot;GET&quot;
DELETE | &quot;DELETE&quot;
PATCH | &quot;PATCH&quot;



