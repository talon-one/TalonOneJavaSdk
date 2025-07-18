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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * PriceDetail
 */

public class PriceDetail {
  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Float price;

  public static final String SERIALIZED_NAME_ADJUSTMENT_REFERENCE_ID = "adjustmentReferenceId";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_REFERENCE_ID)
  private UUID adjustmentReferenceId;

  public static final String SERIALIZED_NAME_ADJUSTMENT_EFFECTIVE_FROM = "adjustmentEffectiveFrom";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_EFFECTIVE_FROM)
  private OffsetDateTime adjustmentEffectiveFrom;

  public static final String SERIALIZED_NAME_ADJUSTMENT_EFFECTIVE_UNTIL = "adjustmentEffectiveUntil";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_EFFECTIVE_UNTIL)
  private OffsetDateTime adjustmentEffectiveUntil;


  public PriceDetail price(Float price) {
    
    this.price = price;
    return this;
  }

   /**
   * The value of this price type.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "90.0", value = "The value of this price type.")

  public Float getPrice() {
    return price;
  }


  public void setPrice(Float price) {
    this.price = price;
  }


  public PriceDetail adjustmentReferenceId(UUID adjustmentReferenceId) {
    
    this.adjustmentReferenceId = adjustmentReferenceId;
    return this;
  }

   /**
   * The reference identifier of the selected price adjustment for this SKU.
   * @return adjustmentReferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "68851723-e6fa-488f-ace9-112581e6c19b", value = "The reference identifier of the selected price adjustment for this SKU.")

  public UUID getAdjustmentReferenceId() {
    return adjustmentReferenceId;
  }


  public void setAdjustmentReferenceId(UUID adjustmentReferenceId) {
    this.adjustmentReferenceId = adjustmentReferenceId;
  }


  public PriceDetail adjustmentEffectiveFrom(OffsetDateTime adjustmentEffectiveFrom) {
    
    this.adjustmentEffectiveFrom = adjustmentEffectiveFrom;
    return this;
  }

   /**
   * The date and time from which the price adjustment is effective.
   * @return adjustmentEffectiveFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2025-05-25T00:00Z", value = "The date and time from which the price adjustment is effective.")

  public OffsetDateTime getAdjustmentEffectiveFrom() {
    return adjustmentEffectiveFrom;
  }


  public void setAdjustmentEffectiveFrom(OffsetDateTime adjustmentEffectiveFrom) {
    this.adjustmentEffectiveFrom = adjustmentEffectiveFrom;
  }


  public PriceDetail adjustmentEffectiveUntil(OffsetDateTime adjustmentEffectiveUntil) {
    
    this.adjustmentEffectiveUntil = adjustmentEffectiveUntil;
    return this;
  }

   /**
   * The date and time until which the price adjustment is effective.
   * @return adjustmentEffectiveUntil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2025-05-30T00:00Z", value = "The date and time until which the price adjustment is effective.")

  public OffsetDateTime getAdjustmentEffectiveUntil() {
    return adjustmentEffectiveUntil;
  }


  public void setAdjustmentEffectiveUntil(OffsetDateTime adjustmentEffectiveUntil) {
    this.adjustmentEffectiveUntil = adjustmentEffectiveUntil;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceDetail priceDetail = (PriceDetail) o;
    return Objects.equals(this.price, priceDetail.price) &&
        Objects.equals(this.adjustmentReferenceId, priceDetail.adjustmentReferenceId) &&
        Objects.equals(this.adjustmentEffectiveFrom, priceDetail.adjustmentEffectiveFrom) &&
        Objects.equals(this.adjustmentEffectiveUntil, priceDetail.adjustmentEffectiveUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, adjustmentReferenceId, adjustmentEffectiveFrom, adjustmentEffectiveUntil);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceDetail {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    adjustmentReferenceId: ").append(toIndentedString(adjustmentReferenceId)).append("\n");
    sb.append("    adjustmentEffectiveFrom: ").append(toIndentedString(adjustmentEffectiveFrom)).append("\n");
    sb.append("    adjustmentEffectiveUntil: ").append(toIndentedString(adjustmentEffectiveUntil)).append("\n");
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

