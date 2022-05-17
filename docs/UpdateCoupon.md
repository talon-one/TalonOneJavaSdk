

# UpdateCoupon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usageLimit** | **Integer** | The number of times the coupon code can be redeemed. &#x60;0&#x60; means unlimited redemptions but any campaign usage limits will still apply.  |  [optional]
**discountLimit** | [**BigDecimal**](BigDecimal.md) | The amount of discounts that can be given with this coupon code.  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the coupon becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiry date of the coupon. Coupon never expires if this is omitted, zero, or negative. |  [optional]
**limits** | [**List&lt;LimitConfig&gt;**](LimitConfig.md) | Limits configuration for a coupon. These limits will override the limits set from the campaign.  **Note:** Only usable when creating a single coupon which is not tied to a specific recipient. Only per-profile limits are allowed to be configured.  |  [optional]
**recipientIntegrationId** | **String** | The integration ID for this coupon&#39;s beneficiary&#39;s profile |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this item |  [optional]



