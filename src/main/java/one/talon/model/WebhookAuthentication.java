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
import one.talon.model.WebhookAuthenticationWebhookRef;
import org.threeten.bp.OffsetDateTime;

/**
 * WebhookAuthentication
 */

public class WebhookAuthentication {
  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;

  public static final String SERIALIZED_NAME_WEBHOOKS = "webhooks";
  @SerializedName(SERIALIZED_NAME_WEBHOOKS)
  private List<WebhookAuthenticationWebhookRef> webhooks = new ArrayList<WebhookAuthenticationWebhookRef>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BASIC("basic"),
    
    CUSTOM("custom");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;


  public WebhookAuthentication createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The name of the user who created the webhook authentication.
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "The name of the user who created the webhook authentication.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public WebhookAuthentication modifiedBy(String modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * The name of the user who last modified the webhook authentication.
   * @return modifiedBy
  **/
  @ApiModelProperty(required = true, value = "The name of the user who last modified the webhook authentication.")

  public String getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public WebhookAuthentication webhooks(List<WebhookAuthenticationWebhookRef> webhooks) {
    
    this.webhooks = webhooks;
    return this;
  }

  public WebhookAuthentication addWebhooksItem(WebhookAuthenticationWebhookRef webhooksItem) {
    this.webhooks.add(webhooksItem);
    return this;
  }

   /**
   * Get webhooks
   * @return webhooks
  **/
  @ApiModelProperty(required = true, value = "")

  public List<WebhookAuthenticationWebhookRef> getWebhooks() {
    return webhooks;
  }


  public void setWebhooks(List<WebhookAuthenticationWebhookRef> webhooks) {
    this.webhooks = webhooks;
  }


  public WebhookAuthentication name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the webhook authentication.
   * @return name
  **/
  @ApiModelProperty(example = "My basic auth", required = true, value = "The name of the webhook authentication.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WebhookAuthentication type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public WebhookAuthentication data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }


  public WebhookAuthentication id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The internal ID of this entity.
   * @return id
  **/
  @ApiModelProperty(example = "6", required = true, value = "The internal ID of this entity.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public WebhookAuthentication created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The time this entity was created.
   * @return created
  **/
  @ApiModelProperty(example = "2020-06-10T09:05:27.993483Z", required = true, value = "The time this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public WebhookAuthentication modified(OffsetDateTime modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * The time this entity was last modified.
   * @return modified
  **/
  @ApiModelProperty(example = "2021-09-12T10:12:42Z", required = true, value = "The time this entity was last modified.")

  public OffsetDateTime getModified() {
    return modified;
  }


  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookAuthentication webhookAuthentication = (WebhookAuthentication) o;
    return Objects.equals(this.createdBy, webhookAuthentication.createdBy) &&
        Objects.equals(this.modifiedBy, webhookAuthentication.modifiedBy) &&
        Objects.equals(this.webhooks, webhookAuthentication.webhooks) &&
        Objects.equals(this.name, webhookAuthentication.name) &&
        Objects.equals(this.type, webhookAuthentication.type) &&
        Objects.equals(this.data, webhookAuthentication.data) &&
        Objects.equals(this.id, webhookAuthentication.id) &&
        Objects.equals(this.created, webhookAuthentication.created) &&
        Objects.equals(this.modified, webhookAuthentication.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, modifiedBy, webhooks, name, type, data, id, created, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookAuthentication {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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

