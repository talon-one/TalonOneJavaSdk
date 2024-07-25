

# RollbackIncreasedAchievementProgressEffectProps

The properties specific to the \"rollbackIncreasedAchievementProgress\" effect. This gets triggered whenever a closed session where the `increaseAchievementProgress` effect was triggered is cancelled. This is applicable only when the customer has not completed the achievement.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**achievementId** | **Integer** | The internal ID of the achievement. | 
**achievementName** | **String** | The name of the achievement. | 
**progressTrackerId** | **Integer** | The internal ID of the achievement progress tracker. | 
**decreaseProgressBy** | [**BigDecimal**](BigDecimal.md) | The value by which the customer&#39;s current progress in the achievement is decreased. | 
**currentProgress** | [**BigDecimal**](BigDecimal.md) | The current progress of the customer in the achievement. | 
**target** | [**BigDecimal**](BigDecimal.md) | The target value to complete the achievement. | 



