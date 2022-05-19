

# LoyaltyCard


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**programID** | **Integer** | The ID of the loyalty program that owns this entity. | 
**status** | **String** | Status of the loyalty card. Can be one of: [&#39;active&#39;, &#39;disabled&#39;]  | 
**identifier** | **String** | The alphanumeric identifier of the loyalty card. | 
**usersPerCardLimit** | **Integer** | The max amount of user profiles a card can be shared with. 0 means unlimited.  | 
**profiles** | [**List&lt;LoyaltyCardProfileRegistration&gt;**](LoyaltyCardProfileRegistration.md) | Integration IDs of the customers associated with the card. |  [optional]
**ledger** | [**LedgerInfo**](LedgerInfo.md) |  |  [optional]
**subledgers** | [**Map&lt;String, LedgerInfo&gt;**](LedgerInfo.md) | Displays point balances of the card in the subledgers of the loyalty program. |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent update of the loyalty card. |  [optional]



