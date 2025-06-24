

# StrikethroughEffect

The effect produced for the catalog item.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **Long** | The ID of the campaign that effect belongs to. | 
**rulesetId** | **Long** | The ID of the ruleset containing the rule that triggered this effect. | 
**ruleIndex** | **Long** | The position of the rule that triggered this effect within the ruleset. | 
**ruleName** | **String** | The name of the rule that triggered this effect. | 
**type** | **String** | The type of this effect. | 
**props** | [**Object**](.md) |  | 
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the time frame where the effect is active in UTC. |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the time frame where the effect is active in UTC. |  [optional]



