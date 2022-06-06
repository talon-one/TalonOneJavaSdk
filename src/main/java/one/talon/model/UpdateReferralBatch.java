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
import org.threeten.bp.OffsetDateTime;
import one.talon.custom.JsonNullable;
import one.talon.custom.NullableAdapterFactory;

/**
 * UpdateReferralBatch
 */
@JsonAdapter(NullableAdapterFactory.class)
public class UpdateReferralBatch {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  /* allow serializing null values for Object field */
  @JsonNullable
  private Object attributes;

  public static final String SERIALIZED_NAME_BATCH_I_D = "batchID";
  @SerializedName(SERIALIZED_NAME_BATCH_I_D)
  private String batchID;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_USAGE_LIMIT = "usageLimit";
  @SerializedName(SERIALIZED_NAME_USAGE_LIMIT)
  private Integer usageLimit;


  public UpdateReferralBatch attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this item
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary properties associated with this item")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public UpdateReferralBatch batchID(String batchID) {
    
    this.batchID = batchID;
    return this;
  }

   /**
   * The id of the batch the referral belongs to.
   * @return batchID
  **/
  @ApiModelProperty(example = "32535-43255", required = true, value = "The id of the batch the referral belongs to.")

  public String getBatchID() {
    return batchID;
  }


  public void setBatchID(String batchID) {
    this.batchID = batchID;
  }


  public UpdateReferralBatch startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Timestamp at which point the referral code becomes valid.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-10T23:00Z", value = "Timestamp at which point the referral code becomes valid.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public UpdateReferralBatch expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Expiry date of the referral code. Referral never expires if this is omitted, zero, or negative.
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-11-10T23:00Z", value = "Expiry date of the referral code. Referral never expires if this is omitted, zero, or negative.")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public UpdateReferralBatch usageLimit(Integer usageLimit) {
    
    this.usageLimit = usageLimit;
    return this;
  }

   /**
   * The number of times a referral code can be used. This can be set to 0 for no limit, but any campaign usage limits will still apply. 
   * minimum: 0
   * maximum: 999999
   * @return usageLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The number of times a referral code can be used. This can be set to 0 for no limit, but any campaign usage limits will still apply. ")

  public Integer getUsageLimit() {
    return usageLimit;
  }


  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateReferralBatch updateReferralBatch = (UpdateReferralBatch) o;
    return Objects.equals(this.attributes, updateReferralBatch.attributes) &&
        Objects.equals(this.batchID, updateReferralBatch.batchID) &&
        Objects.equals(this.startDate, updateReferralBatch.startDate) &&
        Objects.equals(this.expiryDate, updateReferralBatch.expiryDate) &&
        Objects.equals(this.usageLimit, updateReferralBatch.usageLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, batchID, startDate, expiryDate, usageLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateReferralBatch {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    batchID: ").append(toIndentedString(batchID)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
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

