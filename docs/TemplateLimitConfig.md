

# TemplateLimitConfig

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | The limitable action to which this limit applies. For example: - &#x60;setDiscount&#x60; - &#x60;setDiscountEffect&#x60; - &#x60;redeemCoupon&#x60; - &#x60;createCoupon&#x60;  | 
**limit** | [**BigDecimal**](BigDecimal.md) | The value to set for the limit. | 
**period** | [**PeriodEnum**](#PeriodEnum) | The period on which the budget limit recurs. |  [optional]
**entities** | [**List&lt;EntitiesEnum&gt;**](#List&lt;EntitiesEnum&gt;) | The entity that this limit applies to. | 



## Enum: PeriodEnum

Name | Value
---- | -----
DAILY | &quot;daily&quot;
WEEKLY | &quot;weekly&quot;
MONTHLY | &quot;monthly&quot;
YEARLY | &quot;yearly&quot;



## Enum: List&lt;EntitiesEnum&gt;

Name | Value
---- | -----
COUPON | &quot;Coupon&quot;
REFERRAL | &quot;Referral&quot;
PROFILE | &quot;Profile&quot;
IDENTIFIER | &quot;Identifier&quot;
STORE | &quot;Store&quot;



