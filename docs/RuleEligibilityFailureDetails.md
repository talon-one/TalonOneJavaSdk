

# RuleEligibilityFailureDetails

The details about why the customer was not eligible for the rule in the current session.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**failureCode** | [**FailureCodeEnum**](#FailureCodeEnum) | A code identifying why the customer was not eligible for the rule in the current session. | 
**couponID** | **Long** | The ID of the coupon that was being evaluated when the rule failed.  |  [optional]
**couponValue** | **String** | The coupon code that was being evaluated when the rule failed.  |  [optional]
**referralID** | **Long** | The ID of the referral that was being evaluated when the rule failed.  |  [optional]
**referralValue** | **String** | The referral code that was being evaluated when the rule failed.  |  [optional]
**conditionIndex** | **Long** | The index of the condition that caused the rule to fail. |  [optional]
**effectIndex** | **Long** | The index of the effect that caused the rule to fail. |  [optional]
**details** | **String** | Additional details about the failure. | 



## Enum: FailureCodeEnum

Name | Value
---- | -----
CONDITION_NOT_MET | &quot;CONDITION_NOT_MET&quot;
EFFECT_FAILED | &quot;EFFECT_FAILED&quot;



