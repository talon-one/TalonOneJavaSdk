

# ApplicationAPIKey


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Title for API Key | 
**expires** | [**OffsetDateTime**](OffsetDateTime.md) | The date the API key expired | 
**platform** | [**PlatformEnum**](#PlatformEnum) | Platform the API key is valid for. |  [optional]
**id** | **Integer** | ID of the API Key | 
**createdBy** | **Integer** | ID of user who created | 
**accountID** | **Integer** | ID of account the key is used for | 
**applicationID** | **Integer** | ID of application the key is used for | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The date the API key was created | 



## Enum: PlatformEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
SEGMENT | &quot;segment&quot;
BRAZE | &quot;braze&quot;
MPARTICLE | &quot;mparticle&quot;
SELLIGENT | &quot;selligent&quot;



