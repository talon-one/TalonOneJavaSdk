

# UpdateCoupon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usageLimit** | **Long** | The number of times the coupon code can be redeemed. &#x60;0&#x60; means unlimited redemptions but any campaign usage limits will still apply.  |  [optional]
**discountLimit** | [**BigDecimal**](BigDecimal.md) | The total discount value that the code can give. Typically used to represent a gift card value.  |  [optional]
**reservationLimit** | **Long** | The number of reservations that can be made with this coupon code.  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the coupon becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiration date of the coupon. Coupon never expires if this is omitted. |  [optional]
**limits** | [**List&lt;LimitConfig&gt;**](LimitConfig.md) | Limits configuration for a coupon. These limits will override the limits set from the campaign.  **Note:** Only usable when creating a single coupon which is not tied to a specific recipient. Only per-profile limits are allowed to be configured.  |  [optional]
**recipientIntegrationId** | **String** | The integration ID for this coupon&#39;s beneficiary&#39;s profile. |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this item. |  [optional]
**isReservationMandatory** | **Boolean** | An indication of whether the code can be redeemed only if it has been reserved first. |  [optional]
**implicitlyReserved** | **Boolean** | An indication of whether the coupon is implicitly reserved for all customers. |  [optional]



