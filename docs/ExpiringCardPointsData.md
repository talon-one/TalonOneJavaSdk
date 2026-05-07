

# ExpiringCardPointsData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expiryDate** | [**LocalDate**](LocalDate.md) | The expiration date of loyalty points. | 
**loyaltyProgramID** | **Long** | The ID of the loyalty program. | 
**amountOfExpiringPoints** | [**BigDecimal**](BigDecimal.md) | The amount of loyalty points that will be expired soon. | 
**subledgerID** | **String** | The ID of the subledger within the loyalty program where these points were added. | 
**cardIdentifier** | **String** | The identifier of the loyalty card, &#x60;which must match the regular expression &#x60;^[A-Za-z0-9._%+@-]+$&#x60;.  | 
**usersPerCardLimit** | **Long** | The maximum number of customer profiles with which a card can be shared. This can be set to &#x60;0&#x60; for no limit.  | 
**profiles** | **List&lt;String&gt;** | The integration IDs of the customer profiles linked to the card. | 



