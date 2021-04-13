

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
**state** | [**StateEnum**](#StateEnum) | Indicating if the customer session is in progress (\&quot;open\&quot;), \&quot;closed\&quot;, or \&quot;cancelled\&quot;. | 
**cartItems** | [**List&lt;CartItem&gt;**](CartItem.md) | Serialized JSON representation. | 
**discounts** | [**Map&lt;String, BigDecimal&gt;**](BigDecimal.md) | A map of labelled discount values, in the same currency as the session. | 
**total** | [**BigDecimal**](BigDecimal.md) | The total sum of the session before any discounts applied. | 
**attributes** | **Map&lt;String, Object&gt;** | Arbitrary properties associated with this item |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
CANCELLED | &quot;cancelled&quot;



