

# LoyaltyTier

A tier in a loyalty program.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**programID** | **Integer** | The ID of the loyalty program that owns this entity. | 
**programName** | **String** | The integration name of the loyalty program that owns this entity. |  [optional]
**programTitle** | **String** | The Campaign Manager-displayed name of the loyalty program that owns this entity. |  [optional]
**name** | **String** | The name of the tier. | 
**minPoints** | [**BigDecimal**](BigDecimal.md) | The minimum amount of points required to enter the tier. | 



