
# Ruleset

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**campaignId** | **Integer** | The ID of the campaign that owns this entity. | 
**userId** | **Integer** | The ID of the account that owns this entity. | 
**rules** | [**List&lt;Rule&gt;**](Rule.md) | Set of rules to apply. | 
**activatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp indicating when this Ruleset was activated. |  [optional]



