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
 * The properties specific to the \&quot;addLoyaltyPoints\&quot; effect. This gets triggered whenever a validated rule contained an \&quot;add loyalty\&quot; effect. These points are automatically stored and managed inside Talon.One.
 */
@ApiModel(description = "The properties specific to the \"addLoyaltyPoints\" effect. This gets triggered whenever a validated rule contained an \"add loyalty\" effect. These points are automatically stored and managed inside Talon.One.")

public class AddLoyaltyPointsEffectProps {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROGRAM_ID = "programId";
  @SerializedName(SERIALIZED_NAME_PROGRAM_ID)
  private Integer programId;

  public static final String SERIALIZED_NAME_SUB_LEDGER_ID = "subLedgerId";
  @SerializedName(SERIALIZED_NAME_SUB_LEDGER_ID)
  private String subLedgerId;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID = "recipientIntegrationId";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID)
  private String recipientIntegrationId;

  public static final String SERIALIZED_NAME_EXPIRY_CONDITION = "expiryCondition";
  @SerializedName(SERIALIZED_NAME_EXPIRY_CONDITION)
  private String expiryCondition;


  public AddLoyaltyPointsEffectProps name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name/description of this loyalty point addition
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name/description of this loyalty point addition")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AddLoyaltyPointsEffectProps programId(Integer programId) {
    
    this.programId = programId;
    return this;
  }

   /**
   * The ID of the loyalty program where these points were added
   * @return programId
  **/
  @ApiModelProperty(required = true, value = "The ID of the loyalty program where these points were added")

  public Integer getProgramId() {
    return programId;
  }


  public void setProgramId(Integer programId) {
    this.programId = programId;
  }


  public AddLoyaltyPointsEffectProps subLedgerId(String subLedgerId) {
    
    this.subLedgerId = subLedgerId;
    return this;
  }

   /**
   * The ID of the subledger within the loyalty program where these points were added
   * @return subLedgerId
  **/
  @ApiModelProperty(required = true, value = "The ID of the subledger within the loyalty program where these points were added")

  public String getSubLedgerId() {
    return subLedgerId;
  }


  public void setSubLedgerId(String subLedgerId) {
    this.subLedgerId = subLedgerId;
  }


  public AddLoyaltyPointsEffectProps value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * The amount of points that were added
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The amount of points that were added")

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public AddLoyaltyPointsEffectProps recipientIntegrationId(String recipientIntegrationId) {
    
    this.recipientIntegrationId = recipientIntegrationId;
    return this;
  }

   /**
   * The user for whom these points were added
   * @return recipientIntegrationId
  **/
  @ApiModelProperty(required = true, value = "The user for whom these points were added")

  public String getRecipientIntegrationId() {
    return recipientIntegrationId;
  }


  public void setRecipientIntegrationId(String recipientIntegrationId) {
    this.recipientIntegrationId = recipientIntegrationId;
  }


  public AddLoyaltyPointsEffectProps expiryCondition(String expiryCondition) {
    
    this.expiryCondition = expiryCondition;
    return this;
  }

   /**
   * The amount of time (in days) these points are valid
   * @return expiryCondition
  **/
  @ApiModelProperty(required = true, value = "The amount of time (in days) these points are valid")

  public String getExpiryCondition() {
    return expiryCondition;
  }


  public void setExpiryCondition(String expiryCondition) {
    this.expiryCondition = expiryCondition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddLoyaltyPointsEffectProps addLoyaltyPointsEffectProps = (AddLoyaltyPointsEffectProps) o;
    return Objects.equals(this.name, addLoyaltyPointsEffectProps.name) &&
        Objects.equals(this.programId, addLoyaltyPointsEffectProps.programId) &&
        Objects.equals(this.subLedgerId, addLoyaltyPointsEffectProps.subLedgerId) &&
        Objects.equals(this.value, addLoyaltyPointsEffectProps.value) &&
        Objects.equals(this.recipientIntegrationId, addLoyaltyPointsEffectProps.recipientIntegrationId) &&
        Objects.equals(this.expiryCondition, addLoyaltyPointsEffectProps.expiryCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, programId, subLedgerId, value, recipientIntegrationId, expiryCondition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddLoyaltyPointsEffectProps {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    subLedgerId: ").append(toIndentedString(subLedgerId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    recipientIntegrationId: ").append(toIndentedString(recipientIntegrationId)).append("\n");
    sb.append("    expiryCondition: ").append(toIndentedString(expiryCondition)).append("\n");
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
