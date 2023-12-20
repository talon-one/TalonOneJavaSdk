

# NewPicklist

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of allowed values in the picklist. If the type &#x60;time&#x60; is chosen, it must be an RFC3339 timestamp string. | 
**values** | **List&lt;String&gt;** | The list of allowed values provided by this picklist. | 



## Enum: TypeEnum

Name | Value
---- | -----
STRING | &quot;string&quot;
BOOLEAN | &quot;boolean&quot;
NUMBER | &quot;number&quot;
TIME | &quot;time&quot;



