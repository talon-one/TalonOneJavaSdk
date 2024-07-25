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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class NewReferralsForMultipleAdvocates {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_USAGE_LIMIT = "usageLimit";
  @SerializedName(SERIALIZED_NAME_USAGE_LIMIT)
  private Integer usageLimit;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_ADVOCATE_PROFILE_INTEGRATION_IDS = "advocateProfileIntegrationIds";
  @SerializedName(SERIALIZED_NAME_ADVOCATE_PROFILE_INTEGRATION_IDS)
  private List<String> advocateProfileIntegrationIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_VALID_CHARACTERS = "validCharacters";
  @SerializedName(SERIALIZED_NAME_VALID_CHARACTERS)
  private List<String> validCharacters = null;

  public static final String SERIALIZED_NAME_REFERRAL_PATTERN = "referralPattern";
  @SerializedName(SERIALIZED_NAME_REFERRAL_PATTERN)
  private String referralPattern;


  public NewReferralsForMultipleAdvocates startDate(OffsetDateTime startDate) {
    
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


  public NewReferralsForMultipleAdvocates expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Expiration date of the referral code. Referral never expires if this is omitted, zero, or negative.
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-11-10T23:00Z", value = "Expiration date of the referral code. Referral never expires if this is omitted, zero, or negative.")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public NewReferralsForMultipleAdvocates usageLimit(Integer usageLimit) {
    
    this.usageLimit = usageLimit;
    return this;
  }

   /**
   * The number of times a referral code can be used. &#x60;0&#x60; means no limit but any campaign usage limits will still apply. 
   * minimum: 0
   * maximum: 999999
   * @return usageLimit
  **/
  @ApiModelProperty(example = "1", required = true, value = "The number of times a referral code can be used. `0` means no limit but any campaign usage limits will still apply. ")

  public Integer getUsageLimit() {
    return usageLimit;
  }


  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }


  public NewReferralsForMultipleAdvocates campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The ID of the campaign from which the referral received the referral code.
   * @return campaignId
  **/
  @ApiModelProperty(example = "45", required = true, value = "The ID of the campaign from which the referral received the referral code.")

  public Integer getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public NewReferralsForMultipleAdvocates advocateProfileIntegrationIds(List<String> advocateProfileIntegrationIds) {
    
    this.advocateProfileIntegrationIds = advocateProfileIntegrationIds;
    return this;
  }

  public NewReferralsForMultipleAdvocates addAdvocateProfileIntegrationIdsItem(String advocateProfileIntegrationIdsItem) {
    this.advocateProfileIntegrationIds.add(advocateProfileIntegrationIdsItem);
    return this;
  }

   /**
   * An array containing all the respective advocate profiles.
   * @return advocateProfileIntegrationIds
  **/
  @ApiModelProperty(example = "[URNGV8294NV, DRPVV9476AF]", required = true, value = "An array containing all the respective advocate profiles.")

  public List<String> getAdvocateProfileIntegrationIds() {
    return advocateProfileIntegrationIds;
  }


  public void setAdvocateProfileIntegrationIds(List<String> advocateProfileIntegrationIds) {
    this.advocateProfileIntegrationIds = advocateProfileIntegrationIds;
  }


  public NewReferralsForMultipleAdvocates attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this referral code.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"channel\":\"web\"}", value = "Arbitrary properties associated with this referral code.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public NewReferralsForMultipleAdvocates validCharacters(List<String> validCharacters) {
    
    this.validCharacters = validCharacters;
    return this;
  }

  public NewReferralsForMultipleAdvocates addValidCharactersItem(String validCharactersItem) {
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


  public NewReferralsForMultipleAdvocates referralPattern(String referralPattern) {
    
    this.referralPattern = referralPattern;
    return this;
  }

   /**
   * The pattern used to generate referrals. The character &#x60;#&#x60; is a placeholder and is replaced by a random character from the &#x60;validCharacters&#x60; set. 
   * @return referralPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "REF-###-###", value = "The pattern used to generate referrals. The character `#` is a placeholder and is replaced by a random character from the `validCharacters` set. ")

  public String getReferralPattern() {
    return referralPattern;
  }


  public void setReferralPattern(String referralPattern) {
    this.referralPattern = referralPattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewReferralsForMultipleAdvocates newReferralsForMultipleAdvocates = (NewReferralsForMultipleAdvocates) o;
    return Objects.equals(this.startDate, newReferralsForMultipleAdvocates.startDate) &&
        Objects.equals(this.expiryDate, newReferralsForMultipleAdvocates.expiryDate) &&
        Objects.equals(this.usageLimit, newReferralsForMultipleAdvocates.usageLimit) &&
        Objects.equals(this.campaignId, newReferralsForMultipleAdvocates.campaignId) &&
        Objects.equals(this.advocateProfileIntegrationIds, newReferralsForMultipleAdvocates.advocateProfileIntegrationIds) &&
        Objects.equals(this.attributes, newReferralsForMultipleAdvocates.attributes) &&
        Objects.equals(this.validCharacters, newReferralsForMultipleAdvocates.validCharacters) &&
        Objects.equals(this.referralPattern, newReferralsForMultipleAdvocates.referralPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, expiryDate, usageLimit, campaignId, advocateProfileIntegrationIds, attributes, validCharacters, referralPattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewReferralsForMultipleAdvocates {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    advocateProfileIntegrationIds: ").append(toIndentedString(advocateProfileIntegrationIds)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    validCharacters: ").append(toIndentedString(validCharacters)).append("\n");
    sb.append("    referralPattern: ").append(toIndentedString(referralPattern)).append("\n");
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

