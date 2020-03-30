

# ShowBundleMetadataEffectProps

The properties specific to the \"ShowBundleMetadata\" effect. This effect contains information that allows you to associate the discounts from a rule in a bundle campaign with specific cart items. This way you can distinguish from \"normal\" discounts that were not the result of a product bundle.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the product bundle | 
**bundleAttributes** | **List&lt;String&gt;** | The cart item attributes that determined which items are being bundled together | 
**itemsIndices** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | The indices in the cart items array of the bundled items | 



