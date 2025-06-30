

# PriceType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**accountId** | **Integer** | The ID of the account that owns this price type. |  [optional]
**name** | **String** | The API name of the price type. This is an immutable value. | 
**title** | **String** | The title of the price type. | 
**description** | **String** | The description of the price type. |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the price type was last modified. | 
**subscribedCatalogsIds** | **List&lt;Integer&gt;** | A list of the IDs of the catalogs that are subscribed to this price type. | 
**targetedAudiencesIds** | **List&lt;Integer&gt;** | A list of the IDs of the audiences that are targeted by this price type. | 



