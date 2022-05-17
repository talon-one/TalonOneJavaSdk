

# IntegrationRequest

The body of a V2 integration API request (customer session update). Next to the customer session details, this contains an optional listing of extra properties that should be returned in the response.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerSession** | [**NewCustomerSessionV2**](NewCustomerSessionV2.md) |  | 
**responseContent** | [**List&lt;ResponseContentEnum&gt;**](#List&lt;ResponseContentEnum&gt;) | Optional list of requested information to be present on the response related to the customer session update.  **Note:** &#x60;ruleFailureReasons&#x60; is always part of the response when the Application type is &#x60;sandbox&#x60;.  |  [optional]



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
AWARDEDGIVEAWAYS | &quot;awardedGiveaways&quot;
RULEFAILUREREASONS | &quot;ruleFailureReasons&quot;
PREVIOUSRETURNS | &quot;previousReturns&quot;



