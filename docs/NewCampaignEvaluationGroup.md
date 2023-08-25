

# NewCampaignEvaluationGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the campaign evaluation group. | 
**parentId** | **Integer** | The ID of the parent group that contains the campaign evaluation group. | 
**description** | **String** | A description of the campaign evaluation group. |  [optional]
**evaluationMode** | [**EvaluationModeEnum**](#EvaluationModeEnum) |  | 
**locked** | **Boolean** | An indicator of whether the campaign evaluation group is locked for modification. | 



## Enum: EvaluationModeEnum

Name | Value
---- | -----
STACKABLE | &quot;stackable&quot;
LISTORDER | &quot;listOrder&quot;
LOWESTDISCOUNT | &quot;lowestDiscount&quot;
HIGHESTDISCOUNT | &quot;highestDiscount&quot;



