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
import one.talon.model.Effect;

/**
 * This is the response type returned by the Reopen customer sessions endpoint. It contains the rolled back effects. 
 */
@ApiModel(description = "This is the response type returned by the Reopen customer sessions endpoint. It contains the rolled back effects. ")

public class ReopenSessionResponse {
  public static final String SERIALIZED_NAME_EFFECTS = "effects";
  @SerializedName(SERIALIZED_NAME_EFFECTS)
  private List<Effect> effects = new ArrayList<Effect>();


  public ReopenSessionResponse effects(List<Effect> effects) {
    
    this.effects = effects;
    return this;
  }

  public ReopenSessionResponse addEffectsItem(Effect effectsItem) {
    this.effects.add(effectsItem);
    return this;
  }

   /**
   * The effects generated by the rules in your running campaigns. See [API effects](https://docs.talon.one/docs/dev/integration-api/api-effects).
   * @return effects
  **/
  @ApiModelProperty(required = true, value = "The effects generated by the rules in your running campaigns. See [API effects](https://docs.talon.one/docs/dev/integration-api/api-effects).")

  public List<Effect> getEffects() {
    return effects;
  }


  public void setEffects(List<Effect> effects) {
    this.effects = effects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReopenSessionResponse reopenSessionResponse = (ReopenSessionResponse) o;
    return Objects.equals(this.effects, reopenSessionResponse.effects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReopenSessionResponse {\n");
    sb.append("    effects: ").append(toIndentedString(effects)).append("\n");
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

