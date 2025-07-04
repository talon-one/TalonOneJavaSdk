

# TemplateArgDef

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of value this argument expects. | 
**description** | **String** | A campaigner-friendly description of the argument, this will also be shown in the rule editor. |  [optional]
**title** | **String** | A campaigner friendly name for the argument, this will be shown in the rule editor. | 
**ui** | [**Object**](.md) | Arbitrary metadata that may be used to render an input for this argument. | 
**key** | **String** | The identifier for the associated value within the JSON object. |  [optional]
**picklistID** | **Long** | ID of the picklist linked to a template. |  [optional]
**restrictedByPicklist** | **Boolean** | Whether or not this attribute&#39;s value is restricted by picklist (&#x60;picklist&#x60; property) |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
STRING | &quot;string&quot;
BOOLEAN | &quot;boolean&quot;
NUMBER | &quot;number&quot;
TIME | &quot;time&quot;
_LIST_STRING_ | &quot;(list string)&quot;



