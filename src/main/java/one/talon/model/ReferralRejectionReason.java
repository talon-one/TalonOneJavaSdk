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

/**
 * Holds a reference to the campaign, the referral and the reason for which that referral was rejected. Should only be present when there is a &#39;rejectReferral&#39; effect.
 */
@ApiModel(description = "Holds a reference to the campaign, the referral and the reason for which that referral was rejected. Should only be present when there is a 'rejectReferral' effect.")

public class ReferralRejectionReason {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_REFERRAL_ID = "referralId";
  @SerializedName(SERIALIZED_NAME_REFERRAL_ID)
  private Integer referralId;

  /**
   * Gets or Sets reason
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    REFERRALNOTFOUND("ReferralNotFound"),
    
    REFERRALRECIPIENTIDSAMEASADVOCATE("ReferralRecipientIdSameAsAdvocate"),
    
    REFERRALPARTOFNOTRUNNINGCAMPAIGN("ReferralPartOfNotRunningCampaign"),
    
    REFERRALVALIDCONDITIONMISSING("ReferralValidConditionMissing"),
    
    REFERRALLIMITREACHED("ReferralLimitReached"),
    
    CAMPAIGNLIMITREACHED("CampaignLimitReached"),
    
    PROFILELIMITREACHED("ProfileLimitReached"),
    
    REFERRALRECIPIENTDOESNOTMATCH("ReferralRecipientDoesNotMatch"),
    
    REFERRALEXPIRED("ReferralExpired"),
    
    REFERRALSTARTDATEINFUTURE("ReferralStartDateInFuture"),
    
    REFERRALREJECTEDBYCONDITION("ReferralRejectedByCondition"),
    
    EFFECTCOULDNOTBEAPPLIED("EffectCouldNotBeApplied");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private ReasonEnum reason;


  public ReferralRejectionReason campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public ReferralRejectionReason referralId(Integer referralId) {
    
    this.referralId = referralId;
    return this;
  }

   /**
   * Get referralId
   * @return referralId
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getReferralId() {
    return referralId;
  }


  public void setReferralId(Integer referralId) {
    this.referralId = referralId;
  }


  public ReferralRejectionReason reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "")

  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferralRejectionReason referralRejectionReason = (ReferralRejectionReason) o;
    return Objects.equals(this.campaignId, referralRejectionReason.campaignId) &&
        Objects.equals(this.referralId, referralRejectionReason.referralId) &&
        Objects.equals(this.reason, referralRejectionReason.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, referralId, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferralRejectionReason {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    referralId: ").append(toIndentedString(referralId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

