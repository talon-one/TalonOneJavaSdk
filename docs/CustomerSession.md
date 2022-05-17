

# CustomerSession


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integrationId** | **String** | The integration ID for this entity sent to and used in the Talon.One system. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**applicationId** | **Integer** | The ID of the application that owns this entity. | 
**profileId** | **String** | ID of the customers profile as used within this Talon.One account.  **Note:** If the customer does not yet have a known profileId, we recommend you use a guest profileId.  | 
**coupon** | **String** | Any coupon code entered. | 
**referral** | **String** | Any referral code entered. | 
**state** | [**StateEnum**](#StateEnum) | Indicates the current state of the session. Sessions can be created as &#x60;open&#x60; or &#x60;closed&#x60;. The state transitions are:  1. &#x60;open&#x60; → &#x60;closed&#x60; 2. &#x60;open&#x60; → &#x60;cancelled&#x60; 3. &#x60;closed&#x60; → &#x60;cancelled&#x60; or &#x60;partially_returned&#x60; 4. &#x60;partially_returned&#x60; → &#x60;cancelled&#x60;  For more information, see [Entities](/docs/dev/concepts/entities#customer-session).  | 
**cartItems** | [**List&lt;CartItem&gt;**](CartItem.md) | Serialized JSON representation. | 
**identifiers** | **List&lt;String&gt;** | Session custom identifiers that you can set limits on or use inside your rules.  For example, you can use IP addresses as identifiers to potentially identify devices and limit discounts abuse in case of customers creating multiple accounts. See the [tutorial](https://docs.talon.one/docs/dev/tutorials/using-identifiers/).  |  [optional]
**total** | [**BigDecimal**](BigDecimal.md) | The total sum of the cart in one session. | 
**attributes** | [**Object**](.md) | A key-value map of the sessions attributes. The potentially valid attributes are configured in your accounts developer settings.  | 
**firstSession** | **Boolean** | Indicates whether this is the first session for the customer&#39;s profile. Will always be true for anonymous sessions. | 
**discounts** | [**Map&lt;String, BigDecimal&gt;**](BigDecimal.md) | A map of labelled discount values, values will be in the same currency as the application associated with the session. | 
**updated** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent event received on this session | 



## Enum: StateEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
PARTIALLY_RETURNED | &quot;partially_returned&quot;
CANCELLED | &quot;cancelled&quot;



