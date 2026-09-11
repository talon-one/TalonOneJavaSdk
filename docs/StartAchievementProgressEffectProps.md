

# StartAchievementProgressEffectProps

This effect indicates that the customer's progress in an achievement was started during the current session. The progress value is set to 0. It is triggered when a rule using the [Start achievement progress](https://docs.talon.one/docs/product/rules/effects/use-effects#start-achievement-progress) effect is successfully validated.  This effect only marks the start of progress tracking. It can fire together with `increaseAchievementProgress` when progress starts and increases at the same time. In that case, both effects share the same `progressTrackerId`, `startDate`, and `endDate`.  For [on-completion achievements](https://docs.talon.one/docs/product/campaigns/achievements/overview#recurring-on-completion-achievements), each iteration also gets its own `startDate` and `endDate`. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**achievementId** | **Long** | The ID of the achievement. | 
**achievementName** | **String** | The name of the achievement. | 
**progressTrackerId** | **Long** | The ID of the customer&#39;s progress tracker for this achievement.  For [on-completion achievements](https://docs.talon.one/docs/product/campaigns/achievements/overview#recurring-on-completion-achievements), this effect generates a unique ID for each iteration. |  [optional]
**target** | [**BigDecimal**](BigDecimal.md) | The target value to complete the achievement. | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which the customer&#39;s progress started. | 
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which this progress period ends.  Only returned for achievements that have a fixed end date. [On-completion achievements](https://docs.talon.one/docs/product/campaigns/achievements/overview#recurring-on-completion-achievements) have no end date. |  [optional]



