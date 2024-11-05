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
import one.talon.model.TimePoint;
import org.threeten.bp.OffsetDateTime;

/**
 * CreateAchievement
 */

public class CreateAchievement {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private BigDecimal target;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private String period;

  public static final String SERIALIZED_NAME_PERIOD_END_OVERRIDE = "periodEndOverride";
  @SerializedName(SERIALIZED_NAME_PERIOD_END_OVERRIDE)
  private TimePoint periodEndOverride;

  /**
   * The policy that determines if and how the achievement recurs. - &#x60;no_recurrence&#x60;: The achievement can be completed only once. - &#x60;on_expiration&#x60;: The achievement resets after it expires and becomes available again. 
   */
  @JsonAdapter(RecurrencePolicyEnum.Adapter.class)
  public enum RecurrencePolicyEnum {
    NO_RECURRENCE("no_recurrence"),
    
    ON_EXPIRATION("on_expiration");

    private String value;

    RecurrencePolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecurrencePolicyEnum fromValue(String value) {
      for (RecurrencePolicyEnum b : RecurrencePolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RecurrencePolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecurrencePolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecurrencePolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RecurrencePolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RECURRENCE_POLICY = "recurrencePolicy";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_POLICY)
  private RecurrencePolicyEnum recurrencePolicy;

  /**
   * The policy that determines how the achievement starts, ends, or resets. - &#x60;user_action&#x60;: The achievement ends or resets relative to when the customer started the achievement. - &#x60;fixed_schedule&#x60;: The achievement starts, ends, or resets for all customers following a fixed schedule. 
   */
  @JsonAdapter(ActivationPolicyEnum.Adapter.class)
  public enum ActivationPolicyEnum {
    USER_ACTION("user_action"),
    
    FIXED_SCHEDULE("fixed_schedule");

    private String value;

    ActivationPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActivationPolicyEnum fromValue(String value) {
      for (ActivationPolicyEnum b : ActivationPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActivationPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActivationPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActivationPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActivationPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTIVATION_POLICY = "activationPolicy";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_POLICY)
  private ActivationPolicyEnum activationPolicy;

  public static final String SERIALIZED_NAME_FIXED_START_DATE = "fixedStartDate";
  @SerializedName(SERIALIZED_NAME_FIXED_START_DATE)
  private OffsetDateTime fixedStartDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;


  public CreateAchievement name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The internal name of the achievement used in API requests.  **Note**: The name should start with a letter. This cannot be changed after the achievement has been created. 
   * @return name
  **/
  @ApiModelProperty(example = "Order50Discount", required = true, value = "The internal name of the achievement used in API requests.  **Note**: The name should start with a letter. This cannot be changed after the achievement has been created. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateAchievement title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The display name for the achievement in the Campaign Manager.
   * @return title
  **/
  @ApiModelProperty(example = "50% off on 50th purchase.", required = true, value = "The display name for the achievement in the Campaign Manager.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CreateAchievement description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the achievement.
   * @return description
  **/
  @ApiModelProperty(example = "50% off for every 50th purchase in a year.", required = true, value = "A description of the achievement.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateAchievement target(BigDecimal target) {
    
    this.target = target;
    return this;
  }

   /**
   * The required number of actions or the transactional milestone to complete the achievement.
   * @return target
  **/
  @ApiModelProperty(example = "50.0", required = true, value = "The required number of actions or the transactional milestone to complete the achievement.")

  public BigDecimal getTarget() {
    return target;
  }


  public void setTarget(BigDecimal target) {
    this.target = target;
  }


  public CreateAchievement period(String period) {
    
    this.period = period;
    return this;
  }

   /**
   * The relative duration after which the achievement ends and resets for a particular customer profile.  **Note**: The &#x60;period&#x60; does not start when the achievement is created.  The period is a **positive real number** followed by one letter indicating the time unit.  Examples: &#x60;30s&#x60;, &#x60;40m&#x60;, &#x60;1h&#x60;, &#x60;5D&#x60;, &#x60;7W&#x60;, &#x60;10M&#x60;, &#x60;15Y&#x60;.  Available units:  - &#x60;s&#x60;: seconds - &#x60;m&#x60;: minutes - &#x60;h&#x60;: hours - &#x60;D&#x60;: days - &#x60;W&#x60;: weeks - &#x60;M&#x60;: months - &#x60;Y&#x60;: years  You can also round certain units down to the beginning of period and up to the end of period.: - &#x60;_D&#x60; for rounding down days only. Signifies the start of the day. Example: &#x60;30D_D&#x60; - &#x60;_U&#x60; for rounding up days, weeks, months and years. Signifies the end of the day, week, month or year. Example: &#x60;23W_U&#x60;  **Note**: You can either use the round down and round up option or set an absolute period. 
   * @return period
  **/
  @ApiModelProperty(example = "1Y", required = true, value = "The relative duration after which the achievement ends and resets for a particular customer profile.  **Note**: The `period` does not start when the achievement is created.  The period is a **positive real number** followed by one letter indicating the time unit.  Examples: `30s`, `40m`, `1h`, `5D`, `7W`, `10M`, `15Y`.  Available units:  - `s`: seconds - `m`: minutes - `h`: hours - `D`: days - `W`: weeks - `M`: months - `Y`: years  You can also round certain units down to the beginning of period and up to the end of period.: - `_D` for rounding down days only. Signifies the start of the day. Example: `30D_D` - `_U` for rounding up days, weeks, months and years. Signifies the end of the day, week, month or year. Example: `23W_U`  **Note**: You can either use the round down and round up option or set an absolute period. ")

  public String getPeriod() {
    return period;
  }


  public void setPeriod(String period) {
    this.period = period;
  }


  public CreateAchievement periodEndOverride(TimePoint periodEndOverride) {
    
    this.periodEndOverride = periodEndOverride;
    return this;
  }

   /**
   * Get periodEndOverride
   * @return periodEndOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimePoint getPeriodEndOverride() {
    return periodEndOverride;
  }


  public void setPeriodEndOverride(TimePoint periodEndOverride) {
    this.periodEndOverride = periodEndOverride;
  }


  public CreateAchievement recurrencePolicy(RecurrencePolicyEnum recurrencePolicy) {
    
    this.recurrencePolicy = recurrencePolicy;
    return this;
  }

   /**
   * The policy that determines if and how the achievement recurs. - &#x60;no_recurrence&#x60;: The achievement can be completed only once. - &#x60;on_expiration&#x60;: The achievement resets after it expires and becomes available again. 
   * @return recurrencePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "no_recurrence", value = "The policy that determines if and how the achievement recurs. - `no_recurrence`: The achievement can be completed only once. - `on_expiration`: The achievement resets after it expires and becomes available again. ")

  public RecurrencePolicyEnum getRecurrencePolicy() {
    return recurrencePolicy;
  }


  public void setRecurrencePolicy(RecurrencePolicyEnum recurrencePolicy) {
    this.recurrencePolicy = recurrencePolicy;
  }


  public CreateAchievement activationPolicy(ActivationPolicyEnum activationPolicy) {
    
    this.activationPolicy = activationPolicy;
    return this;
  }

   /**
   * The policy that determines how the achievement starts, ends, or resets. - &#x60;user_action&#x60;: The achievement ends or resets relative to when the customer started the achievement. - &#x60;fixed_schedule&#x60;: The achievement starts, ends, or resets for all customers following a fixed schedule. 
   * @return activationPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fixed_schedule", value = "The policy that determines how the achievement starts, ends, or resets. - `user_action`: The achievement ends or resets relative to when the customer started the achievement. - `fixed_schedule`: The achievement starts, ends, or resets for all customers following a fixed schedule. ")

  public ActivationPolicyEnum getActivationPolicy() {
    return activationPolicy;
  }


  public void setActivationPolicy(ActivationPolicyEnum activationPolicy) {
    this.activationPolicy = activationPolicy;
  }


  public CreateAchievement fixedStartDate(OffsetDateTime fixedStartDate) {
    
    this.fixedStartDate = fixedStartDate;
    return this;
  }

   /**
   * The achievement&#39;s start date when &#x60;activationPolicy&#x60; is set to &#x60;fixed_schedule&#x60;.  **Note:** It must be an RFC3339 timestamp string. 
   * @return fixedStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The achievement's start date when `activationPolicy` is set to `fixed_schedule`.  **Note:** It must be an RFC3339 timestamp string. ")

  public OffsetDateTime getFixedStartDate() {
    return fixedStartDate;
  }


  public void setFixedStartDate(OffsetDateTime fixedStartDate) {
    this.fixedStartDate = fixedStartDate;
  }


  public CreateAchievement endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The achievement&#39;s end date. If defined, customers cannot participate in the achievement after this date.  **Note:** It must be an RFC3339 timestamp string. 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The achievement's end date. If defined, customers cannot participate in the achievement after this date.  **Note:** It must be an RFC3339 timestamp string. ")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAchievement createAchievement = (CreateAchievement) o;
    return Objects.equals(this.name, createAchievement.name) &&
        Objects.equals(this.title, createAchievement.title) &&
        Objects.equals(this.description, createAchievement.description) &&
        Objects.equals(this.target, createAchievement.target) &&
        Objects.equals(this.period, createAchievement.period) &&
        Objects.equals(this.periodEndOverride, createAchievement.periodEndOverride) &&
        Objects.equals(this.recurrencePolicy, createAchievement.recurrencePolicy) &&
        Objects.equals(this.activationPolicy, createAchievement.activationPolicy) &&
        Objects.equals(this.fixedStartDate, createAchievement.fixedStartDate) &&
        Objects.equals(this.endDate, createAchievement.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, description, target, period, periodEndOverride, recurrencePolicy, activationPolicy, fixedStartDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAchievement {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodEndOverride: ").append(toIndentedString(periodEndOverride)).append("\n");
    sb.append("    recurrencePolicy: ").append(toIndentedString(recurrencePolicy)).append("\n");
    sb.append("    activationPolicy: ").append(toIndentedString(activationPolicy)).append("\n");
    sb.append("    fixedStartDate: ").append(toIndentedString(fixedStartDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

