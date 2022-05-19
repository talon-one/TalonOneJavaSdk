

# CampaignPrioritiesChangedNotification

Notification about an Application whose campaigns' priorities changed.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | [**Application**](Application.md) |  | 
**oldPriorities** | [**Map&lt;String, List&lt;Integer&gt;&gt;**](List.md) | Campaign IDs for each priority. The priority can be one of: [&#39;universal&#39;, &#39;stackable&#39;, &#39;exclusive&#39;]  |  [optional]
**priorities** | [**Map&lt;String, List&lt;Integer&gt;&gt;**](List.md) | Campaign IDs for each priority. The priority can be one of: [&#39;universal&#39;, &#39;stackable&#39;, &#39;exclusive&#39;]  | 



