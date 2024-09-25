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
import org.threeten.bp.OffsetDateTime;

/**
 * Tier
 */

public class Tier {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  /**
   * The policy that defines how customer tiers are downgraded in the loyalty program after tier reevaluation.  - &#x60;one_down&#x60;: If the customer doesn&#39;t have enough points to stay in the current tier, they are downgraded by one tier.  - &#x60;balance_based&#x60;: The customer&#39;s tier is reevaluated based on the amount of active points they have at the moment. 
   */
  @JsonAdapter(DowngradePolicyEnum.Adapter.class)
  public enum DowngradePolicyEnum {
    ONE_DOWN("one_down"),
    
    BALANCE_BASED("balance_based");

    private String value;

    DowngradePolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DowngradePolicyEnum fromValue(String value) {
      for (DowngradePolicyEnum b : DowngradePolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DowngradePolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DowngradePolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DowngradePolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DowngradePolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DOWNGRADE_POLICY = "downgradePolicy";
  @SerializedName(SERIALIZED_NAME_DOWNGRADE_POLICY)
  private DowngradePolicyEnum downgradePolicy;


  public Tier id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The internal ID of the tier.
   * @return id
  **/
  @ApiModelProperty(example = "11", required = true, value = "The internal ID of the tier.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Tier name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the tier.
   * @return name
  **/
  @ApiModelProperty(example = "bronze", required = true, value = "The name of the tier.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Tier startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Date and time when the customer moved to this tier. This value uses the loyalty program&#39;s time zone setting.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time when the customer moved to this tier. This value uses the loyalty program's time zone setting.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public Tier expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Date when tier level expires in the RFC3339 format (in the Loyalty Program&#39;s timezone).
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when tier level expires in the RFC3339 format (in the Loyalty Program's timezone).")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public Tier downgradePolicy(DowngradePolicyEnum downgradePolicy) {
    
    this.downgradePolicy = downgradePolicy;
    return this;
  }

   /**
   * The policy that defines how customer tiers are downgraded in the loyalty program after tier reevaluation.  - &#x60;one_down&#x60;: If the customer doesn&#39;t have enough points to stay in the current tier, they are downgraded by one tier.  - &#x60;balance_based&#x60;: The customer&#39;s tier is reevaluated based on the amount of active points they have at the moment. 
   * @return downgradePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The policy that defines how customer tiers are downgraded in the loyalty program after tier reevaluation.  - `one_down`: If the customer doesn't have enough points to stay in the current tier, they are downgraded by one tier.  - `balance_based`: The customer's tier is reevaluated based on the amount of active points they have at the moment. ")

  public DowngradePolicyEnum getDowngradePolicy() {
    return downgradePolicy;
  }


  public void setDowngradePolicy(DowngradePolicyEnum downgradePolicy) {
    this.downgradePolicy = downgradePolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tier tier = (Tier) o;
    return Objects.equals(this.id, tier.id) &&
        Objects.equals(this.name, tier.name) &&
        Objects.equals(this.startDate, tier.startDate) &&
        Objects.equals(this.expiryDate, tier.expiryDate) &&
        Objects.equals(this.downgradePolicy, tier.downgradePolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, startDate, expiryDate, downgradePolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tier {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    downgradePolicy: ").append(toIndentedString(downgradePolicy)).append("\n");
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

