

# MCPKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name for the MCP key. | 
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the MCP key expires. | 
**id** | **Long** | ID of the MCP key. | 
**createdBy** | **Long** | ID of the user who created it. | 
**accountID** | **Long** | ID of account the key is used for. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The date the MCP key was created. | 
**disabled** | **Boolean** | The MCP key is disabled (this property is set to &#x60;true&#x60;) when the user who created the key is disabled or deleted. |  [optional]
**lastUsed** | [**OffsetDateTime**](OffsetDateTime.md) | The last time the MCP key was used. |  [optional]



