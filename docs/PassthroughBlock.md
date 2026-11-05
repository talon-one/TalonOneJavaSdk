

# PassthroughBlock

A block representing a Talang expression that could not be mapped to a typed block. The expression is preserved in its raw Talang array form for diagnostic and round-trip purposes.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | [**TypeEnum**](#TypeEnum) | The type discriminator for this block. | 
**expression** | **List&lt;Object&gt;** | The raw Talang expression as an array. For a function call, the first element is the function name and subsequent elements are its arguments. For any other expression (for example a bare attribute path or a literal value), this is a single-element array containing that value. | 



## Enum: TypeEnum

Name | Value
---- | -----
PASSTHROUGH | &quot;passthrough&quot;



