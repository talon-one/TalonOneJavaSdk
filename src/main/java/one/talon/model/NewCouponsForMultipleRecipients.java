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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class NewCouponsForMultipleRecipients {
  public static final String SERIALIZED_NAME_USAGE_LIMIT = "usageLimit";
  @SerializedName(SERIALIZED_NAME_USAGE_LIMIT)
  private Integer usageLimit;

  public static final String SERIALIZED_NAME_DISCOUNT_LIMIT = "discountLimit";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_LIMIT)
  private BigDecimal discountLimit;

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


  public NewCouponsForMultipleRecipients usageLimit(Integer usageLimit) {
    
    this.usageLimit = usageLimit;
    return this;
  }

   /**
   * The number of times a coupon code can be redeemed. This can be set to 0 for no limit, but any campaign usage limits will still apply. 
   * minimum: 0
   * maximum: 999999
   * @return usageLimit
  **/
  @ApiModelProperty(required = true, value = "The number of times a coupon code can be redeemed. This can be set to 0 for no limit, but any campaign usage limits will still apply. ")

  public Integer getUsageLimit() {
    return usageLimit;
  }


  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }


  public NewCouponsForMultipleRecipients discountLimit(BigDecimal discountLimit) {
    
    this.discountLimit = discountLimit;
    return this;
  }

   /**
   * The amount of discounts that can be given with this coupon code. 
   * minimum: 0
   * maximum: 999999
   * @return discountLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of discounts that can be given with this coupon code. ")

  public BigDecimal getDiscountLimit() {
    return discountLimit;
  }


  public void setDiscountLimit(BigDecimal discountLimit) {
    this.discountLimit = discountLimit;
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
  @ApiModelProperty(value = "Timestamp at which point the coupon becomes valid.")

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
   * Expiry date of the coupon. Coupon never expires if this is omitted, zero, or negative.
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiry date of the coupon. Coupon never expires if this is omitted, zero, or negative.")

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


  public NewCouponsForMultipleRecipients recipientsIntegrationIds(List<String> recipientsIntegrationIds) {
    
    this.recipientsIntegrationIds = recipientsIntegrationIds;
    return this;
  }

  public NewCouponsForMultipleRecipients addRecipientsIntegrationIdsItem(String recipientsIntegrationIdsItem) {
    this.recipientsIntegrationIds.add(recipientsIntegrationIdsItem);
    return this;
  }

   /**
   * The integration IDs for recipients
   * @return recipientsIntegrationIds
  **/
  @ApiModelProperty(required = true, value = "The integration IDs for recipients")

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
   * Set of characters to be used when generating random part of code. Defaults to [A-Z, 0-9] (in terms of RegExp).
   * @return validCharacters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set of characters to be used when generating random part of code. Defaults to [A-Z, 0-9] (in terms of RegExp).")

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
   * The pattern that will be used to generate coupon codes. The character &#x60;#&#x60; acts as a placeholder and will be replaced by a random character from the &#x60;validCharacters&#x60; set. 
   * @return couponPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pattern that will be used to generate coupon codes. The character `#` acts as a placeholder and will be replaced by a random character from the `validCharacters` set. ")

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
        Objects.equals(this.startDate, newCouponsForMultipleRecipients.startDate) &&
        Objects.equals(this.expiryDate, newCouponsForMultipleRecipients.expiryDate) &&
        Objects.equals(this.attributes, newCouponsForMultipleRecipients.attributes) &&
        Objects.equals(this.recipientsIntegrationIds, newCouponsForMultipleRecipients.recipientsIntegrationIds) &&
        Objects.equals(this.validCharacters, newCouponsForMultipleRecipients.validCharacters) &&
        Objects.equals(this.couponPattern, newCouponsForMultipleRecipients.couponPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageLimit, discountLimit, startDate, expiryDate, attributes, recipientsIntegrationIds, validCharacters, couponPattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCouponsForMultipleRecipients {\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    discountLimit: ").append(toIndentedString(discountLimit)).append("\n");
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

