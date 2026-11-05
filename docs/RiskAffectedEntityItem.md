

# RiskAffectedEntityItem

A single entity flagged as anomalous within a risk.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityId** | **String** | The integration ID of the affected entity. | 
**activityValue** | **Double** | The observed value of the monitored activity metric for this entity. | 
**threshold** | **Double** | The anomaly threshold computed for the entity&#39;s Application group. | 
**severityRatio** | **Double** | The ratio of the observed value to the threshold. | 
**criticality** | [**CriticalityEnum**](#CriticalityEnum) | The critical classification bucket of this entity. | 



## Enum: CriticalityEnum

Name | Value
---- | -----
CRITICAL | &quot;critical&quot;
NOT_CRITICAL | &quot;not_critical&quot;



