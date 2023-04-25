

# LedgerEntry


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**profileId** | **String** | ID of the customer profile set by your integration layer.  **Note:** If the customer does not yet have a known &#x60;profileId&#x60;, we recommend you use a guest &#x60;profileId&#x60;.  | 
**accountId** | **Integer** | The ID of the Talon.One account that owns this profile. | 
**loyaltyProgramId** | **Integer** | ID of the ledger. | 
**eventId** | **Integer** | ID of the related event. | 
**amount** | **Integer** | Amount of loyalty points. | 
**reason** | **String** | reason for awarding/deducting points. | 
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiration date of the points. | 
**referenceId** | **Integer** | The ID of the balancing ledgerEntry. |  [optional]



