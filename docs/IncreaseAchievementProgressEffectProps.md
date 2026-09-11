

# IncreaseAchievementProgressEffectProps

This effect indicates that the customer's progress in an achievement was updated during the current session. It is triggered when a rule using the [Update customer progress](https://docs.talon.one/docs/product/rules/effects/use-effects#update-customer-progress) effect is successfully validated.  For [on-completion achievements](https://docs.talon.one/docs/product/achievements/overview#recurring-on-completion-achievements), any customer progress exceeding the target automatically starts a new iteration. This generates a new `progressTrackerId` for each iteration, and there can be multiple progress updates for the same achievement from a single validation of this effect.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**achievementId** | **Long** | The internal ID of the achievement. | 
**achievementName** | **String** | The name of the achievement. | 
**progressTrackerId** | **Long** | The internal ID of the customer progress tracker. For [on-completion achievements](https://docs.talon.one/docs/product/achievements/overview#recurring-on-completion-achievements), this effect generates a unique ID for each iteration. |  [optional]
**delta** | [**BigDecimal**](BigDecimal.md) | The value by which the customer&#39;s current progress in the achievement has increased. | 
**value** | [**BigDecimal**](BigDecimal.md) | The current progress of the customer in the achievement. | 
**target** | [**BigDecimal**](BigDecimal.md) | The target value to complete the achievement. | 
**isJustCompleted** | **Boolean** | Indicates if the customer has completed the achievement in the current session. | 



