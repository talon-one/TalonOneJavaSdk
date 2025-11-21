

# ActivateLoyaltyPoints

Activate loyalty points.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionUUIDs** | [**List&lt;UUID&gt;**](UUID.md) | The list of transaction UUIDs used to activate point transactions.  If passed, &#x60;sessionId&#x60; must be omitted.  |  [optional]
**sessionId** | **String** | The integration ID of the session with the point transactions to be activated.  If passed, &#x60;transactionUUIDs&#x60; must be omitted.  |  [optional]



