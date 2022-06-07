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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import one.talon.model.CartItem;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class CustomerSession {
  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integrationId";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public static final String SERIALIZED_NAME_COUPON = "coupon";
  @SerializedName(SERIALIZED_NAME_COUPON)
  private String coupon;

  public static final String SERIALIZED_NAME_REFERRAL = "referral";
  @SerializedName(SERIALIZED_NAME_REFERRAL)
  private String referral;

  /**
   * Indicates the current state of the session. Sessions can be created as &#x60;open&#x60; or &#x60;closed&#x60;. The state transitions are:  1. &#x60;open&#x60; → &#x60;closed&#x60; 2. &#x60;open&#x60; → &#x60;cancelled&#x60; 3. &#x60;closed&#x60; → &#x60;cancelled&#x60; or &#x60;partially_returned&#x60; 4. &#x60;partially_returned&#x60; → &#x60;cancelled&#x60;  For more information, see [Entities](/docs/dev/concepts/entities#customer-session). 
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

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<String> identifiers = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_FIRST_SESSION = "firstSession";
  @SerializedName(SERIALIZED_NAME_FIRST_SESSION)
  private Boolean firstSession;

  public static final String SERIALIZED_NAME_DISCOUNTS = "discounts";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS)
  private Map<String, BigDecimal> discounts = new HashMap<String, BigDecimal>();

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;


  public CustomerSession integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The integration ID for this entity sent to and used in the Talon.One system.
   * @return integrationId
  **/
  @ApiModelProperty(required = true, value = "The integration ID for this entity sent to and used in the Talon.One system.")

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public CustomerSession created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The exact moment this entity was created.
   * @return created
  **/
  @ApiModelProperty(example = "2020-02-07T08:15:22Z", required = true, value = "The exact moment this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public CustomerSession applicationId(Integer applicationId) {
    
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


  public CustomerSession profileId(String profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * ID of the customers profile as used within this Talon.One account.  **Note:** If the customer does not yet have a known profileId, we recommend you use a guest profileId. 
   * @return profileId
  **/
  @ApiModelProperty(example = "URNGV8294NV", required = true, value = "ID of the customers profile as used within this Talon.One account.  **Note:** If the customer does not yet have a known profileId, we recommend you use a guest profileId. ")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public CustomerSession coupon(String coupon) {
    
    this.coupon = coupon;
    return this;
  }

   /**
   * Any coupon code entered.
   * @return coupon
  **/
  @ApiModelProperty(required = true, value = "Any coupon code entered.")

  public String getCoupon() {
    return coupon;
  }


  public void setCoupon(String coupon) {
    this.coupon = coupon;
  }


  public CustomerSession referral(String referral) {
    
    this.referral = referral;
    return this;
  }

   /**
   * Any referral code entered.
   * @return referral
  **/
  @ApiModelProperty(required = true, value = "Any referral code entered.")

  public String getReferral() {
    return referral;
  }


  public void setReferral(String referral) {
    this.referral = referral;
  }


  public CustomerSession state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Indicates the current state of the session. Sessions can be created as &#x60;open&#x60; or &#x60;closed&#x60;. The state transitions are:  1. &#x60;open&#x60; → &#x60;closed&#x60; 2. &#x60;open&#x60; → &#x60;cancelled&#x60; 3. &#x60;closed&#x60; → &#x60;cancelled&#x60; or &#x60;partially_returned&#x60; 4. &#x60;partially_returned&#x60; → &#x60;cancelled&#x60;  For more information, see [Entities](/docs/dev/concepts/entities#customer-session). 
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Indicates the current state of the session. Sessions can be created as `open` or `closed`. The state transitions are:  1. `open` → `closed` 2. `open` → `cancelled` 3. `closed` → `cancelled` or `partially_returned` 4. `partially_returned` → `cancelled`  For more information, see [Entities](/docs/dev/concepts/entities#customer-session). ")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public CustomerSession cartItems(List<CartItem> cartItems) {
    
    this.cartItems = cartItems;
    return this;
  }

  public CustomerSession addCartItemsItem(CartItem cartItemsItem) {
    this.cartItems.add(cartItemsItem);
    return this;
  }

   /**
   * Serialized JSON representation.
   * @return cartItems
  **/
  @ApiModelProperty(required = true, value = "Serialized JSON representation.")

  public List<CartItem> getCartItems() {
    return cartItems;
  }


  public void setCartItems(List<CartItem> cartItems) {
    this.cartItems = cartItems;
  }


  public CustomerSession identifiers(List<String> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public CustomerSession addIdentifiersItem(String identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<String>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Session custom identifiers that you can set limits on or use inside your rules.  For example, you can use IP addresses as identifiers to potentially identify devices and limit discounts abuse in case of customers creating multiple accounts. See the [tutorial](https://docs.talon.one/docs/dev/tutorials/using-identifiers/). 
   * @return identifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[91.11.156.141]", value = "Session custom identifiers that you can set limits on or use inside your rules.  For example, you can use IP addresses as identifiers to potentially identify devices and limit discounts abuse in case of customers creating multiple accounts. See the [tutorial](https://docs.talon.one/docs/dev/tutorials/using-identifiers/). ")

  public List<String> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(List<String> identifiers) {
    this.identifiers = identifiers;
  }


  public CustomerSession total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total sum of the cart in one session.
   * @return total
  **/
  @ApiModelProperty(required = true, value = "The total sum of the cart in one session.")

  public BigDecimal getTotal() {
    return total;
  }


  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public CustomerSession attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * A key-value map of the sessions attributes. The potentially valid attributes are configured in your accounts developer settings. 
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "A key-value map of the sessions attributes. The potentially valid attributes are configured in your accounts developer settings. ")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public CustomerSession firstSession(Boolean firstSession) {
    
    this.firstSession = firstSession;
    return this;
  }

   /**
   * Indicates whether this is the first session for the customer&#39;s profile. Will always be true for anonymous sessions.
   * @return firstSession
  **/
  @ApiModelProperty(required = true, value = "Indicates whether this is the first session for the customer's profile. Will always be true for anonymous sessions.")

  public Boolean getFirstSession() {
    return firstSession;
  }


  public void setFirstSession(Boolean firstSession) {
    this.firstSession = firstSession;
  }


  public CustomerSession discounts(Map<String, BigDecimal> discounts) {
    
    this.discounts = discounts;
    return this;
  }

  public CustomerSession putDiscountsItem(String key, BigDecimal discountsItem) {
    this.discounts.put(key, discountsItem);
    return this;
  }

   /**
   * A map of labelled discount values, values will be in the same currency as the application associated with the session.
   * @return discounts
  **/
  @ApiModelProperty(required = true, value = "A map of labelled discount values, values will be in the same currency as the application associated with the session.")

  public Map<String, BigDecimal> getDiscounts() {
    return discounts;
  }


  public void setDiscounts(Map<String, BigDecimal> discounts) {
    this.discounts = discounts;
  }


  public CustomerSession updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Timestamp of the most recent event received on this session
   * @return updated
  **/
  @ApiModelProperty(example = "2021-09-12T10:12:42Z", required = true, value = "Timestamp of the most recent event received on this session")

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
    CustomerSession customerSession = (CustomerSession) o;
    return Objects.equals(this.integrationId, customerSession.integrationId) &&
        Objects.equals(this.created, customerSession.created) &&
        Objects.equals(this.applicationId, customerSession.applicationId) &&
        Objects.equals(this.profileId, customerSession.profileId) &&
        Objects.equals(this.coupon, customerSession.coupon) &&
        Objects.equals(this.referral, customerSession.referral) &&
        Objects.equals(this.state, customerSession.state) &&
        Objects.equals(this.cartItems, customerSession.cartItems) &&
        Objects.equals(this.identifiers, customerSession.identifiers) &&
        Objects.equals(this.total, customerSession.total) &&
        Objects.equals(this.attributes, customerSession.attributes) &&
        Objects.equals(this.firstSession, customerSession.firstSession) &&
        Objects.equals(this.discounts, customerSession.discounts) &&
        Objects.equals(this.updated, customerSession.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, created, applicationId, profileId, coupon, referral, state, cartItems, identifiers, total, attributes, firstSession, discounts, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSession {\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
    sb.append("    referral: ").append(toIndentedString(referral)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    cartItems: ").append(toIndentedString(cartItems)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    firstSession: ").append(toIndentedString(firstSession)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
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

