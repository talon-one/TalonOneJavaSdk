

# Experiment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**applicationId** | **Long** | The ID of the Application that owns this entity. | 
**isVariantAssignmentExternal** | **Boolean** | The source of the assignment. - false - The assignment to the variant is handled internally by the Talon.Oneandled internally by the Talon.One. - true - The assignment to the variant handled externally.  |  [optional]
**campaign** | [**Campaign**](Campaign.md) |  |  [optional]
**activated** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the experiment was activated.  |  [optional]
**state** | [**StateEnum**](#StateEnum) | A disabled experiment is not evaluated for rules or coupons.  |  [optional]
**variants** | [**List&lt;ExperimentVariant&gt;**](ExperimentVariant.md) |  |  [optional]
**deletedat** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the experiment was deleted.  |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
ENABLED | &quot;enabled&quot;
DISABLED | &quot;disabled&quot;



