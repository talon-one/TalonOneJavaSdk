

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
**campaignPriority** | [**CampaignPriorityEnum**](#CampaignPriorityEnum) | Default priority for campaigns created in this application, can be one of (universal, stackable, exclusive). If no value is provided, this is set to \&quot;universal\&quot; |  [optional]
**exclusiveCampaignsStrategy** | [**ExclusiveCampaignsStrategyEnum**](#ExclusiveCampaignsStrategyEnum) | The strategy used when choosing exclusive campaigns for evaluation, can be one of (listOrder, lowestDiscount, highestDiscount). If no value is provided, this is set to \&quot;listOrder\&quot; |  [optional]
**enableCascadingDiscounts** | **Boolean** | Flag indicating if discounts should cascade for this application |  [optional]
**enableFlattenedCartItems** | **Boolean** | Flag indicating if cart items of quantity larger than one should be separated into different items of quantity one |  [optional]
**attributesSettings** | [**AttributesSettings**](AttributesSettings.md) |  |  [optional]
**sandbox** | **Boolean** | Flag indicating if this is a live or sandbox application |  [optional]



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



## Enum: ExclusiveCampaignsStrategyEnum

Name | Value
---- | -----
LISTORDER | &quot;listOrder&quot;
LOWESTDISCOUNT | &quot;lowestDiscount&quot;
HIGHESTDISCOUNT | &quot;highestDiscount&quot;



