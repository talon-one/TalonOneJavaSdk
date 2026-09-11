

# History

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID of the historical price. | 
**observedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the price was observed. | 
**contextIds** | **List&lt;String&gt;** | The identifiers of the relevant context at the time the price was observed. Includes the context IDs of any price adjustments and of the campaigns that influenced the final price.  | 
**price** | [**BigDecimal**](BigDecimal.md) | Price of the item. | 
**metadata** | [**BestPriorPriceMetadata**](BestPriorPriceMetadata.md) |  | 
**target** | [**Object**](.md) |  | 
**excludedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the historical price ID was excluded. |  [optional]
**exclusionReason** | **String** | The reason for excluding this historical price ID. |  [optional]



