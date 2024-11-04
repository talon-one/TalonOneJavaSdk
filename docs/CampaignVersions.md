

# CampaignVersions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**revisionFrontendState** | [**RevisionFrontendStateEnum**](#RevisionFrontendStateEnum) | The campaign revision state displayed in the Campaign Manager. |  [optional]
**activeRevisionId** | **Integer** | ID of the revision that was last activated on this campaign.  |  [optional]
**activeRevisionVersionId** | **Integer** | ID of the revision version that is active on the campaign.  |  [optional]
**version** | **Integer** | Incrementing number representing how many revisions have been activated on this campaign, starts from 0 for a new campaign.  |  [optional]
**currentRevisionId** | **Integer** | ID of the revision currently being modified for the campaign.  |  [optional]
**currentRevisionVersionId** | **Integer** | ID of the latest version applied on the current revision.  |  [optional]
**stageRevision** | **Boolean** | Flag for determining whether we use current revision when sending requests with staging API key.  |  [optional]



## Enum: RevisionFrontendStateEnum

Name | Value
---- | -----
REVISED | &quot;revised&quot;
PENDING | &quot;pending&quot;



