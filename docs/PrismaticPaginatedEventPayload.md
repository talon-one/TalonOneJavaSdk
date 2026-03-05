

# PrismaticPaginatedEventPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalResultSize** | **Long** |  | 
**batchedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the batch was created. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  | 
**data** | **List&lt;Object&gt;** |  | 



## Enum: EventTypeEnum

Name | Value
---- | -----
LOYALTYPOINTSCHANGED | &quot;LoyaltyPointsChanged&quot;
LOYALTYTIERDOWNGRADE | &quot;LoyaltyTierDowngrade&quot;
LOYALTYTIERUPGRADE | &quot;LoyaltyTierUpgrade&quot;
COUPONCREATED | &quot;CouponCreated&quot;
COUPONUPDATED | &quot;CouponUpdated&quot;
COUPONDELETED | &quot;CouponDeleted&quot;



