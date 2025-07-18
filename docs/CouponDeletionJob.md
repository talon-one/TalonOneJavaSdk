

# CouponDeletionJob

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**applicationId** | **Long** | The ID of the Application that owns this entity. | 
**accountId** | **Long** | The ID of the account that owns this entity. | 
**filters** | [**CouponDeletionFilters**](CouponDeletionFilters.md) |  | 
**status** | **String** | The current status of this request. Possible values: - &#x60;not_ready&#x60; - &#x60;pending&#x60; - &#x60;completed&#x60; - &#x60;failed&#x60;  | 
**deletedAmount** | **Long** | The number of coupon codes that were already deleted for this request. |  [optional]
**failCount** | **Long** | The number of times this job failed. | 
**errors** | **List&lt;String&gt;** | An array of individual problems encountered during the request. | 
**createdBy** | **Long** | ID of the user who created this effect. | 
**communicated** | **Boolean** | Indicates whether the user that created this job was notified of its final state. | 
**campaignIDs** | **List&lt;Long&gt;** |  |  [optional]



