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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.Campaign;
import one.talon.model.Collection;
import one.talon.model.Ruleset;

/**
 * CreateTemplateCampaignResponse
 */

public class CreateTemplateCampaignResponse {
  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private Campaign campaign;

  public static final String SERIALIZED_NAME_RULESET = "ruleset";
  @SerializedName(SERIALIZED_NAME_RULESET)
  private Ruleset ruleset;

  public static final String SERIALIZED_NAME_COLLECTIONS = "collections";
  @SerializedName(SERIALIZED_NAME_COLLECTIONS)
  private List<Collection> collections = null;


  public CreateTemplateCampaignResponse campaign(Campaign campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @ApiModelProperty(required = true, value = "")

  public Campaign getCampaign() {
    return campaign;
  }


  public void setCampaign(Campaign campaign) {
    this.campaign = campaign;
  }


  public CreateTemplateCampaignResponse ruleset(Ruleset ruleset) {
    
    this.ruleset = ruleset;
    return this;
  }

   /**
   * Get ruleset
   * @return ruleset
  **/
  @ApiModelProperty(required = true, value = "")

  public Ruleset getRuleset() {
    return ruleset;
  }


  public void setRuleset(Ruleset ruleset) {
    this.ruleset = ruleset;
  }


  public CreateTemplateCampaignResponse collections(List<Collection> collections) {
    
    this.collections = collections;
    return this;
  }

  public CreateTemplateCampaignResponse addCollectionsItem(Collection collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<Collection>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

   /**
   * Get collections
   * @return collections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Collection> getCollections() {
    return collections;
  }


  public void setCollections(List<Collection> collections) {
    this.collections = collections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTemplateCampaignResponse createTemplateCampaignResponse = (CreateTemplateCampaignResponse) o;
    return Objects.equals(this.campaign, createTemplateCampaignResponse.campaign) &&
        Objects.equals(this.ruleset, createTemplateCampaignResponse.ruleset) &&
        Objects.equals(this.collections, createTemplateCampaignResponse.collections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, ruleset, collections);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTemplateCampaignResponse {\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    ruleset: ").append(toIndentedString(ruleset)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
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
