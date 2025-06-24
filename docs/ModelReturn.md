

# ModelReturn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**applicationId** | **Long** | The ID of the Application that owns this entity. | 
**accountId** | **Long** | The ID of the account that owns this entity. | 
**returnedCartItems** | [**List&lt;ReturnedCartItem&gt;**](ReturnedCartItem.md) | List of cart items to be returned. | 
**eventId** | **Long** | The event ID of that was generated for this return. | 
**sessionId** | **Long** | The internal ID of the session this return was requested on. | 
**sessionIntegrationId** | **String** | The integration ID of the session this return was requested on. | 
**profileId** | **Long** | The internal ID of the profile this return was requested on. |  [optional]
**profileIntegrationId** | **String** | The integration ID of the profile this return was requested on. |  [optional]
**createdBy** | **Long** | ID of the user who requested this return. |  [optional]



