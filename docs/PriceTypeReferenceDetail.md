

# PriceTypeReferenceDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referencingType** | [**ReferencingTypeEnum**](#ReferencingTypeEnum) | The entity type that references the price type. For example, a campaign or an Application cart item filter. | 
**referencingId** | **Long** | The ID of the entity that references the price type. | 
**referencingName** | **String** | The name of the entity that references the price type. | 
**applicationId** | **Long** | The ID of the Application that contains the entity that references the price type. |  [optional]



## Enum: ReferencingTypeEnum

Name | Value
---- | -----
CAMPAIGN | &quot;Campaign&quot;
APPLICATIONCARTITEMFILTER | &quot;ApplicationCartItemFilter&quot;
TEMPLATE | &quot;Template&quot;



