

# SetDiscountPerItemEffectProps

The properties specific to the `setDiscountPerItem` effect, triggered whenever a validated rule contained a \"set per item discount\" effect. This is a discount that will be applied either on a specific item, on a specific item + additional cost or on all additional costs per item. This depends on the chosen scope. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the discount. Contains a hashtag character indicating the index of the position of the item the discount applies to. It is identical to the value of the &#x60;position&#x60; property.  | 
**value** | [**BigDecimal**](BigDecimal.md) | The total monetary value of the discount. | 
**position** | [**BigDecimal**](BigDecimal.md) | The index of the item in the cart items list on which this discount should be applied. | 
**subPosition** | [**BigDecimal**](BigDecimal.md) | For cart items with &#x60;quantity&#x60; &gt; 1, the sub position indicates which item the discount applies to.  |  [optional]
**desiredValue** | [**BigDecimal**](BigDecimal.md) | The original value of the discount. |  [optional]
**scope** | **String** | The scope of the discount: - &#x60;additionalCosts&#x60;: The discount applies to all the additional costs of the item. - &#x60;itemTotal&#x60;: The discount applies to the price of the item + the additional costs of the item. - &#x60;price&#x60;: The discount applies to the price of the item.  |  [optional]
**totalDiscount** | [**BigDecimal**](BigDecimal.md) | The total discount given if this effect is a result of a prorated discount. |  [optional]
**desiredTotalDiscount** | [**BigDecimal**](BigDecimal.md) | The original total discount to give if this effect is a result of a prorated discount. |  [optional]
**bundleIndex** | **Integer** | The position of the bundle in a list of item bundles created from the same bundle definition. |  [optional]
**bundleName** | **String** | The name of the bundle definition. |  [optional]
**targetedItemPosition** | [**BigDecimal**](BigDecimal.md) | The index of the targeted bundle item on which the applied discount is based. |  [optional]
**targetedItemSubPosition** | [**BigDecimal**](BigDecimal.md) | The sub-position of the targeted bundle item on which the applied discount is based.  |  [optional]



