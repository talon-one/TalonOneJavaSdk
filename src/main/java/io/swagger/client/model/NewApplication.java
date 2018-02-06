/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NewApplication
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-06T13:17:26.027+01:00")
public class NewApplication {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("currency")
  private String currency = null;

  public NewApplication name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this application.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this application.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewApplication description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A longer description of the application.
   * @return description
  **/
  @ApiModelProperty(value = "A longer description of the application.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NewApplication key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Hex key for HMAC-signing API calls as coming from this application (16 hex digits)
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Hex key for HMAC-signing API calls as coming from this application (16 hex digits)")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public NewApplication timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * A string containing an IANA timezone descriptor.
   * @return timezone
  **/
  @ApiModelProperty(required = true, value = "A string containing an IANA timezone descriptor.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public NewApplication currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * A string describing a default currency for new customer sessions.
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "A string describing a default currency for new customer sessions.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewApplication newApplication = (NewApplication) o;
    return Objects.equals(this.name, newApplication.name) &&
        Objects.equals(this.description, newApplication.description) &&
        Objects.equals(this.key, newApplication.key) &&
        Objects.equals(this.timezone, newApplication.timezone) &&
        Objects.equals(this.currency, newApplication.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, key, timezone, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewApplication {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

