

# CheckTierBlock

A block that checks whether a customer profile is a member of a specific tier in a loyalty program.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | **String** | Identifies the block variant and determines which additional properties are present in it. | 
**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly]
**operator** | [**OperatorEnum**](#OperatorEnum) | An indicator of how the block compares its elements. | 
**subledger** | **String** | The name of the subledger to check a customer&#39;s tier in. Can be empty if this block checks the loyalty program&#39;s main ledger instead of a subledger. A subledger can only be used when the loyalty program that the tier is in has subledgers enabled. To specify the main ledger, provide an empty string (\&quot;\&quot;). | 
**tier** | [**TierBlockReference**](TierBlockReference.md) |  | 
**onFailure** | **List&lt;Object&gt;** | Promotion blocks evaluated when this block fails or returns false. |  [optional]



## Enum: OperatorEnum

Name | Value
---- | -----
MEMBER | &quot;member&quot;
NOT_MEMBER_ | &quot;not(member)&quot;



