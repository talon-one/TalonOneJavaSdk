

# LoyaltyLedgerEntry

A single row of the ledger, describing one addition or deduction.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**programID** | **Integer** |  | 
**customerProfileID** | **String** |  | 
**customerSessionID** | **String** |  |  [optional]
**eventID** | **Integer** |  |  [optional]
**type** | **String** | The type of the ledger transaction. Possible values are addition, subtraction, expire or expiring (for expiring points ledgers)  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**name** | **String** | A name referencing the condition or effect that added this entry, or the specific name provided in an API call. | 
**subLedgerID** | **String** | This specifies if we are adding loyalty points to the main ledger or a subledger | 
**userID** | **Integer** | This is the ID of the user who created this entry, if the addition or subtraction was done manually. |  [optional]



