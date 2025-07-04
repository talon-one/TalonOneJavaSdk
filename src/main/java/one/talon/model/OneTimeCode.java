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

/**
 * OneTimeCode
 */

public class OneTimeCode {
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;


  public OneTimeCode userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user.
   * @return userId
  **/
  @ApiModelProperty(example = "109", required = true, value = "The ID of the user.")

  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public OneTimeCode accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account.
   * @return accountId
  **/
  @ApiModelProperty(example = "31", required = true, value = "The ID of the account.")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public OneTimeCode token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * The two-factor authentication token created during sign-in. This token is used to ensure that the correct user is trying to sign in with a given one-time security code.
   * @return token
  **/
  @ApiModelProperty(example = "dy_Fa_lQ4iDAnqldJFvV", required = true, value = "The two-factor authentication token created during sign-in. This token is used to ensure that the correct user is trying to sign in with a given one-time security code.")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public OneTimeCode code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The one-time security code used for signing in.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "552917", value = "The one-time security code used for signing in.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneTimeCode oneTimeCode = (OneTimeCode) o;
    return Objects.equals(this.userId, oneTimeCode.userId) &&
        Objects.equals(this.accountId, oneTimeCode.accountId) &&
        Objects.equals(this.token, oneTimeCode.token) &&
        Objects.equals(this.code, oneTimeCode.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, accountId, token, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneTimeCode {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

