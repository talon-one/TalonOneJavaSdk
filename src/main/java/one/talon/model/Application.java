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
import one.talon.model.AttributesSettings;
import one.talon.model.LimitConfig;
import one.talon.model.LoyaltyProgram;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Application {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  /**
   * The case sensitivity behavior to check coupon codes in the campaigns of this Application.
   */
  @JsonAdapter(CaseSensitivityEnum.Adapter.class)
  public enum CaseSensitivityEnum {
    SENSITIVE("sensitive"),
    
    INSENSITIVE_UPPERCASE("insensitive-uppercase"),
    
    INSENSITIVE_LOWERCASE("insensitive-lowercase");

    private String value;

    CaseSensitivityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CaseSensitivityEnum fromValue(String value) {
      for (CaseSensitivityEnum b : CaseSensitivityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CaseSensitivityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CaseSensitivityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CaseSensitivityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CaseSensitivityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CASE_SENSITIVITY = "caseSensitivity";
  @SerializedName(SERIALIZED_NAME_CASE_SENSITIVITY)
  private CaseSensitivityEnum caseSensitivity;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private List<LimitConfig> limits = null;

  /**
   * The default scope to apply &#x60;setDiscount&#x60; effects on if no scope was provided with the effect. 
   */
  @JsonAdapter(DefaultDiscountScopeEnum.Adapter.class)
  public enum DefaultDiscountScopeEnum {
    SESSIONTOTAL("sessionTotal"),
    
    CARTITEMS("cartItems"),
    
    ADDITIONALCOSTS("additionalCosts");

    private String value;

    DefaultDiscountScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultDiscountScopeEnum fromValue(String value) {
      for (DefaultDiscountScopeEnum b : DefaultDiscountScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DefaultDiscountScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultDiscountScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultDiscountScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DefaultDiscountScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEFAULT_DISCOUNT_SCOPE = "defaultDiscountScope";
  @SerializedName(SERIALIZED_NAME_DEFAULT_DISCOUNT_SCOPE)
  private DefaultDiscountScopeEnum defaultDiscountScope;

  public static final String SERIALIZED_NAME_ENABLE_CASCADING_DISCOUNTS = "enableCascadingDiscounts";
  @SerializedName(SERIALIZED_NAME_ENABLE_CASCADING_DISCOUNTS)
  private Boolean enableCascadingDiscounts;

  public static final String SERIALIZED_NAME_ENABLE_FLATTENED_CART_ITEMS = "enableFlattenedCartItems";
  @SerializedName(SERIALIZED_NAME_ENABLE_FLATTENED_CART_ITEMS)
  private Boolean enableFlattenedCartItems;

  public static final String SERIALIZED_NAME_ATTRIBUTES_SETTINGS = "attributesSettings";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES_SETTINGS)
  private AttributesSettings attributesSettings;

  public static final String SERIALIZED_NAME_SANDBOX = "sandbox";
  @SerializedName(SERIALIZED_NAME_SANDBOX)
  private Boolean sandbox;

  public static final String SERIALIZED_NAME_ENABLE_PARTIAL_DISCOUNTS = "enablePartialDiscounts";
  @SerializedName(SERIALIZED_NAME_ENABLE_PARTIAL_DISCOUNTS)
  private Boolean enablePartialDiscounts;

  /**
   * The default scope to apply &#x60;setDiscountPerItem&#x60; effects on if no scope was provided with the effect. 
   */
  @JsonAdapter(DefaultDiscountAdditionalCostPerItemScopeEnum.Adapter.class)
  public enum DefaultDiscountAdditionalCostPerItemScopeEnum {
    PRICE("price"),
    
    ITEMTOTAL("itemTotal"),
    
    ADDITIONALCOSTS("additionalCosts");

    private String value;

    DefaultDiscountAdditionalCostPerItemScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultDiscountAdditionalCostPerItemScopeEnum fromValue(String value) {
      for (DefaultDiscountAdditionalCostPerItemScopeEnum b : DefaultDiscountAdditionalCostPerItemScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DefaultDiscountAdditionalCostPerItemScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultDiscountAdditionalCostPerItemScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultDiscountAdditionalCostPerItemScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DefaultDiscountAdditionalCostPerItemScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEFAULT_DISCOUNT_ADDITIONAL_COST_PER_ITEM_SCOPE = "defaultDiscountAdditionalCostPerItemScope";
  @SerializedName(SERIALIZED_NAME_DEFAULT_DISCOUNT_ADDITIONAL_COST_PER_ITEM_SCOPE)
  private DefaultDiscountAdditionalCostPerItemScopeEnum defaultDiscountAdditionalCostPerItemScope;

  public static final String SERIALIZED_NAME_DEFAULT_EVALUATION_GROUP_ID = "defaultEvaluationGroupId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_EVALUATION_GROUP_ID)
  private Integer defaultEvaluationGroupId;

  public static final String SERIALIZED_NAME_LOYALTY_PROGRAMS = "loyaltyPrograms";
  @SerializedName(SERIALIZED_NAME_LOYALTY_PROGRAMS)
  private List<LoyaltyProgram> loyaltyPrograms = new ArrayList<LoyaltyProgram>();


  public Application id(Integer id) {
    
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


  public Application created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The time this entity was created.
   * @return created
  **/
  @ApiModelProperty(example = "2020-06-10T09:05:27.993483Z", required = true, value = "The time this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Application modified(OffsetDateTime modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * The time this entity was last modified.
   * @return modified
  **/
  @ApiModelProperty(example = "2021-09-12T10:12:42Z", required = true, value = "The time this entity was last modified.")

  public OffsetDateTime getModified() {
    return modified;
  }


  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  public Application accountId(Integer accountId) {
    
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


  public Application name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this application.
   * @return name
  **/
  @ApiModelProperty(example = "My Application", required = true, value = "The name of this application.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Application description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A longer description of the application.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A test Application", value = "A longer description of the application.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Application timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * A string containing an IANA timezone descriptor.
   * @return timezone
  **/
  @ApiModelProperty(example = "Europe/Berlin", required = true, value = "A string containing an IANA timezone descriptor.")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public Application currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The default currency for new customer sessions.
   * @return currency
  **/
  @ApiModelProperty(example = "EUR", required = true, value = "The default currency for new customer sessions.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Application caseSensitivity(CaseSensitivityEnum caseSensitivity) {
    
    this.caseSensitivity = caseSensitivity;
    return this;
  }

   /**
   * The case sensitivity behavior to check coupon codes in the campaigns of this Application.
   * @return caseSensitivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sensitive", value = "The case sensitivity behavior to check coupon codes in the campaigns of this Application.")

  public CaseSensitivityEnum getCaseSensitivity() {
    return caseSensitivity;
  }


  public void setCaseSensitivity(CaseSensitivityEnum caseSensitivity) {
    this.caseSensitivity = caseSensitivity;
  }


  public Application attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this campaign.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary properties associated with this campaign.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public Application limits(List<LimitConfig> limits) {
    
    this.limits = limits;
    return this;
  }

  public Application addLimitsItem(LimitConfig limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<LimitConfig>();
    }
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * Default limits for campaigns created in this application.
   * @return limits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default limits for campaigns created in this application.")

  public List<LimitConfig> getLimits() {
    return limits;
  }


  public void setLimits(List<LimitConfig> limits) {
    this.limits = limits;
  }


  public Application defaultDiscountScope(DefaultDiscountScopeEnum defaultDiscountScope) {
    
    this.defaultDiscountScope = defaultDiscountScope;
    return this;
  }

   /**
   * The default scope to apply &#x60;setDiscount&#x60; effects on if no scope was provided with the effect. 
   * @return defaultDiscountScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sessionTotal", value = "The default scope to apply `setDiscount` effects on if no scope was provided with the effect. ")

  public DefaultDiscountScopeEnum getDefaultDiscountScope() {
    return defaultDiscountScope;
  }


  public void setDefaultDiscountScope(DefaultDiscountScopeEnum defaultDiscountScope) {
    this.defaultDiscountScope = defaultDiscountScope;
  }


  public Application enableCascadingDiscounts(Boolean enableCascadingDiscounts) {
    
    this.enableCascadingDiscounts = enableCascadingDiscounts;
    return this;
  }

   /**
   * Indicates if discounts should cascade for this Application.
   * @return enableCascadingDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if discounts should cascade for this Application.")

  public Boolean getEnableCascadingDiscounts() {
    return enableCascadingDiscounts;
  }


  public void setEnableCascadingDiscounts(Boolean enableCascadingDiscounts) {
    this.enableCascadingDiscounts = enableCascadingDiscounts;
  }


  public Application enableFlattenedCartItems(Boolean enableFlattenedCartItems) {
    
    this.enableFlattenedCartItems = enableFlattenedCartItems;
    return this;
  }

   /**
   * Indicates if cart items of quantity larger than one should be separated into different items of quantity one. 
   * @return enableFlattenedCartItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if cart items of quantity larger than one should be separated into different items of quantity one. ")

  public Boolean getEnableFlattenedCartItems() {
    return enableFlattenedCartItems;
  }


  public void setEnableFlattenedCartItems(Boolean enableFlattenedCartItems) {
    this.enableFlattenedCartItems = enableFlattenedCartItems;
  }


  public Application attributesSettings(AttributesSettings attributesSettings) {
    
    this.attributesSettings = attributesSettings;
    return this;
  }

   /**
   * Get attributesSettings
   * @return attributesSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttributesSettings getAttributesSettings() {
    return attributesSettings;
  }


  public void setAttributesSettings(AttributesSettings attributesSettings) {
    this.attributesSettings = attributesSettings;
  }


  public Application sandbox(Boolean sandbox) {
    
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Indicates if this is a live or sandbox Application.
   * @return sandbox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if this is a live or sandbox Application.")

  public Boolean getSandbox() {
    return sandbox;
  }


  public void setSandbox(Boolean sandbox) {
    this.sandbox = sandbox;
  }


  public Application enablePartialDiscounts(Boolean enablePartialDiscounts) {
    
    this.enablePartialDiscounts = enablePartialDiscounts;
    return this;
  }

   /**
   * Indicates if this Application supports partial discounts.
   * @return enablePartialDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates if this Application supports partial discounts.")

  public Boolean getEnablePartialDiscounts() {
    return enablePartialDiscounts;
  }


  public void setEnablePartialDiscounts(Boolean enablePartialDiscounts) {
    this.enablePartialDiscounts = enablePartialDiscounts;
  }


  public Application defaultDiscountAdditionalCostPerItemScope(DefaultDiscountAdditionalCostPerItemScopeEnum defaultDiscountAdditionalCostPerItemScope) {
    
    this.defaultDiscountAdditionalCostPerItemScope = defaultDiscountAdditionalCostPerItemScope;
    return this;
  }

   /**
   * The default scope to apply &#x60;setDiscountPerItem&#x60; effects on if no scope was provided with the effect. 
   * @return defaultDiscountAdditionalCostPerItemScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "price", value = "The default scope to apply `setDiscountPerItem` effects on if no scope was provided with the effect. ")

  public DefaultDiscountAdditionalCostPerItemScopeEnum getDefaultDiscountAdditionalCostPerItemScope() {
    return defaultDiscountAdditionalCostPerItemScope;
  }


  public void setDefaultDiscountAdditionalCostPerItemScope(DefaultDiscountAdditionalCostPerItemScopeEnum defaultDiscountAdditionalCostPerItemScope) {
    this.defaultDiscountAdditionalCostPerItemScope = defaultDiscountAdditionalCostPerItemScope;
  }


  public Application defaultEvaluationGroupId(Integer defaultEvaluationGroupId) {
    
    this.defaultEvaluationGroupId = defaultEvaluationGroupId;
    return this;
  }

   /**
   * The ID of the default campaign evaluation group to which new campaigns will be added unless a different group is selected when creating the campaign.
   * @return defaultEvaluationGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The ID of the default campaign evaluation group to which new campaigns will be added unless a different group is selected when creating the campaign.")

  public Integer getDefaultEvaluationGroupId() {
    return defaultEvaluationGroupId;
  }


  public void setDefaultEvaluationGroupId(Integer defaultEvaluationGroupId) {
    this.defaultEvaluationGroupId = defaultEvaluationGroupId;
  }


  public Application loyaltyPrograms(List<LoyaltyProgram> loyaltyPrograms) {
    
    this.loyaltyPrograms = loyaltyPrograms;
    return this;
  }

  public Application addLoyaltyProgramsItem(LoyaltyProgram loyaltyProgramsItem) {
    this.loyaltyPrograms.add(loyaltyProgramsItem);
    return this;
  }

   /**
   * An array containing all the loyalty programs to which this application is subscribed.
   * @return loyaltyPrograms
  **/
  @ApiModelProperty(required = true, value = "An array containing all the loyalty programs to which this application is subscribed.")

  public List<LoyaltyProgram> getLoyaltyPrograms() {
    return loyaltyPrograms;
  }


  public void setLoyaltyPrograms(List<LoyaltyProgram> loyaltyPrograms) {
    this.loyaltyPrograms = loyaltyPrograms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application application = (Application) o;
    return Objects.equals(this.id, application.id) &&
        Objects.equals(this.created, application.created) &&
        Objects.equals(this.modified, application.modified) &&
        Objects.equals(this.accountId, application.accountId) &&
        Objects.equals(this.name, application.name) &&
        Objects.equals(this.description, application.description) &&
        Objects.equals(this.timezone, application.timezone) &&
        Objects.equals(this.currency, application.currency) &&
        Objects.equals(this.caseSensitivity, application.caseSensitivity) &&
        Objects.equals(this.attributes, application.attributes) &&
        Objects.equals(this.limits, application.limits) &&
        Objects.equals(this.defaultDiscountScope, application.defaultDiscountScope) &&
        Objects.equals(this.enableCascadingDiscounts, application.enableCascadingDiscounts) &&
        Objects.equals(this.enableFlattenedCartItems, application.enableFlattenedCartItems) &&
        Objects.equals(this.attributesSettings, application.attributesSettings) &&
        Objects.equals(this.sandbox, application.sandbox) &&
        Objects.equals(this.enablePartialDiscounts, application.enablePartialDiscounts) &&
        Objects.equals(this.defaultDiscountAdditionalCostPerItemScope, application.defaultDiscountAdditionalCostPerItemScope) &&
        Objects.equals(this.defaultEvaluationGroupId, application.defaultEvaluationGroupId) &&
        Objects.equals(this.loyaltyPrograms, application.loyaltyPrograms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, modified, accountId, name, description, timezone, currency, caseSensitivity, attributes, limits, defaultDiscountScope, enableCascadingDiscounts, enableFlattenedCartItems, attributesSettings, sandbox, enablePartialDiscounts, defaultDiscountAdditionalCostPerItemScope, defaultEvaluationGroupId, loyaltyPrograms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    caseSensitivity: ").append(toIndentedString(caseSensitivity)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    defaultDiscountScope: ").append(toIndentedString(defaultDiscountScope)).append("\n");
    sb.append("    enableCascadingDiscounts: ").append(toIndentedString(enableCascadingDiscounts)).append("\n");
    sb.append("    enableFlattenedCartItems: ").append(toIndentedString(enableFlattenedCartItems)).append("\n");
    sb.append("    attributesSettings: ").append(toIndentedString(attributesSettings)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    enablePartialDiscounts: ").append(toIndentedString(enablePartialDiscounts)).append("\n");
    sb.append("    defaultDiscountAdditionalCostPerItemScope: ").append(toIndentedString(defaultDiscountAdditionalCostPerItemScope)).append("\n");
    sb.append("    defaultEvaluationGroupId: ").append(toIndentedString(defaultEvaluationGroupId)).append("\n");
    sb.append("    loyaltyPrograms: ").append(toIndentedString(loyaltyPrograms)).append("\n");
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

