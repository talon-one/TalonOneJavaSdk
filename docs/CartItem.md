

# CartItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of item | 
**sku** | **String** | Stock keeping unit of item | 
**quantity** | **Integer** | Quantity of item. **Important:** If you enabled [cart item flattening](https://docs.talon.one/docs/product/campaigns/campaign-evaluation/#flattened-cart-items), the quantity is always one and the same cart item might receive multiple per-item discounts. Ensure you can process multiple discounts on one cart item correctly.  | 
**returnedQuantity** | **Integer** | Number of returned items, calculated internally based on returns of this item. |  [optional]
**remainingQuantity** | **Integer** | Remaining quantity of the item, calculated internally based on returns of this item. |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) | Price of item | 
**category** | **String** | Type, group or model of the item |  [optional]
**weight** | [**BigDecimal**](BigDecimal.md) | Weight of item in grams |  [optional]
**height** | [**BigDecimal**](BigDecimal.md) | Height of item in mm |  [optional]
**width** | [**BigDecimal**](BigDecimal.md) | Width of item in mm |  [optional]
**length** | [**BigDecimal**](BigDecimal.md) | Length of item in mm |  [optional]
**position** | [**BigDecimal**](BigDecimal.md) | Position of the Cart Item in the Cart (calculated internally) |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this item. You can use built-in attributes or create your own. See [Attributes](https://docs.talon.one/docs/dev/concepts/attributes).  |  [optional]
**additionalCosts** | [**Map&lt;String, AdditionalCost&gt;**](AdditionalCost.md) | Any additional costs associated with the cart item  |  [optional]



