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
import java.math.BigDecimal;

/**
 * AnalyticsDataPointWithTrendAndUplift
 */

public class AnalyticsDataPointWithTrendAndUplift {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_UPLIFT = "uplift";
  @SerializedName(SERIALIZED_NAME_UPLIFT)
  private BigDecimal uplift;

  public static final String SERIALIZED_NAME_TREND = "trend";
  @SerializedName(SERIALIZED_NAME_TREND)
  private BigDecimal trend;


  public AnalyticsDataPointWithTrendAndUplift value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "12.0", required = true, value = "")

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public AnalyticsDataPointWithTrendAndUplift uplift(BigDecimal uplift) {
    
    this.uplift = uplift;
    return this;
  }

   /**
   * Get uplift
   * @return uplift
  **/
  @ApiModelProperty(example = "3.25", required = true, value = "")

  public BigDecimal getUplift() {
    return uplift;
  }


  public void setUplift(BigDecimal uplift) {
    this.uplift = uplift;
  }


  public AnalyticsDataPointWithTrendAndUplift trend(BigDecimal trend) {
    
    this.trend = trend;
    return this;
  }

   /**
   * Get trend
   * @return trend
  **/
  @ApiModelProperty(example = "3.25", required = true, value = "")

  public BigDecimal getTrend() {
    return trend;
  }


  public void setTrend(BigDecimal trend) {
    this.trend = trend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsDataPointWithTrendAndUplift analyticsDataPointWithTrendAndUplift = (AnalyticsDataPointWithTrendAndUplift) o;
    return Objects.equals(this.value, analyticsDataPointWithTrendAndUplift.value) &&
        Objects.equals(this.uplift, analyticsDataPointWithTrendAndUplift.uplift) &&
        Objects.equals(this.trend, analyticsDataPointWithTrendAndUplift.trend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, uplift, trend);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsDataPointWithTrendAndUplift {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    uplift: ").append(toIndentedString(uplift)).append("\n");
    sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
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

