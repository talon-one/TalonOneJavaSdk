

# CustomEffectProps

Effect containing custom payload.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectId** | **Long** | The ID of the custom effect that was triggered. | 
**name** | **String** | The type of the custom effect. | 
**cartItemPosition** | [**BigDecimal**](BigDecimal.md) | The index of the item in the cart item list to which the custom effect is applied. |  [optional]
**cartItemSubPosition** | [**BigDecimal**](BigDecimal.md) | For cart items with quantity &gt; 1, the sub position indicates to which item unit the custom effect is applied.  |  [optional]
**bundleIndex** | **Long** | The position of the bundle in a list of item bundles created from the same bundle definition. |  [optional]
**bundleName** | **String** | The name of the bundle definition. |  [optional]
**payload** | [**Object**](.md) | The JSON payload of the custom effect. | 



