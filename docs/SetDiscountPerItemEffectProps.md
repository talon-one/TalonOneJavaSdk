

# SetDiscountPerItemEffectProps

The properties specific to the \"setDiscountPerItem\" effect. This gets triggered whenever a validated rule contained a \"set per item discount\" effect. This is a discount that should be applied on a specific item.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name/description of this discount | 
**value** | [**BigDecimal**](BigDecimal.md) | The total monetary value of the discount | 
**position** | [**BigDecimal**](BigDecimal.md) | The index of the item in the cart items list on which this discount should be applied | 
**subPosition** | [**BigDecimal**](BigDecimal.md) | The sub-index of the item in an item stack on which this discount should be applied |  [optional]



