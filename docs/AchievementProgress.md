

# AchievementProgress

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**achievementId** | **Integer** | The internal ID of the achievement. | 
**name** | **String** | The internal name of the achievement used in API requests.  | 
**title** | **String** | The display name of the achievement in the Campaign Manager. | 
**description** | **String** | The description of the achievement in the Campaign Manager. | 
**campaignId** | **Integer** | The ID of the campaign the achievement belongs to. | 
**status** | [**StatusEnum**](#StatusEnum) | The status of the achievement. | 
**target** | [**BigDecimal**](BigDecimal.md) | The required number of actions or the transactional milestone to complete the achievement. |  [optional]
**progress** | [**BigDecimal**](BigDecimal.md) | The current progress of the customer in the achievement. | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which the customer started the achievement. | 
**completionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the customer completed the achievement. |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the achievement ends and resets for the customer. | 



## Enum: StatusEnum

Name | Value
---- | -----
INPROGRESS | &quot;inprogress&quot;
COMPLETED | &quot;completed&quot;
EXPIRED | &quot;expired&quot;



