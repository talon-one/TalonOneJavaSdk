

# CustomerProfileIntegrationRequestV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**Object**](.md) | Arbitrary properties associated with this item |  [optional]
**responseContent** | [**List&lt;ResponseContentEnum&gt;**](#List&lt;ResponseContentEnum&gt;) | Optional list of requested information to be present on the response related to the customer profile update. Currently supported: \&quot;customerProfile\&quot;, \&quot;triggeredCampaigns\&quot;, \&quot;loyalty\&quot; and \&quot;event\&quot;.  |  [optional]



## Enum: List&lt;ResponseContentEnum&gt;

Name | Value
---- | -----
CUSTOMERPROFILE | &quot;customerProfile&quot;
TRIGGEREDCAMPAIGNS | &quot;triggeredCampaigns&quot;
LOYALTY | &quot;loyalty&quot;
EVENT | &quot;event&quot;



