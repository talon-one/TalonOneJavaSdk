

# UpdateLoyaltyPointsExpiryBlock

A block that changes the expiry date of a customer's existing loyalty points, either to an absolute date or by extending it relative to the current expiry date.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this block. |  [optional] [readonly]
**type** | **String** | Identifies the block variant and determines which additional properties are present in it. | 
**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly]
**operator** | [**OperatorEnum**](#OperatorEnum) | &#x60;setTo&#x60; sets the expiry to an exact date; &#x60;laterBy&#x60; extends the current expiry by a relative duration. | 
**program** | [**UpdateLoyaltyPointsExpiryBlockProgram**](UpdateLoyaltyPointsExpiryBlockProgram.md) |  | 
**recipient** | [**RecipientEnum**](#RecipientEnum) | The customer profile whose points are affected. &#x60;Current&#x60; targets the customer in the current session; &#x60;Advocate&#x60; targets the person who invited their friend via referral program. | 
**subledger** | **String** | The name of the subledger whose points&#39; expiry is changed. Can be empty if this block targets the loyalty program&#39;s main ledger instead of a subledger. | 
**value** | [**Object**](.md) | An absolute expiry date (ISO 8601) when &#x60;operator&#x60; is &#x60;setTo&#x60;, or a relative duration (e.g. &#x60;30D&#x60;) when &#x60;operator&#x60; is &#x60;laterBy&#x60;. | 
**onFailure** | **List&lt;Object&gt;** | Blocks evaluated when this block fails or returns false. |  [optional]



## Enum: OperatorEnum

Name | Value
---- | -----
SETTO | &quot;setTo&quot;
LATERBY | &quot;laterBy&quot;



## Enum: RecipientEnum

Name | Value
---- | -----
CURRENT | &quot;Current&quot;
ADVOCATE | &quot;Advocate&quot;



