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
import one.talon.model.ScimServiceProviderConfigResponseBulk;
import one.talon.model.ScimServiceProviderConfigResponseChangePassword;
import one.talon.model.ScimServiceProviderConfigResponseFilter;
import one.talon.model.ScimServiceProviderConfigResponsePatch;
import one.talon.model.ScimServiceProviderConfigResponseSort;

/**
 * Service provider configuration details.
 */
@ApiModel(description = "Service provider configuration details.")

public class ScimServiceProviderConfigResponse {
  public static final String SERIALIZED_NAME_BULK = "bulk";
  @SerializedName(SERIALIZED_NAME_BULK)
  private ScimServiceProviderConfigResponseBulk bulk;

  public static final String SERIALIZED_NAME_CHANGE_PASSWORD = "changePassword";
  @SerializedName(SERIALIZED_NAME_CHANGE_PASSWORD)
  private ScimServiceProviderConfigResponseChangePassword changePassword;

  public static final String SERIALIZED_NAME_DOCUMENTATION_URI = "documentationUri";
  @SerializedName(SERIALIZED_NAME_DOCUMENTATION_URI)
  private String documentationUri;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private ScimServiceProviderConfigResponseFilter filter;

  public static final String SERIALIZED_NAME_PATCH = "patch";
  @SerializedName(SERIALIZED_NAME_PATCH)
  private ScimServiceProviderConfigResponsePatch patch;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<String> schemas = null;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private ScimServiceProviderConfigResponseSort sort;


  public ScimServiceProviderConfigResponse bulk(ScimServiceProviderConfigResponseBulk bulk) {
    
    this.bulk = bulk;
    return this;
  }

   /**
   * Get bulk
   * @return bulk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScimServiceProviderConfigResponseBulk getBulk() {
    return bulk;
  }


  public void setBulk(ScimServiceProviderConfigResponseBulk bulk) {
    this.bulk = bulk;
  }


  public ScimServiceProviderConfigResponse changePassword(ScimServiceProviderConfigResponseChangePassword changePassword) {
    
    this.changePassword = changePassword;
    return this;
  }

   /**
   * Get changePassword
   * @return changePassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScimServiceProviderConfigResponseChangePassword getChangePassword() {
    return changePassword;
  }


  public void setChangePassword(ScimServiceProviderConfigResponseChangePassword changePassword) {
    this.changePassword = changePassword;
  }


  public ScimServiceProviderConfigResponse documentationUri(String documentationUri) {
    
    this.documentationUri = documentationUri;
    return this;
  }

   /**
   * The URI that points to the SCIM service provider&#39;s documentation, providing further details about the service&#39;s capabilities and usage.
   * @return documentationUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI that points to the SCIM service provider's documentation, providing further details about the service's capabilities and usage.")

  public String getDocumentationUri() {
    return documentationUri;
  }


  public void setDocumentationUri(String documentationUri) {
    this.documentationUri = documentationUri;
  }


  public ScimServiceProviderConfigResponse filter(ScimServiceProviderConfigResponseFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScimServiceProviderConfigResponseFilter getFilter() {
    return filter;
  }


  public void setFilter(ScimServiceProviderConfigResponseFilter filter) {
    this.filter = filter;
  }


  public ScimServiceProviderConfigResponse patch(ScimServiceProviderConfigResponsePatch patch) {
    
    this.patch = patch;
    return this;
  }

   /**
   * Get patch
   * @return patch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScimServiceProviderConfigResponsePatch getPatch() {
    return patch;
  }


  public void setPatch(ScimServiceProviderConfigResponsePatch patch) {
    this.patch = patch;
  }


  public ScimServiceProviderConfigResponse schemas(List<String> schemas) {
    
    this.schemas = schemas;
    return this;
  }

  public ScimServiceProviderConfigResponse addSchemasItem(String schemasItem) {
    if (this.schemas == null) {
      this.schemas = new ArrayList<String>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * A list of SCIM schemas that define the structure and data types supported by the service provider.
   * @return schemas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of SCIM schemas that define the structure and data types supported by the service provider.")

  public List<String> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }


  public ScimServiceProviderConfigResponse sort(ScimServiceProviderConfigResponseSort sort) {
    
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScimServiceProviderConfigResponseSort getSort() {
    return sort;
  }


  public void setSort(ScimServiceProviderConfigResponseSort sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimServiceProviderConfigResponse scimServiceProviderConfigResponse = (ScimServiceProviderConfigResponse) o;
    return Objects.equals(this.bulk, scimServiceProviderConfigResponse.bulk) &&
        Objects.equals(this.changePassword, scimServiceProviderConfigResponse.changePassword) &&
        Objects.equals(this.documentationUri, scimServiceProviderConfigResponse.documentationUri) &&
        Objects.equals(this.filter, scimServiceProviderConfigResponse.filter) &&
        Objects.equals(this.patch, scimServiceProviderConfigResponse.patch) &&
        Objects.equals(this.schemas, scimServiceProviderConfigResponse.schemas) &&
        Objects.equals(this.sort, scimServiceProviderConfigResponse.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulk, changePassword, documentationUri, filter, patch, schemas, sort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimServiceProviderConfigResponse {\n");
    sb.append("    bulk: ").append(toIndentedString(bulk)).append("\n");
    sb.append("    changePassword: ").append(toIndentedString(changePassword)).append("\n");
    sb.append("    documentationUri: ").append(toIndentedString(documentationUri)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

