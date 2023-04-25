

# Change


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**userId** | **Integer** | The ID of the user associated with this entity. | 
**applicationId** | **Integer** | ID of application associated with change. |  [optional]
**entity** | **String** | API endpoint on which the change was initiated. | 
**old** | [**Object**](.md) | Resource before the change occurred. |  [optional]
**_new** | [**Object**](.md) | Resource after the change occurred. |  [optional]
**managementKeyId** | **Integer** | ID of management key used to perform changes. |  [optional]



