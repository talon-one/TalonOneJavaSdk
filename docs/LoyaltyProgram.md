
# LoyaltyProgram

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was last modified. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**name** | **String** | The name of this loyalty program | 
**description** | **String** | A longer description of the loyalty program |  [optional]
**pointValidity** | **Integer** | Validity of newly added points in months | 
**spendingRate** | **Integer** | Exchange rate between loyalty points and currency for spending points |  [optional]
**allowFallback** | **Boolean** | Allow/disallow use of currency conversion rate for spending points |  [optional]
**allowMixedPayment** | **Boolean** | Allow/disallow partial payment in currency for products bought with loyalty points |  [optional]
**tiers** | [**Tiers**](Tiers.md) |  |  [optional]
**activeApplications** | [**List&lt;LoyaltyProgramActivation&gt;**](LoyaltyProgramActivation.md) | A list of applications that have this loyalty program active |  [optional]



