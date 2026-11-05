

# Risk

A risk detected by the anomaly detection service for one Application group.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**notificationId** | **Long** | The ID of the risk notification rule that flagged this risk. | 
**featureDate** | [**LocalDate**](LocalDate.md) | The date of the activity data in which this risk was detected. The anomaly detection pipeline scores complete 24-hour cycles, so this is always the day before the risk was reported, not the reporting date itself.  | 
**groupKey** | **String** | The Application group this risk was detected in. Contains the Application ID, or &#x60;__GLOBAL__&#x60; for metrics that are not grouped by Application.  | 
**applicationId** | **Long** | The ID of the Application this risk belongs to. Absent for global metrics. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The triage lifecycle status of this risk. | 
**criticality** | [**CriticalityEnum**](#CriticalityEnum) | The critical classification bucket of this risk. | 
**entity** | [**EntityEnum**](#EntityEnum) | The entity type the risk was detected in. | 
**activity** | [**ActivityEnum**](#ActivityEnum) | The activity metric the risk was detected in. | 
**timeFrame** | [**TimeFrameEnum**](#TimeFrameEnum) | The rolling time window of the risk evaluation. | 
**reportedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The time the ML service reported this risk. | 
**affectedEntityCount** | **Long** | The total number of entities affected by this risk. | 
**description** | **String** | Human-readable description of the detected anomaly. |  [optional]
**discardReason** | [**DiscardReasonEnum**](#DiscardReasonEnum) | The reason this risk was discarded. Only present on discarded risks. |  [optional]
**statusComment** | **String** | The free-text details of the latest reclassification action: the description for resolving confirmed risks, or the details for discarding risks.  |  [optional]
**statusChangedBy** | **Long** | The ID of the user who performed the latest reclassification action. |  [optional]
**statusChangedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the latest reclassification action. |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent update. | 



## Enum: StatusEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
IN_REVIEW | &quot;in_review&quot;
CONFIRMED | &quot;confirmed&quot;
DISCARDED | &quot;discarded&quot;



## Enum: CriticalityEnum

Name | Value
---- | -----
CRITICAL | &quot;critical&quot;
NOT_CRITICAL | &quot;not_critical&quot;



## Enum: EntityEnum

Name | Value
---- | -----
PROFILE | &quot;customer_profile&quot;
SESSION | &quot;customer_session&quot;



## Enum: ActivityEnum

Name | Value
---- | -----
LOYALTY_POINTS_EARNED | &quot;loyalty_points_earned&quot;
DISCOUNTED_AMOUNT | &quot;discounted_amount&quot;
COMPLETED_ORDERS | &quot;completed_orders&quot;
COUPON_ATTEMPTS | &quot;coupon_attempts&quot;



## Enum: TimeFrameEnum

Name | Value
---- | -----
_1D | &quot;1D&quot;
_7D | &quot;7D&quot;
_30D | &quot;30D&quot;



## Enum: DiscardReasonEnum

Name | Value
---- | -----
EXPECTED_BEHAVIOR | &quot;expected_behavior&quot;
OTHER | &quot;other&quot;



