

# CouponsNotificationData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**typeOfChange** | **String** | The type of change that occurred. | 
**operation** | **String** | The operation performed. | 
**employeeName** | **String** | The name of the employee associated with the operation. | 
**data** | [**List&lt;ExtendedCoupon&gt;**](ExtendedCoupon.md) | A list of extended coupon data. |  [optional]
**totalResultSize** | **Long** |  |  [optional]
**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) | The type of the notification | 



## Enum: NotificationTypeEnum

Name | Value
---- | -----
COUPONUPDATED | &quot;CouponUpdated&quot;
COUPONDELETED | &quot;CouponDeleted&quot;



