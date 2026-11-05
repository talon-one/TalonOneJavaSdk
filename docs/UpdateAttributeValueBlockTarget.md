

# UpdateAttributeValueBlockTarget

The entity or item scope that this effect operates on.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Identifies the target scope of the attribute update. | 
**name** | **String** | Identifies the name of the target when its type is set to &#x60;selector&#x60; or &#x60;globalFilter&#x60;. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
SESSION | &quot;session&quot;
PROFILE | &quot;profile&quot;
ADVOCATEPROFILE | &quot;advocateProfile&quot;
COUPON | &quot;coupon&quot;
REFERRAL | &quot;referral&quot;
EVENT | &quot;event&quot;
LOYALTYCARD | &quot;loyaltyCard&quot;
ALLITEMS | &quot;allItems&quot;
SELECTOR | &quot;selector&quot;
GLOBALFILTER | &quot;globalFilter&quot;



