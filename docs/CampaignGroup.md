

# CampaignGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was last modified. | 
**accountId** | **Long** | The ID of the account that owns this entity. | 
**name** | **String** | The name of the campaign access group. | 
**description** | **String** | A longer description of the campaign access group. |  [optional]
**subscribedApplicationsIds** | **List&lt;Long&gt;** | A list of IDs of the Applications that this campaign access group is enabled for. |  [optional]
**campaignIds** | **List&lt;Long&gt;** | A list of IDs of the campaigns that are part of the campaign access group. |  [optional]



