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
import one.talon.model.TemplateArgDef;

/**
 * NewTemplateDef
 */

public class NewTemplateDef {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HELP = "help";
  @SerializedName(SERIALIZED_NAME_HELP)
  private String help;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_EXPR = "expr";
  @SerializedName(SERIALIZED_NAME_EXPR)
  private List<Object> expr = new ArrayList<Object>();

  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<TemplateArgDef> args = new ArrayList<TemplateArgDef>();

  public static final String SERIALIZED_NAME_EXPOSE = "expose";
  @SerializedName(SERIALIZED_NAME_EXPOSE)
  private Boolean expose = false;


  public NewTemplateDef title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Campaigner-friendly name for the template that will be shown in the rule editor.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Campaigner-friendly name for the template that will be shown in the rule editor.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public NewTemplateDef description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A short description of the template that will be shown in the rule editor.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short description of the template that will be shown in the rule editor.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NewTemplateDef help(String help) {
    
    this.help = help;
    return this;
  }

   /**
   * Extended help text for the template.
   * @return help
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extended help text for the template.")

  public String getHelp() {
    return help;
  }


  public void setHelp(String help) {
    this.help = help;
  }


  public NewTemplateDef category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Used for grouping templates in the rule editor sidebar.
   * @return category
  **/
  @ApiModelProperty(required = true, value = "Used for grouping templates in the rule editor sidebar.")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public NewTemplateDef expr(List<Object> expr) {
    
    this.expr = expr;
    return this;
  }

  public NewTemplateDef addExprItem(Object exprItem) {
    this.expr.add(exprItem);
    return this;
  }

   /**
   * A Talang expression that contains variable bindings referring to args.
   * @return expr
  **/
  @ApiModelProperty(required = true, value = "A Talang expression that contains variable bindings referring to args.")

  public List<Object> getExpr() {
    return expr;
  }


  public void setExpr(List<Object> expr) {
    this.expr = expr;
  }


  public NewTemplateDef args(List<TemplateArgDef> args) {
    
    this.args = args;
    return this;
  }

  public NewTemplateDef addArgsItem(TemplateArgDef argsItem) {
    this.args.add(argsItem);
    return this;
  }

   /**
   * An array of argument definitions.
   * @return args
  **/
  @ApiModelProperty(required = true, value = "An array of argument definitions.")

  public List<TemplateArgDef> getArgs() {
    return args;
  }


  public void setArgs(List<TemplateArgDef> args) {
    this.args = args;
  }


  public NewTemplateDef expose(Boolean expose) {
    
    this.expose = expose;
    return this;
  }

   /**
   * A flag to control exposure in Rule Builder.
   * @return expose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag to control exposure in Rule Builder.")

  public Boolean getExpose() {
    return expose;
  }


  public void setExpose(Boolean expose) {
    this.expose = expose;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewTemplateDef newTemplateDef = (NewTemplateDef) o;
    return Objects.equals(this.title, newTemplateDef.title) &&
        Objects.equals(this.description, newTemplateDef.description) &&
        Objects.equals(this.help, newTemplateDef.help) &&
        Objects.equals(this.category, newTemplateDef.category) &&
        Objects.equals(this.expr, newTemplateDef.expr) &&
        Objects.equals(this.args, newTemplateDef.args) &&
        Objects.equals(this.expose, newTemplateDef.expose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, help, category, expr, args, expose);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewTemplateDef {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    expr: ").append(toIndentedString(expr)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    expose: ").append(toIndentedString(expose)).append("\n");
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

