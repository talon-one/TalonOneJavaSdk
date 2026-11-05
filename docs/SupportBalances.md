

# SupportBalances

The loyalty points balance for a support agent and a specific customer profile.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**threshold** | [**BigDecimal**](BigDecimal.md) | The maximum number of loyalty points the support agent is allowed to award for this loyalty program. Not present if the agent has no configured limit.  |  [optional]
**awardedPoints** | [**BigDecimal**](BigDecimal.md) | The total number of loyalty points already awarded to this customer profile by this support agent.  | 
**remainingBalance** | [**BigDecimal**](BigDecimal.md) | The remaining number of loyalty points the support agent can still award to this customer profile. Not present if the agent has no configured limit.  |  [optional]



