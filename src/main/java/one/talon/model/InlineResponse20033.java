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
import one.talon.model.ApplicationReferee;

/**
 * InlineResponse20033
 */

public class InlineResponse20033 {
  public static final String SERIALIZED_NAME_HAS_MORE = "hasMore";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  private Boolean hasMore;

  public static final String SERIALIZED_NAME_TOTAL_RESULT_SIZE = "totalResultSize";
  @SerializedName(SERIALIZED_NAME_TOTAL_RESULT_SIZE)
  private Integer totalResultSize;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ApplicationReferee> data = new ArrayList<ApplicationReferee>();


  public InlineResponse20033 hasMore(Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasMore() {
    return hasMore;
  }


  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public InlineResponse20033 totalResultSize(Integer totalResultSize) {
    
    this.totalResultSize = totalResultSize;
    return this;
  }

   /**
   * Get totalResultSize
   * @return totalResultSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getTotalResultSize() {
    return totalResultSize;
  }


  public void setTotalResultSize(Integer totalResultSize) {
    this.totalResultSize = totalResultSize;
  }


  public InlineResponse20033 data(List<ApplicationReferee> data) {
    
    this.data = data;
    return this;
  }

  public InlineResponse20033 addDataItem(ApplicationReferee dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ApplicationReferee> getData() {
    return data;
  }


  public void setData(List<ApplicationReferee> data) {
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
    InlineResponse20033 inlineResponse20033 = (InlineResponse20033) o;
    return Objects.equals(this.hasMore, inlineResponse20033.hasMore) &&
        Objects.equals(this.totalResultSize, inlineResponse20033.totalResultSize) &&
        Objects.equals(this.data, inlineResponse20033.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, totalResultSize, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20033 {\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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

