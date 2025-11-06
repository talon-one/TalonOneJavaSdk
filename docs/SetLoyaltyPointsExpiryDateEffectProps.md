

# SetLoyaltyPointsExpiryDateEffectProps

The properties specific to the \"setLoyaltyPointsExpiryDate\" effect. This gets triggered when a validated rule contains the \"set expiry date\" effect. The current expiry date gets set to the date given in the effect. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**programId** | **Long** | ID of the loyalty program that contains these points. | 
**subLedgerId** | **String** | API name of the loyalty program subledger that contains these points. | 
**newExpiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The specified expiry date and time for all active and pending point transactions in the loyalty program subledger. | 
**affectedTransactions** | [**List&lt;LoyaltyLedgerEntryExpiryDateChange&gt;**](LoyaltyLedgerEntryExpiryDateChange.md) | List of transactions affected by the expiry date update. |  [optional]



