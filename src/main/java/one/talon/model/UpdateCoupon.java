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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.LimitConfig;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class UpdateCoupon {
  public static final String SERIALIZED_NAME_USAGE_LIMIT = "usageLimit";
  @SerializedName(SERIALIZED_NAME_USAGE_LIMIT)
  private Integer usageLimit;

  public static final String SERIALIZED_NAME_DISCOUNT_LIMIT = "discountLimit";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_LIMIT)
  private BigDecimal discountLimit;

  public static final String SERIALIZED_NAME_RESERVATION_LIMIT = "reservationLimit";
  @SerializedName(SERIALIZED_NAME_RESERVATION_LIMIT)
  private Integer reservationLimit;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private List<LimitConfig> limits = null;

  public static final String SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID = "recipientIntegrationId";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID)
  private String recipientIntegrationId;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_IS_RESERVATION_MANDATORY = "isReservationMandatory";
  @SerializedName(SERIALIZED_NAME_IS_RESERVATION_MANDATORY)
  private Boolean isReservationMandatory = false;

  public static final String SERIALIZED_NAME_IMPLICITLY_RESERVED = "implicitlyReserved";
  @SerializedName(SERIALIZED_NAME_IMPLICITLY_RESERVED)
  private Boolean implicitlyReserved;


  public UpdateCoupon usageLimit(Integer usageLimit) {
    
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

  public Integer getUsageLimit() {
    return usageLimit;
  }


  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }


  public UpdateCoupon discountLimit(BigDecimal discountLimit) {
    
    this.discountLimit = discountLimit;
    return this;
  }

   /**
   * The total discount value that the code can give. Typically used to represent a gift card value. 
   * minimum: 0
   * maximum: 999999
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


  public UpdateCoupon reservationLimit(Integer reservationLimit) {
    
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

  public Integer getReservationLimit() {
    return reservationLimit;
  }


  public void setReservationLimit(Integer reservationLimit) {
    this.reservationLimit = reservationLimit;
  }


  public UpdateCoupon startDate(OffsetDateTime startDate) {
    
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


  public UpdateCoupon expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Expiration date of the coupon. Coupon never expires if this is omitted, zero, or negative.
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-08-24T14:15:22Z", value = "Expiration date of the coupon. Coupon never expires if this is omitted, zero, or negative.")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public UpdateCoupon limits(List<LimitConfig> limits) {
    
    this.limits = limits;
    return this;
  }

  public UpdateCoupon addLimitsItem(LimitConfig limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<LimitConfig>();
    }
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * Limits configuration for a coupon. These limits will override the limits set from the campaign.  **Note:** Only usable when creating a single coupon which is not tied to a specific recipient. Only per-profile limits are allowed to be configured. 
   * @return limits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limits configuration for a coupon. These limits will override the limits set from the campaign.  **Note:** Only usable when creating a single coupon which is not tied to a specific recipient. Only per-profile limits are allowed to be configured. ")

  public List<LimitConfig> getLimits() {
    return limits;
  }


  public void setLimits(List<LimitConfig> limits) {
    this.limits = limits;
  }


  public UpdateCoupon recipientIntegrationId(String recipientIntegrationId) {
    
    this.recipientIntegrationId = recipientIntegrationId;
    return this;
  }

   /**
   * The integration ID for this coupon&#39;s beneficiary&#39;s profile.
   * @return recipientIntegrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "URNGV8294NV", value = "The integration ID for this coupon's beneficiary's profile.")

  public String getRecipientIntegrationId() {
    return recipientIntegrationId;
  }


  public void setRecipientIntegrationId(String recipientIntegrationId) {
    this.recipientIntegrationId = recipientIntegrationId;
  }


  public UpdateCoupon attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this item.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary properties associated with this item.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public UpdateCoupon isReservationMandatory(Boolean isReservationMandatory) {
    
    this.isReservationMandatory = isReservationMandatory;
    return this;
  }

   /**
   * Whether the reservation effect actually created a new reservation.
   * @return isReservationMandatory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the reservation effect actually created a new reservation.")

  public Boolean getIsReservationMandatory() {
    return isReservationMandatory;
  }


  public void setIsReservationMandatory(Boolean isReservationMandatory) {
    this.isReservationMandatory = isReservationMandatory;
  }


  public UpdateCoupon implicitlyReserved(Boolean implicitlyReserved) {
    
    this.implicitlyReserved = implicitlyReserved;
    return this;
  }

   /**
   * An indication of whether the coupon is implicitly reserved for all customers.
   * @return implicitlyReserved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "An indication of whether the coupon is implicitly reserved for all customers.")

  public Boolean getImplicitlyReserved() {
    return implicitlyReserved;
  }


  public void setImplicitlyReserved(Boolean implicitlyReserved) {
    this.implicitlyReserved = implicitlyReserved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCoupon updateCoupon = (UpdateCoupon) o;
    return Objects.equals(this.usageLimit, updateCoupon.usageLimit) &&
        Objects.equals(this.discountLimit, updateCoupon.discountLimit) &&
        Objects.equals(this.reservationLimit, updateCoupon.reservationLimit) &&
        Objects.equals(this.startDate, updateCoupon.startDate) &&
        Objects.equals(this.expiryDate, updateCoupon.expiryDate) &&
        Objects.equals(this.limits, updateCoupon.limits) &&
        Objects.equals(this.recipientIntegrationId, updateCoupon.recipientIntegrationId) &&
        Objects.equals(this.attributes, updateCoupon.attributes) &&
        Objects.equals(this.isReservationMandatory, updateCoupon.isReservationMandatory) &&
        Objects.equals(this.implicitlyReserved, updateCoupon.implicitlyReserved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageLimit, discountLimit, reservationLimit, startDate, expiryDate, limits, recipientIntegrationId, attributes, isReservationMandatory, implicitlyReserved);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCoupon {\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    discountLimit: ").append(toIndentedString(discountLimit)).append("\n");
    sb.append("    reservationLimit: ").append(toIndentedString(reservationLimit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    recipientIntegrationId: ").append(toIndentedString(recipientIntegrationId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    isReservationMandatory: ").append(toIndentedString(isReservationMandatory)).append("\n");
    sb.append("    implicitlyReserved: ").append(toIndentedString(implicitlyReserved)).append("\n");
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

