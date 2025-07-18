

# Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**applicationId** | **Long** | The ID of the Application that owns this entity. | 
**profileId** | **String** | ID of the customer profile set by your integration layer.  **Note:** If the customer does not yet have a known &#x60;profileId&#x60;, we recommend you use a guest &#x60;profileId&#x60;.  |  [optional]
**storeIntegrationId** | **String** | The integration ID of the store. You choose this ID when you create a store. |  [optional]
**type** | **String** | A string representing the event. Must not be a reserved event name. | 
**attributes** | [**Object**](.md) | Arbitrary additional JSON data associated with the event. | 
**sessionId** | **String** | The ID of the session that this event occurred in. |  [optional]
**effects** | **List&lt;Object&gt;** | An array of effects generated by the rules of the enabled campaigns of the Application.  You decide how to apply them in your system. See the list of [API effects](https://docs.talon.one/docs/dev/integration-api/api-effects).  | 
**ledgerEntries** | [**List&lt;LedgerEntry&gt;**](LedgerEntry.md) | Ledger entries for the event. |  [optional]
**meta** | [**Meta**](Meta.md) |  |  [optional]



