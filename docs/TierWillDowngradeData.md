

# TierWillDowngradeData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerProfileID** | **String** | The integration ID of the customer profile whose tier was downgraded. | 
**loyaltyProgramID** | **Long** | The ID of the loyalty program. | 
**subledgerID** | **String** | The ID of the subledger, when applicable. If this field is empty, the main ledger is used. | 
**currentTier** | **String** | The name of the customer&#39;s current tier. | 
**currentPoints** | [**BigDecimal**](BigDecimal.md) | The number of points the customer will have after the tier downgrade. | 
**pointsRequiredToRemain** | [**BigDecimal**](BigDecimal.md) | The number of points needed for a customer to remain on the same tier. | 
**nextTier** | **String** | The name of the customer&#39;s next tier. |  [optional]
**tierExpirationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the tier expires. |  [optional]



