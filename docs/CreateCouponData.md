

# CreateCouponData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List&lt;ExtendedCoupon&gt;**](ExtendedCoupon.md) | The array of coupons codes. If 1000 or fewer coupons are requested, all coupon data is sent. If 1001 or more coupons are requested, only &#x60;BatchID&#x60; is sent. |  [optional]
**totalResultSize** | **Long** |  |  [optional]
**batchID** | **String** | The ID of the batch to which the coupon belongs.  **Note:** The Batch ID is generated when coupons are created.  |  [optional]
**typeOfChange** | **String** |  | 
**operation** | **String** |  | 
**employeeName** | **String** |  | 



