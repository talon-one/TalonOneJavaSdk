

# EffectIncreaseAchievementProgressPerItem

The `increaseAchievementProgressPerItem` effect and its properties. See [API effects](https://docs.talon.one/docs/dev/integration-api/api-effects).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**experimentId** | **Long** | The ID of the experiment that campaign belongs to. |  [optional]
**campaignId** | **Long** | The ID of the campaign that triggered this effect. | 
**rulesetId** | **Long** | The ID of the ruleset that was active in the campaign when this effect was triggered. | 
**ruleIndex** | **Long** | The position of the rule that triggered this effect within the ruleset. | 
**ruleName** | **String** | The name of the rule that triggered this effect. | 
**effectType** | [**EffectTypeEnum**](#EffectTypeEnum) | An effect discriminator of type &#x60;increaseAchievementProgressPerItem&#x60;. | 
**triggeredByCoupon** | **Long** | The ID of the coupon that was being evaluated when this effect was triggered. |  [optional]
**triggeredForCatalogItem** | **Long** | The ID of the catalog item that was being evaluated when this effect was triggered. |  [optional]
**conditionIndex** | **Long** | The index of the condition that was triggered. |  [optional]
**evaluationGroupID** | **Long** | The ID of the evaluation group. For more information, see [Managing campaign evaluation](https://docs.talon.one/docs/product/applications/managing-campaign-evaluation). |  [optional]
**evaluationGroupMode** | **String** | The evaluation mode of the evaluation group. For more information, see [Managing campaign evaluation](https://docs.talon.one/docs/product/applications/managing-campaign-evaluation). |  [optional]
**campaignRevisionId** | **Long** | The revision ID of the campaign that was used when triggering the effect. |  [optional]
**campaignRevisionVersionId** | **Long** | The revision version ID of the campaign that was used when triggering the effect. |  [optional]
**selectedPriceType** | **String** | The selected price type for the SKU targeted by this effect. |  [optional]
**selectedPrice** | [**BigDecimal**](BigDecimal.md) | The value of the selected price type to apply to the SKU targeted by this effect, before any discounts are applied. |  [optional]
**adjustmentReferenceId** | [**UUID**](UUID.md) | The reference identifier of the selected price adjustment for this SKU. This is only returned if the &#x60;selectedPrice&#x60; resulted from a price adjustment. |  [optional]
**rewardId** | **Long** | The ID of the reward that was being evaluated when this effect was triggered. |  [optional]
**rewardIntegrationId** | **String** | The integration ID of the specific customer reward whose usage produced this effect. |  [optional]
**props** | [**IncreaseAchievementProgressPerItemEffectProps**](IncreaseAchievementProgressPerItemEffectProps.md) |  | 



## Enum: EffectTypeEnum

Name | Value
---- | -----
INCREASEACHIEVEMENTPROGRESSPERITEM | &quot;increaseAchievementProgressPerItem&quot;



