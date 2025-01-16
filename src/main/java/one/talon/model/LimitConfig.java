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
import java.util.ArrayList;
import java.util.List;

/**
 * LimitConfig
 */

public class LimitConfig {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private BigDecimal limit;

  /**
   * The period on which the budget limit recurs.
   */
  @JsonAdapter(PeriodEnum.Adapter.class)
  public enum PeriodEnum {
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    YEARLY("yearly");

    private String value;

    PeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodEnum fromValue(String value) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PeriodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private PeriodEnum period;

  /**
   * Gets or Sets entities
   */
  @JsonAdapter(EntitiesEnum.Adapter.class)
  public enum EntitiesEnum {
    COUPON("Coupon"),
    
    REFERRAL("Referral"),
    
    PROFILE("Profile"),
    
    IDENTIFIER("Identifier"),
    
    STORE("Store"),
    
    SESSION("Session");

    private String value;

    EntitiesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntitiesEnum fromValue(String value) {
      for (EntitiesEnum b : EntitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntitiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntitiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntitiesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntitiesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private List<EntitiesEnum> entities = new ArrayList<EntitiesEnum>();


  public LimitConfig action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * The limitable action to which this limit applies. For example: - &#x60;setDiscount&#x60; - &#x60;setDiscountEffect&#x60; - &#x60;redeemCoupon&#x60; - &#x60;createCoupon&#x60; 
   * @return action
  **/
  @ApiModelProperty(example = "createCoupon", required = true, value = "The limitable action to which this limit applies. For example: - `setDiscount` - `setDiscountEffect` - `redeemCoupon` - `createCoupon` ")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public LimitConfig limit(BigDecimal limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The value to set for the limit.
   * minimum: 0
   * @return limit
  **/
  @ApiModelProperty(example = "1000.0", required = true, value = "The value to set for the limit.")

  public BigDecimal getLimit() {
    return limit;
  }


  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }


  public LimitConfig period(PeriodEnum period) {
    
    this.period = period;
    return this;
  }

   /**
   * The period on which the budget limit recurs.
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yearly", value = "The period on which the budget limit recurs.")

  public PeriodEnum getPeriod() {
    return period;
  }


  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }


  public LimitConfig entities(List<EntitiesEnum> entities) {
    
    this.entities = entities;
    return this;
  }

  public LimitConfig addEntitiesItem(EntitiesEnum entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * The entity that this limit applies to.
   * @return entities
  **/
  @ApiModelProperty(example = "[Coupon]", required = true, value = "The entity that this limit applies to.")

  public List<EntitiesEnum> getEntities() {
    return entities;
  }


  public void setEntities(List<EntitiesEnum> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitConfig limitConfig = (LimitConfig) o;
    return Objects.equals(this.action, limitConfig.action) &&
        Objects.equals(this.limit, limitConfig.limit) &&
        Objects.equals(this.period, limitConfig.period) &&
        Objects.equals(this.entities, limitConfig.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, limit, period, entities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitConfig {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

