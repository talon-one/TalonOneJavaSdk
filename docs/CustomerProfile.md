
# CustomerProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integrationId** | **String** | The ID used for this entity in the application system. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**attributes** | **Object** | Arbitrary properties associated with this item |  [optional]
**accountId** | **Integer** | The ID of the Talon.One account that owns this profile. | 
**closedSessions** | **Integer** | The total amount of closed sessions by a customer. A closed session is a successful purchase. | 
**totalSales** | [**BigDecimal**](BigDecimal.md) | Sum of all purchases made by this customer | 
**loyaltyMemberships** | [**List&lt;LoyaltyMembership&gt;**](LoyaltyMembership.md) | A list of loyalty programs joined by the customer | 
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent event received from this customer | 



