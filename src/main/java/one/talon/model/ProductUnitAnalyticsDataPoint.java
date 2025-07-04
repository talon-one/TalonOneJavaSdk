/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you access the Campaign Manager at `https://yourbaseurl.talon.one/`, the URL for the [updateCustomerSessionV2](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint is `https://yourbaseurl.talon.one/v2/customer_sessions/{Id}` 
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package one.talon.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import one.talon.model.AnalyticsDataPointWithTrend;
import org.threeten.bp.OffsetDateTime;

/**
 * ProductUnitAnalyticsDataPoint
 */

public class ProductUnitAnalyticsDataPoint {
  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_UNITS_SOLD = "unitsSold";
  @SerializedName(SERIALIZED_NAME_UNITS_SOLD)
  private AnalyticsDataPointWithTrend unitsSold;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;


  public ProductUnitAnalyticsDataPoint startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The start of the aggregation time frame in UTC.
   * @return startTime
  **/
  @ApiModelProperty(example = "2024-02-01T00:00Z", required = true, value = "The start of the aggregation time frame in UTC.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public ProductUnitAnalyticsDataPoint endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * The end of the aggregation time frame in UTC.
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "The end of the aggregation time frame in UTC.")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public ProductUnitAnalyticsDataPoint unitsSold(AnalyticsDataPointWithTrend unitsSold) {
    
    this.unitsSold = unitsSold;
    return this;
  }

   /**
   * Get unitsSold
   * @return unitsSold
  **/
  @ApiModelProperty(required = true, value = "")

  public AnalyticsDataPointWithTrend getUnitsSold() {
    return unitsSold;
  }


  public void setUnitsSold(AnalyticsDataPointWithTrend unitsSold) {
    this.unitsSold = unitsSold;
  }


  public ProductUnitAnalyticsDataPoint productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * The ID of the product.
   * @return productId
  **/
  @ApiModelProperty(example = "1", required = true, value = "The ID of the product.")

  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public ProductUnitAnalyticsDataPoint productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * The name of the product.
   * @return productName
  **/
  @ApiModelProperty(example = "MyProduct", required = true, value = "The name of the product.")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductUnitAnalyticsDataPoint productUnitAnalyticsDataPoint = (ProductUnitAnalyticsDataPoint) o;
    return Objects.equals(this.startTime, productUnitAnalyticsDataPoint.startTime) &&
        Objects.equals(this.endTime, productUnitAnalyticsDataPoint.endTime) &&
        Objects.equals(this.unitsSold, productUnitAnalyticsDataPoint.unitsSold) &&
        Objects.equals(this.productId, productUnitAnalyticsDataPoint.productId) &&
        Objects.equals(this.productName, productUnitAnalyticsDataPoint.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, unitsSold, productId, productName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductUnitAnalyticsDataPoint {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    unitsSold: ").append(toIndentedString(unitsSold)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

