

# CouponCreationJob

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**campaignId** | **Integer** | The ID of the campaign that owns this entity. | 
**applicationId** | **Integer** | The ID of the Application that owns this entity. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**usageLimit** | **Integer** | The number of times the coupon code can be redeemed. &#x60;0&#x60; means unlimited redemptions but any campaign usage limits will still apply.  | 
**discountLimit** | [**BigDecimal**](BigDecimal.md) | The total discount value that the code can give. Typically used to represent a gift card value.  |  [optional]
**reservationLimit** | **Integer** | The number of reservations that can be made with this coupon code.  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the coupon becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiration date of the coupon. Coupon never expires if this is omitted. |  [optional]
**numberOfCoupons** | **Integer** | The number of new coupon codes to generate for the campaign. | 
**couponSettings** | [**CodeGeneratorSettings**](CodeGeneratorSettings.md) |  |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with coupons. | 
**batchId** | **String** | The batch ID coupons created by this job will bear. | 
**status** | **String** | The current status of this request. Possible values: - &#x60;pending verification&#x60; - &#x60;pending&#x60; - &#x60;completed&#x60; - &#x60;failed&#x60; - &#x60;coupon pattern full&#x60;  | 
**createdAmount** | **Integer** | The number of coupon codes that were already created for this request. | 
**failCount** | **Integer** | The number of times this job failed. | 
**errors** | **List&lt;String&gt;** | An array of individual problems encountered during the request. | 
**createdBy** | **Integer** | ID of the user who created this effect. | 
**communicated** | **Boolean** | Whether or not the user that created this job was notified of its final state. | 
**chunkExecutionCount** | **Integer** | The number of times an attempt to create a chunk of coupons was made during the processing of the job. | 
**chunkSize** | **Integer** | The number of coupons that will be created in a single transactions. Coupons will be created in chunks until arriving at the requested amount. |  [optional]



