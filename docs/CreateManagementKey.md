

# CreateManagementKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name for management key. | 
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the management key expires. | 
**endpoints** | [**List&lt;Endpoint&gt;**](Endpoint.md) | The list of endpoints that can be accessed with the key | 
**allowedApplicationIds** | **List&lt;Long&gt;** | A list of Application IDs that you can access with the management key. An empty or missing list means the management key can be used for all Applications in the account.  |  [optional]



