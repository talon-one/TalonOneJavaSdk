

# ManagementKey


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name for management key. | 
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the management key expires. | 
**endpoints** | [**List&lt;Endpoint&gt;**](Endpoint.md) | The list of endpoints that can be accessed with the key | 
**allowedApplicationIds** | **List&lt;Integer&gt;** | A list of Application IDs that you can access with the management key. An empty or missing list means the management key can be used for all Applications in the account.  |  [optional]
**id** | **Integer** | ID of the management key. | 
**createdBy** | **Integer** | ID of the user who created it. | 
**accountID** | **Integer** | ID of account the key is used for. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The date the management key was created. | 



