

# UpdateAudienceMembershipBlock

A block that adds a customer to or removes them from an audience.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | **String** | Identifies the block variant and determines which additional properties are present in it. | 
**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly]
**operator** | [**OperatorEnum**](#OperatorEnum) | The action to perform. | 
**profile** | [**ProfileEnum**](#ProfileEnum) | The customer profile to add or remove from the audience. &#x60;Current&#x60; targets the customer in the current session; &#x60;Advocate&#x60; targets the person who invited their friend via referral program. | 
**audience** | [**UpdateAudienceMembershipBlockAudience**](UpdateAudienceMembershipBlockAudience.md) |  | 



## Enum: OperatorEnum

Name | Value
---- | -----
ADD | &quot;add&quot;
REMOVE | &quot;remove&quot;



## Enum: ProfileEnum

Name | Value
---- | -----
CURRENT | &quot;Current&quot;
ADVOCATE | &quot;Advocate&quot;



