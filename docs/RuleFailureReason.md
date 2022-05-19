

# RuleFailureReason

Details about why a rule failed.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignID** | **Integer** | The ID of the campaign that contains the rule that failed | 
**campaignName** | **String** | The name of the campaign that contains the rule that failed | 
**rulesetID** | **Integer** | The ID of the ruleset that contains the rule that failed | 
**couponID** | **Integer** | The ID of the coupon that was being evaluated at the time of the rule failure |  [optional]
**couponValue** | **String** | The value of the coupon that was being evaluated at the time of the rule failure |  [optional]
**referralID** | **Integer** | The ID of the referral that was being evaluated at the time of the rule failure |  [optional]
**referralValue** | **String** | The value of the referral that was being evaluated at the time of the rule failure |  [optional]
**ruleIndex** | **Integer** | The index of the rule that failed within the ruleset | 
**ruleName** | **String** | The name of the rule that failed within the ruleset | 
**conditionIndex** | **Integer** | The index of the condition that failed |  [optional]
**effectIndex** | **Integer** | The index of the effect that failed |  [optional]
**details** | **String** | More details about the failure |  [optional]



