

# TierDowngradeData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerProfileID** | **String** | The integration ID of the customer profile whose tier was downgraded. | 
**loyaltyProgramID** | **Long** | The ID of the loyalty program. | 
**subledgerID** | **String** | The ID of the subledger, when applicable. If this field is empty, the main ledger is used. | 
**currentTier** | **String** | The name of the customer&#39;s current tier. |  [optional]
**currentPoints** | [**BigDecimal**](BigDecimal.md) | The number of points the customer had at the time of tier downgrade. | 
**oldTier** | **String** | The name of the customer&#39;s previous tier. | 
**tierExpirationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The exact date and time the tier expires. |  [optional]
**timestampOfTierChange** | [**OffsetDateTime**](OffsetDateTime.md) | The exact date and time the tier was changed. | 



