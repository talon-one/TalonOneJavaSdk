

# Account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was last modified. | 
**companyName** | **String** |  | 
**domainName** | **String** | Subdomain Name for yourcompany.talon.one. | 
**state** | [**StateEnum**](#StateEnum) | State of the account (active, deactivated). | 
**billingEmail** | **String** | The billing email address associated with your company account. | 
**planName** | **String** | The name of your booked plan. |  [optional]
**planExpires** | [**OffsetDateTime**](OffsetDateTime.md) | The point in time at which your current plan expires. |  [optional]
**applicationLimit** | **Long** | The maximum number of Applications covered by your plan. |  [optional]
**userLimit** | **Long** | The maximum number of Campaign Manager Users covered by your plan. |  [optional]
**campaignLimit** | **Long** | The maximum number of Campaigns covered by your plan. |  [optional]
**apiLimit** | **Long** | The maximum number of Integration API calls covered by your plan per billing period. |  [optional]
**applicationCount** | **Long** | The current number of Applications in your account. | 
**userCount** | **Long** | The current number of Campaign Manager Users in your account. | 
**campaignsActiveCount** | **Long** | The current number of active Campaigns in your account. | 
**campaignsInactiveCount** | **Long** | The current number of inactive Campaigns in your account. | 
**attributes** | [**Object**](.md) | Arbitrary properties associated with this campaign. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
DEACTIVATED | &quot;deactivated&quot;



