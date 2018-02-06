
# LimitConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | The limitable action to which this limit will be applied | 
**limit** | [**BigDecimal**](BigDecimal.md) | The value to set for the limit | 
**entities** | [**List&lt;LimitEntityEnum&gt;**](LimitEntityEnum.md) | The entities that make the address of this limit | 


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
REDEEMCOUPON | &quot;redeemCoupon&quot;
REDEEMREFERRAL | &quot;redeemReferral&quot;
SETDISCOUNT | &quot;setDiscount&quot;



