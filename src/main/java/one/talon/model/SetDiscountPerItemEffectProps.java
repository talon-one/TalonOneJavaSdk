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

/**
 * The properties specific to the &#x60;setDiscountPerItem&#x60; effect, triggered whenever a validated rule contained a \&quot;set per item discount\&quot; effect. This is a discount that will be applied either on a specific item, on a specific item + additional cost or on all additional costs per item. This depends on the chosen scope. 
 */
@ApiModel(description = "The properties specific to the `setDiscountPerItem` effect, triggered whenever a validated rule contained a \"set per item discount\" effect. This is a discount that will be applied either on a specific item, on a specific item + additional cost or on all additional costs per item. This depends on the chosen scope. ")

public class SetDiscountPerItemEffectProps {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private BigDecimal position;

  public static final String SERIALIZED_NAME_SUB_POSITION = "subPosition";
  @SerializedName(SERIALIZED_NAME_SUB_POSITION)
  private BigDecimal subPosition;

  public static final String SERIALIZED_NAME_DESIRED_VALUE = "desiredValue";
  @SerializedName(SERIALIZED_NAME_DESIRED_VALUE)
  private BigDecimal desiredValue;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT = "totalDiscount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT)
  private BigDecimal totalDiscount;

  public static final String SERIALIZED_NAME_DESIRED_TOTAL_DISCOUNT = "desiredTotalDiscount";
  @SerializedName(SERIALIZED_NAME_DESIRED_TOTAL_DISCOUNT)
  private BigDecimal desiredTotalDiscount;

  public static final String SERIALIZED_NAME_BUNDLE_INDEX = "bundleIndex";
  @SerializedName(SERIALIZED_NAME_BUNDLE_INDEX)
  private Long bundleIndex;

  public static final String SERIALIZED_NAME_BUNDLE_NAME = "bundleName";
  @SerializedName(SERIALIZED_NAME_BUNDLE_NAME)
  private String bundleName;

  public static final String SERIALIZED_NAME_TARGETED_ITEM_POSITION = "targetedItemPosition";
  @SerializedName(SERIALIZED_NAME_TARGETED_ITEM_POSITION)
  private BigDecimal targetedItemPosition;

  public static final String SERIALIZED_NAME_TARGETED_ITEM_SUB_POSITION = "targetedItemSubPosition";
  @SerializedName(SERIALIZED_NAME_TARGETED_ITEM_SUB_POSITION)
  private BigDecimal targetedItemSubPosition;


  public SetDiscountPerItemEffectProps name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the discount. Contains a hashtag character indicating the index of the position of the item the discount applies to. It is identical to the value of the &#x60;position&#x60; property. 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the discount. Contains a hashtag character indicating the index of the position of the item the discount applies to. It is identical to the value of the `position` property. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SetDiscountPerItemEffectProps value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * The total monetary value of the discount.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The total monetary value of the discount.")

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public SetDiscountPerItemEffectProps position(BigDecimal position) {
    
    this.position = position;
    return this;
  }

   /**
   * The index of the item in the cart items list on which this discount should be applied.
   * @return position
  **/
  @ApiModelProperty(required = true, value = "The index of the item in the cart items list on which this discount should be applied.")

  public BigDecimal getPosition() {
    return position;
  }


  public void setPosition(BigDecimal position) {
    this.position = position;
  }


  public SetDiscountPerItemEffectProps subPosition(BigDecimal subPosition) {
    
    this.subPosition = subPosition;
    return this;
  }

   /**
   * For cart items with &#x60;quantity&#x60; &gt; 1, the sub position indicates which item the discount applies to. 
   * @return subPosition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For cart items with `quantity` > 1, the sub position indicates which item the discount applies to. ")

  public BigDecimal getSubPosition() {
    return subPosition;
  }


  public void setSubPosition(BigDecimal subPosition) {
    this.subPosition = subPosition;
  }


  public SetDiscountPerItemEffectProps desiredValue(BigDecimal desiredValue) {
    
    this.desiredValue = desiredValue;
    return this;
  }

   /**
   * The original value of the discount.
   * @return desiredValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original value of the discount.")

  public BigDecimal getDesiredValue() {
    return desiredValue;
  }


  public void setDesiredValue(BigDecimal desiredValue) {
    this.desiredValue = desiredValue;
  }


  public SetDiscountPerItemEffectProps scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the discount: - &#x60;additionalCosts&#x60;: The discount applies to all the additional costs of the item. - &#x60;itemTotal&#x60;: The discount applies to the price of the item + the additional costs of the item. - &#x60;price&#x60;: The discount applies to the price of the item. 
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scope of the discount: - `additionalCosts`: The discount applies to all the additional costs of the item. - `itemTotal`: The discount applies to the price of the item + the additional costs of the item. - `price`: The discount applies to the price of the item. ")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public SetDiscountPerItemEffectProps totalDiscount(BigDecimal totalDiscount) {
    
    this.totalDiscount = totalDiscount;
    return this;
  }

   /**
   * The total discount given if this effect is a result of a prorated discount.
   * @return totalDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total discount given if this effect is a result of a prorated discount.")

  public BigDecimal getTotalDiscount() {
    return totalDiscount;
  }


  public void setTotalDiscount(BigDecimal totalDiscount) {
    this.totalDiscount = totalDiscount;
  }


  public SetDiscountPerItemEffectProps desiredTotalDiscount(BigDecimal desiredTotalDiscount) {
    
    this.desiredTotalDiscount = desiredTotalDiscount;
    return this;
  }

   /**
   * The original total discount to give if this effect is a result of a prorated discount.
   * @return desiredTotalDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original total discount to give if this effect is a result of a prorated discount.")

  public BigDecimal getDesiredTotalDiscount() {
    return desiredTotalDiscount;
  }


  public void setDesiredTotalDiscount(BigDecimal desiredTotalDiscount) {
    this.desiredTotalDiscount = desiredTotalDiscount;
  }


  public SetDiscountPerItemEffectProps bundleIndex(Long bundleIndex) {
    
    this.bundleIndex = bundleIndex;
    return this;
  }

   /**
   * The position of the bundle in a list of item bundles created from the same bundle definition.
   * @return bundleIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The position of the bundle in a list of item bundles created from the same bundle definition.")

  public Long getBundleIndex() {
    return bundleIndex;
  }


  public void setBundleIndex(Long bundleIndex) {
    this.bundleIndex = bundleIndex;
  }


  public SetDiscountPerItemEffectProps bundleName(String bundleName) {
    
    this.bundleName = bundleName;
    return this;
  }

   /**
   * The name of the bundle definition.
   * @return bundleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the bundle definition.")

  public String getBundleName() {
    return bundleName;
  }


  public void setBundleName(String bundleName) {
    this.bundleName = bundleName;
  }


  public SetDiscountPerItemEffectProps targetedItemPosition(BigDecimal targetedItemPosition) {
    
    this.targetedItemPosition = targetedItemPosition;
    return this;
  }

   /**
   * The index of the targeted bundle item on which the applied discount is based.
   * @return targetedItemPosition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the targeted bundle item on which the applied discount is based.")

  public BigDecimal getTargetedItemPosition() {
    return targetedItemPosition;
  }


  public void setTargetedItemPosition(BigDecimal targetedItemPosition) {
    this.targetedItemPosition = targetedItemPosition;
  }


  public SetDiscountPerItemEffectProps targetedItemSubPosition(BigDecimal targetedItemSubPosition) {
    
    this.targetedItemSubPosition = targetedItemSubPosition;
    return this;
  }

   /**
   * The sub-position of the targeted bundle item on which the applied discount is based. 
   * @return targetedItemSubPosition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sub-position of the targeted bundle item on which the applied discount is based. ")

  public BigDecimal getTargetedItemSubPosition() {
    return targetedItemSubPosition;
  }


  public void setTargetedItemSubPosition(BigDecimal targetedItemSubPosition) {
    this.targetedItemSubPosition = targetedItemSubPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDiscountPerItemEffectProps setDiscountPerItemEffectProps = (SetDiscountPerItemEffectProps) o;
    return Objects.equals(this.name, setDiscountPerItemEffectProps.name) &&
        Objects.equals(this.value, setDiscountPerItemEffectProps.value) &&
        Objects.equals(this.position, setDiscountPerItemEffectProps.position) &&
        Objects.equals(this.subPosition, setDiscountPerItemEffectProps.subPosition) &&
        Objects.equals(this.desiredValue, setDiscountPerItemEffectProps.desiredValue) &&
        Objects.equals(this.scope, setDiscountPerItemEffectProps.scope) &&
        Objects.equals(this.totalDiscount, setDiscountPerItemEffectProps.totalDiscount) &&
        Objects.equals(this.desiredTotalDiscount, setDiscountPerItemEffectProps.desiredTotalDiscount) &&
        Objects.equals(this.bundleIndex, setDiscountPerItemEffectProps.bundleIndex) &&
        Objects.equals(this.bundleName, setDiscountPerItemEffectProps.bundleName) &&
        Objects.equals(this.targetedItemPosition, setDiscountPerItemEffectProps.targetedItemPosition) &&
        Objects.equals(this.targetedItemSubPosition, setDiscountPerItemEffectProps.targetedItemSubPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, position, subPosition, desiredValue, scope, totalDiscount, desiredTotalDiscount, bundleIndex, bundleName, targetedItemPosition, targetedItemSubPosition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDiscountPerItemEffectProps {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    subPosition: ").append(toIndentedString(subPosition)).append("\n");
    sb.append("    desiredValue: ").append(toIndentedString(desiredValue)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    desiredTotalDiscount: ").append(toIndentedString(desiredTotalDiscount)).append("\n");
    sb.append("    bundleIndex: ").append(toIndentedString(bundleIndex)).append("\n");
    sb.append("    bundleName: ").append(toIndentedString(bundleName)).append("\n");
    sb.append("    targetedItemPosition: ").append(toIndentedString(targetedItemPosition)).append("\n");
    sb.append("    targetedItemSubPosition: ").append(toIndentedString(targetedItemSubPosition)).append("\n");
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

