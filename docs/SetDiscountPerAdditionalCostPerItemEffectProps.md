

# SetDiscountPerAdditionalCostPerItemEffectProps

The properties specific to the \"setDiscountPerAdditionalCostPerItem\" effect. This gets triggered whenever a validated rule contained a \"set discount per additional cost per item\" effect. This is a discount that should be applied on a specific additional cost in a specific item.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name/description of this discount | 
**additionalCostId** | **Integer** | The ID of the additional cost | 
**value** | [**BigDecimal**](BigDecimal.md) | The total monetary value of the discount | 
**position** | [**BigDecimal**](BigDecimal.md) | The index of the item in the cart item list containing the additional cost to be discounted. | 
**subPosition** | [**BigDecimal**](BigDecimal.md) | Only used when [cart item flattening](https://docs.talon.one/docs/product/campaigns/campaign-evaluation/#flattened-cart-items) is enabled. Indicates which item the discount applies to for cart items with &#x60;quantity&#x60; &gt; 1.  |  [optional]
**additionalCost** | **String** | The name of the additional cost | 
**desiredValue** | [**BigDecimal**](BigDecimal.md) | Only with [partial discounts enabled](https://docs.talon.one/docs/product/campaigns/campaign-evaluation/#partial-discounts). Represents the monetary value of the discount to be applied to additional discount without considering budget limitations.  |  [optional]



