

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
**type** | [**TypeEnum**](#TypeEnum) |  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**name** | **String** | A name referencing the condition or effect that added this entry, or the specific name provided in an API call. | 
**subLedgerID** | **String** | This specifies if we are adding loyalty points to the main ledger or a subledger | 



## Enum: TypeEnum

Name | Value
---- | -----
ADDITION | &quot;addition&quot;
SUBTRACTION | &quot;subtraction&quot;



