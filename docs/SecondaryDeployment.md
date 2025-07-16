

# SecondaryDeployment

The record of the secondary deployment.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique ID for this entity. Not to be confused with the Integration ID, which is set by your integration layer and used in most endpoints. | 
**name** | **String** | The name of the deployment. Used as subdomain, e.g. experimental.your-company.europe-west1.talon.one | 
**userId** | **Long** | The ID of the user who created the deployment. | 
**status** | [**StatusEnum**](#StatusEnum) | The status of the deployment. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the deployment was created. | 
**activeAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the deployment became active. |  [optional]
**failedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the deployment failed. |  [optional]
**deletedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the deployment was deleted. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
CREATED | &quot;created&quot;
ACTIVE | &quot;active&quot;
FAILED | &quot;failed&quot;
DELETED | &quot;deleted&quot;



