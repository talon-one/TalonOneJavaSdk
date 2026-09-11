

# CheckAudienceBlock

A block that checks whether a given customer profile is a member of an audience.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | **String** | Identifies the block variant and determines which additional properties are present in it. | 
**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly]
**operator** | [**OperatorEnum**](#OperatorEnum) | An indicator of how the block compares its elements. | 
**profile** | [**ProfileEnum**](#ProfileEnum) | The customer profile to check against the audience. &#x60;Current&#x60; targets the customer in the current session; &#x60;Advocate&#x60; targets the person who invited their friend via referral program. | 
**audience** | [**CheckAudienceBlockAudience**](CheckAudienceBlockAudience.md) |  | 
**onFailure** | **List&lt;Object&gt;** | Promotion blocks evaluated when this block fails or returns false. |  [optional]



## Enum: OperatorEnum

Name | Value
---- | -----
MEMBER | &quot;member&quot;
NOT_MEMBER_ | &quot;not(member)&quot;
JUSTJOINED | &quot;justJoined&quot;
JUSTLEFT | &quot;justLeft&quot;



## Enum: ProfileEnum

Name | Value
---- | -----
CURRENT | &quot;Current&quot;
ADVOCATE | &quot;Advocate&quot;



