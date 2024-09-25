

# NewCouponsForMultipleRecipients


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usageLimit** | **Integer** | The number of times the coupon code can be redeemed. &#x60;0&#x60; means unlimited redemptions but any campaign usage limits will still apply.  | 
**discountLimit** | [**BigDecimal**](BigDecimal.md) | The total discount value that the code can give. Typically used to represent a gift card value.  |  [optional]
**reservationLimit** | **Integer** | The number of reservations that can be made with this coupon code.  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the coupon becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiration date of the coupon. Coupon never expires if this is omitted. |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this item. |  [optional]
**recipientsIntegrationIds** | **List&lt;String&gt;** | The integration IDs for recipients. | 
**validCharacters** | **List&lt;String&gt;** | List of characters used to generate the random parts of a code. By default, the list of characters is equivalent to the &#x60;[A-Z, 0-9]&#x60; regular expression.  |  [optional]
**couponPattern** | **String** | The pattern used to generate coupon codes. The character &#x60;#&#x60; is a placeholder and is replaced by a random character from the &#x60;validCharacters&#x60; set.  |  [optional]



