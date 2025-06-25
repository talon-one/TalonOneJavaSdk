

# Picklist

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**type** | [**TypeEnum**](#TypeEnum) | The type of allowed values in the picklist. If the type &#x60;time&#x60; is chosen, it must be an RFC3339 timestamp string. | 
**values** | **List&lt;String&gt;** | The list of allowed values provided by this picklist. | 
**modifiedBy** | **Long** | ID of the user who last updated this effect if available. |  [optional]
**createdBy** | **Long** | ID of the user who created this effect. | 
**accountId** | **Long** | The ID of the account that owns this entity. |  [optional]
**imported** | **Boolean** | Imported flag shows that a picklist is imported by a CSV file or not |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
STRING | &quot;string&quot;
BOOLEAN | &quot;boolean&quot;
NUMBER | &quot;number&quot;
TIME | &quot;time&quot;



