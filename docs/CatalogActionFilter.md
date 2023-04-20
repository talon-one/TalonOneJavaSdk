

# CatalogActionFilter

The properties for a single filtering condition in a catalog sync action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attr** | **String** | The name of the attribute to filter on. | 
**op** | [**OpEnum**](#OpEnum) | The filtering operator. | 
**value** | [**Object**](.md) | The value to filter for. | 



## Enum: OpEnum

Name | Value
---- | -----
EQ | &quot;EQ&quot;
LT | &quot;LT&quot;
LE | &quot;LE&quot;
GT | &quot;GT&quot;
GE | &quot;GE&quot;
IN | &quot;IN&quot;



