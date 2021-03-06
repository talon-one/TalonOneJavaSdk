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

/**
 * CustomerProfileAudienceRequestItem
 */

public class CustomerProfileAudienceRequestItem {
  /**
   * Gets or Sets action
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    ADD("add"),
    
    DELETE("delete");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_PROFILE_INTEGRATION_ID = "profileIntegrationId";
  @SerializedName(SERIALIZED_NAME_PROFILE_INTEGRATION_ID)
  private String profileIntegrationId;

  public static final String SERIALIZED_NAME_AUDIENCE_ID = "audienceId";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_ID)
  private Integer audienceId;


  public CustomerProfileAudienceRequestItem action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public CustomerProfileAudienceRequestItem profileIntegrationId(String profileIntegrationId) {
    
    this.profileIntegrationId = profileIntegrationId;
    return this;
  }

   /**
   * Get profileIntegrationId
   * @return profileIntegrationId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getProfileIntegrationId() {
    return profileIntegrationId;
  }


  public void setProfileIntegrationId(String profileIntegrationId) {
    this.profileIntegrationId = profileIntegrationId;
  }


  public CustomerProfileAudienceRequestItem audienceId(Integer audienceId) {
    
    this.audienceId = audienceId;
    return this;
  }

   /**
   * Get audienceId
   * @return audienceId
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getAudienceId() {
    return audienceId;
  }


  public void setAudienceId(Integer audienceId) {
    this.audienceId = audienceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerProfileAudienceRequestItem customerProfileAudienceRequestItem = (CustomerProfileAudienceRequestItem) o;
    return Objects.equals(this.action, customerProfileAudienceRequestItem.action) &&
        Objects.equals(this.profileIntegrationId, customerProfileAudienceRequestItem.profileIntegrationId) &&
        Objects.equals(this.audienceId, customerProfileAudienceRequestItem.audienceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, profileIntegrationId, audienceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerProfileAudienceRequestItem {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    profileIntegrationId: ").append(toIndentedString(profileIntegrationId)).append("\n");
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
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

