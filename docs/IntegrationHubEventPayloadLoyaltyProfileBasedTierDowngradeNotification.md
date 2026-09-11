

# IntegrationHubEventPayloadLoyaltyProfileBasedTierDowngradeNotification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **Long** | The ID of the integration hub event. Return this value in the delivery-status callback to mark the event delivered or failed. | 
**profileIntegrationID** | **String** |  | 
**loyaltyProgramID** | **Long** |  | 
**loyaltyProgramName** | **String** | The name of the loyalty program. | 
**subledgerID** | **String** |  | 
**sourceOfEvent** | **String** |  | 
**currentTier** | **String** | The name of the customer&#39;s current tier, or null if the customer was downgraded below all tiers. |  [optional]
**currentPoints** | **Float** |  | 
**oldTier** | **String** |  |  [optional]
**tierExpirationDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**timestampOfTierChange** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**publishedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the event was published. | 



