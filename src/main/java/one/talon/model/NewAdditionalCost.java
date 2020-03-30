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
 * 
 */
@ApiModel(description = "")

public class NewAdditionalCost {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS = "subscribedApplicationsIds";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS)
  private List<Integer> subscribedApplicationsIds = null;


  public NewAdditionalCost name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The additional cost name that will be used in API requests and Talang. E.g. if &#x60;name &#x3D;&#x3D; \&quot;shipping\&quot;&#x60; then you would set the shipping additional cost by including an &#x60;additionalCosts.shipping&#x60; property in your request payload.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The additional cost name that will be used in API requests and Talang. E.g. if `name == \"shipping\"` then you would set the shipping additional cost by including an `additionalCosts.shipping` property in your request payload.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewAdditionalCost title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The human-readable name for the additional cost that will be shown in the Campaign Manager. Like &#x60;name&#x60;, the combination of entity and title must also be unique.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The human-readable name for the additional cost that will be shown in the Campaign Manager. Like `name`, the combination of entity and title must also be unique.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public NewAdditionalCost description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of this additional cost.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A description of this additional cost.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NewAdditionalCost subscribedApplicationsIds(List<Integer> subscribedApplicationsIds) {
    
    this.subscribedApplicationsIds = subscribedApplicationsIds;
    return this;
  }

  public NewAdditionalCost addSubscribedApplicationsIdsItem(Integer subscribedApplicationsIdsItem) {
    if (this.subscribedApplicationsIds == null) {
      this.subscribedApplicationsIds = new ArrayList<Integer>();
    }
    this.subscribedApplicationsIds.add(subscribedApplicationsIdsItem);
    return this;
  }

   /**
   * A list of the IDs of the applications that are subscribed to this additional cost
   * @return subscribedApplicationsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the IDs of the applications that are subscribed to this additional cost")

  public List<Integer> getSubscribedApplicationsIds() {
    return subscribedApplicationsIds;
  }


  public void setSubscribedApplicationsIds(List<Integer> subscribedApplicationsIds) {
    this.subscribedApplicationsIds = subscribedApplicationsIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewAdditionalCost newAdditionalCost = (NewAdditionalCost) o;
    return Objects.equals(this.name, newAdditionalCost.name) &&
        Objects.equals(this.title, newAdditionalCost.title) &&
        Objects.equals(this.description, newAdditionalCost.description) &&
        Objects.equals(this.subscribedApplicationsIds, newAdditionalCost.subscribedApplicationsIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, description, subscribedApplicationsIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAdditionalCost {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subscribedApplicationsIds: ").append(toIndentedString(subscribedApplicationsIds)).append("\n");
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

