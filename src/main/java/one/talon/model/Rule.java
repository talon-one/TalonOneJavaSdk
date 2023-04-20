/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSessionV2](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
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
import java.util.UUID;
import one.talon.model.Binding;

/**
 * Rule
 */

public class Rule {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private UUID parentId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BINDINGS = "bindings";
  @SerializedName(SERIALIZED_NAME_BINDINGS)
  private List<Binding> bindings = null;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private List<Object> condition = new ArrayList<Object>();

  public static final String SERIALIZED_NAME_EFFECTS = "effects";
  @SerializedName(SERIALIZED_NAME_EFFECTS)
  private List<Object> effects = new ArrayList<Object>();


  public Rule id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the rule.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7fa800a8-ac8d-4792-85dc-c4650dcc8f23", value = "A unique identifier for the rule.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Rule parentId(UUID parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * The ID of the rule that was copied to create this rule.
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7fa800a8-ac8d-4792-85dc-c4650dcc8f23", value = "The ID of the rule that was copied to create this rule.")

  public UUID getParentId() {
    return parentId;
  }


  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }


  public Rule title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * A short description of the rule.
   * @return title
  **/
  @ApiModelProperty(example = "Give discount via coupon", required = true, value = "A short description of the rule.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Rule description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A longer, more detailed description of the rule.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Creates a discount when a coupon is valid", value = "A longer, more detailed description of the rule.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Rule bindings(List<Binding> bindings) {
    
    this.bindings = bindings;
    return this;
  }

  public Rule addBindingsItem(Binding bindingsItem) {
    if (this.bindings == null) {
      this.bindings = new ArrayList<Binding>();
    }
    this.bindings.add(bindingsItem);
    return this;
  }

   /**
   * An array that provides objects with variable names (name) and talang expressions to whose result they are bound (expression) during rule evaluation. The order of the evaluation is decided by the position in the array.
   * @return bindings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array that provides objects with variable names (name) and talang expressions to whose result they are bound (expression) during rule evaluation. The order of the evaluation is decided by the position in the array.")

  public List<Binding> getBindings() {
    return bindings;
  }


  public void setBindings(List<Binding> bindings) {
    this.bindings = bindings;
  }


  public Rule condition(List<Object> condition) {
    
    this.condition = condition;
    return this;
  }

  public Rule addConditionItem(Object conditionItem) {
    this.condition.add(conditionItem);
    return this;
  }

   /**
   * A Talang expression that will be evaluated in the context of the given event.
   * @return condition
  **/
  @ApiModelProperty(example = "[and, [couponValid]]", required = true, value = "A Talang expression that will be evaluated in the context of the given event.")

  public List<Object> getCondition() {
    return condition;
  }


  public void setCondition(List<Object> condition) {
    this.condition = condition;
  }


  public Rule effects(List<Object> effects) {
    
    this.effects = effects;
    return this;
  }

  public Rule addEffectsItem(Object effectsItem) {
    this.effects.add(effectsItem);
    return this;
  }

   /**
   * An array of effectful Talang expressions in arrays that will be evaluated when a rule matches.
   * @return effects
  **/
  @ApiModelProperty(example = "[catch, [noop], [setDiscount, 10% off, [*, [., Session, Total], [/, 10, 100]]]]", required = true, value = "An array of effectful Talang expressions in arrays that will be evaluated when a rule matches.")

  public List<Object> getEffects() {
    return effects;
  }


  public void setEffects(List<Object> effects) {
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
    Rule rule = (Rule) o;
    return Objects.equals(this.id, rule.id) &&
        Objects.equals(this.parentId, rule.parentId) &&
        Objects.equals(this.title, rule.title) &&
        Objects.equals(this.description, rule.description) &&
        Objects.equals(this.bindings, rule.bindings) &&
        Objects.equals(this.condition, rule.condition) &&
        Objects.equals(this.effects, rule.effects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, title, description, bindings, condition, effects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

