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
import one.talon.model.CartItem;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ApplicationSession {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private Integer profileId;

  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integrationId";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_PROFILEINTEGRATIONID = "profileintegrationid";
  @SerializedName(SERIALIZED_NAME_PROFILEINTEGRATIONID)
  private String profileintegrationid;

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
  private StateEnum state;

  public static final String SERIALIZED_NAME_CART_ITEMS = "cartItems";
  @SerializedName(SERIALIZED_NAME_CART_ITEMS)
  private List<CartItem> cartItems = new ArrayList<CartItem>();

  public static final String SERIALIZED_NAME_DISCOUNTS = "discounts";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS)
  private Map<String, BigDecimal> discounts = new HashMap<String, BigDecimal>();

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNTS = "totalDiscounts";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNTS)
  private BigDecimal totalDiscounts;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;


  public ApplicationSession id(Integer id) {
    
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


  public ApplicationSession created(OffsetDateTime created) {
    
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


  public ApplicationSession applicationId(Integer applicationId) {
    
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


  public ApplicationSession profileId(Integer profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * The globally unique Talon.One ID of the customer that created this entity.
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "138", value = "The globally unique Talon.One ID of the customer that created this entity.")

  public Integer getProfileId() {
    return profileId;
  }


  public void setProfileId(Integer profileId) {
    this.profileId = profileId;
  }


  public ApplicationSession integrationId(String integrationId) {
    
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


  public ApplicationSession profileintegrationid(String profileintegrationid) {
    
    this.profileintegrationid = profileintegrationid;
    return this;
  }

   /**
   * Integration ID of the customer for the session.
   * @return profileintegrationid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "382370BKDB946", value = "Integration ID of the customer for the session.")

  public String getProfileintegrationid() {
    return profileintegrationid;
  }


  public void setProfileintegrationid(String profileintegrationid) {
    this.profileintegrationid = profileintegrationid;
  }


  public ApplicationSession coupon(String coupon) {
    
    this.coupon = coupon;
    return this;
  }

   /**
   * Any coupon code entered.
   * @return coupon
  **/
  @ApiModelProperty(example = "BKDB946", required = true, value = "Any coupon code entered.")

  public String getCoupon() {
    return coupon;
  }


  public void setCoupon(String coupon) {
    this.coupon = coupon;
  }


  public ApplicationSession referral(String referral) {
    
    this.referral = referral;
    return this;
  }

   /**
   * Any referral code entered.
   * @return referral
  **/
  @ApiModelProperty(example = "BKDB946", required = true, value = "Any referral code entered.")

  public String getReferral() {
    return referral;
  }


  public void setReferral(String referral) {
    this.referral = referral;
  }


  public ApplicationSession state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Indicates the current state of the session. Sessions can be created as &#x60;open&#x60; or &#x60;closed&#x60;. The state transitions are:  1. &#x60;open&#x60; → &#x60;closed&#x60; 2. &#x60;open&#x60; → &#x60;cancelled&#x60; 3. &#x60;closed&#x60; → &#x60;cancelled&#x60; or &#x60;partially_returned&#x60; 4. &#x60;partially_returned&#x60; → &#x60;cancelled&#x60;  For more information, see [Customer session states](https://docs.talon.one/docs/dev/concepts/entities#customer-session). 
   * @return state
  **/
  @ApiModelProperty(example = "closed", required = true, value = "Indicates the current state of the session. Sessions can be created as `open` or `closed`. The state transitions are:  1. `open` → `closed` 2. `open` → `cancelled` 3. `closed` → `cancelled` or `partially_returned` 4. `partially_returned` → `cancelled`  For more information, see [Customer session states](https://docs.talon.one/docs/dev/concepts/entities#customer-session). ")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public ApplicationSession cartItems(List<CartItem> cartItems) {
    
    this.cartItems = cartItems;
    return this;
  }

  public ApplicationSession addCartItemsItem(CartItem cartItemsItem) {
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


  public ApplicationSession discounts(Map<String, BigDecimal> discounts) {
    
    this.discounts = discounts;
    return this;
  }

  public ApplicationSession putDiscountsItem(String key, BigDecimal discountsItem) {
    this.discounts.put(key, discountsItem);
    return this;
  }

   /**
   * **API V1 only.** A map of labeled discount values, in the same currency as the session.  If you are using the V2 endpoints, refer to the &#x60;totalDiscounts&#x60; property instead. 
   * @return discounts
  **/
  @ApiModelProperty(required = true, value = "**API V1 only.** A map of labeled discount values, in the same currency as the session.  If you are using the V2 endpoints, refer to the `totalDiscounts` property instead. ")

  public Map<String, BigDecimal> getDiscounts() {
    return discounts;
  }


  public void setDiscounts(Map<String, BigDecimal> discounts) {
    this.discounts = discounts;
  }


  public ApplicationSession totalDiscounts(BigDecimal totalDiscounts) {
    
    this.totalDiscounts = totalDiscounts;
    return this;
  }

   /**
   * The total sum of the discounts applied to this session.
   * @return totalDiscounts
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "The total sum of the discounts applied to this session.")

  public BigDecimal getTotalDiscounts() {
    return totalDiscounts;
  }


  public void setTotalDiscounts(BigDecimal totalDiscounts) {
    this.totalDiscounts = totalDiscounts;
  }


  public ApplicationSession total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total sum of the session before any discounts applied.
   * @return total
  **/
  @ApiModelProperty(example = "200.0", required = true, value = "The total sum of the session before any discounts applied.")

  public BigDecimal getTotal() {
    return total;
  }


  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public ApplicationSession attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this item.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary properties associated with this item.")

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
    ApplicationSession applicationSession = (ApplicationSession) o;
    return Objects.equals(this.id, applicationSession.id) &&
        Objects.equals(this.created, applicationSession.created) &&
        Objects.equals(this.applicationId, applicationSession.applicationId) &&
        Objects.equals(this.profileId, applicationSession.profileId) &&
        Objects.equals(this.integrationId, applicationSession.integrationId) &&
        Objects.equals(this.profileintegrationid, applicationSession.profileintegrationid) &&
        Objects.equals(this.coupon, applicationSession.coupon) &&
        Objects.equals(this.referral, applicationSession.referral) &&
        Objects.equals(this.state, applicationSession.state) &&
        Objects.equals(this.cartItems, applicationSession.cartItems) &&
        Objects.equals(this.discounts, applicationSession.discounts) &&
        Objects.equals(this.totalDiscounts, applicationSession.totalDiscounts) &&
        Objects.equals(this.total, applicationSession.total) &&
        Objects.equals(this.attributes, applicationSession.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, applicationId, profileId, integrationId, profileintegrationid, coupon, referral, state, cartItems, discounts, totalDiscounts, total, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSession {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    profileintegrationid: ").append(toIndentedString(profileintegrationid)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
    sb.append("    referral: ").append(toIndentedString(referral)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    cartItems: ").append(toIndentedString(cartItems)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    totalDiscounts: ").append(toIndentedString(totalDiscounts)).append("\n");
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

