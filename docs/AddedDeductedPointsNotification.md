

# AddedDeductedPointsNotification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**employeeName** | **String** | The name of the employee who added or deducted points. | 
**loyaltyProgramID** | **Long** | The ID of the loyalty program. | 
**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) | The type of notification. | 
**profileIntegrationID** | **String** | The integration ID of the customer profile to whom points were added or deducted. | 
**sessionIntegrationID** | **String** | The integration ID of the session through which the points were earned or lost. | 
**subledgerID** | **String** | The ID of the subledger within the loyalty program where these points were added. | 
**typeOfChange** | [**TypeOfChangeEnum**](#TypeOfChangeEnum) | The notification source, that is, it indicates whether the points were added or deducted via one of the following routes:  - [The Campaign Manager](/docs/product/getting-started)  - [Management API](/management-api#tag/Loyalty)  - [Rule Engine](/docs/product/applications/evaluation-order-for-rules-and-filters)  | 
**userID** | **Long** | The ID of the employee who added or deducted points. | 
**amount** | [**BigDecimal**](BigDecimal.md) | The amount of added or deducted loyalty points. | 
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The expiration date for loyalty points. |  [optional]
**operation** | [**OperationEnum**](#OperationEnum) | The action (addition or subtraction) made with loyalty points. | 
**reason** | **String** | The reason for the points addition or deduction. | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date for loyalty points. |  [optional]
**transactionUUID** | [**UUID**](UUID.md) | The identifier of the transaction in the loyalty ledger. | 



## Enum: NotificationTypeEnum

Name | Value
---- | -----
LOYALTYPOINTSDEDUCTED | &quot;LoyaltyPointsDeducted&quot;
LOYALTYPOINTSADDED | &quot;LoyaltyPointsAdded&quot;



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
SUBTRACTION | &quot;subtraction&quot;



