

# Revision

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique ID for this entity. Not to be confused with the Integration ID, which is set by your integration layer and used in most endpoints. | 
**activateAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the revision will be activated. |  [optional]
**accountId** | **Long** | The ID of the account that owns this entity. | 
**applicationId** | **Long** | The ID of the Application that owns this entity. | 
**campaignId** | **Long** | The ID of the campaign that the revision was created from. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the revision was created. | 
**createdBy** | **Long** | The ID of the user who created this revision. | 
**activatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when this revision was activated. |  [optional]
**activatedBy** | **Long** | The ID of the user who activated this revision. |  [optional]
**currentVersion** | [**RevisionVersion**](RevisionVersion.md) |  |  [optional]



