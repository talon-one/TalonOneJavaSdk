

# AwardDiscountAdditionalCostTarget

Applies the discount to an additional cost. The `target` field determines which subset of cart items the additional cost contribution is applied to.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | A target discriminator of type &#x60;additionalCost&#x60;. | 
**additionalCost** | [**AdditionalCostReference**](AdditionalCostReference.md) |  | 
**target** | [**Object**](.md) | A subset of cart items whose additional cost the discount applies to. Cannot be another &#x60;additionalCost&#x60; target. | 



## Enum: TypeEnum

Name | Value
---- | -----
ADDITIONALCOST | &quot;additionalCost&quot;



