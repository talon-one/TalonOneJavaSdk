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

/**
 * NotificationTest
 */

public class NotificationTest {
  public static final String SERIALIZED_NAME_HTTP_RESPONSE = "httpResponse";
  @SerializedName(SERIALIZED_NAME_HTTP_RESPONSE)
  private String httpResponse;

  public static final String SERIALIZED_NAME_HTTP_STATUS = "httpStatus";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS)
  private Integer httpStatus;


  public NotificationTest httpResponse(String httpResponse) {
    
    this.httpResponse = httpResponse;
    return this;
  }

   /**
   * The returned http response.
   * @return httpResponse
  **/
  @ApiModelProperty(example = "HTTP/1.1 200 OK Content-Type: application/json Content-Length: 256  {   \"message\": \"Hello, world!\",   \"status\": \"success\" } ", required = true, value = "The returned http response.")

  public String getHttpResponse() {
    return httpResponse;
  }


  public void setHttpResponse(String httpResponse) {
    this.httpResponse = httpResponse;
  }


  public NotificationTest httpStatus(Integer httpStatus) {
    
    this.httpStatus = httpStatus;
    return this;
  }

   /**
   * The returned http status code.
   * @return httpStatus
  **/
  @ApiModelProperty(example = "200", required = true, value = "The returned http status code.")

  public Integer getHttpStatus() {
    return httpStatus;
  }


  public void setHttpStatus(Integer httpStatus) {
    this.httpStatus = httpStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationTest notificationTest = (NotificationTest) o;
    return Objects.equals(this.httpResponse, notificationTest.httpResponse) &&
        Objects.equals(this.httpStatus, notificationTest.httpStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpResponse, httpStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTest {\n");
    sb.append("    httpResponse: ").append(toIndentedString(httpResponse)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
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

