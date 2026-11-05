

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
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the loyalty transaction occurred. |  [optional]
**awaitsActivation** | **Boolean** | Indicates whether the points have an action-based start date. This property is returned only for point transactions with an action-based start date. |  [optional]
**validityDuration** | **String** | The duration for which the points remain active, calculated relative to their start date.   **Note**: This only applies to points for which &#x60;AwaitsActivation&#x60; is &#x60;true&#x60; and &#x60;ExpiryDate&#x60; is not set.  |  [optional]



## Enum: OperationEnum

Name | Value
---- | -----
ADDITION | &quot;addition&quot;
SUBTRACTION | &quot;subtraction&quot;



