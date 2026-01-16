

# CardAddedDeductedPointsBalancesNotification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardIdentifier** | **String** | Loyalty card identification number. | 
**employeeName** | **String** | The name of the employee who added or deducted points. | 
**loyaltyProgramID** | **Long** | The ID of the loyalty program. | 
**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) | The type of notification. | 
**profileIntegrationIDs** | **List&lt;String&gt;** | The integration ID of the customer profile to whom points were added or deducted. | 
**sessionIntegrationID** | **String** | The integration ID of the session through which the points were earned or lost. | 
**subledgerID** | **String** | The ID of the subledger within the loyalty program where these points were added or deducted. | 
**typeOfChange** | [**TypeOfChangeEnum**](#TypeOfChangeEnum) | The notification source, that is, it indicates whether the points were added or deducted via one of the following routes: - [The Campaign Manager](/docs/product/getting-started) - [Management API](/management-api#tag/Loyalty) - [Rule Engine](/docs/product/applications/evaluation-order-for-rules-and-filters)  | 
**userID** | **Long** | The ID of the employee who added or deducted points. | 
**usersPerCardLimit** | **Long** | The max amount of user profiles with whom a card can be shared. This can be set to &#x60;0&#x60; for no limit. | 
**actions** | [**List&lt;AddedDeductedPointsBalancesAction&gt;**](AddedDeductedPointsBalancesAction.md) | The list of actions that have been triggered in the loyalty program. | 
**currentPoints** | [**BigDecimal**](BigDecimal.md) | The current points balance. | 



## Enum: NotificationTypeEnum

Name | Value
---- | -----
LOYALTYCARDADDEDDEDUCTEDPOINTSBALANCES | &quot;LoyaltyCardAddedDeductedPointsBalances&quot;



## Enum: TypeOfChangeEnum

Name | Value
---- | -----
CAMPAIGN_MANAGER | &quot;campaign_manager&quot;
RULE_ENGINE | &quot;rule_engine&quot;
MANAGEMENT_API | &quot;management_api&quot;



