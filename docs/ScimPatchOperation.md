

# ScimPatchOperation

Patch operation that is used to update the information.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**op** | [**OpEnum**](#OpEnum) | The method that should be used in the operation. | 
**path** | **String** | The path specifying the attribute that should be updated. |  [optional]
**value** | **String** | The value that should be updated. Required if &#x60;op&#x60; is &#x60;add&#x60; or &#x60;replace&#x60;. |  [optional]



## Enum: OpEnum

Name | Value
---- | -----
ADD | &quot;add&quot;
REMOVE | &quot;remove&quot;
REPLACE | &quot;replace&quot;



