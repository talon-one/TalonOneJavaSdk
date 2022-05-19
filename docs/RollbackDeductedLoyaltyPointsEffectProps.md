

# RollbackDeductedLoyaltyPointsEffectProps

The properties specific to the \"rollbackDeductedLoyaltyPoints\" effect. This effect is triggered whenever a previously closed session is cancelled and a deductLoyaltyPoints effect was revoked.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**programId** | **Integer** | The ID of the loyalty program where these points were reimbursed | 
**subLedgerId** | **String** | The ID of the subledger within the loyalty program where these points were reimbursed | 
**value** | [**BigDecimal**](BigDecimal.md) | The amount of reimbursed points that were added | 
**recipientIntegrationId** | **String** | The user for whom these points were reimbursed | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date after which the reimbursed points will be valid |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date after which the reimbursed points will expire |  [optional]
**transactionUUID** | **String** | The identifier of &#39;addition&#39; entries added to the ledger as the &#x60;deductLoyaltyPoints&#x60; effect is rolled back | 
**cardIdentifier** | **String** | The card on which these points were added. |  [optional]



