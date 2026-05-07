

# GenerateLoyaltyCard

The parameters necessary to generate a loyalty card.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of the loyalty card. |  [optional]
**customerProfileIds** | **List&lt;String&gt;** | Integration IDs of the customer profiles linked to the card. |  [optional]
**cardIdentifier** | **String** | The identifier of the loyalty card, which must match the regular expression &#x60;^[A-Za-z0-9._%+@-]+$&#x60;.  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;



