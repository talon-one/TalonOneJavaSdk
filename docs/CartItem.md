

# CartItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of item. |  [optional]
**sku** | **String** | Stock keeping unit of item. | 
**quantity** | **Integer** | Number of units of this item. Due to [cart item flattening](https://docs.talon.one/docs/product/rules/understanding-cart-item-flattening), if you provide a quantity greater than 1, the item will be split in as many items as the provided quantity. This will impact the number of **per-item** effects triggered from your campaigns.  | 
**returnedQuantity** | **Integer** | Number of returned items, calculated internally based on returns of this item. |  [optional]
**remainingQuantity** | **Integer** | Remaining quantity of the item, calculated internally based on returns of this item. |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) | Price of the item in the currency defined by your Application. This field is required if this item is not part of a [catalog](https://docs.talon.one/docs/product/account/dev-tools/managing-cart-item-catalogs). If it is part of a catalog, setting a price here overrides the price from the catalog.  |  [optional]
**category** | **String** | Type, group or model of the item. |  [optional]
**product** | [**Product**](Product.md) |  |  [optional]
**weight** | [**BigDecimal**](BigDecimal.md) | Weight of item in grams. |  [optional]
**height** | [**BigDecimal**](BigDecimal.md) | Height of item in mm. |  [optional]
**width** | [**BigDecimal**](BigDecimal.md) | Width of item in mm. |  [optional]
**length** | [**BigDecimal**](BigDecimal.md) | Length of item in mm. |  [optional]
**position** | [**BigDecimal**](BigDecimal.md) | Position of the Cart Item in the Cart (calculated internally). |  [optional]
**attributes** | [**Object**](.md) | Use this property to set a value for the attributes of your choice. [Attributes](https://docs.talon.one/docs/dev/concepts/attributes) represent any information to attach to this cart item.  Custom _cart item_ attributes must be created in the Campaign Manager before you set them with this property.  **Note:** Any previously defined attributes that you do not include in the array will be removed.  |  [optional]
**additionalCosts** | [**Map&lt;String, AdditionalCost&gt;**](AdditionalCost.md) | Use this property to set a value for the additional costs of this item, such as a shipping cost. They must be created in the Campaign Manager before you set them with this property. See [Managing additional costs](https://docs.talon.one/docs/product/account/dev-tools/managing-additional-costs).  |  [optional]
**catalogItemID** | **Integer** | The catalog item ID. |  [optional]
**selectedPriceType** | **String** | The selected price type for this cart item (e.g. the price for members only). |  [optional]
**adjustmentReferenceId** | [**UUID**](UUID.md) | The reference identifier of the selected price adjustment for this cart item. This is only returned if the &#x60;selectedPrice&#x60; resulted from a price adjustment. |  [optional]
**adjustmentEffectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time from which the price adjustment is effective. This is only returned if the &#x60;selectedPrice&#x60; resulted from a price adjustment that contains this field. |  [optional]
**adjustmentEffectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time until which the price adjustment is effective. This is only returned if the &#x60;selectedPrice&#x60; resulted from a price adjustment that contains this field. |  [optional]
**prices** | [**Map&lt;String, PriceDetail&gt;**](PriceDetail.md) | A map of keys and values representing the price types and related price adjustment details for this cart item. The keys correspond to the &#x60;priceType&#x60; names.  |  [optional]



