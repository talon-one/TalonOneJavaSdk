

# UpdateAchievementProgressBlock

A block that updates the progress of a customer in an achievement.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | **String** | Identifies the block variant and determines which additional properties are present in it. | 
**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly]
**operator** | [**OperatorEnum**](#OperatorEnum) |  | 
**value** | **String** | The value to update the progress by. Supports template placeholders (e.g. \&quot;{{$Session.Total / 2}}\&quot;) for dynamic quantities. | 
**achievement** | [**UpdateAchievementProgressBlockAchievement**](UpdateAchievementProgressBlockAchievement.md) |  | 



## Enum: OperatorEnum

Name | Value
---- | -----
INCREASEBY | &quot;increaseBy&quot;



