

# ExperimentSegmentInsight

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimension** | [**DimensionEnum**](#DimensionEnum) | The segmentation dimension used to group customers or purchases for analysis. | 
**bucket** | [**BucketEnum**](#BucketEnum) | The specific group within the segmentation dimension. | 
**confidence** | **Double** | The raw (unadjusted) confidence score expressed as a percentage. Only segments with a confidence score greater than or equal to 95% are returned.  | 
**winnerVariantId** | **Long** | The ID of the variant that performed better in this segment. | 
**variants** | [**List&lt;ExperimentSegmentInsightVariant&gt;**](ExperimentSegmentInsightVariant.md) | Per-variant metric values for this segment. | 



## Enum: DimensionEnum

Name | Value
---- | -----
CART_VALUE | &quot;cart_value&quot;
ITEM_COUNT | &quot;item_count&quot;
CUSTOMER_TYPE | &quot;customer_type&quot;



## Enum: BucketEnum

Name | Value
---- | -----
LOW | &quot;low&quot;
MEDIUM | &quot;medium&quot;
HIGH | &quot;high&quot;
NEW | &quot;new&quot;
RETURNING | &quot;returning&quot;
LOYAL | &quot;loyal&quot;



