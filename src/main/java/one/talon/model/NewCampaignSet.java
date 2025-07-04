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
import one.talon.model.CampaignSetBranchNode;

/**
 * NewCampaignSet
 */

public class NewCampaignSet {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Long applicationId;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Long version;

  public static final String SERIALIZED_NAME_SET = "set";
  @SerializedName(SERIALIZED_NAME_SET)
  private CampaignSetBranchNode set;


  public NewCampaignSet applicationId(Long applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The ID of the Application that owns this entity.
   * @return applicationId
  **/
  @ApiModelProperty(example = "322", required = true, value = "The ID of the Application that owns this entity.")

  public Long getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }


  public NewCampaignSet version(Long version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version of the campaign set.
   * minimum: 1
   * @return version
  **/
  @ApiModelProperty(example = "2", required = true, value = "Version of the campaign set.")

  public Long getVersion() {
    return version;
  }


  public void setVersion(Long version) {
    this.version = version;
  }


  public NewCampaignSet set(CampaignSetBranchNode set) {
    
    this.set = set;
    return this;
  }

   /**
   * Get set
   * @return set
  **/
  @ApiModelProperty(required = true, value = "")

  public CampaignSetBranchNode getSet() {
    return set;
  }


  public void setSet(CampaignSetBranchNode set) {
    this.set = set;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCampaignSet newCampaignSet = (NewCampaignSet) o;
    return Objects.equals(this.applicationId, newCampaignSet.applicationId) &&
        Objects.equals(this.version, newCampaignSet.version) &&
        Objects.equals(this.set, newCampaignSet.set);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, version, set);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCampaignSet {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
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

