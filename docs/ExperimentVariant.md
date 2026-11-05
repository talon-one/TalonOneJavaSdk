

# ExperimentVariant

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**name** | **String** |  | 
**experimentId** | **Long** |  |  [optional]
**ruleset** | [**Ruleset**](Ruleset.md) |  |  [optional]
**weight** | **Long** |  |  [optional]
**isPrimary** | **Boolean** |  | 
**audienceId** | **Long** | The ID of the audience this variant targets. Only used when the experiment &#x60;assignmentType&#x60; is &#x60;audience&#x60;.  |  [optional]



