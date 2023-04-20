

# ApplicationApiHealth

Report of health of the API connection of an application.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**summary** | [**SummaryEnum**](#SummaryEnum) | One-word summary of the health of the API connection of an application. Possible values are: - &#x60;OK&#x60;: The Application has received only successful API requests in the last 5 minutes. - &#x60;WARNING&#x60;: The Application received at least one failed request in the last 50 minutes. - &#x60;ERROR&#x60;: More than 50% of received requests failed. - &#x60;CRITICAL&#x60;: All received requests failed. - &#x60;NONE&#x60;: During the last 5 minutes, the Application hasn&#39;t recorded any integration API requests.  | 
**lastUsed** | [**OffsetDateTime**](OffsetDateTime.md) | time of last request relevant to the API health test. | 



## Enum: SummaryEnum

Name | Value
---- | -----
OK | &quot;OK&quot;
WARNING | &quot;WARNING&quot;
ERROR | &quot;ERROR&quot;
CRITICAL | &quot;CRITICAL&quot;
NONE | &quot;NONE&quot;



