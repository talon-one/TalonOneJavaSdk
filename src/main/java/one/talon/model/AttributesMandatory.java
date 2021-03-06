/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
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
import java.util.ArrayList;
import java.util.List;

/**
 * Arbitrary settings associated with attributes.
 */
@ApiModel(description = "Arbitrary settings associated with attributes.")

public class AttributesMandatory {
  public static final String SERIALIZED_NAME_CAMPAIGNS = "campaigns";
  @SerializedName(SERIALIZED_NAME_CAMPAIGNS)
  private List<String> campaigns = null;

  public static final String SERIALIZED_NAME_COUPONS = "coupons";
  @SerializedName(SERIALIZED_NAME_COUPONS)
  private List<String> coupons = null;


  public AttributesMandatory campaigns(List<String> campaigns) {
    
    this.campaigns = campaigns;
    return this;
  }

  public AttributesMandatory addCampaignsItem(String campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<String>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * List of mandatory attributes for campaigns.
   * @return campaigns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of mandatory attributes for campaigns.")

  public List<String> getCampaigns() {
    return campaigns;
  }


  public void setCampaigns(List<String> campaigns) {
    this.campaigns = campaigns;
  }


  public AttributesMandatory coupons(List<String> coupons) {
    
    this.coupons = coupons;
    return this;
  }

  public AttributesMandatory addCouponsItem(String couponsItem) {
    if (this.coupons == null) {
      this.coupons = new ArrayList<String>();
    }
    this.coupons.add(couponsItem);
    return this;
  }

   /**
   * List of mandatory attributes for campaigns.
   * @return coupons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of mandatory attributes for campaigns.")

  public List<String> getCoupons() {
    return coupons;
  }


  public void setCoupons(List<String> coupons) {
    this.coupons = coupons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributesMandatory attributesMandatory = (AttributesMandatory) o;
    return Objects.equals(this.campaigns, attributesMandatory.campaigns) &&
        Objects.equals(this.coupons, attributesMandatory.coupons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, coupons);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributesMandatory {\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
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

