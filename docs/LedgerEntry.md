
# LedgerEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**profileId** | **String** | ID of the customers profile as used within this Talon.One account. May be omitted or set to the empty string if the customer does not yet have a known profile ID. |  [optional]
**accountId** | **Integer** | The ID of the Talon.One account that owns this profile. | 
**loyaltyProgramId** | **Integer** | ID of the ledger | 
**eventId** | **Integer** | ID of the related event | 
**amount** | **Integer** | Amount of points | 
**reason** | **String** | reason for awarding/deducting points | 
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiry date of the points | 
**referenceId** | **Integer** | The ID of the balancing ledgerEntry |  [optional]



