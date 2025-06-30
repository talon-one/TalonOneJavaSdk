

# LoyaltyProgramBalance

The balance in a Loyalty Program for some Customer.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentBalance** | [**BigDecimal**](BigDecimal.md) | Sum of currently active points. | 
**pendingBalance** | [**BigDecimal**](BigDecimal.md) | Sum of pending points. | 
**negativeBalance** | [**BigDecimal**](BigDecimal.md) | Sum of negative points. This implies that &#x60;currentBalance&#x60; is &#x60;0&#x60;. |  [optional]
**expiredBalance** | [**BigDecimal**](BigDecimal.md) | **DEPRECATED** Value is shown as 0.  | 
**spentBalance** | [**BigDecimal**](BigDecimal.md) | **DEPRECATED** Value is shown as 0.  | 
**tentativeCurrentBalance** | [**BigDecimal**](BigDecimal.md) | The tentative points balance, reflecting the &#x60;currentBalance&#x60; and all point additions and deductions within the current open customer session. When the session is closed, the effects are applied and the &#x60;currentBalance&#x60; is updated to this value.  **Note:** Tentative balances are specific to the current session and do not take into account other open sessions for the given customer.  | 
**tentativePendingBalance** | [**BigDecimal**](BigDecimal.md) | The tentative points balance, reflecting the &#x60;pendingBalance&#x60; and all point additions with a future activation date within the current open customer session. When the session is closed, the effects are applied and the &#x60;pendingBalance&#x60; is updated to this value.  **Note:** Tentative balances are specific to the current session and do not take into account other open sessions for the given customer.  |  [optional]
**tentativeNegativeBalance** | [**BigDecimal**](BigDecimal.md) | The tentative negative balance after all additions and deductions from the current customer session are applied to &#x60;negativeBalance&#x60;. When the session is closed, the tentative effects are applied and &#x60;negativeBalance&#x60; is updated to this value.  **Note:** Tentative balances are specific to the current session and do not take into account other open sessions for the given customer.  |  [optional]



