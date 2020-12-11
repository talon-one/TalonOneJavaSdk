

# RollbackAddedLoyaltyPointsEffectProps

The properties specific to the \"rollbackAddedLoyaltyPoints\" effect. This gets triggered whenever previously a closed session with an addLoyaltyPoints effect is cancelled.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**programId** | **Integer** | The ID of the loyalty program where the points were originally added | 
**subLedgerId** | **String** | The ID of the subledger within the loyalty program where these points were originally added | 
**value** | [**BigDecimal**](BigDecimal.md) | The amount of points that were rolled back | 
**recipientIntegrationId** | **String** | The user for whom these points were originally added | 



