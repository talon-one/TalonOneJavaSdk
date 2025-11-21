

# CampaignLogSummary

Campaign Log Summary
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the user that performed the change. | 
**email** | **String** | E-mail of the user that performed the change. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time the change was performed. | 
**action** | [**ActionEnum**](#ActionEnum) | Action performed by the user. | 
**summary** | **String** | AI-generated summary of the action performed. | 



## Enum: ActionEnum

Name | Value
---- | -----
CREATE | &quot;create&quot;
DELETE | &quot;delete&quot;
UPDATE | &quot;update&quot;



