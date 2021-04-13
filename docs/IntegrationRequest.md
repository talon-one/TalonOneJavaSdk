

# IntegrationRequest

The body of a V2 integration API request (customer session update). Next to the customer session details, this contains an optional listing of extra properties that should be returned in the response.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerSession** | [**NewCustomerSessionV2**](NewCustomerSessionV2.md) |  | 
**responseContent** | [**List&lt;ResponseContentEnum&gt;**](#List&lt;ResponseContentEnum&gt;) | Optional list of requested information to be present on the response related to the customer session update. Currently supported: \&quot;customerSession\&quot;, \&quot;customerProfile\&quot;, \&quot;coupons\&quot;, \&quot;triggeredCampaigns\&quot;, \&quot;referral\&quot;, \&quot;loyalty\&quot;, \&quot;event\&quot;, \&quot;awardedGiveaways\&quot; and \&quot;ruleFailureReasons\&quot;.  |  [optional]



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



