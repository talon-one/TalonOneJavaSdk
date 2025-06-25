

# CouponsNotificationPolicy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Notification name. | 
**scopes** | [**List&lt;ScopesEnum&gt;**](#List&lt;ScopesEnum&gt;) |  | 
**batchingEnabled** | **Boolean** | Indicates whether batching is activated. |  [optional]
**includeData** | **Boolean** | Indicates whether to include all generated coupons. If &#x60;false&#x60;, only the &#x60;batchId&#x60; of the generated coupons is included. |  [optional]
**batchSize** | **Long** | The required size of each batch of data. This value applies only when &#x60;batchingEnabled&#x60; is &#x60;true&#x60;. |  [optional]



## Enum: List&lt;ScopesEnum&gt;

Name | Value
---- | -----
ALL | &quot;all&quot;
CAMPAIGN_MANAGER | &quot;campaign_manager&quot;
MANAGEMENT_API | &quot;management_api&quot;
RULE_ENGINE | &quot;rule_engine&quot;



