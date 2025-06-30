

# LoyaltyCard

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**programID** | **Integer** | The ID of the loyalty program that owns this entity. | 
**programName** | **String** | The integration name of the loyalty program that owns this entity. |  [optional]
**programTitle** | **String** | The Campaign Manager-displayed name of the loyalty program that owns this entity. |  [optional]
**status** | **String** | Status of the loyalty card. Can be &#x60;active&#x60; or &#x60;inactive&#x60;.  | 
**blockReason** | **String** | Reason for transferring and blocking the loyalty card.  |  [optional]
**identifier** | **String** | The alphanumeric identifier of the loyalty card.  | 
**usersPerCardLimit** | **Integer** | The max amount of customer profiles that can be linked to the card. 0 means unlimited.  | 
**profiles** | [**List&lt;LoyaltyCardProfileRegistration&gt;**](LoyaltyCardProfileRegistration.md) | Integration IDs of the customers profiles linked to the card. |  [optional]
**ledger** | [**LedgerInfo**](LedgerInfo.md) |  |  [optional]
**subledgers** | [**Map&lt;String, LedgerInfo&gt;**](LedgerInfo.md) | Displays point balances of the card in the subledgers of the loyalty program. |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent update of the loyalty card. |  [optional]
**oldCardIdentifier** | **String** | The alphanumeric identifier of the loyalty card.  |  [optional]
**newCardIdentifier** | **String** | The alphanumeric identifier of the loyalty card.  |  [optional]
**batchId** | **String** | The ID of the batch in which the loyalty card was created. |  [optional]



