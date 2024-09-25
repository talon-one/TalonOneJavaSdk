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

/**
 * The properties specific to the \&quot;rollbackIncreasedAchievementProgress\&quot; effect. This gets triggered whenever a closed session where the &#x60;increaseAchievementProgress&#x60; effect was triggered is cancelled. This is applicable only when the customer has not completed the achievement.
 */
@ApiModel(description = "The properties specific to the \"rollbackIncreasedAchievementProgress\" effect. This gets triggered whenever a closed session where the `increaseAchievementProgress` effect was triggered is cancelled. This is applicable only when the customer has not completed the achievement.")

public class RollbackIncreasedAchievementProgressEffectProps {
  public static final String SERIALIZED_NAME_ACHIEVEMENT_ID = "achievementId";
  @SerializedName(SERIALIZED_NAME_ACHIEVEMENT_ID)
  private Integer achievementId;

  public static final String SERIALIZED_NAME_ACHIEVEMENT_NAME = "achievementName";
  @SerializedName(SERIALIZED_NAME_ACHIEVEMENT_NAME)
  private String achievementName;

  public static final String SERIALIZED_NAME_PROGRESS_TRACKER_ID = "progressTrackerId";
  @SerializedName(SERIALIZED_NAME_PROGRESS_TRACKER_ID)
  private Integer progressTrackerId;

  public static final String SERIALIZED_NAME_DECREASE_PROGRESS_BY = "decreaseProgressBy";
  @SerializedName(SERIALIZED_NAME_DECREASE_PROGRESS_BY)
  private BigDecimal decreaseProgressBy;

  public static final String SERIALIZED_NAME_CURRENT_PROGRESS = "currentProgress";
  @SerializedName(SERIALIZED_NAME_CURRENT_PROGRESS)
  private BigDecimal currentProgress;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private BigDecimal target;


  public RollbackIncreasedAchievementProgressEffectProps achievementId(Integer achievementId) {
    
    this.achievementId = achievementId;
    return this;
  }

   /**
   * The internal ID of the achievement.
   * @return achievementId
  **/
  @ApiModelProperty(example = "10", required = true, value = "The internal ID of the achievement.")

  public Integer getAchievementId() {
    return achievementId;
  }


  public void setAchievementId(Integer achievementId) {
    this.achievementId = achievementId;
  }


  public RollbackIncreasedAchievementProgressEffectProps achievementName(String achievementName) {
    
    this.achievementName = achievementName;
    return this;
  }

   /**
   * The name of the achievement.
   * @return achievementName
  **/
  @ApiModelProperty(example = "FreeCoffee10Orders", required = true, value = "The name of the achievement.")

  public String getAchievementName() {
    return achievementName;
  }


  public void setAchievementName(String achievementName) {
    this.achievementName = achievementName;
  }


  public RollbackIncreasedAchievementProgressEffectProps progressTrackerId(Integer progressTrackerId) {
    
    this.progressTrackerId = progressTrackerId;
    return this;
  }

   /**
   * The internal ID of the achievement progress tracker.
   * @return progressTrackerId
  **/
  @ApiModelProperty(required = true, value = "The internal ID of the achievement progress tracker.")

  public Integer getProgressTrackerId() {
    return progressTrackerId;
  }


  public void setProgressTrackerId(Integer progressTrackerId) {
    this.progressTrackerId = progressTrackerId;
  }


  public RollbackIncreasedAchievementProgressEffectProps decreaseProgressBy(BigDecimal decreaseProgressBy) {
    
    this.decreaseProgressBy = decreaseProgressBy;
    return this;
  }

   /**
   * The value by which the customer&#39;s current progress in the achievement is decreased.
   * @return decreaseProgressBy
  **/
  @ApiModelProperty(required = true, value = "The value by which the customer's current progress in the achievement is decreased.")

  public BigDecimal getDecreaseProgressBy() {
    return decreaseProgressBy;
  }


  public void setDecreaseProgressBy(BigDecimal decreaseProgressBy) {
    this.decreaseProgressBy = decreaseProgressBy;
  }


  public RollbackIncreasedAchievementProgressEffectProps currentProgress(BigDecimal currentProgress) {
    
    this.currentProgress = currentProgress;
    return this;
  }

   /**
   * The current progress of the customer in the achievement.
   * @return currentProgress
  **/
  @ApiModelProperty(required = true, value = "The current progress of the customer in the achievement.")

  public BigDecimal getCurrentProgress() {
    return currentProgress;
  }


  public void setCurrentProgress(BigDecimal currentProgress) {
    this.currentProgress = currentProgress;
  }


  public RollbackIncreasedAchievementProgressEffectProps target(BigDecimal target) {
    
    this.target = target;
    return this;
  }

   /**
   * The target value to complete the achievement.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "The target value to complete the achievement.")

  public BigDecimal getTarget() {
    return target;
  }


  public void setTarget(BigDecimal target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RollbackIncreasedAchievementProgressEffectProps rollbackIncreasedAchievementProgressEffectProps = (RollbackIncreasedAchievementProgressEffectProps) o;
    return Objects.equals(this.achievementId, rollbackIncreasedAchievementProgressEffectProps.achievementId) &&
        Objects.equals(this.achievementName, rollbackIncreasedAchievementProgressEffectProps.achievementName) &&
        Objects.equals(this.progressTrackerId, rollbackIncreasedAchievementProgressEffectProps.progressTrackerId) &&
        Objects.equals(this.decreaseProgressBy, rollbackIncreasedAchievementProgressEffectProps.decreaseProgressBy) &&
        Objects.equals(this.currentProgress, rollbackIncreasedAchievementProgressEffectProps.currentProgress) &&
        Objects.equals(this.target, rollbackIncreasedAchievementProgressEffectProps.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(achievementId, achievementName, progressTrackerId, decreaseProgressBy, currentProgress, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RollbackIncreasedAchievementProgressEffectProps {\n");
    sb.append("    achievementId: ").append(toIndentedString(achievementId)).append("\n");
    sb.append("    achievementName: ").append(toIndentedString(achievementName)).append("\n");
    sb.append("    progressTrackerId: ").append(toIndentedString(progressTrackerId)).append("\n");
    sb.append("    decreaseProgressBy: ").append(toIndentedString(decreaseProgressBy)).append("\n");
    sb.append("    currentProgress: ").append(toIndentedString(currentProgress)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

