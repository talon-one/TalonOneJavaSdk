

# Binding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A descriptive name for the value to be bound. | 
**type** | **String** | The kind of binding. Possible values are: - &#x60;bundle&#x60; - &#x60;cartItemFilter&#x60; - &#x60;subledgerBalance&#x60; - &#x60;templateParameter&#x60;  |  [optional]
**expression** | **List&lt;Object&gt;** | A Talang expression that will be evaluated and its result attached to the name of the binding. | 
**valueType** | **String** | Can be one of the following: - &#x60;string&#x60; - &#x60;number&#x60; - &#x60;boolean&#x60;  |  [optional]
**minValue** | [**BigDecimal**](BigDecimal.md) | The minimum value allowed for this placeholder. |  [optional]
**maxValue** | [**BigDecimal**](BigDecimal.md) | The maximum value allowed for this placeholder. |  [optional]
**attributeId** | **Long** | Id of the attribute attached to the placeholder. |  [optional]
**description** | **String** | Describes the placeholder field and value in the template. This description can be used when creating campaigns from this template. |  [optional]



