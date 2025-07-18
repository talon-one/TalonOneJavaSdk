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
import one.talon.model.CampaignSet;

/**
 * Notification about an Application whose campaign evaluation tree changed.
 */
@ApiModel(description = "Notification about an Application whose campaign evaluation tree changed.")

public class CampaignEvaluationTreeChangedNotification {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Long applicationId;

  public static final String SERIALIZED_NAME_OLD_EVALUATION_TREE = "oldEvaluationTree";
  @SerializedName(SERIALIZED_NAME_OLD_EVALUATION_TREE)
  private CampaignSet oldEvaluationTree;

  public static final String SERIALIZED_NAME_EVALUATION_TREE = "evaluationTree";
  @SerializedName(SERIALIZED_NAME_EVALUATION_TREE)
  private CampaignSet evaluationTree;


  public CampaignEvaluationTreeChangedNotification applicationId(Long applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The ID of the Application whose campaign evaluation tree changed.
   * @return applicationId
  **/
  @ApiModelProperty(example = "78", required = true, value = "The ID of the Application whose campaign evaluation tree changed.")

  public Long getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }


  public CampaignEvaluationTreeChangedNotification oldEvaluationTree(CampaignSet oldEvaluationTree) {
    
    this.oldEvaluationTree = oldEvaluationTree;
    return this;
  }

   /**
   * Get oldEvaluationTree
   * @return oldEvaluationTree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignSet getOldEvaluationTree() {
    return oldEvaluationTree;
  }


  public void setOldEvaluationTree(CampaignSet oldEvaluationTree) {
    this.oldEvaluationTree = oldEvaluationTree;
  }


  public CampaignEvaluationTreeChangedNotification evaluationTree(CampaignSet evaluationTree) {
    
    this.evaluationTree = evaluationTree;
    return this;
  }

   /**
   * Get evaluationTree
   * @return evaluationTree
  **/
  @ApiModelProperty(required = true, value = "")

  public CampaignSet getEvaluationTree() {
    return evaluationTree;
  }


  public void setEvaluationTree(CampaignSet evaluationTree) {
    this.evaluationTree = evaluationTree;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignEvaluationTreeChangedNotification campaignEvaluationTreeChangedNotification = (CampaignEvaluationTreeChangedNotification) o;
    return Objects.equals(this.applicationId, campaignEvaluationTreeChangedNotification.applicationId) &&
        Objects.equals(this.oldEvaluationTree, campaignEvaluationTreeChangedNotification.oldEvaluationTree) &&
        Objects.equals(this.evaluationTree, campaignEvaluationTreeChangedNotification.evaluationTree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, oldEvaluationTree, evaluationTree);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignEvaluationTreeChangedNotification {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    oldEvaluationTree: ").append(toIndentedString(oldEvaluationTree)).append("\n");
    sb.append("    evaluationTree: ").append(toIndentedString(evaluationTree)).append("\n");
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

