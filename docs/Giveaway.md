

# Giveaway

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**code** | **String** | The code value of this giveaway. | 
**poolId** | **Integer** | The ID of the pool to return giveaway codes from. | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the giveaway becomes valid. |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the giveaway becomes invalid. |  [optional]
**attributes** | **Map&lt;String, Object&gt;** | Arbitrary properties associated with this giveaway. |  [optional]
**used** | **Boolean** | Flag indicating whether this giveaway code was given before. |  [optional]
**importId** | **Integer** | The ID of the Import which created this giveaway. |  [optional]



