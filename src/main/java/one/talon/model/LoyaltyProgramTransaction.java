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
import one.talon.model.LoyaltyLedgerEntryFlags;
import org.threeten.bp.OffsetDateTime;

/**
 * LoyaltyProgramTransaction
 */

public class LoyaltyProgramTransaction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_PROGRAM_ID = "programId";
  @SerializedName(SERIALIZED_NAME_PROGRAM_ID)
  private Long programId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  /**
   * Type of transaction. Possible values:   - &#x60;addition&#x60;: Signifies added points.   - &#x60;subtraction&#x60;: Signifies deducted points. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ADDITION("addition"),
    
    SUBTRACTION("subtraction");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private String expiryDate;

  public static final String SERIALIZED_NAME_CUSTOMER_PROFILE_ID = "customerProfileId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PROFILE_ID)
  private String customerProfileId;

  public static final String SERIALIZED_NAME_CARD_IDENTIFIER = "cardIdentifier";
  @SerializedName(SERIALIZED_NAME_CARD_IDENTIFIER)
  private String cardIdentifier;

  public static final String SERIALIZED_NAME_SUBLEDGER_ID = "subledgerId";
  @SerializedName(SERIALIZED_NAME_SUBLEDGER_ID)
  private String subledgerId;

  public static final String SERIALIZED_NAME_CUSTOMER_SESSION_ID = "customerSessionId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SESSION_ID)
  private String customerSessionId;

  public static final String SERIALIZED_NAME_IMPORT_ID = "importId";
  @SerializedName(SERIALIZED_NAME_IMPORT_ID)
  private Long importId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_USER_EMAIL = "userEmail";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  private String userEmail;

  public static final String SERIALIZED_NAME_RULESET_ID = "rulesetId";
  @SerializedName(SERIALIZED_NAME_RULESET_ID)
  private Long rulesetId;

  public static final String SERIALIZED_NAME_RULE_NAME = "ruleName";
  @SerializedName(SERIALIZED_NAME_RULE_NAME)
  private String ruleName;

  public static final String SERIALIZED_NAME_FLAGS = "flags";
  @SerializedName(SERIALIZED_NAME_FLAGS)
  private LoyaltyLedgerEntryFlags flags;


  public LoyaltyProgramTransaction id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the loyalty ledger transaction.
   * @return id
  **/
  @ApiModelProperty(example = "123", required = true, value = "ID of the loyalty ledger transaction.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public LoyaltyProgramTransaction programId(Long programId) {
    
    this.programId = programId;
    return this;
  }

   /**
   * ID of the loyalty program.
   * @return programId
  **/
  @ApiModelProperty(example = "324", required = true, value = "ID of the loyalty program.")

  public Long getProgramId() {
    return programId;
  }


  public void setProgramId(Long programId) {
    this.programId = programId;
  }


  public LoyaltyProgramTransaction campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * ID of the campaign.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "324", value = "ID of the campaign.")

  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public LoyaltyProgramTransaction created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Date and time the loyalty transaction occurred.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "Date and time the loyalty transaction occurred.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public LoyaltyProgramTransaction type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of transaction. Possible values:   - &#x60;addition&#x60;: Signifies added points.   - &#x60;subtraction&#x60;: Signifies deducted points. 
   * @return type
  **/
  @ApiModelProperty(example = "addition", required = true, value = "Type of transaction. Possible values:   - `addition`: Signifies added points.   - `subtraction`: Signifies deducted points. ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public LoyaltyProgramTransaction amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount of loyalty points added or deducted in the transaction.
   * @return amount
  **/
  @ApiModelProperty(example = "10.25", required = true, value = "Amount of loyalty points added or deducted in the transaction.")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public LoyaltyProgramTransaction name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name or reason for the loyalty ledger transaction.
   * @return name
  **/
  @ApiModelProperty(example = "Reward 50 points for each $500 purchase", required = true, value = "Name or reason for the loyalty ledger transaction.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LoyaltyProgramTransaction startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * When points become active. Possible values:   - &#x60;immediate&#x60;: Points are immediately active.   - a timestamp value: Points become active at a given date and time. 
   * @return startDate
  **/
  @ApiModelProperty(example = "2022-01-02T15:04:05Z07:00", required = true, value = "When points become active. Possible values:   - `immediate`: Points are immediately active.   - a timestamp value: Points become active at a given date and time. ")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public LoyaltyProgramTransaction expiryDate(String expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * When points expire. Possible values:   - &#x60;unlimited&#x60;: Points have no expiration date.   - a timestamp value: Points expire at a given date and time. 
   * @return expiryDate
  **/
  @ApiModelProperty(example = "2022-01-02T15:04:05Z07:00", required = true, value = "When points expire. Possible values:   - `unlimited`: Points have no expiration date.   - a timestamp value: Points expire at a given date and time. ")

  public String getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }


  public LoyaltyProgramTransaction customerProfileId(String customerProfileId) {
    
    this.customerProfileId = customerProfileId;
    return this;
  }

   /**
   * Customer profile integration ID used in the loyalty program.
   * @return customerProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "kda0fajs0-fad9f-fd9dfsa9-fd9dasjf9", value = "Customer profile integration ID used in the loyalty program.")

  public String getCustomerProfileId() {
    return customerProfileId;
  }


  public void setCustomerProfileId(String customerProfileId) {
    this.customerProfileId = customerProfileId;
  }


  public LoyaltyProgramTransaction cardIdentifier(String cardIdentifier) {
    
    this.cardIdentifier = cardIdentifier;
    return this;
  }

   /**
   * The alphanumeric identifier of the loyalty card. 
   * @return cardIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "summer-loyalty-card-0543", value = "The alphanumeric identifier of the loyalty card. ")

  public String getCardIdentifier() {
    return cardIdentifier;
  }


  public void setCardIdentifier(String cardIdentifier) {
    this.cardIdentifier = cardIdentifier;
  }


  public LoyaltyProgramTransaction subledgerId(String subledgerId) {
    
    this.subledgerId = subledgerId;
    return this;
  }

   /**
   * ID of the subledger.
   * @return subledgerId
  **/
  @ApiModelProperty(example = "sub-123", required = true, value = "ID of the subledger.")

  public String getSubledgerId() {
    return subledgerId;
  }


  public void setSubledgerId(String subledgerId) {
    this.subledgerId = subledgerId;
  }


  public LoyaltyProgramTransaction customerSessionId(String customerSessionId) {
    
    this.customerSessionId = customerSessionId;
    return this;
  }

   /**
   * ID of the customer session where the transaction occurred.
   * @return customerSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05c2da0d-48fa-4aa1-b629-898f58f1584d", value = "ID of the customer session where the transaction occurred.")

  public String getCustomerSessionId() {
    return customerSessionId;
  }


  public void setCustomerSessionId(String customerSessionId) {
    this.customerSessionId = customerSessionId;
  }


  public LoyaltyProgramTransaction importId(Long importId) {
    
    this.importId = importId;
    return this;
  }

   /**
   * ID of the import where the transaction occurred.
   * @return importId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "ID of the import where the transaction occurred.")

  public Long getImportId() {
    return importId;
  }


  public void setImportId(Long importId) {
    this.importId = importId;
  }


  public LoyaltyProgramTransaction userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * ID of the user who manually added or deducted points. Applies only to manual transactions.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "ID of the user who manually added or deducted points. Applies only to manual transactions.")

  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public LoyaltyProgramTransaction userEmail(String userEmail) {
    
    this.userEmail = userEmail;
    return this;
  }

   /**
   * The email of the Campaign Manager account that manually added or deducted points. Applies only to manual transactions.
   * @return userEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john.doe@example.com", value = "The email of the Campaign Manager account that manually added or deducted points. Applies only to manual transactions.")

  public String getUserEmail() {
    return userEmail;
  }


  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public LoyaltyProgramTransaction rulesetId(Long rulesetId) {
    
    this.rulesetId = rulesetId;
    return this;
  }

   /**
   * ID of the ruleset containing the rule that triggered the effect. Applies only for transactions that resulted from a customer session.
   * @return rulesetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11", value = "ID of the ruleset containing the rule that triggered the effect. Applies only for transactions that resulted from a customer session.")

  public Long getRulesetId() {
    return rulesetId;
  }


  public void setRulesetId(Long rulesetId) {
    this.rulesetId = rulesetId;
  }


  public LoyaltyProgramTransaction ruleName(String ruleName) {
    
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Name of the rule that triggered the effect. Applies only for transactions that resulted from a customer session.
   * @return ruleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10 points for every $100 spent", value = "Name of the rule that triggered the effect. Applies only for transactions that resulted from a customer session.")

  public String getRuleName() {
    return ruleName;
  }


  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public LoyaltyProgramTransaction flags(LoyaltyLedgerEntryFlags flags) {
    
    this.flags = flags;
    return this;
  }

   /**
   * Get flags
   * @return flags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoyaltyLedgerEntryFlags getFlags() {
    return flags;
  }


  public void setFlags(LoyaltyLedgerEntryFlags flags) {
    this.flags = flags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyProgramTransaction loyaltyProgramTransaction = (LoyaltyProgramTransaction) o;
    return Objects.equals(this.id, loyaltyProgramTransaction.id) &&
        Objects.equals(this.programId, loyaltyProgramTransaction.programId) &&
        Objects.equals(this.campaignId, loyaltyProgramTransaction.campaignId) &&
        Objects.equals(this.created, loyaltyProgramTransaction.created) &&
        Objects.equals(this.type, loyaltyProgramTransaction.type) &&
        Objects.equals(this.amount, loyaltyProgramTransaction.amount) &&
        Objects.equals(this.name, loyaltyProgramTransaction.name) &&
        Objects.equals(this.startDate, loyaltyProgramTransaction.startDate) &&
        Objects.equals(this.expiryDate, loyaltyProgramTransaction.expiryDate) &&
        Objects.equals(this.customerProfileId, loyaltyProgramTransaction.customerProfileId) &&
        Objects.equals(this.cardIdentifier, loyaltyProgramTransaction.cardIdentifier) &&
        Objects.equals(this.subledgerId, loyaltyProgramTransaction.subledgerId) &&
        Objects.equals(this.customerSessionId, loyaltyProgramTransaction.customerSessionId) &&
        Objects.equals(this.importId, loyaltyProgramTransaction.importId) &&
        Objects.equals(this.userId, loyaltyProgramTransaction.userId) &&
        Objects.equals(this.userEmail, loyaltyProgramTransaction.userEmail) &&
        Objects.equals(this.rulesetId, loyaltyProgramTransaction.rulesetId) &&
        Objects.equals(this.ruleName, loyaltyProgramTransaction.ruleName) &&
        Objects.equals(this.flags, loyaltyProgramTransaction.flags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, programId, campaignId, created, type, amount, name, startDate, expiryDate, customerProfileId, cardIdentifier, subledgerId, customerSessionId, importId, userId, userEmail, rulesetId, ruleName, flags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyProgramTransaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    customerProfileId: ").append(toIndentedString(customerProfileId)).append("\n");
    sb.append("    cardIdentifier: ").append(toIndentedString(cardIdentifier)).append("\n");
    sb.append("    subledgerId: ").append(toIndentedString(subledgerId)).append("\n");
    sb.append("    customerSessionId: ").append(toIndentedString(customerSessionId)).append("\n");
    sb.append("    importId: ").append(toIndentedString(importId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    rulesetId: ").append(toIndentedString(rulesetId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
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

