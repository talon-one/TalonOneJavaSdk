

# AddLoyaltyPointsEffectProps

The properties specific to the \"addLoyaltyPoints\" effect. This gets triggered whenever a validated rule contained an \"add loyalty\" effect. These points are automatically stored and managed inside Talon.One.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name/description of this loyalty point addition | 
**programId** | **Integer** | The ID of the loyalty program where these points were added | 
**subLedgerId** | **String** | The ID of the subledger within the loyalty program where these points were added | 
**value** | [**BigDecimal**](BigDecimal.md) | The amount of points that were added | 
**recipientIntegrationId** | **String** | The user for whom these points were added | 
**expiryCondition** | **String** | The amount of time (in days) these points are valid | 



