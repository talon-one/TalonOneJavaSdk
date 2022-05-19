/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSession](https://docs.talon.one/integration-api/#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
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
import one.talon.model.CodeGeneratorSettings;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class CouponCreationJob {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

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

  public static final String SERIALIZED_NAME_NUMBER_OF_COUPONS = "numberOfCoupons";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_COUPONS)
  private Integer numberOfCoupons;

  public static final String SERIALIZED_NAME_COUPON_SETTINGS = "couponSettings";
  @SerializedName(SERIALIZED_NAME_COUPON_SETTINGS)
  private CodeGeneratorSettings couponSettings;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_BATCH_ID = "batchId";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATED_AMOUNT = "createdAmount";
  @SerializedName(SERIALIZED_NAME_CREATED_AMOUNT)
  private Integer createdAmount;

  public static final String SERIALIZED_NAME_FAIL_COUNT = "failCount";
  @SerializedName(SERIALIZED_NAME_FAIL_COUNT)
  private Integer failCount;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<String> errors = new ArrayList<String>();

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Integer createdBy;

  public static final String SERIALIZED_NAME_COMMUNICATED = "communicated";
  @SerializedName(SERIALIZED_NAME_COMMUNICATED)
  private Boolean communicated;

  public static final String SERIALIZED_NAME_CHUNK_EXECUTION_COUNT = "chunkExecutionCount";
  @SerializedName(SERIALIZED_NAME_CHUNK_EXECUTION_COUNT)
  private Integer chunkExecutionCount;

  public static final String SERIALIZED_NAME_CHUNK_SIZE = "chunkSize";
  @SerializedName(SERIALIZED_NAME_CHUNK_SIZE)
  private Integer chunkSize;


  public CouponCreationJob id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID for this entity.
   * @return id
  **/
  @ApiModelProperty(example = "6", required = true, value = "Unique ID for this entity.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CouponCreationJob created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The exact moment this entity was created.
   * @return created
  **/
  @ApiModelProperty(example = "2020-06-10T09:05:27.993483Z", required = true, value = "The exact moment this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public CouponCreationJob campaignId(Integer campaignId) {
    
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


  public CouponCreationJob applicationId(Integer applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The ID of the application that owns this entity.
   * @return applicationId
  **/
  @ApiModelProperty(example = "322", required = true, value = "The ID of the application that owns this entity.")

  public Integer getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }


  public CouponCreationJob accountId(Integer accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that owns this entity.
   * @return accountId
  **/
  @ApiModelProperty(example = "3886", required = true, value = "The ID of the account that owns this entity.")

  public Integer getAccountId() {
    return accountId;
  }


  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }


  public CouponCreationJob usageLimit(Integer usageLimit) {
    
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


  public CouponCreationJob discountLimit(BigDecimal discountLimit) {
    
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
  @ApiModelProperty(example = "30.0", value = "The amount of discounts that can be given with this coupon code. ")

  public BigDecimal getDiscountLimit() {
    return discountLimit;
  }


  public void setDiscountLimit(BigDecimal discountLimit) {
    this.discountLimit = discountLimit;
  }


  public CouponCreationJob startDate(OffsetDateTime startDate) {
    
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


  public CouponCreationJob expiryDate(OffsetDateTime expiryDate) {
    
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


  public CouponCreationJob numberOfCoupons(Integer numberOfCoupons) {
    
    this.numberOfCoupons = numberOfCoupons;
    return this;
  }

   /**
   * The number of new coupon codes to generate for the campaign. Must be between 20,001 and 5,000,000.
   * maximum: 5000000
   * @return numberOfCoupons
  **/
  @ApiModelProperty(example = "200000", required = true, value = "The number of new coupon codes to generate for the campaign. Must be between 20,001 and 5,000,000.")

  public Integer getNumberOfCoupons() {
    return numberOfCoupons;
  }


  public void setNumberOfCoupons(Integer numberOfCoupons) {
    this.numberOfCoupons = numberOfCoupons;
  }


  public CouponCreationJob couponSettings(CodeGeneratorSettings couponSettings) {
    
    this.couponSettings = couponSettings;
    return this;
  }

   /**
   * Get couponSettings
   * @return couponSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CodeGeneratorSettings getCouponSettings() {
    return couponSettings;
  }


  public void setCouponSettings(CodeGeneratorSettings couponSettings) {
    this.couponSettings = couponSettings;
  }


  public CouponCreationJob attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with coupons
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "Arbitrary properties associated with coupons")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public CouponCreationJob batchId(String batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * The batch ID coupons created by this job will bear
   * @return batchId
  **/
  @ApiModelProperty(example = "tqyrgahe", required = true, value = "The batch ID coupons created by this job will bear")

  public String getBatchId() {
    return batchId;
  }


  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  public CouponCreationJob status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current status of this request. The value should be either &#39;pending&#39;, &#39;completed&#39;, &#39;failed&#39; or &#39;coupon pattern full&#39;
   * @return status
  **/
  @ApiModelProperty(example = "pending", required = true, value = "The current status of this request. The value should be either 'pending', 'completed', 'failed' or 'coupon pattern full'")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CouponCreationJob createdAmount(Integer createdAmount) {
    
    this.createdAmount = createdAmount;
    return this;
  }

   /**
   * The number of coupon codes that were already created for this request
   * @return createdAmount
  **/
  @ApiModelProperty(example = "1000000", required = true, value = "The number of coupon codes that were already created for this request")

  public Integer getCreatedAmount() {
    return createdAmount;
  }


  public void setCreatedAmount(Integer createdAmount) {
    this.createdAmount = createdAmount;
  }


  public CouponCreationJob failCount(Integer failCount) {
    
    this.failCount = failCount;
    return this;
  }

   /**
   * The number of times this job failed
   * @return failCount
  **/
  @ApiModelProperty(example = "10", required = true, value = "The number of times this job failed")

  public Integer getFailCount() {
    return failCount;
  }


  public void setFailCount(Integer failCount) {
    this.failCount = failCount;
  }


  public CouponCreationJob errors(List<String> errors) {
    
    this.errors = errors;
    return this;
  }

  public CouponCreationJob addErrorsItem(String errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * An array of individual problems encountered during the request.
   * @return errors
  **/
  @ApiModelProperty(example = "[Connection to database was reset, failed to generate enough unique codes, attribute 'PizzaLover' not found on entity 'Coupons']", required = true, value = "An array of individual problems encountered during the request.")

  public List<String> getErrors() {
    return errors;
  }


  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  public CouponCreationJob createdBy(Integer createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of the user who created this effect.
   * @return createdBy
  **/
  @ApiModelProperty(example = "1", required = true, value = "ID of the user who created this effect.")

  public Integer getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }


  public CouponCreationJob communicated(Boolean communicated) {
    
    this.communicated = communicated;
    return this;
  }

   /**
   * Whether or not the user that created this job was notified of its final state
   * @return communicated
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether or not the user that created this job was notified of its final state")

  public Boolean getCommunicated() {
    return communicated;
  }


  public void setCommunicated(Boolean communicated) {
    this.communicated = communicated;
  }


  public CouponCreationJob chunkExecutionCount(Integer chunkExecutionCount) {
    
    this.chunkExecutionCount = chunkExecutionCount;
    return this;
  }

   /**
   * The number of times an attempt to create a chunk of coupons was made during the processing of the job
   * @return chunkExecutionCount
  **/
  @ApiModelProperty(example = "0", required = true, value = "The number of times an attempt to create a chunk of coupons was made during the processing of the job")

  public Integer getChunkExecutionCount() {
    return chunkExecutionCount;
  }


  public void setChunkExecutionCount(Integer chunkExecutionCount) {
    this.chunkExecutionCount = chunkExecutionCount;
  }


  public CouponCreationJob chunkSize(Integer chunkSize) {
    
    this.chunkSize = chunkSize;
    return this;
  }

   /**
   * The number of coupons that will be created in a single transactions. Coupons will be created in chunks until arriving at the requested amount.
   * @return chunkSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20000", value = "The number of coupons that will be created in a single transactions. Coupons will be created in chunks until arriving at the requested amount.")

  public Integer getChunkSize() {
    return chunkSize;
  }


  public void setChunkSize(Integer chunkSize) {
    this.chunkSize = chunkSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponCreationJob couponCreationJob = (CouponCreationJob) o;
    return Objects.equals(this.id, couponCreationJob.id) &&
        Objects.equals(this.created, couponCreationJob.created) &&
        Objects.equals(this.campaignId, couponCreationJob.campaignId) &&
        Objects.equals(this.applicationId, couponCreationJob.applicationId) &&
        Objects.equals(this.accountId, couponCreationJob.accountId) &&
        Objects.equals(this.usageLimit, couponCreationJob.usageLimit) &&
        Objects.equals(this.discountLimit, couponCreationJob.discountLimit) &&
        Objects.equals(this.startDate, couponCreationJob.startDate) &&
        Objects.equals(this.expiryDate, couponCreationJob.expiryDate) &&
        Objects.equals(this.numberOfCoupons, couponCreationJob.numberOfCoupons) &&
        Objects.equals(this.couponSettings, couponCreationJob.couponSettings) &&
        Objects.equals(this.attributes, couponCreationJob.attributes) &&
        Objects.equals(this.batchId, couponCreationJob.batchId) &&
        Objects.equals(this.status, couponCreationJob.status) &&
        Objects.equals(this.createdAmount, couponCreationJob.createdAmount) &&
        Objects.equals(this.failCount, couponCreationJob.failCount) &&
        Objects.equals(this.errors, couponCreationJob.errors) &&
        Objects.equals(this.createdBy, couponCreationJob.createdBy) &&
        Objects.equals(this.communicated, couponCreationJob.communicated) &&
        Objects.equals(this.chunkExecutionCount, couponCreationJob.chunkExecutionCount) &&
        Objects.equals(this.chunkSize, couponCreationJob.chunkSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, campaignId, applicationId, accountId, usageLimit, discountLimit, startDate, expiryDate, numberOfCoupons, couponSettings, attributes, batchId, status, createdAmount, failCount, errors, createdBy, communicated, chunkExecutionCount, chunkSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponCreationJob {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    discountLimit: ").append(toIndentedString(discountLimit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    numberOfCoupons: ").append(toIndentedString(numberOfCoupons)).append("\n");
    sb.append("    couponSettings: ").append(toIndentedString(couponSettings)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAmount: ").append(toIndentedString(createdAmount)).append("\n");
    sb.append("    failCount: ").append(toIndentedString(failCount)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    communicated: ").append(toIndentedString(communicated)).append("\n");
    sb.append("    chunkExecutionCount: ").append(toIndentedString(chunkExecutionCount)).append("\n");
    sb.append("    chunkSize: ").append(toIndentedString(chunkSize)).append("\n");
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

