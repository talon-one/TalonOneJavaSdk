

# AccountAdditionalCost


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**name** | **String** | The additional cost name that will be used in API requests and Talang. E.g. if &#x60;name &#x3D;&#x3D; \&quot;shipping\&quot;&#x60; then you would set the shipping additional cost by including an &#x60;additionalCosts.shipping&#x60; property in your request payload. | 
**title** | **String** | The human-readable name for the additional cost that will be shown in the Campaign Manager. Like &#x60;name&#x60;, the combination of entity and title must also be unique. | 
**description** | **String** | A description of this additional cost. | 
**subscribedApplicationsIds** | **List&lt;Integer&gt;** | A list of the IDs of the applications that are subscribed to this additional cost |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of additional cost. The following options can be chosen: - &#x60;session&#x60;: Additional cost will be added per session, - &#x60;item&#x60;: Additional cost will be added per item, - &#x60;both&#x60;: Additional cost will be added per item and session.  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
SESSION | &quot;session&quot;
ITEM | &quot;item&quot;
BOTH | &quot;both&quot;



