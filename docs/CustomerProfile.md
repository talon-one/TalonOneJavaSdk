

# CustomerProfile

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The internal ID of the customer profile. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**integrationId** | **String** | The integration ID set by your integration layer. | 
**attributes** | [**Object**](.md) | Arbitrary properties associated with this item. | 
**accountId** | **Long** | The ID of the Talon.One account that owns this profile. | 
**closedSessions** | **Long** | The total number of closed sessions. Does not include closed sessions that have been cancelled or reopened. See the [docs](https://docs.talon.one/docs/dev/concepts/entities/customer-sessions#customer-session-states). | 
**totalSales** | [**BigDecimal**](BigDecimal.md) | The total amount of money spent by the customer **before** discounts are applied.  The total sales amount excludes the following: - Cancelled or reopened sessions. - Returned items.  | 
**loyaltyMemberships** | [**List&lt;LoyaltyMembership&gt;**](LoyaltyMembership.md) | **DEPRECATED** A list of loyalty programs joined by the customer.  |  [optional]
**audienceMemberships** | [**List&lt;AudienceMembership&gt;**](AudienceMembership.md) | The audiences the customer belongs to. |  [optional]
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent event received from this customer. This field is updated on calls that trigger the Rule Engine and that are not [dry requests](https://docs.talon.one/docs/dev/integration-api/dry-requests/#overlay).  For example, [reserving a coupon](https://docs.talon.one/integration-api#operation/createCouponReservation) for a customer doesn&#39;t impact this field.  | 
**sandbox** | **Boolean** | An indicator of whether the customer is part of a sandbox or live Application. See the [docs](https://docs.talon.one/docs/product/applications/overview#application-environments).  |  [optional]



