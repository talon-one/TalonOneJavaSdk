

# RiskCriticalityUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**riskIds** | **List&lt;Long&gt;** | The IDs of the risks to reclassify. | 
**criticality** | [**CriticalityEnum**](#CriticalityEnum) | The criticality to assign to risks. Only &#x60;not_critical&#x60; is accepted: critical risks can be reclassified as non-critical, but not the other way around.  | 



## Enum: CriticalityEnum

Name | Value
---- | -----
NOT_CRITICAL | &quot;not_critical&quot;



