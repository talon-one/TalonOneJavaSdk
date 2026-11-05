

# MCPOAuthToken

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | **String** | Bearer access token. | 
**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | Token type. Always \&quot;Bearer\&quot;. | 
**expiresIn** | **Long** | Seconds until the access token expires. | 
**refreshToken** | **String** | Refresh token for obtaining a new access token. | 
**refreshTokenExpiresIn** | **Long** | Seconds until the refresh token expires. | 



## Enum: TokenTypeEnum

Name | Value
---- | -----
BEARER | &quot;Bearer&quot;



