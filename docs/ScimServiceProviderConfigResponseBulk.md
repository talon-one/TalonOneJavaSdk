

# ScimServiceProviderConfigResponseBulk

Configuration related to bulk operations, which allow multiple SCIM requests to be processed in a single HTTP request.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxOperations** | **Long** | The maximum number of individual operations that can be included in a single bulk request. |  [optional]
**maxPayloadSize** | **Long** | The maximum size, in bytes, of the entire payload for a bulk operation request. |  [optional]
**supported** | **Boolean** | Indicates whether the SCIM service provider supports bulk operations. |  [optional]



