

# CampaignEvaluationGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationId** | **Integer** | The ID of the Application that owns this entity. | 
**name** | **String** | The name of the campaign evaluation group. | 
**parentId** | **Integer** | The ID of the parent group that contains the campaign evaluation group. | 
**description** | **String** | A description of the campaign evaluation group. |  [optional]
**evaluationMode** | [**EvaluationModeEnum**](#EvaluationModeEnum) | The mode by which campaigns in the campaign evaluation group are evaluated. | 
**evaluationScope** | [**EvaluationScopeEnum**](#EvaluationScopeEnum) | The evaluation scope of the campaign evaluation group. | 
**locked** | **Boolean** | An indicator of whether the campaign evaluation group is locked for modification. | 
**id** | **Integer** | Unique ID for this entity. Not to be confused with the Integration ID, which is set by your integration layer and used in most endpoints. | 



## Enum: EvaluationModeEnum

Name | Value
---- | -----
STACKABLE | &quot;stackable&quot;
LISTORDER | &quot;listOrder&quot;
LOWESTDISCOUNT | &quot;lowestDiscount&quot;
HIGHESTDISCOUNT | &quot;highestDiscount&quot;



## Enum: EvaluationScopeEnum

Name | Value
---- | -----
CARTITEM | &quot;cartItem&quot;
SESSION | &quot;session&quot;



