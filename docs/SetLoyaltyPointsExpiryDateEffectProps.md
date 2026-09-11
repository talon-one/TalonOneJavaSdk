

# SetLoyaltyPointsExpiryDateEffectProps

This effect updates the expiry date of all active, pending, and unlimited point transactions to a specific date. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**programId** | **Long** | ID of the loyalty program that contains these points. | 
**subLedgerId** | **String** | API name of the loyalty program subledger that contains these points. | 
**newExpiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The specified expiry date and time for all active and pending point transactions in the loyalty program subledger. | 
**affectedTransactions** | [**List&lt;LoyaltyLedgerEntryExpiryDateChange&gt;**](LoyaltyLedgerEntryExpiryDateChange.md) | List of transactions affected by the expiry date update. |  [optional]



