

# IntegrationHubEventPayloadLoyaltyProfileBasedPointsChangedNotificationAction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Float** |  | 
**reason** | **String** |  |  [optional]
**operation** | [**OperationEnum**](#OperationEnum) |  | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**transactionUUID** | [**UUID**](UUID.md) | The identifier of the transaction in the loyalty ledger. | 



## Enum: OperationEnum

Name | Value
---- | -----
ADDITION | &quot;addition&quot;
SUBTRACTION | &quot;subtraction&quot;



