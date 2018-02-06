
# NewCustomerSession

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**profileId** | **String** | ID of the customers profile as used within this Talon.One account. May be omitted or set to the empty string if the customer does not yet have a known profile ID. |  [optional]
**coupon** | **String** | Any coupon code entered. |  [optional]
**referral** | **String** | Any referral code entered. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Indicates the current state of the session. All sessions must start in the \&quot;open\&quot; state, after which valid transitions are...  1. open -&gt; closed 2. open -&gt; cancelled 3. closed -&gt; cancelled  |  [optional]
**cartItems** | [**List&lt;CartItem&gt;**](CartItem.md) | Serialized JSON representation. |  [optional]
**total** | [**BigDecimal**](BigDecimal.md) | The total sum of the cart in one session. |  [optional]
**attributes** | **Object** | A key-value map of the sessions attributes. The potentially valid attributes are configured in your accounts developer settings. To learn more about how attributes work, please see [Attributes](#blah).  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
CANCELLED | &quot;cancelled&quot;



