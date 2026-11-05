

# GeoJSONPolygon

A shape formed by one or more boundaries, following the GeoJSON format. The first boundary defines the outer edge of the shape; any additional boundaries define holes within the shape.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The geometry type discriminator. | 
**coordinates** | [**List&lt;List&lt;List&lt;BigDecimal&gt;&gt;&gt;**](List.md) | The boundaries that make up the shape. Each boundary is a closed loop of longitude and latitude points, where the first and last point are the same. | 



## Enum: TypeEnum

Name | Value
---- | -----
POLYGON | &quot;Polygon&quot;



