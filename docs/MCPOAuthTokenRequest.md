

# MCPOAuthTokenRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grantType** | [**GrantTypeEnum**](#GrantTypeEnum) | OAuth2 grant type. | 
**code** | **String** | Authorization code. Required for &#x60;authorization_code&#x60; grant. |  [optional]
**clientId** | **String** | Client ID. Required for &#x60;authorization_code&#x60; grant. |  [optional]
**redirectUri** | **String** | Redirect URI. Required for &#x60;authorization_code&#x60; grant. |  [optional]
**codeVerifier** | **String** | PKCE code verifier. Required for &#x60;authorization_code&#x60; grant. |  [optional]
**refreshToken** | **String** | Refresh token. Required for &#x60;refresh_token&#x60; grant. |  [optional]



## Enum: GrantTypeEnum

Name | Value
---- | -----
AUTHORIZATION_CODE | &quot;authorization_code&quot;
REFRESH_TOKEN | &quot;refresh_token&quot;



