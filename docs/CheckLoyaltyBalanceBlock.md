

# CheckLoyaltyBalanceBlock

A block that checks a specific loyalty program's ledger or subledger balance against a numeric value.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | **String** | Identifies the block variant and determines which additional properties are present in it. | 
**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly]
**operator** | [**OperatorEnum**](#OperatorEnum) | An indicator of how the block compares the balance to the value. | 
**program** | [**CheckLoyaltyBalanceBlockProgram**](CheckLoyaltyBalanceBlockProgram.md) |  | 
**subledger** | **String** | The name of the subledger to check the balance of. Can be empty if this block checks the loyalty program&#39;s main ledger balance instead of a subledger. | 
**balance** | [**BalanceEnum**](#BalanceEnum) | The type of balance to check:  - &#x60;current&#x60; is the sum of currently active points  - &#x60;pending&#x60; is the sum of pending points.  - &#x60;negative&#x60; is the sum of negative points.  - &#x60;tentativeCurrent&#x60; is the tentative points balance within the current open customer session. | 
**value** | [**BigDecimal**](BigDecimal.md) | The numeric value to compare the balance against. | 
**onFailure** | **List&lt;Object&gt;** | Promotion blocks evaluated when this block fails or returns false. |  [optional]



## Enum: OperatorEnum

Name | Value
---- | -----
EQUALS | &quot;equals&quot;
NOT_EQUALS_ | &quot;not(equals)&quot;
LESSTHAN | &quot;lessThan&quot;
LESSTHANOREQUAL | &quot;lessThanOrEqual&quot;
GREATERTHAN | &quot;greaterThan&quot;
GREATERTHANOREQUAL | &quot;greaterThanOrEqual&quot;



## Enum: BalanceEnum

Name | Value
---- | -----
CURRENT | &quot;current&quot;
PENDING | &quot;pending&quot;
NEGATIVE | &quot;negative&quot;
TENTATIVECURRENT | &quot;tentativeCurrent&quot;



