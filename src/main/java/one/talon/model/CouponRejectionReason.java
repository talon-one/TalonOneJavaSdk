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
 * Holds a reference to the campaign, the coupon and the reason for which that coupon was rejected. Should only be present when there is a &#39;rejectCoupon&#39; effect.
 */
@ApiModel(description = "Holds a reference to the campaign, the coupon and the reason for which that coupon was rejected. Should only be present when there is a 'rejectCoupon' effect.")

public class CouponRejectionReason {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_COUPON_ID = "couponId";
  @SerializedName(SERIALIZED_NAME_COUPON_ID)
  private Integer couponId;

  /**
   * Gets or Sets reason
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    COUPONNOTFOUND("CouponNotFound"),
    
    COUPONPARTOFNOTRUNNINGCAMPAIGN("CouponPartOfNotRunningCampaign"),
    
    COUPONLIMITREACHED("CouponLimitReached"),
    
    CAMPAIGNLIMITREACHED("CampaignLimitReached"),
    
    PROFILELIMITREACHED("ProfileLimitReached"),
    
    COUPONRECIPIENTDOESNOTMATCH("CouponRecipientDoesNotMatch"),
    
    COUPONEXPIRED("CouponExpired"),
    
    COUPONSTARTDATEINFUTURE("CouponStartDateInFuture"),
    
    COUPONREJECTEDBYCONDITION("CouponRejectedByCondition"),
    
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


  public CouponRejectionReason campaignId(Integer campaignId) {
    
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


  public CouponRejectionReason couponId(Integer couponId) {
    
    this.couponId = couponId;
    return this;
  }

   /**
   * Get couponId
   * @return couponId
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getCouponId() {
    return couponId;
  }


  public void setCouponId(Integer couponId) {
    this.couponId = couponId;
  }


  public CouponRejectionReason reason(ReasonEnum reason) {
    
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
    CouponRejectionReason couponRejectionReason = (CouponRejectionReason) o;
    return Objects.equals(this.campaignId, couponRejectionReason.campaignId) &&
        Objects.equals(this.couponId, couponRejectionReason.couponId) &&
        Objects.equals(this.reason, couponRejectionReason.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, couponId, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponRejectionReason {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
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

