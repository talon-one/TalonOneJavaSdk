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
import one.talon.model.TemplateArgDef;

/**
 * NewCustomEffect
 */

public class NewCustomEffect {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS = "subscribedApplicationsIds";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS)
  private List<Integer> subscribedApplicationsIds = null;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<TemplateArgDef> params = null;


  public NewCustomEffect name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this effect.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this effect.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewCustomEffect title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of this effect.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The title of this effect.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public NewCustomEffect payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * The JSON payload of this effect.
   * @return payload
  **/
  @ApiModelProperty(required = true, value = "The JSON payload of this effect.")

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  public NewCustomEffect description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of this effect.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of this effect.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NewCustomEffect enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Determines if this effect is active.
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Determines if this effect is active.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public NewCustomEffect subscribedApplicationsIds(List<Integer> subscribedApplicationsIds) {
    
    this.subscribedApplicationsIds = subscribedApplicationsIds;
    return this;
  }

  public NewCustomEffect addSubscribedApplicationsIdsItem(Integer subscribedApplicationsIdsItem) {
    if (this.subscribedApplicationsIds == null) {
      this.subscribedApplicationsIds = new ArrayList<Integer>();
    }
    this.subscribedApplicationsIds.add(subscribedApplicationsIdsItem);
    return this;
  }

   /**
   * A list of the IDs of the applications that this effect is enabled for
   * @return subscribedApplicationsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the IDs of the applications that this effect is enabled for")

  public List<Integer> getSubscribedApplicationsIds() {
    return subscribedApplicationsIds;
  }


  public void setSubscribedApplicationsIds(List<Integer> subscribedApplicationsIds) {
    this.subscribedApplicationsIds = subscribedApplicationsIds;
  }


  public NewCustomEffect params(List<TemplateArgDef> params) {
    
    this.params = params;
    return this;
  }

  public NewCustomEffect addParamsItem(TemplateArgDef paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<TemplateArgDef>();
    }
    this.params.add(paramsItem);
    return this;
  }

   /**
   * Array of template argument definitions
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of template argument definitions")

  public List<TemplateArgDef> getParams() {
    return params;
  }


  public void setParams(List<TemplateArgDef> params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCustomEffect newCustomEffect = (NewCustomEffect) o;
    return Objects.equals(this.name, newCustomEffect.name) &&
        Objects.equals(this.title, newCustomEffect.title) &&
        Objects.equals(this.payload, newCustomEffect.payload) &&
        Objects.equals(this.description, newCustomEffect.description) &&
        Objects.equals(this.enabled, newCustomEffect.enabled) &&
        Objects.equals(this.subscribedApplicationsIds, newCustomEffect.subscribedApplicationsIds) &&
        Objects.equals(this.params, newCustomEffect.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, payload, description, enabled, subscribedApplicationsIds, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCustomEffect {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    subscribedApplicationsIds: ").append(toIndentedString(subscribedApplicationsIds)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

