

# AddedDeductedPointsBalancesAction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The amount of added or deducted loyalty points. | 
**reason** | **String** | The reason for the points addition or deduction. | 
**operation** | [**OperationEnum**](#OperationEnum) | The action (addition or deduction) made with loyalty points. | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date for loyalty points. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The expiration date for loyalty points. |  [optional]



## Enum: OperationEnum

Name | Value
---- | -----
ADDITION | &quot;addition&quot;
DEDUCTION | &quot;deduction&quot;



