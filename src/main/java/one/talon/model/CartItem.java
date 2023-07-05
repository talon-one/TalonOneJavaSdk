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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import one.talon.model.AdditionalCost;

/**
 * CartItem
 */

public class CartItem {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_RETURNED_QUANTITY = "returnedQuantity";
  @SerializedName(SERIALIZED_NAME_RETURNED_QUANTITY)
  private Integer returnedQuantity;

  public static final String SERIALIZED_NAME_REMAINING_QUANTITY = "remainingQuantity";
  @SerializedName(SERIALIZED_NAME_REMAINING_QUANTITY)
  private Integer remainingQuantity;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private BigDecimal weight;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private BigDecimal height;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private BigDecimal width;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private BigDecimal length;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private BigDecimal position;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_ADDITIONAL_COSTS = "additionalCosts";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_COSTS)
  private Map<String, AdditionalCost> additionalCosts = null;

  public static final String SERIALIZED_NAME_CATALOG_ITEM_I_D = "catalogItemID";
  @SerializedName(SERIALIZED_NAME_CATALOG_ITEM_I_D)
  private Integer catalogItemID;


  public CartItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of item.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Air Glide", value = "Name of item.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CartItem sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Stock keeping unit of item.
   * @return sku
  **/
  @ApiModelProperty(example = "SKU1241028", required = true, value = "Stock keeping unit of item.")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public CartItem quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity of item. **Important:** If you enabled [cart item flattening](https://docs.talon.one/docs/product/campaigns/managing-general-settings#flattening), the quantity is always one and the same cart item might receive multiple per-item discounts. Ensure you can process multiple discounts on one cart item correctly. 
   * minimum: 1
   * @return quantity
  **/
  @ApiModelProperty(example = "1", required = true, value = "Quantity of item. **Important:** If you enabled [cart item flattening](https://docs.talon.one/docs/product/campaigns/managing-general-settings#flattening), the quantity is always one and the same cart item might receive multiple per-item discounts. Ensure you can process multiple discounts on one cart item correctly. ")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public CartItem returnedQuantity(Integer returnedQuantity) {
    
    this.returnedQuantity = returnedQuantity;
    return this;
  }

   /**
   * Number of returned items, calculated internally based on returns of this item.
   * @return returnedQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Number of returned items, calculated internally based on returns of this item.")

  public Integer getReturnedQuantity() {
    return returnedQuantity;
  }


  public void setReturnedQuantity(Integer returnedQuantity) {
    this.returnedQuantity = returnedQuantity;
  }


  public CartItem remainingQuantity(Integer remainingQuantity) {
    
    this.remainingQuantity = remainingQuantity;
    return this;
  }

   /**
   * Remaining quantity of the item, calculated internally based on returns of this item.
   * @return remainingQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Remaining quantity of the item, calculated internally based on returns of this item.")

  public Integer getRemainingQuantity() {
    return remainingQuantity;
  }


  public void setRemainingQuantity(Integer remainingQuantity) {
    this.remainingQuantity = remainingQuantity;
  }


  public CartItem price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Price of the item in the currency defined by your Application. This field is required if this item is not part of a [catalog](https://docs.talon.one/docs/product/account/dev-tools/managing-cart-item-catalogs). If it is part of a catalog, setting a price here overrides the price from the catalog. 
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99.99", value = "Price of the item in the currency defined by your Application. This field is required if this item is not part of a [catalog](https://docs.talon.one/docs/product/account/dev-tools/managing-cart-item-catalogs). If it is part of a catalog, setting a price here overrides the price from the catalog. ")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public CartItem category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Type, group or model of the item.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "shoes", value = "Type, group or model of the item.")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public CartItem weight(BigDecimal weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Weight of item in grams.
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1130.0", value = "Weight of item in grams.")

  public BigDecimal getWeight() {
    return weight;
  }


  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  public CartItem height(BigDecimal height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height of item in mm.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Height of item in mm.")

  public BigDecimal getHeight() {
    return height;
  }


  public void setHeight(BigDecimal height) {
    this.height = height;
  }


  public CartItem width(BigDecimal width) {
    
    this.width = width;
    return this;
  }

   /**
   * Width of item in mm.
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Width of item in mm.")

  public BigDecimal getWidth() {
    return width;
  }


  public void setWidth(BigDecimal width) {
    this.width = width;
  }


  public CartItem length(BigDecimal length) {
    
    this.length = length;
    return this;
  }

   /**
   * Length of item in mm.
   * @return length
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Length of item in mm.")

  public BigDecimal getLength() {
    return length;
  }


  public void setLength(BigDecimal length) {
    this.length = length;
  }


  public CartItem position(BigDecimal position) {
    
    this.position = position;
    return this;
  }

   /**
   * Position of the Cart Item in the Cart (calculated internally).
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Position of the Cart Item in the Cart (calculated internally).")

  public BigDecimal getPosition() {
    return position;
  }


  public void setPosition(BigDecimal position) {
    this.position = position;
  }


  public CartItem attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Use this property to set a value for the attributes of your choice. [Attributes](https://docs.talon.one/docs/dev/concepts/attributes) represent any information to attach to this cart item.  Custom _cart item_ attributes must be created in the Campaign Manager before you set them with this property. 
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"image\":\"11.jpeg\",\"material\":\"leather\"}", value = "Use this property to set a value for the attributes of your choice. [Attributes](https://docs.talon.one/docs/dev/concepts/attributes) represent any information to attach to this cart item.  Custom _cart item_ attributes must be created in the Campaign Manager before you set them with this property. ")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public CartItem additionalCosts(Map<String, AdditionalCost> additionalCosts) {
    
    this.additionalCosts = additionalCosts;
    return this;
  }

  public CartItem putAdditionalCostsItem(String key, AdditionalCost additionalCostsItem) {
    if (this.additionalCosts == null) {
      this.additionalCosts = new HashMap<String, AdditionalCost>();
    }
    this.additionalCosts.put(key, additionalCostsItem);
    return this;
  }

   /**
   * Use this property to set a value for the additional costs of this item, such as a shipping cost. They must be created in the Campaign Manager before you set them with this property. See [Managing additional costs](https://docs.talon.one/docs/product/account/dev-tools/managing-additional-costs). 
   * @return additionalCosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"shipping\":{\"price\":9}}", value = "Use this property to set a value for the additional costs of this item, such as a shipping cost. They must be created in the Campaign Manager before you set them with this property. See [Managing additional costs](https://docs.talon.one/docs/product/account/dev-tools/managing-additional-costs). ")

  public Map<String, AdditionalCost> getAdditionalCosts() {
    return additionalCosts;
  }


  public void setAdditionalCosts(Map<String, AdditionalCost> additionalCosts) {
    this.additionalCosts = additionalCosts;
  }


  public CartItem catalogItemID(Integer catalogItemID) {
    
    this.catalogItemID = catalogItemID;
    return this;
  }

   /**
   * The [catalog item ID](https://docs.talon.one/docs/product/account/dev-tools/managing-cart-item-catalogs/#synchronizing-cart-item-catalogs).
   * @return catalogItemID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [catalog item ID](https://docs.talon.one/docs/product/account/dev-tools/managing-cart-item-catalogs/#synchronizing-cart-item-catalogs).")

  public Integer getCatalogItemID() {
    return catalogItemID;
  }


  public void setCatalogItemID(Integer catalogItemID) {
    this.catalogItemID = catalogItemID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItem cartItem = (CartItem) o;
    return Objects.equals(this.name, cartItem.name) &&
        Objects.equals(this.sku, cartItem.sku) &&
        Objects.equals(this.quantity, cartItem.quantity) &&
        Objects.equals(this.returnedQuantity, cartItem.returnedQuantity) &&
        Objects.equals(this.remainingQuantity, cartItem.remainingQuantity) &&
        Objects.equals(this.price, cartItem.price) &&
        Objects.equals(this.category, cartItem.category) &&
        Objects.equals(this.weight, cartItem.weight) &&
        Objects.equals(this.height, cartItem.height) &&
        Objects.equals(this.width, cartItem.width) &&
        Objects.equals(this.length, cartItem.length) &&
        Objects.equals(this.position, cartItem.position) &&
        Objects.equals(this.attributes, cartItem.attributes) &&
        Objects.equals(this.additionalCosts, cartItem.additionalCosts) &&
        Objects.equals(this.catalogItemID, cartItem.catalogItemID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sku, quantity, returnedQuantity, remainingQuantity, price, category, weight, height, width, length, position, attributes, additionalCosts, catalogItemID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    returnedQuantity: ").append(toIndentedString(returnedQuantity)).append("\n");
    sb.append("    remainingQuantity: ").append(toIndentedString(remainingQuantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    additionalCosts: ").append(toIndentedString(additionalCosts)).append("\n");
    sb.append("    catalogItemID: ").append(toIndentedString(catalogItemID)).append("\n");
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

