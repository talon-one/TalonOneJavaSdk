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
 * A new loyalty program
 */
@ApiModel(description = "A new loyalty program")

public class NewLoyaltyProgram {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS = "subscribedApplications";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS)
  private List<Integer> subscribedApplications = null;

  public static final String SERIALIZED_NAME_DEFAULT_VALIDITY = "defaultValidity";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALIDITY)
  private String defaultValidity;

  public static final String SERIALIZED_NAME_DEFAULT_PENDING = "defaultPending";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PENDING)
  private String defaultPending;

  public static final String SERIALIZED_NAME_ALLOW_SUBLEDGER = "allowSubledger";
  @SerializedName(SERIALIZED_NAME_ALLOW_SUBLEDGER)
  private Boolean allowSubledger;


  public NewLoyaltyProgram name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The internal name for the Loyalty Program. This is an immutable value.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The internal name for the Loyalty Program. This is an immutable value.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewLoyaltyProgram title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The display title for the Loyalty Program.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The display title for the Loyalty Program.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public NewLoyaltyProgram description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of our Loyalty Program.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of our Loyalty Program.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NewLoyaltyProgram subscribedApplications(List<Integer> subscribedApplications) {
    
    this.subscribedApplications = subscribedApplications;
    return this;
  }

  public NewLoyaltyProgram addSubscribedApplicationsItem(Integer subscribedApplicationsItem) {
    if (this.subscribedApplications == null) {
      this.subscribedApplications = new ArrayList<Integer>();
    }
    this.subscribedApplications.add(subscribedApplicationsItem);
    return this;
  }

   /**
   * A list containing the IDs of all applications that are subscribed to this Loyalty Program.
   * @return subscribedApplications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list containing the IDs of all applications that are subscribed to this Loyalty Program.")

  public List<Integer> getSubscribedApplications() {
    return subscribedApplications;
  }


  public void setSubscribedApplications(List<Integer> subscribedApplications) {
    this.subscribedApplications = subscribedApplications;
  }


  public NewLoyaltyProgram defaultValidity(String defaultValidity) {
    
    this.defaultValidity = defaultValidity;
    return this;
  }

   /**
   * Indicates the default duration after which new loyalty points should expire. The format is a number, followed by one letter indicating the unit; like &#39;1h&#39; or &#39;40m&#39;.
   * @return defaultValidity
  **/
  @ApiModelProperty(required = true, value = "Indicates the default duration after which new loyalty points should expire. The format is a number, followed by one letter indicating the unit; like '1h' or '40m'.")

  public String getDefaultValidity() {
    return defaultValidity;
  }


  public void setDefaultValidity(String defaultValidity) {
    this.defaultValidity = defaultValidity;
  }


  public NewLoyaltyProgram defaultPending(String defaultPending) {
    
    this.defaultPending = defaultPending;
    return this;
  }

   /**
   * Indicates the default duration for the pending time, after which points will be valid. The format is a number followed by a duration unit, like &#39;1h&#39; or &#39;40m&#39;.
   * @return defaultPending
  **/
  @ApiModelProperty(required = true, value = "Indicates the default duration for the pending time, after which points will be valid. The format is a number followed by a duration unit, like '1h' or '40m'.")

  public String getDefaultPending() {
    return defaultPending;
  }


  public void setDefaultPending(String defaultPending) {
    this.defaultPending = defaultPending;
  }


  public NewLoyaltyProgram allowSubledger(Boolean allowSubledger) {
    
    this.allowSubledger = allowSubledger;
    return this;
  }

   /**
   * Indicates if this program supports subledgers inside the program
   * @return allowSubledger
  **/
  @ApiModelProperty(required = true, value = "Indicates if this program supports subledgers inside the program")

  public Boolean getAllowSubledger() {
    return allowSubledger;
  }


  public void setAllowSubledger(Boolean allowSubledger) {
    this.allowSubledger = allowSubledger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewLoyaltyProgram newLoyaltyProgram = (NewLoyaltyProgram) o;
    return Objects.equals(this.name, newLoyaltyProgram.name) &&
        Objects.equals(this.title, newLoyaltyProgram.title) &&
        Objects.equals(this.description, newLoyaltyProgram.description) &&
        Objects.equals(this.subscribedApplications, newLoyaltyProgram.subscribedApplications) &&
        Objects.equals(this.defaultValidity, newLoyaltyProgram.defaultValidity) &&
        Objects.equals(this.defaultPending, newLoyaltyProgram.defaultPending) &&
        Objects.equals(this.allowSubledger, newLoyaltyProgram.allowSubledger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, description, subscribedApplications, defaultValidity, defaultPending, allowSubledger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewLoyaltyProgram {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subscribedApplications: ").append(toIndentedString(subscribedApplications)).append("\n");
    sb.append("    defaultValidity: ").append(toIndentedString(defaultValidity)).append("\n");
    sb.append("    defaultPending: ").append(toIndentedString(defaultPending)).append("\n");
    sb.append("    allowSubledger: ").append(toIndentedString(allowSubledger)).append("\n");
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

