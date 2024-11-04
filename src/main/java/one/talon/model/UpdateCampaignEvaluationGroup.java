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
 * UpdateCampaignEvaluationGroup
 */

public class UpdateCampaignEvaluationGroup {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private Integer parentId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * The mode by which campaigns in the campaign evaluation group are evaluated.
   */
  @JsonAdapter(EvaluationModeEnum.Adapter.class)
  public enum EvaluationModeEnum {
    STACKABLE("stackable"),
    
    LISTORDER("listOrder"),
    
    LOWESTDISCOUNT("lowestDiscount"),
    
    HIGHESTDISCOUNT("highestDiscount");

    private String value;

    EvaluationModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EvaluationModeEnum fromValue(String value) {
      for (EvaluationModeEnum b : EvaluationModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EvaluationModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EvaluationModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EvaluationModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EvaluationModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVALUATION_MODE = "evaluationMode";
  @SerializedName(SERIALIZED_NAME_EVALUATION_MODE)
  private EvaluationModeEnum evaluationMode;

  /**
   * The evaluation scope of the campaign evaluation group.
   */
  @JsonAdapter(EvaluationScopeEnum.Adapter.class)
  public enum EvaluationScopeEnum {
    CARTITEM("cartItem"),
    
    SESSION("session");

    private String value;

    EvaluationScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EvaluationScopeEnum fromValue(String value) {
      for (EvaluationScopeEnum b : EvaluationScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EvaluationScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EvaluationScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EvaluationScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EvaluationScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVALUATION_SCOPE = "evaluationScope";
  @SerializedName(SERIALIZED_NAME_EVALUATION_SCOPE)
  private EvaluationScopeEnum evaluationScope;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;


  public UpdateCampaignEvaluationGroup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the campaign evaluation group.
   * @return name
  **/
  @ApiModelProperty(example = "Summer campaigns", required = true, value = "The name of the campaign evaluation group.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateCampaignEvaluationGroup parentId(Integer parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * The ID of the parent group that contains the campaign evaluation group.
   * minimum: 1
   * @return parentId
  **/
  @ApiModelProperty(example = "2", required = true, value = "The ID of the parent group that contains the campaign evaluation group.")

  public Integer getParentId() {
    return parentId;
  }


  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  public UpdateCampaignEvaluationGroup description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the campaign evaluation group.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This campaign evaluation group contains all campaigns that are running in the summer.", value = "A description of the campaign evaluation group.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateCampaignEvaluationGroup evaluationMode(EvaluationModeEnum evaluationMode) {
    
    this.evaluationMode = evaluationMode;
    return this;
  }

   /**
   * The mode by which campaigns in the campaign evaluation group are evaluated.
   * @return evaluationMode
  **/
  @ApiModelProperty(required = true, value = "The mode by which campaigns in the campaign evaluation group are evaluated.")

  public EvaluationModeEnum getEvaluationMode() {
    return evaluationMode;
  }


  public void setEvaluationMode(EvaluationModeEnum evaluationMode) {
    this.evaluationMode = evaluationMode;
  }


  public UpdateCampaignEvaluationGroup evaluationScope(EvaluationScopeEnum evaluationScope) {
    
    this.evaluationScope = evaluationScope;
    return this;
  }

   /**
   * The evaluation scope of the campaign evaluation group.
   * @return evaluationScope
  **/
  @ApiModelProperty(required = true, value = "The evaluation scope of the campaign evaluation group.")

  public EvaluationScopeEnum getEvaluationScope() {
    return evaluationScope;
  }


  public void setEvaluationScope(EvaluationScopeEnum evaluationScope) {
    this.evaluationScope = evaluationScope;
  }


  public UpdateCampaignEvaluationGroup locked(Boolean locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * An indicator of whether the campaign evaluation group is locked for modification.
   * @return locked
  **/
  @ApiModelProperty(example = "false", required = true, value = "An indicator of whether the campaign evaluation group is locked for modification.")

  public Boolean getLocked() {
    return locked;
  }


  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCampaignEvaluationGroup updateCampaignEvaluationGroup = (UpdateCampaignEvaluationGroup) o;
    return Objects.equals(this.name, updateCampaignEvaluationGroup.name) &&
        Objects.equals(this.parentId, updateCampaignEvaluationGroup.parentId) &&
        Objects.equals(this.description, updateCampaignEvaluationGroup.description) &&
        Objects.equals(this.evaluationMode, updateCampaignEvaluationGroup.evaluationMode) &&
        Objects.equals(this.evaluationScope, updateCampaignEvaluationGroup.evaluationScope) &&
        Objects.equals(this.locked, updateCampaignEvaluationGroup.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parentId, description, evaluationMode, evaluationScope, locked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCampaignEvaluationGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    evaluationMode: ").append(toIndentedString(evaluationMode)).append("\n");
    sb.append("    evaluationScope: ").append(toIndentedString(evaluationScope)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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

