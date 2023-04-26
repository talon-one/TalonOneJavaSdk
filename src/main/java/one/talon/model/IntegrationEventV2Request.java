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

/**
 * 
 */
@ApiModel(description = "")

public class IntegrationEventV2Request {
  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public static final String SERIALIZED_NAME_EVALUABLE_CAMPAIGN_IDS = "evaluableCampaignIds";
  @SerializedName(SERIALIZED_NAME_EVALUABLE_CAMPAIGN_IDS)
  private List<Integer> evaluableCampaignIds = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  /**
   * Gets or Sets responseContent
   */
  @JsonAdapter(ResponseContentEnum.Adapter.class)
  public enum ResponseContentEnum {
    CUSTOMERPROFILE("customerProfile"),
    
    TRIGGEREDCAMPAIGNS("triggeredCampaigns"),
    
    LOYALTY("loyalty"),
    
    EVENT("event"),
    
    AWARDEDGIVEAWAYS("awardedGiveaways"),
    
    RULEFAILUREREASONS("ruleFailureReasons");

    private String value;

    ResponseContentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResponseContentEnum fromValue(String value) {
      for (ResponseContentEnum b : ResponseContentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResponseContentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResponseContentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResponseContentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResponseContentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESPONSE_CONTENT = "responseContent";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CONTENT)
  private List<ResponseContentEnum> responseContent = null;


  public IntegrationEventV2Request profileId(String profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * ID of the customer profile set by your integration layer.  **Note:** If the customer does not yet have a known &#x60;profileId&#x60;, we recommend you use a guest &#x60;profileId&#x60;. 
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "URNGV8294NV", value = "ID of the customer profile set by your integration layer.  **Note:** If the customer does not yet have a known `profileId`, we recommend you use a guest `profileId`. ")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public IntegrationEventV2Request evaluableCampaignIds(List<Integer> evaluableCampaignIds) {
    
    this.evaluableCampaignIds = evaluableCampaignIds;
    return this;
  }

  public IntegrationEventV2Request addEvaluableCampaignIdsItem(Integer evaluableCampaignIdsItem) {
    if (this.evaluableCampaignIds == null) {
      this.evaluableCampaignIds = new ArrayList<Integer>();
    }
    this.evaluableCampaignIds.add(evaluableCampaignIdsItem);
    return this;
  }

   /**
   * When using the &#x60;dry&#x60; query parameter, use this property to list the campaign to be evaluated by the Rule Engine.  These campaigns will be evaluated, even if they are disabled, allowing you to test specific campaigns before activating them. 
   * @return evaluableCampaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[10, 12]", value = "When using the `dry` query parameter, use this property to list the campaign to be evaluated by the Rule Engine.  These campaigns will be evaluated, even if they are disabled, allowing you to test specific campaigns before activating them. ")

  public List<Integer> getEvaluableCampaignIds() {
    return evaluableCampaignIds;
  }


  public void setEvaluableCampaignIds(List<Integer> evaluableCampaignIds) {
    this.evaluableCampaignIds = evaluableCampaignIds;
  }


  public IntegrationEventV2Request type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * A string representing the event name. Must not be a reserved event name. You create this value when you [create an attribute](https://docs.talon.one/docs/dev/concepts/events#creating-a-custom-event) of type &#x60;event&#x60; in the Campaign Manager. 
   * @return type
  **/
  @ApiModelProperty(example = "pageViewed", required = true, value = "A string representing the event name. Must not be a reserved event name. You create this value when you [create an attribute](https://docs.talon.one/docs/dev/concepts/events#creating-a-custom-event) of type `event` in the Campaign Manager. ")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public IntegrationEventV2Request attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary additional JSON properties associated with the event. They must be created in the Campaign Manager before setting them with this property. See [creating custom attributes](https://docs.talon.one/docs/product/account/dev-tools/managing-attributes#creating-custom-attributes).
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"myAttribute\":\"myValue\"}", value = "Arbitrary additional JSON properties associated with the event. They must be created in the Campaign Manager before setting them with this property. See [creating custom attributes](https://docs.talon.one/docs/product/account/dev-tools/managing-attributes#creating-custom-attributes).")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public IntegrationEventV2Request responseContent(List<ResponseContentEnum> responseContent) {
    
    this.responseContent = responseContent;
    return this;
  }

  public IntegrationEventV2Request addResponseContentItem(ResponseContentEnum responseContentItem) {
    if (this.responseContent == null) {
      this.responseContent = new ArrayList<ResponseContentEnum>();
    }
    this.responseContent.add(responseContentItem);
    return this;
  }

   /**
   * Optional list of requested information to be present on the response related to the tracking custom event. 
   * @return responseContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[triggeredCampaigns, customerProfile]", value = "Optional list of requested information to be present on the response related to the tracking custom event. ")

  public List<ResponseContentEnum> getResponseContent() {
    return responseContent;
  }


  public void setResponseContent(List<ResponseContentEnum> responseContent) {
    this.responseContent = responseContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationEventV2Request integrationEventV2Request = (IntegrationEventV2Request) o;
    return Objects.equals(this.profileId, integrationEventV2Request.profileId) &&
        Objects.equals(this.evaluableCampaignIds, integrationEventV2Request.evaluableCampaignIds) &&
        Objects.equals(this.type, integrationEventV2Request.type) &&
        Objects.equals(this.attributes, integrationEventV2Request.attributes) &&
        Objects.equals(this.responseContent, integrationEventV2Request.responseContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileId, evaluableCampaignIds, type, attributes, responseContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationEventV2Request {\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    evaluableCampaignIds: ").append(toIndentedString(evaluableCampaignIds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    responseContent: ").append(toIndentedString(responseContent)).append("\n");
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

