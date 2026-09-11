

# UnlockRewardEffectProps

The properties specific to the \"unlockReward\" effect. This gets triggered whenever a validated rule unlocks a reward for a customer profile.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integrationId** | **String** | The integration ID assigned to the customer reward unlock. | 
**rewardId** | **Long** | The internal ID of the reward that was unlocked. | 
**applicationId** | **Long** | The internal ID of the application the reward belongs to. | 
**profileIntegrationId** | **String** | The integration ID of the customer profile that unlocked the reward. | 
**unlockedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time the reward was unlocked. | 
**cardIdentifier** | **String** | The identifier of the loyalty card, which must match the regular expression &#x60;^[A-Za-z0-9._%+@-]+$&#x60;.  |  [optional]



