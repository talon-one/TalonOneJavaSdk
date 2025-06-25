

# LedgerEntry

Entry in the point ledger.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**profileId** | **String** | ID of the customer profile set by your integration layer.  **Note:** If the customer does not yet have a known &#x60;profileId&#x60;, we recommend you use a guest &#x60;profileId&#x60;.  | 
**accountId** | **Long** | The ID of the Talon.One account that owns this profile. | 
**loyaltyProgramId** | **Long** | ID of the ledger. | 
**eventId** | **Long** | ID of the related event. | 
**amount** | **Long** | Amount of loyalty points. | 
**reason** | **String** | reason for awarding/deducting points. | 
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiration date of the points. | 
**referenceId** | **Long** | The ID of the balancing ledgerEntry. |  [optional]



