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
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * UpdateCouponBatch
 */

public class UpdateCouponBatch {
  public static final String SERIALIZED_NAME_USAGE_LIMIT = "usageLimit";
  @SerializedName(SERIALIZED_NAME_USAGE_LIMIT)
  private Long usageLimit;

  public static final String SERIALIZED_NAME_DISCOUNT_LIMIT = "discountLimit";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_LIMIT)
  private BigDecimal discountLimit;

  public static final String SERIALIZED_NAME_RESERVATION_LIMIT = "reservationLimit";
  @SerializedName(SERIALIZED_NAME_RESERVATION_LIMIT)
  private Long reservationLimit;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_BATCH_I_D = "batchID";
  @SerializedName(SERIALIZED_NAME_BATCH_I_D)
  private String batchID;


  public UpdateCouponBatch usageLimit(Long usageLimit) {
    
    this.usageLimit = usageLimit;
    return this;
  }

   /**
   * The number of times the coupon code can be redeemed. &#x60;0&#x60; means unlimited redemptions but any campaign usage limits will still apply. 
   * minimum: 0
   * maximum: 999999
   * @return usageLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The number of times the coupon code can be redeemed. `0` means unlimited redemptions but any campaign usage limits will still apply. ")

  public Long getUsageLimit() {
    return usageLimit;
  }


  public void setUsageLimit(Long usageLimit) {
    this.usageLimit = usageLimit;
  }


  public UpdateCouponBatch discountLimit(BigDecimal discountLimit) {
    
    this.discountLimit = discountLimit;
    return this;
  }

   /**
   * The total discount value that the code can give. Typically used to represent a gift card value. 
   * minimum: 0
   * maximum: 1E+15
   * @return discountLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30.0", value = "The total discount value that the code can give. Typically used to represent a gift card value. ")

  public BigDecimal getDiscountLimit() {
    return discountLimit;
  }


  public void setDiscountLimit(BigDecimal discountLimit) {
    this.discountLimit = discountLimit;
  }


  public UpdateCouponBatch reservationLimit(Long reservationLimit) {
    
    this.reservationLimit = reservationLimit;
    return this;
  }

   /**
   * The number of reservations that can be made with this coupon code. 
   * minimum: 0
   * maximum: 999999
   * @return reservationLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45", value = "The number of reservations that can be made with this coupon code. ")

  public Long getReservationLimit() {
    return reservationLimit;
  }


  public void setReservationLimit(Long reservationLimit) {
    this.reservationLimit = reservationLimit;
  }


  public UpdateCouponBatch startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Timestamp at which point the coupon becomes valid.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-24T14:15:22Z", value = "Timestamp at which point the coupon becomes valid.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public UpdateCouponBatch expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Expiration date of the coupon. Coupon never expires if this is omitted.
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-08-24T14:15:22Z", value = "Expiration date of the coupon. Coupon never expires if this is omitted.")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public UpdateCouponBatch attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Optional property to set the value of custom coupon attributes. They are defined in the Campaign Manager, see [Managing attributes](https://docs.talon.one/docs/product/account/dev-tools/managing-attributes).  Coupon attributes can also be set to _mandatory_ in your Application [settings](https://docs.talon.one/docs/product/applications/using-attributes#making-attributes-mandatory). If your Application uses mandatory attributes, you must use this property to set their value. 
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional property to set the value of custom coupon attributes. They are defined in the Campaign Manager, see [Managing attributes](https://docs.talon.one/docs/product/account/dev-tools/managing-attributes).  Coupon attributes can also be set to _mandatory_ in your Application [settings](https://docs.talon.one/docs/product/applications/using-attributes#making-attributes-mandatory). If your Application uses mandatory attributes, you must use this property to set their value. ")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public UpdateCouponBatch batchID(String batchID) {
    
    this.batchID = batchID;
    return this;
  }

   /**
   * The ID of the batch the coupon(s) belong to.
   * @return batchID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the batch the coupon(s) belong to.")

  public String getBatchID() {
    return batchID;
  }


  public void setBatchID(String batchID) {
    this.batchID = batchID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCouponBatch updateCouponBatch = (UpdateCouponBatch) o;
    return Objects.equals(this.usageLimit, updateCouponBatch.usageLimit) &&
        Objects.equals(this.discountLimit, updateCouponBatch.discountLimit) &&
        Objects.equals(this.reservationLimit, updateCouponBatch.reservationLimit) &&
        Objects.equals(this.startDate, updateCouponBatch.startDate) &&
        Objects.equals(this.expiryDate, updateCouponBatch.expiryDate) &&
        Objects.equals(this.attributes, updateCouponBatch.attributes) &&
        Objects.equals(this.batchID, updateCouponBatch.batchID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageLimit, discountLimit, reservationLimit, startDate, expiryDate, attributes, batchID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCouponBatch {\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    discountLimit: ").append(toIndentedString(discountLimit)).append("\n");
    sb.append("    reservationLimit: ").append(toIndentedString(reservationLimit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    batchID: ").append(toIndentedString(batchID)).append("\n");
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

