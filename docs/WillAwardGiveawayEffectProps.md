

# WillAwardGiveawayEffectProps

The properties specific to the \"awardGiveaway\" effect when the session is not closed yet. This effect replaces \"awardGiveaway\" only when updating a session with any state other than \"closed\". This is to ensure no giveaway codes are leaked when they are still not guaranteed to be awarded.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**poolId** | **Long** | The ID of the giveaways pool the code will be taken from. | 
**poolName** | **String** | The name of the giveaways pool the code will be taken from. | 
**recipientIntegrationId** | **String** | The integration ID of the profile that will be awarded the giveaway. | 



