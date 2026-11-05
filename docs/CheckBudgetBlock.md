

# CheckBudgetBlock

A block that verifies if a specific budget has sufficient limit available, and whether this limit meets or exceeds a specific value.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | **String** | Identifies the block variant and determines which additional properties are present in it. | 
**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly]
**operator** | [**OperatorEnum**](#OperatorEnum) | The comparison operator applied to the limit. &#x60;available&#x60; checks if there is budget available for a given limitable action; &#x60;enoughFor&#x60; checks if the available budget meets or exceeds a specific value limit. | 
**action** | [**ActionEnum**](#ActionEnum) | The limitable action to check. | 
**value** | [**BigDecimal**](BigDecimal.md) | The value to check against when using the &#x60;enoughFor&#x60; operator. |  [optional]
**onFailure** | **List&lt;Object&gt;** | Promotion blocks evaluated when this block fails or returns false. |  [optional]



## Enum: OperatorEnum

Name | Value
---- | -----
AVAILABLE | &quot;available&quot;
ENOUGHFOR | &quot;enoughFor&quot;



## Enum: ActionEnum

Name | Value
---- | -----
REDEEMCOUPON | &quot;redeemCoupon&quot;
REDEEMREFERRAL | &quot;redeemReferral&quot;
SETDISCOUNT | &quot;setDiscount&quot;
CREATECOUPON | &quot;createCoupon&quot;
CREATEREFERRAL | &quot;createReferral&quot;
SETDISCOUNTEFFECT | &quot;setDiscountEffect&quot;
CREATELOYALTYPOINTS | &quot;createLoyaltyPoints&quot;
CREATELOYALTYPOINTSEFFECT | &quot;createLoyaltyPointsEffect&quot;
REDEEMLOYALTYPOINTS | &quot;redeemLoyaltyPoints&quot;
REDEEMLOYALTYPOINTSEFFECT | &quot;redeemLoyaltyPointsEffect&quot;
AWARDGIVEAWAY | &quot;awardGiveaway&quot;
ADDFREEITEMEFFECT | &quot;addFreeItemEffect&quot;
CUSTOMEFFECT | &quot;customEffect&quot;
CALLAPI | &quot;callApi&quot;



