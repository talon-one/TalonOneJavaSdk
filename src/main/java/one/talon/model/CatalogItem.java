/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSessionV2](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
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
import one.talon.model.ItemAttribute;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class CatalogItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_CATALOGID = "catalogid";
  @SerializedName(SERIALIZED_NAME_CATALOGID)
  private Integer catalogid;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<ItemAttribute> attributes = null;


  public CatalogItem id(Integer id) {
    
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


  public CatalogItem created(OffsetDateTime created) {
    
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


  public CatalogItem sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * The stock keeping unit of the item.
   * @return sku
  **/
  @ApiModelProperty(example = "SKU1241028", required = true, value = "The stock keeping unit of the item.")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public CatalogItem price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Price of the item.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99.99", value = "Price of the item.")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public CatalogItem catalogid(Integer catalogid) {
    
    this.catalogid = catalogid;
    return this;
  }

   /**
   * The ID of the catalog the item belongs to.
   * @return catalogid
  **/
  @ApiModelProperty(example = "6", required = true, value = "The ID of the catalog the item belongs to.")

  public Integer getCatalogid() {
    return catalogid;
  }


  public void setCatalogid(Integer catalogid) {
    this.catalogid = catalogid;
  }


  public CatalogItem version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the catalog item.
   * minimum: 1
   * @return version
  **/
  @ApiModelProperty(example = "5", required = true, value = "The version of the catalog item.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public CatalogItem attributes(List<ItemAttribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public CatalogItem addAttributesItem(ItemAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<ItemAttribute>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ItemAttribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<ItemAttribute> attributes) {
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
    CatalogItem catalogItem = (CatalogItem) o;
    return Objects.equals(this.id, catalogItem.id) &&
        Objects.equals(this.created, catalogItem.created) &&
        Objects.equals(this.sku, catalogItem.sku) &&
        Objects.equals(this.price, catalogItem.price) &&
        Objects.equals(this.catalogid, catalogItem.catalogid) &&
        Objects.equals(this.version, catalogItem.version) &&
        Objects.equals(this.attributes, catalogItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, sku, price, catalogid, version, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    catalogid: ").append(toIndentedString(catalogid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
