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
import java.math.BigDecimal;

/**
 * The properties specific to the \&quot;setDiscount\&quot; effect. This gets triggered whenever a validated rule contained a \&quot;set discount\&quot; effect. This is a discount that should be applied on the scope of defined with it.
 */
@ApiModel(description = "The properties specific to the \"setDiscount\" effect. This gets triggered whenever a validated rule contained a \"set discount\" effect. This is a discount that should be applied on the scope of defined with it.")

public class SetDiscountEffectProps {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;


  public SetDiscountEffectProps name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name/description of this discount
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name/description of this discount")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SetDiscountEffectProps value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * The total monetary value of the discount
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The total monetary value of the discount")

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public SetDiscountEffectProps scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope which the discount was applied on, can be one of (cartItems,additionalCosts,sessionTotal)
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scope which the discount was applied on, can be one of (cartItems,additionalCosts,sessionTotal)")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDiscountEffectProps setDiscountEffectProps = (SetDiscountEffectProps) o;
    return Objects.equals(this.name, setDiscountEffectProps.name) &&
        Objects.equals(this.value, setDiscountEffectProps.value) &&
        Objects.equals(this.scope, setDiscountEffectProps.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDiscountEffectProps {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

