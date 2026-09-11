

# ApplicationEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**applicationId** | **Long** | The ID of the Application that owns this entity. | 
**profileId** | **Long** | The globally unique Talon.One ID of the customer that created this entity. |  [optional]
**storeId** | **Long** | The ID of the store. |  [optional]
**storeIntegrationId** | **String** | The integration ID of the store. You choose this ID when you create a store. |  [optional]
**integrationId** | **String** | The unique ID of the event. Only one event with this ID can be registered.  |  [optional]
**sessionId** | **Long** | The globally unique Talon.One ID of the session that contains this event. |  [optional]
**type** | **String** | The name of the event. Must be a [custom event](https://docs.talon.one/docs/dev/concepts/entities/events#custom-events), not a built-in event. | 
**attributes** | [**Object**](.md) | Additional JSON serialized data associated with the event. | 
**effects** | [**List&lt;Effect&gt;**](Effect.md) | An array containing the effects that were applied as a result of this event. | 
**ruleFailureReasons** | [**List&lt;RuleFailureReason&gt;**](RuleFailureReason.md) | An array containing the rule failure reasons which happened during this event. |  [optional]



