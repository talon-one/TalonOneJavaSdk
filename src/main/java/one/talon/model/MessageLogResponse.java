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
import org.threeten.bp.OffsetDateTime;

/**
 * Details of the response.
 */
@ApiModel(description = "Details of the response.")

public class MessageLogResponse {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private byte[] response;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status;


  public MessageLogResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp when the response was received.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-07-20T22:00:50Z", value = "Timestamp when the response was received.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public MessageLogResponse response(byte[] response) {
    
    this.response = response;
    return this;
  }

   /**
   * Raw response data.
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UmVzcG9uc2UgY29udGVudA==", value = "Raw response data.")

  public byte[] getResponse() {
    return response;
  }


  public void setResponse(byte[] response) {
    this.response = response;
  }


  public MessageLogResponse status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * HTTP status code of the response.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "HTTP status code of the response.")

  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageLogResponse messageLogResponse = (MessageLogResponse) o;
    return Objects.equals(this.createdAt, messageLogResponse.createdAt) &&
        Arrays.equals(this.response, messageLogResponse.response) &&
        Objects.equals(this.status, messageLogResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, Arrays.hashCode(response), status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageLogResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

