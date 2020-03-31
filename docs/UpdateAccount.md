

# UpdateAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**Object**](.md) | Arbitrary properties associated with this campaign |  [optional]
**companyName** | **String** | Name of your company. | 
**billingEmail** | **String** | The billing email address associated with your company account. | 
**state** | [**StateEnum**](#StateEnum) | State of the account (active, deactivated) |  [optional]
**planExpires** | [**OffsetDateTime**](OffsetDateTime.md) | The point in time at which your current plan expires. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
DEACTIVATED | &quot;deactivated&quot;



