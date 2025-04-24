

# ModelReturn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**applicationId** | **Integer** | The ID of the Application that owns this entity. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**returnedCartItems** | [**List&lt;ReturnedCartItem&gt;**](ReturnedCartItem.md) | List of cart items to be returned. | 
**eventId** | **Integer** | The event ID of that was generated for this return. | 
**sessionId** | **Integer** | The internal ID of the session this return was requested on. | 
**sessionIntegrationId** | **String** | The integration ID of the session this return was requested on. | 
**profileId** | **Integer** | The internal ID of the profile this return was requested on. |  [optional]
**profileIntegrationId** | **String** | The integration ID of the profile this return was requested on. |  [optional]
**createdBy** | **Integer** | ID of the user who requested this return. |  [optional]



