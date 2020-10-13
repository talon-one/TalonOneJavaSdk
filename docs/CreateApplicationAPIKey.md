

# CreateApplicationAPIKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Title for API Key | 
**expires** | [**OffsetDateTime**](OffsetDateTime.md) | The date the API key expired | 
**platform** | [**PlatformEnum**](#PlatformEnum) | Platform the API key is valid for. |  [optional]



## Enum: PlatformEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
SEGMENT | &quot;segment&quot;
BRAZE | &quot;braze&quot;
MPARTICLE | &quot;mparticle&quot;



