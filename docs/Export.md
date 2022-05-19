

# Export


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**userId** | **Integer** | The ID of the account that owns this entity. | 
**entity** | [**EntityEnum**](#EntityEnum) | The name of the entity that was exported. | 
**filter** | [**Object**](.md) | Map of keys and values that were used to filter the exported rows | 



## Enum: EntityEnum

Name | Value
---- | -----
COUPON | &quot;Coupon&quot;
REFERRAL | &quot;Referral&quot;
EFFECT | &quot;Effect&quot;
CUSTOMERSESSION | &quot;CustomerSession&quot;
LOYALTYLEDGER | &quot;LoyaltyLedger&quot;
LOYALTYLEDGERLOG | &quot;LoyaltyLedgerLog&quot;
COLLECTION | &quot;Collection&quot;



