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

public class NewApplicationAPIKey {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private OffsetDateTime expires;

  /**
   * The third-party platform the API key is valid for. Use &#x60;none&#x60; for a generic API key to be used from your own integration layer. 
   */
  @JsonAdapter(PlatformEnum.Adapter.class)
  public enum PlatformEnum {
    NONE("none"),
    
    SEGMENT("segment"),
    
    BRAZE("braze"),
    
    MPARTICLE("mparticle"),
    
    SELLIGENT("selligent"),
    
    ITERABLE("iterable"),
    
    CUSTOMER_ENGAGEMENT("customer_engagement"),
    
    CUSTOMER_DATA("customer_data"),
    
    SALESFORCE("salesforce"),
    
    EMARSYS("emarsys");

    private String value;

    PlatformEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlatformEnum fromValue(String value) {
      for (PlatformEnum b : PlatformEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlatformEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlatformEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlatformEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlatformEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private PlatformEnum platform;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Integer createdBy;

  public static final String SERIALIZED_NAME_ACCOUNT_I_D = "accountID";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_I_D)
  private Integer accountID;

  public static final String SERIALIZED_NAME_APPLICATION_I_D = "applicationID";
  @SerializedName(SERIALIZED_NAME_APPLICATION_I_D)
  private Integer applicationID;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;


  public NewApplicationAPIKey title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title for API Key.
   * @return title
  **/
  @ApiModelProperty(example = "My generated key", required = true, value = "Title for API Key.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public NewApplicationAPIKey expires(OffsetDateTime expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * The date the API key expired.
   * @return expires
  **/
  @ApiModelProperty(example = "2023-08-24T14:00Z", required = true, value = "The date the API key expired.")

  public OffsetDateTime getExpires() {
    return expires;
  }


  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }


  public NewApplicationAPIKey platform(PlatformEnum platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * The third-party platform the API key is valid for. Use &#x60;none&#x60; for a generic API key to be used from your own integration layer. 
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "none", value = "The third-party platform the API key is valid for. Use `none` for a generic API key to be used from your own integration layer. ")

  public PlatformEnum getPlatform() {
    return platform;
  }


  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
  }


  public NewApplicationAPIKey id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the API Key.
   * @return id
  **/
  @ApiModelProperty(example = "34", required = true, value = "ID of the API Key.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public NewApplicationAPIKey createdBy(Integer createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of user who created.
   * @return createdBy
  **/
  @ApiModelProperty(example = "280", required = true, value = "ID of user who created.")

  public Integer getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }


  public NewApplicationAPIKey accountID(Integer accountID) {
    
    this.accountID = accountID;
    return this;
  }

   /**
   * ID of account the key is used for.
   * @return accountID
  **/
  @ApiModelProperty(example = "13", required = true, value = "ID of account the key is used for.")

  public Integer getAccountID() {
    return accountID;
  }


  public void setAccountID(Integer accountID) {
    this.accountID = accountID;
  }


  public NewApplicationAPIKey applicationID(Integer applicationID) {
    
    this.applicationID = applicationID;
    return this;
  }

   /**
   * ID of application the key is used for.
   * @return applicationID
  **/
  @ApiModelProperty(example = "54", required = true, value = "ID of application the key is used for.")

  public Integer getApplicationID() {
    return applicationID;
  }


  public void setApplicationID(Integer applicationID) {
    this.applicationID = applicationID;
  }


  public NewApplicationAPIKey created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The date the API key was created.
   * @return created
  **/
  @ApiModelProperty(example = "2022-03-02T16:46:17.758585Z", required = true, value = "The date the API key was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public NewApplicationAPIKey key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The API key.
   * @return key
  **/
  @ApiModelProperty(example = "f45f90d21dcd9bac965c45e547e9754a3196891d09948e35adbcbedc4e9e4b01", required = true, value = "The API key.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewApplicationAPIKey newApplicationAPIKey = (NewApplicationAPIKey) o;
    return Objects.equals(this.title, newApplicationAPIKey.title) &&
        Objects.equals(this.expires, newApplicationAPIKey.expires) &&
        Objects.equals(this.platform, newApplicationAPIKey.platform) &&
        Objects.equals(this.id, newApplicationAPIKey.id) &&
        Objects.equals(this.createdBy, newApplicationAPIKey.createdBy) &&
        Objects.equals(this.accountID, newApplicationAPIKey.accountID) &&
        Objects.equals(this.applicationID, newApplicationAPIKey.applicationID) &&
        Objects.equals(this.created, newApplicationAPIKey.created) &&
        Objects.equals(this.key, newApplicationAPIKey.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, expires, platform, id, createdBy, accountID, applicationID, created, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewApplicationAPIKey {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    applicationID: ").append(toIndentedString(applicationID)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

