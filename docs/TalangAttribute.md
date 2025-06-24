

# TalangAttribute

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | [**EntityEnum**](#EntityEnum) | The name of the entity of the attribute. |  [optional]
**name** | **String** | The attribute name that will be used in API requests and Talang. E.g. if &#x60;name &#x3D;&#x3D; \&quot;region\&quot;&#x60; then you would set the region attribute by including an &#x60;attributes.region&#x60; property in your request payload.  | 
**title** | **String** | The name of the attribute that is displayed to the user in the Campaign Manager. |  [optional]
**type** | **String** | The talang type of the attribute. | 
**description** | **String** | A description of the attribute. |  [optional]
**visible** | **Boolean** | Indicates whether the attribute is visible in the UI or not. | 
**kind** | [**KindEnum**](#KindEnum) | Indicate the kind of the attribute. | 
**campaignsCount** | **Long** | The number of campaigns that refer to the attribute. | 
**exampleValue** | **List&lt;String&gt;** | Examples of values that can be assigned to the attribute. |  [optional]



## Enum: EntityEnum

Name | Value
---- | -----
ADVOCATEPROFILE | &quot;AdvocateProfile&quot;
ACCOUNT | &quot;Account&quot;
APPLICATION | &quot;Application&quot;
AWARDEDGIVEAWAY | &quot;AwardedGiveaway&quot;
BUNDLE | &quot;Bundle&quot;
CAMPAIGN | &quot;Campaign&quot;
CARTITEM | &quot;CartItem&quot;
COUPON | &quot;Coupon&quot;
CUSTOMERPROFILE | &quot;CustomerProfile&quot;
CUSTOMERSESSION | &quot;CustomerSession&quot;
EVENT | &quot;Event&quot;
ITEM | &quot;Item&quot;
LOYALTY | &quot;Loyalty&quot;
PROFILE | &quot;Profile&quot;
GIVEAWAY | &quot;Giveaway&quot;
REFERRAL | &quot;Referral&quot;
SESSION | &quot;Session&quot;
STORE | &quot;Store&quot;
ACHIEVEMENTS | &quot;Achievements&quot;



## Enum: KindEnum

Name | Value
---- | -----
BUILT_IN | &quot;built-in&quot;
CUSTOM | &quot;custom&quot;



