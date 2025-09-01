

# AddedDeductedPointsNotification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**profileIntegrationID** | **String** | The integration ID of the customer profile to whom points were added or deducted. | 
**loyaltyProgramID** | **Long** | The ID of the loyalty program. | 
**subledgerID** | **String** | The ID of the subledger within the loyalty program where these points were added. | 
**amount** | [**BigDecimal**](BigDecimal.md) | The amount of added or deducted loyalty points. | 
**reason** | **String** | The reason for the points addition or deduction. | 
**typeOfChange** | [**TypeOfChangeEnum**](#TypeOfChangeEnum) | The notification source, that is, it indicates whether the points were added or deducted via one of the following routes:  - [The Campaign Manager](/docs/product/getting-started)  - [Management API](/management-api#tag/Loyalty)  - [Rule Engine](/docs/product/applications/evaluation-order-for-rules-and-filters)  | 
**employeeName** | **String** | The name of the employee who added or deducted points. | 
**userID** | **Long** | The ID of the employee who added or deducted points. | 
**operation** | [**OperationEnum**](#OperationEnum) | The action (addition or deduction) made with loyalty points. | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date for loyalty points. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The expiration date for loyalty points. |  [optional]
**sessionIntegrationID** | **String** | The integration ID of the session through which the points were earned or lost. | 



## Enum: TypeOfChangeEnum

Name | Value
---- | -----
CAMPAIGN_MANAGER | &quot;campaign_manager&quot;
RULE_ENGINE | &quot;rule_engine&quot;
MANAGEMENT_API | &quot;management_api&quot;



## Enum: OperationEnum

Name | Value
---- | -----
ADDITION | &quot;addition&quot;
DEDUCTION | &quot;deduction&quot;



