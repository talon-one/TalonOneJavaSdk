

# NewApplicationAPIKey


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Title of the API key. | 
**expires** | [**OffsetDateTime**](OffsetDateTime.md) | The date the API key expires. | 
**platform** | [**PlatformEnum**](#PlatformEnum) | The third-party platform the API key is valid for. Use &#x60;none&#x60; for a generic API key to be used from your own integration layer.  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The API key type. Can be empty or &#x60;staging&#x60;.  Staging API keys can only be used for dry requests with the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint, [Update customer profile](https://docs.talon.one/integration-api#tag/Customer-profiles/operation/updateCustomerProfileV2) endpoint, and [Track event](https://docs.talon.one/integration-api#tag/Events/operation/trackEventV2) endpoint.  When using the _Update customer profile_ endpoint with a staging API key, the query parameter &#x60;runRuleEngine&#x60; must be &#x60;true&#x60;.  |  [optional]
**timeOffset** | **Integer** | A time offset in nanoseconds associated with the API key. When making a request using the API key, rule evaluation is based on a date that is calculated by adding the offset to the current date.  |  [optional]
**id** | **Integer** | ID of the API Key. | 
**createdBy** | **Integer** | ID of user who created. | 
**accountID** | **Integer** | ID of account the key is used for. | 
**applicationID** | **Integer** | ID of application the key is used for. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The date the API key was created. | 
**key** | **String** | The API key. | 



## Enum: PlatformEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
SEGMENT | &quot;segment&quot;
BRAZE | &quot;braze&quot;
MPARTICLE | &quot;mparticle&quot;
SELLIGENT | &quot;selligent&quot;
ITERABLE | &quot;iterable&quot;
CUSTOMER_ENGAGEMENT | &quot;customer_engagement&quot;
CUSTOMER_DATA | &quot;customer_data&quot;
SALESFORCE | &quot;salesforce&quot;
EMARSYS | &quot;emarsys&quot;



## Enum: TypeEnum

Name | Value
---- | -----
STAGING | &quot;staging&quot;



