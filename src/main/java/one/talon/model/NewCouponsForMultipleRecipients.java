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
import org.threeten.bp.OffsetDateTime;

/**
 * NewCouponsForMultipleRecipients
 */

public class NewCouponsForMultipleRecipients {
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

  public static final String SERIALIZED_NAME_RECIPIENTS_INTEGRATION_IDS = "recipientsIntegrationIds";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS_INTEGRATION_IDS)
  private List<String> recipientsIntegrationIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_VALID_CHARACTERS = "validCharacters";
  @SerializedName(SERIALIZED_NAME_VALID_CHARACTERS)
  private List<String> validCharacters = null;

  public static final String SERIALIZED_NAME_COUPON_PATTERN = "couponPattern";
  @SerializedName(SERIALIZED_NAME_COUPON_PATTERN)
  private String couponPattern;


  public NewCouponsForMultipleRecipients usageLimit(Long usageLimit) {
    
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

  public Long getUsageLimit() {
    return usageLimit;
  }


  public void setUsageLimit(Long usageLimit) {
    this.usageLimit = usageLimit;
  }


  public NewCouponsForMultipleRecipients discountLimit(BigDecimal discountLimit) {
    
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


  public NewCouponsForMultipleRecipients reservationLimit(Long reservationLimit) {
    
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


  public NewCouponsForMultipleRecipients startDate(OffsetDateTime startDate) {
    
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


  public NewCouponsForMultipleRecipients expiryDate(OffsetDateTime expiryDate) {
    
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


  public NewCouponsForMultipleRecipients attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this item.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"venueId\":12}", value = "Arbitrary properties associated with this item.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public NewCouponsForMultipleRecipients recipientsIntegrationIds(List<String> recipientsIntegrationIds) {
    
    this.recipientsIntegrationIds = recipientsIntegrationIds;
    return this;
  }

  public NewCouponsForMultipleRecipients addRecipientsIntegrationIdsItem(String recipientsIntegrationIdsItem) {
    this.recipientsIntegrationIds.add(recipientsIntegrationIdsItem);
    return this;
  }

   /**
   * The integration IDs for recipients.
   * @return recipientsIntegrationIds
  **/
  @ApiModelProperty(example = "[URNGV8294NV, BZGGC2454PA]", required = true, value = "The integration IDs for recipients.")

  public List<String> getRecipientsIntegrationIds() {
    return recipientsIntegrationIds;
  }


  public void setRecipientsIntegrationIds(List<String> recipientsIntegrationIds) {
    this.recipientsIntegrationIds = recipientsIntegrationIds;
  }


  public NewCouponsForMultipleRecipients validCharacters(List<String> validCharacters) {
    
    this.validCharacters = validCharacters;
    return this;
  }

  public NewCouponsForMultipleRecipients addValidCharactersItem(String validCharactersItem) {
    if (this.validCharacters == null) {
      this.validCharacters = new ArrayList<String>();
    }
    this.validCharacters.add(validCharactersItem);
    return this;
  }

   /**
   * List of characters used to generate the random parts of a code. By default, the list of characters is equivalent to the &#x60;[A-Z, 0-9]&#x60; regular expression. 
   * @return validCharacters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]", value = "List of characters used to generate the random parts of a code. By default, the list of characters is equivalent to the `[A-Z, 0-9]` regular expression. ")

  public List<String> getValidCharacters() {
    return validCharacters;
  }


  public void setValidCharacters(List<String> validCharacters) {
    this.validCharacters = validCharacters;
  }


  public NewCouponsForMultipleRecipients couponPattern(String couponPattern) {
    
    this.couponPattern = couponPattern;
    return this;
  }

   /**
   * The pattern used to generate coupon codes. The character &#x60;#&#x60; is a placeholder and is replaced by a random character from the &#x60;validCharacters&#x60; set. 
   * @return couponPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUMMER-#####", value = "The pattern used to generate coupon codes. The character `#` is a placeholder and is replaced by a random character from the `validCharacters` set. ")

  public String getCouponPattern() {
    return couponPattern;
  }


  public void setCouponPattern(String couponPattern) {
    this.couponPattern = couponPattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCouponsForMultipleRecipients newCouponsForMultipleRecipients = (NewCouponsForMultipleRecipients) o;
    return Objects.equals(this.usageLimit, newCouponsForMultipleRecipients.usageLimit) &&
        Objects.equals(this.discountLimit, newCouponsForMultipleRecipients.discountLimit) &&
        Objects.equals(this.reservationLimit, newCouponsForMultipleRecipients.reservationLimit) &&
        Objects.equals(this.startDate, newCouponsForMultipleRecipients.startDate) &&
        Objects.equals(this.expiryDate, newCouponsForMultipleRecipients.expiryDate) &&
        Objects.equals(this.attributes, newCouponsForMultipleRecipients.attributes) &&
        Objects.equals(this.recipientsIntegrationIds, newCouponsForMultipleRecipients.recipientsIntegrationIds) &&
        Objects.equals(this.validCharacters, newCouponsForMultipleRecipients.validCharacters) &&
        Objects.equals(this.couponPattern, newCouponsForMultipleRecipients.couponPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageLimit, discountLimit, reservationLimit, startDate, expiryDate, attributes, recipientsIntegrationIds, validCharacters, couponPattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCouponsForMultipleRecipients {\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    discountLimit: ").append(toIndentedString(discountLimit)).append("\n");
    sb.append("    reservationLimit: ").append(toIndentedString(reservationLimit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    recipientsIntegrationIds: ").append(toIndentedString(recipientsIntegrationIds)).append("\n");
    sb.append("    validCharacters: ").append(toIndentedString(validCharacters)).append("\n");
    sb.append("    couponPattern: ").append(toIndentedString(couponPattern)).append("\n");
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

