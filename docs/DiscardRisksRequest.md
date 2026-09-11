

# DiscardRisksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**riskIds** | **List&lt;Long&gt;** | The IDs of the risks to discard. | 
**reason** | [**ReasonEnum**](#ReasonEnum) | The reason the risks are being discarded. | 
**comment** | **String** | Free-text description of why the risks are being discarded. Required when &#x60;reason&#x60; is &#x60;other&#x60;, optional for &#x60;expected_behavior&#x60;.  |  [optional]



## Enum: ReasonEnum

Name | Value
---- | -----
EXPECTED_BEHAVIOR | &quot;expected_behavior&quot;
OTHER | &quot;other&quot;



