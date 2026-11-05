

# AwardDiscountGlobalFilterTarget

Applies the discount to items matched by a named Application-level cart-item filter.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | A target discriminator of type &#x60;globalFilter&#x60;. | 
**name** | **String** | The name of the Application-level cart-item filter the discount targets. | 
**prorated** | **Boolean** | Whether to distribute the discount proportionally across the matched items. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
GLOBALFILTER | &quot;globalFilter&quot;



