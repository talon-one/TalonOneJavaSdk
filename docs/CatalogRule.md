

# CatalogRule

A rule template stored in a catalog entry. Rules in catalog entries only contain title (no description, as description is at the catalog entry level).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | A short description of the rule. | 
**bindings** | [**List&lt;Binding&gt;**](Binding.md) | An array that provides objects with variable names (name) and talang expressions to whose result they are bound (expression) during rule evaluation. The order of the evaluation is decided by the position in the array. |  [optional]
**condition** | **List&lt;Object&gt;** | A Talang expression that will be evaluated in the context of the given event. | 
**effects** | **List&lt;Object&gt;** | An array of effectful Talang expressions in arrays that will be evaluated when a rule matches. | 



