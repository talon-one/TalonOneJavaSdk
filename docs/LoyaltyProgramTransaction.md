

# LoyaltyProgramTransaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | ID of the loyalty ledger transaction. | 
**programId** | **Integer** | ID of the loyalty program. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time the loyalty transaction occurred. | 
**type** | [**TypeEnum**](#TypeEnum) | Type of transaction. Possible values:   - &#x60;addition&#x60;: Signifies added points.   - &#x60;subtraction&#x60;: Signifies deducted points.  | 
**amount** | [**BigDecimal**](BigDecimal.md) | Amount of loyalty points added or deducted in the transaction. | 
**name** | **String** | Name or reason for the loyalty ledger transaction. | 
**startDate** | **String** | When points become active. Possible values:   - &#x60;immediate&#x60;: Points are immediately active.   - a timestamp value: Points become active at a given date and time.  | 
**expiryDate** | **String** | When points expire. Possible values:   - &#x60;unlimited&#x60;: Points have no expiration date.   - a timestamp value: Points expire at a given date and time.  | 
**customerProfileId** | **String** | Customer profile integration ID used in the loyalty program. |  [optional]
**cardIdentifier** | **String** | The alphanumeric identifier of the loyalty card.  |  [optional]
**subledgerId** | **String** | ID of the subledger. | 
**customerSessionId** | **String** | ID of the customer session where the transaction occurred. |  [optional]
**importId** | **Integer** | ID of the import where the transaction occurred. |  [optional]
**userId** | **Integer** | ID of the user who manually added or deducted points. Applies only to manual transactions. |  [optional]
**userEmail** | **String** | The email of the Campaign Manager account that manually added or deducted points. Applies only to manual transactions. |  [optional]
**rulesetId** | **Integer** | ID of the ruleset containing the rule that triggered the effect. Applies only for transactions that resulted from a customer session. |  [optional]
**ruleName** | **String** | Name of the rule that triggered the effect. Applies only for transactions that resulted from a customer session. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
ADDITION | &quot;addition&quot;
SUBTRACTION | &quot;subtraction&quot;



