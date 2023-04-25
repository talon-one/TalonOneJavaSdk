

# UpdateApplication

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this application. | 
**description** | **String** | A longer description of the application. |  [optional]
**timezone** | **String** | A string containing an IANA timezone descriptor. | 
**currency** | **String** | The default currency for new customer sessions. | 
**caseSensitivity** | [**CaseSensitivityEnum**](#CaseSensitivityEnum) | The case sensitivity behavior to check coupon codes in the campaigns of this Application. |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this campaign. |  [optional]
**limits** | [**List&lt;LimitConfig&gt;**](LimitConfig.md) | Default limits for campaigns created in this application. |  [optional]
**campaignPriority** | [**CampaignPriorityEnum**](#CampaignPriorityEnum) | Default [priority](https://docs.talon.one/docs/product/applications/setting-up-campaign-priorities) for campaigns created in this Application.  |  [optional]
**exclusiveCampaignsStrategy** | [**ExclusiveCampaignsStrategyEnum**](#ExclusiveCampaignsStrategyEnum) | The strategy used when choosing exclusive campaigns for evaluation. |  [optional]
**defaultDiscountScope** | [**DefaultDiscountScopeEnum**](#DefaultDiscountScopeEnum) | The default scope to apply &#x60;setDiscount&#x60; effects on if no scope was provided with the effect.  |  [optional]
**enableCascadingDiscounts** | **Boolean** | Indicates if discounts should cascade for this Application. |  [optional]
**enableFlattenedCartItems** | **Boolean** | Indicates if cart items of quantity larger than one should be separated into different items of quantity one. See the [docs](https://docs.talon.one/docs/product/campaigns/campaign-evaluation#flattening).  |  [optional]
**attributesSettings** | [**AttributesSettings**](AttributesSettings.md) |  |  [optional]
**sandbox** | **Boolean** | Indicates if this is a live or sandbox Application. |  [optional]
**enablePartialDiscounts** | **Boolean** | Indicates if this Application supports partial discounts. |  [optional]
**defaultDiscountAdditionalCostPerItemScope** | [**DefaultDiscountAdditionalCostPerItemScopeEnum**](#DefaultDiscountAdditionalCostPerItemScopeEnum) | The default scope to apply &#x60;setDiscountPerItem&#x60; effects on if no scope was provided with the effect.  |  [optional]



## Enum: CaseSensitivityEnum

Name | Value
---- | -----
SENSITIVE | &quot;sensitive&quot;
INSENSITIVE_UPPERCASE | &quot;insensitive-uppercase&quot;
INSENSITIVE_LOWERCASE | &quot;insensitive-lowercase&quot;



## Enum: CampaignPriorityEnum

Name | Value
---- | -----
UNIVERSAL | &quot;universal&quot;
STACKABLE | &quot;stackable&quot;
EXCLUSIVE | &quot;exclusive&quot;



## Enum: ExclusiveCampaignsStrategyEnum

Name | Value
---- | -----
LISTORDER | &quot;listOrder&quot;
LOWESTDISCOUNT | &quot;lowestDiscount&quot;
HIGHESTDISCOUNT | &quot;highestDiscount&quot;



## Enum: DefaultDiscountScopeEnum

Name | Value
---- | -----
SESSIONTOTAL | &quot;sessionTotal&quot;
CARTITEMS | &quot;cartItems&quot;
ADDITIONALCOSTS | &quot;additionalCosts&quot;



## Enum: DefaultDiscountAdditionalCostPerItemScopeEnum

Name | Value
---- | -----
PRICE | &quot;price&quot;
ITEMTOTAL | &quot;itemTotal&quot;
ADDITIONALCOSTS | &quot;additionalCosts&quot;



