

# LoyaltyProgramLedgers

Customer-specific information about loyalty points.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The internal ID of loyalty program. | 
**title** | **String** | Visible name of loyalty program. | 
**name** | **String** | Internal name of loyalty program. | 
**joinDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the customer joined the loyalty program in RFC3339.  **Note**: This is in the loyalty program&#39;s time zone.  |  [optional]
**ledger** | [**LedgerInfo**](LedgerInfo.md) |  | 
**subLedgers** | [**Map&lt;String, LedgerInfo&gt;**](LedgerInfo.md) | A map containing information about each loyalty subledger. |  [optional]



