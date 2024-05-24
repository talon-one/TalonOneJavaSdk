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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.WebhookLogEntry;

/**
 * InlineResponse20039
 */

public class InlineResponse20039 {
  public static final String SERIALIZED_NAME_TOTAL_RESULT_SIZE = "totalResultSize";
  @SerializedName(SERIALIZED_NAME_TOTAL_RESULT_SIZE)
  private Integer totalResultSize;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<WebhookLogEntry> data = new ArrayList<WebhookLogEntry>();


  public InlineResponse20039 totalResultSize(Integer totalResultSize) {
    
    this.totalResultSize = totalResultSize;
    return this;
  }

   /**
   * Get totalResultSize
   * @return totalResultSize
  **/
  @ApiModelProperty(example = "1", required = true, value = "")

  public Integer getTotalResultSize() {
    return totalResultSize;
  }


  public void setTotalResultSize(Integer totalResultSize) {
    this.totalResultSize = totalResultSize;
  }


  public InlineResponse20039 data(List<WebhookLogEntry> data) {
    
    this.data = data;
    return this;
  }

  public InlineResponse20039 addDataItem(WebhookLogEntry dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")

  public List<WebhookLogEntry> getData() {
    return data;
  }


  public void setData(List<WebhookLogEntry> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20039 inlineResponse20039 = (InlineResponse20039) o;
    return Objects.equals(this.totalResultSize, inlineResponse20039.totalResultSize) &&
        Objects.equals(this.data, inlineResponse20039.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalResultSize, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20039 {\n");
    sb.append("    totalResultSize: ").append(toIndentedString(totalResultSize)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

