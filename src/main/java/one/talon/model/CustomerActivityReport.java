/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * OpenAPI spec version: 1.0.0
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
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class CustomerActivityReport {
  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integrationId";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private Integer customerId;

  public static final String SERIALIZED_NAME_LAST_ACTIVITY = "lastActivity";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVITY)
  private OffsetDateTime lastActivity;

  public static final String SERIALIZED_NAME_COUPON_REDEMPTIONS = "couponRedemptions";
  @SerializedName(SERIALIZED_NAME_COUPON_REDEMPTIONS)
  private Integer couponRedemptions;

  public static final String SERIALIZED_NAME_COUPON_USE_ATTEMPTS = "couponUseAttempts";
  @SerializedName(SERIALIZED_NAME_COUPON_USE_ATTEMPTS)
  private Integer couponUseAttempts;

  public static final String SERIALIZED_NAME_COUPON_FAILED_ATTEMPTS = "couponFailedAttempts";
  @SerializedName(SERIALIZED_NAME_COUPON_FAILED_ATTEMPTS)
  private Integer couponFailedAttempts;

  public static final String SERIALIZED_NAME_ACCRUED_DISCOUNTS = "accruedDiscounts";
  @SerializedName(SERIALIZED_NAME_ACCRUED_DISCOUNTS)
  private BigDecimal accruedDiscounts;

  public static final String SERIALIZED_NAME_ACCRUED_REVENUE = "accruedRevenue";
  @SerializedName(SERIALIZED_NAME_ACCRUED_REVENUE)
  private BigDecimal accruedRevenue;

  public static final String SERIALIZED_NAME_TOTAL_ORDERS = "totalOrders";
  @SerializedName(SERIALIZED_NAME_TOTAL_ORDERS)
  private Integer totalOrders;

  public static final String SERIALIZED_NAME_TOTAL_ORDERS_NO_COUPON = "totalOrdersNoCoupon";
  @SerializedName(SERIALIZED_NAME_TOTAL_ORDERS_NO_COUPON)
  private Integer totalOrdersNoCoupon;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaignName";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName;

  public CustomerActivityReport integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The ID used for this entity in the application system.
   * @return integrationId
  **/
  @ApiModelProperty(required = true, value = "The ID used for this entity in the application system.")
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  public CustomerActivityReport created(OffsetDateTime created) {
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

  public CustomerActivityReport name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this customer profile.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name for this customer profile.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerActivityReport customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * The internal Talon.One ID of the customer.
   * @return customerId
  **/
  @ApiModelProperty(required = true, value = "The internal Talon.One ID of the customer.")
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public CustomerActivityReport lastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * The last activity of the customer.
   * @return lastActivity
  **/
  @ApiModelProperty(value = "The last activity of the customer.")
  public OffsetDateTime getLastActivity() {
    return lastActivity;
  }

  public void setLastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
  }

  public CustomerActivityReport couponRedemptions(Integer couponRedemptions) {
    this.couponRedemptions = couponRedemptions;
    return this;
  }

   /**
   * Number of coupon redemptions in all customer campaigns.
   * @return couponRedemptions
  **/
  @ApiModelProperty(required = true, value = "Number of coupon redemptions in all customer campaigns.")
  public Integer getCouponRedemptions() {
    return couponRedemptions;
  }

  public void setCouponRedemptions(Integer couponRedemptions) {
    this.couponRedemptions = couponRedemptions;
  }

  public CustomerActivityReport couponUseAttempts(Integer couponUseAttempts) {
    this.couponUseAttempts = couponUseAttempts;
    return this;
  }

   /**
   * Number of coupon use attempts in all customer campaigns.
   * @return couponUseAttempts
  **/
  @ApiModelProperty(required = true, value = "Number of coupon use attempts in all customer campaigns.")
  public Integer getCouponUseAttempts() {
    return couponUseAttempts;
  }

  public void setCouponUseAttempts(Integer couponUseAttempts) {
    this.couponUseAttempts = couponUseAttempts;
  }

  public CustomerActivityReport couponFailedAttempts(Integer couponFailedAttempts) {
    this.couponFailedAttempts = couponFailedAttempts;
    return this;
  }

   /**
   * Number of failed coupon use attempts in all customer campaigns.
   * @return couponFailedAttempts
  **/
  @ApiModelProperty(required = true, value = "Number of failed coupon use attempts in all customer campaigns.")
  public Integer getCouponFailedAttempts() {
    return couponFailedAttempts;
  }

  public void setCouponFailedAttempts(Integer couponFailedAttempts) {
    this.couponFailedAttempts = couponFailedAttempts;
  }

  public CustomerActivityReport accruedDiscounts(BigDecimal accruedDiscounts) {
    this.accruedDiscounts = accruedDiscounts;
    return this;
  }

   /**
   * Number of accrued discounts in all customer campaigns.
   * @return accruedDiscounts
  **/
  @ApiModelProperty(required = true, value = "Number of accrued discounts in all customer campaigns.")
  public BigDecimal getAccruedDiscounts() {
    return accruedDiscounts;
  }

  public void setAccruedDiscounts(BigDecimal accruedDiscounts) {
    this.accruedDiscounts = accruedDiscounts;
  }

  public CustomerActivityReport accruedRevenue(BigDecimal accruedRevenue) {
    this.accruedRevenue = accruedRevenue;
    return this;
  }

   /**
   * Amount of accrued revenue in all customer campaigns.
   * @return accruedRevenue
  **/
  @ApiModelProperty(required = true, value = "Amount of accrued revenue in all customer campaigns.")
  public BigDecimal getAccruedRevenue() {
    return accruedRevenue;
  }

  public void setAccruedRevenue(BigDecimal accruedRevenue) {
    this.accruedRevenue = accruedRevenue;
  }

  public CustomerActivityReport totalOrders(Integer totalOrders) {
    this.totalOrders = totalOrders;
    return this;
  }

   /**
   * Number of orders in all customer campaigns.
   * @return totalOrders
  **/
  @ApiModelProperty(required = true, value = "Number of orders in all customer campaigns.")
  public Integer getTotalOrders() {
    return totalOrders;
  }

  public void setTotalOrders(Integer totalOrders) {
    this.totalOrders = totalOrders;
  }

  public CustomerActivityReport totalOrdersNoCoupon(Integer totalOrdersNoCoupon) {
    this.totalOrdersNoCoupon = totalOrdersNoCoupon;
    return this;
  }

   /**
   * Number of orders without coupon used in all customer campaigns.
   * @return totalOrdersNoCoupon
  **/
  @ApiModelProperty(required = true, value = "Number of orders without coupon used in all customer campaigns.")
  public Integer getTotalOrdersNoCoupon() {
    return totalOrdersNoCoupon;
  }

  public void setTotalOrdersNoCoupon(Integer totalOrdersNoCoupon) {
    this.totalOrdersNoCoupon = totalOrdersNoCoupon;
  }

  public CustomerActivityReport campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

   /**
   * The name of the campaign this customer belongs to.
   * @return campaignName
  **/
  @ApiModelProperty(required = true, value = "The name of the campaign this customer belongs to.")
  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerActivityReport customerActivityReport = (CustomerActivityReport) o;
    return Objects.equals(this.integrationId, customerActivityReport.integrationId) &&
        Objects.equals(this.created, customerActivityReport.created) &&
        Objects.equals(this.name, customerActivityReport.name) &&
        Objects.equals(this.customerId, customerActivityReport.customerId) &&
        Objects.equals(this.lastActivity, customerActivityReport.lastActivity) &&
        Objects.equals(this.couponRedemptions, customerActivityReport.couponRedemptions) &&
        Objects.equals(this.couponUseAttempts, customerActivityReport.couponUseAttempts) &&
        Objects.equals(this.couponFailedAttempts, customerActivityReport.couponFailedAttempts) &&
        Objects.equals(this.accruedDiscounts, customerActivityReport.accruedDiscounts) &&
        Objects.equals(this.accruedRevenue, customerActivityReport.accruedRevenue) &&
        Objects.equals(this.totalOrders, customerActivityReport.totalOrders) &&
        Objects.equals(this.totalOrdersNoCoupon, customerActivityReport.totalOrdersNoCoupon) &&
        Objects.equals(this.campaignName, customerActivityReport.campaignName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, created, name, customerId, lastActivity, couponRedemptions, couponUseAttempts, couponFailedAttempts, accruedDiscounts, accruedRevenue, totalOrders, totalOrdersNoCoupon, campaignName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerActivityReport {\n");
    
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    couponRedemptions: ").append(toIndentedString(couponRedemptions)).append("\n");
    sb.append("    couponUseAttempts: ").append(toIndentedString(couponUseAttempts)).append("\n");
    sb.append("    couponFailedAttempts: ").append(toIndentedString(couponFailedAttempts)).append("\n");
    sb.append("    accruedDiscounts: ").append(toIndentedString(accruedDiscounts)).append("\n");
    sb.append("    accruedRevenue: ").append(toIndentedString(accruedRevenue)).append("\n");
    sb.append("    totalOrders: ").append(toIndentedString(totalOrders)).append("\n");
    sb.append("    totalOrdersNoCoupon: ").append(toIndentedString(totalOrdersNoCoupon)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
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
