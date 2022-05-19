

# CreateApplicationAPIKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Title for API Key | 
**expires** | [**OffsetDateTime**](OffsetDateTime.md) | The date the API key expired | 
**platform** | [**PlatformEnum**](#PlatformEnum) | The third-party platform the API key is valid for. Use &#x60;none&#x60; for a generic API key to be used from your own integration layer.  |  [optional]



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



