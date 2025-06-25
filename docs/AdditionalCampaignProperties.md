

# AdditionalCampaignProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budgets** | [**List&lt;CampaignBudget&gt;**](CampaignBudget.md) | A list of all the budgets that are defined by this campaign and their usage.  **Note:** Budgets that are not defined do not appear in this list and their usage is not counted until they are defined.  |  [optional]
**couponRedemptionCount** | **Long** | This property is **deprecated**. The count should be available under *budgets* property. Number of coupons redeemed in the campaign.  |  [optional]
**referralRedemptionCount** | **Long** | This property is **deprecated**. The count should be available under *budgets* property. Number of referral codes redeemed in the campaign.  |  [optional]
**discountCount** | [**BigDecimal**](BigDecimal.md) | This property is **deprecated**. The count should be available under *budgets* property. Total amount of discounts redeemed in the campaign.  |  [optional]
**discountEffectCount** | **Long** | This property is **deprecated**. The count should be available under *budgets* property. Total number of times discounts were redeemed in this campaign.  |  [optional]
**couponCreationCount** | **Long** | This property is **deprecated**. The count should be available under *budgets* property. Total number of coupons created by rules in this campaign.  |  [optional]
**customEffectCount** | **Long** | This property is **deprecated**. The count should be available under *budgets* property. Total number of custom effects triggered by rules in this campaign.  |  [optional]
**referralCreationCount** | **Long** | This property is **deprecated**. The count should be available under *budgets* property. Total number of referrals created by rules in this campaign.  |  [optional]
**addFreeItemEffectCount** | **Long** | This property is **deprecated**. The count should be available under *budgets* property. Total number of times the [add free item effect](https://docs.talon.one/docs/dev/integration-api/api-effects#addfreeitem) can be triggered in this campaign.  |  [optional]
**awardedGiveawaysCount** | **Long** | This property is **deprecated**. The count should be available under *budgets* property. Total number of giveaways awarded by rules in this campaign.  |  [optional]
**createdLoyaltyPointsCount** | [**BigDecimal**](BigDecimal.md) | This property is **deprecated**. The count should be available under *budgets* property. Total number of loyalty points created by rules in this campaign.  |  [optional]
**createdLoyaltyPointsEffectCount** | **Long** | This property is **deprecated**. The count should be available under *budgets* property. Total number of loyalty point creation effects triggered by rules in this campaign.  |  [optional]
**redeemedLoyaltyPointsCount** | [**BigDecimal**](BigDecimal.md) | This property is **deprecated**. The count should be available under *budgets* property. Total number of loyalty points redeemed by rules in this campaign.  |  [optional]
**redeemedLoyaltyPointsEffectCount** | **Long** | This property is **deprecated**. The count should be available under *budgets* property. Total number of loyalty point redemption effects triggered by rules in this campaign.  |  [optional]
**callApiEffectCount** | **Long** | This property is **deprecated**. The count should be available under *budgets* property. Total number of webhooks triggered by rules in this campaign.  |  [optional]
**reservecouponEffectCount** | **Long** | This property is **deprecated**. The count should be available under *budgets* property. Total number of reserve coupon effects triggered by rules in this campaign.  |  [optional]
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent event received by this campaign. |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent update to the campaign&#39;s property. Updates to external entities used in this campaign are **not** registered by this property, such as collection or coupon updates.  |  [optional]
**createdBy** | **String** | Name of the user who created this campaign if available. |  [optional]
**updatedBy** | **String** | Name of the user who last updated this campaign if available. |  [optional]
**templateId** | **Long** | The ID of the Campaign Template this Campaign was created from. |  [optional]
**frontendState** | [**FrontendStateEnum**](#FrontendStateEnum) | The campaign state displayed in the Campaign Manager. | 
**storesImported** | **Boolean** | Indicates whether the linked stores were imported via a CSV file. | 
**valueMapsIds** | **List&lt;Long&gt;** | A list of value map IDs for the campaign. |  [optional]



## Enum: FrontendStateEnum

Name | Value
---- | -----
EXPIRED | &quot;expired&quot;
SCHEDULED | &quot;scheduled&quot;
RUNNING | &quot;running&quot;
DISABLED | &quot;disabled&quot;
ARCHIVED | &quot;archived&quot;
STAGED | &quot;staged&quot;



