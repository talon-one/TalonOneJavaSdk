

# NewTemplateDef

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Campaigner-friendly name for the template that will be shown in the rule editor. | 
**description** | **String** | A short description of the template that will be shown in the rule editor. |  [optional]
**help** | **String** | Extended help text for the template. |  [optional]
**category** | **String** | Used for grouping templates in the rule editor sidebar. | 
**expr** | **List&lt;Object&gt;** | A Talang expression that contains variable bindings referring to args. | 
**args** | [**List&lt;TemplateArgDef&gt;**](TemplateArgDef.md) | An array of argument definitions. | 
**expose** | **Boolean** | A flag to control exposure in Rule Builder. |  [optional]



