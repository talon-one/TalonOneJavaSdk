

# SupportRequest

Summary of a support request created by a customer support agent.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Identifier of the support request. | 
**applicationId** | **Long** | Identifier of the Application connected to the loyalty program or the campaign. It is displayed in your Talon.One deployment URL. | 
**campaignId** | **Long** | Identifier of the campaign where the coupon or gift card is created. |  [optional]
**loyaltyProgramId** | **Long** | Identifier of the loyalty program where the points are added or deducted. |  [optional]
**subledgerId** | **Long** | Identifier of the subledger the points are added to or deducted from. If there is no existing subledger with this ID, the subledger is created automatically. |  [optional]
**createdByUser** | **String** | Email address of the customer support agent who created the support request. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the request was made. | 
**customerProfileId** | **String** | Integration ID of the customer profile linked to the support request. | 
**requestType** | [**RequestTypeEnum**](#RequestTypeEnum) | Type of reward requested, including gift cards, personal coupons, and loyalty point additions or deductions. | 
**requestValue** | **Float** | Requested monetary balance of the gift card or the number of loyalty points to be added or deducted. |  [optional]
**requestNote** | **String** | Notes attached to the support request. | 
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | Current status of the support request. | 
**processedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the request was approved or rejected. |  [optional]
**processingNote** | **String** | Notes attached by the admin when rejecting or approving a request. |  [optional]
**processedByUser** | **String** | Email address of the admin who approved or rejected the support request. |  [optional]
**couponCode** | **String** | Coupon code associated with the approved support request. |  [optional]



## Enum: RequestTypeEnum

Name | Value
---- | -----
GIFT_CARD | &quot;gift_card&quot;
PERSONAL_COUPON | &quot;personal_coupon&quot;
LOYALTY_POINTS_ADDED | &quot;loyalty_points_added&quot;
LOYALTY_POINTS_DEDUCTED | &quot;loyalty_points_deducted&quot;



## Enum: RequestStatusEnum

Name | Value
---- | -----
PENDING_APPROVAL | &quot;pending_approval&quot;
APPROVED | &quot;approved&quot;
REJECTED | &quot;rejected&quot;
EXPIRED | &quot;expired&quot;



