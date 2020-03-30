

# RollbackDiscountEffectProps

The properties specific to the \"rollbackDiscount\" effect. This gets triggered whenever previously closed session is now cancelled and a setDiscount effect was cancelled on our internal discount limit counters.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the \&quot;setDiscount\&quot; effect that was rolled back | 
**value** | [**BigDecimal**](BigDecimal.md) | The value of the discount that was rolled back | 



