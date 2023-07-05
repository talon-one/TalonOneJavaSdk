

# CampaignSetBranchNode

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Indicates the node type. | 
**name** | **String** | Name of the set. | 
**operator** | [**OperatorEnum**](#OperatorEnum) | An indicator of how the set operates on its elements. | 
**elements** | [**List&lt;CampaignSetNode&gt;**](CampaignSetNode.md) | Child elements of this set. | 
**groupId** | **Integer** | The ID of the campaign set. | 
**locked** | **Boolean** | An indicator of whether the campaign set is locked for modification. | 
**description** | **String** | A description of the campaign set. |  [optional]
**evaluationMode** | [**EvaluationModeEnum**](#EvaluationModeEnum) |  | 



## Enum: TypeEnum

Name | Value
---- | -----
SET | &quot;SET&quot;



## Enum: OperatorEnum

Name | Value
---- | -----
ALL | &quot;ALL&quot;
FIRST | &quot;FIRST&quot;



## Enum: EvaluationModeEnum

Name | Value
---- | -----
STACKABLE | &quot;stackable&quot;
LISTORDER | &quot;listOrder&quot;
LOWESTDISCOUNT | &quot;lowestDiscount&quot;
HIGHESTDISCOUNT | &quot;highestDiscount&quot;



