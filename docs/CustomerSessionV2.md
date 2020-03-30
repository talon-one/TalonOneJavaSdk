

# CustomerSessionV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integrationId** | **String** | The ID used for this entity in the application system. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**applicationId** | **Integer** | The ID of the application that owns this entity. | 
**profileId** | **String** | ID of the customers profile as used within this Talon.One account. May be omitted or set to the empty string if the customer does not yet have a known profile ID. | 
**couponCodes** | **List&lt;String&gt;** | Any coupon codes entered. |  [optional]
**referralCode** | **String** | Any referral code entered. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Indicates the current state of the session. All sessions must start in the \&quot;open\&quot; state, after which valid transitions are...  1. open -&gt; closed 2. open -&gt; cancelled 3. closed -&gt; cancelled  | 
**cartItems** | [**List&lt;CartItem&gt;**](CartItem.md) | All items the customer will be purchasing in this session | 
**additionalCosts** | [**Map&lt;String, AdditionalCost&gt;**](AdditionalCost.md) | Any costs associated with the session that can not be explicitly attributed to cart items. Examples include shipping costs and service fees. |  [optional]
**identifiers** | **List&lt;String&gt;** | Identifiers for the customer, this can be used for limits on values such as device ID. |  [optional]
**attributes** | [**Object**](.md) | A key-value map of the sessions attributes. The potentially valid attributes are configured in your accounts developer settings.  | 
**firstSession** | **Boolean** | Indicates whether this is the first session for the customer&#39;s profile. Will always be true for anonymous sessions. | 
**total** | [**BigDecimal**](BigDecimal.md) | The total sum of cart-items, as well as additional costs, before any discounts applied | 
**cartItemTotal** | [**BigDecimal**](BigDecimal.md) | The total sum of cart-items before any discounts applied | 
**additionalCostTotal** | [**BigDecimal**](BigDecimal.md) | The total sum of additional costs before any discounts applied | 



## Enum: StateEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
CANCELLED | &quot;cancelled&quot;



