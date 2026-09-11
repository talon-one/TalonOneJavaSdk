

# WillAwardGiveawayEffectProps

The equivalent of the `awardGiveaway` effect but returned when updating a session with any state other than `closed`. This ensures no giveaway codes are leaked when they are still not guaranteed to be awarded.  For more information about session states, see [Manage the session's state](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions#manage-the-sessions-state).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**poolId** | **Long** | The internal ID of the giveaway pool. | 
**poolName** | **String** | The name of the giveaway pool. | 
**recipientIntegrationId** | **String** | The integration ID of the customer that receives the giveaway. | 



