
# ApplicationApiHealth

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**summary** | [**SummaryEnum**](#SummaryEnum) | One-word summary of the health of the API connection of an application | 
**lastUsed** | [**OffsetDateTime**](OffsetDateTime.md) | time of last request relevant to the API health test | 


<a name="SummaryEnum"></a>
## Enum: SummaryEnum
Name | Value
---- | -----
OK | &quot;OK&quot;
WARNING | &quot;WARNING&quot;
ERROR | &quot;ERROR&quot;
CRITICAL | &quot;CRITICAL&quot;
NONE | &quot;NONE&quot;



