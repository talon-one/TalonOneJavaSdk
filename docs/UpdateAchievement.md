

# UpdateAchievement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The internal name of the achievement used in API requests.  |  [optional]
**title** | **String** | The display name for the achievement in the Campaign Manager. |  [optional]
**description** | **String** | A description of the achievement. |  [optional]
**target** | [**BigDecimal**](BigDecimal.md) | The required number of actions or the transactional milestone to complete the achievement. |  [optional]
**period** | **String** | The relative duration after which the achievement ends and resets for a particular customer profile.  |  [optional]
**periodEndOverride** | [**TimePoint**](TimePoint.md) |  |  [optional]
**recurrencePolicy** | [**RecurrencePolicyEnum**](#RecurrencePolicyEnum) | The policy that determines if and how the achievement recurs. - &#x60;no_recurrence&#x60;: The achievement can be completed only once. - &#x60;on_expiration&#x60;: The achievement resets after it expires and becomes available again.  |  [optional]
**activationPolicy** | [**ActivationPolicyEnum**](#ActivationPolicyEnum) | The policy that determines how the achievement starts, ends, or resets. - &#x60;user_action&#x60;: The achievement ends or resets relative to when the customer started the achievement. - &#x60;fixed_schedule&#x60;: The achievement starts, ends, or resets for all customers following a fixed schedule.  |  [optional]
**fixedStartDate** | [**OffsetDateTime**](OffsetDateTime.md) | The achievement&#39;s start date when &#x60;activationPolicy&#x60; is set to &#x60;fixed_schedule&#x60;.  **Note:** It must be an RFC3339 timestamp string.  |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The achievement&#39;s end date. If defined, customers cannot participate in the achievement after this date.  **Note:** It must be an RFC3339 timestamp string.  |  [optional]



## Enum: RecurrencePolicyEnum

Name | Value
---- | -----
NO_RECURRENCE | &quot;no_recurrence&quot;
ON_EXPIRATION | &quot;on_expiration&quot;



## Enum: ActivationPolicyEnum

Name | Value
---- | -----
USER_ACTION | &quot;user_action&quot;
FIXED_SCHEDULE | &quot;fixed_schedule&quot;



