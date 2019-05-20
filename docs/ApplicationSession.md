
# ApplicationSession

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. The exact moment this entity was created. | 
**applicationId** | **Integer** | The ID of the application that owns this entity. | 
**profileId** | **Integer** | The globally unique Talon.One ID of the customer that created this entity. |  [optional]
**integrationId** | **String** | The ID used for this entity in the application system. | 
**coupon** | **String** | Any coupon code entered. | 
**referral** | **String** | Any referal code entered. | 
**state** | [**StateEnum**](#StateEnum) | Indicating if the customer session is in progress (\&quot;open\&quot;), \&quot;closed\&quot;, or \&quot;cancelled\&quot;. | 
**cartItems** | [**List&lt;CartItem&gt;**](CartItem.md) | Serialized JSON representation. | 
**discounts** | [**Map&lt;String, BigDecimal&gt;**](BigDecimal.md) | A map of labelled discount values, in the same currency as the session. | 
**attributes** | [**Object**](.md) | Arbitrary properties associated with this item |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
CANCELLED | &quot;cancelled&quot;



