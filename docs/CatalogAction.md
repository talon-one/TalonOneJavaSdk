

# CatalogAction

Definition of all the properties that are needed for a single catalog sync action. The `type` field selects the concrete action variant.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of sync action. |  [optional]
**payload** | [**Object**](.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
ADD | &quot;ADD&quot;
PATCH | &quot;PATCH&quot;
PATCH_MANY | &quot;PATCH_MANY&quot;
REMOVE | &quot;REMOVE&quot;
REMOVE_MANY | &quot;REMOVE_MANY&quot;
ADD_PRICE_ADJUSTMENT | &quot;ADD_PRICE_ADJUSTMENT&quot;



