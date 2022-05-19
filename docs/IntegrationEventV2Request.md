

# IntegrationEventV2Request


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**profileId** | **String** | ID of the customers profile as used within this Talon.One account.  **Note:** If the customer does not yet have a known profileId, we recommend you use a guest profileId.  |  [optional]
**type** | **String** | A string representing the event. Must not be a reserved event name. | 
**attributes** | [**Object**](.md) | Arbitrary additional JSON data associated with the event. |  [optional]
**responseContent** | [**List&lt;ResponseContentEnum&gt;**](#List&lt;ResponseContentEnum&gt;) | Optional list of requested information to be present on the response related to the tracking custom event.  |  [optional]



## Enum: List&lt;ResponseContentEnum&gt;

Name | Value
---- | -----
CUSTOMERPROFILE | &quot;customerProfile&quot;
TRIGGEREDCAMPAIGNS | &quot;triggeredCampaigns&quot;
LOYALTY | &quot;loyalty&quot;
EVENT | &quot;event&quot;
AWARDEDGIVEAWAYS | &quot;awardedGiveaways&quot;
RULEFAILUREREASONS | &quot;ruleFailureReasons&quot;



