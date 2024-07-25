

# EffectEntity

Definition of all properties that are present on all effects, independent of their type.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **Integer** | The ID of the campaign that triggered this effect. | 
**rulesetId** | **Integer** | The ID of the ruleset that was active in the campaign when this effect was triggered. | 
**ruleIndex** | **Integer** | The position of the rule that triggered this effect within the ruleset. | 
**ruleName** | **String** | The name of the rule that triggered this effect. | 
**effectType** | **String** | The type of effect that was triggered. See [API effects](https://docs.talon.one/docs/dev/integration-api/api-effects). | 
**triggeredByCoupon** | **Integer** | The ID of the coupon that was being evaluated when this effect was triggered. |  [optional]
**triggeredForCatalogItem** | **Integer** | The ID of the catalog item that was being evaluated when this effect was triggered. |  [optional]
**conditionIndex** | **Integer** | The index of the condition that was triggered. |  [optional]
**evaluationGroupID** | **Integer** | The ID of the evaluation group. For more information, see [Managing campaign evaluation](https://docs.talon.one/docs/product/applications/managing-campaign-evaluation). |  [optional]
**evaluationGroupMode** | **String** | The evaluation mode of the evaluation group. For more information, see [Managing campaign evaluation](https://docs.talon.one/docs/product/applications/managing-campaign-evaluation). |  [optional]



