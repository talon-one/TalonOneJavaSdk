

# LimitCounter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **Long** | The ID of the campaign that owns this entity. | 
**applicationId** | **Long** | The ID of the Application that owns this entity. | 
**accountId** | **Long** | The ID of the account that owns this entity. | 
**id** | **Long** | Unique ID for this entity. | 
**action** | **String** | The limitable action of the limit counter. | 
**profileId** | **Long** | The profile ID for which this limit counter is used. |  [optional]
**profileIntegrationId** | **String** | The profile integration ID for which this limit counter is used. |  [optional]
**couponId** | **Long** | The internal coupon ID for which this limit counter is used. |  [optional]
**couponValue** | **String** | The coupon value for which this limit counter is used. |  [optional]
**referralId** | **Long** | The referral ID for which this limit counter is used. |  [optional]
**referralValue** | **String** | The referral value for which this limit counter is used. |  [optional]
**identifier** | **String** | The arbitrary identifier for which this limit counter is used. |  [optional]
**period** | **String** | The time period for which this limit counter is used. |  [optional]
**limit** | [**BigDecimal**](BigDecimal.md) | The highest possible value for this limit counter. | 
**counter** | [**BigDecimal**](BigDecimal.md) | The current value for this limit counter. | 



