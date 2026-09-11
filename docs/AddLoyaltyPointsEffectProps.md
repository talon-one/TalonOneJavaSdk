

# AddLoyaltyPointsEffectProps

This effect indicates that a defined amount of loyalty points was successfully added to the customer's profile or to a loyalty card.  If you use the [Add loyalty points per item effect](https://docs.talon.one/docs/product/rules/effects/available-effects#reward-effects), use the `cartItemPosition` property to identify which item to add the loyalty points for.  Enabling [partial rewards](https://docs.talon.one/docs/product/applications/manage-general-settings#partial-rewards) allows a rule that would fail because of insufficient budget to pass. The rule still fails when the budget reaches 0. Use the `desiredValue` property to identify the original amount of loyalty points.  If you use **Add loyalty points per item** and if the session contains some cart items with _quantity > 1_, use the `cartItemSubPosition` property to identify the item unit in its line item. See the example below for more information.  If your list of cart items is a [bundle definition](https://docs.talon.one/docs/product/rules/create-and-manage-bundles), use the `bundleIndex` and `bundleName` properties to identify the bundle containing the items for which loyalty points are added.  If you have set custom activation and expiration dates for the loyalty points, use the `startDate` and `expiryDate` properties to identify when the reward will be active and when will expire.  If the loyalty program is [profile-based](https://docs.talon.one/docs/product/loyalty-programs/overview#loyalty-program-types), use the `recipientIntegrationId` property to identify the user who receives the loyalty points. If the loyalty program is [card-based](https://docs.talon.one/docs/product/loyalty-programs/overview#loyalty-program-types), use the `cardIdentifier` property to identify the loyalty card on which these points are added.  The points only persist when the session is closed.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The reason of this loyalty point addition. | 
**programId** | **Long** | The ID of the loyalty program where these points were added. | 
**subLedgerId** | **String** | The ID of the subledger within the loyalty program where these points were added. | 
**value** | [**BigDecimal**](BigDecimal.md) | The amount of points that were added. | 
**desiredValue** | [**BigDecimal**](BigDecimal.md) | (Partial rewards enabled only) The amount of loyalty points to be awarded without considering budget limitations. |  [optional]
**recipientIntegrationId** | **String** | The user for whom these points were added. | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date after which the added points will be valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date after which the added points will expire. |  [optional]
**transactionUUID** | **String** | The identifier of this loyalty point transaction. | 
**cartItemPosition** | [**BigDecimal**](BigDecimal.md) | (_Add points per cart item_ only.) The index of the item in the &#x60;cartItem&#x60; object for which these points were added. |  [optional]
**cartItemSubPosition** | [**BigDecimal**](BigDecimal.md) | (_Add points per cart item_ ) The index of the item unit in its line item. |  [optional]
**cardIdentifier** | **String** | The identifier of the loyalty card, which must match the regular expression &#x60;^[A-Za-z0-9._%+@-]+$&#x60;.  |  [optional]
**bundleIndex** | **Long** | _(With bundles only)_ The position of the specific bundle in the list of bundles created from the same bundle definition. |  [optional]
**bundleName** | **String** | _(With bundles only)_ The name of the bundle definition. |  [optional]
**awaitsActivation** | **Boolean** | Indicates whether the points have an action-based start date. This property is returned only for point transactions with an action-based start date. |  [optional]
**validityDuration** | **String** | The duration for which the points remain active, calculated relative to their start date. |  [optional]



