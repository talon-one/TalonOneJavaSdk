

# RollbackDiscountEffectProps

The properties specific to the \"rollbackDiscount\" effect. This gets triggered whenever previously closed session is now cancelled or partially returned and a setDiscount effect was cancelled on our internal discount limit counters.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the \&quot;setDiscount\&quot; effect that was rolled back. | 
**value** | [**BigDecimal**](BigDecimal.md) | The value of the discount that was rolled back. | 
**cartItemPosition** | [**BigDecimal**](BigDecimal.md) | The index of the item in the cart items for which the discount was rolled back. |  [optional]
**cartItemSubPosition** | [**BigDecimal**](BigDecimal.md) | For cart items with &#x60;quantity&#x60; &gt; 1, the subposition returns the index of the item unit in its line item.  |  [optional]
**additionalCostId** | **Long** | The ID of the additional cost that was rolled back. |  [optional]
**additionalCost** | **String** | The name of the additional cost that was rolled back. |  [optional]
**scope** | **String** | The scope of the rolled back discount - For a discount per session, it can be one of &#x60;cartItems&#x60;, &#x60;additionalCosts&#x60; or &#x60;sessionTotal&#x60; - For a discount per item, it can be one of &#x60;price&#x60;, &#x60;additionalCosts&#x60; or &#x60;itemTotal&#x60;  |  [optional]



