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
 * CodeGeneratorSettings
 */

public class CodeGeneratorSettings {
  public static final String SERIALIZED_NAME_VALID_CHARACTERS = "validCharacters";
  @SerializedName(SERIALIZED_NAME_VALID_CHARACTERS)
  private List<String> validCharacters = new ArrayList<String>();

  public static final String SERIALIZED_NAME_COUPON_PATTERN = "couponPattern";
  @SerializedName(SERIALIZED_NAME_COUPON_PATTERN)
  private String couponPattern;


  public CodeGeneratorSettings validCharacters(List<String> validCharacters) {
    
    this.validCharacters = validCharacters;
    return this;
  }

  public CodeGeneratorSettings addValidCharactersItem(String validCharactersItem) {
    this.validCharacters.add(validCharactersItem);
    return this;
  }

   /**
   * List of characters used to generate the random parts of a code. 
   * @return validCharacters
  **/
  @ApiModelProperty(example = "[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", required = true, value = "List of characters used to generate the random parts of a code. ")

  public List<String> getValidCharacters() {
    return validCharacters;
  }


  public void setValidCharacters(List<String> validCharacters) {
    this.validCharacters = validCharacters;
  }


  public CodeGeneratorSettings couponPattern(String couponPattern) {
    
    this.couponPattern = couponPattern;
    return this;
  }

   /**
   * The pattern used to generate codes, such as coupon codes, referral codes, and loyalty cards. The character &#x60;#&#x60; is a placeholder and is replaced by a random character from the &#x60;validCharacters&#x60; set. 
   * @return couponPattern
  **/
  @ApiModelProperty(example = "SUMMER-####-####", required = true, value = "The pattern used to generate codes, such as coupon codes, referral codes, and loyalty cards. The character `#` is a placeholder and is replaced by a random character from the `validCharacters` set. ")

  public String getCouponPattern() {
    return couponPattern;
  }


  public void setCouponPattern(String couponPattern) {
    this.couponPattern = couponPattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeGeneratorSettings codeGeneratorSettings = (CodeGeneratorSettings) o;
    return Objects.equals(this.validCharacters, codeGeneratorSettings.validCharacters) &&
        Objects.equals(this.couponPattern, codeGeneratorSettings.couponPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validCharacters, couponPattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeGeneratorSettings {\n");
    sb.append("    validCharacters: ").append(toIndentedString(validCharacters)).append("\n");
    sb.append("    couponPattern: ").append(toIndentedString(couponPattern)).append("\n");
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

