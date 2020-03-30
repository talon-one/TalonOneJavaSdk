

# NewRuleset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rules** | [**List&lt;Rule&gt;**](Rule.md) | Set of rules to apply. | 
**bindings** | [**List&lt;Binding&gt;**](Binding.md) | An array that provides objects with variable names (name) and talang expressions to whose result they are bound (expression) during rule evaluation. The order of the evaluation is decided by the position in the array. | 
**rbVersion** | **String** | A string indicating which version of the rulebuilder was used to create this ruleset. |  [optional]
**activate** | **Boolean** | A boolean indicating whether this newly created ruleset should also be activated for the campaign owns it |  [optional]



