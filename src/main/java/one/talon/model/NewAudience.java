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
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class NewAudience {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SANDBOX = "sandbox";
  @SerializedName(SERIALIZED_NAME_SANDBOX)
  private Boolean sandbox;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INTEGRATION = "integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private String integration;

  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integrationId";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_CREATED_IN3RD_PARTY = "createdIn3rdParty";
  @SerializedName(SERIALIZED_NAME_CREATED_IN3RD_PARTY)
  private Boolean createdIn3rdParty;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  private OffsetDateTime lastUpdate;


  public NewAudience name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The human-friendly display name for this audience.
   * @return name
  **/
  @ApiModelProperty(example = "Travel audience", required = true, value = "The human-friendly display name for this audience.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewAudience sandbox(Boolean sandbox) {
    
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Indicates if this is a live or sandbox Application.
   * @return sandbox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if this is a live or sandbox Application.")

  public Boolean getSandbox() {
    return sandbox;
  }


  public void setSandbox(Boolean sandbox) {
    this.sandbox = sandbox;
  }


  public NewAudience description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the audience.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Travel audience 18-27", value = "A description of the audience.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NewAudience integration(String integration) {
    
    this.integration = integration;
    return this;
  }

   /**
   * The Talon.One-supported [3rd-party platform](https://docs.talon.one/docs/dev/technology-partners/overview) that this audience was created in.  For example, &#x60;mParticle&#x60;, &#x60;Segment&#x60;, &#x60;Selligent&#x60;, &#x60;Braze&#x60;, or &#x60;Iterable&#x60;.  **Note:** If you do not integrate with any of these platforms, do not use this property. 
   * @return integration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mparticle", value = "The Talon.One-supported [3rd-party platform](https://docs.talon.one/docs/dev/technology-partners/overview) that this audience was created in.  For example, `mParticle`, `Segment`, `Selligent`, `Braze`, or `Iterable`.  **Note:** If you do not integrate with any of these platforms, do not use this property. ")

  public String getIntegration() {
    return integration;
  }


  public void setIntegration(String integration) {
    this.integration = integration;
  }


  public NewAudience integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The ID of this audience in the third-party integration.  **Note:** To create an audience that doesn&#39;t come from a 3rd party platform, do not use this property. 
   * @return integrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "382370BKDB946", value = "The ID of this audience in the third-party integration.  **Note:** To create an audience that doesn't come from a 3rd party platform, do not use this property. ")

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public NewAudience createdIn3rdParty(Boolean createdIn3rdParty) {
    
    this.createdIn3rdParty = createdIn3rdParty;
    return this;
  }

   /**
   * Determines if this audience is a 3rd party audience or not.
   * @return createdIn3rdParty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Determines if this audience is a 3rd party audience or not.")

  public Boolean getCreatedIn3rdParty() {
    return createdIn3rdParty;
  }


  public void setCreatedIn3rdParty(Boolean createdIn3rdParty) {
    this.createdIn3rdParty = createdIn3rdParty;
  }


  public NewAudience lastUpdate(OffsetDateTime lastUpdate) {
    
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * The last time that the audience memberships changed.
   * @return lastUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-04-26T11:02:38Z", value = "The last time that the audience memberships changed.")

  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }


  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewAudience newAudience = (NewAudience) o;
    return Objects.equals(this.name, newAudience.name) &&
        Objects.equals(this.sandbox, newAudience.sandbox) &&
        Objects.equals(this.description, newAudience.description) &&
        Objects.equals(this.integration, newAudience.integration) &&
        Objects.equals(this.integrationId, newAudience.integrationId) &&
        Objects.equals(this.createdIn3rdParty, newAudience.createdIn3rdParty) &&
        Objects.equals(this.lastUpdate, newAudience.lastUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sandbox, description, integration, integrationId, createdIn3rdParty, lastUpdate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAudience {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    createdIn3rdParty: ").append(toIndentedString(createdIn3rdParty)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
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

