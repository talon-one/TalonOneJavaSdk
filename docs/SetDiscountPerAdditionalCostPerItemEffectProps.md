

# SetDiscountPerAdditionalCostPerItemEffectProps

This effect indicates that a discount of a specific additional cost within a specific item should be applied. It gets triggered whenever a rule containing a **Discount additional cost per item** effect is validated.  Use this effect when **all** items in the cart have an additional cost. If one of more items do not have an additional cost, the rule will fail.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The description of this discount. &#x60;#number&#x60; is appended to the name. It is equal to the &#x60;position&#x60; property. | 
**additionalCostId** | **Long** | The identifier of the additional cost to be discounted. | 
**value** | [**BigDecimal**](BigDecimal.md) | The monetary value of the effective discount applied to the item&#39;s additional cost. | 
**position** | [**BigDecimal**](BigDecimal.md) | The index of the item in the &#x60;cartItem&#x60; object containing the additional cost that this discount applies to. | 
**subPosition** | [**BigDecimal**](BigDecimal.md) | The index of the item unit in its line item. |  [optional]
**additionalCost** | **String** | The API name of the additional cost to be discounted. | 
**desiredValue** | [**BigDecimal**](BigDecimal.md) | _[(Partial discounts enabled only)](https://docs.talon.one/docs/product/applications/manage-general-settings#partial-discounts)_. The monetary value of the discount to be applied to the additional cost without considering budget limitations. |  [optional]



