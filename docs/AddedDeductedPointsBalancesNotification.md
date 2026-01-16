

# AddedDeductedPointsBalancesNotification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**employeeName** | **String** | The name of the employee who added or deducted points. | 
**loyaltyProgramID** | **Long** | The ID of the loyalty program. | 
**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) | The type of notification. | 
**profileIntegrationID** | **String** | The integration ID of the customer profile to whom points were added or deducted. | 
**sessionIntegrationID** | **String** | The integration ID of the session through which the points were earned or lost. | 
**subledgerID** | **String** | The ID of the subledger within the loyalty program where these points were added. | 
**typeOfChange** | [**TypeOfChangeEnum**](#TypeOfChangeEnum) | The notification source, that is, it indicates whether the points were added or deducted via one of the following routes: - [The Campaign Manager](/docs/product/getting-started) - [Management API](/management-api#tag/Loyalty) - [Rule Engine](/docs/product/applications/evaluation-order-for-rules-and-filters)  | 
**userID** | **Long** | The ID of the employee who added or deducted points. | 
**actions** | [**List&lt;AddedDeductedPointsBalancesAction&gt;**](AddedDeductedPointsBalancesAction.md) | The list of actions that have been triggered in the loyalty program. | 
**currentPoints** | [**BigDecimal**](BigDecimal.md) | The current points balance. | 



## Enum: NotificationTypeEnum

Name | Value
---- | -----
LOYALTYADDEDDEDUCTEDPOINTSBALANCES | &quot;LoyaltyAddedDeductedPointsBalances&quot;



## Enum: TypeOfChangeEnum

Name | Value
---- | -----
CAMPAIGN_MANAGER | &quot;campaign_manager&quot;
RULE_ENGINE | &quot;rule_engine&quot;
MANAGEMENT_API | &quot;management_api&quot;



