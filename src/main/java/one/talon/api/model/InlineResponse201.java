/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package one.talon.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 *
 */
@ApiModel(description = "")

public class InlineResponse201 {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("created")
    private OffsetDateTime created = null;

    @SerializedName("campaignId")
    private Integer campaignId = null;

    @SerializedName("advocateProfileIntegrationId")
    private String advocateProfileIntegrationId = null;

    @SerializedName("friendProfileIntegrationId")
    private String friendProfileIntegrationId = null;

    @SerializedName("startDate")
    private OffsetDateTime startDate = null;

    @SerializedName("expiryDate")
    private OffsetDateTime expiryDate = null;

    @SerializedName("code")
    private String code = null;

    @SerializedName("usageCounter")
    private Integer usageCounter = null;

    @SerializedName("usageLimit")
    private Integer usageLimit = null;

    public InlineResponse201 id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Unique ID for this entity.
     * @return id
     **/
    @ApiModelProperty(required = true, value = "Unique ID for this entity.")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public InlineResponse201 created(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    /**
     * The exact moment this entity was created.
     * @return created
     **/
    @ApiModelProperty(required = true, value = "The exact moment this entity was created.")
    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public InlineResponse201 campaignId(Integer campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * ID of the campaign from which the referral received the referral code.
     * @return campaignId
     **/
    @ApiModelProperty(required = true, value = "ID of the campaign from which the referral received the referral code.")
    public Integer getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
    }

    public InlineResponse201 advocateProfileIntegrationId(String advocateProfileIntegrationId) {
        this.advocateProfileIntegrationId = advocateProfileIntegrationId;
        return this;
    }

    /**
     * The Integration Id of the Advocate&#39;s Profile
     * @return advocateProfileIntegrationId
     **/
    @ApiModelProperty(required = true, value = "The Integration Id of the Advocate's Profile")
    public String getAdvocateProfileIntegrationId() {
        return advocateProfileIntegrationId;
    }

    public void setAdvocateProfileIntegrationId(String advocateProfileIntegrationId) {
        this.advocateProfileIntegrationId = advocateProfileIntegrationId;
    }

    public InlineResponse201 friendProfileIntegrationId(String friendProfileIntegrationId) {
        this.friendProfileIntegrationId = friendProfileIntegrationId;
        return this;
    }

    /**
     * An optional Integration ID of the Friend&#39;s Profile
     * @return friendProfileIntegrationId
     **/
    @ApiModelProperty(value = "An optional Integration ID of the Friend's Profile")
    public String getFriendProfileIntegrationId() {
        return friendProfileIntegrationId;
    }

    public void setFriendProfileIntegrationId(String friendProfileIntegrationId) {
        this.friendProfileIntegrationId = friendProfileIntegrationId;
    }

    public InlineResponse201 startDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Timestamp at which point the referral code becomes valid.
     * @return startDate
     **/
    @ApiModelProperty(value = "Timestamp at which point the referral code becomes valid.")
    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    public InlineResponse201 expiryDate(OffsetDateTime expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Expiry date of the referral code. Referral never expires if this is omitted, zero, or negative.
     * @return expiryDate
     **/
    @ApiModelProperty(value = "Expiry date of the referral code. Referral never expires if this is omitted, zero, or negative.")
    public OffsetDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(OffsetDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public InlineResponse201 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * The actual referral code.
     * @return code
     **/
    @ApiModelProperty(required = true, value = "The actual referral code.")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public InlineResponse201 usageCounter(Integer usageCounter) {
        this.usageCounter = usageCounter;
        return this;
    }

    /**
     * The number of times this referral code has been successfully used.
     * @return usageCounter
     **/
    @ApiModelProperty(required = true, value = "The number of times this referral code has been successfully used.")
    public Integer getUsageCounter() {
        return usageCounter;
    }

    public void setUsageCounter(Integer usageCounter) {
        this.usageCounter = usageCounter;
    }

    public InlineResponse201 usageLimit(Integer usageLimit) {
        this.usageLimit = usageLimit;
        return this;
    }

    /**
     * The number of times a referral code can be used. This can be set to 0 for no limit, but any campaign usage limits will still apply.
     * minimum: 0
     * @return usageLimit
     **/
    @ApiModelProperty(required = true, value = "The number of times a referral code can be used. This can be set to 0 for no limit, but any campaign usage limits will still apply. ")
    public Integer getUsageLimit() {
        return usageLimit;
    }

    public void setUsageLimit(Integer usageLimit) {
        this.usageLimit = usageLimit;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineResponse201 inlineResponse201 = (InlineResponse201) o;
        return Objects.equals(this.id, inlineResponse201.id) &&
                Objects.equals(this.created, inlineResponse201.created) &&
                Objects.equals(this.campaignId, inlineResponse201.campaignId) &&
                Objects.equals(this.advocateProfileIntegrationId, inlineResponse201.advocateProfileIntegrationId) &&
                Objects.equals(this.friendProfileIntegrationId, inlineResponse201.friendProfileIntegrationId) &&
                Objects.equals(this.startDate, inlineResponse201.startDate) &&
                Objects.equals(this.expiryDate, inlineResponse201.expiryDate) &&
                Objects.equals(this.code, inlineResponse201.code) &&
                Objects.equals(this.usageCounter, inlineResponse201.usageCounter) &&
                Objects.equals(this.usageLimit, inlineResponse201.usageLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, created, campaignId, advocateProfileIntegrationId, friendProfileIntegrationId, startDate, expiryDate, code, usageCounter, usageLimit);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse201 {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    advocateProfileIntegrationId: ").append(toIndentedString(advocateProfileIntegrationId)).append("\n");
        sb.append("    friendProfileIntegrationId: ").append(toIndentedString(friendProfileIntegrationId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    usageCounter: ").append(toIndentedString(usageCounter)).append("\n");
        sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
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

