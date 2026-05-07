

# AchievementAdditionalPropertiesV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Long** | The ID of the user that created this achievement. | 
**createdBy** | **String** | Name of the user that created the achievement.  **Note**: This is not available if the user has been deleted.  |  [optional]
**hasProgress** | **Boolean** | Indicates if a customer has made progress in the achievement. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the achievement. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
INPROGRESS | &quot;inprogress&quot;
EXPIRED | &quot;expired&quot;
NOT_STARTED | &quot;not_started&quot;
COMPLETED | &quot;completed&quot;



