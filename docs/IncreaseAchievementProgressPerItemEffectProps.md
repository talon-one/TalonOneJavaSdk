

# IncreaseAchievementProgressPerItemEffectProps

This effect schema is returned when you use the **Update customer progress per item** effect in a rule.  It indicates that the customer's progress in an achievement was updated during the current session for a specific cart item.  If your list of cart items is a [bundle definition](https://docs.talon.one/docs/product/rules/create-and-manage-bundles), use the `bundleIndex` and `bundleName` properties to identify the bundle containing the item whose progress was updated.  If the cart item has a quantity greater than one, use the `cartItemSubPosition` property to identify the specific unit within the item's line item.  For [on-completion achievements](https://docs.talon.one/docs/product/achievements/overview#recurring-on-completion-achievements), any customer progress exceeding the target automatically starts a new iteration. This generates a new `progressTrackerId` for each iteration, and there can be multiple progress updates for the same achievement from a single validation of this effect.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**achievementId** | **Long** | The internal ID of the achievement. | 
**achievementName** | **String** | The name of the achievement. | 
**progressTrackerId** | **Long** | The internal ID of the customer progress tracker. For [on-completion achievements](https://docs.talon.one/docs/product/achievements/overview#recurring-on-completion-achievements), this effect generates a unique ID for each iteration. |  [optional]
**delta** | [**BigDecimal**](BigDecimal.md) | The value by which the customer&#39;s current progress in the achievement has increased. | 
**value** | [**BigDecimal**](BigDecimal.md) | The current progress of the customer in the achievement. | 
**target** | [**BigDecimal**](BigDecimal.md) | The target value to complete the achievement. | 
**isJustCompleted** | **Boolean** | Indicates if the customer has completed the achievement in the current session. | 
**cartItemPosition** | [**BigDecimal**](BigDecimal.md) | The index of the item in the &#x60;cartItem&#x60; object on which the customer&#39;s progress in the achievement was updated. | 
**cartItemSubPosition** | [**BigDecimal**](BigDecimal.md) | For cart items with &#x60;quantity&#x60; &gt; 1, indicates which specific unit of the item the effect applies to. |  [optional]
**bundleIndex** | **Long** | _(With bundles only)_ The position of the specific bundle in the list of bundles created from the same bundle definition. For example, if a customer creates two identical bundles, the first has index &#x60;0&#x60; and the second has index &#x60;1&#x60;. |  [optional]
**bundleName** | **String** | _(With bundles only)_ The name of the bundle definition. |  [optional]



