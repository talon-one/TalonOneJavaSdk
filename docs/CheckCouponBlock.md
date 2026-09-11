

# CheckCouponBlock

A block that validates the coupon code value and date.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | **String** | Identifies the block variant and determines which additional properties are present in it. | 
**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly]
**redeem** | **Boolean** | When &#x60;true&#x60;, the coupon code is redeemed. | 
**onFailure** | **List&lt;Object&gt;** | Promotion blocks evaluated when this block fails or returns false. |  [optional]



