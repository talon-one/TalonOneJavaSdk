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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import one.talon.model.AdditionalCost;
import one.talon.model.CartItem;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class CustomerSessionV2 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integrationId";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public static final String SERIALIZED_NAME_EVALUABLE_CAMPAIGN_IDS = "evaluableCampaignIds";
  @SerializedName(SERIALIZED_NAME_EVALUABLE_CAMPAIGN_IDS)
  private List<Integer> evaluableCampaignIds = null;

  public static final String SERIALIZED_NAME_COUPON_CODES = "couponCodes";
  @SerializedName(SERIALIZED_NAME_COUPON_CODES)
  private List<String> couponCodes = null;

  public static final String SERIALIZED_NAME_REFERRAL_CODE = "referralCode";
  @SerializedName(SERIALIZED_NAME_REFERRAL_CODE)
  private String referralCode;

  public static final String SERIALIZED_NAME_LOYALTY_CARDS = "loyaltyCards";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CARDS)
  private List<String> loyaltyCards = null;

  /**
   * Indicates the current state of the session. Sessions can be created as &#x60;open&#x60; or &#x60;closed&#x60;. The state transitions are:  1. &#x60;open&#x60; → &#x60;closed&#x60; 2. &#x60;open&#x60; → &#x60;cancelled&#x60; 3. Either:    - &#x60;closed&#x60; → &#x60;cancelled&#x60; (**only** via [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2)) or    - &#x60;closed&#x60; → &#x60;partially_returned&#x60; (**only** via [Return cart items](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/returnCartItems))    - &#x60;closed&#x60; → &#x60;open&#x60; (**only** via [Reopen customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/reopenCustomerSession)) 4. &#x60;partially_returned&#x60; → &#x60;cancelled&#x60;  For more information, see [Customer session states](https://docs.talon.one/docs/dev/concepts/entities#customer-session). 
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    OPEN("open"),
    
    CLOSED("closed"),
    
    PARTIALLY_RETURNED("partially_returned"),
    
    CANCELLED("cancelled");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state = StateEnum.OPEN;

  public static final String SERIALIZED_NAME_CART_ITEMS = "cartItems";
  @SerializedName(SERIALIZED_NAME_CART_ITEMS)
  private List<CartItem> cartItems = new ArrayList<CartItem>();

  public static final String SERIALIZED_NAME_ADDITIONAL_COSTS = "additionalCosts";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_COSTS)
  private Map<String, AdditionalCost> additionalCosts = null;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<String> identifiers = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_FIRST_SESSION = "firstSession";
  @SerializedName(SERIALIZED_NAME_FIRST_SESSION)
  private Boolean firstSession;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public static final String SERIALIZED_NAME_CART_ITEM_TOTAL = "cartItemTotal";
  @SerializedName(SERIALIZED_NAME_CART_ITEM_TOTAL)
  private BigDecimal cartItemTotal;

  public static final String SERIALIZED_NAME_ADDITIONAL_COST_TOTAL = "additionalCostTotal";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_COST_TOTAL)
  private BigDecimal additionalCostTotal;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;


  public CustomerSessionV2 id(Integer id) {
    
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


  public CustomerSessionV2 created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The time this entity was created. The time this entity was created.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The time this entity was created. The time this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public CustomerSessionV2 integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The integration ID set by your integration layer.
   * @return integrationId
  **/
  @ApiModelProperty(example = "URNGV8294NV", required = true, value = "The integration ID set by your integration layer.")

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public CustomerSessionV2 applicationId(Integer applicationId) {
    
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


  public CustomerSessionV2 profileId(String profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * ID of the customer profile set by your integration layer.  **Note:** If the customer does not yet have a known &#x60;profileId&#x60;, we recommend you use a guest &#x60;profileId&#x60;. 
   * @return profileId
  **/
  @ApiModelProperty(example = "URNGV8294NV", required = true, value = "ID of the customer profile set by your integration layer.  **Note:** If the customer does not yet have a known `profileId`, we recommend you use a guest `profileId`. ")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public CustomerSessionV2 evaluableCampaignIds(List<Integer> evaluableCampaignIds) {
    
    this.evaluableCampaignIds = evaluableCampaignIds;
    return this;
  }

  public CustomerSessionV2 addEvaluableCampaignIdsItem(Integer evaluableCampaignIdsItem) {
    if (this.evaluableCampaignIds == null) {
      this.evaluableCampaignIds = new ArrayList<Integer>();
    }
    this.evaluableCampaignIds.add(evaluableCampaignIdsItem);
    return this;
  }

   /**
   * When using the &#x60;dry&#x60; query parameter, use this property to list the campaign to be evaluated by the Rule Engine.  These campaigns will be evaluated, even if they are disabled, allowing you to test specific campaigns before activating them. 
   * @return evaluableCampaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[10, 12]", value = "When using the `dry` query parameter, use this property to list the campaign to be evaluated by the Rule Engine.  These campaigns will be evaluated, even if they are disabled, allowing you to test specific campaigns before activating them. ")

  public List<Integer> getEvaluableCampaignIds() {
    return evaluableCampaignIds;
  }


  public void setEvaluableCampaignIds(List<Integer> evaluableCampaignIds) {
    this.evaluableCampaignIds = evaluableCampaignIds;
  }


  public CustomerSessionV2 couponCodes(List<String> couponCodes) {
    
    this.couponCodes = couponCodes;
    return this;
  }

  public CustomerSessionV2 addCouponCodesItem(String couponCodesItem) {
    if (this.couponCodes == null) {
      this.couponCodes = new ArrayList<String>();
    }
    this.couponCodes.add(couponCodesItem);
    return this;
  }

   /**
   * Any coupon codes entered.  **Important**: If you [create a coupon budget](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets/#budget-types) for your campaign, ensure the session contains a coupon code by the time you close it. 
   * @return couponCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[XMAS-20-2021]", value = "Any coupon codes entered.  **Important**: If you [create a coupon budget](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets/#budget-types) for your campaign, ensure the session contains a coupon code by the time you close it. ")

  public List<String> getCouponCodes() {
    return couponCodes;
  }


  public void setCouponCodes(List<String> couponCodes) {
    this.couponCodes = couponCodes;
  }


  public CustomerSessionV2 referralCode(String referralCode) {
    
    this.referralCode = referralCode;
    return this;
  }

   /**
   * Any referral code entered.  **Important**: If you [create a referral budget](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets/#budget-types) for your campaign, ensure the session contains a referral code by the time you close it. 
   * @return referralCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NT2K54D9", value = "Any referral code entered.  **Important**: If you [create a referral budget](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets/#budget-types) for your campaign, ensure the session contains a referral code by the time you close it. ")

  public String getReferralCode() {
    return referralCode;
  }


  public void setReferralCode(String referralCode) {
    this.referralCode = referralCode;
  }


  public CustomerSessionV2 loyaltyCards(List<String> loyaltyCards) {
    
    this.loyaltyCards = loyaltyCards;
    return this;
  }

  public CustomerSessionV2 addLoyaltyCardsItem(String loyaltyCardsItem) {
    if (this.loyaltyCards == null) {
      this.loyaltyCards = new ArrayList<String>();
    }
    this.loyaltyCards.add(loyaltyCardsItem);
    return this;
  }

   /**
   * Any loyalty cards used.
   * @return loyaltyCards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[loyalty-card-1]", value = "Any loyalty cards used.")

  public List<String> getLoyaltyCards() {
    return loyaltyCards;
  }


  public void setLoyaltyCards(List<String> loyaltyCards) {
    this.loyaltyCards = loyaltyCards;
  }


  public CustomerSessionV2 state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Indicates the current state of the session. Sessions can be created as &#x60;open&#x60; or &#x60;closed&#x60;. The state transitions are:  1. &#x60;open&#x60; → &#x60;closed&#x60; 2. &#x60;open&#x60; → &#x60;cancelled&#x60; 3. Either:    - &#x60;closed&#x60; → &#x60;cancelled&#x60; (**only** via [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2)) or    - &#x60;closed&#x60; → &#x60;partially_returned&#x60; (**only** via [Return cart items](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/returnCartItems))    - &#x60;closed&#x60; → &#x60;open&#x60; (**only** via [Reopen customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/reopenCustomerSession)) 4. &#x60;partially_returned&#x60; → &#x60;cancelled&#x60;  For more information, see [Customer session states](https://docs.talon.one/docs/dev/concepts/entities#customer-session). 
   * @return state
  **/
  @ApiModelProperty(example = "open", required = true, value = "Indicates the current state of the session. Sessions can be created as `open` or `closed`. The state transitions are:  1. `open` → `closed` 2. `open` → `cancelled` 3. Either:    - `closed` → `cancelled` (**only** via [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2)) or    - `closed` → `partially_returned` (**only** via [Return cart items](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/returnCartItems))    - `closed` → `open` (**only** via [Reopen customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/reopenCustomerSession)) 4. `partially_returned` → `cancelled`  For more information, see [Customer session states](https://docs.talon.one/docs/dev/concepts/entities#customer-session). ")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public CustomerSessionV2 cartItems(List<CartItem> cartItems) {
    
    this.cartItems = cartItems;
    return this;
  }

  public CustomerSessionV2 addCartItemsItem(CartItem cartItemsItem) {
    this.cartItems.add(cartItemsItem);
    return this;
  }

   /**
   * The items to add to this sessions. - If cart item flattening is disabled: **Do not exceed 1000 items** (regardless of their &#x60;quantity&#x60;) per request. - If cart item flattening is enabled: **Do not exceed 1000 items** and ensure the sum of all cart item&#39;s &#x60;quantity&#x60; **does not exceed 10.000** per request. 
   * @return cartItems
  **/
  @ApiModelProperty(required = true, value = "The items to add to this sessions. - If cart item flattening is disabled: **Do not exceed 1000 items** (regardless of their `quantity`) per request. - If cart item flattening is enabled: **Do not exceed 1000 items** and ensure the sum of all cart item's `quantity` **does not exceed 10.000** per request. ")

  public List<CartItem> getCartItems() {
    return cartItems;
  }


  public void setCartItems(List<CartItem> cartItems) {
    this.cartItems = cartItems;
  }


  public CustomerSessionV2 additionalCosts(Map<String, AdditionalCost> additionalCosts) {
    
    this.additionalCosts = additionalCosts;
    return this;
  }

  public CustomerSessionV2 putAdditionalCostsItem(String key, AdditionalCost additionalCostsItem) {
    if (this.additionalCosts == null) {
      this.additionalCosts = new HashMap<String, AdditionalCost>();
    }
    this.additionalCosts.put(key, additionalCostsItem);
    return this;
  }

   /**
   * Use this property to set a value for the additional costs of this session, such as a shipping cost.  They must be created in the Campaign Manager before you set them with this property. See [Managing additional costs](https://docs.talon.one/docs/product/account/dev-tools/managing-additional-costs). 
   * @return additionalCosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"shipping\":{\"price\":9}}", value = "Use this property to set a value for the additional costs of this session, such as a shipping cost.  They must be created in the Campaign Manager before you set them with this property. See [Managing additional costs](https://docs.talon.one/docs/product/account/dev-tools/managing-additional-costs). ")

  public Map<String, AdditionalCost> getAdditionalCosts() {
    return additionalCosts;
  }


  public void setAdditionalCosts(Map<String, AdditionalCost> additionalCosts) {
    this.additionalCosts = additionalCosts;
  }


  public CustomerSessionV2 identifiers(List<String> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public CustomerSessionV2 addIdentifiersItem(String identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<String>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Session custom identifiers that you can set limits on or use inside your rules.  For example, you can use IP addresses as identifiers to potentially identify devices and limit discounts abuse in case of customers creating multiple accounts. See the [tutorial](https://docs.talon.one/docs/dev/tutorials/using-identifiers).  **Important**: Ensure the session contains an identifier by the time you close it if: - You [create a unique identifier budget](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets/#budget-types) for your campaign. - Your campaign has [coupons](https://docs.talon.one/docs/product/campaigns/coupons/coupon-page-overview). 
   * @return identifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[91.11.156.141]", value = "Session custom identifiers that you can set limits on or use inside your rules.  For example, you can use IP addresses as identifiers to potentially identify devices and limit discounts abuse in case of customers creating multiple accounts. See the [tutorial](https://docs.talon.one/docs/dev/tutorials/using-identifiers).  **Important**: Ensure the session contains an identifier by the time you close it if: - You [create a unique identifier budget](https://docs.talon.one/docs/product/campaigns/settings/managing-campaign-budgets/#budget-types) for your campaign. - Your campaign has [coupons](https://docs.talon.one/docs/product/campaigns/coupons/coupon-page-overview). ")

  public List<String> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(List<String> identifiers) {
    this.identifiers = identifiers;
  }


  public CustomerSessionV2 attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Use this property to set a value for the attributes of your choice. Attributes represent any information to attach to your session, like the shipping city.  You can use [built-in attributes](https://docs.talon.one/docs/dev/concepts/attributes#built-in-attributes) or [custom ones](https://docs.talon.one/docs/dev/concepts/attributes#custom-attributes). Custom attributes must be created in the Campaign Manager before you set them with this property. 
   * @return attributes
  **/
  @ApiModelProperty(example = "{\"ShippingCity\":\"Berlin\"}", required = true, value = "Use this property to set a value for the attributes of your choice. Attributes represent any information to attach to your session, like the shipping city.  You can use [built-in attributes](https://docs.talon.one/docs/dev/concepts/attributes#built-in-attributes) or [custom ones](https://docs.talon.one/docs/dev/concepts/attributes#custom-attributes). Custom attributes must be created in the Campaign Manager before you set them with this property. ")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public CustomerSessionV2 firstSession(Boolean firstSession) {
    
    this.firstSession = firstSession;
    return this;
  }

   /**
   * Indicates whether this is the first session for the customer&#39;s profile. Will always be true for anonymous sessions.
   * @return firstSession
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates whether this is the first session for the customer's profile. Will always be true for anonymous sessions.")

  public Boolean getFirstSession() {
    return firstSession;
  }


  public void setFirstSession(Boolean firstSession) {
    this.firstSession = firstSession;
  }


  public CustomerSessionV2 total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total sum of cart-items, as well as additional costs, before any discounts applied.
   * @return total
  **/
  @ApiModelProperty(example = "119.99", required = true, value = "The total sum of cart-items, as well as additional costs, before any discounts applied.")

  public BigDecimal getTotal() {
    return total;
  }


  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public CustomerSessionV2 cartItemTotal(BigDecimal cartItemTotal) {
    
    this.cartItemTotal = cartItemTotal;
    return this;
  }

   /**
   * The total sum of cart-items before any discounts applied.
   * @return cartItemTotal
  **/
  @ApiModelProperty(example = "99.99", required = true, value = "The total sum of cart-items before any discounts applied.")

  public BigDecimal getCartItemTotal() {
    return cartItemTotal;
  }


  public void setCartItemTotal(BigDecimal cartItemTotal) {
    this.cartItemTotal = cartItemTotal;
  }


  public CustomerSessionV2 additionalCostTotal(BigDecimal additionalCostTotal) {
    
    this.additionalCostTotal = additionalCostTotal;
    return this;
  }

   /**
   * The total sum of additional costs before any discounts applied.
   * @return additionalCostTotal
  **/
  @ApiModelProperty(example = "20.0", required = true, value = "The total sum of additional costs before any discounts applied.")

  public BigDecimal getAdditionalCostTotal() {
    return additionalCostTotal;
  }


  public void setAdditionalCostTotal(BigDecimal additionalCostTotal) {
    this.additionalCostTotal = additionalCostTotal;
  }


  public CustomerSessionV2 updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Timestamp of the most recent event received on this session.
   * @return updated
  **/
  @ApiModelProperty(example = "2020-02-08T14:15:22Z", required = true, value = "Timestamp of the most recent event received on this session.")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerSessionV2 customerSessionV2 = (CustomerSessionV2) o;
    return Objects.equals(this.id, customerSessionV2.id) &&
        Objects.equals(this.created, customerSessionV2.created) &&
        Objects.equals(this.integrationId, customerSessionV2.integrationId) &&
        Objects.equals(this.applicationId, customerSessionV2.applicationId) &&
        Objects.equals(this.profileId, customerSessionV2.profileId) &&
        Objects.equals(this.evaluableCampaignIds, customerSessionV2.evaluableCampaignIds) &&
        Objects.equals(this.couponCodes, customerSessionV2.couponCodes) &&
        Objects.equals(this.referralCode, customerSessionV2.referralCode) &&
        Objects.equals(this.loyaltyCards, customerSessionV2.loyaltyCards) &&
        Objects.equals(this.state, customerSessionV2.state) &&
        Objects.equals(this.cartItems, customerSessionV2.cartItems) &&
        Objects.equals(this.additionalCosts, customerSessionV2.additionalCosts) &&
        Objects.equals(this.identifiers, customerSessionV2.identifiers) &&
        Objects.equals(this.attributes, customerSessionV2.attributes) &&
        Objects.equals(this.firstSession, customerSessionV2.firstSession) &&
        Objects.equals(this.total, customerSessionV2.total) &&
        Objects.equals(this.cartItemTotal, customerSessionV2.cartItemTotal) &&
        Objects.equals(this.additionalCostTotal, customerSessionV2.additionalCostTotal) &&
        Objects.equals(this.updated, customerSessionV2.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, integrationId, applicationId, profileId, evaluableCampaignIds, couponCodes, referralCode, loyaltyCards, state, cartItems, additionalCosts, identifiers, attributes, firstSession, total, cartItemTotal, additionalCostTotal, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSessionV2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    evaluableCampaignIds: ").append(toIndentedString(evaluableCampaignIds)).append("\n");
    sb.append("    couponCodes: ").append(toIndentedString(couponCodes)).append("\n");
    sb.append("    referralCode: ").append(toIndentedString(referralCode)).append("\n");
    sb.append("    loyaltyCards: ").append(toIndentedString(loyaltyCards)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    cartItems: ").append(toIndentedString(cartItems)).append("\n");
    sb.append("    additionalCosts: ").append(toIndentedString(additionalCosts)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    firstSession: ").append(toIndentedString(firstSession)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    cartItemTotal: ").append(toIndentedString(cartItemTotal)).append("\n");
    sb.append("    additionalCostTotal: ").append(toIndentedString(additionalCostTotal)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

