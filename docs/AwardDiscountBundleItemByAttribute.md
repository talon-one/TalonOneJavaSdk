

# AwardDiscountBundleItemByAttribute

Identifies a bundle slot by ranking items by a per-item attribute expression and picking the highest- or lowest-ranked one.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | A bundle-item selector of type &#x60;byAttribute&#x60;. | 
**attribute** | **String** | A per-item attribute expression used to rank bundle items. | 
**direction** | [**DirectionEnum**](#DirectionEnum) | Ranking direction. &#x60;highest&#x60; picks the item with the largest attribute value, &#x60;lowest&#x60; the smallest. | 



## Enum: TypeEnum

Name | Value
---- | -----
BYATTRIBUTE | &quot;byAttribute&quot;



## Enum: DirectionEnum

Name | Value
---- | -----
HIGHEST | &quot;highest&quot;
LOWEST | &quot;lowest&quot;



