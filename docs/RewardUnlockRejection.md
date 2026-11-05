

# RewardUnlockRejection

Returned when a reward unlock is rejected by the Rule Engine, for example because the customer already unlocked this reward, the customer has insufficient points, or the reward's eligibility conditions are not met. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** | A human-readable summary of why the reward unlock was rejected. | 
**ruleFailureReasons** | [**List&lt;RuleFailureReason&gt;**](RuleFailureReason.md) | The reasons why the reward could not be unlocked. | 



