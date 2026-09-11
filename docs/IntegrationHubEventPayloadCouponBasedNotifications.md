

# IntegrationHubEventPayloadCouponBasedNotifications

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **Long** | The ID of the integration hub event. Return this value in the delivery-status callback to mark the event delivered or failed. | 
**id** | **Long** |  | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**campaignId** | **Long** |  | 
**value** | **String** |  | 
**usageLimit** | **Long** |  | 
**discountLimit** | **Float** |  |  [optional]
**reservationLimit** | **Long** |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**usageCounter** | **Long** |  | 
**discountCounter** | **Float** |  |  [optional]
**discountRemainder** | **Float** |  |  [optional]
**referralId** | **Long** |  |  [optional]
**recipientIntegrationId** | **String** |  |  [optional]
**importId** | **Long** |  |  [optional]
**batchId** | **String** |  |  [optional]
**attributes** | [**Object**](.md) |  |  [optional]
**limits** | [**List&lt;IntegrationHubEventPayloadCouponBasedNotificationsLimits&gt;**](IntegrationHubEventPayloadCouponBasedNotificationsLimits.md) |  |  [optional]
**publishedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the event was published. | 
**sourceOfEvent** | **String** |  | 
**employeeName** | **String** |  | 



