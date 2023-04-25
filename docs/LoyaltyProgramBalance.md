

# LoyaltyProgramBalance

The balance in a Loyalty Program for some Customer.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentBalance** | [**BigDecimal**](BigDecimal.md) | Sum of currently active points. | 
**pendingBalance** | [**BigDecimal**](BigDecimal.md) | Sum of pending points. | 
**expiredBalance** | [**BigDecimal**](BigDecimal.md) | **DEPRECATED** Value is shown as 0.  | 
**spentBalance** | [**BigDecimal**](BigDecimal.md) | **DEPRECATED** Value is shown as 0.  | 
**tentativeCurrentBalance** | [**BigDecimal**](BigDecimal.md) | Sum of the tentative active points (including additions and deductions) inside the currently open session. The &#x60;currentBalance&#x60; is updated to this value when you close the session, and the effects are applied. | 
**tentativePendingBalance** | [**BigDecimal**](BigDecimal.md) | Sum of pending points (including additions and deductions) inside the currently open session. The &#x60;pendingBalance&#x60; is updated to this value when you close the session, and the effects are applied. |  [optional]



