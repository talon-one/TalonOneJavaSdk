

# LedgerPointsEntryIntegrationAPI

Loyalty profile points with start and expiry dates.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | ID of the transaction that adds loyalty points. | 
**transactionUUID** | **String** | Unique identifier of the transaction in the UUID format. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time the loyalty points were added. | 
**programId** | **Long** | ID of the loyalty program. | 
**customerSessionId** | **String** | ID of the customer session where points were added. |  [optional]
**name** | **String** | Name or reason of the transaction that adds loyalty points. | 
**startDate** | **String** | When points become active. Possible values:   - &#x60;immediate&#x60;: Points are active immediately.   - &#x60;timestamp value&#x60;: Points become active at a given date and time.  | 
**expiryDate** | **String** | Date when points expire. Possible values are:   - &#x60;unlimited&#x60;: Points have no expiration date.   - &#x60;timestamp value&#x60;: Points expire on the given date and time.  | 
**subledgerId** | **String** | ID of the subledger. | 
**amount** | [**BigDecimal**](BigDecimal.md) | Amount of loyalty points added in the transaction. | 



