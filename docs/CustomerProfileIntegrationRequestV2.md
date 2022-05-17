

# CustomerProfileIntegrationRequestV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**Object**](.md) | Arbitrary properties associated with this item |  [optional]
**audiencesChanges** | [**ProfileAudiencesChanges**](ProfileAudiencesChanges.md) |  |  [optional]
**responseContent** | [**List&lt;ResponseContentEnum&gt;**](#List&lt;ResponseContentEnum&gt;) | Optional list of requested information to be present on the response related to the customer profile update.  Currently supported: \&quot;customerProfile\&quot;, \&quot;triggeredCampaigns\&quot;, \&quot;loyalty\&quot;, \&quot;event\&quot;, \&quot;awardedGiveaways\&quot;, \&quot;ruleFailureReasons\&quot;.  **Note:** &#x60;ruleFailureReasons&#x60; is always part of the response when the Application type is &#x60;sandbox&#x60;.  |  [optional]



## Enum: List&lt;ResponseContentEnum&gt;

Name | Value
---- | -----
CUSTOMERPROFILE | &quot;customerProfile&quot;
TRIGGEREDCAMPAIGNS | &quot;triggeredCampaigns&quot;
LOYALTY | &quot;loyalty&quot;
EVENT | &quot;event&quot;
AWARDEDGIVEAWAYS | &quot;awardedGiveaways&quot;
RULEFAILUREREASONS | &quot;ruleFailureReasons&quot;



