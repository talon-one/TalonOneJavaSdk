

# AddedDeductedPointsBalancesAction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The amount of added or deducted loyalty points. | 
**reason** | **String** | The reason for the points addition or deduction. | 
**operation** | [**OperationEnum**](#OperationEnum) | The action (addition or subtraction) made with loyalty points. | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date for loyalty points. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The expiration date for loyalty points. |  [optional]
**transactionUUID** | [**UUID**](UUID.md) | The identifier of the transaction in the loyalty ledger. | 



## Enum: OperationEnum

Name | Value
---- | -----
ADDITION | &quot;addition&quot;
SUBTRACTION | &quot;subtraction&quot;



