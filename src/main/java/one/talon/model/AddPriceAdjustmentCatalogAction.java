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
import one.talon.model.NewPriceAdjustment;

/**
 * The specific properties of the \&quot;ADD_PRICE_ADJUSTMENT\&quot; catalog sync action. 
 */
@ApiModel(description = "The specific properties of the \"ADD_PRICE_ADJUSTMENT\" catalog sync action. ")

public class AddPriceAdjustmentCatalogAction {
  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_ADJUSTMENTS = "adjustments";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENTS)
  private List<NewPriceAdjustment> adjustments = new ArrayList<NewPriceAdjustment>();


  public AddPriceAdjustmentCatalogAction sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * The SKU of the item for which the price is being adjusted.
   * @return sku
  **/
  @ApiModelProperty(example = "SKU1241028", required = true, value = "The SKU of the item for which the price is being adjusted.")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public AddPriceAdjustmentCatalogAction adjustments(List<NewPriceAdjustment> adjustments) {
    
    this.adjustments = adjustments;
    return this;
  }

  public AddPriceAdjustmentCatalogAction addAdjustmentsItem(NewPriceAdjustment adjustmentsItem) {
    this.adjustments.add(adjustmentsItem);
    return this;
  }

   /**
   * A list of adjustments to apply to a given item.
   * @return adjustments
  **/
  @ApiModelProperty(required = true, value = "A list of adjustments to apply to a given item.")

  public List<NewPriceAdjustment> getAdjustments() {
    return adjustments;
  }


  public void setAdjustments(List<NewPriceAdjustment> adjustments) {
    this.adjustments = adjustments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddPriceAdjustmentCatalogAction addPriceAdjustmentCatalogAction = (AddPriceAdjustmentCatalogAction) o;
    return Objects.equals(this.sku, addPriceAdjustmentCatalogAction.sku) &&
        Objects.equals(this.adjustments, addPriceAdjustmentCatalogAction.adjustments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, adjustments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPriceAdjustmentCatalogAction {\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
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

