

# RewardCatalogItem

A reward returned by the rewards catalog Integration API endpoint.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The unique ID of the reward. | 
**name** | **String** | The customer-facing name of the reward. | 
**description** | **String** | The customer-facing description of the reward. |  [optional]
**pointsRequired** | [**List&lt;RewardPointsRequired&gt;**](RewardPointsRequired.md) | The loyalty points required to activate the reward. |  [optional]
**rule** | [**RuleMetadata**](RuleMetadata.md) |  | 
**eligibility** | [**RewardEligibility**](RewardEligibility.md) |  |  [optional]



