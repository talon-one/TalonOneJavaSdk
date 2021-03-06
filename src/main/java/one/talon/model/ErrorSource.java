/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
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
 * The source of the current error, exactly one of &#x60;pointer&#x60;, &#x60;parameter&#x60; or &#x60;line&#x60; will be defined. 
 */
@ApiModel(description = "The source of the current error, exactly one of `pointer`, `parameter` or `line` will be defined. ")

public class ErrorSource {
  public static final String SERIALIZED_NAME_POINTER = "pointer";
  @SerializedName(SERIALIZED_NAME_POINTER)
  private String pointer;

  public static final String SERIALIZED_NAME_PARAMETER = "parameter";
  @SerializedName(SERIALIZED_NAME_PARAMETER)
  private String parameter;

  public static final String SERIALIZED_NAME_LINE = "line";
  @SerializedName(SERIALIZED_NAME_LINE)
  private String line;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;


  public ErrorSource pointer(String pointer) {
    
    this.pointer = pointer;
    return this;
  }

   /**
   * Pointer to the path in the payload that caused this error.
   * @return pointer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pointer to the path in the payload that caused this error.")

  public String getPointer() {
    return pointer;
  }


  public void setPointer(String pointer) {
    this.pointer = pointer;
  }


  public ErrorSource parameter(String parameter) {
    
    this.parameter = parameter;
    return this;
  }

   /**
   * Query parameter that caused this error.
   * @return parameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Query parameter that caused this error.")

  public String getParameter() {
    return parameter;
  }


  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  public ErrorSource line(String line) {
    
    this.line = line;
    return this;
  }

   /**
   * Line number in uploaded multipart file that caused this error. &#39;N/A&#39; if unknown.
   * @return line
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Line number in uploaded multipart file that caused this error. 'N/A' if unknown.")

  public String getLine() {
    return line;
  }


  public void setLine(String line) {
    this.line = line;
  }


  public ErrorSource resource(String resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Pointer to the resource that caused this error
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pointer to the resource that caused this error")

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorSource errorSource = (ErrorSource) o;
    return Objects.equals(this.pointer, errorSource.pointer) &&
        Objects.equals(this.parameter, errorSource.parameter) &&
        Objects.equals(this.line, errorSource.line) &&
        Objects.equals(this.resource, errorSource.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointer, parameter, line, resource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorSource {\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

