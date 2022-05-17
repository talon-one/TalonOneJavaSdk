

# ApplicationSession


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. The exact moment this entity was created. | 
**applicationId** | **Integer** | The ID of the application that owns this entity. | 
**profileId** | **Integer** | The globally unique Talon.One ID of the customer that created this entity. |  [optional]
**integrationId** | **String** | The integration ID for this entity sent to and used in the Talon.One system. | 
**profileintegrationid** | **String** | Integration ID of the customer for the session. |  [optional]
**coupon** | **String** | Any coupon code entered. | 
**referral** | **String** | Any referral code entered. | 
**state** | [**StateEnum**](#StateEnum) | Indicating if the customer session is in progress (&#x60;open&#x60;), &#x60;closed&#x60;, or &#x60;cancelled&#x60;. For more information about customer sessions, see [Customer sessions](/docs/dev/concepts/entities#customer-session-states) in the docs.  | 
**cartItems** | [**List&lt;CartItem&gt;**](CartItem.md) | Serialized JSON representation. | 
**discounts** | [**Map&lt;String, BigDecimal&gt;**](BigDecimal.md) | **API V1 only.** A map of labeled discount values, in the same currency as the session.  If you are using the V2 endpoints, refer to the &#x60;totalDiscounts&#x60; property instead.  | 
**totalDiscounts** | [**BigDecimal**](BigDecimal.md) | The total sum of the discounts applied to this session. | 
**total** | [**BigDecimal**](BigDecimal.md) | The total sum of the session before any discounts applied. | 
**attributes** | [**Object**](.md) | Arbitrary properties associated with this item |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
PARTIALLY_RETURNED | &quot;partially_returned&quot;
CANCELLED | &quot;cancelled&quot;



