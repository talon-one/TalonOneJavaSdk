

# ChangeLoyaltyTierLevelEffectProps

The properties specific to the \"changeLoyaltyTierLevel\" effect. This is triggered whenever the user's loyalty tier is upgraded or downgraded due to a validated rule that contained an \"add loyalty points\" effect. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleTitle** | **String** | The title of the rule that triggered the tier upgrade or downgrade. | 
**programId** | **Integer** | The ID of the loyalty program where these points were added. | 
**subLedgerId** | **String** | The ID of the subledger within the loyalty program where these points were added. | 
**previousTierName** | **String** | The name of the tier from which the user was upgraded or downgraded. |  [optional]
**newTierName** | **String** | The name of the tier to which the user has been upgraded or downgraded. | 
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The expiration date of the new tier. |  [optional]



