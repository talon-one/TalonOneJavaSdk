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
 * Giveaway
 */

public class Giveaway {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_POOL_ID = "poolId";
  @SerializedName(SERIALIZED_NAME_POOL_ID)
  private Long poolId;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_USED = "used";
  @SerializedName(SERIALIZED_NAME_USED)
  private Boolean used;

  public static final String SERIALIZED_NAME_IMPORT_ID = "importId";
  @SerializedName(SERIALIZED_NAME_IMPORT_ID)
  private Long importId;

  public static final String SERIALIZED_NAME_PROFILE_INTEGRATION_ID = "profileIntegrationId";
  @SerializedName(SERIALIZED_NAME_PROFILE_INTEGRATION_ID)
  private String profileIntegrationId;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private Long profileId;


  public Giveaway id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The internal ID of this entity.
   * @return id
  **/
  @ApiModelProperty(example = "6", required = true, value = "The internal ID of this entity.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Giveaway created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The time this entity was created.
   * @return created
  **/
  @ApiModelProperty(example = "2020-06-10T09:05:27.993483Z", required = true, value = "The time this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Giveaway code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code value of this giveaway.
   * @return code
  **/
  @ApiModelProperty(example = "GIVEAWAY1", required = true, value = "The code value of this giveaway.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public Giveaway poolId(Long poolId) {
    
    this.poolId = poolId;
    return this;
  }

   /**
   * The ID of the pool to return giveaway codes from.
   * @return poolId
  **/
  @ApiModelProperty(example = "1", required = true, value = "The ID of the pool to return giveaway codes from.")

  public Long getPoolId() {
    return poolId;
  }


  public void setPoolId(Long poolId) {
    this.poolId = poolId;
  }


  public Giveaway startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Timestamp at which point the giveaway becomes valid.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp at which point the giveaway becomes valid.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public Giveaway endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Timestamp at which point the giveaway becomes invalid.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp at which point the giveaway becomes invalid.")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public Giveaway attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this giveaway.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary properties associated with this giveaway.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public Giveaway used(Boolean used) {
    
    this.used = used;
    return this;
  }

   /**
   * Indicates whether this giveaway code was given before.
   * @return used
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether this giveaway code was given before.")

  public Boolean getUsed() {
    return used;
  }


  public void setUsed(Boolean used) {
    this.used = used;
  }


  public Giveaway importId(Long importId) {
    
    this.importId = importId;
    return this;
  }

   /**
   * The ID of the Import which created this giveaway.
   * @return importId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "The ID of the Import which created this giveaway.")

  public Long getImportId() {
    return importId;
  }


  public void setImportId(Long importId) {
    this.importId = importId;
  }


  public Giveaway profileIntegrationId(String profileIntegrationId) {
    
    this.profileIntegrationId = profileIntegrationId;
    return this;
  }

   /**
   * The third-party integration ID of the customer profile that was awarded the giveaway, if the giveaway was awarded.
   * @return profileIntegrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "R195412", value = "The third-party integration ID of the customer profile that was awarded the giveaway, if the giveaway was awarded.")

  public String getProfileIntegrationId() {
    return profileIntegrationId;
  }


  public void setProfileIntegrationId(String profileIntegrationId) {
    this.profileIntegrationId = profileIntegrationId;
  }


  public Giveaway profileId(Long profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * The internal ID of the customer profile that was awarded the giveaway, if the giveaway was awarded and an internal ID exists.
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The internal ID of the customer profile that was awarded the giveaway, if the giveaway was awarded and an internal ID exists.")

  public Long getProfileId() {
    return profileId;
  }


  public void setProfileId(Long profileId) {
    this.profileId = profileId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Giveaway giveaway = (Giveaway) o;
    return Objects.equals(this.id, giveaway.id) &&
        Objects.equals(this.created, giveaway.created) &&
        Objects.equals(this.code, giveaway.code) &&
        Objects.equals(this.poolId, giveaway.poolId) &&
        Objects.equals(this.startDate, giveaway.startDate) &&
        Objects.equals(this.endDate, giveaway.endDate) &&
        Objects.equals(this.attributes, giveaway.attributes) &&
        Objects.equals(this.used, giveaway.used) &&
        Objects.equals(this.importId, giveaway.importId) &&
        Objects.equals(this.profileIntegrationId, giveaway.profileIntegrationId) &&
        Objects.equals(this.profileId, giveaway.profileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, code, poolId, startDate, endDate, attributes, used, importId, profileIntegrationId, profileId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Giveaway {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    importId: ").append(toIndentedString(importId)).append("\n");
    sb.append("    profileIntegrationId: ").append(toIndentedString(profileIntegrationId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
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

