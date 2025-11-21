

# AddLoyaltyPointsEffectProps

The properties specific to the \"addLoyaltyPoints\" effect. This gets triggered whenever a validated rule contained an \"add loyalty\" effect. These points are automatically stored and managed inside Talon.One. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name / description of this loyalty point addition. | 
**programId** | **Long** | The ID of the loyalty program where these points were added. | 
**subLedgerId** | **String** | The ID of the subledger within the loyalty program where these points were added. | 
**value** | [**BigDecimal**](BigDecimal.md) | The amount of points that were added. | 
**desiredValue** | [**BigDecimal**](BigDecimal.md) | The original amount of loyalty points to be awarded. |  [optional]
**recipientIntegrationId** | **String** | The user for whom these points were added. | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date after which points will be valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date after which points will expire. |  [optional]
**transactionUUID** | **String** | The identifier of this addition in the loyalty ledger. | 
**cartItemPosition** | [**BigDecimal**](BigDecimal.md) | The index of the item in the cart items list on which the loyal points addition should be applied. |  [optional]
**cartItemSubPosition** | [**BigDecimal**](BigDecimal.md) | For cart items with &#x60;quantity&#x60; &gt; 1, the sub position indicates to which item the loyalty points addition is applied.  |  [optional]
**cardIdentifier** | **String** | The alphanumeric identifier of the loyalty card.  |  [optional]
**bundleIndex** | **Long** | The position of the bundle in a list of item bundles created from the same bundle definition. |  [optional]
**bundleName** | **String** | The name of the bundle definition. |  [optional]
**awaitsActivation** | **Boolean** | If &#x60;true&#x60;, the loyalty points are pending until  action-based activation takes place. The &#x60;startDate&#x60; parameter automatically  defaults to &#x60;on_action&#x60;.  |  [optional]
**validityDuration** | **String** | The duration for which the points remain active, relative to the  activation date. Example: &#x60;30D&#x60;.   **Note**: This value is only returned if &#x60;awaitsActivation&#x60; is &#x60;true&#x60;  and &#x60;expiryDate&#x60; is not set.  |  [optional]



