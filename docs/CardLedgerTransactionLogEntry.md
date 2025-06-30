

# CardLedgerTransactionLogEntry

Log entry for a given loyalty card transaction.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time the loyalty card transaction occurred. | 
**programId** | **Integer** | ID of the loyalty program. | 
**cardIdentifier** | **String** | The alphanumeric identifier of the loyalty card.  | 
**applicationId** | **Integer** | The ID of the Application that owns this entity. |  [optional]
**sessionId** | **Integer** | The **internal** ID of the session.  |  [optional]
**customerSessionId** | **String** | ID of the customer session where the transaction occurred. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of transaction. Possible values:   - &#x60;addition&#x60;: Signifies added points.   - &#x60;subtraction&#x60;: Signifies deducted points.  | 
**name** | **String** | Name or reason of the loyalty ledger transaction. | 
**startDate** | **String** | When points become active. Possible values:   - &#x60;immediate&#x60;: Points are immediately active.   - a timestamp value: Points become active at a given date and time.  | 
**expiryDate** | **String** | Date when points expire. Possible values are:   - &#x60;unlimited&#x60;: Points have no expiration date.   - &#x60;timestamp value&#x60;: Points become active from the given date.  | 
**subledgerId** | **String** | ID of the subledger. | 
**amount** | [**BigDecimal**](BigDecimal.md) | Amount of loyalty points added or deducted in the transaction. | 
**id** | **Integer** | ID of the loyalty ledger entry. | 



## Enum: TypeEnum

Name | Value
---- | -----
ADDITION | &quot;addition&quot;
SUBTRACTION | &quot;subtraction&quot;



