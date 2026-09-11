

# RewardEligibilityFailureDetails

The details about why the customer is not eligible for the reward.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**failureCode** | [**FailureCodeEnum**](#FailureCodeEnum) | A code identifying why the customer is not eligible for the reward. | 
**conditionIndex** | **Long** | The index of the eligibility condition that the customer did not meet. Only applicable when &#x60;failureCode&#x60; is &#x60;CONDITION_NOT_MET&#x60;. |  [optional]



## Enum: FailureCodeEnum

Name | Value
---- | -----
CONDITION_NOT_MET | &quot;CONDITION_NOT_MET&quot;
INSUFFICIENT_BALANCE | &quot;INSUFFICIENT_BALANCE&quot;
CARD_REQUIRED | &quot;CARD_REQUIRED&quot;
PROFILE_REQUIRED | &quot;PROFILE_REQUIRED&quot;



