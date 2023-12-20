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
import java.util.ArrayList;
import java.util.List;

/**
 * BulkOperationOnCampaigns
 */

public class BulkOperationOnCampaigns {
  /**
   * The operation to perform on the specified campaign IDs. 
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    DISABLE("disable"),
    
    DELETE("delete");

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

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private OperationEnum operation;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaignIds";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Integer> campaignIds = new ArrayList<Integer>();


  public BulkOperationOnCampaigns operation(OperationEnum operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * The operation to perform on the specified campaign IDs. 
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "The operation to perform on the specified campaign IDs. ")

  public OperationEnum getOperation() {
    return operation;
  }


  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  public BulkOperationOnCampaigns campaignIds(List<Integer> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public BulkOperationOnCampaigns addCampaignIdsItem(Integer campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * The list of campaign IDs on which the operation will be performed.
   * @return campaignIds
  **/
  @ApiModelProperty(example = "[1, 2, 3]", required = true, value = "The list of campaign IDs on which the operation will be performed.")

  public List<Integer> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<Integer> campaignIds) {
    this.campaignIds = campaignIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOperationOnCampaigns bulkOperationOnCampaigns = (BulkOperationOnCampaigns) o;
    return Objects.equals(this.operation, bulkOperationOnCampaigns.operation) &&
        Objects.equals(this.campaignIds, bulkOperationOnCampaigns.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, campaignIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOperationOnCampaigns {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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
