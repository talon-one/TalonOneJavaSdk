

# AchievementProgressWithDefinition

The current progress of the customer in the achievement.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | The status of the achievement. | 
**progress** | [**BigDecimal**](BigDecimal.md) | The current progress of the customer in the achievement. | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which the customer started the achievement. |  [optional]
**completionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the customer completed the achievement. |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the achievement ends and resets for the customer. |  [optional]
**achievementId** | **Integer** | The internal ID of the achievement. | 
**name** | **String** | The internal name of the achievement used in API requests.  | 
**title** | **String** | The display name of the achievement in the Campaign Manager. | 
**description** | **String** | The description of the achievement in the Campaign Manager. | 
**campaignId** | **Integer** | The ID of the campaign the achievement belongs to. | 
**target** | [**BigDecimal**](BigDecimal.md) | The required number of actions or the transactional milestone to complete the achievement. |  [optional]
**achievementRecurrencePolicy** | [**AchievementRecurrencePolicyEnum**](#AchievementRecurrencePolicyEnum) | The policy that determines if and how the achievement recurs. - &#x60;no_recurrence&#x60;: The achievement can be completed only once. - &#x60;on_expiration&#x60;: The achievement resets after it expires and becomes available again.  | 
**achievementActivationPolicy** | [**AchievementActivationPolicyEnum**](#AchievementActivationPolicyEnum) | The policy that determines how the achievement starts, ends, or resets. - &#x60;user_action&#x60;: The achievement ends or resets relative to when the customer started the achievement. - &#x60;fixed_schedule&#x60;: The achievement starts, ends, or resets for all customers following a fixed schedule.  | 
**achievementFixedStartDate** | [**OffsetDateTime**](OffsetDateTime.md) | The achievement&#39;s start date when &#x60;achievementActivationPolicy&#x60; is equal to &#x60;fixed_schedule&#x60;.  **Note:** It is an RFC3339 timestamp string.  |  [optional]
**achievementEndDate** | [**OffsetDateTime**](OffsetDateTime.md) | The achievement&#39;s end date. If defined, customers cannot participate in the achievement after this date.  **Note:** It is an RFC3339 timestamp string.  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
INPROGRESS | &quot;inprogress&quot;
COMPLETED | &quot;completed&quot;
EXPIRED | &quot;expired&quot;
NOT_STARTED | &quot;not_started&quot;



## Enum: AchievementRecurrencePolicyEnum

Name | Value
---- | -----
NO_RECURRENCE | &quot;no_recurrence&quot;
ON_EXPIRATION | &quot;on_expiration&quot;



## Enum: AchievementActivationPolicyEnum

Name | Value
---- | -----
USER_ACTION | &quot;user_action&quot;
FIXED_SCHEDULE | &quot;fixed_schedule&quot;



