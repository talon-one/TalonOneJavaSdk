

# ApplicationCustomer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. The exact moment this entity was created. The exact moment this entity was created. | 
**integrationId** | **String** | The integration ID for this entity sent to and used in the Talon.One system. The integration ID for this entity sent to and used in the Talon.One system. | 
**attributes** | [**Object**](.md) | Arbitrary properties associated with this item | 
**accountId** | **Integer** | The ID of the Talon.One account that owns this profile. The ID of the Talon.One account that owns this profile. | 
**closedSessions** | **Integer** | The total amount of closed sessions by a customer. A closed session is a successful purchase. | 
**totalSales** | [**BigDecimal**](BigDecimal.md) | Sum of all purchases made by this customer | 
**loyaltyMemberships** | [**List&lt;LoyaltyMembership&gt;**](LoyaltyMembership.md) | A list of loyalty programs joined by the customer |  [optional]
**audienceMemberships** | [**List&lt;AudienceMembership&gt;**](AudienceMembership.md) | A list of audiences the customer belongs to |  [optional]
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent event received from this customer | 



