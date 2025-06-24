

# UpdateCouponBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usageLimit** | **Long** | The number of times the coupon code can be redeemed. &#x60;0&#x60; means unlimited redemptions but any campaign usage limits will still apply.  |  [optional]
**discountLimit** | [**BigDecimal**](BigDecimal.md) | The total discount value that the code can give. Typically used to represent a gift card value.  |  [optional]
**reservationLimit** | **Long** | The number of reservations that can be made with this coupon code.  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the coupon becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiration date of the coupon. Coupon never expires if this is omitted. |  [optional]
**attributes** | [**Object**](.md) | Optional property to set the value of custom coupon attributes. They are defined in the Campaign Manager, see [Managing attributes](https://docs.talon.one/docs/product/account/dev-tools/managing-attributes).  Coupon attributes can also be set to _mandatory_ in your Application [settings](https://docs.talon.one/docs/product/applications/using-attributes#making-attributes-mandatory). If your Application uses mandatory attributes, you must use this property to set their value.  |  [optional]
**batchID** | **String** | The ID of the batch the coupon(s) belong to. |  [optional]



