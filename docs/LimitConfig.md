

# LimitConfig

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | The limitable action to which this limit will be applied | 
**limit** | [**BigDecimal**](BigDecimal.md) | The value to set for the limit | 
**entities** | [**List&lt;EntitiesEnum&gt;**](#List&lt;EntitiesEnum&gt;) | The entities that make the address of this limit | 



## Enum: ActionEnum

Name | Value
---- | -----
REDEEMCOUPON | &quot;redeemCoupon&quot;
REDEEMREFERRAL | &quot;redeemReferral&quot;
SETDISCOUNT | &quot;setDiscount&quot;
CREATECOUPON | &quot;createCoupon&quot;
SETDISCOUNTEFFECT | &quot;setDiscountEffect&quot;



## Enum: List&lt;EntitiesEnum&gt;

Name | Value
---- | -----
COUPON | &quot;Coupon&quot;
REFERRAL | &quot;Referral&quot;
PROFILE | &quot;Profile&quot;
IDENTIFIER | &quot;Identifier&quot;



