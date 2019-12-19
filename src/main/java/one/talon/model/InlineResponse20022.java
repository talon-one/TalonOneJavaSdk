/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * OpenAPI spec version: 1.0.0
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
import one.talon.model.WebhookActivationLogEntry;

/**
 * InlineResponse20022
 */

public class InlineResponse20022 {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<WebhookActivationLogEntry> data = new ArrayList<WebhookActivationLogEntry>();

  public static final String SERIALIZED_NAME_TOTAL_RESULT_SIZE = "totalResultSize";
  @SerializedName(SERIALIZED_NAME_TOTAL_RESULT_SIZE)
  private Integer totalResultSize;

  public InlineResponse20022 data(List<WebhookActivationLogEntry> data) {
    this.data = data;
    return this;
  }

  public InlineResponse20022 addDataItem(WebhookActivationLogEntry dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  public List<WebhookActivationLogEntry> getData() {
    return data;
  }

  public void setData(List<WebhookActivationLogEntry> data) {
    this.data = data;
  }

  public InlineResponse20022 totalResultSize(Integer totalResultSize) {
    this.totalResultSize = totalResultSize;
    return this;
  }

   /**
   * Get totalResultSize
   * @return totalResultSize
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTotalResultSize() {
    return totalResultSize;
  }

  public void setTotalResultSize(Integer totalResultSize) {
    this.totalResultSize = totalResultSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20022 inlineResponse20022 = (InlineResponse20022) o;
    return Objects.equals(this.data, inlineResponse20022.data) &&
        Objects.equals(this.totalResultSize, inlineResponse20022.totalResultSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, totalResultSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20022 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    totalResultSize: ").append(toIndentedString(totalResultSize)).append("\n");
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

