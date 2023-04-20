

# CampaignGroup


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was last modified. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**name** | **String** | The name of this campaign group. | 
**description** | **String** | A longer description of the campaign group. |  [optional]
**subscribedApplicationsIds** | **List&lt;Integer&gt;** | A list of the IDs of the applications that this campaign group is enabled for. |  [optional]
**campaignIds** | **List&lt;Integer&gt;** | A list of the IDs of the campaigns that this campaign group owns. |  [optional]



