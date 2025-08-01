

# Store

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**name** | **String** | The name of the store. | 
**description** | **String** | The description of the store. | 
**attributes** | [**Object**](.md) | The attributes of the store. |  [optional]
**integrationId** | **String** | The integration ID of the store. You choose this ID when you create a store.  **Note**: You cannot edit the &#x60;integrationId&#x60; after the store has been created.  | 
**applicationId** | **Long** | The ID of the Application that owns this entity. | 
**updated** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent update on this entity. | 
**linkedCampaignIds** | **List&lt;Long&gt;** | A list of IDs of the campaigns that are linked with current store. |  [optional]



