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
 * 
 */
@ApiModel(description = "")

public class NewWebhook {
  public static final String SERIALIZED_NAME_APPLICATION_IDS = "applicationIds";
  @SerializedName(SERIALIZED_NAME_APPLICATION_IDS)
  private List<Integer> applicationIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  /**
   * API method for this webhook
   */
  @JsonAdapter(VerbEnum.Adapter.class)
  public enum VerbEnum {
    POST("POST"),
    
    PUT("PUT"),
    
    GET("GET"),
    
    DELETE("DELETE"),
    
    PATCH("PATCH");

    private String value;

    VerbEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerbEnum fromValue(String value) {
      for (VerbEnum b : VerbEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VerbEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerbEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerbEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VerbEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VERB = "verb";
  @SerializedName(SERIALIZED_NAME_VERB)
  private VerbEnum verb;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<String> headers = new ArrayList<String>();

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<TemplateArgDef> params = new ArrayList<TemplateArgDef>();

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;


  public NewWebhook applicationIds(List<Integer> applicationIds) {
    
    this.applicationIds = applicationIds;
    return this;
  }

  public NewWebhook addApplicationIdsItem(Integer applicationIdsItem) {
    this.applicationIds.add(applicationIdsItem);
    return this;
  }

   /**
   * The IDs of the applications that are related to this entity.
   * @return applicationIds
  **/
  @ApiModelProperty(required = true, value = "The IDs of the applications that are related to this entity.")

  public List<Integer> getApplicationIds() {
    return applicationIds;
  }


  public void setApplicationIds(List<Integer> applicationIds) {
    this.applicationIds = applicationIds;
  }


  public NewWebhook title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Friendly title for this webhook
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Friendly title for this webhook")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public NewWebhook verb(VerbEnum verb) {
    
    this.verb = verb;
    return this;
  }

   /**
   * API method for this webhook
   * @return verb
  **/
  @ApiModelProperty(required = true, value = "API method for this webhook")

  public VerbEnum getVerb() {
    return verb;
  }


  public void setVerb(VerbEnum verb) {
    this.verb = verb;
  }


  public NewWebhook url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * API url (supports templating using parameters) for this webhook
   * @return url
  **/
  @ApiModelProperty(required = true, value = "API url (supports templating using parameters) for this webhook")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public NewWebhook headers(List<String> headers) {
    
    this.headers = headers;
    return this;
  }

  public NewWebhook addHeadersItem(String headersItem) {
    this.headers.add(headersItem);
    return this;
  }

   /**
   * List of API HTTP headers for this webhook
   * @return headers
  **/
  @ApiModelProperty(required = true, value = "List of API HTTP headers for this webhook")

  public List<String> getHeaders() {
    return headers;
  }


  public void setHeaders(List<String> headers) {
    this.headers = headers;
  }


  public NewWebhook payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * API payload (supports templating using parameters) for this webhook
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API payload (supports templating using parameters) for this webhook")

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  public NewWebhook params(List<TemplateArgDef> params) {
    
    this.params = params;
    return this;
  }

  public NewWebhook addParamsItem(TemplateArgDef paramsItem) {
    this.params.add(paramsItem);
    return this;
  }

   /**
   * Array of template argument definitions
   * @return params
  **/
  @ApiModelProperty(required = true, value = "Array of template argument definitions")

  public List<TemplateArgDef> getParams() {
    return params;
  }


  public void setParams(List<TemplateArgDef> params) {
    this.params = params;
  }


  public NewWebhook enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Enables or disables webhook from showing in rule builder
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Enables or disables webhook from showing in rule builder")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewWebhook newWebhook = (NewWebhook) o;
    return Objects.equals(this.applicationIds, newWebhook.applicationIds) &&
        Objects.equals(this.title, newWebhook.title) &&
        Objects.equals(this.verb, newWebhook.verb) &&
        Objects.equals(this.url, newWebhook.url) &&
        Objects.equals(this.headers, newWebhook.headers) &&
        Objects.equals(this.payload, newWebhook.payload) &&
        Objects.equals(this.params, newWebhook.params) &&
        Objects.equals(this.enabled, newWebhook.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationIds, title, verb, url, headers, payload, params, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewWebhook {\n");
    sb.append("    applicationIds: ").append(toIndentedString(applicationIds)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

