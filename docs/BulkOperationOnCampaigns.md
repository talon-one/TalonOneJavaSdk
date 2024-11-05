

# BulkOperationOnCampaigns

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) | The operation to perform on the specified campaign IDs.  | 
**campaignIds** | **List&lt;Integer&gt;** | The list of campaign IDs on which the operation will be performed. | 
**activateAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the revisions are finalized after the &#x60;activate_revision&#x60; operation. The current time is used when left blank.  **Note:** It must be an RFC3339 timestamp string.  |  [optional]



## Enum: OperationEnum

Name | Value
---- | -----
DISABLE | &quot;disable&quot;
DELETE | &quot;delete&quot;
ACTIVATE_REVISION | &quot;activate_revision&quot;



