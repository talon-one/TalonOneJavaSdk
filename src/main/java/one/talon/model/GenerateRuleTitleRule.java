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
 * GenerateRuleTitleRule
 */

public class GenerateRuleTitleRule {
  public static final String SERIALIZED_NAME_EFFECTS = "effects";
  @SerializedName(SERIALIZED_NAME_EFFECTS)
  private List<Object> effects = null;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private List<Object> condition = null;


  public GenerateRuleTitleRule effects(List<Object> effects) {
    
    this.effects = effects;
    return this;
  }

  public GenerateRuleTitleRule addEffectsItem(Object effectsItem) {
    if (this.effects == null) {
      this.effects = new ArrayList<Object>();
    }
    this.effects.add(effectsItem);
    return this;
  }

   /**
   * An array of effectful Talang expressions in arrays that will be evaluated when a rule matches.
   * @return effects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[catch, [noop], [setDiscount, 10% off, [*, [., Session, Total], [/, 10, 100]]]]", value = "An array of effectful Talang expressions in arrays that will be evaluated when a rule matches.")

  public List<Object> getEffects() {
    return effects;
  }


  public void setEffects(List<Object> effects) {
    this.effects = effects;
  }


  public GenerateRuleTitleRule condition(List<Object> condition) {
    
    this.condition = condition;
    return this;
  }

  public GenerateRuleTitleRule addConditionItem(Object conditionItem) {
    if (this.condition == null) {
      this.condition = new ArrayList<Object>();
    }
    this.condition.add(conditionItem);
    return this;
  }

   /**
   * A Talang expression that will be evaluated in the context of the given event.
   * @return condition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[and, [couponValid]]", value = "A Talang expression that will be evaluated in the context of the given event.")

  public List<Object> getCondition() {
    return condition;
  }


  public void setCondition(List<Object> condition) {
    this.condition = condition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateRuleTitleRule generateRuleTitleRule = (GenerateRuleTitleRule) o;
    return Objects.equals(this.effects, generateRuleTitleRule.effects) &&
        Objects.equals(this.condition, generateRuleTitleRule.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effects, condition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateRuleTitleRule {\n");
    sb.append("    effects: ").append(toIndentedString(effects)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

