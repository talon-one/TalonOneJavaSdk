

# IncreaseAchievementProgressEffectProps

The properties specific to the \"increaseAchievementProgress\" effect. This gets triggered whenever a validated rule contained an \"increase customer progress\" effect.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**achievementId** | **Integer** | The internal ID of the achievement. | 
**achievementName** | **String** | The name of the achievement. | 
**progressTrackerId** | **Integer** | The internal ID of the achievement progress tracker. |  [optional]
**delta** | [**BigDecimal**](BigDecimal.md) | The value by which the customer&#39;s current progress in the achievement is increased. | 
**value** | [**BigDecimal**](BigDecimal.md) | The current progress of the customer in the achievement. | 
**target** | [**BigDecimal**](BigDecimal.md) | The target value to complete the achievement. | 
**isJustCompleted** | **Boolean** | Indicates if the customer has completed the achievement in the current session. | 



