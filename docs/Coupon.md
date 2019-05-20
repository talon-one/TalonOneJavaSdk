
# Coupon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**campaignId** | **Integer** | The ID of the campaign that owns this entity. | 
**value** | **String** | The actual coupon code. | 
**usageLimit** | **Integer** | The number of times a coupon code can be redeemed. This can be set to 0 for no limit, but any campaign usage limits will still apply.  | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the coupon becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiry date of the coupon. Coupon never expires if this is omitted, zero, or negative. |  [optional]
**usageCounter** | **Integer** | The number of times this coupon has been successfully used. | 
**attributes** | [**Object**](.md) | Arbitrary properties associated with this item |  [optional]
**referralId** | **Integer** | The integration ID of the referring customer (if any) for whom this coupon was created as an effect. |  [optional]
**recipientIntegrationId** | **String** | The integration ID of a referred customer profile. |  [optional]
**importId** | **Integer** | The ID of the Import which created this coupon. |  [optional]
**batchId** | **String** | The id of the batch the coupon belongs to. |  [optional]



