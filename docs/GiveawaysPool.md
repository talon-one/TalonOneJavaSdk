

# GiveawaysPool

Giveaways pools is an entity for managing multiple similar giveaways.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**name** | **String** | The name of this giveaways pool. | 
**description** | **String** | The description of this giveaways pool. |  [optional]
**subscribedApplicationsIds** | **List&lt;Integer&gt;** | A list of the IDs of the applications that this giveaways pool is enabled for. |  [optional]
**sandbox** | **Boolean** | Indicates if this program is a live or sandbox program. Programs of a given type can only be connected to Applications of the same type. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent update to the giveaways pool. |  [optional]
**createdBy** | **Integer** | ID of the user who created this giveaways pool. | 
**modifiedBy** | **Integer** | ID of the user who last updated this giveaways pool if available. |  [optional]



