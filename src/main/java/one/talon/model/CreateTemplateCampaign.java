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
import one.talon.model.Binding;
import one.talon.model.LimitConfig;

/**
 * CreateTemplateCampaign
 */

public class CreateTemplateCampaign {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Long templateId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ATTRIBUTES_OVERRIDES = "campaignAttributesOverrides";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ATTRIBUTES_OVERRIDES)
  private Object campaignAttributesOverrides;

  public static final String SERIALIZED_NAME_TEMPLATE_PARAM_VALUES = "templateParamValues";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_PARAM_VALUES)
  private List<Binding> templateParamValues = null;

  public static final String SERIALIZED_NAME_LIMIT_OVERRIDES = "limitOverrides";
  @SerializedName(SERIALIZED_NAME_LIMIT_OVERRIDES)
  private List<LimitConfig> limitOverrides = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_GROUPS = "campaignGroups";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_GROUPS)
  private List<Long> campaignGroups = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_EVALUATION_GROUP_ID = "evaluationGroupId";
  @SerializedName(SERIALIZED_NAME_EVALUATION_GROUP_ID)
  private Long evaluationGroupId;

  public static final String SERIALIZED_NAME_LINKED_STORE_IDS = "linkedStoreIds";
  @SerializedName(SERIALIZED_NAME_LINKED_STORE_IDS)
  private List<Long> linkedStoreIds = null;


  public CreateTemplateCampaign name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A user-facing name for this campaign.
   * @return name
  **/
  @ApiModelProperty(example = "Discount campaign", required = true, value = "A user-facing name for this campaign.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateTemplateCampaign description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A detailed description of the campaign.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This template is for discount campaigns.", value = "A detailed description of the campaign.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateTemplateCampaign templateId(Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * The ID of the Campaign Template which will be used in order to create the Campaign.
   * @return templateId
  **/
  @ApiModelProperty(example = "4", required = true, value = "The ID of the Campaign Template which will be used in order to create the Campaign.")

  public Long getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }


  public CreateTemplateCampaign campaignAttributesOverrides(Object campaignAttributesOverrides) {
    
    this.campaignAttributesOverrides = campaignAttributesOverrides;
    return this;
  }

   /**
   * Custom Campaign Attributes. If the Campaign Template defines the same values, they will be overridden.
   * @return campaignAttributesOverrides
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom Campaign Attributes. If the Campaign Template defines the same values, they will be overridden.")

  public Object getCampaignAttributesOverrides() {
    return campaignAttributesOverrides;
  }


  public void setCampaignAttributesOverrides(Object campaignAttributesOverrides) {
    this.campaignAttributesOverrides = campaignAttributesOverrides;
  }


  public CreateTemplateCampaign templateParamValues(List<Binding> templateParamValues) {
    
    this.templateParamValues = templateParamValues;
    return this;
  }

  public CreateTemplateCampaign addTemplateParamValuesItem(Binding templateParamValuesItem) {
    if (this.templateParamValues == null) {
      this.templateParamValues = new ArrayList<Binding>();
    }
    this.templateParamValues.add(templateParamValuesItem);
    return this;
  }

   /**
   * Actual values to replace the template placeholder values in the Ruleset bindings. Values for all Template Parameters must be provided.
   * @return templateParamValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Actual values to replace the template placeholder values in the Ruleset bindings. Values for all Template Parameters must be provided.")

  public List<Binding> getTemplateParamValues() {
    return templateParamValues;
  }


  public void setTemplateParamValues(List<Binding> templateParamValues) {
    this.templateParamValues = templateParamValues;
  }


  public CreateTemplateCampaign limitOverrides(List<LimitConfig> limitOverrides) {
    
    this.limitOverrides = limitOverrides;
    return this;
  }

  public CreateTemplateCampaign addLimitOverridesItem(LimitConfig limitOverridesItem) {
    if (this.limitOverrides == null) {
      this.limitOverrides = new ArrayList<LimitConfig>();
    }
    this.limitOverrides.add(limitOverridesItem);
    return this;
  }

   /**
   * Limits for this Campaign. If the Campaign Template or Application define default values for the same limits, they will be overridden.
   * @return limitOverrides
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limits for this Campaign. If the Campaign Template or Application define default values for the same limits, they will be overridden.")

  public List<LimitConfig> getLimitOverrides() {
    return limitOverrides;
  }


  public void setLimitOverrides(List<LimitConfig> limitOverrides) {
    this.limitOverrides = limitOverrides;
  }


  public CreateTemplateCampaign campaignGroups(List<Long> campaignGroups) {
    
    this.campaignGroups = campaignGroups;
    return this;
  }

  public CreateTemplateCampaign addCampaignGroupsItem(Long campaignGroupsItem) {
    if (this.campaignGroups == null) {
      this.campaignGroups = new ArrayList<Long>();
    }
    this.campaignGroups.add(campaignGroupsItem);
    return this;
  }

   /**
   * The IDs of the [campaign groups](https://docs.talon.one/docs/product/account/account-settings/managing-campaign-groups) this campaign belongs to. 
   * @return campaignGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1, 3]", value = "The IDs of the [campaign groups](https://docs.talon.one/docs/product/account/account-settings/managing-campaign-groups) this campaign belongs to. ")

  public List<Long> getCampaignGroups() {
    return campaignGroups;
  }


  public void setCampaignGroups(List<Long> campaignGroups) {
    this.campaignGroups = campaignGroups;
  }


  public CreateTemplateCampaign tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateTemplateCampaign addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags for the campaign. If the campaign template has tags, they will be overridden by this list.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[summer]", value = "A list of tags for the campaign. If the campaign template has tags, they will be overridden by this list.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public CreateTemplateCampaign evaluationGroupId(Long evaluationGroupId) {
    
    this.evaluationGroupId = evaluationGroupId;
    return this;
  }

   /**
   * The ID of the campaign evaluation group the campaign belongs to.
   * @return evaluationGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "The ID of the campaign evaluation group the campaign belongs to.")

  public Long getEvaluationGroupId() {
    return evaluationGroupId;
  }


  public void setEvaluationGroupId(Long evaluationGroupId) {
    this.evaluationGroupId = evaluationGroupId;
  }


  public CreateTemplateCampaign linkedStoreIds(List<Long> linkedStoreIds) {
    
    this.linkedStoreIds = linkedStoreIds;
    return this;
  }

  public CreateTemplateCampaign addLinkedStoreIdsItem(Long linkedStoreIdsItem) {
    if (this.linkedStoreIds == null) {
      this.linkedStoreIds = new ArrayList<Long>();
    }
    this.linkedStoreIds.add(linkedStoreIdsItem);
    return this;
  }

   /**
   * A list of store IDs that are linked to the campaign.  **Note:** Campaigns with linked store IDs will only be evaluated when there is a [customer session update](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) that references a linked store. 
   * @return linkedStoreIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1, 2, 3]", value = "A list of store IDs that are linked to the campaign.  **Note:** Campaigns with linked store IDs will only be evaluated when there is a [customer session update](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) that references a linked store. ")

  public List<Long> getLinkedStoreIds() {
    return linkedStoreIds;
  }


  public void setLinkedStoreIds(List<Long> linkedStoreIds) {
    this.linkedStoreIds = linkedStoreIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTemplateCampaign createTemplateCampaign = (CreateTemplateCampaign) o;
    return Objects.equals(this.name, createTemplateCampaign.name) &&
        Objects.equals(this.description, createTemplateCampaign.description) &&
        Objects.equals(this.templateId, createTemplateCampaign.templateId) &&
        Objects.equals(this.campaignAttributesOverrides, createTemplateCampaign.campaignAttributesOverrides) &&
        Objects.equals(this.templateParamValues, createTemplateCampaign.templateParamValues) &&
        Objects.equals(this.limitOverrides, createTemplateCampaign.limitOverrides) &&
        Objects.equals(this.campaignGroups, createTemplateCampaign.campaignGroups) &&
        Objects.equals(this.tags, createTemplateCampaign.tags) &&
        Objects.equals(this.evaluationGroupId, createTemplateCampaign.evaluationGroupId) &&
        Objects.equals(this.linkedStoreIds, createTemplateCampaign.linkedStoreIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, templateId, campaignAttributesOverrides, templateParamValues, limitOverrides, campaignGroups, tags, evaluationGroupId, linkedStoreIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTemplateCampaign {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    campaignAttributesOverrides: ").append(toIndentedString(campaignAttributesOverrides)).append("\n");
    sb.append("    templateParamValues: ").append(toIndentedString(templateParamValues)).append("\n");
    sb.append("    limitOverrides: ").append(toIndentedString(limitOverrides)).append("\n");
    sb.append("    campaignGroups: ").append(toIndentedString(campaignGroups)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    evaluationGroupId: ").append(toIndentedString(evaluationGroupId)).append("\n");
    sb.append("    linkedStoreIds: ").append(toIndentedString(linkedStoreIds)).append("\n");
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

