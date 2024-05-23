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
 * ExpiringCouponsNotificationTrigger
 */

public class ExpiringCouponsNotificationTrigger {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  /**
   * Notification period indicated by a letter; \&quot;w\&quot; means week, \&quot;d\&quot; means day.
   */
  @JsonAdapter(PeriodEnum.Adapter.class)
  public enum PeriodEnum {
    W("w"),
    
    D("d");

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


  public ExpiringCouponsNotificationTrigger amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of period.
   * minimum: 0
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of period.")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ExpiringCouponsNotificationTrigger period(PeriodEnum period) {
    
    this.period = period;
    return this;
  }

   /**
   * Notification period indicated by a letter; \&quot;w\&quot; means week, \&quot;d\&quot; means day.
   * @return period
  **/
  @ApiModelProperty(required = true, value = "Notification period indicated by a letter; \"w\" means week, \"d\" means day.")

  public PeriodEnum getPeriod() {
    return period;
  }


  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpiringCouponsNotificationTrigger expiringCouponsNotificationTrigger = (ExpiringCouponsNotificationTrigger) o;
    return Objects.equals(this.amount, expiringCouponsNotificationTrigger.amount) &&
        Objects.equals(this.period, expiringCouponsNotificationTrigger.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, period);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpiringCouponsNotificationTrigger {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

