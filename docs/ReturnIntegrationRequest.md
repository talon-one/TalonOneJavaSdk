

# ReturnIntegrationRequest

The body of a return integration API request. Next to the cart items details, this contains an optional listing of extra properties that should be returned in the response.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_return** | [**NewReturn**](NewReturn.md) |  | 
**responseContent** | [**List&lt;ResponseContentEnum&gt;**](#List&lt;ResponseContentEnum&gt;) | Extends the response with the chosen data entities. Use this property to get as much data as you need in one _Update customer session_ request instead of sending extra requests to other endpoints.  |  [optional]



## Enum: List&lt;ResponseContentEnum&gt;

Name | Value
---- | -----
CUSTOMERSESSION | &quot;customerSession&quot;
CUSTOMERPROFILE | &quot;customerProfile&quot;
COUPONS | &quot;coupons&quot;
TRIGGEREDCAMPAIGNS | &quot;triggeredCampaigns&quot;
REFERRAL | &quot;referral&quot;
LOYALTY | &quot;loyalty&quot;
EVENT | &quot;event&quot;
PREVIOUSRETURNS | &quot;previousReturns&quot;



