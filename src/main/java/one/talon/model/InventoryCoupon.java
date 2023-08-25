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

public class InventoryCoupon {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

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

  public static final String SERIALIZED_NAME_USAGE_COUNTER = "usageCounter";
  @SerializedName(SERIALIZED_NAME_USAGE_COUNTER)
  private Integer usageCounter;

  public static final String SERIALIZED_NAME_DISCOUNT_COUNTER = "discountCounter";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_COUNTER)
  private BigDecimal discountCounter;

  public static final String SERIALIZED_NAME_DISCOUNT_REMAINDER = "discountRemainder";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_REMAINDER)
  private BigDecimal discountRemainder;

  public static final String SERIALIZED_NAME_RESERVATION_COUNTER = "reservationCounter";
  @SerializedName(SERIALIZED_NAME_RESERVATION_COUNTER)
  private BigDecimal reservationCounter;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_REFERRAL_ID = "referralId";
  @SerializedName(SERIALIZED_NAME_REFERRAL_ID)
  private Integer referralId;

  public static final String SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID = "recipientIntegrationId";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID)
  private String recipientIntegrationId;

  public static final String SERIALIZED_NAME_IMPORT_ID = "importId";
  @SerializedName(SERIALIZED_NAME_IMPORT_ID)
  private Integer importId;

  public static final String SERIALIZED_NAME_RESERVATION = "reservation";
  @SerializedName(SERIALIZED_NAME_RESERVATION)
  private Boolean reservation = true;

  public static final String SERIALIZED_NAME_BATCH_ID = "batchId";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId;

  public static final String SERIALIZED_NAME_IS_RESERVATION_MANDATORY = "isReservationMandatory";
  @SerializedName(SERIALIZED_NAME_IS_RESERVATION_MANDATORY)
  private Boolean isReservationMandatory = true;

  public static final String SERIALIZED_NAME_IMPLICITLY_RESERVED = "implicitlyReserved";
  @SerializedName(SERIALIZED_NAME_IMPLICITLY_RESERVED)
  private Boolean implicitlyReserved;

  public static final String SERIALIZED_NAME_PROFILE_REDEMPTION_COUNT = "profileRedemptionCount";
  @SerializedName(SERIALIZED_NAME_PROFILE_REDEMPTION_COUNT)
  private Integer profileRedemptionCount;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;


  public InventoryCoupon id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Internal ID of this entity.
   * @return id
  **/
  @ApiModelProperty(example = "6", required = true, value = "Internal ID of this entity.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public InventoryCoupon created(OffsetDateTime created) {
    
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


  public InventoryCoupon campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The ID of the campaign that owns this entity.
   * @return campaignId
  **/
  @ApiModelProperty(example = "211", required = true, value = "The ID of the campaign that owns this entity.")

  public Integer getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public InventoryCoupon value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The coupon code.
   * @return value
  **/
  @ApiModelProperty(example = "XMAS-20-2021", required = true, value = "The coupon code.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public InventoryCoupon usageLimit(Integer usageLimit) {
    
    this.usageLimit = usageLimit;
    return this;
  }

   /**
   * The number of times the coupon code can be redeemed. &#x60;0&#x60; means unlimited redemptions but any campaign usage limits will still apply. 
   * minimum: 0
   * maximum: 999999
   * @return usageLimit
  **/
  @ApiModelProperty(example = "100", required = true, value = "The number of times the coupon code can be redeemed. `0` means unlimited redemptions but any campaign usage limits will still apply. ")

  public Integer getUsageLimit() {
    return usageLimit;
  }


  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }


  public InventoryCoupon discountLimit(BigDecimal discountLimit) {
    
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


  public InventoryCoupon reservationLimit(Integer reservationLimit) {
    
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


  public InventoryCoupon startDate(OffsetDateTime startDate) {
    
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


  public InventoryCoupon expiryDate(OffsetDateTime expiryDate) {
    
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


  public InventoryCoupon limits(List<LimitConfig> limits) {
    
    this.limits = limits;
    return this;
  }

  public InventoryCoupon addLimitsItem(LimitConfig limitsItem) {
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


  public InventoryCoupon usageCounter(Integer usageCounter) {
    
    this.usageCounter = usageCounter;
    return this;
  }

   /**
   * The number of times the coupon has been successfully redeemed.
   * @return usageCounter
  **/
  @ApiModelProperty(example = "10", required = true, value = "The number of times the coupon has been successfully redeemed.")

  public Integer getUsageCounter() {
    return usageCounter;
  }


  public void setUsageCounter(Integer usageCounter) {
    this.usageCounter = usageCounter;
  }


  public InventoryCoupon discountCounter(BigDecimal discountCounter) {
    
    this.discountCounter = discountCounter;
    return this;
  }

   /**
   * The amount of discounts given on rules redeeming this coupon. Only usable if a coupon discount budget was set for this coupon.
   * @return discountCounter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.0", value = "The amount of discounts given on rules redeeming this coupon. Only usable if a coupon discount budget was set for this coupon.")

  public BigDecimal getDiscountCounter() {
    return discountCounter;
  }


  public void setDiscountCounter(BigDecimal discountCounter) {
    this.discountCounter = discountCounter;
  }


  public InventoryCoupon discountRemainder(BigDecimal discountRemainder) {
    
    this.discountRemainder = discountRemainder;
    return this;
  }

   /**
   * The remaining discount this coupon can give.
   * @return discountRemainder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.0", value = "The remaining discount this coupon can give.")

  public BigDecimal getDiscountRemainder() {
    return discountRemainder;
  }


  public void setDiscountRemainder(BigDecimal discountRemainder) {
    this.discountRemainder = discountRemainder;
  }


  public InventoryCoupon reservationCounter(BigDecimal reservationCounter) {
    
    this.reservationCounter = reservationCounter;
    return this;
  }

   /**
   * The number of times this coupon has been reserved.
   * @return reservationCounter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "The number of times this coupon has been reserved.")

  public BigDecimal getReservationCounter() {
    return reservationCounter;
  }


  public void setReservationCounter(BigDecimal reservationCounter) {
    this.reservationCounter = reservationCounter;
  }


  public InventoryCoupon attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Custom attributes associated with this coupon.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom attributes associated with this coupon.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public InventoryCoupon referralId(Integer referralId) {
    
    this.referralId = referralId;
    return this;
  }

   /**
   * The integration ID of the referring customer (if any) for whom this coupon was created as an effect.
   * @return referralId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "326632952", value = "The integration ID of the referring customer (if any) for whom this coupon was created as an effect.")

  public Integer getReferralId() {
    return referralId;
  }


  public void setReferralId(Integer referralId) {
    this.referralId = referralId;
  }


  public InventoryCoupon recipientIntegrationId(String recipientIntegrationId) {
    
    this.recipientIntegrationId = recipientIntegrationId;
    return this;
  }

   /**
   * The Integration ID of the customer that is allowed to redeem this coupon.
   * @return recipientIntegrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "URNGV8294NV", value = "The Integration ID of the customer that is allowed to redeem this coupon.")

  public String getRecipientIntegrationId() {
    return recipientIntegrationId;
  }


  public void setRecipientIntegrationId(String recipientIntegrationId) {
    this.recipientIntegrationId = recipientIntegrationId;
  }


  public InventoryCoupon importId(Integer importId) {
    
    this.importId = importId;
    return this;
  }

   /**
   * The ID of the Import which created this coupon.
   * @return importId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "The ID of the Import which created this coupon.")

  public Integer getImportId() {
    return importId;
  }


  public void setImportId(Integer importId) {
    this.importId = importId;
  }


  public InventoryCoupon reservation(Boolean reservation) {
    
    this.reservation = reservation;
    return this;
  }

   /**
   * Defines the type of reservation: - &#x60;true&#x60;: The reservation is a soft reservation. Any customer can use the coupon. This is done via the [Create coupon reservation](https://docs.talon.one/integration-api#operation/createCouponReservation) endpoint. - &#x60;false&#x60;: The reservation is a hard reservation. Only the associated customer (&#x60;recipientIntegrationId&#x60;) can use the coupon. This is done via the Campaign Manager when you create a coupon for a given &#x60;recipientIntegrationId&#x60;, the [Create coupons](https://docs.talon.one/management-api#operation/createCoupons) endpoint or [Create coupons for multiple recipients](https://docs.talon.one/management-api#operation/createCouponsForMultipleRecipients) endpoint. 
   * @return reservation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Defines the type of reservation: - `true`: The reservation is a soft reservation. Any customer can use the coupon. This is done via the [Create coupon reservation](https://docs.talon.one/integration-api#operation/createCouponReservation) endpoint. - `false`: The reservation is a hard reservation. Only the associated customer (`recipientIntegrationId`) can use the coupon. This is done via the Campaign Manager when you create a coupon for a given `recipientIntegrationId`, the [Create coupons](https://docs.talon.one/management-api#operation/createCoupons) endpoint or [Create coupons for multiple recipients](https://docs.talon.one/management-api#operation/createCouponsForMultipleRecipients) endpoint. ")

  public Boolean getReservation() {
    return reservation;
  }


  public void setReservation(Boolean reservation) {
    this.reservation = reservation;
  }


  public InventoryCoupon batchId(String batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * The id of the batch the coupon belongs to.
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "32535-43255", value = "The id of the batch the coupon belongs to.")

  public String getBatchId() {
    return batchId;
  }


  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  public InventoryCoupon isReservationMandatory(Boolean isReservationMandatory) {
    
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


  public InventoryCoupon implicitlyReserved(Boolean implicitlyReserved) {
    
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


  public InventoryCoupon profileRedemptionCount(Integer profileRedemptionCount) {
    
    this.profileRedemptionCount = profileRedemptionCount;
    return this;
  }

   /**
   * The number of times the coupon was redeemed by the profile.
   * @return profileRedemptionCount
  **/
  @ApiModelProperty(example = "5", required = true, value = "The number of times the coupon was redeemed by the profile.")

  public Integer getProfileRedemptionCount() {
    return profileRedemptionCount;
  }


  public void setProfileRedemptionCount(Integer profileRedemptionCount) {
    this.profileRedemptionCount = profileRedemptionCount;
  }


  public InventoryCoupon state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Can be:  - &#x60;active&#x60;: The coupon can be used. It is a reserved coupon that is neither pending, used nor expired, and has a non-exhausted limit counter. - &#x60;used&#x60;: The coupon has been redeemed and cannot be used again. It is not pending and has reached its redemption limit or was redeemed by the profile before expiration. - &#x60;expired&#x60;: The coupon was never redeemed and it is now expired. It is non-pending, non-active and non-used by the profile. - &#x60;pending&#x60;: The coupon will be usable in the future. - &#x60;disabled&#x60;: The coupon is part of a non-active campaign. 
   * @return state
  **/
  @ApiModelProperty(example = "active", required = true, value = "Can be:  - `active`: The coupon can be used. It is a reserved coupon that is neither pending, used nor expired, and has a non-exhausted limit counter. - `used`: The coupon has been redeemed and cannot be used again. It is not pending and has reached its redemption limit or was redeemed by the profile before expiration. - `expired`: The coupon was never redeemed and it is now expired. It is non-pending, non-active and non-used by the profile. - `pending`: The coupon will be usable in the future. - `disabled`: The coupon is part of a non-active campaign. ")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryCoupon inventoryCoupon = (InventoryCoupon) o;
    return Objects.equals(this.id, inventoryCoupon.id) &&
        Objects.equals(this.created, inventoryCoupon.created) &&
        Objects.equals(this.campaignId, inventoryCoupon.campaignId) &&
        Objects.equals(this.value, inventoryCoupon.value) &&
        Objects.equals(this.usageLimit, inventoryCoupon.usageLimit) &&
        Objects.equals(this.discountLimit, inventoryCoupon.discountLimit) &&
        Objects.equals(this.reservationLimit, inventoryCoupon.reservationLimit) &&
        Objects.equals(this.startDate, inventoryCoupon.startDate) &&
        Objects.equals(this.expiryDate, inventoryCoupon.expiryDate) &&
        Objects.equals(this.limits, inventoryCoupon.limits) &&
        Objects.equals(this.usageCounter, inventoryCoupon.usageCounter) &&
        Objects.equals(this.discountCounter, inventoryCoupon.discountCounter) &&
        Objects.equals(this.discountRemainder, inventoryCoupon.discountRemainder) &&
        Objects.equals(this.reservationCounter, inventoryCoupon.reservationCounter) &&
        Objects.equals(this.attributes, inventoryCoupon.attributes) &&
        Objects.equals(this.referralId, inventoryCoupon.referralId) &&
        Objects.equals(this.recipientIntegrationId, inventoryCoupon.recipientIntegrationId) &&
        Objects.equals(this.importId, inventoryCoupon.importId) &&
        Objects.equals(this.reservation, inventoryCoupon.reservation) &&
        Objects.equals(this.batchId, inventoryCoupon.batchId) &&
        Objects.equals(this.isReservationMandatory, inventoryCoupon.isReservationMandatory) &&
        Objects.equals(this.implicitlyReserved, inventoryCoupon.implicitlyReserved) &&
        Objects.equals(this.profileRedemptionCount, inventoryCoupon.profileRedemptionCount) &&
        Objects.equals(this.state, inventoryCoupon.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, campaignId, value, usageLimit, discountLimit, reservationLimit, startDate, expiryDate, limits, usageCounter, discountCounter, discountRemainder, reservationCounter, attributes, referralId, recipientIntegrationId, importId, reservation, batchId, isReservationMandatory, implicitlyReserved, profileRedemptionCount, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryCoupon {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    discountLimit: ").append(toIndentedString(discountLimit)).append("\n");
    sb.append("    reservationLimit: ").append(toIndentedString(reservationLimit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    usageCounter: ").append(toIndentedString(usageCounter)).append("\n");
    sb.append("    discountCounter: ").append(toIndentedString(discountCounter)).append("\n");
    sb.append("    discountRemainder: ").append(toIndentedString(discountRemainder)).append("\n");
    sb.append("    reservationCounter: ").append(toIndentedString(reservationCounter)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    referralId: ").append(toIndentedString(referralId)).append("\n");
    sb.append("    recipientIntegrationId: ").append(toIndentedString(recipientIntegrationId)).append("\n");
    sb.append("    importId: ").append(toIndentedString(importId)).append("\n");
    sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    isReservationMandatory: ").append(toIndentedString(isReservationMandatory)).append("\n");
    sb.append("    implicitlyReserved: ").append(toIndentedString(implicitlyReserved)).append("\n");
    sb.append("    profileRedemptionCount: ").append(toIndentedString(profileRedemptionCount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

