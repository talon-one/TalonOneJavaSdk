

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
**selectedPriceType** | **String** | The selected price type for this cart item (e.g. the price for members only). |  [optional]
**selectedPrice** | [**BigDecimal**](BigDecimal.md) | The value of the selected price type to apply to the SKU targeted by this effect, before any discounts are applied. |  [optional]
**adjustmentReferenceId** | **String** | The reference identifier of the selected price adjustment for this cart item. |  [optional]
**targets** | **List&lt;Object&gt;** | A list of entities (e.g. audiences) targeted by this effect. |  [optional]



