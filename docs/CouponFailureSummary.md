

# CouponFailureSummary

Summary of the reasons for coupon redemption failure.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | ID of the evaluation record. | 
**eventID** | **Long** | ID of the event. | 
**sessionID** | **String** | ID of the customer session set by your integration layer. |  [optional]
**profileID** | **String** | ID of the customer profile set by your integration layer. |  [optional]
**status** | **String** | Status defines if the coupon code was applied or rejected. | 
**couponCode** | **String** | Coupon code passed for evaluation. | 
**language** | **String** | Language of the summary. | 
**shortSummary** | **String** | A summary of the reasons for coupon redemption failure. | 
**longSummary** | **String** | A detailed summary of the reasons for coupon redemption failure based on events of the entire session. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the request was made. | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the request was last updated. | 



