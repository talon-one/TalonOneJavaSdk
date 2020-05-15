

# UpdateApplication

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this application. | 
**description** | **String** | A longer description of the application. |  [optional]
**timezone** | **String** | A string containing an IANA timezone descriptor. | 
**currency** | **String** | A string describing a default currency for new customer sessions. | 
**caseSensitivity** | [**CaseSensitivityEnum**](#CaseSensitivityEnum) | A string indicating how should campaigns in this application deal with case sensitivity on coupon codes. |  [optional]
**attributes** | [**Object**](.md) | Arbitrary properties associated with this campaign |  [optional]
**limits** | [**List&lt;LimitConfig&gt;**](LimitConfig.md) | Default limits for campaigns created in this application |  [optional]
**campaignPriority** | [**CampaignPriorityEnum**](#CampaignPriorityEnum) | Default priority for campaigns created in this application, can be one of (universal, stackable, exclusive) |  [optional]
**attributesSettings** | [**AttributesSettings**](AttributesSettings.md) |  |  [optional]



## Enum: CaseSensitivityEnum

Name | Value
---- | -----
SENSITIVE | &quot;sensitive&quot;
INSENSITIVE_UPPERCASE | &quot;insensitive-uppercase&quot;
INSENSITIVE_LOWERCASE | &quot;insensitive-lowercase&quot;



## Enum: CampaignPriorityEnum

Name | Value
---- | -----
UNIVERSAL | &quot;universal&quot;
STACKABLE | &quot;stackable&quot;
EXCLUSIVE | &quot;exclusive&quot;



