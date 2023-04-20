

# ApplicationEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**applicationId** | **Integer** | The ID of the application that owns this entity. | 
**profileId** | **Integer** | The globally unique Talon.One ID of the customer that created this entity. |  [optional]
**sessionId** | **Integer** | The globally unique Talon.One ID of the session that contains this event. |  [optional]
**type** | **String** | A string representing the event. Must not be a reserved event name. | 
**attributes** | [**Object**](.md) | Additional JSON serialized data associated with the event. | 
**effects** | [**List&lt;Effect&gt;**](Effect.md) | An array containing the effects that were applied as a result of this event. | 
**ruleFailureReasons** | [**List&lt;RuleFailureReason&gt;**](RuleFailureReason.md) | An array containing the rule failure reasons which happened during this event. |  [optional]



