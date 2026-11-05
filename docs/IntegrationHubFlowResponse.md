

# IntegrationHubFlowResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | ID of the integration hub flow. | 
**integrationName** | **String** | Name of the integration. |  [optional]
**instanceName** | **String** | Name of the integration instance. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the flow was created. | 
**disabledUntil** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp until which the flow is disabled. Null when the flow is active. |  [optional]
**applicationId** | **Long** | ID of the application the flow is registered for. |  [optional]
**loyaltyProgramId** | **Long** | ID of the loyalty program the flow is registered for. |  [optional]
**eventType** | **String** | The event type we want to register a flow for. | 
**config** | [**IntegrationHubFlowConfigResponse**](IntegrationHubFlowConfigResponse.md) |  | 



