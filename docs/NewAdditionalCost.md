

# NewAdditionalCost

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The internal name used in API requests. | 
**title** | **String** | The human-readable name for the additional cost that will be shown in the Campaign Manager. Like &#x60;name&#x60;, the combination of entity and title must also be unique. | 
**description** | **String** | A description of this additional cost. | 
**subscribedApplicationsIds** | **List&lt;Integer&gt;** | A list of the IDs of the applications that are subscribed to this additional cost. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of additional cost. Possible value: - &#x60;session&#x60;: Additional cost will be added per session. - &#x60;item&#x60;: Additional cost will be added per item. - &#x60;both&#x60;: Additional cost will be added per item and session.  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
SESSION | &quot;session&quot;
ITEM | &quot;item&quot;
BOTH | &quot;both&quot;



