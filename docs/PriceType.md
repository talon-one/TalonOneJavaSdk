

# PriceType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**accountId** | **Long** | The ID of the account that owns this price type. |  [optional]
**name** | **String** | The API name of the price type. This is an immutable value. | 
**title** | **String** | The name displayed in the Campaign Manager for the price type. | 
**description** | **String** | A description of the price type. |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the price type was last modified. | 
**subscribedCatalogsIds** | **List&lt;Long&gt;** | A list of the IDs of the catalogs that are subscribed to this price type. | 
**targetedAudiencesIds** | **List&lt;Long&gt;** | A list of the IDs of the audiences targeted by this price type. | 



