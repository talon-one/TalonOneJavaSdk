

# LedgerTransactionLogEntryIntegrationAPI

Log entry for a given loyalty profile transaction.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionUUID** | **String** | Unique identifier of the transaction in the UUID format. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time the loyalty transaction occurred. | 
**programId** | **Long** | ID of the loyalty program. | 
**customerSessionId** | **String** | ID of the customer session where the transaction occurred. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of transaction. Possible values:   - &#x60;addition&#x60;: Signifies added points.   - &#x60;subtraction&#x60;: Signifies deducted points.  | 
**name** | **String** | Name or reason of the loyalty ledger transaction. | 
**startDate** | **String** | When points become active. Possible values:   - &#x60;immediate&#x60;: Points are immediately active.   - a timestamp value: Points become active at a given date and time.  | 
**expiryDate** | **String** | Date when points expire. Possible values are:   - &#x60;unlimited&#x60;: Points have no expiration date.   - &#x60;timestamp value&#x60;: Points expire on the given date.  | 
**subledgerId** | **String** | ID of the subledger. | 
**amount** | [**BigDecimal**](BigDecimal.md) | Amount of loyalty points added or deducted in the transaction. | 
**id** | **Long** | ID of the loyalty ledger transaction. | 
**rulesetId** | **Long** | The ID of the ruleset containing the rule that triggered this effect. |  [optional]
**ruleName** | **String** | The name of the rule that triggered this effect. |  [optional]
**flags** | [**LoyaltyLedgerEntryFlags**](LoyaltyLedgerEntryFlags.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
ADDITION | &quot;addition&quot;
SUBTRACTION | &quot;subtraction&quot;



