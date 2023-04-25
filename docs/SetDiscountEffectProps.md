

# SetDiscountEffectProps

The properties specific to the \"setDiscount\" effect. This gets triggered whenever a validated rule contained a \"set discount\" effect. This is a discount that should be applied on the scope of defined with it.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name / description of this discount | 
**value** | [**BigDecimal**](BigDecimal.md) | The total monetary value of the discount. | 
**scope** | **String** | The scope which the discount was applied on, can be one of (cartItems,additionalCosts,sessionTotal). |  [optional]
**desiredValue** | [**BigDecimal**](BigDecimal.md) | The original value of the discount. |  [optional]



