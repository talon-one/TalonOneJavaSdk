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
import java.util.List;
import one.talon.model.CartItem;
import one.talon.custom.JsonNullable;
import one.talon.custom.NullableAdapterFactory;

/**
 * 
 */
@ApiModel(description = "")
@JsonAdapter(NullableAdapterFactory.class)

public class NewCustomerSession {
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
   * Indicates the current state of the session. Sessions can be created as &#x60;open&#x60; or &#x60;closed&#x60;. The state transitions are:  1. &#x60;open&#x60; → &#x60;closed&#x60; 2. &#x60;open&#x60; → &#x60;cancelled&#x60; 3. &#x60;closed&#x60; → &#x60;cancelled&#x60; or &#x60;partially_returned&#x60; 4. &#x60;partially_returned&#x60; → &#x60;cancelled&#x60;  For more information, see [Customer session states](https://docs.talon.one/docs/dev/concepts/entities#customer-session). 
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
  private List<CartItem> cartItems = null;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<String> identifiers = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
    /*allow Serializing null for this field */
      @JsonNullable
  private Object attributes;


  public NewCustomerSession profileId(String profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * ID of the customer profile set by your integration layer.  **Note:** If the customer does not yet have a known &#x60;profileId&#x60;, we recommend you use a guest &#x60;profileId&#x60;. 
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "URNGV8294NV", value = "ID of the customer profile set by your integration layer.  **Note:** If the customer does not yet have a known `profileId`, we recommend you use a guest `profileId`. ")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public NewCustomerSession coupon(String coupon) {
    
    this.coupon = coupon;
    return this;
  }

   /**
   * Any coupon code entered.
   * @return coupon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XMAS-2021", value = "Any coupon code entered.")

  public String getCoupon() {
    return coupon;
  }


  public void setCoupon(String coupon) {
    this.coupon = coupon;
  }


  public NewCustomerSession referral(String referral) {
    
    this.referral = referral;
    return this;
  }

   /**
   * Any referral code entered.
   * @return referral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2740-tbjua-6720", value = "Any referral code entered.")

  public String getReferral() {
    return referral;
  }


  public void setReferral(String referral) {
    this.referral = referral;
  }


  public NewCustomerSession state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Indicates the current state of the session. Sessions can be created as &#x60;open&#x60; or &#x60;closed&#x60;. The state transitions are:  1. &#x60;open&#x60; → &#x60;closed&#x60; 2. &#x60;open&#x60; → &#x60;cancelled&#x60; 3. &#x60;closed&#x60; → &#x60;cancelled&#x60; or &#x60;partially_returned&#x60; 4. &#x60;partially_returned&#x60; → &#x60;cancelled&#x60;  For more information, see [Customer session states](https://docs.talon.one/docs/dev/concepts/entities#customer-session). 
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "open", value = "Indicates the current state of the session. Sessions can be created as `open` or `closed`. The state transitions are:  1. `open` → `closed` 2. `open` → `cancelled` 3. `closed` → `cancelled` or `partially_returned` 4. `partially_returned` → `cancelled`  For more information, see [Customer session states](https://docs.talon.one/docs/dev/concepts/entities#customer-session). ")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public NewCustomerSession cartItems(List<CartItem> cartItems) {
    
    this.cartItems = cartItems;
    return this;
  }

  public NewCustomerSession addCartItemsItem(CartItem cartItemsItem) {
    if (this.cartItems == null) {
      this.cartItems = new ArrayList<CartItem>();
    }
    this.cartItems.add(cartItemsItem);
    return this;
  }

   /**
   * Serialized JSON representation.
   * @return cartItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Serialized JSON representation.")

  public List<CartItem> getCartItems() {
    return cartItems;
  }


  public void setCartItems(List<CartItem> cartItems) {
    this.cartItems = cartItems;
  }


  public NewCustomerSession identifiers(List<String> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public NewCustomerSession addIdentifiersItem(String identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<String>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Session custom identifiers that you can set limits on or use inside your rules.  For example, you can use IP addresses as identifiers to potentially identify devices and limit discounts abuse in case of customers creating multiple accounts. See the [tutorial](https://docs.talon.one/docs/dev/tutorials/using-identifiers). 
   * @return identifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[91.11.156.141]", value = "Session custom identifiers that you can set limits on or use inside your rules.  For example, you can use IP addresses as identifiers to potentially identify devices and limit discounts abuse in case of customers creating multiple accounts. See the [tutorial](https://docs.talon.one/docs/dev/tutorials/using-identifiers). ")

  public List<String> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(List<String> identifiers) {
    this.identifiers = identifiers;
  }


  public NewCustomerSession total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total sum of the cart in one session.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total sum of the cart in one session.")

  public BigDecimal getTotal() {
    return total;
  }


  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public NewCustomerSession attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * A key-value map of the sessions attributes. The potentially valid attributes are configured in your accounts developer settings. 
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A key-value map of the sessions attributes. The potentially valid attributes are configured in your accounts developer settings. ")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCustomerSession newCustomerSession = (NewCustomerSession) o;
    return Objects.equals(this.profileId, newCustomerSession.profileId) &&
        Objects.equals(this.coupon, newCustomerSession.coupon) &&
        Objects.equals(this.referral, newCustomerSession.referral) &&
        Objects.equals(this.state, newCustomerSession.state) &&
        Objects.equals(this.cartItems, newCustomerSession.cartItems) &&
        Objects.equals(this.identifiers, newCustomerSession.identifiers) &&
        Objects.equals(this.total, newCustomerSession.total) &&
        Objects.equals(this.attributes, newCustomerSession.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileId, coupon, referral, state, cartItems, identifiers, total, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCustomerSession {\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
    sb.append("    referral: ").append(toIndentedString(referral)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    cartItems: ").append(toIndentedString(cartItems)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

