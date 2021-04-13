

# Coupon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**campaignId** | **Integer** | The ID of the campaign that owns this entity. | 
**value** | **String** | The actual coupon code. | 
**usageLimit** | **Integer** | The number of times a coupon code can be redeemed. This can be set to 0 for no limit, but any campaign usage limits will still apply.  | 
**discountLimit** | [**BigDecimal**](BigDecimal.md) | The amount of discounts that can be given with this coupon code.  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the coupon becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiry date of the coupon. Coupon never expires if this is omitted, zero, or negative. |  [optional]
**usageCounter** | **Integer** | The number of times this coupon has been successfully used. | 
**discountCounter** | [**BigDecimal**](BigDecimal.md) | The amount of discounts given on rules redeeming this coupon. Only usable if a coupon discount budget was set for this coupon. |  [optional]
**discountRemainder** | [**BigDecimal**](BigDecimal.md) | The remaining discount this coupon can give. |  [optional]
**attributes** | **Map&lt;String, Object&gt;** | Arbitrary properties associated with this item |  [optional]
**referralId** | **Integer** | The integration ID of the referring customer (if any) for whom this coupon was created as an effect. |  [optional]
**recipientIntegrationId** | **String** | The Integration ID of the customer that is allowed to redeem this coupon. |  [optional]
**importId** | **Integer** | The ID of the Import which created this coupon. |  [optional]
**reservation** | **Boolean** | This value controls what reservations mean to a coupon. If set to true the coupon reservation is used to mark it as a favourite, if set to false the coupon reservation is used as a requirement of usage. This value defaults to true if not specified. |  [optional]
**batchId** | **String** | The id of the batch the coupon belongs to. |  [optional]



