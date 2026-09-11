

# CheckAchievementBlock

A block that checks the current customer's completion or progress status in an achievement.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | **String** | Identifies the block variant and determines which additional properties are present in it. | 
**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly]
**operator** | [**OperatorEnum**](#OperatorEnum) | The comparison operator applied to the achievement. | 
**achievement** | [**CheckAchievementBlockAchievement**](CheckAchievementBlockAchievement.md) |  | 
**onFailure** | **List&lt;Object&gt;** | Promotion blocks evaluated when this block fails or returns false. |  [optional]



## Enum: OperatorEnum

Name | Value
---- | -----
JUSTCOMPLETED | &quot;justCompleted&quot;
STARTED | &quot;started&quot;
NOT_STARTED_ | &quot;not(started)&quot;
INPROGRESS | &quot;inProgress&quot;
NOT_INPROGRESS_ | &quot;not(inProgress)&quot;
COMPLETED | &quot;completed&quot;
NOT_COMPLETED_ | &quot;not(completed)&quot;



