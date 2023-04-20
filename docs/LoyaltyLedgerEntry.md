

# LoyaltyLedgerEntry

A single row of the ledger, describing one addition or deduction.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**programID** | **Integer** |  | 
**customerProfileID** | **String** |  |  [optional]
**cardID** | **Integer** |  |  [optional]
**customerSessionID** | **String** |  |  [optional]
**eventID** | **Integer** |  |  [optional]
**type** | **String** | The type of the ledger transaction. Possible values are: - &#x60;addition&#x60; - &#x60;subtraction&#x60; - &#x60;expire&#x60; - &#x60;expiring&#x60; (for expiring points ledgers)  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**name** | **String** | A name referencing the condition or effect that added this entry, or the specific name provided in an API call. | 
**subLedgerID** | **String** | This specifies if we are adding loyalty points to the main ledger or a subledger. | 
**userID** | **Integer** | This is the ID of the user who created this entry, if the addition or subtraction was done manually. |  [optional]
**archived** | **Boolean** | Indicates if the entry belongs to the archived session. |  [optional]



