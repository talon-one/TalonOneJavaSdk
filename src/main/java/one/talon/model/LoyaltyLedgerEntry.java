/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * OpenAPI spec version: 1.0.0
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
 * A single row of the ledger, describing one addition or deduction.
 */
@ApiModel(description = "A single row of the ledger, describing one addition or deduction.")

public class LoyaltyLedgerEntry {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_PROGRAM_I_D = "programID";
  @SerializedName(SERIALIZED_NAME_PROGRAM_I_D)
  private Integer programID;

  public static final String SERIALIZED_NAME_CUSTOMER_PROFILE_I_D = "customerProfileID";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PROFILE_I_D)
  private String customerProfileID;

  public static final String SERIALIZED_NAME_CUSTOMER_SESSION_I_D = "customerSessionID";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SESSION_I_D)
  private String customerSessionID;

  public static final String SERIALIZED_NAME_EVENT_I_D = "eventID";
  @SerializedName(SERIALIZED_NAME_EVENT_I_D)
  private Integer eventID;

  /**
   * Gets or Sets type
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

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public LoyaltyLedgerEntry created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public LoyaltyLedgerEntry programID(Integer programID) {
    this.programID = programID;
    return this;
  }

   /**
   * Get programID
   * @return programID
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getProgramID() {
    return programID;
  }

  public void setProgramID(Integer programID) {
    this.programID = programID;
  }

  public LoyaltyLedgerEntry customerProfileID(String customerProfileID) {
    this.customerProfileID = customerProfileID;
    return this;
  }

   /**
   * Get customerProfileID
   * @return customerProfileID
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCustomerProfileID() {
    return customerProfileID;
  }

  public void setCustomerProfileID(String customerProfileID) {
    this.customerProfileID = customerProfileID;
  }

  public LoyaltyLedgerEntry customerSessionID(String customerSessionID) {
    this.customerSessionID = customerSessionID;
    return this;
  }

   /**
   * Get customerSessionID
   * @return customerSessionID
  **/
  @ApiModelProperty(value = "")
  public String getCustomerSessionID() {
    return customerSessionID;
  }

  public void setCustomerSessionID(String customerSessionID) {
    this.customerSessionID = customerSessionID;
  }

  public LoyaltyLedgerEntry eventID(Integer eventID) {
    this.eventID = eventID;
    return this;
  }

   /**
   * Get eventID
   * @return eventID
  **/
  @ApiModelProperty(value = "")
  public Integer getEventID() {
    return eventID;
  }

  public void setEventID(Integer eventID) {
    this.eventID = eventID;
  }

  public LoyaltyLedgerEntry type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public LoyaltyLedgerEntry amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public LoyaltyLedgerEntry expiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }

  public LoyaltyLedgerEntry name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A name referencing the condition or effect that added this entry, or the specific name provided in an API call.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A name referencing the condition or effect that added this entry, or the specific name provided in an API call.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyLedgerEntry loyaltyLedgerEntry = (LoyaltyLedgerEntry) o;
    return Objects.equals(this.created, loyaltyLedgerEntry.created) &&
        Objects.equals(this.programID, loyaltyLedgerEntry.programID) &&
        Objects.equals(this.customerProfileID, loyaltyLedgerEntry.customerProfileID) &&
        Objects.equals(this.customerSessionID, loyaltyLedgerEntry.customerSessionID) &&
        Objects.equals(this.eventID, loyaltyLedgerEntry.eventID) &&
        Objects.equals(this.type, loyaltyLedgerEntry.type) &&
        Objects.equals(this.amount, loyaltyLedgerEntry.amount) &&
        Objects.equals(this.expiryDate, loyaltyLedgerEntry.expiryDate) &&
        Objects.equals(this.name, loyaltyLedgerEntry.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, programID, customerProfileID, customerSessionID, eventID, type, amount, expiryDate, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyLedgerEntry {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    programID: ").append(toIndentedString(programID)).append("\n");
    sb.append("    customerProfileID: ").append(toIndentedString(customerProfileID)).append("\n");
    sb.append("    customerSessionID: ").append(toIndentedString(customerSessionID)).append("\n");
    sb.append("    eventID: ").append(toIndentedString(eventID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
