

# ApplicationSession


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. The time this entity was created. | 
**applicationId** | **Integer** | The ID of the application that owns this entity. | 
**profileId** | **Integer** | The globally unique Talon.One ID of the customer that created this entity. |  [optional]
**integrationId** | **String** | The integration ID set by your integration layer. | 
**profileintegrationid** | **String** | Integration ID of the customer for the session. |  [optional]
**coupon** | **String** | Any coupon code entered. | 
**referral** | **String** | Any referral code entered. | 
**state** | [**StateEnum**](#StateEnum) | Indicates the current state of the session. Sessions can be created as &#x60;open&#x60; or &#x60;closed&#x60;. The state transitions are:  1. &#x60;open&#x60; → &#x60;closed&#x60; 2. &#x60;open&#x60; → &#x60;cancelled&#x60; 3. &#x60;closed&#x60; → &#x60;cancelled&#x60; or &#x60;partially_returned&#x60; 4. &#x60;partially_returned&#x60; → &#x60;cancelled&#x60;  For more information, see [Customer session states](https://docs.talon.one/docs/dev/concepts/entities#customer-session).  | 
**cartItems** | [**List&lt;CartItem&gt;**](CartItem.md) | Serialized JSON representation. | 
**discounts** | [**Map&lt;String, BigDecimal&gt;**](BigDecimal.md) | **API V1 only.** A map of labeled discount values, in the same currency as the session.  If you are using the V2 endpoints, refer to the &#x60;totalDiscounts&#x60; property instead.  | 
**totalDiscounts** | [**BigDecimal**](BigDecimal.md) | The total sum of the discounts applied to this session. | 
**total** | [**BigDecimal**](BigDecimal.md) | The total sum of the session before any discounts applied. | 
**attributes** | [**Object**](.md) | Arbitrary properties associated with this item. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
PARTIALLY_RETURNED | &quot;partially_returned&quot;
CANCELLED | &quot;cancelled&quot;



