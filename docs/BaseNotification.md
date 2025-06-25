

# BaseNotification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy** | [**Object**](.md) | Indicates which notification properties to apply. | 
**enabled** | **Boolean** | Indicates whether the notification is activated. |  [optional]
**webhook** | [**BaseNotificationWebhook**](BaseNotificationWebhook.md) |  | 
**id** | **Long** | Unique ID for this entity. | 
**type** | [**TypeEnum**](#TypeEnum) | The notification type. | 



## Enum: TypeEnum

Name | Value
---- | -----
CAMPAIGN | &quot;campaign&quot;
LOYALTY_ADDED_DEDUCTED_POINTS | &quot;loyalty_added_deducted_points&quot;
CARD_ADDED_DEDUCTED_POINTS | &quot;card_added_deducted_points&quot;
COUPON | &quot;coupon&quot;
EXPIRING_COUPONS | &quot;expiring_coupons&quot;
EXPIRING_POINTS | &quot;expiring_points&quot;
CARD_EXPIRING_POINTS | &quot;card_expiring_points&quot;
PENDING_TO_ACTIVE_POINTS | &quot;pending_to_active_points&quot;
STRIKETHROUGH_PRICING | &quot;strikethrough_pricing&quot;
TIER_DOWNGRADE | &quot;tier_downgrade&quot;
TIER_UPGRADE | &quot;tier_upgrade&quot;
TIER_WILL_DOWNGRADE | &quot;tier_will_downgrade&quot;



