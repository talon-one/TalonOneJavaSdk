

# LoyaltySubLedger

Ledger of Balance in Loyalty Program for a Customer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | [**BigDecimal**](BigDecimal.md) | ⚠️ Deprecated: Please use &#39;totalActivePoints&#39; property instead. Total amount of currently active and available points in the customer&#39;s balance  | 
**totalActivePoints** | [**BigDecimal**](BigDecimal.md) | Total amount of currently active and available points in the customer&#39;s balance | 
**totalPendingPoints** | [**BigDecimal**](BigDecimal.md) | Total amount of pending points, which are not active yet but will become active in the future | 
**totalSpentPoints** | [**BigDecimal**](BigDecimal.md) | Total amount of points already spent by this customer | 
**totalExpiredPoints** | [**BigDecimal**](BigDecimal.md) | Total amount of points, that expired without ever being spent | 
**transactions** | [**List&lt;LoyaltyLedgerEntry&gt;**](LoyaltyLedgerEntry.md) | List of all events that have happened such as additions, subtractions and expiries |  [optional]
**expiringPoints** | [**List&lt;LoyaltyLedgerEntry&gt;**](LoyaltyLedgerEntry.md) | List of all points that will expire |  [optional]
**activePoints** | [**List&lt;LoyaltyLedgerEntry&gt;**](LoyaltyLedgerEntry.md) | List of all currently active points |  [optional]
**pendingPoints** | [**List&lt;LoyaltyLedgerEntry&gt;**](LoyaltyLedgerEntry.md) | List of all points pending activation |  [optional]
**expiredPoints** | [**List&lt;LoyaltyLedgerEntry&gt;**](LoyaltyLedgerEntry.md) | List of expired points |  [optional]



