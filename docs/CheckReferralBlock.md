

# CheckReferralBlock

A block that validates the referral code value and date.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | [**TypeEnum**](#TypeEnum) | A block discriminator of type &#x60;checkReferral&#x60;. | 
**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly]
**redeem** | **Boolean** | When &#x60;true&#x60;, the referral code is redeemed. | 
**onFailure** | **List&lt;Object&gt;** | Promotion blocks evaluated when this block fails or returns false. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
CHECKREFERRAL | &quot;checkReferral&quot;



