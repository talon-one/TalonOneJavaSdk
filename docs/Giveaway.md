

# Giveaway


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**code** | **String** | The code value of this giveaway. | 
**poolId** | **Integer** | The ID of the pool to return giveaway codes from. | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the giveaway becomes valid. |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the giveaway becomes invalid. |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this giveaway. |  [optional]
**used** | **Boolean** | Indicates whether this giveaway code was given before. |  [optional]
**importId** | **Integer** | The ID of the Import which created this giveaway. |  [optional]
**profileIntegrationId** | **String** | The third-party integration ID of the customer profile that was awarded the giveaway, if the giveaway was awarded. |  [optional]
**profileId** | **Integer** | The internal ID of the customer profile that was awarded the giveaway, if the giveaway was awarded and an internal ID exists. |  [optional]



