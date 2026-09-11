

# RollbackAddedLoyaltyPointsEffectProps

This effect is triggered in the following cases:  - A session was cancelled in which loyalty points have been added. - A session was partially returned and loyalty point were added by the returned items. See [returning items](https://docs.talon.one/docs/dev/tutorials/partially-return-a-session).  If you use the [Add loyalty points per item effect](https://docs.talon.one/docs/product/rules/effects/available-effects#reward-effects), use the `cartItemPosition` property to identify which items the loyalty points were rolled back for.  If you use **Add loyalty points per item** and if the session contains some cart items with _quantity > 1_, use the `cartItemSubPosition` property to identify the item unit in its line item.  If the loyalty program is [profile-based](https://docs.talon.one/docs/product/loyalty-programs/overview#loyalty-program-types), use the `recipientIntegrationId` property to identify the user for whom the loyalty points are rolled back. If the loyalty program is [card-based](https://docs.talon.one/docs/product/loyalty-programs/overview#loyalty-program-types), use the `cardIdentifier` property to identify the loyalty card where the points were originally added.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**programId** | **Long** | The ID of the loyalty program where these points were rolled back. | 
**subLedgerId** | **String** | The ID of the subledger within the loyalty program where these points were rolled back. | 
**value** | [**BigDecimal**](BigDecimal.md) | The amount of points that were rolled back. | 
**recipientIntegrationId** | **String** | The user for whom these points were rolled back. | 
**transactionUUID** | **String** | The identifier of this loyalty point transaction. | 
**cartItemPosition** | [**BigDecimal**](BigDecimal.md) | (_Add points per cart item_ only.) The index of the item in the &#x60;cartItem&#x60; object for which these points were rolled back. |  [optional]
**cartItemSubPosition** | [**BigDecimal**](BigDecimal.md) | (_Add points per cart item_ ) The index of the item unit in its line item. |  [optional]
**cardIdentifier** | **String** | The identifier of the loyalty card, which must match the regular expression &#x60;^[A-Za-z0-9._%+@-]+$&#x60;.  |  [optional]



