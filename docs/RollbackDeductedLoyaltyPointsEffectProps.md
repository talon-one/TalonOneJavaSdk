

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



