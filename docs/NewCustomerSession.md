

# NewCustomerSession


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**profileId** | **String** | ID of the customer profile set by your integration layer.  **Note:** If the customer does not yet have a known &#x60;profileId&#x60;, we recommend you use a guest &#x60;profileId&#x60;.  |  [optional]
**coupon** | **String** | Any coupon code entered. |  [optional]
**referral** | **String** | Any referral code entered. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Indicates the current state of the session. Sessions can be created as &#x60;open&#x60; or &#x60;closed&#x60;. The state transitions are:  1. &#x60;open&#x60; → &#x60;closed&#x60; 2. &#x60;open&#x60; → &#x60;cancelled&#x60; 3. &#x60;closed&#x60; → &#x60;cancelled&#x60; or &#x60;partially_returned&#x60; 4. &#x60;partially_returned&#x60; → &#x60;cancelled&#x60;  For more information, see [Customer session states](https://docs.talon.one/docs/dev/concepts/entities#customer-session).  |  [optional]
**cartItems** | [**List&lt;CartItem&gt;**](CartItem.md) | Serialized JSON representation. |  [optional]
**identifiers** | **List&lt;String&gt;** | Session custom identifiers that you can set limits on or use inside your rules.  For example, you can use IP addresses as identifiers to potentially identify devices and limit discounts abuse in case of customers creating multiple accounts. See the [tutorial](https://docs.talon.one/docs/dev/tutorials/using-identifiers).  |  [optional]
**total** | [**BigDecimal**](BigDecimal.md) | The total sum of the cart in one session. |  [optional]
**attributes** | [**Object**](.md) | A key-value map of the sessions attributes. The potentially valid attributes are configured in your accounts developer settings.  |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
PARTIALLY_RETURNED | &quot;partially_returned&quot;
CANCELLED | &quot;cancelled&quot;



