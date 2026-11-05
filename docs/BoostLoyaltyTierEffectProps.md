

# BoostLoyaltyTierEffectProps

This effect indicates that the customer was temporarily placed in a higher loyalty tier for a specified period, without any change to their points balance.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**programId** | **Long** | The ID of the loyalty program. | 
**subLedgerId** | **String** | The ID of the subledger within the loyalty program. | 
**tierName** | **String** | The name of the tier to which the customer is temporarily boosted. | 
**reason** | **String** | A reason for the tier boost. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date when the tier boost expires. | 
**boostUuid** | [**UUID**](UUID.md) | The unique identifier of the tier boost. Used to match the boost to its rollback effect when a session is cancelled. | 



