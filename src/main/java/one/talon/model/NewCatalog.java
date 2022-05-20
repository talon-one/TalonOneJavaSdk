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

/**
 * 
 */
@ApiModel(description = "")

public class NewCatalog {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS = "subscribedApplicationsIds";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS)
  private List<Integer> subscribedApplicationsIds = null;


  public NewCatalog name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The cart items catalog name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The cart items catalog name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewCatalog description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of this cart items catalog.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A description of this cart items catalog.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NewCatalog subscribedApplicationsIds(List<Integer> subscribedApplicationsIds) {
    
    this.subscribedApplicationsIds = subscribedApplicationsIds;
    return this;
  }

  public NewCatalog addSubscribedApplicationsIdsItem(Integer subscribedApplicationsIdsItem) {
    if (this.subscribedApplicationsIds == null) {
      this.subscribedApplicationsIds = new ArrayList<Integer>();
    }
    this.subscribedApplicationsIds.add(subscribedApplicationsIdsItem);
    return this;
  }

   /**
   * A list of the IDs of the applications that are subscribed to this catalog.
   * @return subscribedApplicationsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the IDs of the applications that are subscribed to this catalog.")

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
    NewCatalog newCatalog = (NewCatalog) o;
    return Objects.equals(this.name, newCatalog.name) &&
        Objects.equals(this.description, newCatalog.description) &&
        Objects.equals(this.subscribedApplicationsIds, newCatalog.subscribedApplicationsIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, subscribedApplicationsIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCatalog {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
