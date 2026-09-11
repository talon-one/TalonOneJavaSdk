

# AchievementReference

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**achievementId** | **Long** | The ID of the achievement. You can get this ID with the [List achievement](https://docs.talon.one/management-api#tag/Achievements/operation/listAchievementsV2) endpoint. | 
**applicationId** | **Long** | The ID of the Application associated with the campaign that references this achievement. | 
**applicationName** | **String** | The name of the Application associated with the campaign that references this achievement. | 
**campaignId** | **Long** | The ID of the campaign that references this achievement. | 
**campaignName** | **String** | The name of the campaign that references this achievement. | 
**campaignState** | [**CampaignStateEnum**](#CampaignStateEnum) | The state of the campaign that references this achievement. | 



## Enum: CampaignStateEnum

Name | Value
---- | -----
ENABLED | &quot;enabled&quot;
DISABLED | &quot;disabled&quot;
ARCHIVED | &quot;archived&quot;



