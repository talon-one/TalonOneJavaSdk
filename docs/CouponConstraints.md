

# CouponConstraints

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usageLimit** | **Long** | The number of times the coupon code can be redeemed. &#x60;0&#x60; means unlimited redemptions but any campaign usage limits will still apply.  |  [optional]
**discountLimit** | [**BigDecimal**](BigDecimal.md) | The total discount value that the code can give. Typically used to represent a gift card value.  |  [optional]
**reservationLimit** | **Long** | The number of reservations that can be made with this coupon code.  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the coupon becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiration date of the coupon. Coupon never expires if this is omitted. |  [optional]



