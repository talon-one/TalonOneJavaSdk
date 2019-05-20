
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was last modified. | 
**companyName** | **String** |  | 
**domainName** | **String** | Subdomain Name for yourcompany.talon.one | 
**state** | [**StateEnum**](#StateEnum) | State of the account (trial, active, trial_expired) | 
**billingEmail** | **String** | The billing email address associated with your company account. | 
**planName** | **String** | The name of your booked plan. |  [optional]
**planExpires** | [**OffsetDateTime**](OffsetDateTime.md) | The point in time at which your current plan expires. |  [optional]
**applicationLimit** | **Integer** | The maximum number of Applications covered by your plan. |  [optional]
**userLimit** | **Integer** | The maximum number of Campaign Manager Users covered by your plan. |  [optional]
**campaignLimit** | **Integer** | The maximum number of Campaigns covered by your plan. |  [optional]
**apiLimit** | **Integer** | The maximum number of Integration API calls covered by your plan per billing period. |  [optional]
**applicationCount** | **Integer** | The current number of Applications in your account. | 
**userCount** | **Integer** | The current number of Campaign Manager Users in your account. | 
**campaignsActiveCount** | **Integer** | The current number of active Campaigns in your account. | 
**campaignsInactiveCount** | **Integer** | The current number of inactive Campaigns in your account. | 
**attributes** | [**Object**](.md) | Arbitrary properties associated with this campaign |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
TRIAL | &quot;trial&quot;
ACTIVE | &quot;active&quot;
TRIAL_EXPIRED | &quot;trial_expired&quot;



