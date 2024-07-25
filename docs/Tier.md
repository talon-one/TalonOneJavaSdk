

# Tier

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The internal ID of the tier. | 
**name** | **String** | The name of the tier. | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time when the customer moved to this tier. This value uses the loyalty program&#39;s time zone setting. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when tier level expires in the RFC3339 format (in the Loyalty Program&#39;s timezone). |  [optional]
**downgradePolicy** | [**DowngradePolicyEnum**](#DowngradePolicyEnum) | Customers&#39;s tier downgrade policy. - &#x60;one_down&#x60;: Once the tier expires and if the user doesn&#39;t have enough points to stay in the tier, the user is downgraded one tier down. - &#x60;balance_based&#x60;: Once the tier expires, the user&#39;s tier is evaluated based on the amount of active points the user has at this instant.  |  [optional]



## Enum: DowngradePolicyEnum

Name | Value
---- | -----
ONE_DOWN | &quot;one_down&quot;
BALANCE_BASED | &quot;balance_based&quot;



