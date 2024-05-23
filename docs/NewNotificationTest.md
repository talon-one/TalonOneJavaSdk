

# NewNotificationTest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The notification type. | 
**queryParams** | **Map&lt;String, String&gt;** | Array of query parameters. |  [optional]
**headers** | **Map&lt;String, String&gt;** | List of API HTTP headers for the given webhook-based notification. |  [optional]
**verb** | [**VerbEnum**](#VerbEnum) | API method for this notification. | 
**url** | **String** | API URL for the given notification. | 
**payload** | **String** | API payload of this notification. | 



## Enum: TypeEnum

Name | Value
---- | -----
CAMPAIGN | &quot;campaign&quot;
LOYALTY_ADDED_DEDUCTED_POINTS | &quot;loyalty_added_deducted_points&quot;
COUPON | &quot;coupon&quot;
EXPIRING_COUPONS | &quot;expiring_coupons&quot;
EXPIRING_POINTS | &quot;expiring_points&quot;
PENDING_TO_ACTIVE_POINTS | &quot;pending_to_active_points&quot;
STRIKETHROUGH_PRICING | &quot;strikethrough_pricing&quot;
TIER_DOWNGRADE | &quot;tier_downgrade&quot;
TIER_UPGRADE | &quot;tier_upgrade&quot;
TIER_WILL_DOWNGRADE | &quot;tier_will_downgrade&quot;
CARD_EXPIRING_POINTS | &quot;card_expiring_points&quot;



## Enum: VerbEnum

Name | Value
---- | -----
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
GET | &quot;GET&quot;
DELETE | &quot;DELETE&quot;
PATCH | &quot;PATCH&quot;



