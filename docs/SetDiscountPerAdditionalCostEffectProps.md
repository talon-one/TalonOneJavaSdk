

# SetDiscountPerAdditionalCostEffectProps

The properties specific to the \"setDiscountPerAdditionalCost\" effect. This gets triggered whenever a validated rule contained a \"set per additional cost discount\" effect. This is a discount that should be applied on a specific additional cost.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name/description of this discount | 
**additionalCostId** | **Integer** | The ID of the additional cost | 
**additionalCost** | **String** | The name of the additional cost | 
**value** | [**BigDecimal**](BigDecimal.md) | The total monetary value of the discount | 
**desiredValue** | [**BigDecimal**](BigDecimal.md) | The original value of the discount |  [optional]



