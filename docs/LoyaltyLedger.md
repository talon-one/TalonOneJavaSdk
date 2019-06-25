
# LoyaltyLedger

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | [**BigDecimal**](BigDecimal.md) | The current balance in the program. | 
**transactions** | [**List&lt;LoyaltyLedgerEntry&gt;**](LoyaltyLedgerEntry.md) | Transactions contains a list of all events that have happened such as additions, subtractions and expiries | 
**expiringPoints** | [**List&lt;LoyaltyLedgerEntry&gt;**](LoyaltyLedgerEntry.md) | ExpiringPoints contains a list of all points that will expiry and when |  [optional]
**loyaltyProgramId** | **Integer** | The ID of the loyalty program this ledger belongs to. |  [optional]
**loyaltyProgramName** | **String** | The name of the loyalty program this ledger belongs to. |  [optional]



