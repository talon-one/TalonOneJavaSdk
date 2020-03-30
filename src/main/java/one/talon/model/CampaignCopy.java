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
import org.threeten.bp.OffsetDateTime;

/**
 * CampaignCopy
 */

public class CampaignCopy {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_APPLICATION_IDS = "applicationIds";
  @SerializedName(SERIALIZED_NAME_APPLICATION_IDS)
  private List<String> applicationIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;


  public CampaignCopy name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the copied campaign (Defaults to \&quot;Copy of original campaign name\&quot;)
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the copied campaign (Defaults to \"Copy of original campaign name\")")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CampaignCopy applicationIds(List<String> applicationIds) {
    
    this.applicationIds = applicationIds;
    return this;
  }

  public CampaignCopy addApplicationIdsItem(String applicationIdsItem) {
    this.applicationIds.add(applicationIdsItem);
    return this;
  }

   /**
   * Application IDs of the applications to which a campaign should be copied to
   * @return applicationIds
  **/
  @ApiModelProperty(required = true, value = "Application IDs of the applications to which a campaign should be copied to")

  public List<String> getApplicationIds() {
    return applicationIds;
  }


  public void setApplicationIds(List<String> applicationIds) {
    this.applicationIds = applicationIds;
  }


  public CampaignCopy description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A detailed description of the campaign.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A detailed description of the campaign.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CampaignCopy startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Datetime when the campaign will become active.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datetime when the campaign will become active.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public CampaignCopy endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Datetime when the campaign will become in-active.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datetime when the campaign will become in-active.")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public CampaignCopy tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CampaignCopy addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags for the campaign.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of tags for the campaign.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCopy campaignCopy = (CampaignCopy) o;
    return Objects.equals(this.name, campaignCopy.name) &&
        Objects.equals(this.applicationIds, campaignCopy.applicationIds) &&
        Objects.equals(this.description, campaignCopy.description) &&
        Objects.equals(this.startTime, campaignCopy.startTime) &&
        Objects.equals(this.endTime, campaignCopy.endTime) &&
        Objects.equals(this.tags, campaignCopy.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, applicationIds, description, startTime, endTime, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCopy {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    applicationIds: ").append(toIndentedString(applicationIds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

