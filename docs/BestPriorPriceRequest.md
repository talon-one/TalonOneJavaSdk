

# BestPriorPriceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**skus** | **List&lt;String&gt;** | List of product SKUs to check when determining the best prior price. | 
**timeframeEndDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date and time that defines the latest time for retrieving historical SKU prices. | 
**timeframe** | **String** | The number of days prior to the timeframeEndDate. Only prices within this look back period are considered for the best prior price evaluation. | 
**strictEndDate** | **Boolean** | This property is **deprecated**. Use &#x60;timeframeEndDateType&#x60; instead.  Indicates whether the timeframe includes the start of the current sale. - When &#x60;false&#x60;, the timeframe includes the start date of the current sale. - When &#x60;true&#x60;, the timeframe strictly uses the number of days specified in &#x60;timeframe&#x60;.  | 
**timeframeEndDateType** | [**TimeframeEndDateTypeEnum**](#TimeframeEndDateTypeEnum) | Sets the timeframe for retrieving historical pricing data. Can be one of the following values: - &#x60;strict&#x60;: The timeframe ends at the &#x60;timeframeEndDate&#x60; value. - &#x60;price&#x60;: The timeframe ends at the start of the current &#x60;contextId&#x60; with the current price value. Identical price records are merged. If there is no &#x60;contextId&#x60; for the most recent price, the most recent timestamp for the price is used.  - &#x60;sale&#x60;:  The timeframe ends at the start of current &#x60;contextId&#x60; and takes the prices prior to the start of the &#x60;contextId&#x60; into account.  |  [optional]
**target** | [**BestPriorTarget**](BestPriorTarget.md) |  |  [optional]



## Enum: TimeframeEndDateTypeEnum

Name | Value
---- | -----
STRICT | &quot;strict&quot;
PRICE | &quot;price&quot;
SALE | &quot;sale&quot;



