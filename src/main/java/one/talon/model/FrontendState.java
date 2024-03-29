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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * A campaign state described exactly as in the Campaign Manager.
 */
@JsonAdapter(FrontendState.Adapter.class)
public enum FrontendState {
  
  EXPIRED("expired"),
  
  SCHEDULED("scheduled"),
  
  RUNNING("running"),
  
  DRAFT("draft"),
  
  DISABLED("disabled");

  private String value;

  FrontendState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FrontendState fromValue(String value) {
    for (FrontendState b : FrontendState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FrontendState> {
    @Override
    public void write(final JsonWriter jsonWriter, final FrontendState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FrontendState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FrontendState.fromValue(value);
    }
  }
}

