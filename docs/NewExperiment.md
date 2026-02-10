

# NewExperiment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isVariantAssignmentExternal** | **Boolean** | The source of the assignment. - false - The assignment to the variant is handled internally by the Talon.Oneandled internally by the Talon.One. - true - The assignment to the variant handled externally.  | 
**activated** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the experiment was activated.  |  [optional]
**state** | [**StateEnum**](#StateEnum) | A disabled experiment is not evaluated for rules or coupons.  |  [optional]
**campaign** | [**NewCampaign**](NewCampaign.md) |  | 



## Enum: StateEnum

Name | Value
---- | -----
ENABLED | &quot;enabled&quot;
DISABLED | &quot;disabled&quot;



