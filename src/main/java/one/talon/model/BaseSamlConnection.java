/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * OpenAPI spec version: 1.0.0
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

/**
 * BaseSamlConnection
 */

public class BaseSamlConnection {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_SIGN_ON_U_R_L = "signOnURL";
  @SerializedName(SERIALIZED_NAME_SIGN_ON_U_R_L)
  private String signOnURL;

  public static final String SERIALIZED_NAME_SIGN_OUT_U_R_L = "signOutURL";
  @SerializedName(SERIALIZED_NAME_SIGN_OUT_U_R_L)
  private String signOutURL;

  public static final String SERIALIZED_NAME_METADATA_U_R_L = "metadataURL";
  @SerializedName(SERIALIZED_NAME_METADATA_U_R_L)
  private String metadataURL;

  public static final String SERIALIZED_NAME_AUDIENCE_U_R_I = "audienceURI";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_U_R_I)
  private String audienceURI;

  public BaseSamlConnection accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that owns this entity.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account that owns this entity.")
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public BaseSamlConnection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * ID of the SAML service.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "ID of the SAML service.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BaseSamlConnection enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Determines if this SAML connection active.
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Determines if this SAML connection active.")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public BaseSamlConnection issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Identity Provider Entity ID.
   * @return issuer
  **/
  @ApiModelProperty(required = true, value = "Identity Provider Entity ID.")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public BaseSamlConnection signOnURL(String signOnURL) {
    this.signOnURL = signOnURL;
    return this;
  }

   /**
   * Single Sign-On URL.
   * @return signOnURL
  **/
  @ApiModelProperty(required = true, value = "Single Sign-On URL.")
  public String getSignOnURL() {
    return signOnURL;
  }

  public void setSignOnURL(String signOnURL) {
    this.signOnURL = signOnURL;
  }

  public BaseSamlConnection signOutURL(String signOutURL) {
    this.signOutURL = signOutURL;
    return this;
  }

   /**
   * Single Sign-Out URL.
   * @return signOutURL
  **/
  @ApiModelProperty(value = "Single Sign-Out URL.")
  public String getSignOutURL() {
    return signOutURL;
  }

  public void setSignOutURL(String signOutURL) {
    this.signOutURL = signOutURL;
  }

  public BaseSamlConnection metadataURL(String metadataURL) {
    this.metadataURL = metadataURL;
    return this;
  }

   /**
   * Metadata URL.
   * @return metadataURL
  **/
  @ApiModelProperty(value = "Metadata URL.")
  public String getMetadataURL() {
    return metadataURL;
  }

  public void setMetadataURL(String metadataURL) {
    this.metadataURL = metadataURL;
  }

  public BaseSamlConnection audienceURI(String audienceURI) {
    this.audienceURI = audienceURI;
    return this;
  }

   /**
   * The application-defined unique identifier that is the intended audience of the SAML assertion. This is most often the SP Entity ID of your application. When not specified, the ACS URL will be used. 
   * @return audienceURI
  **/
  @ApiModelProperty(value = "The application-defined unique identifier that is the intended audience of the SAML assertion. This is most often the SP Entity ID of your application. When not specified, the ACS URL will be used. ")
  public String getAudienceURI() {
    return audienceURI;
  }

  public void setAudienceURI(String audienceURI) {
    this.audienceURI = audienceURI;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseSamlConnection baseSamlConnection = (BaseSamlConnection) o;
    return Objects.equals(this.accountId, baseSamlConnection.accountId) &&
        Objects.equals(this.name, baseSamlConnection.name) &&
        Objects.equals(this.enabled, baseSamlConnection.enabled) &&
        Objects.equals(this.issuer, baseSamlConnection.issuer) &&
        Objects.equals(this.signOnURL, baseSamlConnection.signOnURL) &&
        Objects.equals(this.signOutURL, baseSamlConnection.signOutURL) &&
        Objects.equals(this.metadataURL, baseSamlConnection.metadataURL) &&
        Objects.equals(this.audienceURI, baseSamlConnection.audienceURI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, name, enabled, issuer, signOnURL, signOutURL, metadataURL, audienceURI);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseSamlConnection {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    signOnURL: ").append(toIndentedString(signOnURL)).append("\n");
    sb.append("    signOutURL: ").append(toIndentedString(signOutURL)).append("\n");
    sb.append("    metadataURL: ").append(toIndentedString(metadataURL)).append("\n");
    sb.append("    audienceURI: ").append(toIndentedString(audienceURI)).append("\n");
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

