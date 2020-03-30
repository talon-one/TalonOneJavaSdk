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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class NewCoupons {
  public static final String SERIALIZED_NAME_USAGE_LIMIT = "usageLimit";
  @SerializedName(SERIALIZED_NAME_USAGE_LIMIT)
  private Integer usageLimit;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_VALID_CHARACTERS = "validCharacters";
  @SerializedName(SERIALIZED_NAME_VALID_CHARACTERS)
  private List<String> validCharacters = new ArrayList<String>();

  public static final String SERIALIZED_NAME_COUPON_PATTERN = "couponPattern";
  @SerializedName(SERIALIZED_NAME_COUPON_PATTERN)
  private String couponPattern;

  public static final String SERIALIZED_NAME_NUMBER_OF_COUPONS = "numberOfCoupons";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_COUPONS)
  private Integer numberOfCoupons;

  public static final String SERIALIZED_NAME_UNIQUE_PREFIX = "uniquePrefix";
  @SerializedName(SERIALIZED_NAME_UNIQUE_PREFIX)
  private String uniquePrefix;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID = "recipientIntegrationId";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID)
  private String recipientIntegrationId;


  public NewCoupons usageLimit(Integer usageLimit) {
    
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


  public NewCoupons startDate(OffsetDateTime startDate) {
    
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


  public NewCoupons expiryDate(OffsetDateTime expiryDate) {
    
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


  public NewCoupons validCharacters(List<String> validCharacters) {
    
    this.validCharacters = validCharacters;
    return this;
  }

  public NewCoupons addValidCharactersItem(String validCharactersItem) {
    this.validCharacters.add(validCharactersItem);
    return this;
  }

   /**
   * Set of characters to be used when generating random part of code. Defaults to [A-Z, 0-9] (in terms of RegExp).
   * @return validCharacters
  **/
  @ApiModelProperty(required = true, value = "Set of characters to be used when generating random part of code. Defaults to [A-Z, 0-9] (in terms of RegExp).")

  public List<String> getValidCharacters() {
    return validCharacters;
  }


  public void setValidCharacters(List<String> validCharacters) {
    this.validCharacters = validCharacters;
  }


  public NewCoupons couponPattern(String couponPattern) {
    
    this.couponPattern = couponPattern;
    return this;
  }

   /**
   * The pattern that will be used to generate coupon codes. The character &#x60;#&#x60; acts as a placeholder and will be replaced by a random character from the &#x60;validCharacters&#x60; set. 
   * @return couponPattern
  **/
  @ApiModelProperty(required = true, value = "The pattern that will be used to generate coupon codes. The character `#` acts as a placeholder and will be replaced by a random character from the `validCharacters` set. ")

  public String getCouponPattern() {
    return couponPattern;
  }


  public void setCouponPattern(String couponPattern) {
    this.couponPattern = couponPattern;
  }


  public NewCoupons numberOfCoupons(Integer numberOfCoupons) {
    
    this.numberOfCoupons = numberOfCoupons;
    return this;
  }

   /**
   * The number of new coupon codes to generate for the campaign. Must be at least 1.
   * @return numberOfCoupons
  **/
  @ApiModelProperty(required = true, value = "The number of new coupon codes to generate for the campaign. Must be at least 1.")

  public Integer getNumberOfCoupons() {
    return numberOfCoupons;
  }


  public void setNumberOfCoupons(Integer numberOfCoupons) {
    this.numberOfCoupons = numberOfCoupons;
  }


  public NewCoupons uniquePrefix(String uniquePrefix) {
    
    this.uniquePrefix = uniquePrefix;
    return this;
  }

   /**
   * A unique prefix to prepend to all generated coupons.
   * @return uniquePrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique prefix to prepend to all generated coupons.")

  public String getUniquePrefix() {
    return uniquePrefix;
  }


  public void setUniquePrefix(String uniquePrefix) {
    this.uniquePrefix = uniquePrefix;
  }


  public NewCoupons attributes(Object attributes) {
    
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


  public NewCoupons recipientIntegrationId(String recipientIntegrationId) {
    
    this.recipientIntegrationId = recipientIntegrationId;
    return this;
  }

   /**
   * The integration ID for this coupon&#39;s beneficiary&#39;s profile
   * @return recipientIntegrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The integration ID for this coupon's beneficiary's profile")

  public String getRecipientIntegrationId() {
    return recipientIntegrationId;
  }


  public void setRecipientIntegrationId(String recipientIntegrationId) {
    this.recipientIntegrationId = recipientIntegrationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCoupons newCoupons = (NewCoupons) o;
    return Objects.equals(this.usageLimit, newCoupons.usageLimit) &&
        Objects.equals(this.startDate, newCoupons.startDate) &&
        Objects.equals(this.expiryDate, newCoupons.expiryDate) &&
        Objects.equals(this.validCharacters, newCoupons.validCharacters) &&
        Objects.equals(this.couponPattern, newCoupons.couponPattern) &&
        Objects.equals(this.numberOfCoupons, newCoupons.numberOfCoupons) &&
        Objects.equals(this.uniquePrefix, newCoupons.uniquePrefix) &&
        Objects.equals(this.attributes, newCoupons.attributes) &&
        Objects.equals(this.recipientIntegrationId, newCoupons.recipientIntegrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageLimit, startDate, expiryDate, validCharacters, couponPattern, numberOfCoupons, uniquePrefix, attributes, recipientIntegrationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCoupons {\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    validCharacters: ").append(toIndentedString(validCharacters)).append("\n");
    sb.append("    couponPattern: ").append(toIndentedString(couponPattern)).append("\n");
    sb.append("    numberOfCoupons: ").append(toIndentedString(numberOfCoupons)).append("\n");
    sb.append("    uniquePrefix: ").append(toIndentedString(uniquePrefix)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    recipientIntegrationId: ").append(toIndentedString(recipientIntegrationId)).append("\n");
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

