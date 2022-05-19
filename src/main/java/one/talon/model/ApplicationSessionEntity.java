/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSession](https://docs.talon.one/integration-api/#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
 *
 * The version of the OpenAPI document: 1.0.0
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
 * ApplicationSessionEntity
 */

public class ApplicationSessionEntity {
  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private Integer sessionId;


  public ApplicationSessionEntity sessionId(Integer sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The globally unique Talon.One ID of the session where this entity was created.
   * @return sessionId
  **/
  @ApiModelProperty(required = true, value = "The globally unique Talon.One ID of the session where this entity was created.")

  public Integer getSessionId() {
    return sessionId;
  }


  public void setSessionId(Integer sessionId) {
    this.sessionId = sessionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSessionEntity applicationSessionEntity = (ApplicationSessionEntity) o;
    return Objects.equals(this.sessionId, applicationSessionEntity.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSessionEntity {\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

