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
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * AddedDeductedPointsNotification
 */

public class AddedDeductedPointsNotification {
  public static final String SERIALIZED_NAME_PROFILE_INTEGRATION_I_D = "ProfileIntegrationID";
  @SerializedName(SERIALIZED_NAME_PROFILE_INTEGRATION_I_D)
  private String profileIntegrationID;

  public static final String SERIALIZED_NAME_LOYALTY_PROGRAM_I_D = "LoyaltyProgramID";
  @SerializedName(SERIALIZED_NAME_LOYALTY_PROGRAM_I_D)
  private Long loyaltyProgramID;

  public static final String SERIALIZED_NAME_SUBLEDGER_I_D = "SubledgerID";
  @SerializedName(SERIALIZED_NAME_SUBLEDGER_I_D)
  private String subledgerID;

  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  /**
   * The notification source, that is, it indicates whether the points were added or deducted via one of the following routes:  - [The Campaign Manager](/docs/product/getting-started)  - [Management API](/management-api#tag/Loyalty)  - [Rule Engine](/docs/product/applications/evaluation-order-for-rules-and-filters) 
   */
  @JsonAdapter(TypeOfChangeEnum.Adapter.class)
  public enum TypeOfChangeEnum {
    CAMPAIGN_MANAGER("campaign_manager"),
    
    RULE_ENGINE("rule_engine"),
    
    MANAGEMENT_API("management_api");

    private String value;

    TypeOfChangeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeOfChangeEnum fromValue(String value) {
      for (TypeOfChangeEnum b : TypeOfChangeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeOfChangeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeOfChangeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeOfChangeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeOfChangeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE_OF_CHANGE = "TypeOfChange";
  @SerializedName(SERIALIZED_NAME_TYPE_OF_CHANGE)
  private TypeOfChangeEnum typeOfChange;

  public static final String SERIALIZED_NAME_EMPLOYEE_NAME = "EmployeeName";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NAME)
  private String employeeName;

  public static final String SERIALIZED_NAME_USER_I_D = "UserID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private Long userID;

  /**
   * The action (addition or deduction) made with loyalty points.
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    ADDITION("addition"),
    
    DEDUCTION("deduction");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATION = "Operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private OperationEnum operation;

  public static final String SERIALIZED_NAME_START_DATE = "StartDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "ExpiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_SESSION_INTEGRATION_I_D = "SessionIntegrationID";
  @SerializedName(SERIALIZED_NAME_SESSION_INTEGRATION_I_D)
  private String sessionIntegrationID;

  /**
   * The type of notification.
   */
  @JsonAdapter(NotificationTypeEnum.Adapter.class)
  public enum NotificationTypeEnum {
    LOYALTYPOINTSDEDUCTED("LoyaltyPointsDeducted"),
    
    LOYALTYPOINTSADDED("LoyaltyPointsAdded");

    private String value;

    NotificationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationTypeEnum fromValue(String value) {
      for (NotificationTypeEnum b : NotificationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NotificationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotificationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotificationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NotificationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NOTIFICATION_TYPE = "NotificationType";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TYPE)
  private NotificationTypeEnum notificationType;


  public AddedDeductedPointsNotification profileIntegrationID(String profileIntegrationID) {
    
    this.profileIntegrationID = profileIntegrationID;
    return this;
  }

   /**
   * The integration ID of the customer profile to whom points were added or deducted.
   * @return profileIntegrationID
  **/
  @ApiModelProperty(example = "URNGV8294NV", required = true, value = "The integration ID of the customer profile to whom points were added or deducted.")

  public String getProfileIntegrationID() {
    return profileIntegrationID;
  }


  public void setProfileIntegrationID(String profileIntegrationID) {
    this.profileIntegrationID = profileIntegrationID;
  }


  public AddedDeductedPointsNotification loyaltyProgramID(Long loyaltyProgramID) {
    
    this.loyaltyProgramID = loyaltyProgramID;
    return this;
  }

   /**
   * The ID of the loyalty program.
   * minimum: 1
   * @return loyaltyProgramID
  **/
  @ApiModelProperty(example = "5", required = true, value = "The ID of the loyalty program.")

  public Long getLoyaltyProgramID() {
    return loyaltyProgramID;
  }


  public void setLoyaltyProgramID(Long loyaltyProgramID) {
    this.loyaltyProgramID = loyaltyProgramID;
  }


  public AddedDeductedPointsNotification subledgerID(String subledgerID) {
    
    this.subledgerID = subledgerID;
    return this;
  }

   /**
   * The ID of the subledger within the loyalty program where these points were added.
   * @return subledgerID
  **/
  @ApiModelProperty(example = "sub-123", required = true, value = "The ID of the subledger within the loyalty program where these points were added.")

  public String getSubledgerID() {
    return subledgerID;
  }


  public void setSubledgerID(String subledgerID) {
    this.subledgerID = subledgerID;
  }


  public AddedDeductedPointsNotification amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of added or deducted loyalty points.
   * @return amount
  **/
  @ApiModelProperty(example = "10.99", required = true, value = "The amount of added or deducted loyalty points.")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public AddedDeductedPointsNotification reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason for the points addition or deduction.
   * @return reason
  **/
  @ApiModelProperty(example = "Compensation", required = true, value = "The reason for the points addition or deduction.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public AddedDeductedPointsNotification typeOfChange(TypeOfChangeEnum typeOfChange) {
    
    this.typeOfChange = typeOfChange;
    return this;
  }

   /**
   * The notification source, that is, it indicates whether the points were added or deducted via one of the following routes:  - [The Campaign Manager](/docs/product/getting-started)  - [Management API](/management-api#tag/Loyalty)  - [Rule Engine](/docs/product/applications/evaluation-order-for-rules-and-filters) 
   * @return typeOfChange
  **/
  @ApiModelProperty(required = true, value = "The notification source, that is, it indicates whether the points were added or deducted via one of the following routes:  - [The Campaign Manager](/docs/product/getting-started)  - [Management API](/management-api#tag/Loyalty)  - [Rule Engine](/docs/product/applications/evaluation-order-for-rules-and-filters) ")

  public TypeOfChangeEnum getTypeOfChange() {
    return typeOfChange;
  }


  public void setTypeOfChange(TypeOfChangeEnum typeOfChange) {
    this.typeOfChange = typeOfChange;
  }


  public AddedDeductedPointsNotification employeeName(String employeeName) {
    
    this.employeeName = employeeName;
    return this;
  }

   /**
   * The name of the employee who added or deducted points.
   * @return employeeName
  **/
  @ApiModelProperty(example = "Franziska Schneider", required = true, value = "The name of the employee who added or deducted points.")

  public String getEmployeeName() {
    return employeeName;
  }


  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }


  public AddedDeductedPointsNotification userID(Long userID) {
    
    this.userID = userID;
    return this;
  }

   /**
   * The ID of the employee who added or deducted points.
   * minimum: 1
   * @return userID
  **/
  @ApiModelProperty(example = "25", required = true, value = "The ID of the employee who added or deducted points.")

  public Long getUserID() {
    return userID;
  }


  public void setUserID(Long userID) {
    this.userID = userID;
  }


  public AddedDeductedPointsNotification operation(OperationEnum operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * The action (addition or deduction) made with loyalty points.
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "The action (addition or deduction) made with loyalty points.")

  public OperationEnum getOperation() {
    return operation;
  }


  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  public AddedDeductedPointsNotification startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date for loyalty points.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-24T14:15:22Z", value = "The start date for loyalty points.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public AddedDeductedPointsNotification expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * The expiration date for loyalty points.
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2024-01-24T14:15:22Z", value = "The expiration date for loyalty points.")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public AddedDeductedPointsNotification sessionIntegrationID(String sessionIntegrationID) {
    
    this.sessionIntegrationID = sessionIntegrationID;
    return this;
  }

   /**
   * The integration ID of the session through which the points were earned or lost.
   * @return sessionIntegrationID
  **/
  @ApiModelProperty(example = "cc53e4fa-547f-4f5e-8333-76e05c381f67", required = true, value = "The integration ID of the session through which the points were earned or lost.")

  public String getSessionIntegrationID() {
    return sessionIntegrationID;
  }


  public void setSessionIntegrationID(String sessionIntegrationID) {
    this.sessionIntegrationID = sessionIntegrationID;
  }


  public AddedDeductedPointsNotification notificationType(NotificationTypeEnum notificationType) {
    
    this.notificationType = notificationType;
    return this;
  }

   /**
   * The type of notification.
   * @return notificationType
  **/
  @ApiModelProperty(required = true, value = "The type of notification.")

  public NotificationTypeEnum getNotificationType() {
    return notificationType;
  }


  public void setNotificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddedDeductedPointsNotification addedDeductedPointsNotification = (AddedDeductedPointsNotification) o;
    return Objects.equals(this.profileIntegrationID, addedDeductedPointsNotification.profileIntegrationID) &&
        Objects.equals(this.loyaltyProgramID, addedDeductedPointsNotification.loyaltyProgramID) &&
        Objects.equals(this.subledgerID, addedDeductedPointsNotification.subledgerID) &&
        Objects.equals(this.amount, addedDeductedPointsNotification.amount) &&
        Objects.equals(this.reason, addedDeductedPointsNotification.reason) &&
        Objects.equals(this.typeOfChange, addedDeductedPointsNotification.typeOfChange) &&
        Objects.equals(this.employeeName, addedDeductedPointsNotification.employeeName) &&
        Objects.equals(this.userID, addedDeductedPointsNotification.userID) &&
        Objects.equals(this.operation, addedDeductedPointsNotification.operation) &&
        Objects.equals(this.startDate, addedDeductedPointsNotification.startDate) &&
        Objects.equals(this.expiryDate, addedDeductedPointsNotification.expiryDate) &&
        Objects.equals(this.sessionIntegrationID, addedDeductedPointsNotification.sessionIntegrationID) &&
        Objects.equals(this.notificationType, addedDeductedPointsNotification.notificationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileIntegrationID, loyaltyProgramID, subledgerID, amount, reason, typeOfChange, employeeName, userID, operation, startDate, expiryDate, sessionIntegrationID, notificationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddedDeductedPointsNotification {\n");
    sb.append("    profileIntegrationID: ").append(toIndentedString(profileIntegrationID)).append("\n");
    sb.append("    loyaltyProgramID: ").append(toIndentedString(loyaltyProgramID)).append("\n");
    sb.append("    subledgerID: ").append(toIndentedString(subledgerID)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    typeOfChange: ").append(toIndentedString(typeOfChange)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    sessionIntegrationID: ").append(toIndentedString(sessionIntegrationID)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
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

