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
 * NewApplicationCIF
 */

public class NewApplicationCIF {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACTIVE_EXPRESSION_ID = "activeExpressionId";
  @SerializedName(SERIALIZED_NAME_ACTIVE_EXPRESSION_ID)
  private Long activeExpressionId;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private Long modifiedBy;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Long createdBy;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;


  public NewApplicationCIF name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the Application cart item filter used in API requests.
   * @return name
  **/
  @ApiModelProperty(example = "Filter items by product", required = true, value = "The name of the Application cart item filter used in API requests.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewApplicationCIF description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A short description of the Application cart item filter.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This filter allows filtering by shoes", value = "A short description of the Application cart item filter.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NewApplicationCIF activeExpressionId(Long activeExpressionId) {
    
    this.activeExpressionId = activeExpressionId;
    return this;
  }

   /**
   * The ID of the expression that the Application cart item filter uses.
   * @return activeExpressionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The ID of the expression that the Application cart item filter uses.")

  public Long getActiveExpressionId() {
    return activeExpressionId;
  }


  public void setActiveExpressionId(Long activeExpressionId) {
    this.activeExpressionId = activeExpressionId;
  }


  public NewApplicationCIF modifiedBy(Long modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * The ID of the user who last updated the Application cart item filter.
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "334", value = "The ID of the user who last updated the Application cart item filter.")

  public Long getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(Long modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public NewApplicationCIF createdBy(Long createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The ID of the user who created the Application cart item filter.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "216", value = "The ID of the user who created the Application cart item filter.")

  public Long getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }


  public NewApplicationCIF modified(OffsetDateTime modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * Timestamp of the most recent update to the Application cart item filter.
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of the most recent update to the Application cart item filter.")

  public OffsetDateTime getModified() {
    return modified;
  }


  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewApplicationCIF newApplicationCIF = (NewApplicationCIF) o;
    return Objects.equals(this.name, newApplicationCIF.name) &&
        Objects.equals(this.description, newApplicationCIF.description) &&
        Objects.equals(this.activeExpressionId, newApplicationCIF.activeExpressionId) &&
        Objects.equals(this.modifiedBy, newApplicationCIF.modifiedBy) &&
        Objects.equals(this.createdBy, newApplicationCIF.createdBy) &&
        Objects.equals(this.modified, newApplicationCIF.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, activeExpressionId, modifiedBy, createdBy, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewApplicationCIF {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activeExpressionId: ").append(toIndentedString(activeExpressionId)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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

