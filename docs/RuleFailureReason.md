

# RuleFailureReason

Details about why a rule failed.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignID** | **Long** | The ID of the campaign that contains the rule that failed. | 
**campaignName** | **String** | The name of the campaign that contains the rule that failed. | 
**rulesetID** | **Long** | The ID of the ruleset that contains the rule that failed. | 
**couponID** | **Long** | The ID of the coupon that was being evaluated at the time of the rule failure. |  [optional]
**couponValue** | **String** | The code of the coupon that was being evaluated at the time of the rule failure. |  [optional]
**referralID** | **Long** | The ID of the referral that was being evaluated at the time of the rule failure. |  [optional]
**referralValue** | **String** | The code of the referral that was being evaluated at the time of the rule failure. |  [optional]
**ruleIndex** | **Long** | The index of the rule that failed within the ruleset. | 
**ruleName** | **String** | The name of the rule that failed within the ruleset. | 
**conditionIndex** | **Long** | The index of the condition that failed. |  [optional]
**effectIndex** | **Long** | The index of the effect that failed. |  [optional]
**details** | **String** | More details about the failure. |  [optional]
**evaluationGroupID** | **Long** | The ID of the evaluation group. For more information, see [Managing campaign evaluation](https://docs.talon.one/docs/product/applications/managing-campaign-evaluation). |  [optional]
**evaluationGroupMode** | **String** | The evaluation mode of the evaluation group. For more information, see [Managing campaign evaluation](https://docs.talon.one/docs/product/applications/managing-campaign- |  [optional]



