

# Event


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**applicationId** | **Integer** | The ID of the application that owns this entity. | 
**profileId** | **String** | ID of the customers profile as used within this Talon.One account.  **Note:** If the customer does not yet have a known profileId, we recommend you use a guest profileId.  |  [optional]
**type** | **String** | A string representing the event. Must not be a reserved event name. | 
**attributes** | [**Object**](.md) | Arbitrary additional JSON data associated with the event. | 
**sessionId** | **String** | The ID of the session that this event occurred in. |  [optional]
**effects** | **List&lt;Object&gt;** | An array of \&quot;effects\&quot; that must be applied in response to this event. See the list of [effects](/docs/dev/integration-api/api-effects).  | 
**ledgerEntries** | [**List&lt;LedgerEntry&gt;**](LedgerEntry.md) | Ledger entries for the event. | 
**meta** | [**Meta**](Meta.md) |  |  [optional]



