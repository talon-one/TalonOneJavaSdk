

# WebhookAuthenticationBaseCustom

Authenticates the webhook with a custom set of HTTP headers.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the webhook authentication. | 
**type** | [**TypeEnum**](#TypeEnum) | A webhook authentication discriminator of type &#x60;custom&#x60;. | 
**data** | [**WebhookAuthenticationDataCustom**](WebhookAuthenticationDataCustom.md) |  | 



## Enum: TypeEnum

Name | Value
---- | -----
CUSTOM | &quot;custom&quot;



